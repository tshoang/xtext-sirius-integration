/*
 * generated by Xtext 2.14.0
 */
package com.altran.general.integration.xtextsirius.test.reflang.edit.ui.contentassist;

import com.altran.general.integration.xtextsirius.test.reflang.ui.contentassist.RefLangProposalProvider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;

/**
 * Represents a generated, default implementation of superclass {@link RefLangProposalProvider}.
 * Methods are dynamically dispatched on the first parameter, i.e., you can override them 
 * with a more concrete subtype. 
 */
public abstract class AbstractRefLangEditProposalProvider extends RefLangProposalProvider {

	public void complete_XContainer(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		// subclasses may override
	}
}