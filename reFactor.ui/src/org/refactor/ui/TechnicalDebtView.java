package org.refactor.ui;

import org.eclipse.swt.SWT;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;

public class TechnicalDebtView extends ViewPart {

	private Browser browser;

	public TechnicalDebtView() {
	}

	@Override
	public void createPartControl(Composite parent) {
		browser = new Browser(parent, SWT.None);
		browser.setUrl("https://google.com");
	}

	@Override
	public void setFocus() {
		browser.setFocus();
	}

}
