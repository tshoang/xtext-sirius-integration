/*
 * generated by Xtext
 */
package org.eclipse.xtext.example.fowlerdsl.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.example.fowlerdsl.services.StatemachineGrammarAccess;
import org.eclipse.xtext.example.fowlerdsl.statemachine.Command;
import org.eclipse.xtext.example.fowlerdsl.statemachine.Constant;
import org.eclipse.xtext.example.fowlerdsl.statemachine.ConstantRef;
import org.eclipse.xtext.example.fowlerdsl.statemachine.Event;
import org.eclipse.xtext.example.fowlerdsl.statemachine.IntLiteral;
import org.eclipse.xtext.example.fowlerdsl.statemachine.RangeGuard;
import org.eclipse.xtext.example.fowlerdsl.statemachine.State;
import org.eclipse.xtext.example.fowlerdsl.statemachine.Statemachine;
import org.eclipse.xtext.example.fowlerdsl.statemachine.StatemachinePackage;
import org.eclipse.xtext.example.fowlerdsl.statemachine.Thing;
import org.eclipse.xtext.example.fowlerdsl.statemachine.Transition;
import org.eclipse.xtext.example.fowlerdsl.statemachine.ValueGuard;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class StatemachineSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private StatemachineGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == StatemachinePackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case StatemachinePackage.COMMAND:
				sequence_Command(context, (Command) semanticObject); 
				return; 
			case StatemachinePackage.CONSTANT:
				sequence_Constant(context, (Constant) semanticObject); 
				return; 
			case StatemachinePackage.CONSTANT_REF:
				sequence_ConstantRef(context, (ConstantRef) semanticObject); 
				return; 
			case StatemachinePackage.EVENT:
				sequence_Event(context, (Event) semanticObject); 
				return; 
			case StatemachinePackage.INT_LITERAL:
				sequence_IntLiteral(context, (IntLiteral) semanticObject); 
				return; 
			case StatemachinePackage.RANGE_GUARD:
				sequence_RangeGuard(context, (RangeGuard) semanticObject); 
				return; 
			case StatemachinePackage.STATE:
				sequence_State(context, (State) semanticObject); 
				return; 
			case StatemachinePackage.STATEMACHINE:
				sequence_Statemachine(context, (Statemachine) semanticObject); 
				return; 
			case StatemachinePackage.THING:
				sequence_Thing(context, (Thing) semanticObject); 
				return; 
			case StatemachinePackage.TRANSITION:
				sequence_Transition(context, (Transition) semanticObject); 
				return; 
			case StatemachinePackage.VALUE_GUARD:
				sequence_ValueGuard(context, (ValueGuard) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Command returns Command
	 *
	 * Constraint:
	 *     (guard=Guard? name=ID code=INT)
	 */
	protected void sequence_Command(ISerializationContext context, Command semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Value returns ConstantRef
	 *     ConstantRef returns ConstantRef
	 *
	 * Constraint:
	 *     constant=[Constant|ID]
	 */
	protected void sequence_ConstantRef(ISerializationContext context, ConstantRef semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, StatemachinePackage.Literals.CONSTANT_REF__CONSTANT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StatemachinePackage.Literals.CONSTANT_REF__CONSTANT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getConstantRefAccess().getConstantConstantIDTerminalRuleCall_0_1(), semanticObject.eGet(StatemachinePackage.Literals.CONSTANT_REF__CONSTANT, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Constant returns Constant
	 *
	 * Constraint:
	 *     (name=ID value=Value)
	 */
	protected void sequence_Constant(ISerializationContext context, Constant semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, StatemachinePackage.Literals.CONSTANT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StatemachinePackage.Literals.CONSTANT__NAME));
			if (transientValues.isValueTransient(semanticObject, StatemachinePackage.Literals.CONSTANT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StatemachinePackage.Literals.CONSTANT__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getConstantAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getConstantAccess().getValueValueParserRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Event returns Event
	 *
	 * Constraint:
	 *     (name=ID code=INT? guard=Guard?)
	 */
	protected void sequence_Event(ISerializationContext context, Event semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Value returns IntLiteral
	 *     IntLiteral returns IntLiteral
	 *
	 * Constraint:
	 *     value=INT
	 */
	protected void sequence_IntLiteral(ISerializationContext context, IntLiteral semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, StatemachinePackage.Literals.INT_LITERAL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StatemachinePackage.Literals.INT_LITERAL__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getIntLiteralAccess().getValueINTTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Guard returns RangeGuard
	 *     RangeGuard returns RangeGuard
	 *
	 * Constraint:
	 *     (min=Value max=Value)
	 */
	protected void sequence_RangeGuard(ISerializationContext context, RangeGuard semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, StatemachinePackage.Literals.RANGE_GUARD__MIN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StatemachinePackage.Literals.RANGE_GUARD__MIN));
			if (transientValues.isValueTransient(semanticObject, StatemachinePackage.Literals.RANGE_GUARD__MAX) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StatemachinePackage.Literals.RANGE_GUARD__MAX));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRangeGuardAccess().getMinValueParserRuleCall_0_0(), semanticObject.getMin());
		feeder.accept(grammarAccess.getRangeGuardAccess().getMaxValueParserRuleCall_2_0(), semanticObject.getMax());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     State returns State
	 *
	 * Constraint:
	 *     (name=ID description=STRING? actions+=[Command|ID]* transitions+=Transition* things+=Thing*)
	 */
	protected void sequence_State(ISerializationContext context, State semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Statemachine returns Statemachine
	 *
	 * Constraint:
	 *     (
	 *         name=ID? 
	 *         events+=Event* 
	 *         resetEvents+=[Event|ID]* 
	 *         commands+=Command* 
	 *         constants+=Constant* 
	 *         states+=State*
	 *     )
	 */
	protected void sequence_Statemachine(ISerializationContext context, Statemachine semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Thing returns Thing
	 *
	 * Constraint:
	 *     (name=ID guard=Guard)
	 */
	protected void sequence_Thing(ISerializationContext context, Thing semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, StatemachinePackage.Literals.THING__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StatemachinePackage.Literals.THING__NAME));
			if (transientValues.isValueTransient(semanticObject, StatemachinePackage.Literals.THING__GUARD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StatemachinePackage.Literals.THING__GUARD));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getThingAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getThingAccess().getGuardGuardParserRuleCall_1_0(), semanticObject.getGuard());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Transition returns Transition
	 *
	 * Constraint:
	 *     (event=[Event|ID] guard=Guard? state=[State|ID])
	 */
	protected void sequence_Transition(ISerializationContext context, Transition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Guard returns ValueGuard
	 *     ValueGuard returns ValueGuard
	 *
	 * Constraint:
	 *     cond=Value
	 */
	protected void sequence_ValueGuard(ISerializationContext context, ValueGuard semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, StatemachinePackage.Literals.VALUE_GUARD__COND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StatemachinePackage.Literals.VALUE_GUARD__COND));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getValueGuardAccess().getCondValueParserRuleCall_0(), semanticObject.getCond());
		feeder.finish();
	}
	
	
}
