package com.altran.general.integration.xtextsirius.editpart.internal;

import org.apache.commons.lang.StringUtils;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.sirius.diagram.DDiagramElement;
import org.eclipse.sirius.diagram.description.DiagramElementMapping;
import org.eclipse.sirius.diagram.description.tool.DirectEditLabel;
import org.eclipse.sirius.viewpoint.description.RepresentationElementMapping;
import org.eclipse.sirius.viewpoint.description.tool.InitialOperation;
import org.eclipse.sirius.viewpoint.description.tool.SetValue;
import org.yakindu.base.xtext.utils.gmf.directedit.IXtextAwareEditPart;

import com.altran.general.integration.xtextsirius.editpart.IXtextDirectEditConfiguration;
import com.altran.general.integration.xtextsirius.internal.IDescriptor;

public abstract class AEditPartDescriptor implements IDescriptor {
	
	private final String identifier;
	private final boolean multiLine;
	private final IXtextDirectEditConfiguration config;

	public AEditPartDescriptor(
			final @Nullable String identifier,
			final boolean multiLine,
			final @Nullable IXtextDirectEditConfiguration config) {
		this.identifier = identifier;
		this.multiLine = multiLine;
		this.config = config;
	}

	@Override
	public @NonNull String getIdentifier() {
		return this.identifier;
	}

	@Override
	public boolean isMultiLine() {
		return this.multiLine;
	}

	public @NonNull IXtextDirectEditConfiguration getConfig() {
		return this.config;
	}

	@Override
	public boolean isValid() {
		return StringUtils.isNotBlank(getIdentifier()) && getConfig() != null;
	}
	
	public boolean matches(final @NonNull View view) {
		final EObject element = view.getElement();
		if (element instanceof DDiagramElement) {
			final RepresentationElementMapping mapping = ((DDiagramElement) element).getMapping();
			if (mapping instanceof DiagramElementMapping) {
				final DirectEditLabel directEdit = ((DiagramElementMapping) mapping).getLabelDirectEdit();
				if (directEdit != null) {
					final InitialOperation initialOperation = directEdit.getInitialOperation();
					if (initialOperation != null) {
						if (initialOperation.getFirstModelOperations() instanceof SetValue) {
							return true;
						}
					}
				}
			}

		}

		return false;
	}
	
	public abstract @NonNull IXtextAwareEditPart createEditPart(final @NonNull View view);
}
