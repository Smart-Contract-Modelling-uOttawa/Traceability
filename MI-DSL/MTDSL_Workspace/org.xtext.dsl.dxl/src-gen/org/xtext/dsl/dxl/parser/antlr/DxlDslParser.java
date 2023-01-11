/*
* generated by Xtext
*/
package org.xtext.dsl.dxl.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.xtext.dsl.dxl.services.DxlDslGrammarAccess;

public class DxlDslParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private DxlDslGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected org.xtext.dsl.dxl.parser.antlr.internal.InternalDxlDslParser createParser(XtextTokenStream stream) {
		return new org.xtext.dsl.dxl.parser.antlr.internal.InternalDxlDslParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}
	
	public DxlDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(DxlDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
