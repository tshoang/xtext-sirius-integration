/*
 * generated by Xtext
 */
package org.eclipse.xtext.example.fowlerdsl.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.example.fowlerdsl.services.StatemachineGrammarAccess;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class StatemachineSyntacticSequencer extends AbstractSyntacticSequencer {

	protected StatemachineGrammarAccess grammarAccess;
	protected AbstractElementAlias match_State_ThingsKeyword_5_0_q;
	protected AbstractElementAlias match_Statemachine___CommandsKeyword_3_0_EndKeyword_3_2__q;
	protected AbstractElementAlias match_Statemachine___ConstantsKeyword_4_0_EndKeyword_4_2__q;
	protected AbstractElementAlias match_Statemachine___EventsKeyword_1_0_EndKeyword_1_2__q;
	protected AbstractElementAlias match_Statemachine___ResetEventsKeyword_2_0_EndKeyword_2_2__q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (StatemachineGrammarAccess) access;
		match_State_ThingsKeyword_5_0_q = new TokenAlias(false, true, grammarAccess.getStateAccess().getThingsKeyword_5_0());
		match_Statemachine___CommandsKeyword_3_0_EndKeyword_3_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getStatemachineAccess().getCommandsKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getStatemachineAccess().getEndKeyword_3_2()));
		match_Statemachine___ConstantsKeyword_4_0_EndKeyword_4_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getStatemachineAccess().getConstantsKeyword_4_0()), new TokenAlias(false, false, grammarAccess.getStatemachineAccess().getEndKeyword_4_2()));
		match_Statemachine___EventsKeyword_1_0_EndKeyword_1_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getStatemachineAccess().getEventsKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getStatemachineAccess().getEndKeyword_1_2()));
		match_Statemachine___ResetEventsKeyword_2_0_EndKeyword_2_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getStatemachineAccess().getResetEventsKeyword_2_0()), new TokenAlias(false, false, grammarAccess.getStatemachineAccess().getEndKeyword_2_2()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_State_ThingsKeyword_5_0_q.equals(syntax))
				emit_State_ThingsKeyword_5_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Statemachine___CommandsKeyword_3_0_EndKeyword_3_2__q.equals(syntax))
				emit_Statemachine___CommandsKeyword_3_0_EndKeyword_3_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Statemachine___ConstantsKeyword_4_0_EndKeyword_4_2__q.equals(syntax))
				emit_Statemachine___ConstantsKeyword_4_0_EndKeyword_4_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Statemachine___EventsKeyword_1_0_EndKeyword_1_2__q.equals(syntax))
				emit_Statemachine___EventsKeyword_1_0_EndKeyword_1_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Statemachine___ResetEventsKeyword_2_0_EndKeyword_2_2__q.equals(syntax))
				emit_Statemachine___ResetEventsKeyword_2_0_EndKeyword_2_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     'things'?
	 *
	 * This ambiguous syntax occurs at:
	 *     actions+=[Command|ID] '}' (ambiguity) 'end' (rule end)
	 *     description=STRING (ambiguity) 'end' (rule end)
	 *     name=ID (ambiguity) 'end' (rule end)
	 *     transitions+=Transition (ambiguity) 'end' (rule end)
	 */
	protected void emit_State_ThingsKeyword_5_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('commands' 'end')?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) ('events' 'end')? ('resetEvents' 'end')? (ambiguity) 'constants' constants+=Constant
	 *     (rule start) ('events' 'end')? ('resetEvents' 'end')? (ambiguity) ('constants' 'end')? (rule start)
	 *     (rule start) ('events' 'end')? ('resetEvents' 'end')? (ambiguity) ('constants' 'end')? states+=State
	 *     events+=Event 'end' ('resetEvents' 'end')? (ambiguity) 'constants' constants+=Constant
	 *     events+=Event 'end' ('resetEvents' 'end')? (ambiguity) ('constants' 'end')? (rule end)
	 *     events+=Event 'end' ('resetEvents' 'end')? (ambiguity) ('constants' 'end')? states+=State
	 *     resetEvents+=[Event|ID] 'end' (ambiguity) 'constants' constants+=Constant
	 *     resetEvents+=[Event|ID] 'end' (ambiguity) ('constants' 'end')? (rule end)
	 *     resetEvents+=[Event|ID] 'end' (ambiguity) ('constants' 'end')? states+=State
	 */
	protected void emit_Statemachine___CommandsKeyword_3_0_EndKeyword_3_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('constants' 'end')?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) ('events' 'end')? ('resetEvents' 'end')? ('commands' 'end')? (ambiguity) (rule start)
	 *     (rule start) ('events' 'end')? ('resetEvents' 'end')? ('commands' 'end')? (ambiguity) states+=State
	 *     commands+=Command 'end' (ambiguity) (rule end)
	 *     commands+=Command 'end' (ambiguity) states+=State
	 *     events+=Event 'end' ('resetEvents' 'end')? ('commands' 'end')? (ambiguity) (rule end)
	 *     events+=Event 'end' ('resetEvents' 'end')? ('commands' 'end')? (ambiguity) states+=State
	 *     resetEvents+=[Event|ID] 'end' ('commands' 'end')? (ambiguity) (rule end)
	 *     resetEvents+=[Event|ID] 'end' ('commands' 'end')? (ambiguity) states+=State
	 */
	protected void emit_Statemachine___ConstantsKeyword_4_0_EndKeyword_4_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('events' 'end')?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) 'resetEvents' resetEvents+=[Event|ID]
	 *     (rule start) (ambiguity) ('resetEvents' 'end')? 'commands' commands+=Command
	 *     (rule start) (ambiguity) ('resetEvents' 'end')? ('commands' 'end')? 'constants' constants+=Constant
	 *     (rule start) (ambiguity) ('resetEvents' 'end')? ('commands' 'end')? ('constants' 'end')? (rule start)
	 *     (rule start) (ambiguity) ('resetEvents' 'end')? ('commands' 'end')? ('constants' 'end')? states+=State
	 */
	protected void emit_Statemachine___EventsKeyword_1_0_EndKeyword_1_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('resetEvents' 'end')?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) ('events' 'end')? (ambiguity) 'commands' commands+=Command
	 *     (rule start) ('events' 'end')? (ambiguity) ('commands' 'end')? 'constants' constants+=Constant
	 *     (rule start) ('events' 'end')? (ambiguity) ('commands' 'end')? ('constants' 'end')? (rule start)
	 *     (rule start) ('events' 'end')? (ambiguity) ('commands' 'end')? ('constants' 'end')? states+=State
	 *     events+=Event 'end' (ambiguity) 'commands' commands+=Command
	 *     events+=Event 'end' (ambiguity) ('commands' 'end')? 'constants' constants+=Constant
	 *     events+=Event 'end' (ambiguity) ('commands' 'end')? ('constants' 'end')? (rule end)
	 *     events+=Event 'end' (ambiguity) ('commands' 'end')? ('constants' 'end')? states+=State
	 */
	protected void emit_Statemachine___ResetEventsKeyword_2_0_EndKeyword_2_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
