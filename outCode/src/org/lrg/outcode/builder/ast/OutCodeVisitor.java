package org.lrg.outcode.builder.ast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.jdt.core.IField;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.ITypeParameter;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.ClassInstanceCreation;
import org.eclipse.jdt.core.dom.ConditionalExpression;
import org.eclipse.jdt.core.dom.ConstructorInvocation;
import org.eclipse.jdt.core.dom.DoStatement;
import org.eclipse.jdt.core.dom.EnhancedForStatement;
import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.ForStatement;
import org.eclipse.jdt.core.dom.IBinding;
import org.eclipse.jdt.core.dom.IMethodBinding;
import org.eclipse.jdt.core.dom.ITypeBinding;
import org.eclipse.jdt.core.dom.IVariableBinding;
import org.eclipse.jdt.core.dom.IfStatement;
import org.eclipse.jdt.core.dom.InfixExpression;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.MethodInvocation;
import org.eclipse.jdt.core.dom.SimpleName;
import org.eclipse.jdt.core.dom.SingleVariableDeclaration;
import org.eclipse.jdt.core.dom.SuperConstructorInvocation;
import org.eclipse.jdt.core.dom.SuperMethodInvocation;
import org.eclipse.jdt.core.dom.SwitchCase;
import org.eclipse.jdt.core.dom.Type;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipse.jdt.core.dom.VariableDeclarationFragment;
import org.eclipse.jdt.core.dom.WhileStatement;

public class OutCodeVisitor extends ASTVisitor {

	private Map<String, IDetails> allDetails = new HashMap<String, IDetails>();
	private IMethod currentMethod = null;
	private MethodDetails methodDetails;

	@Override
	public boolean visit(FieldDeclaration fieldDeclaration) {
		List<VariableDeclarationFragment> fragments = fieldDeclaration.fragments();
		for (VariableDeclarationFragment fragment : fragments) {
			IVariableBinding binding = fragment.resolveBinding();
			if (binding == null)
				continue;
			IField field = (IField) binding.getJavaElement();
			FieldDetails fieldDetails = new FieldDetails();
			fieldDetails.setModifiers(fieldDeclaration.getModifiers());
			allDetails.put(field.getHandleIdentifier(), fieldDetails);
		}
		return true;
	}

	@Override
	public boolean visit(TypeDeclaration typeDeclaration) {
		ITypeBinding binding = typeDeclaration.resolveBinding();
		if (binding != null) {
			IType type = (IType) binding.getJavaElement();
			TypeDetails typeDetails = new TypeDetails();
			typeDetails.setModifiers(typeDeclaration.getModifiers());
			allDetails.put(type.getHandleIdentifier(), typeDetails);
		}
		return true;
	}

	@Override
	public boolean visit(MethodDeclaration methodDeclaration) {
		IBinding binding = methodDeclaration.resolveBinding();
		if (binding == null)
			return false;
		currentMethod = (IMethod) binding.getJavaElement();
		if (currentMethod != null) {
			methodDetails = new MethodDetails();
			String handleIdentifier = currentMethod.getHandleIdentifier();
			allDetails.put(handleIdentifier, methodDetails);
			methodDetails.setModifiers(methodDeclaration.getModifiers());
			methodDetails.setParameters(getParameters(methodDeclaration.parameters()));
			Type returnType2 = methodDeclaration.getReturnType2();
			if (returnType2 != null) {
				ITypeBinding typeBinding = returnType2.resolveBinding();
				IJavaElement returnType = typeBinding.getJavaElement();
				if (returnType instanceof IType) {
					methodDetails.setReturnType((IType) returnType);
				}
			}
		}
		return true;
	}

	private List<IType> getParameters(List list) {
		List<IType> params = new ArrayList<IType>();
		for (Object elem : list) {
			if (elem instanceof SingleVariableDeclaration){
				SingleVariableDeclaration param = (SingleVariableDeclaration) elem;
				Type type = param.getType();
				if (type != null && type.resolveBinding() != null && type.resolveBinding().getJavaElement() instanceof IType){
					params.add((IType)type.resolveBinding().getJavaElement());
				}
			}
		}
		return params;
	}

	@Override
	public boolean visit(SimpleName node) {
		if (currentMethod == null)
			return false;
		IBinding binding = node.resolveBinding();
		if (binding == null)
			return false;
		if (node.isDeclaration())
			return true;
		if (node.resolveBinding() instanceof IVariableBinding) {
			IVariableBinding iVariableBinding = (IVariableBinding) node.resolveBinding();
			if (iVariableBinding.isField()) {
				IVariableBinding variableDeclarationBinding = iVariableBinding.getVariableDeclaration();
				if (variableDeclarationBinding.getDeclaringClass() != null) {
					IJavaElement accessedField = variableDeclarationBinding.getJavaElement();
					if (accessedField instanceof IField) {
						methodDetails.addAccess((IField) accessedField);
					}
				}
			}
		}
		return true;
	}

	@Override
	public boolean visit(MethodInvocation loc) {
		if (currentMethod == null)
			return false;
		if (loc.resolveMethodBinding() == null)
			return false;
		if (loc.resolveMethodBinding().getMethodDeclaration() == null)
			return true;
		addCalledMethod(loc.resolveMethodBinding().getMethodDeclaration());
		return true;
	}

	@Override
	public boolean visit(SuperMethodInvocation loc) {
		if (currentMethod == null)
			return false;
		if (loc.resolveMethodBinding() == null)
			return false;
		if (loc.resolveMethodBinding().getMethodDeclaration() == null)
			return true;
		addCalledMethod(loc.resolveMethodBinding().getMethodDeclaration());
		return true;
	}

	@Override
	public boolean visit(ConstructorInvocation loc) {
		if (currentMethod == null)
			return false;
		if (loc.resolveConstructorBinding() == null)
			return false;
		if (loc.resolveConstructorBinding().getJavaElement() != null)
			addCalledMethod(loc.resolveConstructorBinding());
		return true;
	}

	@Override
	public boolean visit(SuperConstructorInvocation loc) {
		if (currentMethod == null)
			return false;
		if (loc.resolveConstructorBinding() == null)
			return false;
		if (loc.resolveConstructorBinding().getJavaElement() != null)
			addCalledMethod(loc.resolveConstructorBinding());
		return true;
	}

	@Override
	public boolean visit(ClassInstanceCreation loc) {
		if (currentMethod == null)
			return false;
		if (loc.resolveConstructorBinding() == null)
			return false;
		if (loc.resolveConstructorBinding().getJavaElement() != null)
			addCalledMethod(loc.resolveConstructorBinding());
		return true;
	}

	@Override
	public boolean visit(IfStatement loc) {
		updateCyclo();
		return true;
	}

	@Override
	public boolean visit(SwitchCase loc) {
		updateCyclo();
		return true;
	}

	@Override
	public boolean visit(ForStatement loc) {
		updateCyclo();
		return true;
	}

	@Override
	public boolean visit(DoStatement loc) {
		updateCyclo();
		return true;
	}

	@Override
	public boolean visit(WhileStatement loc) {
		updateCyclo();
		return true;
	}

	@Override
	public boolean visit(EnhancedForStatement loc) {
		updateCyclo();
		return true;
	}

	@Override
	public boolean visit(ConditionalExpression loc) {
		updateCyclo();
		return true;
	}

	@Override
	public boolean visit(InfixExpression loc) {
		if (loc.getOperator() == InfixExpression.Operator.CONDITIONAL_AND || loc.getOperator() == InfixExpression.Operator.CONDITIONAL_OR)
			updateCyclo();
		return true;
	}

	private void addCalledMethod(IMethodBinding methodBinding) {
		IJavaElement calledMethod = methodBinding.getJavaElement();
		if (calledMethod instanceof IMethod) {
			methodDetails.addCall((IMethod) calledMethod);
		}
	}

	private void updateCyclo() {
		if (currentMethod == null)
			return;
		methodDetails.incrementCyclo();
	}

	public IDetails getDetails(String handleIdentifier) {
		return allDetails.get(handleIdentifier);
	}

	public void process(ASTNode methodDeclaration) {
		methodDeclaration.accept(this);
	}

}
