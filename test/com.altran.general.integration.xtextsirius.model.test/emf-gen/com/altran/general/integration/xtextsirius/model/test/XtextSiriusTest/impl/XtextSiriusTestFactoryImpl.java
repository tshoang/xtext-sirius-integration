/**
 * Copyright (C) 2018 Altran Netherlands B.V.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.impl;

import com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class XtextSiriusTestFactoryImpl extends EFactoryImpl implements XtextSiriusTestFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static XtextSiriusTestFactory init() {
		try {
			XtextSiriusTestFactory theXtextSiriusTestFactory = (XtextSiriusTestFactory) EPackage.Registry.INSTANCE
					.getEFactory(XtextSiriusTestPackage.eNS_URI);
			if (theXtextSiriusTestFactory != null) {
				return theXtextSiriusTestFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new XtextSiriusTestFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XtextSiriusTestFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case XtextSiriusTestPackage.ID_ELEMENT:
			return createIdElement();
		case XtextSiriusTestPackage.ELEMENT:
			return createElement();
		case XtextSiriusTestPackage.KEY_ELEMENT:
			return createKeyElement();
		case XtextSiriusTestPackage.CONTAINED_A:
			return createContainedA();
		case XtextSiriusTestPackage.CONTAINED_B:
			return createContainedB();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdElement createIdElement() {
		IdElementImpl idElement = new IdElementImpl();
		return idElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element createElement() {
		ElementImpl element = new ElementImpl();
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeyElement createKeyElement() {
		KeyElementImpl keyElement = new KeyElementImpl();
		return keyElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainedA createContainedA() {
		ContainedAImpl containedA = new ContainedAImpl();
		return containedA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainedB createContainedB() {
		ContainedBImpl containedB = new ContainedBImpl();
		return containedB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XtextSiriusTestPackage getXtextSiriusTestPackage() {
		return (XtextSiriusTestPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static XtextSiriusTestPackage getPackage() {
		return XtextSiriusTestPackage.eINSTANCE;
	}

} //XtextSiriusTestFactoryImpl
