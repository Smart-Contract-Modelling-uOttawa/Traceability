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

import org.xtext.dsl.dxl.dxlDsl.Association;
import org.xtext.dsl.dxl.dxlDsl.Attribute;
import org.xtext.dsl.dxl.dxlDsl.DxlDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.dsl.dxl.dxlDsl.impl.ClassImpl#isNoDescription <em>No Description</em>}</li>
 *   <li>{@link org.xtext.dsl.dxl.dxlDsl.impl.ClassImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.dsl.dxl.dxlDsl.impl.ClassImpl#getClassTypeDescription <em>Class Type Description</em>}</li>
 *   <li>{@link org.xtext.dsl.dxl.dxlDsl.impl.ClassImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link org.xtext.dsl.dxl.dxlDsl.impl.ClassImpl#getAssociations <em>Associations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClassImpl extends MinimalEObjectImpl.Container implements org.xtext.dsl.dxl.dxlDsl.Class
{
  /**
	 * The default value of the '{@link #isNoDescription() <em>No Description</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #isNoDescription()
	 * @generated
	 * @ordered
	 */
  protected static final boolean NO_DESCRIPTION_EDEFAULT = false;

  /**
	 * The cached value of the '{@link #isNoDescription() <em>No Description</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #isNoDescription()
	 * @generated
	 * @ordered
	 */
  protected boolean noDescription = NO_DESCRIPTION_EDEFAULT;

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
	 * The default value of the '{@link #getClassTypeDescription() <em>Class Type Description</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getClassTypeDescription()
	 * @generated
	 * @ordered
	 */
  protected static final String CLASS_TYPE_DESCRIPTION_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getClassTypeDescription() <em>Class Type Description</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getClassTypeDescription()
	 * @generated
	 * @ordered
	 */
  protected String classTypeDescription = CLASS_TYPE_DESCRIPTION_EDEFAULT;

  /**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
  protected EList<Attribute> attributes;

  /**
	 * The cached value of the '{@link #getAssociations() <em>Associations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getAssociations()
	 * @generated
	 * @ordered
	 */
  protected EList<Association> associations;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected ClassImpl()
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
		return DxlDslPackage.Literals.CLASS;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean isNoDescription()
  {
		return noDescription;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setNoDescription(boolean newNoDescription)
  {
		boolean oldNoDescription = noDescription;
		noDescription = newNoDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DxlDslPackage.CLASS__NO_DESCRIPTION, oldNoDescription, noDescription));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DxlDslPackage.CLASS__NAME, oldName, name));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getClassTypeDescription()
  {
		return classTypeDescription;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setClassTypeDescription(String newClassTypeDescription)
  {
		String oldClassTypeDescription = classTypeDescription;
		classTypeDescription = newClassTypeDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DxlDslPackage.CLASS__CLASS_TYPE_DESCRIPTION, oldClassTypeDescription, classTypeDescription));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<Attribute> getAttributes()
  {
		if (attributes == null) {
			attributes = new EObjectContainmentEList<Attribute>(Attribute.class, this, DxlDslPackage.CLASS__ATTRIBUTES);
		}
		return attributes;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<Association> getAssociations()
  {
		if (associations == null) {
			associations = new EObjectContainmentEList<Association>(Association.class, this, DxlDslPackage.CLASS__ASSOCIATIONS);
		}
		return associations;
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
			case DxlDslPackage.CLASS__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
			case DxlDslPackage.CLASS__ASSOCIATIONS:
				return ((InternalEList<?>)getAssociations()).basicRemove(otherEnd, msgs);
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
			case DxlDslPackage.CLASS__NO_DESCRIPTION:
				return isNoDescription();
			case DxlDslPackage.CLASS__NAME:
				return getName();
			case DxlDslPackage.CLASS__CLASS_TYPE_DESCRIPTION:
				return getClassTypeDescription();
			case DxlDslPackage.CLASS__ATTRIBUTES:
				return getAttributes();
			case DxlDslPackage.CLASS__ASSOCIATIONS:
				return getAssociations();
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
			case DxlDslPackage.CLASS__NO_DESCRIPTION:
				setNoDescription((Boolean)newValue);
				return;
			case DxlDslPackage.CLASS__NAME:
				setName((String)newValue);
				return;
			case DxlDslPackage.CLASS__CLASS_TYPE_DESCRIPTION:
				setClassTypeDescription((String)newValue);
				return;
			case DxlDslPackage.CLASS__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends Attribute>)newValue);
				return;
			case DxlDslPackage.CLASS__ASSOCIATIONS:
				getAssociations().clear();
				getAssociations().addAll((Collection<? extends Association>)newValue);
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
			case DxlDslPackage.CLASS__NO_DESCRIPTION:
				setNoDescription(NO_DESCRIPTION_EDEFAULT);
				return;
			case DxlDslPackage.CLASS__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DxlDslPackage.CLASS__CLASS_TYPE_DESCRIPTION:
				setClassTypeDescription(CLASS_TYPE_DESCRIPTION_EDEFAULT);
				return;
			case DxlDslPackage.CLASS__ATTRIBUTES:
				getAttributes().clear();
				return;
			case DxlDslPackage.CLASS__ASSOCIATIONS:
				getAssociations().clear();
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
			case DxlDslPackage.CLASS__NO_DESCRIPTION:
				return noDescription != NO_DESCRIPTION_EDEFAULT;
			case DxlDslPackage.CLASS__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DxlDslPackage.CLASS__CLASS_TYPE_DESCRIPTION:
				return CLASS_TYPE_DESCRIPTION_EDEFAULT == null ? classTypeDescription != null : !CLASS_TYPE_DESCRIPTION_EDEFAULT.equals(classTypeDescription);
			case DxlDslPackage.CLASS__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
			case DxlDslPackage.CLASS__ASSOCIATIONS:
				return associations != null && !associations.isEmpty();
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
		result.append(" (noDescription: ");
		result.append(noDescription);
		result.append(", name: ");
		result.append(name);
		result.append(", classTypeDescription: ");
		result.append(classTypeDescription);
		result.append(')');
		return result.toString();
	}

} //ClassImpl
