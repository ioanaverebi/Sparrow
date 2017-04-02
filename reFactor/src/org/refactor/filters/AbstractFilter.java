package org.refactor.filters;

import org.eclipse.emf.ecore.EObject;

public abstract class AbstractFilter {
	private String description;
	
	public AbstractFilter(String description) {
		this.description = description;
	}
	
	public String getDescription() {
		return description;
	}
	
	public abstract boolean compute(EObject element);
}
