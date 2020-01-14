/*
 * generated by Xtext 2.11.0
 */
package org.eclipse.cmf.occi.core.xtext.ide

import com.google.inject.Guice
import org.eclipse.cmf.occi.core.xtext.OCCIRuntimeModule
import org.eclipse.cmf.occi.core.xtext.OCCIStandaloneSetup
import org.eclipse.xtext.util.Modules2

/**
 * Initialization support for running Xtext languages as language servers.
 */
class OCCIIdeSetup extends OCCIStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new OCCIRuntimeModule, new OCCIIdeModule))
	}
	
}