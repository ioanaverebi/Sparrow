package org.refactor.ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

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
		URL url;
		try {
			url = new URL("platform:/plugin/reFactor/resources/technical_debt.html");
			InputStream inputStream = url.openConnection().getInputStream();
			BufferedReader in = new BufferedReader(new InputStreamReader(inputStream));
			String inputLine = "";
			String html = "";
			while ((inputLine = in.readLine()) != null) {
				html += inputLine;
			}
			browser.setText(html);
			in.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

		// try {
		// url = new URL("platform:/plugin/reFactor/resources/technical_debt.html");
		// } catch (IOException e) {
		// e.printStackTrace();
		// }
	}

	@Override
	public void setFocus() {
		browser.setFocus();
	}

}
