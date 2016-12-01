package org.lrg.outcode.builder.ast;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.jdt.core.IField;
import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.IType;

public class MethodDetails implements IDetails{
	private Map<IField, Integer> accesses = new HashMap<IField, Integer>();
	private Map<IMethod, Integer> calls = new HashMap<IMethod, Integer>();
	private int modifiers;
	private IType returnType;
	private int cyclo = 1;

	public MethodDetails() {
	}
	
	public void addAccess(IField accessedField) {
		Integer accessCount = accesses.get(accessedField);
		if (accessCount == null){
			accessCount = 1;
		}
		else
			accessCount += 1;
		accesses.put(accessedField, accessCount);
	}
	
	public void addCall(IMethod calledMethod) {
		Integer callCount = calls.get(calledMethod);
		if (callCount == null){
			callCount = 1;
		}
		else
			callCount += 1;
		calls.put(calledMethod, callCount);
	}
	
	public void setReturnType(IType returnType) {
		this.returnType = returnType;
	}
	
	public void incrementCyclo() {
		this.cyclo++;
	}
	
	public void setModifiers(int modifiers) {
		this.modifiers = modifiers;
	}
	
	public int getCyclo() {
		return cyclo;
	}
	
	public Map<IField, Integer> getAccesses() {
		return accesses;
	}
	
	public Map<IMethod, Integer> getCalls() {
		return calls;
	}
	
	public IType getReturnType() {
		return returnType;
	}

	public int getModifiers() {
		return modifiers;
	}
}
