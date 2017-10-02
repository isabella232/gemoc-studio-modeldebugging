/**
 * generated by Xtext 2.10.0
 */
package org.eclipse.gemoc.dsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.gemoc.dsl.SimpleValue#getValues <em>Values</em>}</li>
 * </ul>
 *
 * @see org.eclipse.gemoc.dsl.DslPackage#getSimpleValue()
 * @model
 * @generated
 */
public interface SimpleValue extends Value
{
  /**
   * Returns the value of the '<em><b>Values</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Values</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Values</em>' attribute list.
   * @see org.eclipse.gemoc.dsl.DslPackage#getSimpleValue_Values()
   * @model unique="false"
   * @generated
   */
  EList<String> getValues();

} // SimpleValue
