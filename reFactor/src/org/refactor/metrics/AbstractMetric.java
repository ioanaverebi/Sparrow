package org.refactor.metrics;

import org.eclipse.emf.ecore.EObject;

public abstract class AbstractMetric {
	private String description;
	
	public AbstractMetric(String description) {
		this.description = description;
	}
	
	public String getDescription() {
		return description;
	}
	
	public abstract double compute(EObject element);
}
