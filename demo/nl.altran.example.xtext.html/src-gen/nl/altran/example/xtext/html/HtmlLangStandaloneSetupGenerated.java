/*
 * generated by Xtext 2.12.0
 */
package nl.altran.example.xtext.html;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.xtext.ISetup;
import org.eclipse.xtext.XtextPackage;
import org.eclipse.xtext.resource.IResourceFactory;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.eclipse.xtext.resource.impl.BinaryGrammarResourceFactoryImpl;

import com.google.inject.Guice;
import com.google.inject.Injector;

import nl.altran.example.xtext.html.htmlLang.HtmlLangPackage;

@SuppressWarnings("all")
public class HtmlLangStandaloneSetupGenerated implements ISetup {
	
	@Override
	public Injector createInjectorAndDoEMFRegistration() {
		// register default ePackages
		if (!Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().containsKey("ecore")) {
			Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());
		}
		if (!Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().containsKey("xmi")) {
			Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		}
		if (!Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().containsKey("xtextbin")) {
			Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xtextbin",
					new BinaryGrammarResourceFactoryImpl());
		}
		if (!EPackage.Registry.INSTANCE.containsKey(XtextPackage.eNS_URI)) {
			EPackage.Registry.INSTANCE.put(XtextPackage.eNS_URI, XtextPackage.eINSTANCE);
		}

		final Injector injector = createInjector();
		register(injector);
		return injector;
	}
	
	public Injector createInjector() {
		return Guice.createInjector(new HtmlLangRuntimeModule());
	}
	
	public void register(final Injector injector) {
		if (!EPackage.Registry.INSTANCE.containsKey("http://www.altran.nl/example/xtext/html/HtmlLang")) {
			EPackage.Registry.INSTANCE.put("http://www.altran.nl/example/xtext/html/HtmlLang",
					HtmlLangPackage.eINSTANCE);
		}
		final IResourceFactory resourceFactory = injector.getInstance(IResourceFactory.class);
		final IResourceServiceProvider serviceProvider = injector.getInstance(IResourceServiceProvider.class);
		
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("html", resourceFactory);
		IResourceServiceProvider.Registry.INSTANCE.getExtensionToFactoryMap().put("html", serviceProvider);
	}
}
