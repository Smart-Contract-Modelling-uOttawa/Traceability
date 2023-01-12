/**
 */
package org.xtext.dsl.dxl.dxlDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.dsl.dxl.dxlDsl.DxlDslPackage;
import org.xtext.dsl.dxl.dxlDsl.Module;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.dsl.dxl.dxlDsl.impl.ModuleImpl#isIgnoreInReport <em>Ignore In Report</em>}</li>
 *   <li>{@link org.xtext.dsl.dxl.dxlDsl.impl.ModuleImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.dsl.dxl.dxlDsl.impl.ModuleImpl#getFileName <em>File Name</em>}</li>
 *   <li>{@link org.xtext.dsl.dxl.dxlDsl.impl.ModuleImpl#getClasses <em>Classes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModuleImpl extends MinimalEObjectImpl.Container implements Module
{
  /**
	 * The default value of the '{@link #isIgnoreInReport() <em>Ignore In Report</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #isIgnoreInReport()
	 * @generated
	 * @ordered
	 */
  protected static final boolean IGNORE_IN_REPORT_EDEFAULT = false;

  /**
	 * The cached value of the '{@link #isIgnoreInReport() <em>Ignore In Report</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #isIgnoreInReport()
	 * @generated
	 * @ordered
	 */
  protected boolean ignoreInReport = IGNORE_IN_REPORT_EDEFAULT;

  /**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
  protected static final String NAME_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
  protected String name = NAME_EDEFAULT;

  /**
	 * The default value of the '{@link #getFileName() <em>File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getFileName()
	 * @generated
	 * @ordered
	 */
  protected static final String FILE_NAME_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getFileName() <em>File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getFileName()
	 * @generated
	 * @ordered
	 */
  protected String fileName = FILE_NAME_EDEFAULT;

  /**
	 * The cached value of the '{@link #getClasses() <em>Classes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getClasses()
	 * @generated
	 * @ordered
	 */
  protected EList<org.xtext.dsl.dxl.dxlDsl.Class> classes;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected ModuleImpl()
  {
		super();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected EClass eStaticClass()
  {
		return DxlDslPackage.Literals.MODULE;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean isIgnoreInReport()
  {
		return ignoreInReport;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setIgnoreInReport(boolean newIgnoreInReport)
  {
		boolean oldIgnoreInReport = ignoreInReport;
		ignoreInReport = newIgnoreInReport;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DxlDslPackage.MODULE__IGNORE_IN_REPORT, oldIgnoreInReport, ignoreInReport));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getName()
  {
		return name;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setName(String newName)
  {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DxlDslPackage.MODULE__NAME, oldName, name));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getFileName()
  {
		return fileName;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setFileName(String newFileName)
  {
		String oldFileName = fileName;
		fileName = newFileName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DxlDslPackage.MODULE__FILE_NAME, oldFileName, fileName));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<org.xtext.dsl.dxl.dxlDsl.Class> getClasses()
  {
		if (classes == null) {
			classes = new EObjectContainmentEList<org.xtext.dsl.dxl.dxlDsl.Class>(org.xtext.dsl.dxl.dxlDsl.Class.class, this, DxlDslPackage.MODULE__CLASSES);
		}
		return classes;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
		switch (featureID) {
			case DxlDslPackage.MODULE__CLASSES:
				return ((InternalEList<?>)getClasses()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
		switch (featureID) {
			case DxlDslPackage.MODULE__IGNORE_IN_REPORT:
				return isIgnoreInReport();
			case DxlDslPackage.MODULE__NAME:
				return getName();
			case DxlDslPackage.MODULE__FILE_NAME:
				return getFileName();
			case DxlDslPackage.MODULE__CLASSES:
				return getClasses();
		}
		return super.eGet(featureID, resolve, coreType);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
		switch (featureID) {
			case DxlDslPackage.MODULE__IGNORE_IN_REPORT:
				setIgnoreInReport((Boolean)newValue);
				return;
			case DxlDslPackage.MODULE__NAME:
				setName((String)newValue);
				return;
			case DxlDslPackage.MODULE__FILE_NAME:
				setFileName((String)newValue);
				return;
			case DxlDslPackage.MODULE__CLASSES:
				getClasses().clear();
				getClasses().addAll((Collection<? extends org.xtext.dsl.dxl.dxlDsl.Class>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public void eUnset(int featureID)
  {
		switch (featureID) {
			case DxlDslPackage.MODULE__IGNORE_IN_REPORT:
				setIgnoreInReport(IGNORE_IN_REPORT_EDEFAULT);
				return;
			case DxlDslPackage.MODULE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DxlDslPackage.MODULE__FILE_NAME:
				setFileName(FILE_NAME_EDEFAULT);
				return;
			case DxlDslPackage.MODULE__CLASSES:
				getClasses().clear();
				return;
		}
		super.eUnset(featureID);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public boolean eIsSet(int featureID)
  {
		switch (featureID) {
			case DxlDslPackage.MODULE__IGNORE_IN_REPORT:
				return ignoreInReport != IGNORE_IN_REPORT_EDEFAULT;
			case DxlDslPackage.MODULE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DxlDslPackage.MODULE__FILE_NAME:
				return FILE_NAME_EDEFAULT == null ? fileName != null : !FILE_NAME_EDEFAULT.equals(fileName);
			case DxlDslPackage.MODULE__CLASSES:
				return classes != null && !classes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public String toString()
  {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (ignoreInReport: ");
		result.append(ignoreInReport);
		result.append(", name: ");
		result.append(name);
		result.append(", fileName: ");
		result.append(fileName);
		result.append(')');
		return result.toString();
	}

} //ModuleImpl
