package org.refactor.validation;

import org.refactor.metrics.NOPA;
import org.refactor.metrics.NOPM;
import org.refactor.metrics.WMC;
import org.refactor.modelEditor.Class;

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
		return "Data Class: severity " + getSeverity();
	}

	@Override
	public boolean check() {
		double nopm = new NOPM().compute(classElement);
		double wmc = new WMC().compute(classElement);
		double nopa = new NOPA().compute(classElement);
		if ((double) nopm / (double)(nopm + nopa) >= 0.33) return false;
		return (nopa > Constants.FEW && wmc < Constants.HIGH) || (nopa > Constants.MANY && wmc < Constants.VERY_HIGH);
	}

	@Override
	public int getSeverity() {
		double nopa = new NOPA().compute(classElement);
		double ndu = 3; //number of data users

		int exposedDataGrade = SeverityScore.computeScore(nopa, Constants.MANY, 5*Constants.MANY);
		int exploitedDataGrade = SeverityScore.computeScore(ndu, Constants.MANY, 5*Constants.MANY);
		
		return (exposedDataGrade + 2* exploitedDataGrade) / 3;
	}
}
