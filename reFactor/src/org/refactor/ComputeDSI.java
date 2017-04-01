package org.refactor;

import javax.inject.Inject;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.IResourceDescriptions;

public class ComputeDSI extends AbstractHandler implements IHandler {

	@Inject
	private IResourceDescriptions iResourceDescriptions;

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		Iterable<IEObjectDescription> exportedObjects = iResourceDescriptions.getExportedObjects();
		try {
			PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().showView("reFactor.ui.TechnicalDebt");
		} catch (PartInitException e) {
			e.printStackTrace();
		}
		return null;
	}

}
