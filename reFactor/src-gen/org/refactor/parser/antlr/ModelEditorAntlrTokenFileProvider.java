/*
 * generated by Xtext 2.10.0
 */
package org.refactor.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class ModelEditorAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("org/refactor/parser/antlr/internal/InternalModelEditorParser.tokens");
	}
}
