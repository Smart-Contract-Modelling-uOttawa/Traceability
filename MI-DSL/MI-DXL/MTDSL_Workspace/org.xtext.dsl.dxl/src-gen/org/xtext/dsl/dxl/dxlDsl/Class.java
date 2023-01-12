/**
 */
package org.xtext.dsl.dxl.dxlDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.dsl.dxl.dxlDsl.Class#isNoDescription <em>No Description</em>}</li>
 *   <li>{@link org.xtext.dsl.dxl.dxlDsl.Class#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.dsl.dxl.dxlDsl.Class#getClassTypeDescription <em>Class Type Description</em>}</li>
 *   <li>{@link org.xtext.dsl.dxl.dxlDsl.Class#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link org.xtext.dsl.dxl.dxlDsl.Class#getAssociations <em>Associations</em>}</li>
 * </ul>
 *
 * @see org.xtext.dsl.dxl.dxlDsl.DxlDslPackage#getClass_()
 * @model
 * @generated
 */
public interface Class extends EObject
{
  /**
	 * Returns the value of the '<em><b>No Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>No Description</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>No Description</em>' attribute.
	 * @see #setNoDescription(boolean)
	 * @see org.xtext.dsl.dxl.dxlDsl.DxlDslPackage#getClass_NoDescription()
	 * @model
	 * @generated
	 */
  boolean isNoDescription();

  /**
	 * Sets the value of the '{@link org.xtext.dsl.dxl.dxlDsl.Class#isNoDescription <em>No Description</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>No Description</em>' attribute.
	 * @see #isNoDescription()
	 * @generated
	 */
  void setNoDescription(boolean value);

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
	 * @see org.xtext.dsl.dxl.dxlDsl.DxlDslPackage#getClass_Name()
	 * @model
	 * @generated
	 */
  String getName();

  /**
	 * Sets the value of the '{@link org.xtext.dsl.dxl.dxlDsl.Class#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
  void setName(String value);

  /**
	 * Returns the value of the '<em><b>Class Type Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Class Type Description</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Type Description</em>' attribute.
	 * @see #setClassTypeDescription(String)
	 * @see org.xtext.dsl.dxl.dxlDsl.DxlDslPackage#getClass_ClassTypeDescription()
	 * @model
	 * @generated
	 */
  String getClassTypeDescription();

  /**
	 * Sets the value of the '{@link org.xtext.dsl.dxl.dxlDsl.Class#getClassTypeDescription <em>Class Type Description</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Type Description</em>' attribute.
	 * @see #getClassTypeDescription()
	 * @generated
	 */
  void setClassTypeDescription(String value);

  /**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link org.xtext.dsl.dxl.dxlDsl.Attribute}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see org.xtext.dsl.dxl.dxlDsl.DxlDslPackage#getClass_Attributes()
	 * @model containment="true"
	 * @generated
	 */
  EList<Attribute> getAttributes();

  /**
	 * Returns the value of the '<em><b>Associations</b></em>' containment reference list.
	 * The list contents are of type {@link org.xtext.dsl.dxl.dxlDsl.Association}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Associations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Associations</em>' containment reference list.
	 * @see org.xtext.dsl.dxl.dxlDsl.DxlDslPackage#getClass_Associations()
	 * @model containment="true"
	 * @generated
	 */
  EList<Association> getAssociations();

} // Class
