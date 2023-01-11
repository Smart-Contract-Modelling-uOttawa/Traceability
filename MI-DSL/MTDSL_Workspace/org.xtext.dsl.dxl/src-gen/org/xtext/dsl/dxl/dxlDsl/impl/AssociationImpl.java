/**
 */
package org.xtext.dsl.dxl.dxlDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.dsl.dxl.dxlDsl.Association;
import org.xtext.dsl.dxl.dxlDsl.AssociationType;
import org.xtext.dsl.dxl.dxlDsl.DxlDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.dsl.dxl.dxlDsl.impl.AssociationImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.dsl.dxl.dxlDsl.impl.AssociationImpl#getAssoType <em>Asso Type</em>}</li>
 *   <li>{@link org.xtext.dsl.dxl.dxlDsl.impl.AssociationImpl#getModuleType <em>Module Type</em>}</li>
 *   <li>{@link org.xtext.dsl.dxl.dxlDsl.impl.AssociationImpl#getClassType <em>Class Type</em>}</li>
 *   <li>{@link org.xtext.dsl.dxl.dxlDsl.impl.AssociationImpl#getAssoDescription <em>Asso Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssociationImpl extends MinimalEObjectImpl.Container implements Association
{
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
	 * The cached value of the '{@link #getAssoType() <em>Asso Type</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getAssoType()
	 * @generated
	 * @ordered
	 */
  protected AssociationType assoType;

  /**
	 * The default value of the '{@link #getModuleType() <em>Module Type</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getModuleType()
	 * @generated
	 * @ordered
	 */
  protected static final String MODULE_TYPE_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getModuleType() <em>Module Type</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getModuleType()
	 * @generated
	 * @ordered
	 */
  protected String moduleType = MODULE_TYPE_EDEFAULT;

  /**
	 * The default value of the '{@link #getClassType() <em>Class Type</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getClassType()
	 * @generated
	 * @ordered
	 */
  protected static final String CLASS_TYPE_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getClassType() <em>Class Type</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getClassType()
	 * @generated
	 * @ordered
	 */
  protected String classType = CLASS_TYPE_EDEFAULT;

  /**
	 * The default value of the '{@link #getAssoDescription() <em>Asso Description</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getAssoDescription()
	 * @generated
	 * @ordered
	 */
  protected static final String ASSO_DESCRIPTION_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getAssoDescription() <em>Asso Description</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getAssoDescription()
	 * @generated
	 * @ordered
	 */
  protected String assoDescription = ASSO_DESCRIPTION_EDEFAULT;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected AssociationImpl()
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
		return DxlDslPackage.Literals.ASSOCIATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DxlDslPackage.ASSOCIATION__NAME, oldName, name));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public AssociationType getAssoType()
  {
		if (assoType != null && assoType.eIsProxy()) {
			InternalEObject oldAssoType = (InternalEObject)assoType;
			assoType = (AssociationType)eResolveProxy(oldAssoType);
			if (assoType != oldAssoType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DxlDslPackage.ASSOCIATION__ASSO_TYPE, oldAssoType, assoType));
			}
		}
		return assoType;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public AssociationType basicGetAssoType()
  {
		return assoType;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setAssoType(AssociationType newAssoType)
  {
		AssociationType oldAssoType = assoType;
		assoType = newAssoType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DxlDslPackage.ASSOCIATION__ASSO_TYPE, oldAssoType, assoType));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getModuleType()
  {
		return moduleType;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setModuleType(String newModuleType)
  {
		String oldModuleType = moduleType;
		moduleType = newModuleType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DxlDslPackage.ASSOCIATION__MODULE_TYPE, oldModuleType, moduleType));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getClassType()
  {
		return classType;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setClassType(String newClassType)
  {
		String oldClassType = classType;
		classType = newClassType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DxlDslPackage.ASSOCIATION__CLASS_TYPE, oldClassType, classType));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getAssoDescription()
  {
		return assoDescription;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setAssoDescription(String newAssoDescription)
  {
		String oldAssoDescription = assoDescription;
		assoDescription = newAssoDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DxlDslPackage.ASSOCIATION__ASSO_DESCRIPTION, oldAssoDescription, assoDescription));
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
			case DxlDslPackage.ASSOCIATION__NAME:
				return getName();
			case DxlDslPackage.ASSOCIATION__ASSO_TYPE:
				if (resolve) return getAssoType();
				return basicGetAssoType();
			case DxlDslPackage.ASSOCIATION__MODULE_TYPE:
				return getModuleType();
			case DxlDslPackage.ASSOCIATION__CLASS_TYPE:
				return getClassType();
			case DxlDslPackage.ASSOCIATION__ASSO_DESCRIPTION:
				return getAssoDescription();
		}
		return super.eGet(featureID, resolve, coreType);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public void eSet(int featureID, Object newValue)
  {
		switch (featureID) {
			case DxlDslPackage.ASSOCIATION__NAME:
				setName((String)newValue);
				return;
			case DxlDslPackage.ASSOCIATION__ASSO_TYPE:
				setAssoType((AssociationType)newValue);
				return;
			case DxlDslPackage.ASSOCIATION__MODULE_TYPE:
				setModuleType((String)newValue);
				return;
			case DxlDslPackage.ASSOCIATION__CLASS_TYPE:
				setClassType((String)newValue);
				return;
			case DxlDslPackage.ASSOCIATION__ASSO_DESCRIPTION:
				setAssoDescription((String)newValue);
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
			case DxlDslPackage.ASSOCIATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DxlDslPackage.ASSOCIATION__ASSO_TYPE:
				setAssoType((AssociationType)null);
				return;
			case DxlDslPackage.ASSOCIATION__MODULE_TYPE:
				setModuleType(MODULE_TYPE_EDEFAULT);
				return;
			case DxlDslPackage.ASSOCIATION__CLASS_TYPE:
				setClassType(CLASS_TYPE_EDEFAULT);
				return;
			case DxlDslPackage.ASSOCIATION__ASSO_DESCRIPTION:
				setAssoDescription(ASSO_DESCRIPTION_EDEFAULT);
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
			case DxlDslPackage.ASSOCIATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DxlDslPackage.ASSOCIATION__ASSO_TYPE:
				return assoType != null;
			case DxlDslPackage.ASSOCIATION__MODULE_TYPE:
				return MODULE_TYPE_EDEFAULT == null ? moduleType != null : !MODULE_TYPE_EDEFAULT.equals(moduleType);
			case DxlDslPackage.ASSOCIATION__CLASS_TYPE:
				return CLASS_TYPE_EDEFAULT == null ? classType != null : !CLASS_TYPE_EDEFAULT.equals(classType);
			case DxlDslPackage.ASSOCIATION__ASSO_DESCRIPTION:
				return ASSO_DESCRIPTION_EDEFAULT == null ? assoDescription != null : !ASSO_DESCRIPTION_EDEFAULT.equals(assoDescription);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", moduleType: ");
		result.append(moduleType);
		result.append(", classType: ");
		result.append(classType);
		result.append(", assoDescription: ");
		result.append(assoDescription);
		result.append(')');
		return result.toString();
	}

} //AssociationImpl
