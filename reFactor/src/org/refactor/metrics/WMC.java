package org.refactor.metrics;

import org.refactor.modelEditor.Class;
import org.refactor.modelEditor.Method;

public class WMC extends AbstractMetric{
	private Class type;

	public WMC(Class type) {
		super("Weighted Method Count");
		this.type = type;
	}

	@Override
	public double compute() {
		int wmc = 0;
		for (Method method : type.getMethods()) {
			wmc += method.getCyclo();
		}
		return wmc;
	}
}
