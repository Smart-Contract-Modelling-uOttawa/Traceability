/*
* generated by Xtext
*/
grammar InternalDxlDsl;

options {
	superClass=AbstractInternalContentAssistParser;
	
}

@lexer::header {
package org.xtext.dsl.dxl.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package org.xtext.dsl.dxl.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.xtext.dsl.dxl.services.DxlDslGrammarAccess;

}

@parser::members {
 
 	private DxlDslGrammarAccess grammarAccess;
 	
    public void setGrammarAccess(DxlDslGrammarAccess grammarAccess) {
    	this.grammarAccess = grammarAccess;
    }
    
    @Override
    protected Grammar getGrammar() {
    	return grammarAccess.getGrammar();
    }
    
    @Override
    protected String getValueForTokenName(String tokenName) {
    	return tokenName;
    }

}




// Entry rule entryRuleModel
entryRuleModel 
:
{ before(grammarAccess.getModelRule()); }
	 ruleModel
{ after(grammarAccess.getModelRule()); } 
	 EOF 
;

// Rule Model
ruleModel
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getModelAccess().getGroup()); }
(rule__Model__Group__0)
{ after(grammarAccess.getModelAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleFolder
entryRuleFolder 
:
{ before(grammarAccess.getFolderRule()); }
	 ruleFolder
{ after(grammarAccess.getFolderRule()); } 
	 EOF 
;

// Rule Folder
ruleFolder
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getFolderAccess().getGroup()); }
(rule__Folder__Group__0)
{ after(grammarAccess.getFolderAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleModule
entryRuleModule 
:
{ before(grammarAccess.getModuleRule()); }
	 ruleModule
{ after(grammarAccess.getModuleRule()); } 
	 EOF 
;

// Rule Module
ruleModule
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getModuleAccess().getGroup()); }
(rule__Module__Group__0)
{ after(grammarAccess.getModuleAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleClass
entryRuleClass 
:
{ before(grammarAccess.getClassRule()); }
	 ruleClass
{ after(grammarAccess.getClassRule()); } 
	 EOF 
;

// Rule Class
ruleClass
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getClassAccess().getGroup()); }
(rule__Class__Group__0)
{ after(grammarAccess.getClassAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleAttribute
entryRuleAttribute 
:
{ before(grammarAccess.getAttributeRule()); }
	 ruleAttribute
{ after(grammarAccess.getAttributeRule()); } 
	 EOF 
;

// Rule Attribute
ruleAttribute
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getAttributeAccess().getGroup()); }
(rule__Attribute__Group__0)
{ after(grammarAccess.getAttributeAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleDataType
entryRuleDataType 
:
{ before(grammarAccess.getDataTypeRule()); }
	 ruleDataType
{ after(grammarAccess.getDataTypeRule()); } 
	 EOF 
;

// Rule DataType
ruleDataType
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getDataTypeAccess().getAlternatives()); }
(rule__DataType__Alternatives)
{ after(grammarAccess.getDataTypeAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleAssociationType
entryRuleAssociationType 
:
{ before(grammarAccess.getAssociationTypeRule()); }
	 ruleAssociationType
{ after(grammarAccess.getAssociationTypeRule()); } 
	 EOF 
;

// Rule AssociationType
ruleAssociationType
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getAssociationTypeAccess().getGroup()); }
(rule__AssociationType__Group__0)
{ after(grammarAccess.getAssociationTypeAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleAssociation
entryRuleAssociation 
:
{ before(grammarAccess.getAssociationRule()); }
	 ruleAssociation
{ after(grammarAccess.getAssociationRule()); } 
	 EOF 
;

// Rule Association
ruleAssociation
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getAssociationAccess().getGroup()); }
(rule__Association__Group__0)
{ after(grammarAccess.getAssociationAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}




rule__DataType__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDataTypeAccess().getBoolKeyword_0()); }

	'bool' 

{ after(grammarAccess.getDataTypeAccess().getBoolKeyword_0()); }
)

    |(
{ before(grammarAccess.getDataTypeAccess().getStringKeyword_1()); }

	'string' 

{ after(grammarAccess.getDataTypeAccess().getStringKeyword_1()); }
)

    |(
{ before(grammarAccess.getDataTypeAccess().getIntKeyword_2()); }

	'int' 

{ after(grammarAccess.getDataTypeAccess().getIntKeyword_2()); }
)

    |(
{ before(grammarAccess.getDataTypeAccess().getTextKeyword_3()); }

	'text' 

{ after(grammarAccess.getDataTypeAccess().getTextKeyword_3()); }
)

    |(
{ before(grammarAccess.getDataTypeAccess().getDiagramKeyword_4()); }

	'diagram' 

{ after(grammarAccess.getDataTypeAccess().getDiagramKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}



rule__Model__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Model__Group__0__Impl
	rule__Model__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModelAccess().getModelKeyword_0()); }

	'model' 

{ after(grammarAccess.getModelAccess().getModelKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Model__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Model__Group__1__Impl
	rule__Model__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModelAccess().getNameAssignment_1()); }
(rule__Model__NameAssignment_1)
{ after(grammarAccess.getModelAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Model__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Model__Group__2__Impl
	rule__Model__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_2()); }

	'{' 

{ after(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Model__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Model__Group__3__Impl
	rule__Model__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModelAccess().getFoldersAssignment_3()); }
(rule__Model__FoldersAssignment_3)*
{ after(grammarAccess.getModelAccess().getFoldersAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Model__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Model__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_4()); }

	'}' 

{ after(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__Folder__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Folder__Group__0__Impl
	rule__Folder__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Folder__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFolderAccess().getFolderKeyword_0()); }

	'folder' 

{ after(grammarAccess.getFolderAccess().getFolderKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Folder__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Folder__Group__1__Impl
	rule__Folder__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Folder__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFolderAccess().getNameAssignment_1()); }
(rule__Folder__NameAssignment_1)
{ after(grammarAccess.getFolderAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Folder__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Folder__Group__2__Impl
	rule__Folder__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Folder__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFolderAccess().getLeftCurlyBracketKeyword_2()); }

	'{' 

{ after(grammarAccess.getFolderAccess().getLeftCurlyBracketKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Folder__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Folder__Group__3__Impl
	rule__Folder__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Folder__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFolderAccess().getModuleAssignment_3()); }
(rule__Folder__ModuleAssignment_3)*
{ after(grammarAccess.getFolderAccess().getModuleAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Folder__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Folder__Group__4__Impl
	rule__Folder__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Folder__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFolderAccess().getAssociationTypeAssignment_4()); }
(rule__Folder__AssociationTypeAssignment_4)*
{ after(grammarAccess.getFolderAccess().getAssociationTypeAssignment_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Folder__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Folder__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Folder__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFolderAccess().getRightCurlyBracketKeyword_5()); }

	'}' 

{ after(grammarAccess.getFolderAccess().getRightCurlyBracketKeyword_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}














rule__Module__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Module__Group__0__Impl
	rule__Module__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Module__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModuleAccess().getModuleKeyword_0()); }

	'module' 

{ after(grammarAccess.getModuleAccess().getModuleKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Module__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Module__Group__1__Impl
	rule__Module__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Module__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModuleAccess().getIgnoreInReportAssignment_1()); }
(rule__Module__IgnoreInReportAssignment_1)?
{ after(grammarAccess.getModuleAccess().getIgnoreInReportAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Module__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Module__Group__2__Impl
	rule__Module__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Module__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModuleAccess().getNameAssignment_2()); }
(rule__Module__NameAssignment_2)
{ after(grammarAccess.getModuleAccess().getNameAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Module__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Module__Group__3__Impl
	rule__Module__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Module__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModuleAccess().getLeftCurlyBracketKeyword_3()); }

	'{' 

{ after(grammarAccess.getModuleAccess().getLeftCurlyBracketKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Module__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Module__Group__4__Impl
	rule__Module__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Module__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModuleAccess().getGroup_4()); }
(rule__Module__Group_4__0)?
{ after(grammarAccess.getModuleAccess().getGroup_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Module__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Module__Group__5__Impl
	rule__Module__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Module__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModuleAccess().getClassesAssignment_5()); }
(rule__Module__ClassesAssignment_5)*
{ after(grammarAccess.getModuleAccess().getClassesAssignment_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Module__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Module__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Module__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModuleAccess().getRightCurlyBracketKeyword_6()); }

	'}' 

{ after(grammarAccess.getModuleAccess().getRightCurlyBracketKeyword_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}
















rule__Module__Group_4__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Module__Group_4__0__Impl
	rule__Module__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Module__Group_4__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModuleAccess().getFileNameKeyword_4_0()); }

	'fileName' 

{ after(grammarAccess.getModuleAccess().getFileNameKeyword_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Module__Group_4__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Module__Group_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Module__Group_4__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModuleAccess().getFileNameAssignment_4_1()); }
(rule__Module__FileNameAssignment_4_1)
{ after(grammarAccess.getModuleAccess().getFileNameAssignment_4_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Class__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Class__Group__0__Impl
	rule__Class__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Class__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getClassAccess().getClassKeyword_0()); }

	'class' 

{ after(grammarAccess.getClassAccess().getClassKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Class__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Class__Group__1__Impl
	rule__Class__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Class__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getClassAccess().getNoDescriptionAssignment_1()); }
(rule__Class__NoDescriptionAssignment_1)?
{ after(grammarAccess.getClassAccess().getNoDescriptionAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Class__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Class__Group__2__Impl
	rule__Class__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Class__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getClassAccess().getNameAssignment_2()); }
(rule__Class__NameAssignment_2)
{ after(grammarAccess.getClassAccess().getNameAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Class__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Class__Group__3__Impl
	rule__Class__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Class__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getClassAccess().getGroup_3()); }
(rule__Class__Group_3__0)?
{ after(grammarAccess.getClassAccess().getGroup_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Class__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Class__Group__4__Impl
	rule__Class__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Class__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_4()); }

	'{' 

{ after(grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Class__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Class__Group__5__Impl
	rule__Class__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Class__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getClassAccess().getAttributesAssignment_5()); }
(rule__Class__AttributesAssignment_5)*
{ after(grammarAccess.getClassAccess().getAttributesAssignment_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Class__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Class__Group__6__Impl
	rule__Class__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__Class__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getClassAccess().getAssociationsAssignment_6()); }
(rule__Class__AssociationsAssignment_6)*
{ after(grammarAccess.getClassAccess().getAssociationsAssignment_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Class__Group__7
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Class__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Class__Group__7__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getClassAccess().getRightCurlyBracketKeyword_7()); }

	'}' 

{ after(grammarAccess.getClassAccess().getRightCurlyBracketKeyword_7()); }
)

;
finally {
	restoreStackSize(stackSize);
}


















rule__Class__Group_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Class__Group_3__0__Impl
	rule__Class__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Class__Group_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getClassAccess().getShowsAsKeyword_3_0()); }

	'shows as' 

{ after(grammarAccess.getClassAccess().getShowsAsKeyword_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Class__Group_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Class__Group_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Class__Group_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getClassAccess().getClassTypeDescriptionAssignment_3_1()); }
(rule__Class__ClassTypeDescriptionAssignment_3_1)
{ after(grammarAccess.getClassAccess().getClassTypeDescriptionAssignment_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Attribute__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Attribute__Group__0__Impl
	rule__Attribute__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAttributeAccess().getIgnoredAssignment_0()); }
(rule__Attribute__IgnoredAssignment_0)?
{ after(grammarAccess.getAttributeAccess().getIgnoredAssignment_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Attribute__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Attribute__Group__1__Impl
	rule__Attribute__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAttributeAccess().getTypeAssignment_1()); }
(rule__Attribute__TypeAssignment_1)
{ after(grammarAccess.getAttributeAccess().getTypeAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Attribute__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Attribute__Group__2__Impl
	rule__Attribute__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAttributeAccess().getNameAssignment_2()); }
(rule__Attribute__NameAssignment_2)
{ after(grammarAccess.getAttributeAccess().getNameAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Attribute__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Attribute__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAttributeAccess().getGroup_3()); }
(rule__Attribute__Group_3__0)?
{ after(grammarAccess.getAttributeAccess().getGroup_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__Attribute__Group_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Attribute__Group_3__0__Impl
	rule__Attribute__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAttributeAccess().getShowsAsKeyword_3_0()); }

	'shows as' 

{ after(grammarAccess.getAttributeAccess().getShowsAsKeyword_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Attribute__Group_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Attribute__Group_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAttributeAccess().getDefaultAssignment_3_1()); }
(rule__Attribute__DefaultAssignment_3_1)
{ after(grammarAccess.getAttributeAccess().getDefaultAssignment_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__AssociationType__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__AssociationType__Group__0__Impl
	rule__AssociationType__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AssociationType__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAssociationTypeAccess().getAssociationTypeKeyword_0()); }

	'associationType' 

{ after(grammarAccess.getAssociationTypeAccess().getAssociationTypeKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__AssociationType__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__AssociationType__Group__1__Impl
	rule__AssociationType__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__AssociationType__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAssociationTypeAccess().getNameAssignment_1()); }
(rule__AssociationType__NameAssignment_1)
{ after(grammarAccess.getAssociationTypeAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__AssociationType__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__AssociationType__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AssociationType__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAssociationTypeAccess().getLinkFileNameAssignment_2()); }
(rule__AssociationType__LinkFileNameAssignment_2)
{ after(grammarAccess.getAssociationTypeAccess().getLinkFileNameAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__Association__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Association__Group__0__Impl
	rule__Association__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Association__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAssociationAccess().getAssociationKeyword_0()); }

	'association' 

{ after(grammarAccess.getAssociationAccess().getAssociationKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Association__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Association__Group__1__Impl
	rule__Association__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Association__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAssociationAccess().getNameAssignment_1()); }
(rule__Association__NameAssignment_1)
{ after(grammarAccess.getAssociationAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Association__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Association__Group__2__Impl
	rule__Association__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Association__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAssociationAccess().getColonKeyword_2()); }

	':' 

{ after(grammarAccess.getAssociationAccess().getColonKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Association__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Association__Group__3__Impl
	rule__Association__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Association__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAssociationAccess().getAssoTypeAssignment_3()); }
(rule__Association__AssoTypeAssignment_3)
{ after(grammarAccess.getAssociationAccess().getAssoTypeAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Association__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Association__Group__4__Impl
	rule__Association__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Association__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAssociationAccess().getToKeyword_4()); }

	'to' 

{ after(grammarAccess.getAssociationAccess().getToKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Association__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Association__Group__5__Impl
	rule__Association__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Association__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAssociationAccess().getModuleTypeAssignment_5()); }
(rule__Association__ModuleTypeAssignment_5)
{ after(grammarAccess.getAssociationAccess().getModuleTypeAssignment_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Association__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Association__Group__6__Impl
	rule__Association__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__Association__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAssociationAccess().getGroup_6()); }
(rule__Association__Group_6__0)?
{ after(grammarAccess.getAssociationAccess().getGroup_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Association__Group__7
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Association__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Association__Group__7__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAssociationAccess().getAssoDescriptionAssignment_7()); }
(rule__Association__AssoDescriptionAssignment_7)?
{ after(grammarAccess.getAssociationAccess().getAssoDescriptionAssignment_7()); }
)

;
finally {
	restoreStackSize(stackSize);
}


















rule__Association__Group_6__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Association__Group_6__0__Impl
	rule__Association__Group_6__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Association__Group_6__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAssociationAccess().getFullStopKeyword_6_0()); }

	'.' 

{ after(grammarAccess.getAssociationAccess().getFullStopKeyword_6_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Association__Group_6__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Association__Group_6__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Association__Group_6__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAssociationAccess().getClassTypeAssignment_6_1()); }
(rule__Association__ClassTypeAssignment_6_1)
{ after(grammarAccess.getAssociationAccess().getClassTypeAssignment_6_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}







rule__Model__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModelAccess().getNameIDTerminalRuleCall_1_0()); }
	RULE_ID{ after(grammarAccess.getModelAccess().getNameIDTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Model__FoldersAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModelAccess().getFoldersFolderParserRuleCall_3_0()); }
	ruleFolder{ after(grammarAccess.getModelAccess().getFoldersFolderParserRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Folder__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFolderAccess().getNameIDTerminalRuleCall_1_0()); }
	RULE_ID{ after(grammarAccess.getFolderAccess().getNameIDTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Folder__ModuleAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFolderAccess().getModuleModuleParserRuleCall_3_0()); }
	ruleModule{ after(grammarAccess.getFolderAccess().getModuleModuleParserRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Folder__AssociationTypeAssignment_4
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFolderAccess().getAssociationTypeAssociationTypeParserRuleCall_4_0()); }
	ruleAssociationType{ after(grammarAccess.getFolderAccess().getAssociationTypeAssociationTypeParserRuleCall_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Module__IgnoreInReportAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModuleAccess().getIgnoreInReportIgnoreInReportKeyword_1_0()); }
(
{ before(grammarAccess.getModuleAccess().getIgnoreInReportIgnoreInReportKeyword_1_0()); }

	'ignoreInReport' 

{ after(grammarAccess.getModuleAccess().getIgnoreInReportIgnoreInReportKeyword_1_0()); }
)

{ after(grammarAccess.getModuleAccess().getIgnoreInReportIgnoreInReportKeyword_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Module__NameAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModuleAccess().getNameIDTerminalRuleCall_2_0()); }
	RULE_ID{ after(grammarAccess.getModuleAccess().getNameIDTerminalRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Module__FileNameAssignment_4_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModuleAccess().getFileNameSTRINGTerminalRuleCall_4_1_0()); }
	RULE_STRING{ after(grammarAccess.getModuleAccess().getFileNameSTRINGTerminalRuleCall_4_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Module__ClassesAssignment_5
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModuleAccess().getClassesClassParserRuleCall_5_0()); }
	ruleClass{ after(grammarAccess.getModuleAccess().getClassesClassParserRuleCall_5_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Class__NoDescriptionAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getClassAccess().getNoDescriptionNoDescriptionKeyword_1_0()); }
(
{ before(grammarAccess.getClassAccess().getNoDescriptionNoDescriptionKeyword_1_0()); }

	'noDescription' 

{ after(grammarAccess.getClassAccess().getNoDescriptionNoDescriptionKeyword_1_0()); }
)

{ after(grammarAccess.getClassAccess().getNoDescriptionNoDescriptionKeyword_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Class__NameAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getClassAccess().getNameIDTerminalRuleCall_2_0()); }
	RULE_ID{ after(grammarAccess.getClassAccess().getNameIDTerminalRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Class__ClassTypeDescriptionAssignment_3_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getClassAccess().getClassTypeDescriptionSTRINGTerminalRuleCall_3_1_0()); }
	RULE_STRING{ after(grammarAccess.getClassAccess().getClassTypeDescriptionSTRINGTerminalRuleCall_3_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Class__AttributesAssignment_5
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getClassAccess().getAttributesAttributeParserRuleCall_5_0()); }
	ruleAttribute{ after(grammarAccess.getClassAccess().getAttributesAttributeParserRuleCall_5_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Class__AssociationsAssignment_6
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getClassAccess().getAssociationsAssociationParserRuleCall_6_0()); }
	ruleAssociation{ after(grammarAccess.getClassAccess().getAssociationsAssociationParserRuleCall_6_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__IgnoredAssignment_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAttributeAccess().getIgnoredIgnoredKeyword_0_0()); }
(
{ before(grammarAccess.getAttributeAccess().getIgnoredIgnoredKeyword_0_0()); }

	'ignored' 

{ after(grammarAccess.getAttributeAccess().getIgnoredIgnoredKeyword_0_0()); }
)

{ after(grammarAccess.getAttributeAccess().getIgnoredIgnoredKeyword_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__TypeAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAttributeAccess().getTypeDataTypeParserRuleCall_1_0()); }
	ruleDataType{ after(grammarAccess.getAttributeAccess().getTypeDataTypeParserRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__NameAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAttributeAccess().getNameSTRINGTerminalRuleCall_2_0()); }
	RULE_STRING{ after(grammarAccess.getAttributeAccess().getNameSTRINGTerminalRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__DefaultAssignment_3_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAttributeAccess().getDefaultSTRINGTerminalRuleCall_3_1_0()); }
	RULE_STRING{ after(grammarAccess.getAttributeAccess().getDefaultSTRINGTerminalRuleCall_3_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__AssociationType__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAssociationTypeAccess().getNameIDTerminalRuleCall_1_0()); }
	RULE_ID{ after(grammarAccess.getAssociationTypeAccess().getNameIDTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__AssociationType__LinkFileNameAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAssociationTypeAccess().getLinkFileNameSTRINGTerminalRuleCall_2_0()); }
	RULE_STRING{ after(grammarAccess.getAssociationTypeAccess().getLinkFileNameSTRINGTerminalRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Association__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAssociationAccess().getNameIDTerminalRuleCall_1_0()); }
	RULE_ID{ after(grammarAccess.getAssociationAccess().getNameIDTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Association__AssoTypeAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAssociationAccess().getAssoTypeAssociationTypeCrossReference_3_0()); }
(
{ before(grammarAccess.getAssociationAccess().getAssoTypeAssociationTypeIDTerminalRuleCall_3_0_1()); }
	RULE_ID{ after(grammarAccess.getAssociationAccess().getAssoTypeAssociationTypeIDTerminalRuleCall_3_0_1()); }
)
{ after(grammarAccess.getAssociationAccess().getAssoTypeAssociationTypeCrossReference_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Association__ModuleTypeAssignment_5
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAssociationAccess().getModuleTypeSTRINGTerminalRuleCall_5_0()); }
	RULE_STRING{ after(grammarAccess.getAssociationAccess().getModuleTypeSTRINGTerminalRuleCall_5_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Association__ClassTypeAssignment_6_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAssociationAccess().getClassTypeSTRINGTerminalRuleCall_6_1_0()); }
	RULE_STRING{ after(grammarAccess.getAssociationAccess().getClassTypeSTRINGTerminalRuleCall_6_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Association__AssoDescriptionAssignment_7
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAssociationAccess().getAssoDescriptionSTRINGTerminalRuleCall_7_0()); }
	RULE_STRING{ after(grammarAccess.getAssociationAccess().getAssoDescriptionSTRINGTerminalRuleCall_7_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


