package org.refactor.metrics;

import org.refactor.modelEditor.Class;
import org.refactor.modelEditor.Field;

public class NOPA extends AbstractMetric{
	private Class type;

	public NOPA(Class type) {
		super("Number of Public Attributes");
		this.type = type;
	}

	@Override
	public double compute() {
		int nopa = 0;
		for (Field field : type.getFields()) {
			if (field.getModifier().compareTo("public") == 0)
				nopa++;			
		}
		return nopa;
	}
}
