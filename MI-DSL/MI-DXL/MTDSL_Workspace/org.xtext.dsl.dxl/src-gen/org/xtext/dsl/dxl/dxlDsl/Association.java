/**
 */
package org.xtext.dsl.dxl.dxlDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.dsl.dxl.dxlDsl.Association#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.dsl.dxl.dxlDsl.Association#getAssoType <em>Asso Type</em>}</li>
 *   <li>{@link org.xtext.dsl.dxl.dxlDsl.Association#getModuleType <em>Module Type</em>}</li>
 *   <li>{@link org.xtext.dsl.dxl.dxlDsl.Association#getClassType <em>Class Type</em>}</li>
 *   <li>{@link org.xtext.dsl.dxl.dxlDsl.Association#getAssoDescription <em>Asso Description</em>}</li>
 * </ul>
 *
 * @see org.xtext.dsl.dxl.dxlDsl.DxlDslPackage#getAssociation()
 * @model
 * @generated
 */
public interface Association extends EObject
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
	 * @see org.xtext.dsl.dxl.dxlDsl.DxlDslPackage#getAssociation_Name()
	 * @model
	 * @generated
	 */
  String getName();

  /**
	 * Sets the value of the '{@link org.xtext.dsl.dxl.dxlDsl.Association#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
  void setName(String value);

  /**
	 * Returns the value of the '<em><b>Asso Type</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Asso Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Asso Type</em>' reference.
	 * @see #setAssoType(AssociationType)
	 * @see org.xtext.dsl.dxl.dxlDsl.DxlDslPackage#getAssociation_AssoType()
	 * @model
	 * @generated
	 */
  AssociationType getAssoType();

  /**
	 * Sets the value of the '{@link org.xtext.dsl.dxl.dxlDsl.Association#getAssoType <em>Asso Type</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Asso Type</em>' reference.
	 * @see #getAssoType()
	 * @generated
	 */
  void setAssoType(AssociationType value);

  /**
	 * Returns the value of the '<em><b>Module Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Module Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Module Type</em>' attribute.
	 * @see #setModuleType(String)
	 * @see org.xtext.dsl.dxl.dxlDsl.DxlDslPackage#getAssociation_ModuleType()
	 * @model
	 * @generated
	 */
  String getModuleType();

  /**
	 * Sets the value of the '{@link org.xtext.dsl.dxl.dxlDsl.Association#getModuleType <em>Module Type</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module Type</em>' attribute.
	 * @see #getModuleType()
	 * @generated
	 */
  void setModuleType(String value);

  /**
	 * Returns the value of the '<em><b>Class Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Class Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Type</em>' attribute.
	 * @see #setClassType(String)
	 * @see org.xtext.dsl.dxl.dxlDsl.DxlDslPackage#getAssociation_ClassType()
	 * @model
	 * @generated
	 */
  String getClassType();

  /**
	 * Sets the value of the '{@link org.xtext.dsl.dxl.dxlDsl.Association#getClassType <em>Class Type</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Type</em>' attribute.
	 * @see #getClassType()
	 * @generated
	 */
  void setClassType(String value);

  /**
	 * Returns the value of the '<em><b>Asso Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Asso Description</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Asso Description</em>' attribute.
	 * @see #setAssoDescription(String)
	 * @see org.xtext.dsl.dxl.dxlDsl.DxlDslPackage#getAssociation_AssoDescription()
	 * @model
	 * @generated
	 */
  String getAssoDescription();

  /**
	 * Sets the value of the '{@link org.xtext.dsl.dxl.dxlDsl.Association#getAssoDescription <em>Asso Description</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Asso Description</em>' attribute.
	 * @see #getAssoDescription()
	 * @generated
	 */
  void setAssoDescription(String value);

} // Association
