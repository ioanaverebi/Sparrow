package org.lrg.outcode.builder.ast;

import org.eclipse.jdt.core.IType;

public class FieldDetails implements IDetails{
	private int modifiers;
	private IType returnType;

	public FieldDetails() {
	}
	
	public void setReturnType(IType returnType) {
		this.returnType = returnType;
	}
	
	public void setModifiers(int modifiers) {
		this.modifiers = modifiers;
	}
	
	public IType getReturnType() {
		return returnType;
	}

	public int getModifiers() {
		return modifiers;
	}
}
