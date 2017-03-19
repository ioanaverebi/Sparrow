package org.refactor.metrics;

import org.eclipse.emf.ecore.EObject;
import org.refactor.modelEditor.Class;
import org.refactor.modelEditor.Field;

public class NOPA extends AbstractMetric{

	public NOPA() {
		super("Number of Public Attributes");
	}

	@Override
	public double compute(EObject element) {
		int nopa = 0;
		if (element instanceof Class){
			Class type = (Class)element;
			for (Field field : type.getFields()) {
				if (field.getModifier().compareTo("public") == 0)
					nopa++;			
			}
		}
		return nopa;
	}
}
