package com.altran.general.integration.xtextsirius.editpart.internal.model;

import java.util.Collection;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.gef.tools.DirectEditManager;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jdt.annotation.NonNull;

import com.altran.general.integration.xtextsirius.editpart.internal.AXtextSiriusEditPart;

public class XtextSiriusEditPartModel extends AXtextSiriusEditPart implements IXtextSiriusEditPartModel {
	private final Collection<@NonNull String> editableFeatures;
	
	public XtextSiriusEditPartModel(final @NonNull EditPartDescriptorModel descriptor, final @NonNull View view) {
		super(descriptor, view);
		this.editableFeatures = descriptor.getEditableFeatures();
	}
	
	/**
	 * This value should never be used. Instead, use
	 * {@link #getSemanticElement()}.
	 */
	@Override
	public @NonNull String getEditText() {
		return "";
	}

	@Override
	protected @NonNull DirectEditManager createDirectEditManager() {
		return new XtextSiriusDirectEditManagerModel(this, getInjector(),
				translateToStyle(), isMultiLine(), getEditableFeatures());
	}
	
	@Override
	protected void setContext(final Resource res) {
		// TODO Auto-generated method stub

	}

	@Override
	public @NonNull Collection<@NonNull String> getEditableFeatures() {
		return this.editableFeatures;
	}
}
