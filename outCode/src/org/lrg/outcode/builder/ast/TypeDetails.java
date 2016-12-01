package org.lrg.outcode.builder.ast;

public class TypeDetails implements IDetails{
	private int modifiers;

	public TypeDetails() {
	}
	
	public void setModifiers(int modifiers) {
		this.modifiers = modifiers;
	}
	
		public int getModifiers() {
		return modifiers;
	}
}
