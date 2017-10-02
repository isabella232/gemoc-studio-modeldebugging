/**
 * generated by Xtext 2.10.0
 */
package org.eclipse.gemoc.dsl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.gemoc.dsl.DslPackage
 * @generated
 */
public interface DslFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  DslFactory eINSTANCE = org.eclipse.gemoc.dsl.impl.DslFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Dsl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Dsl</em>'.
   * @generated
   */
  Dsl createDsl();

  /**
   * Returns a new object of class '<em>Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Value</em>'.
   * @generated
   */
  Value createValue();

  /**
   * Returns a new object of class '<em>Simple Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Simple Value</em>'.
   * @generated
   */
  SimpleValue createSimpleValue();

  /**
   * Returns a new object of class '<em>Composite Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Composite Value</em>'.
   * @generated
   */
  CompositeValue createCompositeValue();

  /**
   * Returns a new object of class '<em>Display Name</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Display Name</em>'.
   * @generated
   */
  DisplayName createDisplayName();

  /**
   * Returns a new object of class '<em>Metaprog</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Metaprog</em>'.
   * @generated
   */
  Metaprog createMetaprog();

  /**
   * Returns a new object of class '<em>Abstract Syntax</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Abstract Syntax</em>'.
   * @generated
   */
  AbstractSyntax createAbstractSyntax();

  /**
   * Returns a new object of class '<em>Semantic</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Semantic</em>'.
   * @generated
   */
  Semantic createSemantic();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  DslPackage getDslPackage();

} //DslFactory
