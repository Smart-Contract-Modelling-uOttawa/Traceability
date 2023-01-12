/**
 */
package org.xtext.dsl.dxl.dxlDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Folder</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.dsl.dxl.dxlDsl.Folder#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.dsl.dxl.dxlDsl.Folder#getModule <em>Module</em>}</li>
 *   <li>{@link org.xtext.dsl.dxl.dxlDsl.Folder#getAssociationType <em>Association Type</em>}</li>
 * </ul>
 *
 * @see org.xtext.dsl.dxl.dxlDsl.DxlDslPackage#getFolder()
 * @model
 * @generated
 */
public interface Folder extends EObject
{
  /**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.xtext.dsl.dxl.dxlDsl.DxlDslPackage#getFolder_Name()
	 * @model
	 * @generated
	 */
  String getName();

  /**
	 * Sets the value of the '{@link org.xtext.dsl.dxl.dxlDsl.Folder#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
  void setName(String value);

  /**
	 * Returns the value of the '<em><b>Module</b></em>' containment reference list.
	 * The list contents are of type {@link org.xtext.dsl.dxl.dxlDsl.Module}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Module</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Module</em>' containment reference list.
	 * @see org.xtext.dsl.dxl.dxlDsl.DxlDslPackage#getFolder_Module()
	 * @model containment="true"
	 * @generated
	 */
  EList<Module> getModule();

  /**
	 * Returns the value of the '<em><b>Association Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.xtext.dsl.dxl.dxlDsl.AssociationType}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Association Type</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Type</em>' containment reference list.
	 * @see org.xtext.dsl.dxl.dxlDsl.DxlDslPackage#getFolder_AssociationType()
	 * @model containment="true"
	 * @generated
	 */
  EList<AssociationType> getAssociationType();

} // Folder
