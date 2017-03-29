package org.refactor.validation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.refactor.modelEditor.Class;
import org.refactor.modelEditor.Method;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.IResourceDescriptions;

public class CrossReferenceResolver {

	public List<Method> findFieldReferences(IResourceDescriptions descriptions, Class element){
		List<Method> usages = new ArrayList<Method>();
		Iterable<IEObjectDescription> exportedObjectsByType = descriptions.getExportedObjectsByType(element.eClass());
		final ArrayList<EObject> gather = new ArrayList<>();

		exportedObjectsByType.forEach((e) -> {
			EObject eObjectOrProxy = e.getEObjectOrProxy();
			EObject resolve = EcoreUtil.resolve(eObjectOrProxy, element);
			gather.add(resolve);
		});

		element.getFields().listIterator().forEachRemaining((a) -> {
			Collection<Setting> references = EcoreUtil.UsageCrossReferencer.find(a, gather);
			references.forEach((f) -> {
				usages.add((Method) f.getEObject().eContainer());
			});
		});
		return usages;
	}
}
