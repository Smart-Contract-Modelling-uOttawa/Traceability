/**
 */
package org.xtext.dsl.dxl.dxlDsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.dsl.dxl.dxlDsl.DxlDslFactory
 * @model kind="package"
 * @generated
 */
public interface DxlDslPackage extends EPackage
{
  /**
	 * The package name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNAME = "dxlDsl";

  /**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNS_URI = "http://www.xtext.org/dsl/dxl/DxlDsl";

  /**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNS_PREFIX = "dxlDsl";

  /**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  DxlDslPackage eINSTANCE = org.xtext.dsl.dxl.dxlDsl.impl.DxlDslPackageImpl.init();

  /**
	 * The meta object id for the '{@link org.xtext.dsl.dxl.dxlDsl.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.xtext.dsl.dxl.dxlDsl.impl.ModelImpl
	 * @see org.xtext.dsl.dxl.dxlDsl.impl.DxlDslPackageImpl#getModel()
	 * @generated
	 */
  int MODEL = 0;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MODEL__NAME = 0;

  /**
	 * The feature id for the '<em><b>Folders</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MODEL__FOLDERS = 1;

  /**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MODEL_FEATURE_COUNT = 2;

  /**
	 * The meta object id for the '{@link org.xtext.dsl.dxl.dxlDsl.impl.FolderImpl <em>Folder</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.xtext.dsl.dxl.dxlDsl.impl.FolderImpl
	 * @see org.xtext.dsl.dxl.dxlDsl.impl.DxlDslPackageImpl#getFolder()
	 * @generated
	 */
  int FOLDER = 1;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int FOLDER__NAME = 0;

  /**
	 * The feature id for the '<em><b>Module</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int FOLDER__MODULE = 1;

  /**
	 * The feature id for the '<em><b>Association Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int FOLDER__ASSOCIATION_TYPE = 2;

  /**
	 * The number of structural features of the '<em>Folder</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int FOLDER_FEATURE_COUNT = 3;

  /**
	 * The meta object id for the '{@link org.xtext.dsl.dxl.dxlDsl.impl.ModuleImpl <em>Module</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.xtext.dsl.dxl.dxlDsl.impl.ModuleImpl
	 * @see org.xtext.dsl.dxl.dxlDsl.impl.DxlDslPackageImpl#getModule()
	 * @generated
	 */
  int MODULE = 2;

  /**
	 * The feature id for the '<em><b>Ignore In Report</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MODULE__IGNORE_IN_REPORT = 0;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MODULE__NAME = 1;

  /**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MODULE__FILE_NAME = 2;

  /**
	 * The feature id for the '<em><b>Classes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MODULE__CLASSES = 3;

  /**
	 * The number of structural features of the '<em>Module</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MODULE_FEATURE_COUNT = 4;

  /**
	 * The meta object id for the '{@link org.xtext.dsl.dxl.dxlDsl.impl.ClassImpl <em>Class</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.xtext.dsl.dxl.dxlDsl.impl.ClassImpl
	 * @see org.xtext.dsl.dxl.dxlDsl.impl.DxlDslPackageImpl#getClass_()
	 * @generated
	 */
  int CLASS = 3;

  /**
	 * The feature id for the '<em><b>No Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CLASS__NO_DESCRIPTION = 0;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CLASS__NAME = 1;

  /**
	 * The feature id for the '<em><b>Class Type Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CLASS__CLASS_TYPE_DESCRIPTION = 2;

  /**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CLASS__ATTRIBUTES = 3;

  /**
	 * The feature id for the '<em><b>Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CLASS__ASSOCIATIONS = 4;

  /**
	 * The number of structural features of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CLASS_FEATURE_COUNT = 5;

  /**
	 * The meta object id for the '{@link org.xtext.dsl.dxl.dxlDsl.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.xtext.dsl.dxl.dxlDsl.impl.AttributeImpl
	 * @see org.xtext.dsl.dxl.dxlDsl.impl.DxlDslPackageImpl#getAttribute()
	 * @generated
	 */
  int ATTRIBUTE = 4;

  /**
	 * The feature id for the '<em><b>Ignored</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ATTRIBUTE__IGNORED = 0;

  /**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ATTRIBUTE__TYPE = 1;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ATTRIBUTE__NAME = 2;

  /**
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ATTRIBUTE__DEFAULT = 3;

  /**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ATTRIBUTE_FEATURE_COUNT = 4;

  /**
	 * The meta object id for the '{@link org.xtext.dsl.dxl.dxlDsl.impl.AssociationTypeImpl <em>Association Type</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.xtext.dsl.dxl.dxlDsl.impl.AssociationTypeImpl
	 * @see org.xtext.dsl.dxl.dxlDsl.impl.DxlDslPackageImpl#getAssociationType()
	 * @generated
	 */
  int ASSOCIATION_TYPE = 5;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ASSOCIATION_TYPE__NAME = 0;

  /**
	 * The feature id for the '<em><b>Link File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ASSOCIATION_TYPE__LINK_FILE_NAME = 1;

  /**
	 * The number of structural features of the '<em>Association Type</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ASSOCIATION_TYPE_FEATURE_COUNT = 2;

  /**
	 * The meta object id for the '{@link org.xtext.dsl.dxl.dxlDsl.impl.AssociationImpl <em>Association</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.xtext.dsl.dxl.dxlDsl.impl.AssociationImpl
	 * @see org.xtext.dsl.dxl.dxlDsl.impl.DxlDslPackageImpl#getAssociation()
	 * @generated
	 */
  int ASSOCIATION = 6;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ASSOCIATION__NAME = 0;

  /**
	 * The feature id for the '<em><b>Asso Type</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ASSOCIATION__ASSO_TYPE = 1;

  /**
	 * The feature id for the '<em><b>Module Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ASSOCIATION__MODULE_TYPE = 2;

  /**
	 * The feature id for the '<em><b>Class Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ASSOCIATION__CLASS_TYPE = 3;

  /**
	 * The feature id for the '<em><b>Asso Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ASSOCIATION__ASSO_DESCRIPTION = 4;

  /**
	 * The number of structural features of the '<em>Association</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ASSOCIATION_FEATURE_COUNT = 5;


  /**
	 * Returns the meta object for class '{@link org.xtext.dsl.dxl.dxlDsl.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see org.xtext.dsl.dxl.dxlDsl.Model
	 * @generated
	 */
  EClass getModel();

  /**
	 * Returns the meta object for the attribute '{@link org.xtext.dsl.dxl.dxlDsl.Model#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.xtext.dsl.dxl.dxlDsl.Model#getName()
	 * @see #getModel()
	 * @generated
	 */
  EAttribute getModel_Name();

  /**
	 * Returns the meta object for the containment reference list '{@link org.xtext.dsl.dxl.dxlDsl.Model#getFolders <em>Folders</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Folders</em>'.
	 * @see org.xtext.dsl.dxl.dxlDsl.Model#getFolders()
	 * @see #getModel()
	 * @generated
	 */
  EReference getModel_Folders();

  /**
	 * Returns the meta object for class '{@link org.xtext.dsl.dxl.dxlDsl.Folder <em>Folder</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Folder</em>'.
	 * @see org.xtext.dsl.dxl.dxlDsl.Folder
	 * @generated
	 */
  EClass getFolder();

  /**
	 * Returns the meta object for the attribute '{@link org.xtext.dsl.dxl.dxlDsl.Folder#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.xtext.dsl.dxl.dxlDsl.Folder#getName()
	 * @see #getFolder()
	 * @generated
	 */
  EAttribute getFolder_Name();

  /**
	 * Returns the meta object for the containment reference list '{@link org.xtext.dsl.dxl.dxlDsl.Folder#getModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Module</em>'.
	 * @see org.xtext.dsl.dxl.dxlDsl.Folder#getModule()
	 * @see #getFolder()
	 * @generated
	 */
  EReference getFolder_Module();

  /**
	 * Returns the meta object for the containment reference list '{@link org.xtext.dsl.dxl.dxlDsl.Folder#getAssociationType <em>Association Type</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Association Type</em>'.
	 * @see org.xtext.dsl.dxl.dxlDsl.Folder#getAssociationType()
	 * @see #getFolder()
	 * @generated
	 */
  EReference getFolder_AssociationType();

  /**
	 * Returns the meta object for class '{@link org.xtext.dsl.dxl.dxlDsl.Module <em>Module</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module</em>'.
	 * @see org.xtext.dsl.dxl.dxlDsl.Module
	 * @generated
	 */
  EClass getModule();

  /**
	 * Returns the meta object for the attribute '{@link org.xtext.dsl.dxl.dxlDsl.Module#isIgnoreInReport <em>Ignore In Report</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ignore In Report</em>'.
	 * @see org.xtext.dsl.dxl.dxlDsl.Module#isIgnoreInReport()
	 * @see #getModule()
	 * @generated
	 */
  EAttribute getModule_IgnoreInReport();

  /**
	 * Returns the meta object for the attribute '{@link org.xtext.dsl.dxl.dxlDsl.Module#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.xtext.dsl.dxl.dxlDsl.Module#getName()
	 * @see #getModule()
	 * @generated
	 */
  EAttribute getModule_Name();

  /**
	 * Returns the meta object for the attribute '{@link org.xtext.dsl.dxl.dxlDsl.Module#getFileName <em>File Name</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Name</em>'.
	 * @see org.xtext.dsl.dxl.dxlDsl.Module#getFileName()
	 * @see #getModule()
	 * @generated
	 */
  EAttribute getModule_FileName();

  /**
	 * Returns the meta object for the containment reference list '{@link org.xtext.dsl.dxl.dxlDsl.Module#getClasses <em>Classes</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Classes</em>'.
	 * @see org.xtext.dsl.dxl.dxlDsl.Module#getClasses()
	 * @see #getModule()
	 * @generated
	 */
  EReference getModule_Classes();

  /**
	 * Returns the meta object for class '{@link org.xtext.dsl.dxl.dxlDsl.Class <em>Class</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class</em>'.
	 * @see org.xtext.dsl.dxl.dxlDsl.Class
	 * @generated
	 */
  EClass getClass_();

  /**
	 * Returns the meta object for the attribute '{@link org.xtext.dsl.dxl.dxlDsl.Class#isNoDescription <em>No Description</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>No Description</em>'.
	 * @see org.xtext.dsl.dxl.dxlDsl.Class#isNoDescription()
	 * @see #getClass_()
	 * @generated
	 */
  EAttribute getClass_NoDescription();

  /**
	 * Returns the meta object for the attribute '{@link org.xtext.dsl.dxl.dxlDsl.Class#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.xtext.dsl.dxl.dxlDsl.Class#getName()
	 * @see #getClass_()
	 * @generated
	 */
  EAttribute getClass_Name();

  /**
	 * Returns the meta object for the attribute '{@link org.xtext.dsl.dxl.dxlDsl.Class#getClassTypeDescription <em>Class Type Description</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Type Description</em>'.
	 * @see org.xtext.dsl.dxl.dxlDsl.Class#getClassTypeDescription()
	 * @see #getClass_()
	 * @generated
	 */
  EAttribute getClass_ClassTypeDescription();

  /**
	 * Returns the meta object for the containment reference list '{@link org.xtext.dsl.dxl.dxlDsl.Class#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see org.xtext.dsl.dxl.dxlDsl.Class#getAttributes()
	 * @see #getClass_()
	 * @generated
	 */
  EReference getClass_Attributes();

  /**
	 * Returns the meta object for the containment reference list '{@link org.xtext.dsl.dxl.dxlDsl.Class#getAssociations <em>Associations</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Associations</em>'.
	 * @see org.xtext.dsl.dxl.dxlDsl.Class#getAssociations()
	 * @see #getClass_()
	 * @generated
	 */
  EReference getClass_Associations();

  /**
	 * Returns the meta object for class '{@link org.xtext.dsl.dxl.dxlDsl.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see org.xtext.dsl.dxl.dxlDsl.Attribute
	 * @generated
	 */
  EClass getAttribute();

  /**
	 * Returns the meta object for the attribute '{@link org.xtext.dsl.dxl.dxlDsl.Attribute#isIgnored <em>Ignored</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ignored</em>'.
	 * @see org.xtext.dsl.dxl.dxlDsl.Attribute#isIgnored()
	 * @see #getAttribute()
	 * @generated
	 */
  EAttribute getAttribute_Ignored();

  /**
	 * Returns the meta object for the attribute '{@link org.xtext.dsl.dxl.dxlDsl.Attribute#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.xtext.dsl.dxl.dxlDsl.Attribute#getType()
	 * @see #getAttribute()
	 * @generated
	 */
  EAttribute getAttribute_Type();

  /**
	 * Returns the meta object for the attribute '{@link org.xtext.dsl.dxl.dxlDsl.Attribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.xtext.dsl.dxl.dxlDsl.Attribute#getName()
	 * @see #getAttribute()
	 * @generated
	 */
  EAttribute getAttribute_Name();

  /**
	 * Returns the meta object for the attribute '{@link org.xtext.dsl.dxl.dxlDsl.Attribute#getDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default</em>'.
	 * @see org.xtext.dsl.dxl.dxlDsl.Attribute#getDefault()
	 * @see #getAttribute()
	 * @generated
	 */
  EAttribute getAttribute_Default();

  /**
	 * Returns the meta object for class '{@link org.xtext.dsl.dxl.dxlDsl.AssociationType <em>Association Type</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Association Type</em>'.
	 * @see org.xtext.dsl.dxl.dxlDsl.AssociationType
	 * @generated
	 */
  EClass getAssociationType();

  /**
	 * Returns the meta object for the attribute '{@link org.xtext.dsl.dxl.dxlDsl.AssociationType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.xtext.dsl.dxl.dxlDsl.AssociationType#getName()
	 * @see #getAssociationType()
	 * @generated
	 */
  EAttribute getAssociationType_Name();

  /**
	 * Returns the meta object for the attribute '{@link org.xtext.dsl.dxl.dxlDsl.AssociationType#getLinkFileName <em>Link File Name</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Link File Name</em>'.
	 * @see org.xtext.dsl.dxl.dxlDsl.AssociationType#getLinkFileName()
	 * @see #getAssociationType()
	 * @generated
	 */
  EAttribute getAssociationType_LinkFileName();

  /**
	 * Returns the meta object for class '{@link org.xtext.dsl.dxl.dxlDsl.Association <em>Association</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Association</em>'.
	 * @see org.xtext.dsl.dxl.dxlDsl.Association
	 * @generated
	 */
  EClass getAssociation();

  /**
	 * Returns the meta object for the attribute '{@link org.xtext.dsl.dxl.dxlDsl.Association#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.xtext.dsl.dxl.dxlDsl.Association#getName()
	 * @see #getAssociation()
	 * @generated
	 */
  EAttribute getAssociation_Name();

  /**
	 * Returns the meta object for the reference '{@link org.xtext.dsl.dxl.dxlDsl.Association#getAssoType <em>Asso Type</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Asso Type</em>'.
	 * @see org.xtext.dsl.dxl.dxlDsl.Association#getAssoType()
	 * @see #getAssociation()
	 * @generated
	 */
  EReference getAssociation_AssoType();

  /**
	 * Returns the meta object for the attribute '{@link org.xtext.dsl.dxl.dxlDsl.Association#getModuleType <em>Module Type</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Module Type</em>'.
	 * @see org.xtext.dsl.dxl.dxlDsl.Association#getModuleType()
	 * @see #getAssociation()
	 * @generated
	 */
  EAttribute getAssociation_ModuleType();

  /**
	 * Returns the meta object for the attribute '{@link org.xtext.dsl.dxl.dxlDsl.Association#getClassType <em>Class Type</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Type</em>'.
	 * @see org.xtext.dsl.dxl.dxlDsl.Association#getClassType()
	 * @see #getAssociation()
	 * @generated
	 */
  EAttribute getAssociation_ClassType();

  /**
	 * Returns the meta object for the attribute '{@link org.xtext.dsl.dxl.dxlDsl.Association#getAssoDescription <em>Asso Description</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Asso Description</em>'.
	 * @see org.xtext.dsl.dxl.dxlDsl.Association#getAssoDescription()
	 * @see #getAssociation()
	 * @generated
	 */
  EAttribute getAssociation_AssoDescription();

  /**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
  DxlDslFactory getDxlDslFactory();

  /**
	 * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
	 * @generated
	 */
  interface Literals
  {
    /**
		 * The meta object literal for the '{@link org.xtext.dsl.dxl.dxlDsl.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.xtext.dsl.dxl.dxlDsl.impl.ModelImpl
		 * @see org.xtext.dsl.dxl.dxlDsl.impl.DxlDslPackageImpl#getModel()
		 * @generated
		 */
    EClass MODEL = eINSTANCE.getModel();

    /**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute MODEL__NAME = eINSTANCE.getModel_Name();

    /**
		 * The meta object literal for the '<em><b>Folders</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference MODEL__FOLDERS = eINSTANCE.getModel_Folders();

    /**
		 * The meta object literal for the '{@link org.xtext.dsl.dxl.dxlDsl.impl.FolderImpl <em>Folder</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.xtext.dsl.dxl.dxlDsl.impl.FolderImpl
		 * @see org.xtext.dsl.dxl.dxlDsl.impl.DxlDslPackageImpl#getFolder()
		 * @generated
		 */
    EClass FOLDER = eINSTANCE.getFolder();

    /**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute FOLDER__NAME = eINSTANCE.getFolder_Name();

    /**
		 * The meta object literal for the '<em><b>Module</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference FOLDER__MODULE = eINSTANCE.getFolder_Module();

    /**
		 * The meta object literal for the '<em><b>Association Type</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference FOLDER__ASSOCIATION_TYPE = eINSTANCE.getFolder_AssociationType();

    /**
		 * The meta object literal for the '{@link org.xtext.dsl.dxl.dxlDsl.impl.ModuleImpl <em>Module</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.xtext.dsl.dxl.dxlDsl.impl.ModuleImpl
		 * @see org.xtext.dsl.dxl.dxlDsl.impl.DxlDslPackageImpl#getModule()
		 * @generated
		 */
    EClass MODULE = eINSTANCE.getModule();

    /**
		 * The meta object literal for the '<em><b>Ignore In Report</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute MODULE__IGNORE_IN_REPORT = eINSTANCE.getModule_IgnoreInReport();

    /**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute MODULE__NAME = eINSTANCE.getModule_Name();

    /**
		 * The meta object literal for the '<em><b>File Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute MODULE__FILE_NAME = eINSTANCE.getModule_FileName();

    /**
		 * The meta object literal for the '<em><b>Classes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference MODULE__CLASSES = eINSTANCE.getModule_Classes();

    /**
		 * The meta object literal for the '{@link org.xtext.dsl.dxl.dxlDsl.impl.ClassImpl <em>Class</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.xtext.dsl.dxl.dxlDsl.impl.ClassImpl
		 * @see org.xtext.dsl.dxl.dxlDsl.impl.DxlDslPackageImpl#getClass_()
		 * @generated
		 */
    EClass CLASS = eINSTANCE.getClass_();

    /**
		 * The meta object literal for the '<em><b>No Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute CLASS__NO_DESCRIPTION = eINSTANCE.getClass_NoDescription();

    /**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute CLASS__NAME = eINSTANCE.getClass_Name();

    /**
		 * The meta object literal for the '<em><b>Class Type Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute CLASS__CLASS_TYPE_DESCRIPTION = eINSTANCE.getClass_ClassTypeDescription();

    /**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference CLASS__ATTRIBUTES = eINSTANCE.getClass_Attributes();

    /**
		 * The meta object literal for the '<em><b>Associations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference CLASS__ASSOCIATIONS = eINSTANCE.getClass_Associations();

    /**
		 * The meta object literal for the '{@link org.xtext.dsl.dxl.dxlDsl.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.xtext.dsl.dxl.dxlDsl.impl.AttributeImpl
		 * @see org.xtext.dsl.dxl.dxlDsl.impl.DxlDslPackageImpl#getAttribute()
		 * @generated
		 */
    EClass ATTRIBUTE = eINSTANCE.getAttribute();

    /**
		 * The meta object literal for the '<em><b>Ignored</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute ATTRIBUTE__IGNORED = eINSTANCE.getAttribute_Ignored();

    /**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute ATTRIBUTE__TYPE = eINSTANCE.getAttribute_Type();

    /**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute ATTRIBUTE__NAME = eINSTANCE.getAttribute_Name();

    /**
		 * The meta object literal for the '<em><b>Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute ATTRIBUTE__DEFAULT = eINSTANCE.getAttribute_Default();

    /**
		 * The meta object literal for the '{@link org.xtext.dsl.dxl.dxlDsl.impl.AssociationTypeImpl <em>Association Type</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.xtext.dsl.dxl.dxlDsl.impl.AssociationTypeImpl
		 * @see org.xtext.dsl.dxl.dxlDsl.impl.DxlDslPackageImpl#getAssociationType()
		 * @generated
		 */
    EClass ASSOCIATION_TYPE = eINSTANCE.getAssociationType();

    /**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute ASSOCIATION_TYPE__NAME = eINSTANCE.getAssociationType_Name();

    /**
		 * The meta object literal for the '<em><b>Link File Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute ASSOCIATION_TYPE__LINK_FILE_NAME = eINSTANCE.getAssociationType_LinkFileName();

    /**
		 * The meta object literal for the '{@link org.xtext.dsl.dxl.dxlDsl.impl.AssociationImpl <em>Association</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.xtext.dsl.dxl.dxlDsl.impl.AssociationImpl
		 * @see org.xtext.dsl.dxl.dxlDsl.impl.DxlDslPackageImpl#getAssociation()
		 * @generated
		 */
    EClass ASSOCIATION = eINSTANCE.getAssociation();

    /**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute ASSOCIATION__NAME = eINSTANCE.getAssociation_Name();

    /**
		 * The meta object literal for the '<em><b>Asso Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference ASSOCIATION__ASSO_TYPE = eINSTANCE.getAssociation_AssoType();

    /**
		 * The meta object literal for the '<em><b>Module Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute ASSOCIATION__MODULE_TYPE = eINSTANCE.getAssociation_ModuleType();

    /**
		 * The meta object literal for the '<em><b>Class Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute ASSOCIATION__CLASS_TYPE = eINSTANCE.getAssociation_ClassType();

    /**
		 * The meta object literal for the '<em><b>Asso Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute ASSOCIATION__ASSO_DESCRIPTION = eINSTANCE.getAssociation_AssoDescription();

  }

} //DxlDslPackage
