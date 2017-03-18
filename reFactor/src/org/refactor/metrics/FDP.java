package org.refactor.metrics;

import org.refactor.modelEditor.Access;
import org.refactor.modelEditor.Method;

public class FDP extends AbstractMetric{
	private Method method;

	public FDP(Method method) {
		super("Access to Local Data");
		this.method = method;
	}

	@Override
	public double compute() {
		int ald = 0;
		for (Access access : method.getAccesses()) {		
		}
		return ald;
	}
}
