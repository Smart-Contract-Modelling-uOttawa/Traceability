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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDxlDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'bool'", "'string'", "'int'", "'text'", "'diagram'", "'model'", "'{'", "'}'", "'folder'", "'module'", "'fileName'", "'class'", "'shows as'", "'associationType'", "'association'", "':'", "'to'", "'.'", "'ignoreInReport'", "'noDescription'", "'ignored'"
    };
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int RULE_STRING=5;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalDxlDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDxlDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDxlDslParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g"; }


     
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




    // $ANTLR start "entryRuleModel"
    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:61:1: ( ruleModel EOF )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:62:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel61);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:69:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:73:2: ( ( ( rule__Model__Group__0 ) ) )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:74:1: ( ( rule__Model__Group__0 ) )
            {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:74:1: ( ( rule__Model__Group__0 ) )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:75:1: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:76:1: ( rule__Model__Group__0 )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:76:2: rule__Model__Group__0
            {
            pushFollow(FOLLOW_rule__Model__Group__0_in_ruleModel94);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleFolder"
    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:88:1: entryRuleFolder : ruleFolder EOF ;
    public final void entryRuleFolder() throws RecognitionException {
        try {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:89:1: ( ruleFolder EOF )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:90:1: ruleFolder EOF
            {
             before(grammarAccess.getFolderRule()); 
            pushFollow(FOLLOW_ruleFolder_in_entryRuleFolder121);
            ruleFolder();

            state._fsp--;

             after(grammarAccess.getFolderRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFolder128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFolder"


    // $ANTLR start "ruleFolder"
    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:97:1: ruleFolder : ( ( rule__Folder__Group__0 ) ) ;
    public final void ruleFolder() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:101:2: ( ( ( rule__Folder__Group__0 ) ) )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:102:1: ( ( rule__Folder__Group__0 ) )
            {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:102:1: ( ( rule__Folder__Group__0 ) )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:103:1: ( rule__Folder__Group__0 )
            {
             before(grammarAccess.getFolderAccess().getGroup()); 
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:104:1: ( rule__Folder__Group__0 )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:104:2: rule__Folder__Group__0
            {
            pushFollow(FOLLOW_rule__Folder__Group__0_in_ruleFolder154);
            rule__Folder__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFolderAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFolder"


    // $ANTLR start "entryRuleModule"
    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:116:1: entryRuleModule : ruleModule EOF ;
    public final void entryRuleModule() throws RecognitionException {
        try {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:117:1: ( ruleModule EOF )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:118:1: ruleModule EOF
            {
             before(grammarAccess.getModuleRule()); 
            pushFollow(FOLLOW_ruleModule_in_entryRuleModule181);
            ruleModule();

            state._fsp--;

             after(grammarAccess.getModuleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModule188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModule"


    // $ANTLR start "ruleModule"
    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:125:1: ruleModule : ( ( rule__Module__Group__0 ) ) ;
    public final void ruleModule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:129:2: ( ( ( rule__Module__Group__0 ) ) )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:130:1: ( ( rule__Module__Group__0 ) )
            {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:130:1: ( ( rule__Module__Group__0 ) )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:131:1: ( rule__Module__Group__0 )
            {
             before(grammarAccess.getModuleAccess().getGroup()); 
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:132:1: ( rule__Module__Group__0 )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:132:2: rule__Module__Group__0
            {
            pushFollow(FOLLOW_rule__Module__Group__0_in_ruleModule214);
            rule__Module__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModule"


    // $ANTLR start "entryRuleClass"
    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:144:1: entryRuleClass : ruleClass EOF ;
    public final void entryRuleClass() throws RecognitionException {
        try {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:145:1: ( ruleClass EOF )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:146:1: ruleClass EOF
            {
             before(grammarAccess.getClassRule()); 
            pushFollow(FOLLOW_ruleClass_in_entryRuleClass241);
            ruleClass();

            state._fsp--;

             after(grammarAccess.getClassRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClass248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleClass"


    // $ANTLR start "ruleClass"
    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:153:1: ruleClass : ( ( rule__Class__Group__0 ) ) ;
    public final void ruleClass() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:157:2: ( ( ( rule__Class__Group__0 ) ) )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:158:1: ( ( rule__Class__Group__0 ) )
            {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:158:1: ( ( rule__Class__Group__0 ) )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:159:1: ( rule__Class__Group__0 )
            {
             before(grammarAccess.getClassAccess().getGroup()); 
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:160:1: ( rule__Class__Group__0 )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:160:2: rule__Class__Group__0
            {
            pushFollow(FOLLOW_rule__Class__Group__0_in_ruleClass274);
            rule__Class__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleClass"


    // $ANTLR start "entryRuleAttribute"
    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:172:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:173:1: ( ruleAttribute EOF )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:174:1: ruleAttribute EOF
            {
             before(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute301);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:181:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:185:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:186:1: ( ( rule__Attribute__Group__0 ) )
            {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:186:1: ( ( rule__Attribute__Group__0 ) )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:187:1: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:188:1: ( rule__Attribute__Group__0 )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:188:2: rule__Attribute__Group__0
            {
            pushFollow(FOLLOW_rule__Attribute__Group__0_in_ruleAttribute334);
            rule__Attribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleDataType"
    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:200:1: entryRuleDataType : ruleDataType EOF ;
    public final void entryRuleDataType() throws RecognitionException {
        try {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:201:1: ( ruleDataType EOF )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:202:1: ruleDataType EOF
            {
             before(grammarAccess.getDataTypeRule()); 
            pushFollow(FOLLOW_ruleDataType_in_entryRuleDataType361);
            ruleDataType();

            state._fsp--;

             after(grammarAccess.getDataTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataType368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDataType"


    // $ANTLR start "ruleDataType"
    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:209:1: ruleDataType : ( ( rule__DataType__Alternatives ) ) ;
    public final void ruleDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:213:2: ( ( ( rule__DataType__Alternatives ) ) )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:214:1: ( ( rule__DataType__Alternatives ) )
            {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:214:1: ( ( rule__DataType__Alternatives ) )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:215:1: ( rule__DataType__Alternatives )
            {
             before(grammarAccess.getDataTypeAccess().getAlternatives()); 
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:216:1: ( rule__DataType__Alternatives )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:216:2: rule__DataType__Alternatives
            {
            pushFollow(FOLLOW_rule__DataType__Alternatives_in_ruleDataType394);
            rule__DataType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDataType"


    // $ANTLR start "entryRuleAssociationType"
    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:228:1: entryRuleAssociationType : ruleAssociationType EOF ;
    public final void entryRuleAssociationType() throws RecognitionException {
        try {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:229:1: ( ruleAssociationType EOF )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:230:1: ruleAssociationType EOF
            {
             before(grammarAccess.getAssociationTypeRule()); 
            pushFollow(FOLLOW_ruleAssociationType_in_entryRuleAssociationType421);
            ruleAssociationType();

            state._fsp--;

             after(grammarAccess.getAssociationTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssociationType428); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAssociationType"


    // $ANTLR start "ruleAssociationType"
    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:237:1: ruleAssociationType : ( ( rule__AssociationType__Group__0 ) ) ;
    public final void ruleAssociationType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:241:2: ( ( ( rule__AssociationType__Group__0 ) ) )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:242:1: ( ( rule__AssociationType__Group__0 ) )
            {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:242:1: ( ( rule__AssociationType__Group__0 ) )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:243:1: ( rule__AssociationType__Group__0 )
            {
             before(grammarAccess.getAssociationTypeAccess().getGroup()); 
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:244:1: ( rule__AssociationType__Group__0 )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:244:2: rule__AssociationType__Group__0
            {
            pushFollow(FOLLOW_rule__AssociationType__Group__0_in_ruleAssociationType454);
            rule__AssociationType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAssociationTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAssociationType"


    // $ANTLR start "entryRuleAssociation"
    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:256:1: entryRuleAssociation : ruleAssociation EOF ;
    public final void entryRuleAssociation() throws RecognitionException {
        try {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:257:1: ( ruleAssociation EOF )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:258:1: ruleAssociation EOF
            {
             before(grammarAccess.getAssociationRule()); 
            pushFollow(FOLLOW_ruleAssociation_in_entryRuleAssociation481);
            ruleAssociation();

            state._fsp--;

             after(grammarAccess.getAssociationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssociation488); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAssociation"


    // $ANTLR start "ruleAssociation"
    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:265:1: ruleAssociation : ( ( rule__Association__Group__0 ) ) ;
    public final void ruleAssociation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:269:2: ( ( ( rule__Association__Group__0 ) ) )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:270:1: ( ( rule__Association__Group__0 ) )
            {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:270:1: ( ( rule__Association__Group__0 ) )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:271:1: ( rule__Association__Group__0 )
            {
             before(grammarAccess.getAssociationAccess().getGroup()); 
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:272:1: ( rule__Association__Group__0 )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:272:2: rule__Association__Group__0
            {
            pushFollow(FOLLOW_rule__Association__Group__0_in_ruleAssociation514);
            rule__Association__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAssociationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAssociation"


    // $ANTLR start "rule__DataType__Alternatives"
    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:284:1: rule__DataType__Alternatives : ( ( 'bool' ) | ( 'string' ) | ( 'int' ) | ( 'text' ) | ( 'diagram' ) );
    public final void rule__DataType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:288:1: ( ( 'bool' ) | ( 'string' ) | ( 'int' ) | ( 'text' ) | ( 'diagram' ) )
            int alt1=5;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt1=1;
                }
                break;
            case 12:
                {
                alt1=2;
                }
                break;
            case 13:
                {
                alt1=3;
                }
                break;
            case 14:
                {
                alt1=4;
                }
                break;
            case 15:
                {
                alt1=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:289:1: ( 'bool' )
                    {
                    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:289:1: ( 'bool' )
                    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:290:1: 'bool'
                    {
                     before(grammarAccess.getDataTypeAccess().getBoolKeyword_0()); 
                    match(input,11,FOLLOW_11_in_rule__DataType__Alternatives551); 
                     after(grammarAccess.getDataTypeAccess().getBoolKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:297:6: ( 'string' )
                    {
                    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:297:6: ( 'string' )
                    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:298:1: 'string'
                    {
                     before(grammarAccess.getDataTypeAccess().getStringKeyword_1()); 
                    match(input,12,FOLLOW_12_in_rule__DataType__Alternatives571); 
                     after(grammarAccess.getDataTypeAccess().getStringKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:305:6: ( 'int' )
                    {
                    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:305:6: ( 'int' )
                    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:306:1: 'int'
                    {
                     before(grammarAccess.getDataTypeAccess().getIntKeyword_2()); 
                    match(input,13,FOLLOW_13_in_rule__DataType__Alternatives591); 
                     after(grammarAccess.getDataTypeAccess().getIntKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:313:6: ( 'text' )
                    {
                    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:313:6: ( 'text' )
                    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:314:1: 'text'
                    {
                     before(grammarAccess.getDataTypeAccess().getTextKeyword_3()); 
                    match(input,14,FOLLOW_14_in_rule__DataType__Alternatives611); 
                     after(grammarAccess.getDataTypeAccess().getTextKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:321:6: ( 'diagram' )
                    {
                    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:321:6: ( 'diagram' )
                    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:322:1: 'diagram'
                    {
                     before(grammarAccess.getDataTypeAccess().getDiagramKeyword_4()); 
                    match(input,15,FOLLOW_15_in_rule__DataType__Alternatives631); 
                     after(grammarAccess.getDataTypeAccess().getDiagramKeyword_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:336:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:340:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:341:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__0663);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__0666);
            rule__Model__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:348:1: rule__Model__Group__0__Impl : ( 'model' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:352:1: ( ( 'model' ) )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:353:1: ( 'model' )
            {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:353:1: ( 'model' )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:354:1: 'model'
            {
             before(grammarAccess.getModelAccess().getModelKeyword_0()); 
            match(input,16,FOLLOW_16_in_rule__Model__Group__0__Impl694); 
             after(grammarAccess.getModelAccess().getModelKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:367:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:371:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:372:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__1725);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__2_in_rule__Model__Group__1728);
            rule__Model__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:379:1: rule__Model__Group__1__Impl : ( ( rule__Model__NameAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:383:1: ( ( ( rule__Model__NameAssignment_1 ) ) )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:384:1: ( ( rule__Model__NameAssignment_1 ) )
            {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:384:1: ( ( rule__Model__NameAssignment_1 ) )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:385:1: ( rule__Model__NameAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getNameAssignment_1()); 
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:386:1: ( rule__Model__NameAssignment_1 )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:386:2: rule__Model__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Model__NameAssignment_1_in_rule__Model__Group__1__Impl755);
            rule__Model__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Model__Group__2"
    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:396:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:400:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:401:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__2785);
            rule__Model__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__3_in_rule__Model__Group__2788);
            rule__Model__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2"


    // $ANTLR start "rule__Model__Group__2__Impl"
    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:408:1: rule__Model__Group__2__Impl : ( '{' ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:412:1: ( ( '{' ) )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:413:1: ( '{' )
            {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:413:1: ( '{' )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:414:1: '{'
            {
             before(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,17,FOLLOW_17_in_rule__Model__Group__2__Impl816); 
             after(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2__Impl"


    // $ANTLR start "rule__Model__Group__3"
    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:427:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:431:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:432:2: rule__Model__Group__3__Impl rule__Model__Group__4
            {
            pushFollow(FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__3847);
            rule__Model__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__4_in_rule__Model__Group__3850);
            rule__Model__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__3"


    // $ANTLR start "rule__Model__Group__3__Impl"
    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:439:1: rule__Model__Group__3__Impl : ( ( rule__Model__FoldersAssignment_3 )* ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:443:1: ( ( ( rule__Model__FoldersAssignment_3 )* ) )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:444:1: ( ( rule__Model__FoldersAssignment_3 )* )
            {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:444:1: ( ( rule__Model__FoldersAssignment_3 )* )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:445:1: ( rule__Model__FoldersAssignment_3 )*
            {
             before(grammarAccess.getModelAccess().getFoldersAssignment_3()); 
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:446:1: ( rule__Model__FoldersAssignment_3 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==19) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:446:2: rule__Model__FoldersAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Model__FoldersAssignment_3_in_rule__Model__Group__3__Impl877);
            	    rule__Model__FoldersAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getFoldersAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__3__Impl"


    // $ANTLR start "rule__Model__Group__4"
    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:456:1: rule__Model__Group__4 : rule__Model__Group__4__Impl ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:460:1: ( rule__Model__Group__4__Impl )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:461:2: rule__Model__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__4908);
            rule__Model__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__4"


    // $ANTLR start "rule__Model__Group__4__Impl"
    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:467:1: rule__Model__Group__4__Impl : ( '}' ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:471:1: ( ( '}' ) )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:472:1: ( '}' )
            {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:472:1: ( '}' )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:473:1: '}'
            {
             before(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_4()); 
            match(input,18,FOLLOW_18_in_rule__Model__Group__4__Impl936); 
             after(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__4__Impl"


    // $ANTLR start "rule__Folder__Group__0"
    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:496:1: rule__Folder__Group__0 : rule__Folder__Group__0__Impl rule__Folder__Group__1 ;
    public final void rule__Folder__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:500:1: ( rule__Folder__Group__0__Impl rule__Folder__Group__1 )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:501:2: rule__Folder__Group__0__Impl rule__Folder__Group__1
            {
            pushFollow(FOLLOW_rule__Folder__Group__0__Impl_in_rule__Folder__Group__0977);
            rule__Folder__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Folder__Group__1_in_rule__Folder__Group__0980);
            rule__Folder__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Folder__Group__0"


    // $ANTLR start "rule__Folder__Group__0__Impl"
    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:508:1: rule__Folder__Group__0__Impl : ( 'folder' ) ;
    public final void rule__Folder__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:512:1: ( ( 'folder' ) )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:513:1: ( 'folder' )
            {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:513:1: ( 'folder' )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:514:1: 'folder'
            {
             before(grammarAccess.getFolderAccess().getFolderKeyword_0()); 
            match(input,19,FOLLOW_19_in_rule__Folder__Group__0__Impl1008); 
             after(grammarAccess.getFolderAccess().getFolderKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Folder__Group__0__Impl"


    // $ANTLR start "rule__Folder__Group__1"
    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:527:1: rule__Folder__Group__1 : rule__Folder__Group__1__Impl rule__Folder__Group__2 ;
    public final void rule__Folder__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:531:1: ( rule__Folder__Group__1__Impl rule__Folder__Group__2 )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:532:2: rule__Folder__Group__1__Impl rule__Folder__Group__2
            {
            pushFollow(FOLLOW_rule__Folder__Group__1__Impl_in_rule__Folder__Group__11039);
            rule__Folder__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Folder__Group__2_in_rule__Folder__Group__11042);
            rule__Folder__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Folder__Group__1"


    // $ANTLR start "rule__Folder__Group__1__Impl"
    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:539:1: rule__Folder__Group__1__Impl : ( ( rule__Folder__NameAssignment_1 ) ) ;
    public final void rule__Folder__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:543:1: ( ( ( rule__Folder__NameAssignment_1 ) ) )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:544:1: ( ( rule__Folder__NameAssignment_1 ) )
            {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:544:1: ( ( rule__Folder__NameAssignment_1 ) )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:545:1: ( rule__Folder__NameAssignment_1 )
            {
             before(grammarAccess.getFolderAccess().getNameAssignment_1()); 
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:546:1: ( rule__Folder__NameAssignment_1 )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:546:2: rule__Folder__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Folder__NameAssignment_1_in_rule__Folder__Group__1__Impl1069);
            rule__Folder__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFolderAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Folder__Group__1__Impl"


    // $ANTLR start "rule__Folder__Group__2"
    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:556:1: rule__Folder__Group__2 : rule__Folder__Group__2__Impl rule__Folder__Group__3 ;
    public final void rule__Folder__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:560:1: ( rule__Folder__Group__2__Impl rule__Folder__Group__3 )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:561:2: rule__Folder__Group__2__Impl rule__Folder__Group__3
            {
            pushFollow(FOLLOW_rule__Folder__Group__2__Impl_in_rule__Folder__Group__21099);
            rule__Folder__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Folder__Group__3_in_rule__Folder__Group__21102);
            rule__Folder__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Folder__Group__2"


    // $ANTLR start "rule__Folder__Group__2__Impl"
    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:568:1: rule__Folder__Group__2__Impl : ( '{' ) ;
    public final void rule__Folder__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:572:1: ( ( '{' ) )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:573:1: ( '{' )
            {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:573:1: ( '{' )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:574:1: '{'
            {
             before(grammarAccess.getFolderAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,17,FOLLOW_17_in_rule__Folder__Group__2__Impl1130); 
             after(grammarAccess.getFolderAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Folder__Group__2__Impl"


    // $ANTLR start "rule__Folder__Group__3"
    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:587:1: rule__Folder__Group__3 : rule__Folder__Group__3__Impl rule__Folder__Group__4 ;
    public final void rule__Folder__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:591:1: ( rule__Folder__Group__3__Impl rule__Folder__Group__4 )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:592:2: rule__Folder__Group__3__Impl rule__Folder__Group__4
            {
            pushFollow(FOLLOW_rule__Folder__Group__3__Impl_in_rule__Folder__Group__31161);
            rule__Folder__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Folder__Group__4_in_rule__Folder__Group__31164);
            rule__Folder__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Folder__Group__3"


    // $ANTLR start "rule__Folder__Group__3__Impl"
    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:599:1: rule__Folder__Group__3__Impl : ( ( rule__Folder__ModuleAssignment_3 )* ) ;
    public final void rule__Folder__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:603:1: ( ( ( rule__Folder__ModuleAssignment_3 )* ) )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:604:1: ( ( rule__Folder__ModuleAssignment_3 )* )
            {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:604:1: ( ( rule__Folder__ModuleAssignment_3 )* )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:605:1: ( rule__Folder__ModuleAssignment_3 )*
            {
             before(grammarAccess.getFolderAccess().getModuleAssignment_3()); 
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:606:1: ( rule__Folder__ModuleAssignment_3 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==20) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:606:2: rule__Folder__ModuleAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Folder__ModuleAssignment_3_in_rule__Folder__Group__3__Impl1191);
            	    rule__Folder__ModuleAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getFolderAccess().getModuleAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Folder__Group__3__Impl"


    // $ANTLR start "rule__Folder__Group__4"
    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:616:1: rule__Folder__Group__4 : rule__Folder__Group__4__Impl rule__Folder__Group__5 ;
    public final void rule__Folder__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:620:1: ( rule__Folder__Group__4__Impl rule__Folder__Group__5 )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:621:2: rule__Folder__Group__4__Impl rule__Folder__Group__5
            {
            pushFollow(FOLLOW_rule__Folder__Group__4__Impl_in_rule__Folder__Group__41222);
            rule__Folder__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Folder__Group__5_in_rule__Folder__Group__41225);
            rule__Folder__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Folder__Group__4"


    // $ANTLR start "rule__Folder__Group__4__Impl"
    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:628:1: rule__Folder__Group__4__Impl : ( ( rule__Folder__AssociationTypeAssignment_4 )* ) ;
    public final void rule__Folder__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:632:1: ( ( ( rule__Folder__AssociationTypeAssignment_4 )* ) )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:633:1: ( ( rule__Folder__AssociationTypeAssignment_4 )* )
            {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:633:1: ( ( rule__Folder__AssociationTypeAssignment_4 )* )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:634:1: ( rule__Folder__AssociationTypeAssignment_4 )*
            {
             before(grammarAccess.getFolderAccess().getAssociationTypeAssignment_4()); 
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:635:1: ( rule__Folder__AssociationTypeAssignment_4 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==24) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:635:2: rule__Folder__AssociationTypeAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Folder__AssociationTypeAssignment_4_in_rule__Folder__Group__4__Impl1252);
            	    rule__Folder__AssociationTypeAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getFolderAccess().getAssociationTypeAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Folder__Group__4__Impl"


    // $ANTLR start "rule__Folder__Group__5"
    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:645:1: rule__Folder__Group__5 : rule__Folder__Group__5__Impl ;
    public final void rule__Folder__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:649:1: ( rule__Folder__Group__5__Impl )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:650:2: rule__Folder__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Folder__Group__5__Impl_in_rule__Folder__Group__51283);
            rule__Folder__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Folder__Group__5"


    // $ANTLR start "rule__Folder__Group__5__Impl"
    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:656:1: rule__Folder__Group__5__Impl : ( '}' ) ;
    public final void rule__Folder__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:660:1: ( ( '}' ) )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:661:1: ( '}' )
            {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:661:1: ( '}' )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:662:1: '}'
            {
             before(grammarAccess.getFolderAccess().getRightCurlyBracketKeyword_5()); 
            match(input,18,FOLLOW_18_in_rule__Folder__Group__5__Impl1311); 
             after(grammarAccess.getFolderAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Folder__Group__5__Impl"


    // $ANTLR start "rule__Module__Group__0"
    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:687:1: rule__Module__Group__0 : rule__Module__Group__0__Impl rule__Module__Group__1 ;
    public final void rule__Module__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:691:1: ( rule__Module__Group__0__Impl rule__Module__Group__1 )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:692:2: rule__Module__Group__0__Impl rule__Module__Group__1
            {
            pushFollow(FOLLOW_rule__Module__Group__0__Impl_in_rule__Module__Group__01354);
            rule__Module__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group__1_in_rule__Module__Group__01357);
            rule__Module__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__0"


    // $ANTLR start "rule__Module__Group__0__Impl"
    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:699:1: rule__Module__Group__0__Impl : ( 'module' ) ;
    public final void rule__Module__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:703:1: ( ( 'module' ) )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:704:1: ( 'module' )
            {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:704:1: ( 'module' )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:705:1: 'module'
            {
             before(grammarAccess.getModuleAccess().getModuleKeyword_0()); 
            match(input,20,FOLLOW_20_in_rule__Module__Group__0__Impl1385); 
             after(grammarAccess.getModuleAccess().getModuleKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__0__Impl"


    // $ANTLR start "rule__Module__Group__1"
    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:718:1: rule__Module__Group__1 : rule__Module__Group__1__Impl rule__Module__Group__2 ;
    public final void rule__Module__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:722:1: ( rule__Module__Group__1__Impl rule__Module__Group__2 )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:723:2: rule__Module__Group__1__Impl rule__Module__Group__2
            {
            pushFollow(FOLLOW_rule__Module__Group__1__Impl_in_rule__Module__Group__11416);
            rule__Module__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group__2_in_rule__Module__Group__11419);
            rule__Module__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__1"


    // $ANTLR start "rule__Module__Group__1__Impl"
    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:730:1: rule__Module__Group__1__Impl : ( ( rule__Module__IgnoreInReportAssignment_1 )? ) ;
    public final void rule__Module__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:734:1: ( ( ( rule__Module__IgnoreInReportAssignment_1 )? ) )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:735:1: ( ( rule__Module__IgnoreInReportAssignment_1 )? )
            {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:735:1: ( ( rule__Module__IgnoreInReportAssignment_1 )? )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:736:1: ( rule__Module__IgnoreInReportAssignment_1 )?
            {
             before(grammarAccess.getModuleAccess().getIgnoreInReportAssignment_1()); 
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:737:1: ( rule__Module__IgnoreInReportAssignment_1 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==29) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:737:2: rule__Module__IgnoreInReportAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Module__IgnoreInReportAssignment_1_in_rule__Module__Group__1__Impl1446);
                    rule__Module__IgnoreInReportAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getModuleAccess().getIgnoreInReportAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__1__Impl"


    // $ANTLR start "rule__Module__Group__2"
    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:747:1: rule__Module__Group__2 : rule__Module__Group__2__Impl rule__Module__Group__3 ;
    public final void rule__Module__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:751:1: ( rule__Module__Group__2__Impl rule__Module__Group__3 )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:752:2: rule__Module__Group__2__Impl rule__Module__Group__3
            {
            pushFollow(FOLLOW_rule__Module__Group__2__Impl_in_rule__Module__Group__21477);
            rule__Module__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group__3_in_rule__Module__Group__21480);
            rule__Module__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__2"


    // $ANTLR start "rule__Module__Group__2__Impl"
    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:759:1: rule__Module__Group__2__Impl : ( ( rule__Module__NameAssignment_2 ) ) ;
    public final void rule__Module__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:763:1: ( ( ( rule__Module__NameAssignment_2 ) ) )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:764:1: ( ( rule__Module__NameAssignment_2 ) )
            {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:764:1: ( ( rule__Module__NameAssignment_2 ) )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:765:1: ( rule__Module__NameAssignment_2 )
            {
             before(grammarAccess.getModuleAccess().getNameAssignment_2()); 
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:766:1: ( rule__Module__NameAssignment_2 )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:766:2: rule__Module__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Module__NameAssignment_2_in_rule__Module__Group__2__Impl1507);
            rule__Module__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getModuleAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__2__Impl"


    // $ANTLR start "rule__Module__Group__3"
    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:776:1: rule__Module__Group__3 : rule__Module__Group__3__Impl rule__Module__Group__4 ;
    public final void rule__Module__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:780:1: ( rule__Module__Group__3__Impl rule__Module__Group__4 )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:781:2: rule__Module__Group__3__Impl rule__Module__Group__4
            {
            pushFollow(FOLLOW_rule__Module__Group__3__Impl_in_rule__Module__Group__31537);
            rule__Module__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group__4_in_rule__Module__Group__31540);
            rule__Module__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__3"


    // $ANTLR start "rule__Module__Group__3__Impl"
    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:788:1: rule__Module__Group__3__Impl : ( '{' ) ;
    public final void rule__Module__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:792:1: ( ( '{' ) )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:793:1: ( '{' )
            {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:793:1: ( '{' )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:794:1: '{'
            {
             before(grammarAccess.getModuleAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,17,FOLLOW_17_in_rule__Module__Group__3__Impl1568); 
             after(grammarAccess.getModuleAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__3__Impl"


    // $ANTLR start "rule__Module__Group__4"
    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:807:1: rule__Module__Group__4 : rule__Module__Group__4__Impl rule__Module__Group__5 ;
    public final void rule__Module__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:811:1: ( rule__Module__Group__4__Impl rule__Module__Group__5 )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:812:2: rule__Module__Group__4__Impl rule__Module__Group__5
            {
            pushFollow(FOLLOW_rule__Module__Group__4__Impl_in_rule__Module__Group__41599);
            rule__Module__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group__5_in_rule__Module__Group__41602);
            rule__Module__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__4"


    // $ANTLR start "rule__Module__Group__4__Impl"
    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:819:1: rule__Module__Group__4__Impl : ( ( rule__Module__Group_4__0 )? ) ;
    public final void rule__Module__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:823:1: ( ( ( rule__Module__Group_4__0 )? ) )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:824:1: ( ( rule__Module__Group_4__0 )? )
            {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:824:1: ( ( rule__Module__Group_4__0 )? )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:825:1: ( rule__Module__Group_4__0 )?
            {
             before(grammarAccess.getModuleAccess().getGroup_4()); 
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:826:1: ( rule__Module__Group_4__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==21) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:826:2: rule__Module__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Module__Group_4__0_in_rule__Module__Group__4__Impl1629);
                    rule__Module__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getModuleAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__4__Impl"


    // $ANTLR start "rule__Module__Group__5"
    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:836:1: rule__Module__Group__5 : rule__Module__Group__5__Impl rule__Module__Group__6 ;
    public final void rule__Module__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:840:1: ( rule__Module__Group__5__Impl rule__Module__Group__6 )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:841:2: rule__Module__Group__5__Impl rule__Module__Group__6
            {
            pushFollow(FOLLOW_rule__Module__Group__5__Impl_in_rule__Module__Group__51660);
            rule__Module__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group__6_in_rule__Module__Group__51663);
            rule__Module__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__5"


    // $ANTLR start "rule__Module__Group__5__Impl"
    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:848:1: rule__Module__Group__5__Impl : ( ( rule__Module__ClassesAssignment_5 )* ) ;
    public final void rule__Module__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:852:1: ( ( ( rule__Module__ClassesAssignment_5 )* ) )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:853:1: ( ( rule__Module__ClassesAssignment_5 )* )
            {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:853:1: ( ( rule__Module__ClassesAssignment_5 )* )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:854:1: ( rule__Module__ClassesAssignment_5 )*
            {
             before(grammarAccess.getModuleAccess().getClassesAssignment_5()); 
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:855:1: ( rule__Module__ClassesAssignment_5 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==22) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:855:2: rule__Module__ClassesAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__Module__ClassesAssignment_5_in_rule__Module__Group__5__Impl1690);
            	    rule__Module__ClassesAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getModuleAccess().getClassesAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__5__Impl"


    // $ANTLR start "rule__Module__Group__6"
    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:865:1: rule__Module__Group__6 : rule__Module__Group__6__Impl ;
    public final void rule__Module__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:869:1: ( rule__Module__Group__6__Impl )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:870:2: rule__Module__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Module__Group__6__Impl_in_rule__Module__Group__61721);
            rule__Module__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__6"


    // $ANTLR start "rule__Module__Group__6__Impl"
    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:876:1: rule__Module__Group__6__Impl : ( '}' ) ;
    public final void rule__Module__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:880:1: ( ( '}' ) )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:881:1: ( '}' )
            {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:881:1: ( '}' )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:882:1: '}'
            {
             before(grammarAccess.getModuleAccess().getRightCurlyBracketKeyword_6()); 
            match(input,18,FOLLOW_18_in_rule__Module__Group__6__Impl1749); 
             after(grammarAccess.getModuleAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__6__Impl"


    // $ANTLR start "rule__Module__Group_4__0"
    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:909:1: rule__Module__Group_4__0 : rule__Module__Group_4__0__Impl rule__Module__Group_4__1 ;
    public final void rule__Module__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:913:1: ( rule__Module__Group_4__0__Impl rule__Module__Group_4__1 )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:914:2: rule__Module__Group_4__0__Impl rule__Module__Group_4__1
            {
            pushFollow(FOLLOW_rule__Module__Group_4__0__Impl_in_rule__Module__Group_4__01794);
            rule__Module__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group_4__1_in_rule__Module__Group_4__01797);
            rule__Module__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group_4__0"


    // $ANTLR start "rule__Module__Group_4__0__Impl"
    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:921:1: rule__Module__Group_4__0__Impl : ( 'fileName' ) ;
    public final void rule__Module__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:925:1: ( ( 'fileName' ) )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:926:1: ( 'fileName' )
            {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:926:1: ( 'fileName' )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:927:1: 'fileName'
            {
             before(grammarAccess.getModuleAccess().getFileNameKeyword_4_0()); 
            match(input,21,FOLLOW_21_in_rule__Module__Group_4__0__Impl1825); 
             after(grammarAccess.getModuleAccess().getFileNameKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group_4__0__Impl"


    // $ANTLR start "rule__Module__Group_4__1"
    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:940:1: rule__Module__Group_4__1 : rule__Module__Group_4__1__Impl ;
    public final void rule__Module__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:944:1: ( rule__Module__Group_4__1__Impl )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:945:2: rule__Module__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Module__Group_4__1__Impl_in_rule__Module__Group_4__11856);
            rule__Module__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group_4__1"


    // $ANTLR start "rule__Module__Group_4__1__Impl"
    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:951:1: rule__Module__Group_4__1__Impl : ( ( rule__Module__FileNameAssignment_4_1 ) ) ;
    public final void rule__Module__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:955:1: ( ( ( rule__Module__FileNameAssignment_4_1 ) ) )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:956:1: ( ( rule__Module__FileNameAssignment_4_1 ) )
            {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:956:1: ( ( rule__Module__FileNameAssignment_4_1 ) )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:957:1: ( rule__Module__FileNameAssignment_4_1 )
            {
             before(grammarAccess.getModuleAccess().getFileNameAssignment_4_1()); 
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:958:1: ( rule__Module__FileNameAssignment_4_1 )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:958:2: rule__Module__FileNameAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Module__FileNameAssignment_4_1_in_rule__Module__Group_4__1__Impl1883);
            rule__Module__FileNameAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getModuleAccess().getFileNameAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group_4__1__Impl"


    // $ANTLR start "rule__Class__Group__0"
    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:972:1: rule__Class__Group__0 : rule__Class__Group__0__Impl rule__Class__Group__1 ;
    public final void rule__Class__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:976:1: ( rule__Class__Group__0__Impl rule__Class__Group__1 )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:977:2: rule__Class__Group__0__Impl rule__Class__Group__1
            {
            pushFollow(FOLLOW_rule__Class__Group__0__Impl_in_rule__Class__Group__01917);
            rule__Class__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Class__Group__1_in_rule__Class__Group__01920);
            rule__Class__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__0"


    // $ANTLR start "rule__Class__Group__0__Impl"
    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:984:1: rule__Class__Group__0__Impl : ( 'class' ) ;
    public final void rule__Class__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:988:1: ( ( 'class' ) )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:989:1: ( 'class' )
            {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:989:1: ( 'class' )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:990:1: 'class'
            {
             before(grammarAccess.getClassAccess().getClassKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__Class__Group__0__Impl1948); 
             after(grammarAccess.getClassAccess().getClassKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__0__Impl"


    // $ANTLR start "rule__Class__Group__1"
    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1003:1: rule__Class__Group__1 : rule__Class__Group__1__Impl rule__Class__Group__2 ;
    public final void rule__Class__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1007:1: ( rule__Class__Group__1__Impl rule__Class__Group__2 )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1008:2: rule__Class__Group__1__Impl rule__Class__Group__2
            {
            pushFollow(FOLLOW_rule__Class__Group__1__Impl_in_rule__Class__Group__11979);
            rule__Class__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Class__Group__2_in_rule__Class__Group__11982);
            rule__Class__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__1"


    // $ANTLR start "rule__Class__Group__1__Impl"
    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1015:1: rule__Class__Group__1__Impl : ( ( rule__Class__NoDescriptionAssignment_1 )? ) ;
    public final void rule__Class__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1019:1: ( ( ( rule__Class__NoDescriptionAssignment_1 )? ) )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1020:1: ( ( rule__Class__NoDescriptionAssignment_1 )? )
            {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1020:1: ( ( rule__Class__NoDescriptionAssignment_1 )? )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1021:1: ( rule__Class__NoDescriptionAssignment_1 )?
            {
             before(grammarAccess.getClassAccess().getNoDescriptionAssignment_1()); 
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1022:1: ( rule__Class__NoDescriptionAssignment_1 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==30) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1022:2: rule__Class__NoDescriptionAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Class__NoDescriptionAssignment_1_in_rule__Class__Group__1__Impl2009);
                    rule__Class__NoDescriptionAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClassAccess().getNoDescriptionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__1__Impl"


    // $ANTLR start "rule__Class__Group__2"
    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1032:1: rule__Class__Group__2 : rule__Class__Group__2__Impl rule__Class__Group__3 ;
    public final void rule__Class__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1036:1: ( rule__Class__Group__2__Impl rule__Class__Group__3 )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1037:2: rule__Class__Group__2__Impl rule__Class__Group__3
            {
            pushFollow(FOLLOW_rule__Class__Group__2__Impl_in_rule__Class__Group__22040);
            rule__Class__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Class__Group__3_in_rule__Class__Group__22043);
            rule__Class__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__2"


    // $ANTLR start "rule__Class__Group__2__Impl"
    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1044:1: rule__Class__Group__2__Impl : ( ( rule__Class__NameAssignment_2 ) ) ;
    public final void rule__Class__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1048:1: ( ( ( rule__Class__NameAssignment_2 ) ) )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1049:1: ( ( rule__Class__NameAssignment_2 ) )
            {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1049:1: ( ( rule__Class__NameAssignment_2 ) )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1050:1: ( rule__Class__NameAssignment_2 )
            {
             before(grammarAccess.getClassAccess().getNameAssignment_2()); 
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1051:1: ( rule__Class__NameAssignment_2 )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1051:2: rule__Class__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Class__NameAssignment_2_in_rule__Class__Group__2__Impl2070);
            rule__Class__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__2__Impl"


    // $ANTLR start "rule__Class__Group__3"
    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1061:1: rule__Class__Group__3 : rule__Class__Group__3__Impl rule__Class__Group__4 ;
    public final void rule__Class__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1065:1: ( rule__Class__Group__3__Impl rule__Class__Group__4 )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1066:2: rule__Class__Group__3__Impl rule__Class__Group__4
            {
            pushFollow(FOLLOW_rule__Class__Group__3__Impl_in_rule__Class__Group__32100);
            rule__Class__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Class__Group__4_in_rule__Class__Group__32103);
            rule__Class__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__3"


    // $ANTLR start "rule__Class__Group__3__Impl"
    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1073:1: rule__Class__Group__3__Impl : ( ( rule__Class__Group_3__0 )? ) ;
    public final void rule__Class__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1077:1: ( ( ( rule__Class__Group_3__0 )? ) )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1078:1: ( ( rule__Class__Group_3__0 )? )
            {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1078:1: ( ( rule__Class__Group_3__0 )? )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1079:1: ( rule__Class__Group_3__0 )?
            {
             before(grammarAccess.getClassAccess().getGroup_3()); 
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1080:1: ( rule__Class__Group_3__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==23) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1080:2: rule__Class__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Class__Group_3__0_in_rule__Class__Group__3__Impl2130);
                    rule__Class__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClassAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__3__Impl"


    // $ANTLR start "rule__Class__Group__4"
    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1090:1: rule__Class__Group__4 : rule__Class__Group__4__Impl rule__Class__Group__5 ;
    public final void rule__Class__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1094:1: ( rule__Class__Group__4__Impl rule__Class__Group__5 )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1095:2: rule__Class__Group__4__Impl rule__Class__Group__5
            {
            pushFollow(FOLLOW_rule__Class__Group__4__Impl_in_rule__Class__Group__42161);
            rule__Class__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Class__Group__5_in_rule__Class__Group__42164);
            rule__Class__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__4"


    // $ANTLR start "rule__Class__Group__4__Impl"
    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1102:1: rule__Class__Group__4__Impl : ( '{' ) ;
    public final void rule__Class__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1106:1: ( ( '{' ) )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1107:1: ( '{' )
            {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1107:1: ( '{' )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1108:1: '{'
            {
             before(grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,17,FOLLOW_17_in_rule__Class__Group__4__Impl2192); 
             after(grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__4__Impl"


    // $ANTLR start "rule__Class__Group__5"
    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1121:1: rule__Class__Group__5 : rule__Class__Group__5__Impl rule__Class__Group__6 ;
    public final void rule__Class__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1125:1: ( rule__Class__Group__5__Impl rule__Class__Group__6 )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1126:2: rule__Class__Group__5__Impl rule__Class__Group__6
            {
            pushFollow(FOLLOW_rule__Class__Group__5__Impl_in_rule__Class__Group__52223);
            rule__Class__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Class__Group__6_in_rule__Class__Group__52226);
            rule__Class__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__5"


    // $ANTLR start "rule__Class__Group__5__Impl"
    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1133:1: rule__Class__Group__5__Impl : ( ( rule__Class__AttributesAssignment_5 )* ) ;
    public final void rule__Class__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1137:1: ( ( ( rule__Class__AttributesAssignment_5 )* ) )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1138:1: ( ( rule__Class__AttributesAssignment_5 )* )
            {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1138:1: ( ( rule__Class__AttributesAssignment_5 )* )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1139:1: ( rule__Class__AttributesAssignment_5 )*
            {
             before(grammarAccess.getClassAccess().getAttributesAssignment_5()); 
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1140:1: ( rule__Class__AttributesAssignment_5 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=11 && LA10_0<=15)||LA10_0==31) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1140:2: rule__Class__AttributesAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__Class__AttributesAssignment_5_in_rule__Class__Group__5__Impl2253);
            	    rule__Class__AttributesAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getClassAccess().getAttributesAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__5__Impl"


    // $ANTLR start "rule__Class__Group__6"
    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1150:1: rule__Class__Group__6 : rule__Class__Group__6__Impl rule__Class__Group__7 ;
    public final void rule__Class__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1154:1: ( rule__Class__Group__6__Impl rule__Class__Group__7 )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1155:2: rule__Class__Group__6__Impl rule__Class__Group__7
            {
            pushFollow(FOLLOW_rule__Class__Group__6__Impl_in_rule__Class__Group__62284);
            rule__Class__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Class__Group__7_in_rule__Class__Group__62287);
            rule__Class__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__6"


    // $ANTLR start "rule__Class__Group__6__Impl"
    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1162:1: rule__Class__Group__6__Impl : ( ( rule__Class__AssociationsAssignment_6 )* ) ;
    public final void rule__Class__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1166:1: ( ( ( rule__Class__AssociationsAssignment_6 )* ) )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1167:1: ( ( rule__Class__AssociationsAssignment_6 )* )
            {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1167:1: ( ( rule__Class__AssociationsAssignment_6 )* )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1168:1: ( rule__Class__AssociationsAssignment_6 )*
            {
             before(grammarAccess.getClassAccess().getAssociationsAssignment_6()); 
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1169:1: ( rule__Class__AssociationsAssignment_6 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==25) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1169:2: rule__Class__AssociationsAssignment_6
            	    {
            	    pushFollow(FOLLOW_rule__Class__AssociationsAssignment_6_in_rule__Class__Group__6__Impl2314);
            	    rule__Class__AssociationsAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getClassAccess().getAssociationsAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__6__Impl"


    // $ANTLR start "rule__Class__Group__7"
    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1179:1: rule__Class__Group__7 : rule__Class__Group__7__Impl ;
    public final void rule__Class__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1183:1: ( rule__Class__Group__7__Impl )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1184:2: rule__Class__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__Class__Group__7__Impl_in_rule__Class__Group__72345);
            rule__Class__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__7"


    // $ANTLR start "rule__Class__Group__7__Impl"
    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1190:1: rule__Class__Group__7__Impl : ( '}' ) ;
    public final void rule__Class__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1194:1: ( ( '}' ) )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1195:1: ( '}' )
            {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1195:1: ( '}' )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1196:1: '}'
            {
             before(grammarAccess.getClassAccess().getRightCurlyBracketKeyword_7()); 
            match(input,18,FOLLOW_18_in_rule__Class__Group__7__Impl2373); 
             after(grammarAccess.getClassAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__7__Impl"


    // $ANTLR start "rule__Class__Group_3__0"
    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1225:1: rule__Class__Group_3__0 : rule__Class__Group_3__0__Impl rule__Class__Group_3__1 ;
    public final void rule__Class__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1229:1: ( rule__Class__Group_3__0__Impl rule__Class__Group_3__1 )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1230:2: rule__Class__Group_3__0__Impl rule__Class__Group_3__1
            {
            pushFollow(FOLLOW_rule__Class__Group_3__0__Impl_in_rule__Class__Group_3__02420);
            rule__Class__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Class__Group_3__1_in_rule__Class__Group_3__02423);
            rule__Class__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_3__0"


    // $ANTLR start "rule__Class__Group_3__0__Impl"
    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1237:1: rule__Class__Group_3__0__Impl : ( 'shows as' ) ;
    public final void rule__Class__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1241:1: ( ( 'shows as' ) )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1242:1: ( 'shows as' )
            {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1242:1: ( 'shows as' )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1243:1: 'shows as'
            {
             before(grammarAccess.getClassAccess().getShowsAsKeyword_3_0()); 
            match(input,23,FOLLOW_23_in_rule__Class__Group_3__0__Impl2451); 
             after(grammarAccess.getClassAccess().getShowsAsKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_3__0__Impl"


    // $ANTLR start "rule__Class__Group_3__1"
    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1256:1: rule__Class__Group_3__1 : rule__Class__Group_3__1__Impl ;
    public final void rule__Class__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1260:1: ( rule__Class__Group_3__1__Impl )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1261:2: rule__Class__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Class__Group_3__1__Impl_in_rule__Class__Group_3__12482);
            rule__Class__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_3__1"


    // $ANTLR start "rule__Class__Group_3__1__Impl"
    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1267:1: rule__Class__Group_3__1__Impl : ( ( rule__Class__ClassTypeDescriptionAssignment_3_1 ) ) ;
    public final void rule__Class__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1271:1: ( ( ( rule__Class__ClassTypeDescriptionAssignment_3_1 ) ) )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1272:1: ( ( rule__Class__ClassTypeDescriptionAssignment_3_1 ) )
            {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1272:1: ( ( rule__Class__ClassTypeDescriptionAssignment_3_1 ) )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1273:1: ( rule__Class__ClassTypeDescriptionAssignment_3_1 )
            {
             before(grammarAccess.getClassAccess().getClassTypeDescriptionAssignment_3_1()); 
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1274:1: ( rule__Class__ClassTypeDescriptionAssignment_3_1 )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1274:2: rule__Class__ClassTypeDescriptionAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Class__ClassTypeDescriptionAssignment_3_1_in_rule__Class__Group_3__1__Impl2509);
            rule__Class__ClassTypeDescriptionAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getClassTypeDescriptionAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_3__1__Impl"


    // $ANTLR start "rule__Attribute__Group__0"
    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1288:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1292:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1293:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__02543);
            rule__Attribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__02546);
            rule__Attribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0"


    // $ANTLR start "rule__Attribute__Group__0__Impl"
    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1300:1: rule__Attribute__Group__0__Impl : ( ( rule__Attribute__IgnoredAssignment_0 )? ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1304:1: ( ( ( rule__Attribute__IgnoredAssignment_0 )? ) )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1305:1: ( ( rule__Attribute__IgnoredAssignment_0 )? )
            {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1305:1: ( ( rule__Attribute__IgnoredAssignment_0 )? )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1306:1: ( rule__Attribute__IgnoredAssignment_0 )?
            {
             before(grammarAccess.getAttributeAccess().getIgnoredAssignment_0()); 
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1307:1: ( rule__Attribute__IgnoredAssignment_0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==31) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1307:2: rule__Attribute__IgnoredAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Attribute__IgnoredAssignment_0_in_rule__Attribute__Group__0__Impl2573);
                    rule__Attribute__IgnoredAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeAccess().getIgnoredAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0__Impl"


    // $ANTLR start "rule__Attribute__Group__1"
    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1317:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1321:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1322:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__12604);
            rule__Attribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__12607);
            rule__Attribute__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1"


    // $ANTLR start "rule__Attribute__Group__1__Impl"
    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1329:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__TypeAssignment_1 ) ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1333:1: ( ( ( rule__Attribute__TypeAssignment_1 ) ) )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1334:1: ( ( rule__Attribute__TypeAssignment_1 ) )
            {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1334:1: ( ( rule__Attribute__TypeAssignment_1 ) )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1335:1: ( rule__Attribute__TypeAssignment_1 )
            {
             before(grammarAccess.getAttributeAccess().getTypeAssignment_1()); 
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1336:1: ( rule__Attribute__TypeAssignment_1 )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1336:2: rule__Attribute__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__Attribute__TypeAssignment_1_in_rule__Attribute__Group__1__Impl2634);
            rule__Attribute__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1__Impl"


    // $ANTLR start "rule__Attribute__Group__2"
    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1346:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl rule__Attribute__Group__3 ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1350:1: ( rule__Attribute__Group__2__Impl rule__Attribute__Group__3 )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1351:2: rule__Attribute__Group__2__Impl rule__Attribute__Group__3
            {
            pushFollow(FOLLOW_rule__Attribute__Group__2__Impl_in_rule__Attribute__Group__22664);
            rule__Attribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group__3_in_rule__Attribute__Group__22667);
            rule__Attribute__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__2"


    // $ANTLR start "rule__Attribute__Group__2__Impl"
    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1358:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__NameAssignment_2 ) ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1362:1: ( ( ( rule__Attribute__NameAssignment_2 ) ) )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1363:1: ( ( rule__Attribute__NameAssignment_2 ) )
            {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1363:1: ( ( rule__Attribute__NameAssignment_2 ) )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1364:1: ( rule__Attribute__NameAssignment_2 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_2()); 
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1365:1: ( rule__Attribute__NameAssignment_2 )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1365:2: rule__Attribute__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Attribute__NameAssignment_2_in_rule__Attribute__Group__2__Impl2694);
            rule__Attribute__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__2__Impl"


    // $ANTLR start "rule__Attribute__Group__3"
    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1375:1: rule__Attribute__Group__3 : rule__Attribute__Group__3__Impl ;
    public final void rule__Attribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1379:1: ( rule__Attribute__Group__3__Impl )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1380:2: rule__Attribute__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Attribute__Group__3__Impl_in_rule__Attribute__Group__32724);
            rule__Attribute__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__3"


    // $ANTLR start "rule__Attribute__Group__3__Impl"
    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1386:1: rule__Attribute__Group__3__Impl : ( ( rule__Attribute__Group_3__0 )? ) ;
    public final void rule__Attribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1390:1: ( ( ( rule__Attribute__Group_3__0 )? ) )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1391:1: ( ( rule__Attribute__Group_3__0 )? )
            {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1391:1: ( ( rule__Attribute__Group_3__0 )? )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1392:1: ( rule__Attribute__Group_3__0 )?
            {
             before(grammarAccess.getAttributeAccess().getGroup_3()); 
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1393:1: ( rule__Attribute__Group_3__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==23) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1393:2: rule__Attribute__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Attribute__Group_3__0_in_rule__Attribute__Group__3__Impl2751);
                    rule__Attribute__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__3__Impl"


    // $ANTLR start "rule__Attribute__Group_3__0"
    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1411:1: rule__Attribute__Group_3__0 : rule__Attribute__Group_3__0__Impl rule__Attribute__Group_3__1 ;
    public final void rule__Attribute__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1415:1: ( rule__Attribute__Group_3__0__Impl rule__Attribute__Group_3__1 )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1416:2: rule__Attribute__Group_3__0__Impl rule__Attribute__Group_3__1
            {
            pushFollow(FOLLOW_rule__Attribute__Group_3__0__Impl_in_rule__Attribute__Group_3__02790);
            rule__Attribute__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group_3__1_in_rule__Attribute__Group_3__02793);
            rule__Attribute__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_3__0"


    // $ANTLR start "rule__Attribute__Group_3__0__Impl"
    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1423:1: rule__Attribute__Group_3__0__Impl : ( 'shows as' ) ;
    public final void rule__Attribute__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1427:1: ( ( 'shows as' ) )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1428:1: ( 'shows as' )
            {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1428:1: ( 'shows as' )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1429:1: 'shows as'
            {
             before(grammarAccess.getAttributeAccess().getShowsAsKeyword_3_0()); 
            match(input,23,FOLLOW_23_in_rule__Attribute__Group_3__0__Impl2821); 
             after(grammarAccess.getAttributeAccess().getShowsAsKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_3__0__Impl"


    // $ANTLR start "rule__Attribute__Group_3__1"
    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1442:1: rule__Attribute__Group_3__1 : rule__Attribute__Group_3__1__Impl ;
    public final void rule__Attribute__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1446:1: ( rule__Attribute__Group_3__1__Impl )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1447:2: rule__Attribute__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Attribute__Group_3__1__Impl_in_rule__Attribute__Group_3__12852);
            rule__Attribute__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_3__1"


    // $ANTLR start "rule__Attribute__Group_3__1__Impl"
    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1453:1: rule__Attribute__Group_3__1__Impl : ( ( rule__Attribute__DefaultAssignment_3_1 ) ) ;
    public final void rule__Attribute__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1457:1: ( ( ( rule__Attribute__DefaultAssignment_3_1 ) ) )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1458:1: ( ( rule__Attribute__DefaultAssignment_3_1 ) )
            {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1458:1: ( ( rule__Attribute__DefaultAssignment_3_1 ) )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1459:1: ( rule__Attribute__DefaultAssignment_3_1 )
            {
             before(grammarAccess.getAttributeAccess().getDefaultAssignment_3_1()); 
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1460:1: ( rule__Attribute__DefaultAssignment_3_1 )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1460:2: rule__Attribute__DefaultAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Attribute__DefaultAssignment_3_1_in_rule__Attribute__Group_3__1__Impl2879);
            rule__Attribute__DefaultAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getDefaultAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_3__1__Impl"


    // $ANTLR start "rule__AssociationType__Group__0"
    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1474:1: rule__AssociationType__Group__0 : rule__AssociationType__Group__0__Impl rule__AssociationType__Group__1 ;
    public final void rule__AssociationType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1478:1: ( rule__AssociationType__Group__0__Impl rule__AssociationType__Group__1 )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1479:2: rule__AssociationType__Group__0__Impl rule__AssociationType__Group__1
            {
            pushFollow(FOLLOW_rule__AssociationType__Group__0__Impl_in_rule__AssociationType__Group__02913);
            rule__AssociationType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AssociationType__Group__1_in_rule__AssociationType__Group__02916);
            rule__AssociationType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationType__Group__0"


    // $ANTLR start "rule__AssociationType__Group__0__Impl"
    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1486:1: rule__AssociationType__Group__0__Impl : ( 'associationType' ) ;
    public final void rule__AssociationType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1490:1: ( ( 'associationType' ) )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1491:1: ( 'associationType' )
            {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1491:1: ( 'associationType' )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1492:1: 'associationType'
            {
             before(grammarAccess.getAssociationTypeAccess().getAssociationTypeKeyword_0()); 
            match(input,24,FOLLOW_24_in_rule__AssociationType__Group__0__Impl2944); 
             after(grammarAccess.getAssociationTypeAccess().getAssociationTypeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationType__Group__0__Impl"


    // $ANTLR start "rule__AssociationType__Group__1"
    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1505:1: rule__AssociationType__Group__1 : rule__AssociationType__Group__1__Impl rule__AssociationType__Group__2 ;
    public final void rule__AssociationType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1509:1: ( rule__AssociationType__Group__1__Impl rule__AssociationType__Group__2 )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1510:2: rule__AssociationType__Group__1__Impl rule__AssociationType__Group__2
            {
            pushFollow(FOLLOW_rule__AssociationType__Group__1__Impl_in_rule__AssociationType__Group__12975);
            rule__AssociationType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AssociationType__Group__2_in_rule__AssociationType__Group__12978);
            rule__AssociationType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationType__Group__1"


    // $ANTLR start "rule__AssociationType__Group__1__Impl"
    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1517:1: rule__AssociationType__Group__1__Impl : ( ( rule__AssociationType__NameAssignment_1 ) ) ;
    public final void rule__AssociationType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1521:1: ( ( ( rule__AssociationType__NameAssignment_1 ) ) )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1522:1: ( ( rule__AssociationType__NameAssignment_1 ) )
            {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1522:1: ( ( rule__AssociationType__NameAssignment_1 ) )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1523:1: ( rule__AssociationType__NameAssignment_1 )
            {
             before(grammarAccess.getAssociationTypeAccess().getNameAssignment_1()); 
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1524:1: ( rule__AssociationType__NameAssignment_1 )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1524:2: rule__AssociationType__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__AssociationType__NameAssignment_1_in_rule__AssociationType__Group__1__Impl3005);
            rule__AssociationType__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAssociationTypeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationType__Group__1__Impl"


    // $ANTLR start "rule__AssociationType__Group__2"
    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1534:1: rule__AssociationType__Group__2 : rule__AssociationType__Group__2__Impl ;
    public final void rule__AssociationType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1538:1: ( rule__AssociationType__Group__2__Impl )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1539:2: rule__AssociationType__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__AssociationType__Group__2__Impl_in_rule__AssociationType__Group__23035);
            rule__AssociationType__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationType__Group__2"


    // $ANTLR start "rule__AssociationType__Group__2__Impl"
    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1545:1: rule__AssociationType__Group__2__Impl : ( ( rule__AssociationType__LinkFileNameAssignment_2 ) ) ;
    public final void rule__AssociationType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1549:1: ( ( ( rule__AssociationType__LinkFileNameAssignment_2 ) ) )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1550:1: ( ( rule__AssociationType__LinkFileNameAssignment_2 ) )
            {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1550:1: ( ( rule__AssociationType__LinkFileNameAssignment_2 ) )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1551:1: ( rule__AssociationType__LinkFileNameAssignment_2 )
            {
             before(grammarAccess.getAssociationTypeAccess().getLinkFileNameAssignment_2()); 
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1552:1: ( rule__AssociationType__LinkFileNameAssignment_2 )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1552:2: rule__AssociationType__LinkFileNameAssignment_2
            {
            pushFollow(FOLLOW_rule__AssociationType__LinkFileNameAssignment_2_in_rule__AssociationType__Group__2__Impl3062);
            rule__AssociationType__LinkFileNameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAssociationTypeAccess().getLinkFileNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationType__Group__2__Impl"


    // $ANTLR start "rule__Association__Group__0"
    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1568:1: rule__Association__Group__0 : rule__Association__Group__0__Impl rule__Association__Group__1 ;
    public final void rule__Association__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1572:1: ( rule__Association__Group__0__Impl rule__Association__Group__1 )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1573:2: rule__Association__Group__0__Impl rule__Association__Group__1
            {
            pushFollow(FOLLOW_rule__Association__Group__0__Impl_in_rule__Association__Group__03098);
            rule__Association__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Association__Group__1_in_rule__Association__Group__03101);
            rule__Association__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__0"


    // $ANTLR start "rule__Association__Group__0__Impl"
    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1580:1: rule__Association__Group__0__Impl : ( 'association' ) ;
    public final void rule__Association__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1584:1: ( ( 'association' ) )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1585:1: ( 'association' )
            {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1585:1: ( 'association' )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1586:1: 'association'
            {
             before(grammarAccess.getAssociationAccess().getAssociationKeyword_0()); 
            match(input,25,FOLLOW_25_in_rule__Association__Group__0__Impl3129); 
             after(grammarAccess.getAssociationAccess().getAssociationKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__0__Impl"


    // $ANTLR start "rule__Association__Group__1"
    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1599:1: rule__Association__Group__1 : rule__Association__Group__1__Impl rule__Association__Group__2 ;
    public final void rule__Association__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1603:1: ( rule__Association__Group__1__Impl rule__Association__Group__2 )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1604:2: rule__Association__Group__1__Impl rule__Association__Group__2
            {
            pushFollow(FOLLOW_rule__Association__Group__1__Impl_in_rule__Association__Group__13160);
            rule__Association__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Association__Group__2_in_rule__Association__Group__13163);
            rule__Association__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__1"


    // $ANTLR start "rule__Association__Group__1__Impl"
    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1611:1: rule__Association__Group__1__Impl : ( ( rule__Association__NameAssignment_1 ) ) ;
    public final void rule__Association__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1615:1: ( ( ( rule__Association__NameAssignment_1 ) ) )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1616:1: ( ( rule__Association__NameAssignment_1 ) )
            {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1616:1: ( ( rule__Association__NameAssignment_1 ) )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1617:1: ( rule__Association__NameAssignment_1 )
            {
             before(grammarAccess.getAssociationAccess().getNameAssignment_1()); 
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1618:1: ( rule__Association__NameAssignment_1 )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1618:2: rule__Association__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Association__NameAssignment_1_in_rule__Association__Group__1__Impl3190);
            rule__Association__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAssociationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__1__Impl"


    // $ANTLR start "rule__Association__Group__2"
    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1628:1: rule__Association__Group__2 : rule__Association__Group__2__Impl rule__Association__Group__3 ;
    public final void rule__Association__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1632:1: ( rule__Association__Group__2__Impl rule__Association__Group__3 )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1633:2: rule__Association__Group__2__Impl rule__Association__Group__3
            {
            pushFollow(FOLLOW_rule__Association__Group__2__Impl_in_rule__Association__Group__23220);
            rule__Association__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Association__Group__3_in_rule__Association__Group__23223);
            rule__Association__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__2"


    // $ANTLR start "rule__Association__Group__2__Impl"
    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1640:1: rule__Association__Group__2__Impl : ( ':' ) ;
    public final void rule__Association__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1644:1: ( ( ':' ) )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1645:1: ( ':' )
            {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1645:1: ( ':' )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1646:1: ':'
            {
             before(grammarAccess.getAssociationAccess().getColonKeyword_2()); 
            match(input,26,FOLLOW_26_in_rule__Association__Group__2__Impl3251); 
             after(grammarAccess.getAssociationAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__2__Impl"


    // $ANTLR start "rule__Association__Group__3"
    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1659:1: rule__Association__Group__3 : rule__Association__Group__3__Impl rule__Association__Group__4 ;
    public final void rule__Association__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1663:1: ( rule__Association__Group__3__Impl rule__Association__Group__4 )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1664:2: rule__Association__Group__3__Impl rule__Association__Group__4
            {
            pushFollow(FOLLOW_rule__Association__Group__3__Impl_in_rule__Association__Group__33282);
            rule__Association__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Association__Group__4_in_rule__Association__Group__33285);
            rule__Association__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__3"


    // $ANTLR start "rule__Association__Group__3__Impl"
    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1671:1: rule__Association__Group__3__Impl : ( ( rule__Association__AssoTypeAssignment_3 ) ) ;
    public final void rule__Association__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1675:1: ( ( ( rule__Association__AssoTypeAssignment_3 ) ) )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1676:1: ( ( rule__Association__AssoTypeAssignment_3 ) )
            {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1676:1: ( ( rule__Association__AssoTypeAssignment_3 ) )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1677:1: ( rule__Association__AssoTypeAssignment_3 )
            {
             before(grammarAccess.getAssociationAccess().getAssoTypeAssignment_3()); 
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1678:1: ( rule__Association__AssoTypeAssignment_3 )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1678:2: rule__Association__AssoTypeAssignment_3
            {
            pushFollow(FOLLOW_rule__Association__AssoTypeAssignment_3_in_rule__Association__Group__3__Impl3312);
            rule__Association__AssoTypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAssociationAccess().getAssoTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__3__Impl"


    // $ANTLR start "rule__Association__Group__4"
    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1688:1: rule__Association__Group__4 : rule__Association__Group__4__Impl rule__Association__Group__5 ;
    public final void rule__Association__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1692:1: ( rule__Association__Group__4__Impl rule__Association__Group__5 )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1693:2: rule__Association__Group__4__Impl rule__Association__Group__5
            {
            pushFollow(FOLLOW_rule__Association__Group__4__Impl_in_rule__Association__Group__43342);
            rule__Association__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Association__Group__5_in_rule__Association__Group__43345);
            rule__Association__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__4"


    // $ANTLR start "rule__Association__Group__4__Impl"
    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1700:1: rule__Association__Group__4__Impl : ( 'to' ) ;
    public final void rule__Association__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1704:1: ( ( 'to' ) )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1705:1: ( 'to' )
            {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1705:1: ( 'to' )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1706:1: 'to'
            {
             before(grammarAccess.getAssociationAccess().getToKeyword_4()); 
            match(input,27,FOLLOW_27_in_rule__Association__Group__4__Impl3373); 
             after(grammarAccess.getAssociationAccess().getToKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__4__Impl"


    // $ANTLR start "rule__Association__Group__5"
    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1719:1: rule__Association__Group__5 : rule__Association__Group__5__Impl rule__Association__Group__6 ;
    public final void rule__Association__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1723:1: ( rule__Association__Group__5__Impl rule__Association__Group__6 )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1724:2: rule__Association__Group__5__Impl rule__Association__Group__6
            {
            pushFollow(FOLLOW_rule__Association__Group__5__Impl_in_rule__Association__Group__53404);
            rule__Association__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Association__Group__6_in_rule__Association__Group__53407);
            rule__Association__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__5"


    // $ANTLR start "rule__Association__Group__5__Impl"
    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1731:1: rule__Association__Group__5__Impl : ( ( rule__Association__ModuleTypeAssignment_5 ) ) ;
    public final void rule__Association__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1735:1: ( ( ( rule__Association__ModuleTypeAssignment_5 ) ) )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1736:1: ( ( rule__Association__ModuleTypeAssignment_5 ) )
            {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1736:1: ( ( rule__Association__ModuleTypeAssignment_5 ) )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1737:1: ( rule__Association__ModuleTypeAssignment_5 )
            {
             before(grammarAccess.getAssociationAccess().getModuleTypeAssignment_5()); 
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1738:1: ( rule__Association__ModuleTypeAssignment_5 )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1738:2: rule__Association__ModuleTypeAssignment_5
            {
            pushFollow(FOLLOW_rule__Association__ModuleTypeAssignment_5_in_rule__Association__Group__5__Impl3434);
            rule__Association__ModuleTypeAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getAssociationAccess().getModuleTypeAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__5__Impl"


    // $ANTLR start "rule__Association__Group__6"
    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1748:1: rule__Association__Group__6 : rule__Association__Group__6__Impl rule__Association__Group__7 ;
    public final void rule__Association__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1752:1: ( rule__Association__Group__6__Impl rule__Association__Group__7 )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1753:2: rule__Association__Group__6__Impl rule__Association__Group__7
            {
            pushFollow(FOLLOW_rule__Association__Group__6__Impl_in_rule__Association__Group__63464);
            rule__Association__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Association__Group__7_in_rule__Association__Group__63467);
            rule__Association__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__6"


    // $ANTLR start "rule__Association__Group__6__Impl"
    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1760:1: rule__Association__Group__6__Impl : ( ( rule__Association__Group_6__0 )? ) ;
    public final void rule__Association__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1764:1: ( ( ( rule__Association__Group_6__0 )? ) )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1765:1: ( ( rule__Association__Group_6__0 )? )
            {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1765:1: ( ( rule__Association__Group_6__0 )? )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1766:1: ( rule__Association__Group_6__0 )?
            {
             before(grammarAccess.getAssociationAccess().getGroup_6()); 
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1767:1: ( rule__Association__Group_6__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==28) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1767:2: rule__Association__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__Association__Group_6__0_in_rule__Association__Group__6__Impl3494);
                    rule__Association__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAssociationAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__6__Impl"


    // $ANTLR start "rule__Association__Group__7"
    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1777:1: rule__Association__Group__7 : rule__Association__Group__7__Impl ;
    public final void rule__Association__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1781:1: ( rule__Association__Group__7__Impl )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1782:2: rule__Association__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__Association__Group__7__Impl_in_rule__Association__Group__73525);
            rule__Association__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__7"


    // $ANTLR start "rule__Association__Group__7__Impl"
    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1788:1: rule__Association__Group__7__Impl : ( ( rule__Association__AssoDescriptionAssignment_7 )? ) ;
    public final void rule__Association__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1792:1: ( ( ( rule__Association__AssoDescriptionAssignment_7 )? ) )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1793:1: ( ( rule__Association__AssoDescriptionAssignment_7 )? )
            {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1793:1: ( ( rule__Association__AssoDescriptionAssignment_7 )? )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1794:1: ( rule__Association__AssoDescriptionAssignment_7 )?
            {
             before(grammarAccess.getAssociationAccess().getAssoDescriptionAssignment_7()); 
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1795:1: ( rule__Association__AssoDescriptionAssignment_7 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_STRING) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1795:2: rule__Association__AssoDescriptionAssignment_7
                    {
                    pushFollow(FOLLOW_rule__Association__AssoDescriptionAssignment_7_in_rule__Association__Group__7__Impl3552);
                    rule__Association__AssoDescriptionAssignment_7();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAssociationAccess().getAssoDescriptionAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__7__Impl"


    // $ANTLR start "rule__Association__Group_6__0"
    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1821:1: rule__Association__Group_6__0 : rule__Association__Group_6__0__Impl rule__Association__Group_6__1 ;
    public final void rule__Association__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1825:1: ( rule__Association__Group_6__0__Impl rule__Association__Group_6__1 )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1826:2: rule__Association__Group_6__0__Impl rule__Association__Group_6__1
            {
            pushFollow(FOLLOW_rule__Association__Group_6__0__Impl_in_rule__Association__Group_6__03599);
            rule__Association__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Association__Group_6__1_in_rule__Association__Group_6__03602);
            rule__Association__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group_6__0"


    // $ANTLR start "rule__Association__Group_6__0__Impl"
    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1833:1: rule__Association__Group_6__0__Impl : ( '.' ) ;
    public final void rule__Association__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1837:1: ( ( '.' ) )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1838:1: ( '.' )
            {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1838:1: ( '.' )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1839:1: '.'
            {
             before(grammarAccess.getAssociationAccess().getFullStopKeyword_6_0()); 
            match(input,28,FOLLOW_28_in_rule__Association__Group_6__0__Impl3630); 
             after(grammarAccess.getAssociationAccess().getFullStopKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group_6__0__Impl"


    // $ANTLR start "rule__Association__Group_6__1"
    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1852:1: rule__Association__Group_6__1 : rule__Association__Group_6__1__Impl ;
    public final void rule__Association__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1856:1: ( rule__Association__Group_6__1__Impl )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1857:2: rule__Association__Group_6__1__Impl
            {
            pushFollow(FOLLOW_rule__Association__Group_6__1__Impl_in_rule__Association__Group_6__13661);
            rule__Association__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group_6__1"


    // $ANTLR start "rule__Association__Group_6__1__Impl"
    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1863:1: rule__Association__Group_6__1__Impl : ( ( rule__Association__ClassTypeAssignment_6_1 ) ) ;
    public final void rule__Association__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1867:1: ( ( ( rule__Association__ClassTypeAssignment_6_1 ) ) )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1868:1: ( ( rule__Association__ClassTypeAssignment_6_1 ) )
            {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1868:1: ( ( rule__Association__ClassTypeAssignment_6_1 ) )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1869:1: ( rule__Association__ClassTypeAssignment_6_1 )
            {
             before(grammarAccess.getAssociationAccess().getClassTypeAssignment_6_1()); 
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1870:1: ( rule__Association__ClassTypeAssignment_6_1 )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1870:2: rule__Association__ClassTypeAssignment_6_1
            {
            pushFollow(FOLLOW_rule__Association__ClassTypeAssignment_6_1_in_rule__Association__Group_6__1__Impl3688);
            rule__Association__ClassTypeAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getAssociationAccess().getClassTypeAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group_6__1__Impl"


    // $ANTLR start "rule__Model__NameAssignment_1"
    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1885:1: rule__Model__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Model__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1889:1: ( ( RULE_ID ) )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1890:1: ( RULE_ID )
            {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1890:1: ( RULE_ID )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1891:1: RULE_ID
            {
             before(grammarAccess.getModelAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Model__NameAssignment_13727); 
             after(grammarAccess.getModelAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__NameAssignment_1"


    // $ANTLR start "rule__Model__FoldersAssignment_3"
    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1900:1: rule__Model__FoldersAssignment_3 : ( ruleFolder ) ;
    public final void rule__Model__FoldersAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1904:1: ( ( ruleFolder ) )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1905:1: ( ruleFolder )
            {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1905:1: ( ruleFolder )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1906:1: ruleFolder
            {
             before(grammarAccess.getModelAccess().getFoldersFolderParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleFolder_in_rule__Model__FoldersAssignment_33758);
            ruleFolder();

            state._fsp--;

             after(grammarAccess.getModelAccess().getFoldersFolderParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__FoldersAssignment_3"


    // $ANTLR start "rule__Folder__NameAssignment_1"
    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1915:1: rule__Folder__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Folder__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1919:1: ( ( RULE_ID ) )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1920:1: ( RULE_ID )
            {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1920:1: ( RULE_ID )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1921:1: RULE_ID
            {
             before(grammarAccess.getFolderAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Folder__NameAssignment_13789); 
             after(grammarAccess.getFolderAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Folder__NameAssignment_1"


    // $ANTLR start "rule__Folder__ModuleAssignment_3"
    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1930:1: rule__Folder__ModuleAssignment_3 : ( ruleModule ) ;
    public final void rule__Folder__ModuleAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1934:1: ( ( ruleModule ) )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1935:1: ( ruleModule )
            {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1935:1: ( ruleModule )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1936:1: ruleModule
            {
             before(grammarAccess.getFolderAccess().getModuleModuleParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleModule_in_rule__Folder__ModuleAssignment_33820);
            ruleModule();

            state._fsp--;

             after(grammarAccess.getFolderAccess().getModuleModuleParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Folder__ModuleAssignment_3"


    // $ANTLR start "rule__Folder__AssociationTypeAssignment_4"
    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1945:1: rule__Folder__AssociationTypeAssignment_4 : ( ruleAssociationType ) ;
    public final void rule__Folder__AssociationTypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1949:1: ( ( ruleAssociationType ) )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1950:1: ( ruleAssociationType )
            {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1950:1: ( ruleAssociationType )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1951:1: ruleAssociationType
            {
             before(grammarAccess.getFolderAccess().getAssociationTypeAssociationTypeParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleAssociationType_in_rule__Folder__AssociationTypeAssignment_43851);
            ruleAssociationType();

            state._fsp--;

             after(grammarAccess.getFolderAccess().getAssociationTypeAssociationTypeParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Folder__AssociationTypeAssignment_4"


    // $ANTLR start "rule__Module__IgnoreInReportAssignment_1"
    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1960:1: rule__Module__IgnoreInReportAssignment_1 : ( ( 'ignoreInReport' ) ) ;
    public final void rule__Module__IgnoreInReportAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1964:1: ( ( ( 'ignoreInReport' ) ) )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1965:1: ( ( 'ignoreInReport' ) )
            {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1965:1: ( ( 'ignoreInReport' ) )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1966:1: ( 'ignoreInReport' )
            {
             before(grammarAccess.getModuleAccess().getIgnoreInReportIgnoreInReportKeyword_1_0()); 
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1967:1: ( 'ignoreInReport' )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1968:1: 'ignoreInReport'
            {
             before(grammarAccess.getModuleAccess().getIgnoreInReportIgnoreInReportKeyword_1_0()); 
            match(input,29,FOLLOW_29_in_rule__Module__IgnoreInReportAssignment_13887); 
             after(grammarAccess.getModuleAccess().getIgnoreInReportIgnoreInReportKeyword_1_0()); 

            }

             after(grammarAccess.getModuleAccess().getIgnoreInReportIgnoreInReportKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__IgnoreInReportAssignment_1"


    // $ANTLR start "rule__Module__NameAssignment_2"
    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1983:1: rule__Module__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Module__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1987:1: ( ( RULE_ID ) )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1988:1: ( RULE_ID )
            {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1988:1: ( RULE_ID )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1989:1: RULE_ID
            {
             before(grammarAccess.getModuleAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Module__NameAssignment_23926); 
             after(grammarAccess.getModuleAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__NameAssignment_2"


    // $ANTLR start "rule__Module__FileNameAssignment_4_1"
    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:1998:1: rule__Module__FileNameAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__Module__FileNameAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:2002:1: ( ( RULE_STRING ) )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:2003:1: ( RULE_STRING )
            {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:2003:1: ( RULE_STRING )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:2004:1: RULE_STRING
            {
             before(grammarAccess.getModuleAccess().getFileNameSTRINGTerminalRuleCall_4_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Module__FileNameAssignment_4_13957); 
             after(grammarAccess.getModuleAccess().getFileNameSTRINGTerminalRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__FileNameAssignment_4_1"


    // $ANTLR start "rule__Module__ClassesAssignment_5"
    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:2013:1: rule__Module__ClassesAssignment_5 : ( ruleClass ) ;
    public final void rule__Module__ClassesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:2017:1: ( ( ruleClass ) )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:2018:1: ( ruleClass )
            {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:2018:1: ( ruleClass )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:2019:1: ruleClass
            {
             before(grammarAccess.getModuleAccess().getClassesClassParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleClass_in_rule__Module__ClassesAssignment_53988);
            ruleClass();

            state._fsp--;

             after(grammarAccess.getModuleAccess().getClassesClassParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__ClassesAssignment_5"


    // $ANTLR start "rule__Class__NoDescriptionAssignment_1"
    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:2028:1: rule__Class__NoDescriptionAssignment_1 : ( ( 'noDescription' ) ) ;
    public final void rule__Class__NoDescriptionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:2032:1: ( ( ( 'noDescription' ) ) )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:2033:1: ( ( 'noDescription' ) )
            {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:2033:1: ( ( 'noDescription' ) )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:2034:1: ( 'noDescription' )
            {
             before(grammarAccess.getClassAccess().getNoDescriptionNoDescriptionKeyword_1_0()); 
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:2035:1: ( 'noDescription' )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:2036:1: 'noDescription'
            {
             before(grammarAccess.getClassAccess().getNoDescriptionNoDescriptionKeyword_1_0()); 
            match(input,30,FOLLOW_30_in_rule__Class__NoDescriptionAssignment_14024); 
             after(grammarAccess.getClassAccess().getNoDescriptionNoDescriptionKeyword_1_0()); 

            }

             after(grammarAccess.getClassAccess().getNoDescriptionNoDescriptionKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__NoDescriptionAssignment_1"


    // $ANTLR start "rule__Class__NameAssignment_2"
    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:2051:1: rule__Class__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Class__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:2055:1: ( ( RULE_ID ) )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:2056:1: ( RULE_ID )
            {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:2056:1: ( RULE_ID )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:2057:1: RULE_ID
            {
             before(grammarAccess.getClassAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Class__NameAssignment_24063); 
             after(grammarAccess.getClassAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__NameAssignment_2"


    // $ANTLR start "rule__Class__ClassTypeDescriptionAssignment_3_1"
    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:2066:1: rule__Class__ClassTypeDescriptionAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__Class__ClassTypeDescriptionAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:2070:1: ( ( RULE_STRING ) )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:2071:1: ( RULE_STRING )
            {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:2071:1: ( RULE_STRING )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:2072:1: RULE_STRING
            {
             before(grammarAccess.getClassAccess().getClassTypeDescriptionSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Class__ClassTypeDescriptionAssignment_3_14094); 
             after(grammarAccess.getClassAccess().getClassTypeDescriptionSTRINGTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__ClassTypeDescriptionAssignment_3_1"


    // $ANTLR start "rule__Class__AttributesAssignment_5"
    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:2081:1: rule__Class__AttributesAssignment_5 : ( ruleAttribute ) ;
    public final void rule__Class__AttributesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:2085:1: ( ( ruleAttribute ) )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:2086:1: ( ruleAttribute )
            {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:2086:1: ( ruleAttribute )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:2087:1: ruleAttribute
            {
             before(grammarAccess.getClassAccess().getAttributesAttributeParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleAttribute_in_rule__Class__AttributesAssignment_54125);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getClassAccess().getAttributesAttributeParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__AttributesAssignment_5"


    // $ANTLR start "rule__Class__AssociationsAssignment_6"
    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:2096:1: rule__Class__AssociationsAssignment_6 : ( ruleAssociation ) ;
    public final void rule__Class__AssociationsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:2100:1: ( ( ruleAssociation ) )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:2101:1: ( ruleAssociation )
            {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:2101:1: ( ruleAssociation )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:2102:1: ruleAssociation
            {
             before(grammarAccess.getClassAccess().getAssociationsAssociationParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleAssociation_in_rule__Class__AssociationsAssignment_64156);
            ruleAssociation();

            state._fsp--;

             after(grammarAccess.getClassAccess().getAssociationsAssociationParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__AssociationsAssignment_6"


    // $ANTLR start "rule__Attribute__IgnoredAssignment_0"
    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:2111:1: rule__Attribute__IgnoredAssignment_0 : ( ( 'ignored' ) ) ;
    public final void rule__Attribute__IgnoredAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:2115:1: ( ( ( 'ignored' ) ) )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:2116:1: ( ( 'ignored' ) )
            {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:2116:1: ( ( 'ignored' ) )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:2117:1: ( 'ignored' )
            {
             before(grammarAccess.getAttributeAccess().getIgnoredIgnoredKeyword_0_0()); 
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:2118:1: ( 'ignored' )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:2119:1: 'ignored'
            {
             before(grammarAccess.getAttributeAccess().getIgnoredIgnoredKeyword_0_0()); 
            match(input,31,FOLLOW_31_in_rule__Attribute__IgnoredAssignment_04192); 
             after(grammarAccess.getAttributeAccess().getIgnoredIgnoredKeyword_0_0()); 

            }

             after(grammarAccess.getAttributeAccess().getIgnoredIgnoredKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__IgnoredAssignment_0"


    // $ANTLR start "rule__Attribute__TypeAssignment_1"
    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:2134:1: rule__Attribute__TypeAssignment_1 : ( ruleDataType ) ;
    public final void rule__Attribute__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:2138:1: ( ( ruleDataType ) )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:2139:1: ( ruleDataType )
            {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:2139:1: ( ruleDataType )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:2140:1: ruleDataType
            {
             before(grammarAccess.getAttributeAccess().getTypeDataTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleDataType_in_rule__Attribute__TypeAssignment_14231);
            ruleDataType();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getTypeDataTypeParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__TypeAssignment_1"


    // $ANTLR start "rule__Attribute__NameAssignment_2"
    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:2149:1: rule__Attribute__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Attribute__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:2153:1: ( ( RULE_STRING ) )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:2154:1: ( RULE_STRING )
            {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:2154:1: ( RULE_STRING )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:2155:1: RULE_STRING
            {
             before(grammarAccess.getAttributeAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Attribute__NameAssignment_24262); 
             after(grammarAccess.getAttributeAccess().getNameSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__NameAssignment_2"


    // $ANTLR start "rule__Attribute__DefaultAssignment_3_1"
    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:2164:1: rule__Attribute__DefaultAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__Attribute__DefaultAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:2168:1: ( ( RULE_STRING ) )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:2169:1: ( RULE_STRING )
            {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:2169:1: ( RULE_STRING )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:2170:1: RULE_STRING
            {
             before(grammarAccess.getAttributeAccess().getDefaultSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Attribute__DefaultAssignment_3_14293); 
             after(grammarAccess.getAttributeAccess().getDefaultSTRINGTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__DefaultAssignment_3_1"


    // $ANTLR start "rule__AssociationType__NameAssignment_1"
    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:2179:1: rule__AssociationType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__AssociationType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:2183:1: ( ( RULE_ID ) )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:2184:1: ( RULE_ID )
            {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:2184:1: ( RULE_ID )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:2185:1: RULE_ID
            {
             before(grammarAccess.getAssociationTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AssociationType__NameAssignment_14324); 
             after(grammarAccess.getAssociationTypeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationType__NameAssignment_1"


    // $ANTLR start "rule__AssociationType__LinkFileNameAssignment_2"
    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:2194:1: rule__AssociationType__LinkFileNameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__AssociationType__LinkFileNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:2198:1: ( ( RULE_STRING ) )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:2199:1: ( RULE_STRING )
            {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:2199:1: ( RULE_STRING )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:2200:1: RULE_STRING
            {
             before(grammarAccess.getAssociationTypeAccess().getLinkFileNameSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__AssociationType__LinkFileNameAssignment_24355); 
             after(grammarAccess.getAssociationTypeAccess().getLinkFileNameSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationType__LinkFileNameAssignment_2"


    // $ANTLR start "rule__Association__NameAssignment_1"
    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:2209:1: rule__Association__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Association__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:2213:1: ( ( RULE_ID ) )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:2214:1: ( RULE_ID )
            {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:2214:1: ( RULE_ID )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:2215:1: RULE_ID
            {
             before(grammarAccess.getAssociationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Association__NameAssignment_14386); 
             after(grammarAccess.getAssociationAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__NameAssignment_1"


    // $ANTLR start "rule__Association__AssoTypeAssignment_3"
    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:2224:1: rule__Association__AssoTypeAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Association__AssoTypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:2228:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:2229:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:2229:1: ( ( RULE_ID ) )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:2230:1: ( RULE_ID )
            {
             before(grammarAccess.getAssociationAccess().getAssoTypeAssociationTypeCrossReference_3_0()); 
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:2231:1: ( RULE_ID )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:2232:1: RULE_ID
            {
             before(grammarAccess.getAssociationAccess().getAssoTypeAssociationTypeIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Association__AssoTypeAssignment_34421); 
             after(grammarAccess.getAssociationAccess().getAssoTypeAssociationTypeIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getAssociationAccess().getAssoTypeAssociationTypeCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__AssoTypeAssignment_3"


    // $ANTLR start "rule__Association__ModuleTypeAssignment_5"
    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:2243:1: rule__Association__ModuleTypeAssignment_5 : ( RULE_STRING ) ;
    public final void rule__Association__ModuleTypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:2247:1: ( ( RULE_STRING ) )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:2248:1: ( RULE_STRING )
            {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:2248:1: ( RULE_STRING )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:2249:1: RULE_STRING
            {
             before(grammarAccess.getAssociationAccess().getModuleTypeSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Association__ModuleTypeAssignment_54456); 
             after(grammarAccess.getAssociationAccess().getModuleTypeSTRINGTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__ModuleTypeAssignment_5"


    // $ANTLR start "rule__Association__ClassTypeAssignment_6_1"
    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:2258:1: rule__Association__ClassTypeAssignment_6_1 : ( RULE_STRING ) ;
    public final void rule__Association__ClassTypeAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:2262:1: ( ( RULE_STRING ) )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:2263:1: ( RULE_STRING )
            {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:2263:1: ( RULE_STRING )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:2264:1: RULE_STRING
            {
             before(grammarAccess.getAssociationAccess().getClassTypeSTRINGTerminalRuleCall_6_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Association__ClassTypeAssignment_6_14487); 
             after(grammarAccess.getAssociationAccess().getClassTypeSTRINGTerminalRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__ClassTypeAssignment_6_1"


    // $ANTLR start "rule__Association__AssoDescriptionAssignment_7"
    // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:2273:1: rule__Association__AssoDescriptionAssignment_7 : ( RULE_STRING ) ;
    public final void rule__Association__AssoDescriptionAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:2277:1: ( ( RULE_STRING ) )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:2278:1: ( RULE_STRING )
            {
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:2278:1: ( RULE_STRING )
            // ../org.xtext.dsl.dxl.ui/src-gen/org/xtext/dsl/dxl/ui/contentassist/antlr/internal/InternalDxlDsl.g:2279:1: RULE_STRING
            {
             before(grammarAccess.getAssociationAccess().getAssoDescriptionSTRINGTerminalRuleCall_7_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Association__AssoDescriptionAssignment_74518); 
             after(grammarAccess.getAssociationAccess().getAssoDescriptionSTRINGTerminalRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__AssoDescriptionAssignment_7"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0_in_ruleModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFolder_in_entryRuleFolder121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFolder128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Folder__Group__0_in_ruleFolder154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModule_in_entryRuleModule181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModule188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__0_in_ruleModule214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_in_entryRuleClass241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClass248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group__0_in_ruleClass274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__0_in_ruleAttribute334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataType_in_entryRuleDataType361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataType368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataType__Alternatives_in_ruleDataType394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssociationType_in_entryRuleAssociationType421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssociationType428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssociationType__Group__0_in_ruleAssociationType454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssociation_in_entryRuleAssociation481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssociation488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__Group__0_in_ruleAssociation514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__DataType__Alternatives551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__DataType__Alternatives571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__DataType__Alternatives591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__DataType__Alternatives611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__DataType__Alternatives631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__0663 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__0666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Model__Group__0__Impl694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__1725 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Model__Group__2_in_rule__Model__Group__1728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__NameAssignment_1_in_rule__Model__Group__1__Impl755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__2785 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_rule__Model__Group__3_in_rule__Model__Group__2788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Model__Group__2__Impl816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__3847 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_rule__Model__Group__4_in_rule__Model__Group__3850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__FoldersAssignment_3_in_rule__Model__Group__3__Impl877 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__4908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Model__Group__4__Impl936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Folder__Group__0__Impl_in_rule__Folder__Group__0977 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Folder__Group__1_in_rule__Folder__Group__0980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Folder__Group__0__Impl1008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Folder__Group__1__Impl_in_rule__Folder__Group__11039 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Folder__Group__2_in_rule__Folder__Group__11042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Folder__NameAssignment_1_in_rule__Folder__Group__1__Impl1069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Folder__Group__2__Impl_in_rule__Folder__Group__21099 = new BitSet(new long[]{0x0000000001140000L});
    public static final BitSet FOLLOW_rule__Folder__Group__3_in_rule__Folder__Group__21102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Folder__Group__2__Impl1130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Folder__Group__3__Impl_in_rule__Folder__Group__31161 = new BitSet(new long[]{0x0000000001140000L});
    public static final BitSet FOLLOW_rule__Folder__Group__4_in_rule__Folder__Group__31164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Folder__ModuleAssignment_3_in_rule__Folder__Group__3__Impl1191 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rule__Folder__Group__4__Impl_in_rule__Folder__Group__41222 = new BitSet(new long[]{0x0000000001140000L});
    public static final BitSet FOLLOW_rule__Folder__Group__5_in_rule__Folder__Group__41225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Folder__AssociationTypeAssignment_4_in_rule__Folder__Group__4__Impl1252 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_rule__Folder__Group__5__Impl_in_rule__Folder__Group__51283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Folder__Group__5__Impl1311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__0__Impl_in_rule__Module__Group__01354 = new BitSet(new long[]{0x0000000020000010L});
    public static final BitSet FOLLOW_rule__Module__Group__1_in_rule__Module__Group__01357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Module__Group__0__Impl1385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__1__Impl_in_rule__Module__Group__11416 = new BitSet(new long[]{0x0000000020000010L});
    public static final BitSet FOLLOW_rule__Module__Group__2_in_rule__Module__Group__11419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__IgnoreInReportAssignment_1_in_rule__Module__Group__1__Impl1446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__2__Impl_in_rule__Module__Group__21477 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Module__Group__3_in_rule__Module__Group__21480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__NameAssignment_2_in_rule__Module__Group__2__Impl1507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__3__Impl_in_rule__Module__Group__31537 = new BitSet(new long[]{0x0000000000640000L});
    public static final BitSet FOLLOW_rule__Module__Group__4_in_rule__Module__Group__31540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Module__Group__3__Impl1568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__4__Impl_in_rule__Module__Group__41599 = new BitSet(new long[]{0x0000000000640000L});
    public static final BitSet FOLLOW_rule__Module__Group__5_in_rule__Module__Group__41602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group_4__0_in_rule__Module__Group__4__Impl1629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__5__Impl_in_rule__Module__Group__51660 = new BitSet(new long[]{0x0000000000640000L});
    public static final BitSet FOLLOW_rule__Module__Group__6_in_rule__Module__Group__51663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__ClassesAssignment_5_in_rule__Module__Group__5__Impl1690 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_rule__Module__Group__6__Impl_in_rule__Module__Group__61721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Module__Group__6__Impl1749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group_4__0__Impl_in_rule__Module__Group_4__01794 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Module__Group_4__1_in_rule__Module__Group_4__01797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Module__Group_4__0__Impl1825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group_4__1__Impl_in_rule__Module__Group_4__11856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__FileNameAssignment_4_1_in_rule__Module__Group_4__1__Impl1883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group__0__Impl_in_rule__Class__Group__01917 = new BitSet(new long[]{0x0000000040000010L});
    public static final BitSet FOLLOW_rule__Class__Group__1_in_rule__Class__Group__01920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Class__Group__0__Impl1948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group__1__Impl_in_rule__Class__Group__11979 = new BitSet(new long[]{0x0000000040000010L});
    public static final BitSet FOLLOW_rule__Class__Group__2_in_rule__Class__Group__11982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__NoDescriptionAssignment_1_in_rule__Class__Group__1__Impl2009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group__2__Impl_in_rule__Class__Group__22040 = new BitSet(new long[]{0x0000000000820000L});
    public static final BitSet FOLLOW_rule__Class__Group__3_in_rule__Class__Group__22043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__NameAssignment_2_in_rule__Class__Group__2__Impl2070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group__3__Impl_in_rule__Class__Group__32100 = new BitSet(new long[]{0x0000000000820000L});
    public static final BitSet FOLLOW_rule__Class__Group__4_in_rule__Class__Group__32103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group_3__0_in_rule__Class__Group__3__Impl2130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group__4__Impl_in_rule__Class__Group__42161 = new BitSet(new long[]{0x000000008204F800L});
    public static final BitSet FOLLOW_rule__Class__Group__5_in_rule__Class__Group__42164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Class__Group__4__Impl2192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group__5__Impl_in_rule__Class__Group__52223 = new BitSet(new long[]{0x000000008204F800L});
    public static final BitSet FOLLOW_rule__Class__Group__6_in_rule__Class__Group__52226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__AttributesAssignment_5_in_rule__Class__Group__5__Impl2253 = new BitSet(new long[]{0x000000008000F802L});
    public static final BitSet FOLLOW_rule__Class__Group__6__Impl_in_rule__Class__Group__62284 = new BitSet(new long[]{0x000000008204F800L});
    public static final BitSet FOLLOW_rule__Class__Group__7_in_rule__Class__Group__62287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__AssociationsAssignment_6_in_rule__Class__Group__6__Impl2314 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_rule__Class__Group__7__Impl_in_rule__Class__Group__72345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Class__Group__7__Impl2373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group_3__0__Impl_in_rule__Class__Group_3__02420 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Class__Group_3__1_in_rule__Class__Group_3__02423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Class__Group_3__0__Impl2451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group_3__1__Impl_in_rule__Class__Group_3__12482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__ClassTypeDescriptionAssignment_3_1_in_rule__Class__Group_3__1__Impl2509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__02543 = new BitSet(new long[]{0x000000008000F800L});
    public static final BitSet FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__02546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__IgnoredAssignment_0_in_rule__Attribute__Group__0__Impl2573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__12604 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__12607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__TypeAssignment_1_in_rule__Attribute__Group__1__Impl2634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__2__Impl_in_rule__Attribute__Group__22664 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Attribute__Group__3_in_rule__Attribute__Group__22667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__NameAssignment_2_in_rule__Attribute__Group__2__Impl2694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__3__Impl_in_rule__Attribute__Group__32724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group_3__0_in_rule__Attribute__Group__3__Impl2751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group_3__0__Impl_in_rule__Attribute__Group_3__02790 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Attribute__Group_3__1_in_rule__Attribute__Group_3__02793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Attribute__Group_3__0__Impl2821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group_3__1__Impl_in_rule__Attribute__Group_3__12852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__DefaultAssignment_3_1_in_rule__Attribute__Group_3__1__Impl2879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssociationType__Group__0__Impl_in_rule__AssociationType__Group__02913 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__AssociationType__Group__1_in_rule__AssociationType__Group__02916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__AssociationType__Group__0__Impl2944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssociationType__Group__1__Impl_in_rule__AssociationType__Group__12975 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__AssociationType__Group__2_in_rule__AssociationType__Group__12978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssociationType__NameAssignment_1_in_rule__AssociationType__Group__1__Impl3005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssociationType__Group__2__Impl_in_rule__AssociationType__Group__23035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssociationType__LinkFileNameAssignment_2_in_rule__AssociationType__Group__2__Impl3062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__Group__0__Impl_in_rule__Association__Group__03098 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Association__Group__1_in_rule__Association__Group__03101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Association__Group__0__Impl3129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__Group__1__Impl_in_rule__Association__Group__13160 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Association__Group__2_in_rule__Association__Group__13163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__NameAssignment_1_in_rule__Association__Group__1__Impl3190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__Group__2__Impl_in_rule__Association__Group__23220 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Association__Group__3_in_rule__Association__Group__23223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Association__Group__2__Impl3251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__Group__3__Impl_in_rule__Association__Group__33282 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Association__Group__4_in_rule__Association__Group__33285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__AssoTypeAssignment_3_in_rule__Association__Group__3__Impl3312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__Group__4__Impl_in_rule__Association__Group__43342 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Association__Group__5_in_rule__Association__Group__43345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Association__Group__4__Impl3373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__Group__5__Impl_in_rule__Association__Group__53404 = new BitSet(new long[]{0x0000000010000020L});
    public static final BitSet FOLLOW_rule__Association__Group__6_in_rule__Association__Group__53407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__ModuleTypeAssignment_5_in_rule__Association__Group__5__Impl3434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__Group__6__Impl_in_rule__Association__Group__63464 = new BitSet(new long[]{0x0000000010000020L});
    public static final BitSet FOLLOW_rule__Association__Group__7_in_rule__Association__Group__63467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__Group_6__0_in_rule__Association__Group__6__Impl3494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__Group__7__Impl_in_rule__Association__Group__73525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__AssoDescriptionAssignment_7_in_rule__Association__Group__7__Impl3552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__Group_6__0__Impl_in_rule__Association__Group_6__03599 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Association__Group_6__1_in_rule__Association__Group_6__03602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Association__Group_6__0__Impl3630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__Group_6__1__Impl_in_rule__Association__Group_6__13661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__ClassTypeAssignment_6_1_in_rule__Association__Group_6__1__Impl3688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Model__NameAssignment_13727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFolder_in_rule__Model__FoldersAssignment_33758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Folder__NameAssignment_13789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModule_in_rule__Folder__ModuleAssignment_33820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssociationType_in_rule__Folder__AssociationTypeAssignment_43851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Module__IgnoreInReportAssignment_13887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Module__NameAssignment_23926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Module__FileNameAssignment_4_13957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_in_rule__Module__ClassesAssignment_53988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Class__NoDescriptionAssignment_14024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Class__NameAssignment_24063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Class__ClassTypeDescriptionAssignment_3_14094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__Class__AttributesAssignment_54125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssociation_in_rule__Class__AssociationsAssignment_64156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Attribute__IgnoredAssignment_04192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataType_in_rule__Attribute__TypeAssignment_14231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Attribute__NameAssignment_24262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Attribute__DefaultAssignment_3_14293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AssociationType__NameAssignment_14324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__AssociationType__LinkFileNameAssignment_24355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Association__NameAssignment_14386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Association__AssoTypeAssignment_34421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Association__ModuleTypeAssignment_54456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Association__ClassTypeAssignment_6_14487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Association__AssoDescriptionAssignment_74518 = new BitSet(new long[]{0x0000000000000002L});

}