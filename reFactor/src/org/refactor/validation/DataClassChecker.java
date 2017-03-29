package org.refactor.validation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
import org.refactor.modelEditor.Method;

public class DataClassChecker implements IRuleChecker {

	private Class classElement;

	private ArrayList<IResource> allFilesInProject = new ArrayList<>();

	private IResourceDescriptions descriptions;

	public DataClassChecker(IResourceDescriptions descriptions, Class classElement) {
		this.descriptions = descriptions;
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

		Set<Class> users = new HashSet<Class>();
		CrossReferenceResolver resolver = new CrossReferenceResolver();
		for (Method reference : resolver.findFieldReferences(descriptions, classElement)) {
			users.add((Class) reference.eContainer());
		}
		double ndu = users.size(); // number of data users

		int exposedDataGrade = SeverityScore.computeScore(nopa, Constants.MANY, 5 * Constants.MANY);
		int exploitedDataGrade = SeverityScore.computeScore(ndu, Constants.FEW, 5 * Constants.MANY);
		
		int grade = (exposedDataGrade + 2 * exploitedDataGrade) / 3;
		return grade > 0 ? grade : 1;
	}

}
