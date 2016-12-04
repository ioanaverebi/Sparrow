package org.lrg.outcode.builder;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Date;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jdt.core.Flags;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IField;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IPackageFragmentRoot;
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

	public void visitIJavaProject(IJavaProject project) throws CoreException, JavaModelException {
		long startTime = new Date().getTime();
		String initialValue = project.getElementName()+"-mapping";
		InputDialog dialog = new InputDialog(null, "Project name", "Project name", initialValue, new IInputValidator() {

			@Override
			public String isValid(String newText) {
				if (newText == null || newText.trim().equals(""))
					return "Please specify a valid project name";
				else return null;
			}
		}); 
		int result = dialog.open();
		if (result == 0){
			IProject xtextProject = initialize(dialog.getValue());
			visitIPackageFragments(project, xtextProject);
			long endTime = new Date().getTime();
			System.out.println("Model building took " + new Date(endTime - startTime).toString());
		}
	}

	private void visitIPackageFragments(IJavaProject javaProject, IProject xtextProject) throws JavaModelException {
		for (IPackageFragment aPackage : javaProject.getPackageFragments()) {
			IJavaElement parent = aPackage.getParent();
			if (parent instanceof IPackageFragmentRoot){
				IPackageFragmentRoot fragmentRoot = (IPackageFragmentRoot)parent;
				if (fragmentRoot.getKind() == IPackageFragmentRoot.K_SOURCE && !fragmentRoot.isReadOnly()){
					String fragmentRootName = parent.getElementName();
					IFolder sourceFolder = createFolder(xtextProject.getFolder(fragmentRootName), xtextProject);
					if (aPackage.getKind() == IPackageFragmentRoot.K_SOURCE){
						String packageName = "default";
						if (!aPackage.isDefaultPackage()){
							packageName = aPackage.getElementName();
							IFolder packageFolder = createFolder(sourceFolder.getFolder(packageName), xtextProject);
							visitICompilationUnits(aPackage, packageFolder);
						}
						else visitICompilationUnits(aPackage, sourceFolder);
					}
				}
			}

		}
	}

	private void visitICompilationUnits(IPackageFragment packageFragment, IFolder newFolder) throws JavaModelException {
		for (ICompilationUnit compilationUnit : packageFragment.getCompilationUnits()) {
			try {
				theParser.setSource(compilationUnit);
				theParser.setResolveBindings(true);
				ASTNode entireAST = theParser.createAST(new NullProgressMonitor());
				OutCodeVisitor visitor = new OutCodeVisitor();
				entireAST.accept(visitor);
				String fileName = compilationUnit.getElementName().replace(".java", ".rfm");
				String mappedFile = visitITypes(compilationUnit, visitor);
				createFile(fileName, mappedFile, newFolder);
			} catch (JavaModelException e) {
				e.printStackTrace();
			}
		}
	}

	private String visitITypes(ICompilationUnit unit, OutCodeVisitor visitor) throws JavaModelException {
		IType[] allTypes = unit.getAllTypes();
		String content = "";
		for (IType type : allTypes) {
			content += serializeType(type);
			int indentation = 1;
			content += visitIFields(type, visitor, indentation);
			content += visitIMethods(type, visitor, indentation);
			indentation -= 1;
		}
		return content;
	}

	private String visitIMethods(IType type, OutCodeVisitor visitor, int indentation) throws JavaModelException {
		IMethod[] methods = type.getMethods();
		String content = "";
		for (IMethod method : methods) {
			content += serializeMethod(indentation, method, visitor);
		}
		return content;
	}

	private String visitIFields(IType type, OutCodeVisitor visitor, int indentation) throws JavaModelException {
		IField[] fields = type.getFields();
		String content = "";
		for (IField field : fields) {
			content += serializeField(indentation, field, visitor);
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
				if (!project.isOpen()) project.open(null);
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

	private void createFile(String fileName, String transformedFile, IFolder folder){
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

	private String serializeType(IType type) {
		return addLine(0, "class " + type.getElementName());
	}

	private String serializeMethod(int indentation, IMethod method, OutCodeVisitor visitor) {
		String handleIdentifier = method.getHandleIdentifier();
		MethodDetails details = (MethodDetails) visitor.getDetails(handleIdentifier);

		String methodIdentifier = getModifier(details.getModifiers()) + method.getElementName()+"()";
		if (details.getReturnType() != null)
			methodIdentifier += ": " + details.getReturnType().getElementName();
		String content = addLine(indentation, methodIdentifier);
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

		for (IField aField : accesses.keySet()) {
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
			content += addLine(indentation, access);
		}
		for (IMethod aMethod : calls.keySet()) {
			Integer howMany = calls.get(aMethod);
			String call = howMany + " ";
			if (howMany == 1)
				call += "call to ";
			else
				call += "calls to ";
			if (aMethod.getDeclaringType().equals(method.getDeclaringType()))
				call += aMethod.getElementName()+"()";
			else
				call += aMethod.getDeclaringType().getElementName() + "." + aMethod.getElementName()+"()";
			content += addLine(indentation, call);
		}
		indentation -= 1;
		return content;
	}

	private String getModifier(int modifiers){
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

	private String serializeField(int indentation, IField field, OutCodeVisitor visitor) {
		String handleIdentifier = field.getHandleIdentifier();
		FieldDetails details = (FieldDetails) visitor.getDetails(handleIdentifier);
		return addLine(indentation, getModifier(details.getModifiers()) + field.getElementName());
	}

	private String addLine(int indentation, String content){
		char[] spaces = new char[indentation*4];
		Arrays.fill(spaces, ' ');
		return new String(spaces) + content + System.lineSeparator();
	}

}