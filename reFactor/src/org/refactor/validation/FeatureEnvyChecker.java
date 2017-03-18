package org.refactor.validation;

import java.util.HashSet;

import org.eclipse.emf.common.util.EList;
import org.refactor.metrics.ALD;
import org.refactor.metrics.ATFD;
import org.refactor.metrics.FDP;
import org.refactor.metrics.NOPA;
import org.refactor.metrics.NOPM;
import org.refactor.metrics.WMC;
import org.refactor.modelEditor.Access;
import org.refactor.modelEditor.Class;
import org.refactor.modelEditor.Field;
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
		return "Feature Envy";
	}

	@Override
	public boolean check() {
		HashSet<Class> dataProviders = new HashSet<Class>();
		EList<Access> accesses = method.getAccesses();
		Class parentClass = (Class) method.eContainer();
		int internalAccesses = 0;
		for (Access access : accesses) {
			Field field = access.getField();
			if (field.eContainer().equals(parentClass))
				internalAccesses++;
			dataProviders.add((Class) field.eContainer());
		}
		dataProviders.remove(parentClass);
		if (accesses.size() == 0) return false;
		if (internalAccesses > Constants.FEW) return false;
		if ((double)internalAccesses/(double)accesses.size() > 0.33) return false;
		if (dataProviders.size() > Constants.FEW) return false;
		return true;
	}

	@Override
	public int getSeverity() {
		double atfd = new ATFD(method).compute();
		double ald = new ALD(method).compute();
		double fdp = new FDP(method).compute();
		double laa = ald + atfd == 0 ? 1 : ald / (atfd + ald);
		
		int atfdScore = SeverityScore.computeScore(atfd, Constants.FEW, 5*Constants.FEW);
		int laaScore = SeverityScore.computeScore(laa, Constants.ONE_THIRD, 0);
		int fdpScore = SeverityScore.computeScore(fdp, 1, Constants.FEW);
		
		int severity = SeverityScore.computeAverage(atfdScore, laaScore, fdpScore);
		return severity;
	}

}
