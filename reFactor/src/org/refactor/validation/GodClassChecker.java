package org.refactor.validation;

import org.eclipse.emf.common.util.EList;
import org.refactor.metrics.ATFD;
import org.refactor.metrics.TCC;
import org.refactor.metrics.WMC;
import org.refactor.modelEditor.Class;
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
		return "God Class: severity " + getSeverity();
	}

	@Override
	public boolean check() {
		EList<Method> methods = classElement.getMethods();
		double atfd = new ATFD().compute(classElement);
		double wmc = new WMC().compute(classElement);
		double tcc = new TCC().compute(classElement);
				
		for (Method method : methods) {
			wmc += method.getCyclo();
		}
		if (atfd <= Constants.MANY || wmc < Constants.VERY_HIGH || tcc > Constants.ONE_THIRD)
			return false;

		return true;
	}

	@Override
	public int getSeverity() {
		double atfd = new ATFD().compute(classElement);
		return SeverityScore.computeScore(atfd, Constants.MANY, 5*Constants.MANY);
	}

}
