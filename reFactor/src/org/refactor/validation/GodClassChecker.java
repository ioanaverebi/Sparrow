package org.refactor.validation;

import org.eclipse.emf.common.util.EList;
import org.refactor.modelEditor.Access;
import org.refactor.modelEditor.Class;
import org.refactor.modelEditor.Field;
import org.refactor.modelEditor.Method;

public class GodClassChecker implements IRuleChecker{

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
		if (atfd <= Constants.FEW) return false;
		if (wmc < Constants.VERY_HIGH) return false;
		// compute TCC
		return true;
	}

}
