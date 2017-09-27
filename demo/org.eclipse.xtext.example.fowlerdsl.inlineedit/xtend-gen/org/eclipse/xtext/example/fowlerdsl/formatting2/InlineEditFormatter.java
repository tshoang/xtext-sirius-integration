/**
 * generated by Xtext
 */
package org.eclipse.xtext.example.fowlerdsl.formatting2;

import com.google.inject.Inject;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.example.fowlerdsl.formatting2.StatemachineFormatter;
import org.eclipse.xtext.example.fowlerdsl.services.InlineEditGrammarAccess;
import org.eclipse.xtext.example.fowlerdsl.statemachine.Command;
import org.eclipse.xtext.example.fowlerdsl.statemachine.Constant;
import org.eclipse.xtext.example.fowlerdsl.statemachine.Event;
import org.eclipse.xtext.example.fowlerdsl.statemachine.RangeGuard;
import org.eclipse.xtext.example.fowlerdsl.statemachine.State;
import org.eclipse.xtext.example.fowlerdsl.statemachine.Statemachine;
import org.eclipse.xtext.example.fowlerdsl.statemachine.Transition;
import org.eclipse.xtext.example.fowlerdsl.statemachine.ValueGuard;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("restriction")
public class InlineEditFormatter extends StatemachineFormatter {
  @Inject
  @Extension
  private InlineEditGrammarAccess _inlineEditGrammarAccess;
  
  @Override
  protected void _format(final Statemachine statemachine, @Extension final IFormattableDocument document) {
    EList<Event> _events = statemachine.getEvents();
    for (final Event events : _events) {
      this.format(events, document);
    }
    EList<Command> _commands = statemachine.getCommands();
    for (final Command commands : _commands) {
      this.format(commands, document);
    }
    EList<Constant> _constants = statemachine.getConstants();
    for (final Constant constants : _constants) {
      this.format(constants, document);
    }
    EList<State> _states = statemachine.getStates();
    for (final State states : _states) {
      this.format(states, document);
    }
  }
  
  @Override
  protected void _format(final Transition transition, @Extension final IFormattableDocument document) {
    this.format(transition.getGuard(), document);
  }
  
  public void format(final Object statemachine, final IFormattableDocument document) {
    if (statemachine instanceof XtextResource) {
      _format((XtextResource)statemachine, document);
      return;
    } else if (statemachine instanceof RangeGuard) {
      _format((RangeGuard)statemachine, document);
      return;
    } else if (statemachine instanceof ValueGuard) {
      _format((ValueGuard)statemachine, document);
      return;
    } else if (statemachine instanceof Command) {
      _format((Command)statemachine, document);
      return;
    } else if (statemachine instanceof Constant) {
      _format((Constant)statemachine, document);
      return;
    } else if (statemachine instanceof Event) {
      _format((Event)statemachine, document);
      return;
    } else if (statemachine instanceof State) {
      _format((State)statemachine, document);
      return;
    } else if (statemachine instanceof Statemachine) {
      _format((Statemachine)statemachine, document);
      return;
    } else if (statemachine instanceof Transition) {
      _format((Transition)statemachine, document);
      return;
    } else if (statemachine instanceof EObject) {
      _format((EObject)statemachine, document);
      return;
    } else if (statemachine == null) {
      _format((Void)null, document);
      return;
    } else if (statemachine != null) {
      _format(statemachine, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(statemachine, document).toString());
    }
  }
}