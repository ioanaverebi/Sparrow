package org.refactor.validation;

import org.eclipse.emf.common.util.EList;
import org.refactor.modelEditor.Class;
import org.refactor.modelEditor.Field;
import org.refactor.modelEditor.Method;

public class DataClassChecker implements IRuleChecker{

	private Class classElement;

	public DataClassChecker(Class classElement) {
		this.classElement = classElement;
	}

	@Override
	public String getDetails() {
		return null;
	}

	@Override
	public String getMessage() {
		return "Data Class";
	}

	@Override
	public boolean check() {
		EList<Method> methods = classElement.getMethods();
		int nopm = 0, wmc = 0;
		for (Method method : methods) {
			wmc += method.getCyclo();
			if (method.getModifier().compareTo("public") == 0)
				nopm++;
		}
		EList<Field> fields = classElement.getFields();
		int nopa = 0;
		for (Field field : fields) {
			if (field.getModifier().compareTo("public") == 0)
				nopa++;			
		}
		if ((double) nopm / (double)(nopm + nopa) >= 0.33) return false;
		return (nopa > Constants.FEW && wmc < Constants.HIGH) || (nopa > Constants.MANY && wmc < Constants.VERY_HIGH);
	}

}
