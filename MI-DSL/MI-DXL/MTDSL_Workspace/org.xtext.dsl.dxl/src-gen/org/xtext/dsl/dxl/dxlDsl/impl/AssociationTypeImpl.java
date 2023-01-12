/**
 */
package org.xtext.dsl.dxl.dxlDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.dsl.dxl.dxlDsl.AssociationType;
import org.xtext.dsl.dxl.dxlDsl.DxlDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Association Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.dsl.dxl.dxlDsl.impl.AssociationTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.dsl.dxl.dxlDsl.impl.AssociationTypeImpl#getLinkFileName <em>Link File Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssociationTypeImpl extends MinimalEObjectImpl.Container implements AssociationType
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
	 * The default value of the '{@link #getLinkFileName() <em>Link File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getLinkFileName()
	 * @generated
	 * @ordered
	 */
  protected static final String LINK_FILE_NAME_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getLinkFileName() <em>Link File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getLinkFileName()
	 * @generated
	 * @ordered
	 */
  protected String linkFileName = LINK_FILE_NAME_EDEFAULT;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected AssociationTypeImpl()
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
		return DxlDslPackage.Literals.ASSOCIATION_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DxlDslPackage.ASSOCIATION_TYPE__NAME, oldName, name));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getLinkFileName()
  {
		return linkFileName;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setLinkFileName(String newLinkFileName)
  {
		String oldLinkFileName = linkFileName;
		linkFileName = newLinkFileName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DxlDslPackage.ASSOCIATION_TYPE__LINK_FILE_NAME, oldLinkFileName, linkFileName));
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
			case DxlDslPackage.ASSOCIATION_TYPE__NAME:
				return getName();
			case DxlDslPackage.ASSOCIATION_TYPE__LINK_FILE_NAME:
				return getLinkFileName();
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
			case DxlDslPackage.ASSOCIATION_TYPE__NAME:
				setName((String)newValue);
				return;
			case DxlDslPackage.ASSOCIATION_TYPE__LINK_FILE_NAME:
				setLinkFileName((String)newValue);
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
			case DxlDslPackage.ASSOCIATION_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DxlDslPackage.ASSOCIATION_TYPE__LINK_FILE_NAME:
				setLinkFileName(LINK_FILE_NAME_EDEFAULT);
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
			case DxlDslPackage.ASSOCIATION_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DxlDslPackage.ASSOCIATION_TYPE__LINK_FILE_NAME:
				return LINK_FILE_NAME_EDEFAULT == null ? linkFileName != null : !LINK_FILE_NAME_EDEFAULT.equals(linkFileName);
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
		result.append(", linkFileName: ");
		result.append(linkFileName);
		result.append(')');
		return result.toString();
	}

} //AssociationTypeImpl
