package org.refactor.validation;

import org.refactor.metrics.ALD;
import org.refactor.metrics.ATFD;
import org.refactor.metrics.FDP;
import org.refactor.modelEditor.Method;

public class FeatureEnvyChecker implements IRuleChecker{

	private Method method;

	public FeatureEnvyChecker(Method method) {
		this.method = method;
	}

	@Override
	public String getDetails() {
		return null;
	}

	@Override
	public String getMessage() {
		return "Feature Envy: severity " + getSeverity();
	}

	@Override
	public boolean check() {
		double atfd = new ATFD().compute(method);
		double ald = new ALD().compute(method);
		double fdp = new FDP().compute(method);
		double lda = (atfd + ald > 0) ? (ald / (atfd + ald)) : 1;
		if (method.getType() == null) return false;

		if (atfd <= Constants.MANY) return false;
		if (fdp > Constants.FEW) return false;
		if (lda > 0.33) return false;
		return true;
	}

	@Override
	public int getSeverity() {
		double atfd = new ATFD().compute(method);
		return SeverityScore.computeScore(atfd, Constants.MANY, 5*Constants.MANY);
	}

}
