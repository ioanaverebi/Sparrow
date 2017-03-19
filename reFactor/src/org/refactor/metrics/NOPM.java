package org.refactor.metrics;

import org.eclipse.emf.ecore.EObject;
import org.refactor.modelEditor.Class;
import org.refactor.modelEditor.Method;

public class NOPM extends AbstractMetric{

	public NOPM() {
		super("Number of Public Methods");
	}

	@Override
	public double compute(EObject element) {
		int nopm = 0;
		if (element instanceof Class){
			Class type = (Class)element;
			for (Method method : type.getMethods()) {
				if (method.getModifier().compareTo("public") == 0)
					nopm++;
			}
		}
		return nopm;
	}
}
