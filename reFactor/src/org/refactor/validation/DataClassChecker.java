package org.refactor.validation;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.refactor.metrics.NOPA;
import org.refactor.metrics.NOPM;
import org.refactor.metrics.WMC;
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
		return "Data Class: severity " + getSeverity();
	}

	@Override
	public boolean check() {
		double nopm = new NOPM(classElement).compute();
		double wmc = new WMC(classElement).compute();
		double nopa = new NOPA(classElement).compute();
		if ((double) nopm / (double)(nopm + nopa) >= 0.33) return false;
		return (nopa > Constants.FEW && wmc < Constants.HIGH) || (nopa > Constants.MANY && wmc < Constants.VERY_HIGH);
	}

	@Override
	public int getSeverity() {
		double nopa = new NOPA(classElement).compute();
		double nopm = new NOPM(classElement).compute();
		double wmc = new WMC(classElement).compute();
		double ndu = 3; //number of data users
		
		int publicDataScore = SeverityScore.computeScore(nopa, Constants.FEW, 5*Constants.FEW);
		double woc = 1 - nopa / (nopa + nopm) ;
		
		int dataUsersScore = SeverityScore.computeScore(ndu, 1, Constants.MANY);
		int wocScore = SeverityScore.computeScore(woc, Constants.ONE_THIRD, 0);
		int wmcScore = SeverityScore.computeScore(wmc, Constants.VERY_HIGH, 0);
		int severity = SeverityScore.computeAverage(publicDataScore, dataUsersScore, wocScore, wmcScore);
		return severity;
	}
}
