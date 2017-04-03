package org.lrg.outcode.builder;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringJoiner;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jdt.core.Flags;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IField;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IMember;
import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.ISourceRange;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.ASTParser;
import org.eclipse.jface.dialogs.IInputValidator;
import org.eclipse.jface.dialogs.InputDialog;
import org.lrg.outcode.builder.ast.FieldDetails;
import org.lrg.outcode.builder.ast.MethodDetails;
import org.lrg.outcode.builder.ast.OutCodeVisitor;

public class ModelVisitor {
	private ASTParser theParser = ASTParser.newParser(AST.JLS8);

	public void visitIJavaProject(final IJavaProject project) throws CoreException, JavaModelException {

		String initialValue = project.getElementName() + "-mapping";
		InputDialog dialog = new InputDialog(null, "Project name", "Project name", initialValue, new IInputValidator() {

			@Override
			public String isValid(String newText) {
				if (newText == null || newText.trim().equals(""))
					return "Please specify a valid project name";
				else
					return null;
			}
		});
		final int result = dialog.open();
		final String value = dialog.getValue();

		Job extractModel = new Job("Extracting model") {

			@Override
			protected IStatus run(IProgressMonitor monitor) {
				if (result == 0) {
					long startTime = System.currentTimeMillis();
					IProject xtextProject = initialize(value);
					try {
						visitIPackageFragments(monitor, project, xtextProject);
					} catch (JavaModelException e) {
						e.printStackTrace();
					}
					long difference = System.currentTimeMillis() - startTime;
					System.out.println("Model building took " + difference / 1000 + " seconds");
				}
				return Status.OK_STATUS;
			}
		};
		extractModel.schedule();

	}

	private void visitIPackageFragments(IProgressMonitor monitor, IJavaProject javaProject, IProject xtextProject) throws JavaModelException {
		int ticks = 0;
		for (IPackageFragment aPackage : javaProject.getPackageFragments()) {
			if (aPackage.getKind() == IPackageFragmentRoot.K_SOURCE) {
				ticks += aPackage.getCompilationUnits().length;
			}
		}
		SubMonitor subMonitor = SubMonitor.convert(monitor, ticks);
		Set<String> unresolvedTypes = new HashSet<String>();
		for (IPackageFragment aPackage : javaProject.getPackageFragments()) {
			IJavaElement parent = aPackage.getParent();
			if (parent instanceof IPackageFragmentRoot) {
				IPackageFragmentRoot fragmentRoot = (IPackageFragmentRoot) parent;
				if (fragmentRoot.getKind() == IPackageFragmentRoot.K_SOURCE && !fragmentRoot.isReadOnly()) {
					String fragmentRootName = parent.getElementName();
					IFolder sourceFolder = createFolder(xtextProject.getFolder(fragmentRootName), xtextProject);
					if (aPackage.getKind() == IPackageFragmentRoot.K_SOURCE) {
						String packageName = "default";
						if (!aPackage.isDefaultPackage()) {
							packageName = aPackage.getElementName();
							IFolder packageFolder = createFolder(sourceFolder.getFolder(packageName), xtextProject);
							visitICompilationUnits(subMonitor, aPackage, packageFolder, unresolvedTypes);
						} else
							visitICompilationUnits(subMonitor, aPackage, sourceFolder, unresolvedTypes);
					}
				}
			}
		}
		unresolvedTypes.add("Serializable");
		unresolvedTypes.add("Cloneable");
		unresolvedTypes.add("PublicCloneable");
		unresolvedTypes.add("JFrame");
		unresolvedTypes.add("ActionListener");
		unresolvedTypes.add("MouseListener");
		unresolvedTypes.add("MouseMotionListener");
		unresolvedTypes.add("Printable");
		unresolvedTypes.add("Transferable");
		unresolvedTypes.add("ProjectInfo");
		unresolvedTypes.add("MouseWheelListener");
		
		String unresolvedContent = "";
		for (String unresolved : unresolvedTypes) {
			unresolvedContent += "class " + unresolved + System.lineSeparator();
		}
		IFolder unresolvedFolder = createFolder(xtextProject.getFolder(".unresolved"), xtextProject);
		createFile(".unresolved.rfm", unresolvedContent, unresolvedFolder);

		subMonitor.done();
		monitor.done();
	}

	private void visitICompilationUnits(SubMonitor subMonitor, IPackageFragment packageFragment, IFolder folder, Set<String> unresolvedTypes) throws JavaModelException {
		for (ICompilationUnit compilationUnit : packageFragment.getCompilationUnits()) {
			try {
				theParser.setSource(compilationUnit);
				theParser.setResolveBindings(true);
				ASTNode entireAST = theParser.createAST(new NullProgressMonitor());
				OutCodeVisitor visitor = new OutCodeVisitor();
				entireAST.accept(visitor);
				String fileName = compilationUnit.getElementName().replace(".java", ".rfm");
				String mappedFile = visitITypes(compilationUnit, visitor, unresolvedTypes);
				createFile(fileName, mappedFile, folder);
				subMonitor.worked(1);
			} catch (JavaModelException e) {
				e.printStackTrace();
			}
		}
	}

	private String visitITypes(ICompilationUnit unit, OutCodeVisitor visitor, Set<String> unresolvedTypes) throws JavaModelException {
		IType[] allTypes = unit.getAllTypes();
		String content = "";
		for (int i = 0; i < allTypes.length; i++) {
			IType type = allTypes[i];
			content += serializeType(unit, type, i, unresolvedTypes);
			int indentation = 1;
			content += visitIFields(unit, type, visitor, indentation, unresolvedTypes);
			content += visitIMethods(unit, type, visitor, indentation, unresolvedTypes);
			indentation -= 1;
		}
		return content;
	}

	private String visitIMethods(ICompilationUnit unit, IType type, OutCodeVisitor visitor, int indentation, Set<String> unresolvedTypes) throws JavaModelException {
		IMethod[] methods = type.getMethods();
		String content = "";
		for (IMethod method : methods) {
			content += System.lineSeparator();
			content += serializeMethod(unit, indentation, method, visitor, unresolvedTypes);
		}
		return content;
	}

	private String visitIFields(ICompilationUnit unit, IType type, OutCodeVisitor visitor, int indentation, Set<String> unresolvedTypes) throws JavaModelException {
		IField[] fields = type.getFields();
		String content = "";
		for (IField field : fields) {
			content += serializeField(unit, indentation, field, visitor, unresolvedTypes);
		}
		return content;
	}

	private IProject initialize(String projectName) {
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		IWorkspaceRoot root = workspace.getRoot();
		IProject project = root.getProject(projectName);
		if (!project.exists())
			try {
				project.create(null);
				if (!project.isOpen())
					project.open(null);
				if (!project.hasNature("org.eclipse.xtext.ui.shared.xtextNature")) {
					IProjectDescription description = project.getDescription();
					description.setNatureIds(new String[] { "org.eclipse.xtext.ui.shared.xtextNature" });
					project.setDescription(description, null);
				}
			} catch (CoreException e) {
				e.printStackTrace();
			}
		return project;
	}

	private IFolder createFolder(IFolder folder, IProject xtextProject) {
		if (!folder.exists())
			try {
				folder.create(IResource.NONE, true, null);
			} catch (CoreException e) {
				e.printStackTrace();
			}
		return folder;
	}

	private void createFile(String fileName, String transformedFile, IFolder folder) {
		IFile file = folder.getFile(fileName);
		if (!file.exists()) {
			InputStream source = new ByteArrayInputStream(transformedFile.getBytes());
			try {
				file.create(source, IResource.NONE, null);
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}
	}

	private String serializeType(ICompilationUnit unit, IType type, int index, Set<String> unresolvedTypes) {
		String comments = getComments(unit, type);
		String content = "";
		if (comments != null)
			content += addLine(0, comments);
		if (index > 0)
			content += addLine(0, "");
		String declaration = type.getElementName();
		try {
			if (type.getSuperclassName() != null) {
				String typeSignature = getSimpleName(type.getSuperclassName());
				declaration += " extends " + typeSignature;
			}
			String[] superInterfaces = type.getSuperInterfaceNames();
			if (superInterfaces.length > 0) {
				if (type.isInterface())
					declaration += " extends ";
				else
					declaration += " implements ";
				String[] names = new String[superInterfaces.length];
				for (int i = 0; i < superInterfaces.length; i++) {
					names[i] = getSimpleName(superInterfaces[i]);
				}
				StringJoiner joiner = new StringJoiner(", ");
				for (String name : names) {
					joiner.add(name);
				}
				declaration += joiner.toString();
			}
		} catch (JavaModelException e) {
			e.printStackTrace();
		}
		content += addLine(0, "class " + declaration);
		return content;
	}

	private String getSimpleName(String name) {
		if (name.indexOf("<") != -1)
			return name.substring(0, name.indexOf("<"));
		if (name.indexOf("[") != -1)
			return name.substring(0, name.indexOf("["));
		return name;
	}

	private String getComments(ICompilationUnit unit, IMember member) {
		try {
			ISourceRange range = member.getJavadocRange();
			if (range != null)
				return unit.getSource().substring(range.getOffset(), range.getOffset() + range.getLength());
		} catch (JavaModelException e1) {
			e1.printStackTrace();
		}
		return null;
	}

	private String serializeMethod(ICompilationUnit unit, int indentation, IMethod method, OutCodeVisitor visitor, Set<String> unresolvedTypes) {
		String handleIdentifier = method.getHandleIdentifier();
		MethodDetails details = (MethodDetails) visitor.getDetails(handleIdentifier);
		if (details == null)
			return "";
		String methodIdentifier = getModifier(details.getModifiers()) + method.getElementName() + "(";
		StringJoiner joiner = new StringJoiner(", ");
		for (IType parameter : details.getParameters()) {
			checkIfUnresolved(parameter, unresolvedTypes);
			joiner.add(parameter.getElementName());
		}
		methodIdentifier += joiner.toString() + ")";
		IType returnType = details.getReturnType();
		if (returnType != null) {
			checkIfUnresolved(returnType, unresolvedTypes);
			methodIdentifier += ": " + returnType.getElementName();
		}
		String comments = getComments(unit, method);
		String content = "";
		if (comments != null)
			content += addLine(indentation, comments);
		content += addLine(indentation, methodIdentifier);
		indentation += 1;
		try {
			int linesOfCode = method.getSource().split("\r\n|\r|\n").length;
			content += addLine(indentation, linesOfCode + " lines of code");
		} catch (JavaModelException e) {
			e.printStackTrace();
		}

		content += addLine(indentation, details.getCyclo() + " cyclo");

		Map<IField, Integer> accesses = details.getAccesses();
		Map<IMethod, Integer> calls = details.getCalls();

		for (IField aField : (List<IField>) sortKeys(accesses, method.getDeclaringType().getElementName())) {
			Integer howMany = accesses.get(aField);
			String access = howMany + " ";
			if (howMany == 1)
				access += "access to ";
			else
				access += "accesses to ";
			if (aField.getDeclaringType().equals(method.getDeclaringType()))
				access += aField.getElementName();
			else
				access += aField.getDeclaringType().getElementName() + "." + aField.getElementName();
			checkIfUnresolved(aField.getDeclaringType(), unresolvedTypes);
			content += addLine(indentation, access);
		}
		for (IMethod aMethod : (List<IMethod>) sortKeys(calls, method.getDeclaringType().getElementName())) {
			Integer howMany = calls.get(aMethod);
			String call = howMany + " ";
			if (howMany == 1)
				call += "call to ";
			else
				call += "calls to ";
			if (aMethod.getDeclaringType().equals(method.getDeclaringType()))
				call += aMethod.getElementName() + "()";
			else
				call += aMethod.getDeclaringType().getElementName() + "." + aMethod.getElementName() + "()";
			checkIfUnresolved(aMethod.getDeclaringType(), unresolvedTypes);
			content += addLine(indentation, call);
		}
		indentation -= 1;
		return content;
	}

	private void checkIfUnresolved(IType type, Set<String> unresolvedTypes) {
		if (type.getCompilationUnit() == null)
			unresolvedTypes.add(getSimpleName(type.getElementName()));
	}

	private List sortKeys(Map operations, final String currentType) {
		ArrayList<IMember> keys = new ArrayList<IMember>(operations.keySet());
		Collections.sort(keys, new Comparator<IMember>() {

			@Override
			public int compare(IMember m1, IMember m2) {
				String t1 = m1.getDeclaringType().getElementName();
				String t2 = m2.getDeclaringType().getElementName();
				if (t1.equals(t2))
					return 0;
				if (t1.equals(currentType))
					return -1;
				if (t2.equals(currentType))
					return 1;
				return t1.compareTo(t2);
			}
		});
		return keys;
	}

	private String getModifier(int modifiers) {
		if (Flags.isPublic(modifiers) && Flags.isStatic(modifiers) && Flags.isFinal(modifiers))
			return "constant ";
		if (Flags.isPublic(modifiers))
			return "public ";
		if (Flags.isPrivate(modifiers))
			return "private ";
		if (Flags.isProtected(modifiers))
			return "protected ";
		return "";
	}

	private String serializeField(ICompilationUnit unit, int indentation, IField field, OutCodeVisitor visitor, Set<String> unresolvedTypes) {
		String handleIdentifier = field.getHandleIdentifier();
		FieldDetails details = (FieldDetails) visitor.getDetails(handleIdentifier);
		if (details == null)
			return "";
		String comments = getComments(unit, field);
		String content = "";
		if (comments != null)
			content += addLine(indentation, comments);
		content += addLine(indentation, getModifier(details.getModifiers()) + field.getElementName());
		return content;
	}

	private String addLine(int indentation, String content) {
		char[] spaces = new char[indentation * 4];
		Arrays.fill(spaces, ' ');
		return new String(spaces) + content + System.lineSeparator();
	}

}