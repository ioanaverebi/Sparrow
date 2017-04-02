package org.refactor.metrics;

import org.eclipse.emf.ecore.EObject;
import org.refactor.filters.IsAccessor;
import org.refactor.modelEditor.Class;
import org.refactor.modelEditor.Field;
import org.refactor.modelEditor.Method;

public class NOPA extends AbstractMetric{

	public NOPA() {
		super("Number of Public Attributes");
	}

	@Override
	public double compute(EObject element) {
		int nopa = 0;
		IsAccessor accessor = new IsAccessor();
		if (element instanceof Class){
			Class type = (Class)element;
			for (Field field : type.getFields()) {
				if (field.getModifier().equals("public") && !field.getModifier().equals("constant"))
					nopa++;			
			}
			for (Method method : type.getMethods()) {
				if (accessor.compute(method))
					nopa++;
			}
		}
		return nopa;
	}
}
