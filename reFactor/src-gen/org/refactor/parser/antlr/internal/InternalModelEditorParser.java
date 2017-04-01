package org.refactor.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.refactor.services.ModelEditorGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalModelEditorParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Implements", "Protected", "Accesses", "Constant", "Extends", "Private", "Access", "Import", "Public", "Calls", "Class", "Cyclo", "Lines", "Call", "Code", "FullStopAsterisk", "Of", "To", "LeftParenthesis", "RightParenthesis", "Comma", "FullStop", "Colon", "RULE_BEGIN", "RULE_END", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int RULE_END=28;
    public static final int Import=11;
    public static final int RULE_BEGIN=27;
    public static final int Constant=7;
    public static final int Access=10;
    public static final int RULE_STRING=31;
    public static final int RULE_SL_COMMENT=33;
    public static final int Comma=24;
    public static final int Implements=4;
    public static final int LeftParenthesis=22;
    public static final int Accesses=6;
    public static final int Private=9;
    public static final int To=21;
    public static final int Colon=26;
    public static final int Extends=8;
    public static final int EOF=-1;
    public static final int Call=17;
    public static final int FullStop=25;
    public static final int Protected=5;
    public static final int RULE_ID=29;
    public static final int RULE_WS=34;
    public static final int Calls=13;
    public static final int RightParenthesis=23;
    public static final int Public=12;
    public static final int RULE_ANY_OTHER=35;
    public static final int Code=18;
    public static final int RULE_INT=30;
    public static final int FullStopAsterisk=19;
    public static final int Of=20;
    public static final int Cyclo=15;
    public static final int RULE_ML_COMMENT=32;
    public static final int Class=14;
    public static final int Lines=16;

    // delegates
    // delegators


        public InternalModelEditorParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalModelEditorParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalModelEditorParser.tokenNames; }
    public String getGrammarFileName() { return "InternalModelEditorParser.g"; }



     	private ModelEditorGrammarAccess grammarAccess;

        public InternalModelEditorParser(TokenStream input, ModelEditorGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected ModelEditorGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalModelEditorParser.g:57:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalModelEditorParser.g:57:46: (iv_ruleModel= ruleModel EOF )
            // InternalModelEditorParser.g:58:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalModelEditorParser.g:64:1: ruleModel returns [EObject current=null] : ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_classes_1_0= ruleClass ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_0_0 = null;

        EObject lv_classes_1_0 = null;



        	enterRule();

        try {
            // InternalModelEditorParser.g:70:2: ( ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_classes_1_0= ruleClass ) )* ) )
            // InternalModelEditorParser.g:71:2: ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_classes_1_0= ruleClass ) )* )
            {
            // InternalModelEditorParser.g:71:2: ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_classes_1_0= ruleClass ) )* )
            // InternalModelEditorParser.g:72:3: ( (lv_imports_0_0= ruleImport ) )* ( (lv_classes_1_0= ruleClass ) )*
            {
            // InternalModelEditorParser.g:72:3: ( (lv_imports_0_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==Import) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalModelEditorParser.g:73:4: (lv_imports_0_0= ruleImport )
            	    {
            	    // InternalModelEditorParser.g:73:4: (lv_imports_0_0= ruleImport )
            	    // InternalModelEditorParser.g:74:5: lv_imports_0_0= ruleImport
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getImportsImportParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_imports_0_0=ruleImport();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"imports",
            	    						lv_imports_0_0,
            	    						"org.refactor.ModelEditor.Import");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalModelEditorParser.g:91:3: ( (lv_classes_1_0= ruleClass ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==Constant||LA2_0==Private||LA2_0==Public||LA2_0==Class) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalModelEditorParser.g:92:4: (lv_classes_1_0= ruleClass )
            	    {
            	    // InternalModelEditorParser.g:92:4: (lv_classes_1_0= ruleClass )
            	    // InternalModelEditorParser.g:93:5: lv_classes_1_0= ruleClass
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getClassesClassParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_classes_1_0=ruleClass();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"classes",
            	    						lv_classes_1_0,
            	    						"org.refactor.ModelEditor.Class");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


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


    // $ANTLR start "entryRuleImport"
    // InternalModelEditorParser.g:114:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalModelEditorParser.g:114:47: (iv_ruleImport= ruleImport EOF )
            // InternalModelEditorParser.g:115:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalModelEditorParser.g:121:1: ruleImport returns [EObject current=null] : (otherlv_0= Import ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;



        	enterRule();

        try {
            // InternalModelEditorParser.g:127:2: ( (otherlv_0= Import ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) )
            // InternalModelEditorParser.g:128:2: (otherlv_0= Import ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            {
            // InternalModelEditorParser.g:128:2: (otherlv_0= Import ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            // InternalModelEditorParser.g:129:3: otherlv_0= Import ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            {
            otherlv_0=(Token)match(input,Import,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
            		
            // InternalModelEditorParser.g:133:3: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            // InternalModelEditorParser.g:134:4: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            {
            // InternalModelEditorParser.g:134:4: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            // InternalModelEditorParser.g:135:5: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard
            {

            					newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_importedNamespace_1_0=ruleQualifiedNameWithWildcard();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getImportRule());
            					}
            					set(
            						current,
            						"importedNamespace",
            						lv_importedNamespace_1_0,
            						"org.refactor.ModelEditor.QualifiedNameWithWildcard");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // InternalModelEditorParser.g:156:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // InternalModelEditorParser.g:156:65: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // InternalModelEditorParser.g:157:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;

             current =iv_ruleQualifiedNameWithWildcard.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // InternalModelEditorParser.g:163:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= FullStopAsterisk )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;



        	enterRule();

        try {
            // InternalModelEditorParser.g:169:2: ( (this_QualifiedName_0= ruleQualifiedName (kw= FullStopAsterisk )? ) )
            // InternalModelEditorParser.g:170:2: (this_QualifiedName_0= ruleQualifiedName (kw= FullStopAsterisk )? )
            {
            // InternalModelEditorParser.g:170:2: (this_QualifiedName_0= ruleQualifiedName (kw= FullStopAsterisk )? )
            // InternalModelEditorParser.g:171:3: this_QualifiedName_0= ruleQualifiedName (kw= FullStopAsterisk )?
            {

            			newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0());
            		
            pushFollow(FOLLOW_6);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;


            			current.merge(this_QualifiedName_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalModelEditorParser.g:181:3: (kw= FullStopAsterisk )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==FullStopAsterisk) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalModelEditorParser.g:182:4: kw= FullStopAsterisk
                    {
                    kw=(Token)match(input,FullStopAsterisk,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1());
                    			

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
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalModelEditorParser.g:192:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalModelEditorParser.g:192:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalModelEditorParser.g:193:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalModelEditorParser.g:199:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING ) ( (kw= FullStop this_ID_3= RULE_ID ) | this_STRING_4= RULE_STRING )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_STRING_1=null;
        Token kw=null;
        Token this_ID_3=null;
        Token this_STRING_4=null;


        	enterRule();

        try {
            // InternalModelEditorParser.g:205:2: ( ( (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING ) ( (kw= FullStop this_ID_3= RULE_ID ) | this_STRING_4= RULE_STRING )* ) )
            // InternalModelEditorParser.g:206:2: ( (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING ) ( (kw= FullStop this_ID_3= RULE_ID ) | this_STRING_4= RULE_STRING )* )
            {
            // InternalModelEditorParser.g:206:2: ( (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING ) ( (kw= FullStop this_ID_3= RULE_ID ) | this_STRING_4= RULE_STRING )* )
            // InternalModelEditorParser.g:207:3: (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING ) ( (kw= FullStop this_ID_3= RULE_ID ) | this_STRING_4= RULE_STRING )*
            {
            // InternalModelEditorParser.g:207:3: (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_STRING) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalModelEditorParser.g:208:4: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_7); 

                    				current.merge(this_ID_0);
                    			

                    				newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalModelEditorParser.g:216:4: this_STRING_1= RULE_STRING
                    {
                    this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_7); 

                    				current.merge(this_STRING_1);
                    			

                    				newLeafNode(this_STRING_1, grammarAccess.getQualifiedNameAccess().getSTRINGTerminalRuleCall_0_1());
                    			

                    }
                    break;

            }

            // InternalModelEditorParser.g:224:3: ( (kw= FullStop this_ID_3= RULE_ID ) | this_STRING_4= RULE_STRING )*
            loop5:
            do {
                int alt5=3;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_STRING) ) {
                    alt5=2;
                }
                else if ( (LA5_0==FullStop) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalModelEditorParser.g:225:4: (kw= FullStop this_ID_3= RULE_ID )
            	    {
            	    // InternalModelEditorParser.g:225:4: (kw= FullStop this_ID_3= RULE_ID )
            	    // InternalModelEditorParser.g:226:5: kw= FullStop this_ID_3= RULE_ID
            	    {
            	    kw=(Token)match(input,FullStop,FOLLOW_8); 

            	    					current.merge(kw);
            	    					newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0_0());
            	    				
            	    this_ID_3=(Token)match(input,RULE_ID,FOLLOW_7); 

            	    					current.merge(this_ID_3);
            	    				

            	    					newLeafNode(this_ID_3, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_0_1());
            	    				

            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalModelEditorParser.g:240:4: this_STRING_4= RULE_STRING
            	    {
            	    this_STRING_4=(Token)match(input,RULE_STRING,FOLLOW_7); 

            	    				current.merge(this_STRING_4);
            	    			

            	    				newLeafNode(this_STRING_4, grammarAccess.getQualifiedNameAccess().getSTRINGTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleClass"
    // InternalModelEditorParser.g:252:1: entryRuleClass returns [EObject current=null] : iv_ruleClass= ruleClass EOF ;
    public final EObject entryRuleClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClass = null;


        try {
            // InternalModelEditorParser.g:252:46: (iv_ruleClass= ruleClass EOF )
            // InternalModelEditorParser.g:253:2: iv_ruleClass= ruleClass EOF
            {
             newCompositeNode(grammarAccess.getClassRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClass=ruleClass();

            state._fsp--;

             current =iv_ruleClass; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalModelEditorParser.g:259:1: ruleClass returns [EObject current=null] : ( ( (lv_modifier_0_0= ruleClassModifier ) )? otherlv_1= Class ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= Extends ( ( ruleQualifiedName ) ) )? (otherlv_5= Implements ( ( ruleQualifiedName ) )* )? (this_BEGIN_7= RULE_BEGIN ( (lv_fields_8_0= ruleField ) )* ( (lv_methods_9_0= ruleMethod ) )* this_END_10= RULE_END )? ) ;
    public final EObject ruleClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token this_BEGIN_7=null;
        Token this_END_10=null;
        AntlrDatatypeRuleToken lv_modifier_0_0 = null;

        EObject lv_fields_8_0 = null;

        EObject lv_methods_9_0 = null;



        	enterRule();

        try {
            // InternalModelEditorParser.g:265:2: ( ( ( (lv_modifier_0_0= ruleClassModifier ) )? otherlv_1= Class ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= Extends ( ( ruleQualifiedName ) ) )? (otherlv_5= Implements ( ( ruleQualifiedName ) )* )? (this_BEGIN_7= RULE_BEGIN ( (lv_fields_8_0= ruleField ) )* ( (lv_methods_9_0= ruleMethod ) )* this_END_10= RULE_END )? ) )
            // InternalModelEditorParser.g:266:2: ( ( (lv_modifier_0_0= ruleClassModifier ) )? otherlv_1= Class ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= Extends ( ( ruleQualifiedName ) ) )? (otherlv_5= Implements ( ( ruleQualifiedName ) )* )? (this_BEGIN_7= RULE_BEGIN ( (lv_fields_8_0= ruleField ) )* ( (lv_methods_9_0= ruleMethod ) )* this_END_10= RULE_END )? )
            {
            // InternalModelEditorParser.g:266:2: ( ( (lv_modifier_0_0= ruleClassModifier ) )? otherlv_1= Class ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= Extends ( ( ruleQualifiedName ) ) )? (otherlv_5= Implements ( ( ruleQualifiedName ) )* )? (this_BEGIN_7= RULE_BEGIN ( (lv_fields_8_0= ruleField ) )* ( (lv_methods_9_0= ruleMethod ) )* this_END_10= RULE_END )? )
            // InternalModelEditorParser.g:267:3: ( (lv_modifier_0_0= ruleClassModifier ) )? otherlv_1= Class ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= Extends ( ( ruleQualifiedName ) ) )? (otherlv_5= Implements ( ( ruleQualifiedName ) )* )? (this_BEGIN_7= RULE_BEGIN ( (lv_fields_8_0= ruleField ) )* ( (lv_methods_9_0= ruleMethod ) )* this_END_10= RULE_END )?
            {
            // InternalModelEditorParser.g:267:3: ( (lv_modifier_0_0= ruleClassModifier ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==Constant||LA6_0==Private||LA6_0==Public) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalModelEditorParser.g:268:4: (lv_modifier_0_0= ruleClassModifier )
                    {
                    // InternalModelEditorParser.g:268:4: (lv_modifier_0_0= ruleClassModifier )
                    // InternalModelEditorParser.g:269:5: lv_modifier_0_0= ruleClassModifier
                    {

                    					newCompositeNode(grammarAccess.getClassAccess().getModifierClassModifierParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_9);
                    lv_modifier_0_0=ruleClassModifier();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getClassRule());
                    					}
                    					set(
                    						current,
                    						"modifier",
                    						lv_modifier_0_0,
                    						"org.refactor.ModelEditor.ClassModifier");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,Class,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getClassAccess().getClassKeyword_1());
            		
            // InternalModelEditorParser.g:290:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalModelEditorParser.g:291:4: (lv_name_2_0= RULE_ID )
            {
            // InternalModelEditorParser.g:291:4: (lv_name_2_0= RULE_ID )
            // InternalModelEditorParser.g:292:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_name_2_0, grammarAccess.getClassAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getClassRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalModelEditorParser.g:308:3: (otherlv_3= Extends ( ( ruleQualifiedName ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==Extends) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalModelEditorParser.g:309:4: otherlv_3= Extends ( ( ruleQualifiedName ) )
                    {
                    otherlv_3=(Token)match(input,Extends,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getClassAccess().getExtendsKeyword_3_0());
                    			
                    // InternalModelEditorParser.g:313:4: ( ( ruleQualifiedName ) )
                    // InternalModelEditorParser.g:314:5: ( ruleQualifiedName )
                    {
                    // InternalModelEditorParser.g:314:5: ( ruleQualifiedName )
                    // InternalModelEditorParser.g:315:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getClassRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getClassAccess().getSuperClassClassCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalModelEditorParser.g:330:3: (otherlv_5= Implements ( ( ruleQualifiedName ) )* )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==Implements) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalModelEditorParser.g:331:4: otherlv_5= Implements ( ( ruleQualifiedName ) )*
                    {
                    otherlv_5=(Token)match(input,Implements,FOLLOW_12); 

                    				newLeafNode(otherlv_5, grammarAccess.getClassAccess().getImplementsKeyword_4_0());
                    			
                    // InternalModelEditorParser.g:335:4: ( ( ruleQualifiedName ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==RULE_ID||LA8_0==RULE_STRING) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalModelEditorParser.g:336:5: ( ruleQualifiedName )
                    	    {
                    	    // InternalModelEditorParser.g:336:5: ( ruleQualifiedName )
                    	    // InternalModelEditorParser.g:337:6: ruleQualifiedName
                    	    {

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getClassRule());
                    	    						}
                    	    					

                    	    						newCompositeNode(grammarAccess.getClassAccess().getSuperTypesClassCrossReference_4_1_0());
                    	    					
                    	    pushFollow(FOLLOW_12);
                    	    ruleQualifiedName();

                    	    state._fsp--;


                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalModelEditorParser.g:352:3: (this_BEGIN_7= RULE_BEGIN ( (lv_fields_8_0= ruleField ) )* ( (lv_methods_9_0= ruleMethod ) )* this_END_10= RULE_END )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_BEGIN) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalModelEditorParser.g:353:4: this_BEGIN_7= RULE_BEGIN ( (lv_fields_8_0= ruleField ) )* ( (lv_methods_9_0= ruleMethod ) )* this_END_10= RULE_END
                    {
                    this_BEGIN_7=(Token)match(input,RULE_BEGIN,FOLLOW_13); 

                    				newLeafNode(this_BEGIN_7, grammarAccess.getClassAccess().getBEGINTerminalRuleCall_5_0());
                    			
                    // InternalModelEditorParser.g:357:4: ( (lv_fields_8_0= ruleField ) )*
                    loop10:
                    do {
                        int alt10=2;
                        switch ( input.LA(1) ) {
                        case Public:
                            {
                            int LA10_1 = input.LA(2);

                            if ( (LA10_1==RULE_ID) ) {
                                int LA10_5 = input.LA(3);

                                if ( (LA10_5==Protected||LA10_5==Constant||LA10_5==Private||LA10_5==Public||LA10_5==Colon||(LA10_5>=RULE_END && LA10_5<=RULE_ID)) ) {
                                    alt10=1;
                                }


                            }


                            }
                            break;
                        case Private:
                            {
                            int LA10_2 = input.LA(2);

                            if ( (LA10_2==RULE_ID) ) {
                                int LA10_5 = input.LA(3);

                                if ( (LA10_5==Protected||LA10_5==Constant||LA10_5==Private||LA10_5==Public||LA10_5==Colon||(LA10_5>=RULE_END && LA10_5<=RULE_ID)) ) {
                                    alt10=1;
                                }


                            }


                            }
                            break;
                        case Protected:
                            {
                            int LA10_3 = input.LA(2);

                            if ( (LA10_3==RULE_ID) ) {
                                int LA10_5 = input.LA(3);

                                if ( (LA10_5==Protected||LA10_5==Constant||LA10_5==Private||LA10_5==Public||LA10_5==Colon||(LA10_5>=RULE_END && LA10_5<=RULE_ID)) ) {
                                    alt10=1;
                                }


                            }


                            }
                            break;
                        case Constant:
                            {
                            int LA10_4 = input.LA(2);

                            if ( (LA10_4==RULE_ID) ) {
                                int LA10_5 = input.LA(3);

                                if ( (LA10_5==Protected||LA10_5==Constant||LA10_5==Private||LA10_5==Public||LA10_5==Colon||(LA10_5>=RULE_END && LA10_5<=RULE_ID)) ) {
                                    alt10=1;
                                }


                            }


                            }
                            break;
                        case RULE_ID:
                            {
                            int LA10_5 = input.LA(2);

                            if ( (LA10_5==Protected||LA10_5==Constant||LA10_5==Private||LA10_5==Public||LA10_5==Colon||(LA10_5>=RULE_END && LA10_5<=RULE_ID)) ) {
                                alt10=1;
                            }


                            }
                            break;

                        }

                        switch (alt10) {
                    	case 1 :
                    	    // InternalModelEditorParser.g:358:5: (lv_fields_8_0= ruleField )
                    	    {
                    	    // InternalModelEditorParser.g:358:5: (lv_fields_8_0= ruleField )
                    	    // InternalModelEditorParser.g:359:6: lv_fields_8_0= ruleField
                    	    {

                    	    						newCompositeNode(grammarAccess.getClassAccess().getFieldsFieldParserRuleCall_5_1_0());
                    	    					
                    	    pushFollow(FOLLOW_13);
                    	    lv_fields_8_0=ruleField();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getClassRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"fields",
                    	    							lv_fields_8_0,
                    	    							"org.refactor.ModelEditor.Field");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    // InternalModelEditorParser.g:376:4: ( (lv_methods_9_0= ruleMethod ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==Protected||LA11_0==Constant||LA11_0==Private||LA11_0==Public||LA11_0==RULE_ID) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalModelEditorParser.g:377:5: (lv_methods_9_0= ruleMethod )
                    	    {
                    	    // InternalModelEditorParser.g:377:5: (lv_methods_9_0= ruleMethod )
                    	    // InternalModelEditorParser.g:378:6: lv_methods_9_0= ruleMethod
                    	    {

                    	    						newCompositeNode(grammarAccess.getClassAccess().getMethodsMethodParserRuleCall_5_2_0());
                    	    					
                    	    pushFollow(FOLLOW_13);
                    	    lv_methods_9_0=ruleMethod();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getClassRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"methods",
                    	    							lv_methods_9_0,
                    	    							"org.refactor.ModelEditor.Method");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    this_END_10=(Token)match(input,RULE_END,FOLLOW_2); 

                    				newLeafNode(this_END_10, grammarAccess.getClassAccess().getENDTerminalRuleCall_5_3());
                    			

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
    // $ANTLR end "ruleClass"


    // $ANTLR start "entryRuleField"
    // InternalModelEditorParser.g:404:1: entryRuleField returns [EObject current=null] : iv_ruleField= ruleField EOF ;
    public final EObject entryRuleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField = null;


        try {
            // InternalModelEditorParser.g:404:46: (iv_ruleField= ruleField EOF )
            // InternalModelEditorParser.g:405:2: iv_ruleField= ruleField EOF
            {
             newCompositeNode(grammarAccess.getFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleField=ruleField();

            state._fsp--;

             current =iv_ruleField; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleField"


    // $ANTLR start "ruleField"
    // InternalModelEditorParser.g:411:1: ruleField returns [EObject current=null] : ( ( (lv_modifier_0_0= ruleMemberModifier ) )? ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= Colon ( ( ruleQualifiedName ) ) )? ) ;
    public final EObject ruleField() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_modifier_0_0 = null;



        	enterRule();

        try {
            // InternalModelEditorParser.g:417:2: ( ( ( (lv_modifier_0_0= ruleMemberModifier ) )? ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= Colon ( ( ruleQualifiedName ) ) )? ) )
            // InternalModelEditorParser.g:418:2: ( ( (lv_modifier_0_0= ruleMemberModifier ) )? ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= Colon ( ( ruleQualifiedName ) ) )? )
            {
            // InternalModelEditorParser.g:418:2: ( ( (lv_modifier_0_0= ruleMemberModifier ) )? ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= Colon ( ( ruleQualifiedName ) ) )? )
            // InternalModelEditorParser.g:419:3: ( (lv_modifier_0_0= ruleMemberModifier ) )? ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= Colon ( ( ruleQualifiedName ) ) )?
            {
            // InternalModelEditorParser.g:419:3: ( (lv_modifier_0_0= ruleMemberModifier ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==Protected||LA13_0==Constant||LA13_0==Private||LA13_0==Public) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalModelEditorParser.g:420:4: (lv_modifier_0_0= ruleMemberModifier )
                    {
                    // InternalModelEditorParser.g:420:4: (lv_modifier_0_0= ruleMemberModifier )
                    // InternalModelEditorParser.g:421:5: lv_modifier_0_0= ruleMemberModifier
                    {

                    					newCompositeNode(grammarAccess.getFieldAccess().getModifierMemberModifierParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_8);
                    lv_modifier_0_0=ruleMemberModifier();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFieldRule());
                    					}
                    					set(
                    						current,
                    						"modifier",
                    						lv_modifier_0_0,
                    						"org.refactor.ModelEditor.MemberModifier");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalModelEditorParser.g:438:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalModelEditorParser.g:439:4: (lv_name_1_0= RULE_ID )
            {
            // InternalModelEditorParser.g:439:4: (lv_name_1_0= RULE_ID )
            // InternalModelEditorParser.g:440:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(lv_name_1_0, grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFieldRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalModelEditorParser.g:456:3: (otherlv_2= Colon ( ( ruleQualifiedName ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==Colon) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalModelEditorParser.g:457:4: otherlv_2= Colon ( ( ruleQualifiedName ) )
                    {
                    otherlv_2=(Token)match(input,Colon,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getFieldAccess().getColonKeyword_2_0());
                    			
                    // InternalModelEditorParser.g:461:4: ( ( ruleQualifiedName ) )
                    // InternalModelEditorParser.g:462:5: ( ruleQualifiedName )
                    {
                    // InternalModelEditorParser.g:462:5: ( ruleQualifiedName )
                    // InternalModelEditorParser.g:463:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFieldRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getFieldAccess().getTypeClassCrossReference_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

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
    // $ANTLR end "ruleField"


    // $ANTLR start "entryRuleMethod"
    // InternalModelEditorParser.g:482:1: entryRuleMethod returns [EObject current=null] : iv_ruleMethod= ruleMethod EOF ;
    public final EObject entryRuleMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethod = null;


        try {
            // InternalModelEditorParser.g:482:47: (iv_ruleMethod= ruleMethod EOF )
            // InternalModelEditorParser.g:483:2: iv_ruleMethod= ruleMethod EOF
            {
             newCompositeNode(grammarAccess.getMethodRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMethod=ruleMethod();

            state._fsp--;

             current =iv_ruleMethod; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMethod"


    // $ANTLR start "ruleMethod"
    // InternalModelEditorParser.g:489:1: ruleMethod returns [EObject current=null] : ( ( (lv_modifier_0_0= ruleMemberModifier ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= LeftParenthesis ( ( ( ruleQualifiedName ) ) (otherlv_4= Comma ( ( ruleQualifiedName ) ) )* )? otherlv_6= RightParenthesis (otherlv_7= Colon ( ( ruleQualifiedName ) ) )? (this_BEGIN_9= RULE_BEGIN ( ( (lv_loc_10_0= RULE_INT ) ) otherlv_11= Lines otherlv_12= Of otherlv_13= Code )? ( ( (lv_cyclo_14_0= RULE_INT ) ) otherlv_15= Cyclo )? ( (lv_accesses_16_0= ruleAccess ) )* ( (lv_calls_17_0= ruleCall ) )* this_END_18= RULE_END )? ) ;
    public final EObject ruleMethod() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token this_BEGIN_9=null;
        Token lv_loc_10_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token lv_cyclo_14_0=null;
        Token otherlv_15=null;
        Token this_END_18=null;
        AntlrDatatypeRuleToken lv_modifier_0_0 = null;

        EObject lv_accesses_16_0 = null;

        EObject lv_calls_17_0 = null;



        	enterRule();

        try {
            // InternalModelEditorParser.g:495:2: ( ( ( (lv_modifier_0_0= ruleMemberModifier ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= LeftParenthesis ( ( ( ruleQualifiedName ) ) (otherlv_4= Comma ( ( ruleQualifiedName ) ) )* )? otherlv_6= RightParenthesis (otherlv_7= Colon ( ( ruleQualifiedName ) ) )? (this_BEGIN_9= RULE_BEGIN ( ( (lv_loc_10_0= RULE_INT ) ) otherlv_11= Lines otherlv_12= Of otherlv_13= Code )? ( ( (lv_cyclo_14_0= RULE_INT ) ) otherlv_15= Cyclo )? ( (lv_accesses_16_0= ruleAccess ) )* ( (lv_calls_17_0= ruleCall ) )* this_END_18= RULE_END )? ) )
            // InternalModelEditorParser.g:496:2: ( ( (lv_modifier_0_0= ruleMemberModifier ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= LeftParenthesis ( ( ( ruleQualifiedName ) ) (otherlv_4= Comma ( ( ruleQualifiedName ) ) )* )? otherlv_6= RightParenthesis (otherlv_7= Colon ( ( ruleQualifiedName ) ) )? (this_BEGIN_9= RULE_BEGIN ( ( (lv_loc_10_0= RULE_INT ) ) otherlv_11= Lines otherlv_12= Of otherlv_13= Code )? ( ( (lv_cyclo_14_0= RULE_INT ) ) otherlv_15= Cyclo )? ( (lv_accesses_16_0= ruleAccess ) )* ( (lv_calls_17_0= ruleCall ) )* this_END_18= RULE_END )? )
            {
            // InternalModelEditorParser.g:496:2: ( ( (lv_modifier_0_0= ruleMemberModifier ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= LeftParenthesis ( ( ( ruleQualifiedName ) ) (otherlv_4= Comma ( ( ruleQualifiedName ) ) )* )? otherlv_6= RightParenthesis (otherlv_7= Colon ( ( ruleQualifiedName ) ) )? (this_BEGIN_9= RULE_BEGIN ( ( (lv_loc_10_0= RULE_INT ) ) otherlv_11= Lines otherlv_12= Of otherlv_13= Code )? ( ( (lv_cyclo_14_0= RULE_INT ) ) otherlv_15= Cyclo )? ( (lv_accesses_16_0= ruleAccess ) )* ( (lv_calls_17_0= ruleCall ) )* this_END_18= RULE_END )? )
            // InternalModelEditorParser.g:497:3: ( (lv_modifier_0_0= ruleMemberModifier ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= LeftParenthesis ( ( ( ruleQualifiedName ) ) (otherlv_4= Comma ( ( ruleQualifiedName ) ) )* )? otherlv_6= RightParenthesis (otherlv_7= Colon ( ( ruleQualifiedName ) ) )? (this_BEGIN_9= RULE_BEGIN ( ( (lv_loc_10_0= RULE_INT ) ) otherlv_11= Lines otherlv_12= Of otherlv_13= Code )? ( ( (lv_cyclo_14_0= RULE_INT ) ) otherlv_15= Cyclo )? ( (lv_accesses_16_0= ruleAccess ) )* ( (lv_calls_17_0= ruleCall ) )* this_END_18= RULE_END )?
            {
            // InternalModelEditorParser.g:497:3: ( (lv_modifier_0_0= ruleMemberModifier ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==Protected||LA15_0==Constant||LA15_0==Private||LA15_0==Public) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalModelEditorParser.g:498:4: (lv_modifier_0_0= ruleMemberModifier )
                    {
                    // InternalModelEditorParser.g:498:4: (lv_modifier_0_0= ruleMemberModifier )
                    // InternalModelEditorParser.g:499:5: lv_modifier_0_0= ruleMemberModifier
                    {

                    					newCompositeNode(grammarAccess.getMethodAccess().getModifierMemberModifierParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_8);
                    lv_modifier_0_0=ruleMemberModifier();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getMethodRule());
                    					}
                    					set(
                    						current,
                    						"modifier",
                    						lv_modifier_0_0,
                    						"org.refactor.ModelEditor.MemberModifier");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalModelEditorParser.g:516:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalModelEditorParser.g:517:4: (lv_name_1_0= RULE_ID )
            {
            // InternalModelEditorParser.g:517:4: (lv_name_1_0= RULE_ID )
            // InternalModelEditorParser.g:518:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMethodAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMethodRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,LeftParenthesis,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getMethodAccess().getLeftParenthesisKeyword_2());
            		
            // InternalModelEditorParser.g:538:3: ( ( ( ruleQualifiedName ) ) (otherlv_4= Comma ( ( ruleQualifiedName ) ) )* )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ID||LA17_0==RULE_STRING) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalModelEditorParser.g:539:4: ( ( ruleQualifiedName ) ) (otherlv_4= Comma ( ( ruleQualifiedName ) ) )*
                    {
                    // InternalModelEditorParser.g:539:4: ( ( ruleQualifiedName ) )
                    // InternalModelEditorParser.g:540:5: ( ruleQualifiedName )
                    {
                    // InternalModelEditorParser.g:540:5: ( ruleQualifiedName )
                    // InternalModelEditorParser.g:541:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMethodRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getMethodAccess().getTypesClassCrossReference_3_0_0());
                    					
                    pushFollow(FOLLOW_17);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalModelEditorParser.g:555:4: (otherlv_4= Comma ( ( ruleQualifiedName ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==Comma) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalModelEditorParser.g:556:5: otherlv_4= Comma ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_4=(Token)match(input,Comma,FOLLOW_5); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getMethodAccess().getCommaKeyword_3_1_0());
                    	    				
                    	    // InternalModelEditorParser.g:560:5: ( ( ruleQualifiedName ) )
                    	    // InternalModelEditorParser.g:561:6: ( ruleQualifiedName )
                    	    {
                    	    // InternalModelEditorParser.g:561:6: ( ruleQualifiedName )
                    	    // InternalModelEditorParser.g:562:7: ruleQualifiedName
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getMethodRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getMethodAccess().getTypesClassCrossReference_3_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_17);
                    	    ruleQualifiedName();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,RightParenthesis,FOLLOW_18); 

            			newLeafNode(otherlv_6, grammarAccess.getMethodAccess().getRightParenthesisKeyword_4());
            		
            // InternalModelEditorParser.g:582:3: (otherlv_7= Colon ( ( ruleQualifiedName ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==Colon) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalModelEditorParser.g:583:4: otherlv_7= Colon ( ( ruleQualifiedName ) )
                    {
                    otherlv_7=(Token)match(input,Colon,FOLLOW_5); 

                    				newLeafNode(otherlv_7, grammarAccess.getMethodAccess().getColonKeyword_5_0());
                    			
                    // InternalModelEditorParser.g:587:4: ( ( ruleQualifiedName ) )
                    // InternalModelEditorParser.g:588:5: ( ruleQualifiedName )
                    {
                    // InternalModelEditorParser.g:588:5: ( ruleQualifiedName )
                    // InternalModelEditorParser.g:589:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMethodRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getMethodAccess().getTypeClassCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_19);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalModelEditorParser.g:604:3: (this_BEGIN_9= RULE_BEGIN ( ( (lv_loc_10_0= RULE_INT ) ) otherlv_11= Lines otherlv_12= Of otherlv_13= Code )? ( ( (lv_cyclo_14_0= RULE_INT ) ) otherlv_15= Cyclo )? ( (lv_accesses_16_0= ruleAccess ) )* ( (lv_calls_17_0= ruleCall ) )* this_END_18= RULE_END )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_BEGIN) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalModelEditorParser.g:605:4: this_BEGIN_9= RULE_BEGIN ( ( (lv_loc_10_0= RULE_INT ) ) otherlv_11= Lines otherlv_12= Of otherlv_13= Code )? ( ( (lv_cyclo_14_0= RULE_INT ) ) otherlv_15= Cyclo )? ( (lv_accesses_16_0= ruleAccess ) )* ( (lv_calls_17_0= ruleCall ) )* this_END_18= RULE_END
                    {
                    this_BEGIN_9=(Token)match(input,RULE_BEGIN,FOLLOW_20); 

                    				newLeafNode(this_BEGIN_9, grammarAccess.getMethodAccess().getBEGINTerminalRuleCall_6_0());
                    			
                    // InternalModelEditorParser.g:609:4: ( ( (lv_loc_10_0= RULE_INT ) ) otherlv_11= Lines otherlv_12= Of otherlv_13= Code )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==RULE_INT) ) {
                        int LA19_1 = input.LA(2);

                        if ( (LA19_1==Lines) ) {
                            alt19=1;
                        }
                    }
                    switch (alt19) {
                        case 1 :
                            // InternalModelEditorParser.g:610:5: ( (lv_loc_10_0= RULE_INT ) ) otherlv_11= Lines otherlv_12= Of otherlv_13= Code
                            {
                            // InternalModelEditorParser.g:610:5: ( (lv_loc_10_0= RULE_INT ) )
                            // InternalModelEditorParser.g:611:6: (lv_loc_10_0= RULE_INT )
                            {
                            // InternalModelEditorParser.g:611:6: (lv_loc_10_0= RULE_INT )
                            // InternalModelEditorParser.g:612:7: lv_loc_10_0= RULE_INT
                            {
                            lv_loc_10_0=(Token)match(input,RULE_INT,FOLLOW_21); 

                            							newLeafNode(lv_loc_10_0, grammarAccess.getMethodAccess().getLocINTTerminalRuleCall_6_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getMethodRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"loc",
                            								lv_loc_10_0,
                            								"org.eclipse.xtext.common.Terminals.INT");
                            						

                            }


                            }

                            otherlv_11=(Token)match(input,Lines,FOLLOW_22); 

                            					newLeafNode(otherlv_11, grammarAccess.getMethodAccess().getLinesKeyword_6_1_1());
                            				
                            otherlv_12=(Token)match(input,Of,FOLLOW_23); 

                            					newLeafNode(otherlv_12, grammarAccess.getMethodAccess().getOfKeyword_6_1_2());
                            				
                            otherlv_13=(Token)match(input,Code,FOLLOW_20); 

                            					newLeafNode(otherlv_13, grammarAccess.getMethodAccess().getCodeKeyword_6_1_3());
                            				

                            }
                            break;

                    }

                    // InternalModelEditorParser.g:641:4: ( ( (lv_cyclo_14_0= RULE_INT ) ) otherlv_15= Cyclo )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==RULE_INT) ) {
                        int LA20_1 = input.LA(2);

                        if ( (LA20_1==Cyclo) ) {
                            alt20=1;
                        }
                    }
                    switch (alt20) {
                        case 1 :
                            // InternalModelEditorParser.g:642:5: ( (lv_cyclo_14_0= RULE_INT ) ) otherlv_15= Cyclo
                            {
                            // InternalModelEditorParser.g:642:5: ( (lv_cyclo_14_0= RULE_INT ) )
                            // InternalModelEditorParser.g:643:6: (lv_cyclo_14_0= RULE_INT )
                            {
                            // InternalModelEditorParser.g:643:6: (lv_cyclo_14_0= RULE_INT )
                            // InternalModelEditorParser.g:644:7: lv_cyclo_14_0= RULE_INT
                            {
                            lv_cyclo_14_0=(Token)match(input,RULE_INT,FOLLOW_24); 

                            							newLeafNode(lv_cyclo_14_0, grammarAccess.getMethodAccess().getCycloINTTerminalRuleCall_6_2_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getMethodRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"cyclo",
                            								lv_cyclo_14_0,
                            								"org.eclipse.xtext.common.Terminals.INT");
                            						

                            }


                            }

                            otherlv_15=(Token)match(input,Cyclo,FOLLOW_20); 

                            					newLeafNode(otherlv_15, grammarAccess.getMethodAccess().getCycloKeyword_6_2_1());
                            				

                            }
                            break;

                    }

                    // InternalModelEditorParser.g:665:4: ( (lv_accesses_16_0= ruleAccess ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==RULE_INT) ) {
                            int LA21_1 = input.LA(2);

                            if ( (LA21_1==Accesses||LA21_1==Access) ) {
                                alt21=1;
                            }


                        }


                        switch (alt21) {
                    	case 1 :
                    	    // InternalModelEditorParser.g:666:5: (lv_accesses_16_0= ruleAccess )
                    	    {
                    	    // InternalModelEditorParser.g:666:5: (lv_accesses_16_0= ruleAccess )
                    	    // InternalModelEditorParser.g:667:6: lv_accesses_16_0= ruleAccess
                    	    {

                    	    						newCompositeNode(grammarAccess.getMethodAccess().getAccessesAccessParserRuleCall_6_3_0());
                    	    					
                    	    pushFollow(FOLLOW_20);
                    	    lv_accesses_16_0=ruleAccess();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getMethodRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"accesses",
                    	    							lv_accesses_16_0,
                    	    							"org.refactor.ModelEditor.Access");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);

                    // InternalModelEditorParser.g:684:4: ( (lv_calls_17_0= ruleCall ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==RULE_INT) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // InternalModelEditorParser.g:685:5: (lv_calls_17_0= ruleCall )
                    	    {
                    	    // InternalModelEditorParser.g:685:5: (lv_calls_17_0= ruleCall )
                    	    // InternalModelEditorParser.g:686:6: lv_calls_17_0= ruleCall
                    	    {

                    	    						newCompositeNode(grammarAccess.getMethodAccess().getCallsCallParserRuleCall_6_4_0());
                    	    					
                    	    pushFollow(FOLLOW_20);
                    	    lv_calls_17_0=ruleCall();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getMethodRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"calls",
                    	    							lv_calls_17_0,
                    	    							"org.refactor.ModelEditor.Call");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);

                    this_END_18=(Token)match(input,RULE_END,FOLLOW_2); 

                    				newLeafNode(this_END_18, grammarAccess.getMethodAccess().getENDTerminalRuleCall_6_5());
                    			

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
    // $ANTLR end "ruleMethod"


    // $ANTLR start "entryRuleMemberModifier"
    // InternalModelEditorParser.g:712:1: entryRuleMemberModifier returns [String current=null] : iv_ruleMemberModifier= ruleMemberModifier EOF ;
    public final String entryRuleMemberModifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMemberModifier = null;


        try {
            // InternalModelEditorParser.g:712:54: (iv_ruleMemberModifier= ruleMemberModifier EOF )
            // InternalModelEditorParser.g:713:2: iv_ruleMemberModifier= ruleMemberModifier EOF
            {
             newCompositeNode(grammarAccess.getMemberModifierRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMemberModifier=ruleMemberModifier();

            state._fsp--;

             current =iv_ruleMemberModifier.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMemberModifier"


    // $ANTLR start "ruleMemberModifier"
    // InternalModelEditorParser.g:719:1: ruleMemberModifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= Public | kw= Private | kw= Protected | kw= Constant ) ;
    public final AntlrDatatypeRuleToken ruleMemberModifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalModelEditorParser.g:725:2: ( (kw= Public | kw= Private | kw= Protected | kw= Constant ) )
            // InternalModelEditorParser.g:726:2: (kw= Public | kw= Private | kw= Protected | kw= Constant )
            {
            // InternalModelEditorParser.g:726:2: (kw= Public | kw= Private | kw= Protected | kw= Constant )
            int alt24=4;
            switch ( input.LA(1) ) {
            case Public:
                {
                alt24=1;
                }
                break;
            case Private:
                {
                alt24=2;
                }
                break;
            case Protected:
                {
                alt24=3;
                }
                break;
            case Constant:
                {
                alt24=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // InternalModelEditorParser.g:727:3: kw= Public
                    {
                    kw=(Token)match(input,Public,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMemberModifierAccess().getPublicKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalModelEditorParser.g:733:3: kw= Private
                    {
                    kw=(Token)match(input,Private,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMemberModifierAccess().getPrivateKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalModelEditorParser.g:739:3: kw= Protected
                    {
                    kw=(Token)match(input,Protected,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMemberModifierAccess().getProtectedKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalModelEditorParser.g:745:3: kw= Constant
                    {
                    kw=(Token)match(input,Constant,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMemberModifierAccess().getConstantKeyword_3());
                    		

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
    // $ANTLR end "ruleMemberModifier"


    // $ANTLR start "entryRuleClassModifier"
    // InternalModelEditorParser.g:754:1: entryRuleClassModifier returns [String current=null] : iv_ruleClassModifier= ruleClassModifier EOF ;
    public final String entryRuleClassModifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleClassModifier = null;


        try {
            // InternalModelEditorParser.g:754:53: (iv_ruleClassModifier= ruleClassModifier EOF )
            // InternalModelEditorParser.g:755:2: iv_ruleClassModifier= ruleClassModifier EOF
            {
             newCompositeNode(grammarAccess.getClassModifierRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClassModifier=ruleClassModifier();

            state._fsp--;

             current =iv_ruleClassModifier.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleClassModifier"


    // $ANTLR start "ruleClassModifier"
    // InternalModelEditorParser.g:761:1: ruleClassModifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= Public | kw= Private | kw= Constant ) ;
    public final AntlrDatatypeRuleToken ruleClassModifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalModelEditorParser.g:767:2: ( (kw= Public | kw= Private | kw= Constant ) )
            // InternalModelEditorParser.g:768:2: (kw= Public | kw= Private | kw= Constant )
            {
            // InternalModelEditorParser.g:768:2: (kw= Public | kw= Private | kw= Constant )
            int alt25=3;
            switch ( input.LA(1) ) {
            case Public:
                {
                alt25=1;
                }
                break;
            case Private:
                {
                alt25=2;
                }
                break;
            case Constant:
                {
                alt25=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // InternalModelEditorParser.g:769:3: kw= Public
                    {
                    kw=(Token)match(input,Public,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getClassModifierAccess().getPublicKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalModelEditorParser.g:775:3: kw= Private
                    {
                    kw=(Token)match(input,Private,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getClassModifierAccess().getPrivateKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalModelEditorParser.g:781:3: kw= Constant
                    {
                    kw=(Token)match(input,Constant,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getClassModifierAccess().getConstantKeyword_2());
                    		

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
    // $ANTLR end "ruleClassModifier"


    // $ANTLR start "entryRuleAccess"
    // InternalModelEditorParser.g:790:1: entryRuleAccess returns [EObject current=null] : iv_ruleAccess= ruleAccess EOF ;
    public final EObject entryRuleAccess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAccess = null;


        try {
            // InternalModelEditorParser.g:790:47: (iv_ruleAccess= ruleAccess EOF )
            // InternalModelEditorParser.g:791:2: iv_ruleAccess= ruleAccess EOF
            {
             newCompositeNode(grammarAccess.getAccessRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAccess=ruleAccess();

            state._fsp--;

             current =iv_ruleAccess; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAccess"


    // $ANTLR start "ruleAccess"
    // InternalModelEditorParser.g:797:1: ruleAccess returns [EObject current=null] : ( ( (lv_accesses_0_0= RULE_INT ) ) (otherlv_1= Access | otherlv_2= Accesses ) otherlv_3= To ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleAccess() throws RecognitionException {
        EObject current = null;

        Token lv_accesses_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalModelEditorParser.g:803:2: ( ( ( (lv_accesses_0_0= RULE_INT ) ) (otherlv_1= Access | otherlv_2= Accesses ) otherlv_3= To ( ( ruleQualifiedName ) ) ) )
            // InternalModelEditorParser.g:804:2: ( ( (lv_accesses_0_0= RULE_INT ) ) (otherlv_1= Access | otherlv_2= Accesses ) otherlv_3= To ( ( ruleQualifiedName ) ) )
            {
            // InternalModelEditorParser.g:804:2: ( ( (lv_accesses_0_0= RULE_INT ) ) (otherlv_1= Access | otherlv_2= Accesses ) otherlv_3= To ( ( ruleQualifiedName ) ) )
            // InternalModelEditorParser.g:805:3: ( (lv_accesses_0_0= RULE_INT ) ) (otherlv_1= Access | otherlv_2= Accesses ) otherlv_3= To ( ( ruleQualifiedName ) )
            {
            // InternalModelEditorParser.g:805:3: ( (lv_accesses_0_0= RULE_INT ) )
            // InternalModelEditorParser.g:806:4: (lv_accesses_0_0= RULE_INT )
            {
            // InternalModelEditorParser.g:806:4: (lv_accesses_0_0= RULE_INT )
            // InternalModelEditorParser.g:807:5: lv_accesses_0_0= RULE_INT
            {
            lv_accesses_0_0=(Token)match(input,RULE_INT,FOLLOW_25); 

            					newLeafNode(lv_accesses_0_0, grammarAccess.getAccessAccess().getAccessesINTTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAccessRule());
            					}
            					setWithLastConsumed(
            						current,
            						"accesses",
            						lv_accesses_0_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalModelEditorParser.g:823:3: (otherlv_1= Access | otherlv_2= Accesses )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==Access) ) {
                alt26=1;
            }
            else if ( (LA26_0==Accesses) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalModelEditorParser.g:824:4: otherlv_1= Access
                    {
                    otherlv_1=(Token)match(input,Access,FOLLOW_26); 

                    				newLeafNode(otherlv_1, grammarAccess.getAccessAccess().getAccessKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalModelEditorParser.g:829:4: otherlv_2= Accesses
                    {
                    otherlv_2=(Token)match(input,Accesses,FOLLOW_26); 

                    				newLeafNode(otherlv_2, grammarAccess.getAccessAccess().getAccessesKeyword_1_1());
                    			

                    }
                    break;

            }

            otherlv_3=(Token)match(input,To,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getAccessAccess().getToKeyword_2());
            		
            // InternalModelEditorParser.g:838:3: ( ( ruleQualifiedName ) )
            // InternalModelEditorParser.g:839:4: ( ruleQualifiedName )
            {
            // InternalModelEditorParser.g:839:4: ( ruleQualifiedName )
            // InternalModelEditorParser.g:840:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAccessRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAccessAccess().getFieldFieldCrossReference_3_0());
            				
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleAccess"


    // $ANTLR start "entryRuleCall"
    // InternalModelEditorParser.g:858:1: entryRuleCall returns [EObject current=null] : iv_ruleCall= ruleCall EOF ;
    public final EObject entryRuleCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCall = null;


        try {
            // InternalModelEditorParser.g:858:45: (iv_ruleCall= ruleCall EOF )
            // InternalModelEditorParser.g:859:2: iv_ruleCall= ruleCall EOF
            {
             newCompositeNode(grammarAccess.getCallRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCall=ruleCall();

            state._fsp--;

             current =iv_ruleCall; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCall"


    // $ANTLR start "ruleCall"
    // InternalModelEditorParser.g:865:1: ruleCall returns [EObject current=null] : ( ( (lv_calls_0_0= RULE_INT ) ) (otherlv_1= Call | otherlv_2= Calls ) otherlv_3= To ( ( ruleQualifiedName ) ) otherlv_5= LeftParenthesis otherlv_6= RightParenthesis ) ;
    public final EObject ruleCall() throws RecognitionException {
        EObject current = null;

        Token lv_calls_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalModelEditorParser.g:871:2: ( ( ( (lv_calls_0_0= RULE_INT ) ) (otherlv_1= Call | otherlv_2= Calls ) otherlv_3= To ( ( ruleQualifiedName ) ) otherlv_5= LeftParenthesis otherlv_6= RightParenthesis ) )
            // InternalModelEditorParser.g:872:2: ( ( (lv_calls_0_0= RULE_INT ) ) (otherlv_1= Call | otherlv_2= Calls ) otherlv_3= To ( ( ruleQualifiedName ) ) otherlv_5= LeftParenthesis otherlv_6= RightParenthesis )
            {
            // InternalModelEditorParser.g:872:2: ( ( (lv_calls_0_0= RULE_INT ) ) (otherlv_1= Call | otherlv_2= Calls ) otherlv_3= To ( ( ruleQualifiedName ) ) otherlv_5= LeftParenthesis otherlv_6= RightParenthesis )
            // InternalModelEditorParser.g:873:3: ( (lv_calls_0_0= RULE_INT ) ) (otherlv_1= Call | otherlv_2= Calls ) otherlv_3= To ( ( ruleQualifiedName ) ) otherlv_5= LeftParenthesis otherlv_6= RightParenthesis
            {
            // InternalModelEditorParser.g:873:3: ( (lv_calls_0_0= RULE_INT ) )
            // InternalModelEditorParser.g:874:4: (lv_calls_0_0= RULE_INT )
            {
            // InternalModelEditorParser.g:874:4: (lv_calls_0_0= RULE_INT )
            // InternalModelEditorParser.g:875:5: lv_calls_0_0= RULE_INT
            {
            lv_calls_0_0=(Token)match(input,RULE_INT,FOLLOW_27); 

            					newLeafNode(lv_calls_0_0, grammarAccess.getCallAccess().getCallsINTTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCallRule());
            					}
            					setWithLastConsumed(
            						current,
            						"calls",
            						lv_calls_0_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalModelEditorParser.g:891:3: (otherlv_1= Call | otherlv_2= Calls )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==Call) ) {
                alt27=1;
            }
            else if ( (LA27_0==Calls) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // InternalModelEditorParser.g:892:4: otherlv_1= Call
                    {
                    otherlv_1=(Token)match(input,Call,FOLLOW_26); 

                    				newLeafNode(otherlv_1, grammarAccess.getCallAccess().getCallKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalModelEditorParser.g:897:4: otherlv_2= Calls
                    {
                    otherlv_2=(Token)match(input,Calls,FOLLOW_26); 

                    				newLeafNode(otherlv_2, grammarAccess.getCallAccess().getCallsKeyword_1_1());
                    			

                    }
                    break;

            }

            otherlv_3=(Token)match(input,To,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getCallAccess().getToKeyword_2());
            		
            // InternalModelEditorParser.g:906:3: ( ( ruleQualifiedName ) )
            // InternalModelEditorParser.g:907:4: ( ruleQualifiedName )
            {
            // InternalModelEditorParser.g:907:4: ( ruleQualifiedName )
            // InternalModelEditorParser.g:908:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCallRule());
            					}
            				

            					newCompositeNode(grammarAccess.getCallAccess().getMethodMethodCrossReference_3_0());
            				
            pushFollow(FOLLOW_15);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,LeftParenthesis,FOLLOW_28); 

            			newLeafNode(otherlv_5, grammarAccess.getCallAccess().getLeftParenthesisKeyword_4());
            		
            otherlv_6=(Token)match(input,RightParenthesis,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getCallAccess().getRightParenthesisKeyword_5());
            		

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
    // $ANTLR end "ruleCall"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000005A82L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000005282L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000A0000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000082000002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000008000112L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000008000012L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000A8000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000000300012A0L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000000A0800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000000000C000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000050000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000440L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000800000L});

}