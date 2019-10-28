/**
 * generated by Xtext 2.14.0
 */
package com.altran.general.integration.xtextsirius.test.reflang.refLang.util;

import com.altran.general.integration.xtextsirius.test.reflang.refLang.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see com.altran.general.integration.xtextsirius.test.reflang.refLang.RefLangPackage
 * @generated
 */
public class RefLangSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static RefLangPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RefLangSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = RefLangPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case RefLangPackage.CONTAINER:
      {
        Container container = (Container)theEObject;
        T result = caseContainer(container);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RefLangPackage.ICONTAINER_CONTENT:
      {
        IContainerContent iContainerContent = (IContainerContent)theEObject;
        T result = caseIContainerContent(iContainerContent);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RefLangPackage.SUB_CONTAINER:
      {
        SubContainer subContainer = (SubContainer)theEObject;
        T result = caseSubContainer(subContainer);
        if (result == null) result = caseIContainerContent(subContainer);
        if (result == null) result = caseReferences(subContainer);
        if (result == null) result = caseReferences2(subContainer);
        if (result == null) result = caseReferences3(subContainer);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RefLangPackage.LEAF:
      {
        Leaf leaf = (Leaf)theEObject;
        T result = caseLeaf(leaf);
        if (result == null) result = caseIContainerContent(leaf);
        if (result == null) result = caseReferences(leaf);
        if (result == null) result = caseReferences2(leaf);
        if (result == null) result = caseReferences3(leaf);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RefLangPackage.REFERENCES:
      {
        References references = (References)theEObject;
        T result = caseReferences(references);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RefLangPackage.REFERENCE:
      {
        Reference reference = (Reference)theEObject;
        T result = caseReference(reference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RefLangPackage.REFERENCES2:
      {
        References2 references2 = (References2)theEObject;
        T result = caseReferences2(references2);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RefLangPackage.REFERENCES3:
      {
        References3 references3 = (References3)theEObject;
        T result = caseReferences3(references3);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RefLangPackage.REFERENCE3:
      {
        Reference3 reference3 = (Reference3)theEObject;
        T result = caseReference3(reference3);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Container</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Container</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseContainer(Container object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>IContainer Content</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>IContainer Content</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIContainerContent(IContainerContent object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sub Container</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sub Container</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSubContainer(SubContainer object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Leaf</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Leaf</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLeaf(Leaf object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>References</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>References</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReferences(References object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Reference</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Reference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReference(Reference object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>References2</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>References2</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReferences2(References2 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>References3</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>References3</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReferences3(References3 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Reference3</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Reference3</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReference3(Reference3 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //RefLangSwitch
