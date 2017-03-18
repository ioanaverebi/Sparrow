package org.refactor.validation;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.refactor.modelEditor.Access;
import org.refactor.modelEditor.Class;
import org.refactor.modelEditor.Field;
import org.refactor.modelEditor.Method;

public class GodClassChecker implements IRuleChecker {

	private Class classElement;

	public GodClassChecker(Class classElement) {
		this.classElement = classElement;
	}

	@Override
	public String getDetails() {
		return null;
	}

	@Override
	public String getMessage() {
		return "God Class";
	}

	@Override
	public boolean check() {
		EList<Method> methods = classElement.getMethods();
		int atfd = 0, wmc = 0;
		for (Method method : methods) {
			for (Access access : method.getAccesses()) {
				Field field = access.getField();
				if (!field.eContainer().equals(classElement))
					atfd++;
			}
		}
		for (Method method : methods) {
			wmc += method.getCyclo();
		}
		if (atfd <= Constants.FEW || wmc < Constants.VERY_HIGH || countTCC() > Constants.ONE_THIRD)
			return false;

		return true;
	}

	private double countTCC() {
		double tcc = 0;
		// First count the number of unique pairs of methods
		EList<Method> methods = classElement.getMethods();
		Map<Field, Set<Method>> map = new HashMap<>();
		for (Method method : methods) {
			EList<Access> accesses = method.getAccesses();
			for (Access access : accesses) {
				Field field = access.getField();
				if (field.eContainer().equals(classElement)) {
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

	@Override
	public int getSeverity() {
		// TODO Auto-generated method stub
		return 0;
	}

}
