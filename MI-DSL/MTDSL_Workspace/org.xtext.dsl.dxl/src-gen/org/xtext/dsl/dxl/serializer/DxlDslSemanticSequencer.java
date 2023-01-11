package org.xtext.dsl.dxl.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.dsl.dxl.dxlDsl.Association;
import org.xtext.dsl.dxl.dxlDsl.AssociationType;
import org.xtext.dsl.dxl.dxlDsl.Attribute;
import org.xtext.dsl.dxl.dxlDsl.DxlDslPackage;
import org.xtext.dsl.dxl.dxlDsl.Folder;
import org.xtext.dsl.dxl.dxlDsl.Model;
import org.xtext.dsl.dxl.dxlDsl.Module;
import org.xtext.dsl.dxl.services.DxlDslGrammarAccess;

@SuppressWarnings("all")
public class DxlDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private DxlDslGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == DxlDslPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case DxlDslPackage.ASSOCIATION:
				if(context == grammarAccess.getAssociationRule()) {
					sequence_Association(context, (Association) semanticObject); 
					return; 
				}
				else break;
			case DxlDslPackage.ASSOCIATION_TYPE:
				if(context == grammarAccess.getAssociationTypeRule()) {
					sequence_AssociationType(context, (AssociationType) semanticObject); 
					return; 
				}
				else break;
			case DxlDslPackage.ATTRIBUTE:
				if(context == grammarAccess.getAttributeRule()) {
					sequence_Attribute(context, (Attribute) semanticObject); 
					return; 
				}
				else break;
			case DxlDslPackage.CLASS:
				if(context == grammarAccess.getClassRule()) {
					sequence_Class(context, (org.xtext.dsl.dxl.dxlDsl.Class) semanticObject); 
					return; 
				}
				else break;
			case DxlDslPackage.FOLDER:
				if(context == grammarAccess.getFolderRule()) {
					sequence_Folder(context, (Folder) semanticObject); 
					return; 
				}
				else break;
			case DxlDslPackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case DxlDslPackage.MODULE:
				if(context == grammarAccess.getModuleRule()) {
					sequence_Module(context, (Module) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (name=ID linkFileName=STRING)
	 */
	protected void sequence_AssociationType(EObject context, AssociationType semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DxlDslPackage.Literals.ASSOCIATION_TYPE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DxlDslPackage.Literals.ASSOCIATION_TYPE__NAME));
			if(transientValues.isValueTransient(semanticObject, DxlDslPackage.Literals.ASSOCIATION_TYPE__LINK_FILE_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DxlDslPackage.Literals.ASSOCIATION_TYPE__LINK_FILE_NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAssociationTypeAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getAssociationTypeAccess().getLinkFileNameSTRINGTerminalRuleCall_2_0(), semanticObject.getLinkFileName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID assoType=[AssociationType|ID] moduleType=STRING classType=STRING? assoDescription=STRING?)
	 */
	protected void sequence_Association(EObject context, Association semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (ignored?='ignored'? type=DataType name=STRING default=STRING?)
	 */
	protected void sequence_Attribute(EObject context, Attribute semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (noDescription?='noDescription'? name=ID classTypeDescription=STRING? attributes+=Attribute* associations+=Association*)
	 */
	protected void sequence_Class(EObject context, org.xtext.dsl.dxl.dxlDsl.Class semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID module+=Module* associationType+=AssociationType*)
	 */
	protected void sequence_Folder(EObject context, Folder semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID folders+=Folder*)
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (ignoreInReport?='ignoreInReport'? name=ID fileName=STRING? classes+=Class*)
	 */
	protected void sequence_Module(EObject context, Module semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
