package org.refactor.metrics;

import org.eclipse.emf.ecore.EObject;
import org.refactor.modelEditor.Class;
import org.refactor.modelEditor.Method;

public class WMC extends AbstractMetric{

	public WMC() {
		super("Weighted Method Count");
	}

	@Override
	public double compute(EObject element) {
		int wmc = 0;
		if (element instanceof Class){
			Class type = (Class)element;
			for (Method method : type.getMethods()) {
				wmc += method.getCyclo();
			}
		}
		return wmc;
	}
}
