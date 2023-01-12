package org.xtext.dsl.dxl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.dsl.dxl.services.DxlDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDxlDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'model'", "'{'", "'}'", "'folder'", "'module'", "'ignoreInReport'", "'fileName'", "'class'", "'noDescription'", "'shows as'", "'ignored'", "'bool'", "'string'", "'int'", "'text'", "'diagram'", "'associationType'", "'association'", "':'", "'to'", "'.'"
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
    public String getGrammarFileName() { return "../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g"; }



     	private DxlDslGrammarAccess grammarAccess;
     	
        public InternalDxlDslParser(TokenStream input, DxlDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected DxlDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:69:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:76:1: ruleModel returns [EObject current=null] : (otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_folders_3_0= ruleFolder ) )* otherlv_4= '}' ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_folders_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:79:28: ( (otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_folders_3_0= ruleFolder ) )* otherlv_4= '}' ) )
            // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:80:1: (otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_folders_3_0= ruleFolder ) )* otherlv_4= '}' )
            {
            // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:80:1: (otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_folders_3_0= ruleFolder ) )* otherlv_4= '}' )
            // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:80:3: otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_folders_3_0= ruleFolder ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleModel122); 

                	newLeafNode(otherlv_0, grammarAccess.getModelAccess().getModelKeyword_0());
                
            // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:84:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:85:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:85:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:86:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleModel139); 

            			newLeafNode(lv_name_1_0, grammarAccess.getModelAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getModelRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleModel156); 

                	newLeafNode(otherlv_2, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:106:1: ( (lv_folders_3_0= ruleFolder ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:107:1: (lv_folders_3_0= ruleFolder )
            	    {
            	    // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:107:1: (lv_folders_3_0= ruleFolder )
            	    // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:108:3: lv_folders_3_0= ruleFolder
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getFoldersFolderParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleFolder_in_ruleModel177);
            	    lv_folders_3_0=ruleFolder();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"folders",
            	            		lv_folders_3_0, 
            	            		"Folder");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleModel190); 

                	newLeafNode(otherlv_4, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleFolder"
    // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:136:1: entryRuleFolder returns [EObject current=null] : iv_ruleFolder= ruleFolder EOF ;
    public final EObject entryRuleFolder() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFolder = null;


        try {
            // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:137:2: (iv_ruleFolder= ruleFolder EOF )
            // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:138:2: iv_ruleFolder= ruleFolder EOF
            {
             newCompositeNode(grammarAccess.getFolderRule()); 
            pushFollow(FOLLOW_ruleFolder_in_entryRuleFolder226);
            iv_ruleFolder=ruleFolder();

            state._fsp--;

             current =iv_ruleFolder; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFolder236); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFolder"


    // $ANTLR start "ruleFolder"
    // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:145:1: ruleFolder returns [EObject current=null] : (otherlv_0= 'folder' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_module_3_0= ruleModule ) )* ( (lv_associationType_4_0= ruleAssociationType ) )* otherlv_5= '}' ) ;
    public final EObject ruleFolder() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_module_3_0 = null;

        EObject lv_associationType_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:148:28: ( (otherlv_0= 'folder' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_module_3_0= ruleModule ) )* ( (lv_associationType_4_0= ruleAssociationType ) )* otherlv_5= '}' ) )
            // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:149:1: (otherlv_0= 'folder' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_module_3_0= ruleModule ) )* ( (lv_associationType_4_0= ruleAssociationType ) )* otherlv_5= '}' )
            {
            // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:149:1: (otherlv_0= 'folder' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_module_3_0= ruleModule ) )* ( (lv_associationType_4_0= ruleAssociationType ) )* otherlv_5= '}' )
            // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:149:3: otherlv_0= 'folder' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_module_3_0= ruleModule ) )* ( (lv_associationType_4_0= ruleAssociationType ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleFolder273); 

                	newLeafNode(otherlv_0, grammarAccess.getFolderAccess().getFolderKeyword_0());
                
            // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:153:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:154:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:154:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:155:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFolder290); 

            			newLeafNode(lv_name_1_0, grammarAccess.getFolderAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFolderRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleFolder307); 

                	newLeafNode(otherlv_2, grammarAccess.getFolderAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:175:1: ( (lv_module_3_0= ruleModule ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:176:1: (lv_module_3_0= ruleModule )
            	    {
            	    // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:176:1: (lv_module_3_0= ruleModule )
            	    // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:177:3: lv_module_3_0= ruleModule
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFolderAccess().getModuleModuleParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleModule_in_ruleFolder328);
            	    lv_module_3_0=ruleModule();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getFolderRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"module",
            	            		lv_module_3_0, 
            	            		"Module");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:193:3: ( (lv_associationType_4_0= ruleAssociationType ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==27) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:194:1: (lv_associationType_4_0= ruleAssociationType )
            	    {
            	    // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:194:1: (lv_associationType_4_0= ruleAssociationType )
            	    // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:195:3: lv_associationType_4_0= ruleAssociationType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFolderAccess().getAssociationTypeAssociationTypeParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAssociationType_in_ruleFolder350);
            	    lv_associationType_4_0=ruleAssociationType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getFolderRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"associationType",
            	            		lv_associationType_4_0, 
            	            		"AssociationType");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleFolder363); 

                	newLeafNode(otherlv_5, grammarAccess.getFolderAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFolder"


    // $ANTLR start "entryRuleModule"
    // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:223:1: entryRuleModule returns [EObject current=null] : iv_ruleModule= ruleModule EOF ;
    public final EObject entryRuleModule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModule = null;


        try {
            // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:224:2: (iv_ruleModule= ruleModule EOF )
            // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:225:2: iv_ruleModule= ruleModule EOF
            {
             newCompositeNode(grammarAccess.getModuleRule()); 
            pushFollow(FOLLOW_ruleModule_in_entryRuleModule399);
            iv_ruleModule=ruleModule();

            state._fsp--;

             current =iv_ruleModule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModule409); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModule"


    // $ANTLR start "ruleModule"
    // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:232:1: ruleModule returns [EObject current=null] : (otherlv_0= 'module' ( (lv_ignoreInReport_1_0= 'ignoreInReport' ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'fileName' ( (lv_fileName_5_0= RULE_STRING ) ) )? ( (lv_classes_6_0= ruleClass ) )* otherlv_7= '}' ) ;
    public final EObject ruleModule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_ignoreInReport_1_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_fileName_5_0=null;
        Token otherlv_7=null;
        EObject lv_classes_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:235:28: ( (otherlv_0= 'module' ( (lv_ignoreInReport_1_0= 'ignoreInReport' ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'fileName' ( (lv_fileName_5_0= RULE_STRING ) ) )? ( (lv_classes_6_0= ruleClass ) )* otherlv_7= '}' ) )
            // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:236:1: (otherlv_0= 'module' ( (lv_ignoreInReport_1_0= 'ignoreInReport' ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'fileName' ( (lv_fileName_5_0= RULE_STRING ) ) )? ( (lv_classes_6_0= ruleClass ) )* otherlv_7= '}' )
            {
            // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:236:1: (otherlv_0= 'module' ( (lv_ignoreInReport_1_0= 'ignoreInReport' ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'fileName' ( (lv_fileName_5_0= RULE_STRING ) ) )? ( (lv_classes_6_0= ruleClass ) )* otherlv_7= '}' )
            // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:236:3: otherlv_0= 'module' ( (lv_ignoreInReport_1_0= 'ignoreInReport' ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'fileName' ( (lv_fileName_5_0= RULE_STRING ) ) )? ( (lv_classes_6_0= ruleClass ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleModule446); 

                	newLeafNode(otherlv_0, grammarAccess.getModuleAccess().getModuleKeyword_0());
                
            // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:240:1: ( (lv_ignoreInReport_1_0= 'ignoreInReport' ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:241:1: (lv_ignoreInReport_1_0= 'ignoreInReport' )
                    {
                    // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:241:1: (lv_ignoreInReport_1_0= 'ignoreInReport' )
                    // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:242:3: lv_ignoreInReport_1_0= 'ignoreInReport'
                    {
                    lv_ignoreInReport_1_0=(Token)match(input,16,FOLLOW_16_in_ruleModule464); 

                            newLeafNode(lv_ignoreInReport_1_0, grammarAccess.getModuleAccess().getIgnoreInReportIgnoreInReportKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getModuleRule());
                    	        }
                           		setWithLastConsumed(current, "ignoreInReport", true, "ignoreInReport");
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:255:3: ( (lv_name_2_0= RULE_ID ) )
            // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:256:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:256:1: (lv_name_2_0= RULE_ID )
            // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:257:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleModule495); 

            			newLeafNode(lv_name_2_0, grammarAccess.getModuleAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getModuleRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleModule512); 

                	newLeafNode(otherlv_3, grammarAccess.getModuleAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:277:1: (otherlv_4= 'fileName' ( (lv_fileName_5_0= RULE_STRING ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:277:3: otherlv_4= 'fileName' ( (lv_fileName_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleModule525); 

                        	newLeafNode(otherlv_4, grammarAccess.getModuleAccess().getFileNameKeyword_4_0());
                        
                    // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:281:1: ( (lv_fileName_5_0= RULE_STRING ) )
                    // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:282:1: (lv_fileName_5_0= RULE_STRING )
                    {
                    // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:282:1: (lv_fileName_5_0= RULE_STRING )
                    // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:283:3: lv_fileName_5_0= RULE_STRING
                    {
                    lv_fileName_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleModule542); 

                    			newLeafNode(lv_fileName_5_0, grammarAccess.getModuleAccess().getFileNameSTRINGTerminalRuleCall_4_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getModuleRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"fileName",
                            		lv_fileName_5_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:299:4: ( (lv_classes_6_0= ruleClass ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==18) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:300:1: (lv_classes_6_0= ruleClass )
            	    {
            	    // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:300:1: (lv_classes_6_0= ruleClass )
            	    // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:301:3: lv_classes_6_0= ruleClass
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModuleAccess().getClassesClassParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleClass_in_ruleModule570);
            	    lv_classes_6_0=ruleClass();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModuleRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"classes",
            	            		lv_classes_6_0, 
            	            		"Class");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_7=(Token)match(input,13,FOLLOW_13_in_ruleModule583); 

                	newLeafNode(otherlv_7, grammarAccess.getModuleAccess().getRightCurlyBracketKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModule"


    // $ANTLR start "entryRuleClass"
    // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:329:1: entryRuleClass returns [EObject current=null] : iv_ruleClass= ruleClass EOF ;
    public final EObject entryRuleClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClass = null;


        try {
            // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:330:2: (iv_ruleClass= ruleClass EOF )
            // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:331:2: iv_ruleClass= ruleClass EOF
            {
             newCompositeNode(grammarAccess.getClassRule()); 
            pushFollow(FOLLOW_ruleClass_in_entryRuleClass619);
            iv_ruleClass=ruleClass();

            state._fsp--;

             current =iv_ruleClass; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClass629); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClass"


    // $ANTLR start "ruleClass"
    // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:338:1: ruleClass returns [EObject current=null] : (otherlv_0= 'class' ( (lv_noDescription_1_0= 'noDescription' ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'shows as' ( (lv_classTypeDescription_4_0= RULE_STRING ) ) )? otherlv_5= '{' ( (lv_attributes_6_0= ruleAttribute ) )* ( (lv_associations_7_0= ruleAssociation ) )* otherlv_8= '}' ) ;
    public final EObject ruleClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_noDescription_1_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_classTypeDescription_4_0=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        EObject lv_attributes_6_0 = null;

        EObject lv_associations_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:341:28: ( (otherlv_0= 'class' ( (lv_noDescription_1_0= 'noDescription' ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'shows as' ( (lv_classTypeDescription_4_0= RULE_STRING ) ) )? otherlv_5= '{' ( (lv_attributes_6_0= ruleAttribute ) )* ( (lv_associations_7_0= ruleAssociation ) )* otherlv_8= '}' ) )
            // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:342:1: (otherlv_0= 'class' ( (lv_noDescription_1_0= 'noDescription' ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'shows as' ( (lv_classTypeDescription_4_0= RULE_STRING ) ) )? otherlv_5= '{' ( (lv_attributes_6_0= ruleAttribute ) )* ( (lv_associations_7_0= ruleAssociation ) )* otherlv_8= '}' )
            {
            // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:342:1: (otherlv_0= 'class' ( (lv_noDescription_1_0= 'noDescription' ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'shows as' ( (lv_classTypeDescription_4_0= RULE_STRING ) ) )? otherlv_5= '{' ( (lv_attributes_6_0= ruleAttribute ) )* ( (lv_associations_7_0= ruleAssociation ) )* otherlv_8= '}' )
            // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:342:3: otherlv_0= 'class' ( (lv_noDescription_1_0= 'noDescription' ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'shows as' ( (lv_classTypeDescription_4_0= RULE_STRING ) ) )? otherlv_5= '{' ( (lv_attributes_6_0= ruleAttribute ) )* ( (lv_associations_7_0= ruleAssociation ) )* otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleClass666); 

                	newLeafNode(otherlv_0, grammarAccess.getClassAccess().getClassKeyword_0());
                
            // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:346:1: ( (lv_noDescription_1_0= 'noDescription' ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:347:1: (lv_noDescription_1_0= 'noDescription' )
                    {
                    // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:347:1: (lv_noDescription_1_0= 'noDescription' )
                    // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:348:3: lv_noDescription_1_0= 'noDescription'
                    {
                    lv_noDescription_1_0=(Token)match(input,19,FOLLOW_19_in_ruleClass684); 

                            newLeafNode(lv_noDescription_1_0, grammarAccess.getClassAccess().getNoDescriptionNoDescriptionKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getClassRule());
                    	        }
                           		setWithLastConsumed(current, "noDescription", true, "noDescription");
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:361:3: ( (lv_name_2_0= RULE_ID ) )
            // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:362:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:362:1: (lv_name_2_0= RULE_ID )
            // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:363:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleClass715); 

            			newLeafNode(lv_name_2_0, grammarAccess.getClassAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getClassRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:379:2: (otherlv_3= 'shows as' ( (lv_classTypeDescription_4_0= RULE_STRING ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:379:4: otherlv_3= 'shows as' ( (lv_classTypeDescription_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleClass733); 

                        	newLeafNode(otherlv_3, grammarAccess.getClassAccess().getShowsAsKeyword_3_0());
                        
                    // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:383:1: ( (lv_classTypeDescription_4_0= RULE_STRING ) )
                    // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:384:1: (lv_classTypeDescription_4_0= RULE_STRING )
                    {
                    // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:384:1: (lv_classTypeDescription_4_0= RULE_STRING )
                    // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:385:3: lv_classTypeDescription_4_0= RULE_STRING
                    {
                    lv_classTypeDescription_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleClass750); 

                    			newLeafNode(lv_classTypeDescription_4_0, grammarAccess.getClassAccess().getClassTypeDescriptionSTRINGTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getClassRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"classTypeDescription",
                            		lv_classTypeDescription_4_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,12,FOLLOW_12_in_ruleClass769); 

                	newLeafNode(otherlv_5, grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_4());
                
            // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:405:1: ( (lv_attributes_6_0= ruleAttribute ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=21 && LA9_0<=26)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:406:1: (lv_attributes_6_0= ruleAttribute )
            	    {
            	    // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:406:1: (lv_attributes_6_0= ruleAttribute )
            	    // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:407:3: lv_attributes_6_0= ruleAttribute
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getClassAccess().getAttributesAttributeParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAttribute_in_ruleClass790);
            	    lv_attributes_6_0=ruleAttribute();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getClassRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"attributes",
            	            		lv_attributes_6_0, 
            	            		"Attribute");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:423:3: ( (lv_associations_7_0= ruleAssociation ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==28) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:424:1: (lv_associations_7_0= ruleAssociation )
            	    {
            	    // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:424:1: (lv_associations_7_0= ruleAssociation )
            	    // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:425:3: lv_associations_7_0= ruleAssociation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getClassAccess().getAssociationsAssociationParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAssociation_in_ruleClass812);
            	    lv_associations_7_0=ruleAssociation();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getClassRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"associations",
            	            		lv_associations_7_0, 
            	            		"Association");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_8=(Token)match(input,13,FOLLOW_13_in_ruleClass825); 

                	newLeafNode(otherlv_8, grammarAccess.getClassAccess().getRightCurlyBracketKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClass"


    // $ANTLR start "entryRuleAttribute"
    // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:453:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:454:2: (iv_ruleAttribute= ruleAttribute EOF )
            // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:455:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute861);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute871); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:462:1: ruleAttribute returns [EObject current=null] : ( ( (lv_ignored_0_0= 'ignored' ) )? ( (lv_type_1_0= ruleDataType ) ) ( (lv_name_2_0= RULE_STRING ) ) (otherlv_3= 'shows as' ( (lv_default_4_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_ignored_0_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_default_4_0=null;
        AntlrDatatypeRuleToken lv_type_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:465:28: ( ( ( (lv_ignored_0_0= 'ignored' ) )? ( (lv_type_1_0= ruleDataType ) ) ( (lv_name_2_0= RULE_STRING ) ) (otherlv_3= 'shows as' ( (lv_default_4_0= RULE_STRING ) ) )? ) )
            // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:466:1: ( ( (lv_ignored_0_0= 'ignored' ) )? ( (lv_type_1_0= ruleDataType ) ) ( (lv_name_2_0= RULE_STRING ) ) (otherlv_3= 'shows as' ( (lv_default_4_0= RULE_STRING ) ) )? )
            {
            // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:466:1: ( ( (lv_ignored_0_0= 'ignored' ) )? ( (lv_type_1_0= ruleDataType ) ) ( (lv_name_2_0= RULE_STRING ) ) (otherlv_3= 'shows as' ( (lv_default_4_0= RULE_STRING ) ) )? )
            // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:466:2: ( (lv_ignored_0_0= 'ignored' ) )? ( (lv_type_1_0= ruleDataType ) ) ( (lv_name_2_0= RULE_STRING ) ) (otherlv_3= 'shows as' ( (lv_default_4_0= RULE_STRING ) ) )?
            {
            // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:466:2: ( (lv_ignored_0_0= 'ignored' ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==21) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:467:1: (lv_ignored_0_0= 'ignored' )
                    {
                    // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:467:1: (lv_ignored_0_0= 'ignored' )
                    // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:468:3: lv_ignored_0_0= 'ignored'
                    {
                    lv_ignored_0_0=(Token)match(input,21,FOLLOW_21_in_ruleAttribute914); 

                            newLeafNode(lv_ignored_0_0, grammarAccess.getAttributeAccess().getIgnoredIgnoredKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeRule());
                    	        }
                           		setWithLastConsumed(current, "ignored", true, "ignored");
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:481:3: ( (lv_type_1_0= ruleDataType ) )
            // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:482:1: (lv_type_1_0= ruleDataType )
            {
            // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:482:1: (lv_type_1_0= ruleDataType )
            // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:483:3: lv_type_1_0= ruleDataType
            {
             
            	        newCompositeNode(grammarAccess.getAttributeAccess().getTypeDataTypeParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleDataType_in_ruleAttribute949);
            lv_type_1_0=ruleDataType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAttributeRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_1_0, 
                    		"DataType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:499:2: ( (lv_name_2_0= RULE_STRING ) )
            // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:500:1: (lv_name_2_0= RULE_STRING )
            {
            // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:500:1: (lv_name_2_0= RULE_STRING )
            // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:501:3: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttribute966); 

            			newLeafNode(lv_name_2_0, grammarAccess.getAttributeAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAttributeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"STRING");
            	    

            }


            }

            // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:517:2: (otherlv_3= 'shows as' ( (lv_default_4_0= RULE_STRING ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==20) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:517:4: otherlv_3= 'shows as' ( (lv_default_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleAttribute984); 

                        	newLeafNode(otherlv_3, grammarAccess.getAttributeAccess().getShowsAsKeyword_3_0());
                        
                    // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:521:1: ( (lv_default_4_0= RULE_STRING ) )
                    // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:522:1: (lv_default_4_0= RULE_STRING )
                    {
                    // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:522:1: (lv_default_4_0= RULE_STRING )
                    // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:523:3: lv_default_4_0= RULE_STRING
                    {
                    lv_default_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttribute1001); 

                    			newLeafNode(lv_default_4_0, grammarAccess.getAttributeAccess().getDefaultSTRINGTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"default",
                            		lv_default_4_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleDataType"
    // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:547:1: entryRuleDataType returns [String current=null] : iv_ruleDataType= ruleDataType EOF ;
    public final String entryRuleDataType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDataType = null;


        try {
            // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:548:2: (iv_ruleDataType= ruleDataType EOF )
            // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:549:2: iv_ruleDataType= ruleDataType EOF
            {
             newCompositeNode(grammarAccess.getDataTypeRule()); 
            pushFollow(FOLLOW_ruleDataType_in_entryRuleDataType1045);
            iv_ruleDataType=ruleDataType();

            state._fsp--;

             current =iv_ruleDataType.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataType1056); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDataType"


    // $ANTLR start "ruleDataType"
    // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:556:1: ruleDataType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'bool' | kw= 'string' | kw= 'int' | kw= 'text' | kw= 'diagram' ) ;
    public final AntlrDatatypeRuleToken ruleDataType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:559:28: ( (kw= 'bool' | kw= 'string' | kw= 'int' | kw= 'text' | kw= 'diagram' ) )
            // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:560:1: (kw= 'bool' | kw= 'string' | kw= 'int' | kw= 'text' | kw= 'diagram' )
            {
            // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:560:1: (kw= 'bool' | kw= 'string' | kw= 'int' | kw= 'text' | kw= 'diagram' )
            int alt13=5;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt13=1;
                }
                break;
            case 23:
                {
                alt13=2;
                }
                break;
            case 24:
                {
                alt13=3;
                }
                break;
            case 25:
                {
                alt13=4;
                }
                break;
            case 26:
                {
                alt13=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:561:2: kw= 'bool'
                    {
                    kw=(Token)match(input,22,FOLLOW_22_in_ruleDataType1094); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDataTypeAccess().getBoolKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:568:2: kw= 'string'
                    {
                    kw=(Token)match(input,23,FOLLOW_23_in_ruleDataType1113); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDataTypeAccess().getStringKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:575:2: kw= 'int'
                    {
                    kw=(Token)match(input,24,FOLLOW_24_in_ruleDataType1132); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDataTypeAccess().getIntKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:582:2: kw= 'text'
                    {
                    kw=(Token)match(input,25,FOLLOW_25_in_ruleDataType1151); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDataTypeAccess().getTextKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:589:2: kw= 'diagram'
                    {
                    kw=(Token)match(input,26,FOLLOW_26_in_ruleDataType1170); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDataTypeAccess().getDiagramKeyword_4()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDataType"


    // $ANTLR start "entryRuleAssociationType"
    // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:602:1: entryRuleAssociationType returns [EObject current=null] : iv_ruleAssociationType= ruleAssociationType EOF ;
    public final EObject entryRuleAssociationType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociationType = null;


        try {
            // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:603:2: (iv_ruleAssociationType= ruleAssociationType EOF )
            // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:604:2: iv_ruleAssociationType= ruleAssociationType EOF
            {
             newCompositeNode(grammarAccess.getAssociationTypeRule()); 
            pushFollow(FOLLOW_ruleAssociationType_in_entryRuleAssociationType1210);
            iv_ruleAssociationType=ruleAssociationType();

            state._fsp--;

             current =iv_ruleAssociationType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssociationType1220); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAssociationType"


    // $ANTLR start "ruleAssociationType"
    // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:611:1: ruleAssociationType returns [EObject current=null] : (otherlv_0= 'associationType' ( (lv_name_1_0= RULE_ID ) ) ( (lv_linkFileName_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleAssociationType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_linkFileName_2_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:614:28: ( (otherlv_0= 'associationType' ( (lv_name_1_0= RULE_ID ) ) ( (lv_linkFileName_2_0= RULE_STRING ) ) ) )
            // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:615:1: (otherlv_0= 'associationType' ( (lv_name_1_0= RULE_ID ) ) ( (lv_linkFileName_2_0= RULE_STRING ) ) )
            {
            // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:615:1: (otherlv_0= 'associationType' ( (lv_name_1_0= RULE_ID ) ) ( (lv_linkFileName_2_0= RULE_STRING ) ) )
            // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:615:3: otherlv_0= 'associationType' ( (lv_name_1_0= RULE_ID ) ) ( (lv_linkFileName_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_ruleAssociationType1257); 

                	newLeafNode(otherlv_0, grammarAccess.getAssociationTypeAccess().getAssociationTypeKeyword_0());
                
            // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:619:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:620:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:620:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:621:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAssociationType1274); 

            			newLeafNode(lv_name_1_0, grammarAccess.getAssociationTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAssociationTypeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:637:2: ( (lv_linkFileName_2_0= RULE_STRING ) )
            // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:638:1: (lv_linkFileName_2_0= RULE_STRING )
            {
            // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:638:1: (lv_linkFileName_2_0= RULE_STRING )
            // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:639:3: lv_linkFileName_2_0= RULE_STRING
            {
            lv_linkFileName_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAssociationType1296); 

            			newLeafNode(lv_linkFileName_2_0, grammarAccess.getAssociationTypeAccess().getLinkFileNameSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAssociationTypeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"linkFileName",
                    		lv_linkFileName_2_0, 
                    		"STRING");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssociationType"


    // $ANTLR start "entryRuleAssociation"
    // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:663:1: entryRuleAssociation returns [EObject current=null] : iv_ruleAssociation= ruleAssociation EOF ;
    public final EObject entryRuleAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociation = null;


        try {
            // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:664:2: (iv_ruleAssociation= ruleAssociation EOF )
            // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:665:2: iv_ruleAssociation= ruleAssociation EOF
            {
             newCompositeNode(grammarAccess.getAssociationRule()); 
            pushFollow(FOLLOW_ruleAssociation_in_entryRuleAssociation1337);
            iv_ruleAssociation=ruleAssociation();

            state._fsp--;

             current =iv_ruleAssociation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssociation1347); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAssociation"


    // $ANTLR start "ruleAssociation"
    // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:672:1: ruleAssociation returns [EObject current=null] : (otherlv_0= 'association' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'to' ( (lv_moduleType_5_0= RULE_STRING ) ) (otherlv_6= '.' ( (lv_classType_7_0= RULE_STRING ) ) )? ( (lv_assoDescription_8_0= RULE_STRING ) )? ) ;
    public final EObject ruleAssociation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_moduleType_5_0=null;
        Token otherlv_6=null;
        Token lv_classType_7_0=null;
        Token lv_assoDescription_8_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:675:28: ( (otherlv_0= 'association' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'to' ( (lv_moduleType_5_0= RULE_STRING ) ) (otherlv_6= '.' ( (lv_classType_7_0= RULE_STRING ) ) )? ( (lv_assoDescription_8_0= RULE_STRING ) )? ) )
            // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:676:1: (otherlv_0= 'association' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'to' ( (lv_moduleType_5_0= RULE_STRING ) ) (otherlv_6= '.' ( (lv_classType_7_0= RULE_STRING ) ) )? ( (lv_assoDescription_8_0= RULE_STRING ) )? )
            {
            // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:676:1: (otherlv_0= 'association' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'to' ( (lv_moduleType_5_0= RULE_STRING ) ) (otherlv_6= '.' ( (lv_classType_7_0= RULE_STRING ) ) )? ( (lv_assoDescription_8_0= RULE_STRING ) )? )
            // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:676:3: otherlv_0= 'association' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'to' ( (lv_moduleType_5_0= RULE_STRING ) ) (otherlv_6= '.' ( (lv_classType_7_0= RULE_STRING ) ) )? ( (lv_assoDescription_8_0= RULE_STRING ) )?
            {
            otherlv_0=(Token)match(input,28,FOLLOW_28_in_ruleAssociation1384); 

                	newLeafNode(otherlv_0, grammarAccess.getAssociationAccess().getAssociationKeyword_0());
                
            // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:680:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:681:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:681:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:682:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAssociation1401); 

            			newLeafNode(lv_name_1_0, grammarAccess.getAssociationAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAssociationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,29,FOLLOW_29_in_ruleAssociation1418); 

                	newLeafNode(otherlv_2, grammarAccess.getAssociationAccess().getColonKeyword_2());
                
            // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:702:1: ( (otherlv_3= RULE_ID ) )
            // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:703:1: (otherlv_3= RULE_ID )
            {
            // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:703:1: (otherlv_3= RULE_ID )
            // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:704:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAssociationRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAssociation1438); 

            		newLeafNode(otherlv_3, grammarAccess.getAssociationAccess().getAssoTypeAssociationTypeCrossReference_3_0()); 
            	

            }


            }

            otherlv_4=(Token)match(input,30,FOLLOW_30_in_ruleAssociation1450); 

                	newLeafNode(otherlv_4, grammarAccess.getAssociationAccess().getToKeyword_4());
                
            // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:719:1: ( (lv_moduleType_5_0= RULE_STRING ) )
            // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:720:1: (lv_moduleType_5_0= RULE_STRING )
            {
            // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:720:1: (lv_moduleType_5_0= RULE_STRING )
            // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:721:3: lv_moduleType_5_0= RULE_STRING
            {
            lv_moduleType_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAssociation1467); 

            			newLeafNode(lv_moduleType_5_0, grammarAccess.getAssociationAccess().getModuleTypeSTRINGTerminalRuleCall_5_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAssociationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"moduleType",
                    		lv_moduleType_5_0, 
                    		"STRING");
            	    

            }


            }

            // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:737:2: (otherlv_6= '.' ( (lv_classType_7_0= RULE_STRING ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==31) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:737:4: otherlv_6= '.' ( (lv_classType_7_0= RULE_STRING ) )
                    {
                    otherlv_6=(Token)match(input,31,FOLLOW_31_in_ruleAssociation1485); 

                        	newLeafNode(otherlv_6, grammarAccess.getAssociationAccess().getFullStopKeyword_6_0());
                        
                    // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:741:1: ( (lv_classType_7_0= RULE_STRING ) )
                    // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:742:1: (lv_classType_7_0= RULE_STRING )
                    {
                    // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:742:1: (lv_classType_7_0= RULE_STRING )
                    // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:743:3: lv_classType_7_0= RULE_STRING
                    {
                    lv_classType_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAssociation1502); 

                    			newLeafNode(lv_classType_7_0, grammarAccess.getAssociationAccess().getClassTypeSTRINGTerminalRuleCall_6_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAssociationRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"classType",
                            		lv_classType_7_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:759:4: ( (lv_assoDescription_8_0= RULE_STRING ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_STRING) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:760:1: (lv_assoDescription_8_0= RULE_STRING )
                    {
                    // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:760:1: (lv_assoDescription_8_0= RULE_STRING )
                    // ../org.xtext.dsl.dxl/src-gen/org/xtext/dsl/dxl/parser/antlr/internal/InternalDxlDsl.g:761:3: lv_assoDescription_8_0= RULE_STRING
                    {
                    lv_assoDescription_8_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAssociation1526); 

                    			newLeafNode(lv_assoDescription_8_0, grammarAccess.getAssociationAccess().getAssoDescriptionSTRINGTerminalRuleCall_7_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAssociationRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"assoDescription",
                            		lv_assoDescription_8_0, 
                            		"STRING");
                    	    

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssociation"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleModel122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleModel139 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleModel156 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_ruleFolder_in_ruleModel177 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_13_in_ruleModel190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFolder_in_entryRuleFolder226 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFolder236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleFolder273 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFolder290 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleFolder307 = new BitSet(new long[]{0x000000000800A000L});
    public static final BitSet FOLLOW_ruleModule_in_ruleFolder328 = new BitSet(new long[]{0x000000000800A000L});
    public static final BitSet FOLLOW_ruleAssociationType_in_ruleFolder350 = new BitSet(new long[]{0x0000000008002000L});
    public static final BitSet FOLLOW_13_in_ruleFolder363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModule_in_entryRuleModule399 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModule409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleModule446 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_16_in_ruleModule464 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleModule495 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleModule512 = new BitSet(new long[]{0x0000000000062000L});
    public static final BitSet FOLLOW_17_in_ruleModule525 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleModule542 = new BitSet(new long[]{0x0000000000042000L});
    public static final BitSet FOLLOW_ruleClass_in_ruleModule570 = new BitSet(new long[]{0x0000000000042000L});
    public static final BitSet FOLLOW_13_in_ruleModule583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_in_entryRuleClass619 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClass629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleClass666 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_19_in_ruleClass684 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleClass715 = new BitSet(new long[]{0x0000000000101000L});
    public static final BitSet FOLLOW_20_in_ruleClass733 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleClass750 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleClass769 = new BitSet(new long[]{0x0000000017E02000L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleClass790 = new BitSet(new long[]{0x0000000017E02000L});
    public static final BitSet FOLLOW_ruleAssociation_in_ruleClass812 = new BitSet(new long[]{0x0000000010002000L});
    public static final BitSet FOLLOW_13_in_ruleClass825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute861 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleAttribute914 = new BitSet(new long[]{0x0000000007E00000L});
    public static final BitSet FOLLOW_ruleDataType_in_ruleAttribute949 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttribute966 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_ruleAttribute984 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttribute1001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataType_in_entryRuleDataType1045 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataType1056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleDataType1094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleDataType1113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleDataType1132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleDataType1151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleDataType1170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssociationType_in_entryRuleAssociationType1210 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssociationType1220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleAssociationType1257 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAssociationType1274 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAssociationType1296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssociation_in_entryRuleAssociation1337 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssociation1347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleAssociation1384 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAssociation1401 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleAssociation1418 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAssociation1438 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleAssociation1450 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAssociation1467 = new BitSet(new long[]{0x0000000080000022L});
    public static final BitSet FOLLOW_31_in_ruleAssociation1485 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAssociation1502 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAssociation1526 = new BitSet(new long[]{0x0000000000000002L});

}