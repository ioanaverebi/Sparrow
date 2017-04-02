package org.refactor.metrics;

import org.eclipse.emf.ecore.EObject;
import org.refactor.filters.IsAccessor;
import org.refactor.modelEditor.Class;
import org.refactor.modelEditor.Method;

public class NOPM extends AbstractMetric{

	public NOPM() {
		super("Number of Public Methods");
	}

	@Override
	public double compute(EObject element) {
		int nopm = 0;
		IsAccessor accessor = new IsAccessor();
		if (element instanceof Class){
			Class type = (Class)element;
			for (Method method : type.getMethods()) {
				if (method.getModifier().equals("public") && !accessor.compute(method))
					nopm++;
			}
		}
		return nopm;
	}
}
