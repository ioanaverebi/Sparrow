package org.refactor.metrics;

import org.refactor.modelEditor.Access;
import org.refactor.modelEditor.Method;

public class ATFD extends AbstractMetric{
	private Method method;

	public ATFD(Method method) {
		super("Access to Foreing Data");
		this.method = method;
	}

	@Override
	public double compute() {
		int atfd = 0;
		for (Access access : method.getAccesses()) {		
		}
		return atfd;
	}
}
