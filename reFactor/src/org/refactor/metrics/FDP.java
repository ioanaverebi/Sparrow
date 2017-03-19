package org.refactor.metrics;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.refactor.modelEditor.Access;
import org.refactor.modelEditor.Class;
import org.refactor.modelEditor.Field;
import org.refactor.modelEditor.Method;

public class FDP extends AbstractMetric{

	public FDP() {
		super("Foreign Data Providers");
	}

	@Override
	public double compute(EObject element) {
		if (element instanceof Method){
			Method method = (Method)element;
			return getProviders(method).size();
		}
		else if (element instanceof Class){
			Class type = (Class)element;
			Set<EObject> containers = new HashSet<EObject>();
			for (Method method : type.getMethods()) {
				containers.addAll(getProviders(method));
			}
			return containers.size();
		}
		return 0;
	}

	private Set<EObject> getProviders(Method method) {
		Set<EObject> containers = new HashSet<EObject>();
		for (Access access : method.getAccesses()) {
			Field field = access.getField();
			if (!field.eContainer().equals(method.eContainer()))
				containers.add(field.eContainer());
		}
		return containers;
	}
}
