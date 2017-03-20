package org.refactor.validation;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.refactor.metrics.NOPA;
import org.refactor.metrics.NOPM;
import org.refactor.metrics.WMC;
import org.refactor.modelEditor.Class;

public class DataClassChecker implements IRuleChecker {

	private Class classElement;

	private ArrayList<IResource> allFilesInProject = new ArrayList<>();

	private IResourceDescriptions descriptions;

	public DataClassChecker(IResourceDescriptions iResourceDescriptions, Class classElement) {
		this.descriptions = iResourceDescriptions;
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
		if (nopm / (nopm + nopa) >= 0.33)
			return false;
		return (nopa > Constants.FEW && wmc < Constants.HIGH) || (nopa > Constants.MANY && wmc < Constants.VERY_HIGH);
	}

	void processContainer(IContainer container) throws CoreException {
		IResource[] members = container.members();
		for (IResource member : members) {
			if (member instanceof IContainer)
				processContainer((IContainer) member);
			else if (member instanceof IFile)
				processFile((IFile) member);
		}
	}

	private void processFile(IFile member) {
		if (member.getFileExtension().equals("rfm"))
			allFilesInProject.add(member);
	}

	@Override
	@SuppressWarnings({ "unused" })
	public int getSeverity() {
		double nopa = new NOPA().compute(classElement);
		double ndu = 3; // number of data users

		int exposedDataGrade = SeverityScore.computeScore(nopa, Constants.MANY, 5 * Constants.MANY);
		int exploitedDataGrade = SeverityScore.computeScore(ndu, Constants.MANY, 5 * Constants.MANY);

		// return (exposedDataGrade + 2 * exploitedDataGrade) / 3;
		double nopm = new NOPM().compute(classElement);
		double wmc = new WMC().compute(classElement);

		Iterable<IEObjectDescription> exportedObjectsByType = descriptions.getExportedObjectsByType(classElement.eClass());
		final ArrayList<EObject> gather = new ArrayList<>();

		exportedObjectsByType.forEach((e) -> {
			EObject eObjectOrProxy = e.getEObjectOrProxy();
			EObject resolve = EcoreUtil.resolve(eObjectOrProxy, classElement);
			gather.add(resolve);
		});

		classElement.getFields().listIterator().forEachRemaining((a) -> {
			System.out.println("finding for a " + a);
			Collection<Setting> find3 = EcoreUtil.UsageCrossReferencer.find(a, gather);
			find3.forEach((f) -> {
				System.out.println(">>>>" + f.getEObject());
			});

		});

		int publicDataScore = SeverityScore.computeScore(nopa, Constants.FEW, 5 * Constants.FEW);
		double woc = 1 - nopa / (nopa + nopm);

		int dataUsersScore = SeverityScore.computeScore(ndu, 1, Constants.MANY);
		int wocScore = SeverityScore.computeScore(woc, Constants.ONE_THIRD, 0);
		int wmcScore = SeverityScore.computeScore(wmc, Constants.VERY_HIGH, 0);
		int severity = SeverityScore.computeAverage(publicDataScore, dataUsersScore, wocScore, wmcScore);
		return severity;
	}

}
