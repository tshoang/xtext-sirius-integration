<<<<<<< 1a6e8bd3e6f71b6e27aa8db10a884de044d8cdeb
/**
 */
package com.altran.general.integration.xtextsirius.model.properties.propertiesxtext;

import org.eclipse.emf.ecore.EObject;

import com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextPropertyValueDescription;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Xtext
 * Single Line Value Description</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.PropertiesxtextPackage#getXtextSingleLineValueDescription()
 * @model superTypes="org.eclipse.emf.ecore.EJavaObject
 *        com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextPropertyValueDescription"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel image='true'"
 * @generated
 */
public interface XtextSingleLineValueDescription extends EObject, IXtextPropertyValueDescription {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return
	 *        false;'"
	 * @generated
	 */
	@Override
	boolean isMultiLine();

} // XtextSingleLineValueDescription
=======
/**
 */
package com.altran.general.integration.xtextsirius.model.properties.propertiesxtext;

import com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextPropertyValueDescription;

import org.eclipse.sirius.properties.TextDescription;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Xtext Single Line Value Description</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.PropertiesxtextPackage#getXtextSingleLineValueDescription()
 * @model annotation="http://www.eclipse.org/emf/2002/GenModel image='true'"
 * @generated
 */
public interface XtextSingleLineValueDescription extends TextDescription, IXtextPropertyValueDescription {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return false;'"
	 * @generated
	 */
	@Override
	boolean isMultiLine();

} // XtextSingleLineValueDescription
>>>>>>> preliminary fix for using guava v16
