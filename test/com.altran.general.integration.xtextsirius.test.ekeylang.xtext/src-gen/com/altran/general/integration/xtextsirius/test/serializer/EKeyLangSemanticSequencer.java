/*
 * generated by Xtext 2.18.0.M3
 */
package com.altran.general.integration.xtextsirius.test.serializer;

import com.altran.general.integration.xtextsirius.test.EKeyLang.Container;
import com.altran.general.integration.xtextsirius.test.EKeyLang.EKeyLangPackage;
import com.altran.general.integration.xtextsirius.test.EKeyLang.Group;
import com.altran.general.integration.xtextsirius.test.EKeyLang.Leaf;
import com.altran.general.integration.xtextsirius.test.services.EKeyLangGrammarAccess;
import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class EKeyLangSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private EKeyLangGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == EKeyLangPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case EKeyLangPackage.CONTAINER:
				sequence_Container(context, (Container) semanticObject); 
				return; 
			case EKeyLangPackage.GROUP:
				sequence_Group(context, (Group) semanticObject); 
				return; 
			case EKeyLangPackage.LEAF:
				sequence_Leaf(context, (Leaf) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Container returns Container
	 *
	 * Constraint:
	 *     (name=ID contents+=IContainerContent*)
	 */
	protected void sequence_Container(ISerializationContext context, Container semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     IContainerContent returns Group
	 *     Group returns Group
	 *
	 * Constraint:
	 *     (name=ID leafs+=IContainerContent*)
	 */
	protected void sequence_Group(ISerializationContext context, Group semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     IContainerContent returns Leaf
	 *     Leaf returns Leaf
	 *
	 * Constraint:
	 *     (name=ID number=INT)
	 */
	protected void sequence_Leaf(ISerializationContext context, Leaf semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, EKeyLangPackage.Literals.ANAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EKeyLangPackage.Literals.ANAMED_ELEMENT__NAME));
			if (transientValues.isValueTransient(semanticObject, EKeyLangPackage.Literals.LEAF__NUMBER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EKeyLangPackage.Literals.LEAF__NUMBER));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getLeafAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getLeafAccess().getNumberINTTerminalRuleCall_1_0(), semanticObject.getNumber());
		feeder.finish();
	}
	
	
}
