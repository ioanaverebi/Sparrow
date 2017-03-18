package org.refactor.metrics;

public abstract class AbstractMetric {
	private String description;
	
	public AbstractMetric(String description) {
		this.description = description;
	}
	
	public String getDescription() {
		return description;
	}
	
	public abstract double compute();
}
