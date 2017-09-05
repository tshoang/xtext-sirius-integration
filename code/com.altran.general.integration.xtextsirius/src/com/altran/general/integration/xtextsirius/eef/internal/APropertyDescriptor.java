package com.altran.general.integration.xtextsirius.eef.internal;

import org.apache.commons.lang.StringUtils;
import org.eclipse.eef.EEFTextDescription;
import org.eclipse.eef.core.api.EditingContextAdapter;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;

import com.altran.general.integration.xtextsirius.eef.IXtextPropertyConfiguration;
import com.altran.general.integration.xtextsirius.internal.IDescriptor;

public abstract class APropertyDescriptor implements IDescriptor {
	
	private final String identifier;
	private final boolean multiLine;
	private final IXtextPropertyConfiguration config;

	public APropertyDescriptor(
			final @Nullable String identifier,
			final boolean multiLine,
			final @Nullable IXtextPropertyConfiguration config) {
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

	public @NonNull IXtextPropertyConfiguration getConfig() {
		return this.config;
	}

	@Override
	public boolean isValid() {
		return StringUtils.isNotBlank(getIdentifier()) && getConfig() != null;
	}
	
	public abstract @NonNull AXtextSiriusEefLifecycleManager createEefLifecycleManager(
			final @NonNull EEFTextDescription controlDescription,
			final @NonNull IVariableManager variableManager,
			final @NonNull IInterpreter interpreter,
			final @NonNull EditingContextAdapter contextAdapter);
}
