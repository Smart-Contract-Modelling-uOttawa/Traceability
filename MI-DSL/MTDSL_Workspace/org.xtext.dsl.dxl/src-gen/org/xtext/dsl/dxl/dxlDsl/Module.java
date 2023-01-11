/**
 */
package org.xtext.dsl.dxl.dxlDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.dsl.dxl.dxlDsl.Module#isIgnoreInReport <em>Ignore In Report</em>}</li>
 *   <li>{@link org.xtext.dsl.dxl.dxlDsl.Module#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.dsl.dxl.dxlDsl.Module#getFileName <em>File Name</em>}</li>
 *   <li>{@link org.xtext.dsl.dxl.dxlDsl.Module#getClasses <em>Classes</em>}</li>
 * </ul>
 *
 * @see org.xtext.dsl.dxl.dxlDsl.DxlDslPackage#getModule()
 * @model
 * @generated
 */
public interface Module extends EObject
{
  /**
	 * Returns the value of the '<em><b>Ignore In Report</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ignore In Report</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Ignore In Report</em>' attribute.
	 * @see #setIgnoreInReport(boolean)
	 * @see org.xtext.dsl.dxl.dxlDsl.DxlDslPackage#getModule_IgnoreInReport()
	 * @model
	 * @generated
	 */
  boolean isIgnoreInReport();

  /**
	 * Sets the value of the '{@link org.xtext.dsl.dxl.dxlDsl.Module#isIgnoreInReport <em>Ignore In Report</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ignore In Report</em>' attribute.
	 * @see #isIgnoreInReport()
	 * @generated
	 */
  void setIgnoreInReport(boolean value);

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
	 * @see org.xtext.dsl.dxl.dxlDsl.DxlDslPackage#getModule_Name()
	 * @model
	 * @generated
	 */
  String getName();

  /**
	 * Sets the value of the '{@link org.xtext.dsl.dxl.dxlDsl.Module#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
  void setName(String value);

  /**
	 * Returns the value of the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>File Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>File Name</em>' attribute.
	 * @see #setFileName(String)
	 * @see org.xtext.dsl.dxl.dxlDsl.DxlDslPackage#getModule_FileName()
	 * @model
	 * @generated
	 */
  String getFileName();

  /**
	 * Sets the value of the '{@link org.xtext.dsl.dxl.dxlDsl.Module#getFileName <em>File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Name</em>' attribute.
	 * @see #getFileName()
	 * @generated
	 */
  void setFileName(String value);

  /**
	 * Returns the value of the '<em><b>Classes</b></em>' containment reference list.
	 * The list contents are of type {@link org.xtext.dsl.dxl.dxlDsl.Class}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Classes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Classes</em>' containment reference list.
	 * @see org.xtext.dsl.dxl.dxlDsl.DxlDslPackage#getModule_Classes()
	 * @model containment="true"
	 * @generated
	 */
  EList<org.xtext.dsl.dxl.dxlDsl.Class> getClasses();

} // Module
