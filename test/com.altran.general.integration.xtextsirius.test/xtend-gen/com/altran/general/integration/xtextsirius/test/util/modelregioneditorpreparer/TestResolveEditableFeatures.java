/**
 * Copyright (C) 2018 Altran Netherlands B.V.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package com.altran.general.integration.xtextsirius.test.util.modelregioneditorpreparer;

import com.altran.general.integration.xtextsirius.runtime.descriptor.IXtextSiriusModelDescriptor;
import com.altran.general.integration.xtextsirius.test.util.modelregioneditorpreparer.AModelRegionEditorPreparer;
import com.altran.general.integration.xtextsirius.test.util.modelregioneditorpreparer.AccessibleModelRegionEditorPreparer;
import java.util.Collections;
import java.util.Set;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.example.fowlerdsl.statemachine.Event;
import org.eclipse.xtext.example.fowlerdsl.statemachine.Statemachine;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.junit.Assert;
import org.junit.Test;

@SuppressWarnings("all")
public class TestResolveEditableFeatures extends AModelRegionEditorPreparer {
  @Test
  public void emptyFeatures() {
    final Statemachine model = this.getDefaultModel();
    final Event event = model.getEvents().get(0);
    IXtextSiriusModelDescriptor _descriptor = this.descriptor();
    final AccessibleModelRegionEditorPreparer preparer = new AccessibleModelRegionEditorPreparer(_descriptor, event);
    final Set<EStructuralFeature> resolved = preparer.resolveEditableFeatures(event);
    Assert.assertEquals(0, resolved.size());
  }
  
  @Test
  public void invalidFeatures() {
    final Statemachine model = this.getDefaultModel();
    final Event event = model.getEvents().get(0);
    AModelRegionEditorPreparer.XtextSiriusModelDescriptorAdapter _editableFeatureDescriptor = this.editableFeatureDescriptor(Collections.<String>unmodifiableSet(CollectionLiterals.<String>newHashSet("some", "feature")));
    final AccessibleModelRegionEditorPreparer preparer = new AccessibleModelRegionEditorPreparer(_editableFeatureDescriptor, event);
    final Set<EStructuralFeature> resolved = preparer.resolveEditableFeatures(event);
    Assert.assertEquals(0, resolved.size());
  }
  
  @Test
  public void someInvalidFeatures() {
    final Statemachine model = this.getDefaultModel();
    final Event event = model.getEvents().get(0);
    AModelRegionEditorPreparer.XtextSiriusModelDescriptorAdapter _editableFeatureDescriptor = this.editableFeatureDescriptor(Collections.<String>unmodifiableSet(CollectionLiterals.<String>newHashSet("name", "some", "guard", "cond")));
    final AccessibleModelRegionEditorPreparer preparer = new AccessibleModelRegionEditorPreparer(_editableFeatureDescriptor, event);
    final Set<EStructuralFeature> resolved = preparer.resolveEditableFeatures(event);
    Assert.assertEquals(resolved.toString(), 2, resolved.size());
    Assert.assertNotNull(this.<EStructuralFeature>findFirstByName(resolved, "name"));
    Assert.assertNotNull(this.<EStructuralFeature>findFirstByName(resolved, "guard"));
  }
  
  @Test
  public void validFeatures() {
    final Statemachine model = this.getDefaultModel();
    final Event event = model.getEvents().get(0);
    AModelRegionEditorPreparer.XtextSiriusModelDescriptorAdapter _editableFeatureDescriptor = this.editableFeatureDescriptor(Collections.<String>unmodifiableSet(CollectionLiterals.<String>newHashSet("name", "guard")));
    final AccessibleModelRegionEditorPreparer preparer = new AccessibleModelRegionEditorPreparer(_editableFeatureDescriptor, event);
    final Set<EStructuralFeature> resolved = preparer.resolveEditableFeatures(event);
    Assert.assertEquals(resolved.toString(), 2, resolved.size());
    Assert.assertNotNull(this.<EStructuralFeature>findFirstByName(resolved, "name"));
    Assert.assertNotNull(this.<EStructuralFeature>findFirstByName(resolved, "guard"));
  }
}
