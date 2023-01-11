/**
 */
package org.xtext.dsl.dxl.dxlDsl.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.xtext.dsl.dxl.dxlDsl.Association;
import org.xtext.dsl.dxl.dxlDsl.AssociationType;
import org.xtext.dsl.dxl.dxlDsl.Attribute;
import org.xtext.dsl.dxl.dxlDsl.DxlDslPackage;
import org.xtext.dsl.dxl.dxlDsl.Folder;
import org.xtext.dsl.dxl.dxlDsl.Model;
import org.xtext.dsl.dxl.dxlDsl.Module;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.dsl.dxl.dxlDsl.DxlDslPackage
 * @generated
 */
public class DxlDslAdapterFactory extends AdapterFactoryImpl
{
  /**
	 * The cached model package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected static DxlDslPackage modelPackage;

  /**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public DxlDslAdapterFactory()
  {
		if (modelPackage == null) {
			modelPackage = DxlDslPackage.eINSTANCE;
		}
	}

  /**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
  @Override
  public boolean isFactoryForType(Object object)
  {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

  /**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected DxlDslSwitch<Adapter> modelSwitch =
    new DxlDslSwitch<Adapter>() {
			@Override
			public Adapter caseModel(Model object) {
				return createModelAdapter();
			}
			@Override
			public Adapter caseFolder(Folder object) {
				return createFolderAdapter();
			}
			@Override
			public Adapter caseModule(Module object) {
				return createModuleAdapter();
			}
			@Override
			public Adapter caseClass(org.xtext.dsl.dxl.dxlDsl.Class object) {
				return createClassAdapter();
			}
			@Override
			public Adapter caseAttribute(Attribute object) {
				return createAttributeAdapter();
			}
			@Override
			public Adapter caseAssociationType(AssociationType object) {
				return createAssociationTypeAdapter();
			}
			@Override
			public Adapter caseAssociation(Association object) {
				return createAssociationAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

  /**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
  @Override
  public Adapter createAdapter(Notifier target)
  {
		return modelSwitch.doSwitch((EObject)target);
	}


  /**
	 * Creates a new adapter for an object of class '{@link org.xtext.dsl.dxl.dxlDsl.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.dsl.dxl.dxlDsl.Model
	 * @generated
	 */
  public Adapter createModelAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.xtext.dsl.dxl.dxlDsl.Folder <em>Folder</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.dsl.dxl.dxlDsl.Folder
	 * @generated
	 */
  public Adapter createFolderAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.xtext.dsl.dxl.dxlDsl.Module <em>Module</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.dsl.dxl.dxlDsl.Module
	 * @generated
	 */
  public Adapter createModuleAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.xtext.dsl.dxl.dxlDsl.Class <em>Class</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.dsl.dxl.dxlDsl.Class
	 * @generated
	 */
  public Adapter createClassAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.xtext.dsl.dxl.dxlDsl.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.dsl.dxl.dxlDsl.Attribute
	 * @generated
	 */
  public Adapter createAttributeAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.xtext.dsl.dxl.dxlDsl.AssociationType <em>Association Type</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.dsl.dxl.dxlDsl.AssociationType
	 * @generated
	 */
  public Adapter createAssociationTypeAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.xtext.dsl.dxl.dxlDsl.Association <em>Association</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.dsl.dxl.dxlDsl.Association
	 * @generated
	 */
  public Adapter createAssociationAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
  public Adapter createEObjectAdapter()
  {
		return null;
	}

} //DxlDslAdapterFactory
