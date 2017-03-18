package org.refactor.metrics;

import org.refactor.modelEditor.Class;
import org.refactor.modelEditor.Method;

public class NOPM extends AbstractMetric{
	private Class type;

	public NOPM(Class type) {
		super("Number of Public Methods");
		this.type = type;
	}

	@Override
	public double compute() {
		int nopm = 0;
		for (Method method : type.getMethods()) {
			if (method.getModifier().compareTo("public") == 0)
				nopm++;
		}
		return nopm;
	}
}
