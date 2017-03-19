package org.refactor.metrics;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.refactor.modelEditor.Access;
import org.refactor.modelEditor.Class;
import org.refactor.modelEditor.Field;
import org.refactor.modelEditor.Method;

public class TCC extends AbstractMetric {
	
	public TCC() {
		super("Tight Class Cohesion");
	}
	
	@Override
	public double compute(EObject element) {
		if (element instanceof Class){
			Class type = (Class)element;
			double tcc = 0;
			// First count the number of unique pairs of methods
			EList<Method> methods = type.getMethods();
			Map<Field, Set<Method>> map = new HashMap<>();
			for (Method method : methods) {
				EList<Access> accesses = method.getAccesses();
				for (Access access : accesses) {
					Field field = access.getField();
					if (field.eContainer().equals(type)) {
						if (!map.containsKey(field))
							map.put(field, new HashSet<>());
						map.get(field).add(method);
					}
				}
			}
			Set<String> methodTouplesHascodes = new HashSet<>();
			Set<Field> keySet = map.keySet();
			for (Field field : keySet) {
				Set<Method> set = map.get(field);
				Iterator<Method> iterator = set.iterator();
				while (iterator.hasNext()) {
					Method next = iterator.next();
					iterator.remove();
					for (Method method : set) {
						if (method.hashCode() < next.hashCode())
							methodTouplesHascodes.add(method.hashCode() + "-" + next.hashCode());
						else
							methodTouplesHascodes.add(next.hashCode() + "-" + method.hashCode());
					}
				}
			}
			int ndp = methodTouplesHascodes.size();
			int n = methods.size();
			tcc = ndp / ((n * (n - 1)) / 2.);
			return tcc;
		}
		return 0;
	}

}
