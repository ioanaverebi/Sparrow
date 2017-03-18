package org.refactor.metrics;

import org.refactor.modelEditor.Access;
import org.refactor.modelEditor.Method;

public class ALD extends AbstractMetric{
	private Method method;

	public ALD(Method method) {
		super("Foreign Data Providers");
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
