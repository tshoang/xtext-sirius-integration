/*
 * generated by Xtext 2.18.0.M3
 */
package com.altran.general.integration.xtextsirius.test


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class EKeyLangStandaloneSetup extends EKeyLangStandaloneSetupGenerated {

	def static void doSetup() {
		new EKeyLangStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
