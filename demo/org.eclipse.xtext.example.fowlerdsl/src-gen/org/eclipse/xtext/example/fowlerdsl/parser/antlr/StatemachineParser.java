/*
 * generated by Xtext
 */
package org.eclipse.xtext.example.fowlerdsl.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.example.fowlerdsl.services.StatemachineGrammarAccess;

public class StatemachineParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private StatemachineGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected org.eclipse.xtext.example.fowlerdsl.parser.antlr.internal.InternalStatemachineParser createParser(XtextTokenStream stream) {
		return new org.eclipse.xtext.example.fowlerdsl.parser.antlr.internal.InternalStatemachineParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "Statemachine";
	}
	
	public StatemachineGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(StatemachineGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
