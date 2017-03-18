package org.lrg.outcode.commands;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;

public class ComputeDSI extends AbstractHandler implements IHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		try {
			PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().showView("reFactor.ui.TechnicalDebt");
		} catch (PartInitException e) {
			e.printStackTrace();
		}
		return null;
	}

}
