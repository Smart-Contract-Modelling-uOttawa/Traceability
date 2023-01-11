/**
 */
package org.xtext.dsl.dxl.dxlDsl.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.dsl.dxl.dxlDsl.Association;
import org.xtext.dsl.dxl.dxlDsl.AssociationType;
import org.xtext.dsl.dxl.dxlDsl.Attribute;
import org.xtext.dsl.dxl.dxlDsl.DxlDslFactory;
import org.xtext.dsl.dxl.dxlDsl.DxlDslPackage;
import org.xtext.dsl.dxl.dxlDsl.Folder;
import org.xtext.dsl.dxl.dxlDsl.Model;
import org.xtext.dsl.dxl.dxlDsl.Module;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DxlDslFactoryImpl extends EFactoryImpl implements DxlDslFactory
{
  /**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static DxlDslFactory init()
  {
		try {
			DxlDslFactory theDxlDslFactory = (DxlDslFactory)EPackage.Registry.INSTANCE.getEFactory(DxlDslPackage.eNS_URI);
			if (theDxlDslFactory != null) {
				return theDxlDslFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DxlDslFactoryImpl();
	}

  /**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public DxlDslFactoryImpl()
  {
		super();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public EObject create(EClass eClass)
  {
		switch (eClass.getClassifierID()) {
			case DxlDslPackage.MODEL: return createModel();
			case DxlDslPackage.FOLDER: return createFolder();
			case DxlDslPackage.MODULE: return createModule();
			case DxlDslPackage.CLASS: return createClass();
			case DxlDslPackage.ATTRIBUTE: return createAttribute();
			case DxlDslPackage.ASSOCIATION_TYPE: return createAssociationType();
			case DxlDslPackage.ASSOCIATION: return createAssociation();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Model createModel()
  {
		ModelImpl model = new ModelImpl();
		return model;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Folder createFolder()
  {
		FolderImpl folder = new FolderImpl();
		return folder;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Module createModule()
  {
		ModuleImpl module = new ModuleImpl();
		return module;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public org.xtext.dsl.dxl.dxlDsl.Class createClass()
  {
		ClassImpl class_ = new ClassImpl();
		return class_;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Attribute createAttribute()
  {
		AttributeImpl attribute = new AttributeImpl();
		return attribute;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public AssociationType createAssociationType()
  {
		AssociationTypeImpl associationType = new AssociationTypeImpl();
		return associationType;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Association createAssociation()
  {
		AssociationImpl association = new AssociationImpl();
		return association;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public DxlDslPackage getDxlDslPackage()
  {
		return (DxlDslPackage)getEPackage();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
  @Deprecated
  public static DxlDslPackage getPackage()
  {
		return DxlDslPackage.eINSTANCE;
	}

} //DxlDslFactoryImpl
