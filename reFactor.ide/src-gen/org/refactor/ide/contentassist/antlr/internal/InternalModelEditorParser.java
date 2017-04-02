package org.refactor.ide.contentassist.antlr.internal;
import java.util.Map;
import java.util.HashMap;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.refactor.services.ModelEditorGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalModelEditorParser extends AbstractInternalContentAssistParser {
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
    	private final Map<String, String> tokenNameToValue = new HashMap<String, String>();
    	
    	{
    		tokenNameToValue.put("LeftParenthesis", "'('");
    		tokenNameToValue.put("RightParenthesis", "')'");
    		tokenNameToValue.put("Comma", "','");
    		tokenNameToValue.put("FullStop", "'.'");
    		tokenNameToValue.put("Colon", "':'");
    		tokenNameToValue.put("FullStopAsterisk", "'.*'");
    		tokenNameToValue.put("Of", "'of'");
    		tokenNameToValue.put("To", "'to'");
    		tokenNameToValue.put("Call", "'call'");
    		tokenNameToValue.put("Code", "'code'");
    		tokenNameToValue.put("Calls", "'calls'");
    		tokenNameToValue.put("Class", "'class'");
    		tokenNameToValue.put("Cyclo", "'cyclo'");
    		tokenNameToValue.put("Lines", "'lines'");
    		tokenNameToValue.put("Access", "'access'");
    		tokenNameToValue.put("Import", "'import'");
    		tokenNameToValue.put("Public", "'public'");
    		tokenNameToValue.put("Extends", "'extends'");
    		tokenNameToValue.put("Private", "'private'");
    		tokenNameToValue.put("Accesses", "'accesses'");
    		tokenNameToValue.put("Constant", "'constant'");
    		tokenNameToValue.put("Protected", "'protected'");
    		tokenNameToValue.put("Implements", "'implements'");
    	}

    	public void setGrammarAccess(ModelEditorGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		String result = tokenNameToValue.get(tokenName);
    		if (result == null)
    			result = tokenName;
    		return result;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalModelEditorParser.g:78:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalModelEditorParser.g:79:1: ( ruleModel EOF )
            // InternalModelEditorParser.g:80:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalModelEditorParser.g:87:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:91:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalModelEditorParser.g:92:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalModelEditorParser.g:92:2: ( ( rule__Model__Group__0 ) )
            // InternalModelEditorParser.g:93:3: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalModelEditorParser.g:94:3: ( rule__Model__Group__0 )
            // InternalModelEditorParser.g:94:4: rule__Model__Group__0
            {
            pushFollow(FOLLOW_2);
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


    // $ANTLR start "entryRuleImport"
    // InternalModelEditorParser.g:103:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // InternalModelEditorParser.g:104:1: ( ruleImport EOF )
            // InternalModelEditorParser.g:105:1: ruleImport EOF
            {
             before(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_1);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getImportRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalModelEditorParser.g:112:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:116:2: ( ( ( rule__Import__Group__0 ) ) )
            // InternalModelEditorParser.g:117:2: ( ( rule__Import__Group__0 ) )
            {
            // InternalModelEditorParser.g:117:2: ( ( rule__Import__Group__0 ) )
            // InternalModelEditorParser.g:118:3: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // InternalModelEditorParser.g:119:3: ( rule__Import__Group__0 )
            // InternalModelEditorParser.g:119:4: rule__Import__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getGroup()); 

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
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // InternalModelEditorParser.g:128:1: entryRuleQualifiedNameWithWildcard : ruleQualifiedNameWithWildcard EOF ;
    public final void entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        try {
            // InternalModelEditorParser.g:129:1: ( ruleQualifiedNameWithWildcard EOF )
            // InternalModelEditorParser.g:130:1: ruleQualifiedNameWithWildcard EOF
            {
             before(grammarAccess.getQualifiedNameWithWildcardRule()); 
            pushFollow(FOLLOW_1);
            ruleQualifiedNameWithWildcard();

            state._fsp--;

             after(grammarAccess.getQualifiedNameWithWildcardRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // InternalModelEditorParser.g:137:1: ruleQualifiedNameWithWildcard : ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) ;
    public final void ruleQualifiedNameWithWildcard() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:141:2: ( ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) )
            // InternalModelEditorParser.g:142:2: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            {
            // InternalModelEditorParser.g:142:2: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            // InternalModelEditorParser.g:143:3: ( rule__QualifiedNameWithWildcard__Group__0 )
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); 
            // InternalModelEditorParser.g:144:3: ( rule__QualifiedNameWithWildcard__Group__0 )
            // InternalModelEditorParser.g:144:4: rule__QualifiedNameWithWildcard__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedNameWithWildcard__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); 

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
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalModelEditorParser.g:153:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalModelEditorParser.g:154:1: ( ruleQualifiedName EOF )
            // InternalModelEditorParser.g:155:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalModelEditorParser.g:162:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:166:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalModelEditorParser.g:167:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalModelEditorParser.g:167:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalModelEditorParser.g:168:3: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // InternalModelEditorParser.g:169:3: ( rule__QualifiedName__Group__0 )
            // InternalModelEditorParser.g:169:4: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getGroup()); 

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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleClass"
    // InternalModelEditorParser.g:178:1: entryRuleClass : ruleClass EOF ;
    public final void entryRuleClass() throws RecognitionException {
        try {
            // InternalModelEditorParser.g:179:1: ( ruleClass EOF )
            // InternalModelEditorParser.g:180:1: ruleClass EOF
            {
             before(grammarAccess.getClassRule()); 
            pushFollow(FOLLOW_1);
            ruleClass();

            state._fsp--;

             after(grammarAccess.getClassRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalModelEditorParser.g:187:1: ruleClass : ( ( rule__Class__Group__0 ) ) ;
    public final void ruleClass() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:191:2: ( ( ( rule__Class__Group__0 ) ) )
            // InternalModelEditorParser.g:192:2: ( ( rule__Class__Group__0 ) )
            {
            // InternalModelEditorParser.g:192:2: ( ( rule__Class__Group__0 ) )
            // InternalModelEditorParser.g:193:3: ( rule__Class__Group__0 )
            {
             before(grammarAccess.getClassAccess().getGroup()); 
            // InternalModelEditorParser.g:194:3: ( rule__Class__Group__0 )
            // InternalModelEditorParser.g:194:4: rule__Class__Group__0
            {
            pushFollow(FOLLOW_2);
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


    // $ANTLR start "entryRuleSupertypes"
    // InternalModelEditorParser.g:203:1: entryRuleSupertypes : ruleSupertypes EOF ;
    public final void entryRuleSupertypes() throws RecognitionException {
        try {
            // InternalModelEditorParser.g:204:1: ( ruleSupertypes EOF )
            // InternalModelEditorParser.g:205:1: ruleSupertypes EOF
            {
             before(grammarAccess.getSupertypesRule()); 
            pushFollow(FOLLOW_1);
            ruleSupertypes();

            state._fsp--;

             after(grammarAccess.getSupertypesRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSupertypes"


    // $ANTLR start "ruleSupertypes"
    // InternalModelEditorParser.g:212:1: ruleSupertypes : ( ( rule__Supertypes__Group__0 )? ) ;
    public final void ruleSupertypes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:216:2: ( ( ( rule__Supertypes__Group__0 )? ) )
            // InternalModelEditorParser.g:217:2: ( ( rule__Supertypes__Group__0 )? )
            {
            // InternalModelEditorParser.g:217:2: ( ( rule__Supertypes__Group__0 )? )
            // InternalModelEditorParser.g:218:3: ( rule__Supertypes__Group__0 )?
            {
             before(grammarAccess.getSupertypesAccess().getGroup()); 
            // InternalModelEditorParser.g:219:3: ( rule__Supertypes__Group__0 )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID||LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalModelEditorParser.g:219:4: rule__Supertypes__Group__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Supertypes__Group__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSupertypesAccess().getGroup()); 

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
    // $ANTLR end "ruleSupertypes"


    // $ANTLR start "entryRuleField"
    // InternalModelEditorParser.g:228:1: entryRuleField : ruleField EOF ;
    public final void entryRuleField() throws RecognitionException {
        try {
            // InternalModelEditorParser.g:229:1: ( ruleField EOF )
            // InternalModelEditorParser.g:230:1: ruleField EOF
            {
             before(grammarAccess.getFieldRule()); 
            pushFollow(FOLLOW_1);
            ruleField();

            state._fsp--;

             after(grammarAccess.getFieldRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleField"


    // $ANTLR start "ruleField"
    // InternalModelEditorParser.g:237:1: ruleField : ( ( rule__Field__Group__0 ) ) ;
    public final void ruleField() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:241:2: ( ( ( rule__Field__Group__0 ) ) )
            // InternalModelEditorParser.g:242:2: ( ( rule__Field__Group__0 ) )
            {
            // InternalModelEditorParser.g:242:2: ( ( rule__Field__Group__0 ) )
            // InternalModelEditorParser.g:243:3: ( rule__Field__Group__0 )
            {
             before(grammarAccess.getFieldAccess().getGroup()); 
            // InternalModelEditorParser.g:244:3: ( rule__Field__Group__0 )
            // InternalModelEditorParser.g:244:4: rule__Field__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Field__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getGroup()); 

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
    // $ANTLR end "ruleField"


    // $ANTLR start "entryRuleMethod"
    // InternalModelEditorParser.g:253:1: entryRuleMethod : ruleMethod EOF ;
    public final void entryRuleMethod() throws RecognitionException {
        try {
            // InternalModelEditorParser.g:254:1: ( ruleMethod EOF )
            // InternalModelEditorParser.g:255:1: ruleMethod EOF
            {
             before(grammarAccess.getMethodRule()); 
            pushFollow(FOLLOW_1);
            ruleMethod();

            state._fsp--;

             after(grammarAccess.getMethodRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMethod"


    // $ANTLR start "ruleMethod"
    // InternalModelEditorParser.g:262:1: ruleMethod : ( ( rule__Method__Group__0 ) ) ;
    public final void ruleMethod() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:266:2: ( ( ( rule__Method__Group__0 ) ) )
            // InternalModelEditorParser.g:267:2: ( ( rule__Method__Group__0 ) )
            {
            // InternalModelEditorParser.g:267:2: ( ( rule__Method__Group__0 ) )
            // InternalModelEditorParser.g:268:3: ( rule__Method__Group__0 )
            {
             before(grammarAccess.getMethodAccess().getGroup()); 
            // InternalModelEditorParser.g:269:3: ( rule__Method__Group__0 )
            // InternalModelEditorParser.g:269:4: rule__Method__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Method__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMethodAccess().getGroup()); 

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
    // $ANTLR end "ruleMethod"


    // $ANTLR start "entryRuleMemberModifier"
    // InternalModelEditorParser.g:278:1: entryRuleMemberModifier : ruleMemberModifier EOF ;
    public final void entryRuleMemberModifier() throws RecognitionException {
        try {
            // InternalModelEditorParser.g:279:1: ( ruleMemberModifier EOF )
            // InternalModelEditorParser.g:280:1: ruleMemberModifier EOF
            {
             before(grammarAccess.getMemberModifierRule()); 
            pushFollow(FOLLOW_1);
            ruleMemberModifier();

            state._fsp--;

             after(grammarAccess.getMemberModifierRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMemberModifier"


    // $ANTLR start "ruleMemberModifier"
    // InternalModelEditorParser.g:287:1: ruleMemberModifier : ( ( rule__MemberModifier__Alternatives ) ) ;
    public final void ruleMemberModifier() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:291:2: ( ( ( rule__MemberModifier__Alternatives ) ) )
            // InternalModelEditorParser.g:292:2: ( ( rule__MemberModifier__Alternatives ) )
            {
            // InternalModelEditorParser.g:292:2: ( ( rule__MemberModifier__Alternatives ) )
            // InternalModelEditorParser.g:293:3: ( rule__MemberModifier__Alternatives )
            {
             before(grammarAccess.getMemberModifierAccess().getAlternatives()); 
            // InternalModelEditorParser.g:294:3: ( rule__MemberModifier__Alternatives )
            // InternalModelEditorParser.g:294:4: rule__MemberModifier__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__MemberModifier__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMemberModifierAccess().getAlternatives()); 

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
    // $ANTLR end "ruleMemberModifier"


    // $ANTLR start "entryRuleClassModifier"
    // InternalModelEditorParser.g:303:1: entryRuleClassModifier : ruleClassModifier EOF ;
    public final void entryRuleClassModifier() throws RecognitionException {
        try {
            // InternalModelEditorParser.g:304:1: ( ruleClassModifier EOF )
            // InternalModelEditorParser.g:305:1: ruleClassModifier EOF
            {
             before(grammarAccess.getClassModifierRule()); 
            pushFollow(FOLLOW_1);
            ruleClassModifier();

            state._fsp--;

             after(grammarAccess.getClassModifierRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleClassModifier"


    // $ANTLR start "ruleClassModifier"
    // InternalModelEditorParser.g:312:1: ruleClassModifier : ( ( rule__ClassModifier__Alternatives ) ) ;
    public final void ruleClassModifier() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:316:2: ( ( ( rule__ClassModifier__Alternatives ) ) )
            // InternalModelEditorParser.g:317:2: ( ( rule__ClassModifier__Alternatives ) )
            {
            // InternalModelEditorParser.g:317:2: ( ( rule__ClassModifier__Alternatives ) )
            // InternalModelEditorParser.g:318:3: ( rule__ClassModifier__Alternatives )
            {
             before(grammarAccess.getClassModifierAccess().getAlternatives()); 
            // InternalModelEditorParser.g:319:3: ( rule__ClassModifier__Alternatives )
            // InternalModelEditorParser.g:319:4: rule__ClassModifier__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ClassModifier__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getClassModifierAccess().getAlternatives()); 

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
    // $ANTLR end "ruleClassModifier"


    // $ANTLR start "entryRuleAccess"
    // InternalModelEditorParser.g:328:1: entryRuleAccess : ruleAccess EOF ;
    public final void entryRuleAccess() throws RecognitionException {
        try {
            // InternalModelEditorParser.g:329:1: ( ruleAccess EOF )
            // InternalModelEditorParser.g:330:1: ruleAccess EOF
            {
             before(grammarAccess.getAccessRule()); 
            pushFollow(FOLLOW_1);
            ruleAccess();

            state._fsp--;

             after(grammarAccess.getAccessRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAccess"


    // $ANTLR start "ruleAccess"
    // InternalModelEditorParser.g:337:1: ruleAccess : ( ( rule__Access__Group__0 ) ) ;
    public final void ruleAccess() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:341:2: ( ( ( rule__Access__Group__0 ) ) )
            // InternalModelEditorParser.g:342:2: ( ( rule__Access__Group__0 ) )
            {
            // InternalModelEditorParser.g:342:2: ( ( rule__Access__Group__0 ) )
            // InternalModelEditorParser.g:343:3: ( rule__Access__Group__0 )
            {
             before(grammarAccess.getAccessAccess().getGroup()); 
            // InternalModelEditorParser.g:344:3: ( rule__Access__Group__0 )
            // InternalModelEditorParser.g:344:4: rule__Access__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Access__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAccessAccess().getGroup()); 

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
    // $ANTLR end "ruleAccess"


    // $ANTLR start "entryRuleCall"
    // InternalModelEditorParser.g:353:1: entryRuleCall : ruleCall EOF ;
    public final void entryRuleCall() throws RecognitionException {
        try {
            // InternalModelEditorParser.g:354:1: ( ruleCall EOF )
            // InternalModelEditorParser.g:355:1: ruleCall EOF
            {
             before(grammarAccess.getCallRule()); 
            pushFollow(FOLLOW_1);
            ruleCall();

            state._fsp--;

             after(grammarAccess.getCallRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCall"


    // $ANTLR start "ruleCall"
    // InternalModelEditorParser.g:362:1: ruleCall : ( ( rule__Call__Group__0 ) ) ;
    public final void ruleCall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:366:2: ( ( ( rule__Call__Group__0 ) ) )
            // InternalModelEditorParser.g:367:2: ( ( rule__Call__Group__0 ) )
            {
            // InternalModelEditorParser.g:367:2: ( ( rule__Call__Group__0 ) )
            // InternalModelEditorParser.g:368:3: ( rule__Call__Group__0 )
            {
             before(grammarAccess.getCallAccess().getGroup()); 
            // InternalModelEditorParser.g:369:3: ( rule__Call__Group__0 )
            // InternalModelEditorParser.g:369:4: rule__Call__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Call__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCallAccess().getGroup()); 

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
    // $ANTLR end "ruleCall"


    // $ANTLR start "rule__QualifiedName__Alternatives_0"
    // InternalModelEditorParser.g:377:1: rule__QualifiedName__Alternatives_0 : ( ( RULE_ID ) | ( RULE_STRING ) );
    public final void rule__QualifiedName__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:381:1: ( ( RULE_ID ) | ( RULE_STRING ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_STRING) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalModelEditorParser.g:382:2: ( RULE_ID )
                    {
                    // InternalModelEditorParser.g:382:2: ( RULE_ID )
                    // InternalModelEditorParser.g:383:3: RULE_ID
                    {
                     before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalModelEditorParser.g:388:2: ( RULE_STRING )
                    {
                    // InternalModelEditorParser.g:388:2: ( RULE_STRING )
                    // InternalModelEditorParser.g:389:3: RULE_STRING
                    {
                     before(grammarAccess.getQualifiedNameAccess().getSTRINGTerminalRuleCall_0_1()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getQualifiedNameAccess().getSTRINGTerminalRuleCall_0_1()); 

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
    // $ANTLR end "rule__QualifiedName__Alternatives_0"


    // $ANTLR start "rule__QualifiedName__Alternatives_1"
    // InternalModelEditorParser.g:398:1: rule__QualifiedName__Alternatives_1 : ( ( ( rule__QualifiedName__Group_1_0__0 ) ) | ( RULE_STRING ) );
    public final void rule__QualifiedName__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:402:1: ( ( ( rule__QualifiedName__Group_1_0__0 ) ) | ( RULE_STRING ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==FullStop) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_STRING) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalModelEditorParser.g:403:2: ( ( rule__QualifiedName__Group_1_0__0 ) )
                    {
                    // InternalModelEditorParser.g:403:2: ( ( rule__QualifiedName__Group_1_0__0 ) )
                    // InternalModelEditorParser.g:404:3: ( rule__QualifiedName__Group_1_0__0 )
                    {
                     before(grammarAccess.getQualifiedNameAccess().getGroup_1_0()); 
                    // InternalModelEditorParser.g:405:3: ( rule__QualifiedName__Group_1_0__0 )
                    // InternalModelEditorParser.g:405:4: rule__QualifiedName__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__QualifiedName__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getQualifiedNameAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalModelEditorParser.g:409:2: ( RULE_STRING )
                    {
                    // InternalModelEditorParser.g:409:2: ( RULE_STRING )
                    // InternalModelEditorParser.g:410:3: RULE_STRING
                    {
                     before(grammarAccess.getQualifiedNameAccess().getSTRINGTerminalRuleCall_1_1()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getQualifiedNameAccess().getSTRINGTerminalRuleCall_1_1()); 

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
    // $ANTLR end "rule__QualifiedName__Alternatives_1"


    // $ANTLR start "rule__MemberModifier__Alternatives"
    // InternalModelEditorParser.g:419:1: rule__MemberModifier__Alternatives : ( ( Public ) | ( Private ) | ( Protected ) | ( Constant ) );
    public final void rule__MemberModifier__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:423:1: ( ( Public ) | ( Private ) | ( Protected ) | ( Constant ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case Public:
                {
                alt4=1;
                }
                break;
            case Private:
                {
                alt4=2;
                }
                break;
            case Protected:
                {
                alt4=3;
                }
                break;
            case Constant:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalModelEditorParser.g:424:2: ( Public )
                    {
                    // InternalModelEditorParser.g:424:2: ( Public )
                    // InternalModelEditorParser.g:425:3: Public
                    {
                     before(grammarAccess.getMemberModifierAccess().getPublicKeyword_0()); 
                    match(input,Public,FOLLOW_2); 
                     after(grammarAccess.getMemberModifierAccess().getPublicKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalModelEditorParser.g:430:2: ( Private )
                    {
                    // InternalModelEditorParser.g:430:2: ( Private )
                    // InternalModelEditorParser.g:431:3: Private
                    {
                     before(grammarAccess.getMemberModifierAccess().getPrivateKeyword_1()); 
                    match(input,Private,FOLLOW_2); 
                     after(grammarAccess.getMemberModifierAccess().getPrivateKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalModelEditorParser.g:436:2: ( Protected )
                    {
                    // InternalModelEditorParser.g:436:2: ( Protected )
                    // InternalModelEditorParser.g:437:3: Protected
                    {
                     before(grammarAccess.getMemberModifierAccess().getProtectedKeyword_2()); 
                    match(input,Protected,FOLLOW_2); 
                     after(grammarAccess.getMemberModifierAccess().getProtectedKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalModelEditorParser.g:442:2: ( Constant )
                    {
                    // InternalModelEditorParser.g:442:2: ( Constant )
                    // InternalModelEditorParser.g:443:3: Constant
                    {
                     before(grammarAccess.getMemberModifierAccess().getConstantKeyword_3()); 
                    match(input,Constant,FOLLOW_2); 
                     after(grammarAccess.getMemberModifierAccess().getConstantKeyword_3()); 

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
    // $ANTLR end "rule__MemberModifier__Alternatives"


    // $ANTLR start "rule__ClassModifier__Alternatives"
    // InternalModelEditorParser.g:452:1: rule__ClassModifier__Alternatives : ( ( Public ) | ( Private ) | ( Constant ) );
    public final void rule__ClassModifier__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:456:1: ( ( Public ) | ( Private ) | ( Constant ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case Public:
                {
                alt5=1;
                }
                break;
            case Private:
                {
                alt5=2;
                }
                break;
            case Constant:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalModelEditorParser.g:457:2: ( Public )
                    {
                    // InternalModelEditorParser.g:457:2: ( Public )
                    // InternalModelEditorParser.g:458:3: Public
                    {
                     before(grammarAccess.getClassModifierAccess().getPublicKeyword_0()); 
                    match(input,Public,FOLLOW_2); 
                     after(grammarAccess.getClassModifierAccess().getPublicKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalModelEditorParser.g:463:2: ( Private )
                    {
                    // InternalModelEditorParser.g:463:2: ( Private )
                    // InternalModelEditorParser.g:464:3: Private
                    {
                     before(grammarAccess.getClassModifierAccess().getPrivateKeyword_1()); 
                    match(input,Private,FOLLOW_2); 
                     after(grammarAccess.getClassModifierAccess().getPrivateKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalModelEditorParser.g:469:2: ( Constant )
                    {
                    // InternalModelEditorParser.g:469:2: ( Constant )
                    // InternalModelEditorParser.g:470:3: Constant
                    {
                     before(grammarAccess.getClassModifierAccess().getConstantKeyword_2()); 
                    match(input,Constant,FOLLOW_2); 
                     after(grammarAccess.getClassModifierAccess().getConstantKeyword_2()); 

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
    // $ANTLR end "rule__ClassModifier__Alternatives"


    // $ANTLR start "rule__Access__Alternatives_1"
    // InternalModelEditorParser.g:479:1: rule__Access__Alternatives_1 : ( ( Access ) | ( Accesses ) );
    public final void rule__Access__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:483:1: ( ( Access ) | ( Accesses ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==Access) ) {
                alt6=1;
            }
            else if ( (LA6_0==Accesses) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalModelEditorParser.g:484:2: ( Access )
                    {
                    // InternalModelEditorParser.g:484:2: ( Access )
                    // InternalModelEditorParser.g:485:3: Access
                    {
                     before(grammarAccess.getAccessAccess().getAccessKeyword_1_0()); 
                    match(input,Access,FOLLOW_2); 
                     after(grammarAccess.getAccessAccess().getAccessKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalModelEditorParser.g:490:2: ( Accesses )
                    {
                    // InternalModelEditorParser.g:490:2: ( Accesses )
                    // InternalModelEditorParser.g:491:3: Accesses
                    {
                     before(grammarAccess.getAccessAccess().getAccessesKeyword_1_1()); 
                    match(input,Accesses,FOLLOW_2); 
                     after(grammarAccess.getAccessAccess().getAccessesKeyword_1_1()); 

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
    // $ANTLR end "rule__Access__Alternatives_1"


    // $ANTLR start "rule__Call__Alternatives_1"
    // InternalModelEditorParser.g:500:1: rule__Call__Alternatives_1 : ( ( Call ) | ( Calls ) );
    public final void rule__Call__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:504:1: ( ( Call ) | ( Calls ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==Call) ) {
                alt7=1;
            }
            else if ( (LA7_0==Calls) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalModelEditorParser.g:505:2: ( Call )
                    {
                    // InternalModelEditorParser.g:505:2: ( Call )
                    // InternalModelEditorParser.g:506:3: Call
                    {
                     before(grammarAccess.getCallAccess().getCallKeyword_1_0()); 
                    match(input,Call,FOLLOW_2); 
                     after(grammarAccess.getCallAccess().getCallKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalModelEditorParser.g:511:2: ( Calls )
                    {
                    // InternalModelEditorParser.g:511:2: ( Calls )
                    // InternalModelEditorParser.g:512:3: Calls
                    {
                     before(grammarAccess.getCallAccess().getCallsKeyword_1_1()); 
                    match(input,Calls,FOLLOW_2); 
                     after(grammarAccess.getCallAccess().getCallsKeyword_1_1()); 

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
    // $ANTLR end "rule__Call__Alternatives_1"


    // $ANTLR start "rule__Model__Group__0"
    // InternalModelEditorParser.g:521:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:525:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalModelEditorParser.g:526:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalModelEditorParser.g:533:1: rule__Model__Group__0__Impl : ( ( rule__Model__ImportsAssignment_0 )* ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:537:1: ( ( ( rule__Model__ImportsAssignment_0 )* ) )
            // InternalModelEditorParser.g:538:1: ( ( rule__Model__ImportsAssignment_0 )* )
            {
            // InternalModelEditorParser.g:538:1: ( ( rule__Model__ImportsAssignment_0 )* )
            // InternalModelEditorParser.g:539:2: ( rule__Model__ImportsAssignment_0 )*
            {
             before(grammarAccess.getModelAccess().getImportsAssignment_0()); 
            // InternalModelEditorParser.g:540:2: ( rule__Model__ImportsAssignment_0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==Import) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalModelEditorParser.g:540:3: rule__Model__ImportsAssignment_0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Model__ImportsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getImportsAssignment_0()); 

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
    // InternalModelEditorParser.g:548:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:552:1: ( rule__Model__Group__1__Impl )
            // InternalModelEditorParser.g:553:2: rule__Model__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__1__Impl();

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
    // InternalModelEditorParser.g:559:1: rule__Model__Group__1__Impl : ( ( rule__Model__ClassesAssignment_1 )* ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:563:1: ( ( ( rule__Model__ClassesAssignment_1 )* ) )
            // InternalModelEditorParser.g:564:1: ( ( rule__Model__ClassesAssignment_1 )* )
            {
            // InternalModelEditorParser.g:564:1: ( ( rule__Model__ClassesAssignment_1 )* )
            // InternalModelEditorParser.g:565:2: ( rule__Model__ClassesAssignment_1 )*
            {
             before(grammarAccess.getModelAccess().getClassesAssignment_1()); 
            // InternalModelEditorParser.g:566:2: ( rule__Model__ClassesAssignment_1 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==Constant||LA9_0==Private||LA9_0==Public||LA9_0==Class) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalModelEditorParser.g:566:3: rule__Model__ClassesAssignment_1
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Model__ClassesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getClassesAssignment_1()); 

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


    // $ANTLR start "rule__Import__Group__0"
    // InternalModelEditorParser.g:575:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:579:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalModelEditorParser.g:580:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Import__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Import__Group__1();

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
    // $ANTLR end "rule__Import__Group__0"


    // $ANTLR start "rule__Import__Group__0__Impl"
    // InternalModelEditorParser.g:587:1: rule__Import__Group__0__Impl : ( Import ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:591:1: ( ( Import ) )
            // InternalModelEditorParser.g:592:1: ( Import )
            {
            // InternalModelEditorParser.g:592:1: ( Import )
            // InternalModelEditorParser.g:593:2: Import
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,Import,FOLLOW_2); 
             after(grammarAccess.getImportAccess().getImportKeyword_0()); 

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
    // $ANTLR end "rule__Import__Group__0__Impl"


    // $ANTLR start "rule__Import__Group__1"
    // InternalModelEditorParser.g:602:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:606:1: ( rule__Import__Group__1__Impl )
            // InternalModelEditorParser.g:607:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group__1__Impl();

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
    // $ANTLR end "rule__Import__Group__1"


    // $ANTLR start "rule__Import__Group__1__Impl"
    // InternalModelEditorParser.g:613:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:617:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // InternalModelEditorParser.g:618:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // InternalModelEditorParser.g:618:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // InternalModelEditorParser.g:619:2: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            // InternalModelEditorParser.g:620:2: ( rule__Import__ImportedNamespaceAssignment_1 )
            // InternalModelEditorParser.g:620:3: rule__Import__ImportedNamespaceAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Import__ImportedNamespaceAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 

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
    // $ANTLR end "rule__Import__Group__1__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__0"
    // InternalModelEditorParser.g:629:1: rule__QualifiedNameWithWildcard__Group__0 : rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 ;
    public final void rule__QualifiedNameWithWildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:633:1: ( rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 )
            // InternalModelEditorParser.g:634:2: rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__QualifiedNameWithWildcard__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedNameWithWildcard__Group__1();

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
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__0"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__0__Impl"
    // InternalModelEditorParser.g:641:1: rule__QualifiedNameWithWildcard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:645:1: ( ( ruleQualifiedName ) )
            // InternalModelEditorParser.g:646:1: ( ruleQualifiedName )
            {
            // InternalModelEditorParser.g:646:1: ( ruleQualifiedName )
            // InternalModelEditorParser.g:647:2: ruleQualifiedName
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 

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
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__0__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__1"
    // InternalModelEditorParser.g:656:1: rule__QualifiedNameWithWildcard__Group__1 : rule__QualifiedNameWithWildcard__Group__1__Impl ;
    public final void rule__QualifiedNameWithWildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:660:1: ( rule__QualifiedNameWithWildcard__Group__1__Impl )
            // InternalModelEditorParser.g:661:2: rule__QualifiedNameWithWildcard__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedNameWithWildcard__Group__1__Impl();

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
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__1"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__1__Impl"
    // InternalModelEditorParser.g:667:1: rule__QualifiedNameWithWildcard__Group__1__Impl : ( ( FullStopAsterisk )? ) ;
    public final void rule__QualifiedNameWithWildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:671:1: ( ( ( FullStopAsterisk )? ) )
            // InternalModelEditorParser.g:672:1: ( ( FullStopAsterisk )? )
            {
            // InternalModelEditorParser.g:672:1: ( ( FullStopAsterisk )? )
            // InternalModelEditorParser.g:673:2: ( FullStopAsterisk )?
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
            // InternalModelEditorParser.g:674:2: ( FullStopAsterisk )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==FullStopAsterisk) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalModelEditorParser.g:674:3: FullStopAsterisk
                    {
                    match(input,FullStopAsterisk,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 

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
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalModelEditorParser.g:683:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:687:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalModelEditorParser.g:688:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1();

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
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // InternalModelEditorParser.g:695:1: rule__QualifiedName__Group__0__Impl : ( ( rule__QualifiedName__Alternatives_0 ) ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:699:1: ( ( ( rule__QualifiedName__Alternatives_0 ) ) )
            // InternalModelEditorParser.g:700:1: ( ( rule__QualifiedName__Alternatives_0 ) )
            {
            // InternalModelEditorParser.g:700:1: ( ( rule__QualifiedName__Alternatives_0 ) )
            // InternalModelEditorParser.g:701:2: ( rule__QualifiedName__Alternatives_0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getAlternatives_0()); 
            // InternalModelEditorParser.g:702:2: ( rule__QualifiedName__Alternatives_0 )
            // InternalModelEditorParser.g:702:3: rule__QualifiedName__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getAlternatives_0()); 

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
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // InternalModelEditorParser.g:710:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:714:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalModelEditorParser.g:715:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1__Impl();

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
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // InternalModelEditorParser.g:721:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Alternatives_1 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:725:1: ( ( ( rule__QualifiedName__Alternatives_1 )* ) )
            // InternalModelEditorParser.g:726:1: ( ( rule__QualifiedName__Alternatives_1 )* )
            {
            // InternalModelEditorParser.g:726:1: ( ( rule__QualifiedName__Alternatives_1 )* )
            // InternalModelEditorParser.g:727:2: ( rule__QualifiedName__Alternatives_1 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getAlternatives_1()); 
            // InternalModelEditorParser.g:728:2: ( rule__QualifiedName__Alternatives_1 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==FullStop||LA11_0==RULE_STRING) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalModelEditorParser.g:728:3: rule__QualifiedName__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__QualifiedName__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getQualifiedNameAccess().getAlternatives_1()); 

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
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1_0__0"
    // InternalModelEditorParser.g:737:1: rule__QualifiedName__Group_1_0__0 : rule__QualifiedName__Group_1_0__0__Impl rule__QualifiedName__Group_1_0__1 ;
    public final void rule__QualifiedName__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:741:1: ( rule__QualifiedName__Group_1_0__0__Impl rule__QualifiedName__Group_1_0__1 )
            // InternalModelEditorParser.g:742:2: rule__QualifiedName__Group_1_0__0__Impl rule__QualifiedName__Group_1_0__1
            {
            pushFollow(FOLLOW_10);
            rule__QualifiedName__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1_0__1();

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
    // $ANTLR end "rule__QualifiedName__Group_1_0__0"


    // $ANTLR start "rule__QualifiedName__Group_1_0__0__Impl"
    // InternalModelEditorParser.g:749:1: rule__QualifiedName__Group_1_0__0__Impl : ( FullStop ) ;
    public final void rule__QualifiedName__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:753:1: ( ( FullStop ) )
            // InternalModelEditorParser.g:754:1: ( FullStop )
            {
            // InternalModelEditorParser.g:754:1: ( FullStop )
            // InternalModelEditorParser.g:755:2: FullStop
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0_0()); 
            match(input,FullStop,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0_0()); 

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
    // $ANTLR end "rule__QualifiedName__Group_1_0__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1_0__1"
    // InternalModelEditorParser.g:764:1: rule__QualifiedName__Group_1_0__1 : rule__QualifiedName__Group_1_0__1__Impl ;
    public final void rule__QualifiedName__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:768:1: ( rule__QualifiedName__Group_1_0__1__Impl )
            // InternalModelEditorParser.g:769:2: rule__QualifiedName__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1_0__1__Impl();

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
    // $ANTLR end "rule__QualifiedName__Group_1_0__1"


    // $ANTLR start "rule__QualifiedName__Group_1_0__1__Impl"
    // InternalModelEditorParser.g:775:1: rule__QualifiedName__Group_1_0__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:779:1: ( ( RULE_ID ) )
            // InternalModelEditorParser.g:780:1: ( RULE_ID )
            {
            // InternalModelEditorParser.g:780:1: ( RULE_ID )
            // InternalModelEditorParser.g:781:2: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_0_1()); 

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
    // $ANTLR end "rule__QualifiedName__Group_1_0__1__Impl"


    // $ANTLR start "rule__Class__Group__0"
    // InternalModelEditorParser.g:791:1: rule__Class__Group__0 : rule__Class__Group__0__Impl rule__Class__Group__1 ;
    public final void rule__Class__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:795:1: ( rule__Class__Group__0__Impl rule__Class__Group__1 )
            // InternalModelEditorParser.g:796:2: rule__Class__Group__0__Impl rule__Class__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Class__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalModelEditorParser.g:803:1: rule__Class__Group__0__Impl : ( ( rule__Class__ModifierAssignment_0 )? ) ;
    public final void rule__Class__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:807:1: ( ( ( rule__Class__ModifierAssignment_0 )? ) )
            // InternalModelEditorParser.g:808:1: ( ( rule__Class__ModifierAssignment_0 )? )
            {
            // InternalModelEditorParser.g:808:1: ( ( rule__Class__ModifierAssignment_0 )? )
            // InternalModelEditorParser.g:809:2: ( rule__Class__ModifierAssignment_0 )?
            {
             before(grammarAccess.getClassAccess().getModifierAssignment_0()); 
            // InternalModelEditorParser.g:810:2: ( rule__Class__ModifierAssignment_0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==Constant||LA12_0==Private||LA12_0==Public) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalModelEditorParser.g:810:3: rule__Class__ModifierAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Class__ModifierAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClassAccess().getModifierAssignment_0()); 

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
    // InternalModelEditorParser.g:818:1: rule__Class__Group__1 : rule__Class__Group__1__Impl rule__Class__Group__2 ;
    public final void rule__Class__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:822:1: ( rule__Class__Group__1__Impl rule__Class__Group__2 )
            // InternalModelEditorParser.g:823:2: rule__Class__Group__1__Impl rule__Class__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Class__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalModelEditorParser.g:830:1: rule__Class__Group__1__Impl : ( Class ) ;
    public final void rule__Class__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:834:1: ( ( Class ) )
            // InternalModelEditorParser.g:835:1: ( Class )
            {
            // InternalModelEditorParser.g:835:1: ( Class )
            // InternalModelEditorParser.g:836:2: Class
            {
             before(grammarAccess.getClassAccess().getClassKeyword_1()); 
            match(input,Class,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getClassKeyword_1()); 

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
    // InternalModelEditorParser.g:845:1: rule__Class__Group__2 : rule__Class__Group__2__Impl rule__Class__Group__3 ;
    public final void rule__Class__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:849:1: ( rule__Class__Group__2__Impl rule__Class__Group__3 )
            // InternalModelEditorParser.g:850:2: rule__Class__Group__2__Impl rule__Class__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__Class__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalModelEditorParser.g:857:1: rule__Class__Group__2__Impl : ( ( rule__Class__NameAssignment_2 ) ) ;
    public final void rule__Class__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:861:1: ( ( ( rule__Class__NameAssignment_2 ) ) )
            // InternalModelEditorParser.g:862:1: ( ( rule__Class__NameAssignment_2 ) )
            {
            // InternalModelEditorParser.g:862:1: ( ( rule__Class__NameAssignment_2 ) )
            // InternalModelEditorParser.g:863:2: ( rule__Class__NameAssignment_2 )
            {
             before(grammarAccess.getClassAccess().getNameAssignment_2()); 
            // InternalModelEditorParser.g:864:2: ( rule__Class__NameAssignment_2 )
            // InternalModelEditorParser.g:864:3: rule__Class__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
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
    // InternalModelEditorParser.g:872:1: rule__Class__Group__3 : rule__Class__Group__3__Impl rule__Class__Group__4 ;
    public final void rule__Class__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:876:1: ( rule__Class__Group__3__Impl rule__Class__Group__4 )
            // InternalModelEditorParser.g:877:2: rule__Class__Group__3__Impl rule__Class__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__Class__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalModelEditorParser.g:884:1: rule__Class__Group__3__Impl : ( ( rule__Class__Group_3__0 )? ) ;
    public final void rule__Class__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:888:1: ( ( ( rule__Class__Group_3__0 )? ) )
            // InternalModelEditorParser.g:889:1: ( ( rule__Class__Group_3__0 )? )
            {
            // InternalModelEditorParser.g:889:1: ( ( rule__Class__Group_3__0 )? )
            // InternalModelEditorParser.g:890:2: ( rule__Class__Group_3__0 )?
            {
             before(grammarAccess.getClassAccess().getGroup_3()); 
            // InternalModelEditorParser.g:891:2: ( rule__Class__Group_3__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==Extends) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalModelEditorParser.g:891:3: rule__Class__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalModelEditorParser.g:899:1: rule__Class__Group__4 : rule__Class__Group__4__Impl rule__Class__Group__5 ;
    public final void rule__Class__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:903:1: ( rule__Class__Group__4__Impl rule__Class__Group__5 )
            // InternalModelEditorParser.g:904:2: rule__Class__Group__4__Impl rule__Class__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__Class__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalModelEditorParser.g:911:1: rule__Class__Group__4__Impl : ( ( rule__Class__Group_4__0 )? ) ;
    public final void rule__Class__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:915:1: ( ( ( rule__Class__Group_4__0 )? ) )
            // InternalModelEditorParser.g:916:1: ( ( rule__Class__Group_4__0 )? )
            {
            // InternalModelEditorParser.g:916:1: ( ( rule__Class__Group_4__0 )? )
            // InternalModelEditorParser.g:917:2: ( rule__Class__Group_4__0 )?
            {
             before(grammarAccess.getClassAccess().getGroup_4()); 
            // InternalModelEditorParser.g:918:2: ( rule__Class__Group_4__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==Implements) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalModelEditorParser.g:918:3: rule__Class__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Class__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClassAccess().getGroup_4()); 

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
    // InternalModelEditorParser.g:926:1: rule__Class__Group__5 : rule__Class__Group__5__Impl ;
    public final void rule__Class__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:930:1: ( rule__Class__Group__5__Impl )
            // InternalModelEditorParser.g:931:2: rule__Class__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Class__Group__5__Impl();

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
    // InternalModelEditorParser.g:937:1: rule__Class__Group__5__Impl : ( ( rule__Class__Group_5__0 )? ) ;
    public final void rule__Class__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:941:1: ( ( ( rule__Class__Group_5__0 )? ) )
            // InternalModelEditorParser.g:942:1: ( ( rule__Class__Group_5__0 )? )
            {
            // InternalModelEditorParser.g:942:1: ( ( rule__Class__Group_5__0 )? )
            // InternalModelEditorParser.g:943:2: ( rule__Class__Group_5__0 )?
            {
             before(grammarAccess.getClassAccess().getGroup_5()); 
            // InternalModelEditorParser.g:944:2: ( rule__Class__Group_5__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_BEGIN) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalModelEditorParser.g:944:3: rule__Class__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Class__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClassAccess().getGroup_5()); 

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


    // $ANTLR start "rule__Class__Group_3__0"
    // InternalModelEditorParser.g:953:1: rule__Class__Group_3__0 : rule__Class__Group_3__0__Impl rule__Class__Group_3__1 ;
    public final void rule__Class__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:957:1: ( rule__Class__Group_3__0__Impl rule__Class__Group_3__1 )
            // InternalModelEditorParser.g:958:2: rule__Class__Group_3__0__Impl rule__Class__Group_3__1
            {
            pushFollow(FOLLOW_6);
            rule__Class__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
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
    // InternalModelEditorParser.g:965:1: rule__Class__Group_3__0__Impl : ( Extends ) ;
    public final void rule__Class__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:969:1: ( ( Extends ) )
            // InternalModelEditorParser.g:970:1: ( Extends )
            {
            // InternalModelEditorParser.g:970:1: ( Extends )
            // InternalModelEditorParser.g:971:2: Extends
            {
             before(grammarAccess.getClassAccess().getExtendsKeyword_3_0()); 
            match(input,Extends,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getExtendsKeyword_3_0()); 

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
    // InternalModelEditorParser.g:980:1: rule__Class__Group_3__1 : rule__Class__Group_3__1__Impl ;
    public final void rule__Class__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:984:1: ( rule__Class__Group_3__1__Impl )
            // InternalModelEditorParser.g:985:2: rule__Class__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalModelEditorParser.g:991:1: rule__Class__Group_3__1__Impl : ( ( rule__Class__ExtendsAssignment_3_1 ) ) ;
    public final void rule__Class__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:995:1: ( ( ( rule__Class__ExtendsAssignment_3_1 ) ) )
            // InternalModelEditorParser.g:996:1: ( ( rule__Class__ExtendsAssignment_3_1 ) )
            {
            // InternalModelEditorParser.g:996:1: ( ( rule__Class__ExtendsAssignment_3_1 ) )
            // InternalModelEditorParser.g:997:2: ( rule__Class__ExtendsAssignment_3_1 )
            {
             before(grammarAccess.getClassAccess().getExtendsAssignment_3_1()); 
            // InternalModelEditorParser.g:998:2: ( rule__Class__ExtendsAssignment_3_1 )
            // InternalModelEditorParser.g:998:3: rule__Class__ExtendsAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Class__ExtendsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getExtendsAssignment_3_1()); 

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


    // $ANTLR start "rule__Class__Group_4__0"
    // InternalModelEditorParser.g:1007:1: rule__Class__Group_4__0 : rule__Class__Group_4__0__Impl rule__Class__Group_4__1 ;
    public final void rule__Class__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1011:1: ( rule__Class__Group_4__0__Impl rule__Class__Group_4__1 )
            // InternalModelEditorParser.g:1012:2: rule__Class__Group_4__0__Impl rule__Class__Group_4__1
            {
            pushFollow(FOLLOW_6);
            rule__Class__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group_4__1();

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
    // $ANTLR end "rule__Class__Group_4__0"


    // $ANTLR start "rule__Class__Group_4__0__Impl"
    // InternalModelEditorParser.g:1019:1: rule__Class__Group_4__0__Impl : ( Implements ) ;
    public final void rule__Class__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1023:1: ( ( Implements ) )
            // InternalModelEditorParser.g:1024:1: ( Implements )
            {
            // InternalModelEditorParser.g:1024:1: ( Implements )
            // InternalModelEditorParser.g:1025:2: Implements
            {
             before(grammarAccess.getClassAccess().getImplementsKeyword_4_0()); 
            match(input,Implements,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getImplementsKeyword_4_0()); 

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
    // $ANTLR end "rule__Class__Group_4__0__Impl"


    // $ANTLR start "rule__Class__Group_4__1"
    // InternalModelEditorParser.g:1034:1: rule__Class__Group_4__1 : rule__Class__Group_4__1__Impl ;
    public final void rule__Class__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1038:1: ( rule__Class__Group_4__1__Impl )
            // InternalModelEditorParser.g:1039:2: rule__Class__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Class__Group_4__1__Impl();

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
    // $ANTLR end "rule__Class__Group_4__1"


    // $ANTLR start "rule__Class__Group_4__1__Impl"
    // InternalModelEditorParser.g:1045:1: rule__Class__Group_4__1__Impl : ( ( rule__Class__ImplementsAssignment_4_1 ) ) ;
    public final void rule__Class__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1049:1: ( ( ( rule__Class__ImplementsAssignment_4_1 ) ) )
            // InternalModelEditorParser.g:1050:1: ( ( rule__Class__ImplementsAssignment_4_1 ) )
            {
            // InternalModelEditorParser.g:1050:1: ( ( rule__Class__ImplementsAssignment_4_1 ) )
            // InternalModelEditorParser.g:1051:2: ( rule__Class__ImplementsAssignment_4_1 )
            {
             before(grammarAccess.getClassAccess().getImplementsAssignment_4_1()); 
            // InternalModelEditorParser.g:1052:2: ( rule__Class__ImplementsAssignment_4_1 )
            // InternalModelEditorParser.g:1052:3: rule__Class__ImplementsAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Class__ImplementsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getImplementsAssignment_4_1()); 

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
    // $ANTLR end "rule__Class__Group_4__1__Impl"


    // $ANTLR start "rule__Class__Group_5__0"
    // InternalModelEditorParser.g:1061:1: rule__Class__Group_5__0 : rule__Class__Group_5__0__Impl rule__Class__Group_5__1 ;
    public final void rule__Class__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1065:1: ( rule__Class__Group_5__0__Impl rule__Class__Group_5__1 )
            // InternalModelEditorParser.g:1066:2: rule__Class__Group_5__0__Impl rule__Class__Group_5__1
            {
            pushFollow(FOLLOW_12);
            rule__Class__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group_5__1();

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
    // $ANTLR end "rule__Class__Group_5__0"


    // $ANTLR start "rule__Class__Group_5__0__Impl"
    // InternalModelEditorParser.g:1073:1: rule__Class__Group_5__0__Impl : ( RULE_BEGIN ) ;
    public final void rule__Class__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1077:1: ( ( RULE_BEGIN ) )
            // InternalModelEditorParser.g:1078:1: ( RULE_BEGIN )
            {
            // InternalModelEditorParser.g:1078:1: ( RULE_BEGIN )
            // InternalModelEditorParser.g:1079:2: RULE_BEGIN
            {
             before(grammarAccess.getClassAccess().getBEGINTerminalRuleCall_5_0()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getBEGINTerminalRuleCall_5_0()); 

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
    // $ANTLR end "rule__Class__Group_5__0__Impl"


    // $ANTLR start "rule__Class__Group_5__1"
    // InternalModelEditorParser.g:1088:1: rule__Class__Group_5__1 : rule__Class__Group_5__1__Impl rule__Class__Group_5__2 ;
    public final void rule__Class__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1092:1: ( rule__Class__Group_5__1__Impl rule__Class__Group_5__2 )
            // InternalModelEditorParser.g:1093:2: rule__Class__Group_5__1__Impl rule__Class__Group_5__2
            {
            pushFollow(FOLLOW_12);
            rule__Class__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group_5__2();

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
    // $ANTLR end "rule__Class__Group_5__1"


    // $ANTLR start "rule__Class__Group_5__1__Impl"
    // InternalModelEditorParser.g:1100:1: rule__Class__Group_5__1__Impl : ( ( rule__Class__FieldsAssignment_5_1 )* ) ;
    public final void rule__Class__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1104:1: ( ( ( rule__Class__FieldsAssignment_5_1 )* ) )
            // InternalModelEditorParser.g:1105:1: ( ( rule__Class__FieldsAssignment_5_1 )* )
            {
            // InternalModelEditorParser.g:1105:1: ( ( rule__Class__FieldsAssignment_5_1 )* )
            // InternalModelEditorParser.g:1106:2: ( rule__Class__FieldsAssignment_5_1 )*
            {
             before(grammarAccess.getClassAccess().getFieldsAssignment_5_1()); 
            // InternalModelEditorParser.g:1107:2: ( rule__Class__FieldsAssignment_5_1 )*
            loop16:
            do {
                int alt16=2;
                switch ( input.LA(1) ) {
                case Public:
                    {
                    int LA16_1 = input.LA(2);

                    if ( (LA16_1==RULE_ID) ) {
                        int LA16_5 = input.LA(3);

                        if ( (LA16_5==Protected||LA16_5==Constant||LA16_5==Private||LA16_5==Public||LA16_5==Colon||(LA16_5>=RULE_END && LA16_5<=RULE_ID)) ) {
                            alt16=1;
                        }


                    }


                    }
                    break;
                case Private:
                    {
                    int LA16_2 = input.LA(2);

                    if ( (LA16_2==RULE_ID) ) {
                        int LA16_5 = input.LA(3);

                        if ( (LA16_5==Protected||LA16_5==Constant||LA16_5==Private||LA16_5==Public||LA16_5==Colon||(LA16_5>=RULE_END && LA16_5<=RULE_ID)) ) {
                            alt16=1;
                        }


                    }


                    }
                    break;
                case Protected:
                    {
                    int LA16_3 = input.LA(2);

                    if ( (LA16_3==RULE_ID) ) {
                        int LA16_5 = input.LA(3);

                        if ( (LA16_5==Protected||LA16_5==Constant||LA16_5==Private||LA16_5==Public||LA16_5==Colon||(LA16_5>=RULE_END && LA16_5<=RULE_ID)) ) {
                            alt16=1;
                        }


                    }


                    }
                    break;
                case Constant:
                    {
                    int LA16_4 = input.LA(2);

                    if ( (LA16_4==RULE_ID) ) {
                        int LA16_5 = input.LA(3);

                        if ( (LA16_5==Protected||LA16_5==Constant||LA16_5==Private||LA16_5==Public||LA16_5==Colon||(LA16_5>=RULE_END && LA16_5<=RULE_ID)) ) {
                            alt16=1;
                        }


                    }


                    }
                    break;
                case RULE_ID:
                    {
                    int LA16_5 = input.LA(2);

                    if ( (LA16_5==Protected||LA16_5==Constant||LA16_5==Private||LA16_5==Public||LA16_5==Colon||(LA16_5>=RULE_END && LA16_5<=RULE_ID)) ) {
                        alt16=1;
                    }


                    }
                    break;

                }

                switch (alt16) {
            	case 1 :
            	    // InternalModelEditorParser.g:1107:3: rule__Class__FieldsAssignment_5_1
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Class__FieldsAssignment_5_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getClassAccess().getFieldsAssignment_5_1()); 

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
    // $ANTLR end "rule__Class__Group_5__1__Impl"


    // $ANTLR start "rule__Class__Group_5__2"
    // InternalModelEditorParser.g:1115:1: rule__Class__Group_5__2 : rule__Class__Group_5__2__Impl rule__Class__Group_5__3 ;
    public final void rule__Class__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1119:1: ( rule__Class__Group_5__2__Impl rule__Class__Group_5__3 )
            // InternalModelEditorParser.g:1120:2: rule__Class__Group_5__2__Impl rule__Class__Group_5__3
            {
            pushFollow(FOLLOW_12);
            rule__Class__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group_5__3();

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
    // $ANTLR end "rule__Class__Group_5__2"


    // $ANTLR start "rule__Class__Group_5__2__Impl"
    // InternalModelEditorParser.g:1127:1: rule__Class__Group_5__2__Impl : ( ( rule__Class__MethodsAssignment_5_2 )* ) ;
    public final void rule__Class__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1131:1: ( ( ( rule__Class__MethodsAssignment_5_2 )* ) )
            // InternalModelEditorParser.g:1132:1: ( ( rule__Class__MethodsAssignment_5_2 )* )
            {
            // InternalModelEditorParser.g:1132:1: ( ( rule__Class__MethodsAssignment_5_2 )* )
            // InternalModelEditorParser.g:1133:2: ( rule__Class__MethodsAssignment_5_2 )*
            {
             before(grammarAccess.getClassAccess().getMethodsAssignment_5_2()); 
            // InternalModelEditorParser.g:1134:2: ( rule__Class__MethodsAssignment_5_2 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==Protected||LA17_0==Constant||LA17_0==Private||LA17_0==Public||LA17_0==RULE_ID) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalModelEditorParser.g:1134:3: rule__Class__MethodsAssignment_5_2
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Class__MethodsAssignment_5_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getClassAccess().getMethodsAssignment_5_2()); 

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
    // $ANTLR end "rule__Class__Group_5__2__Impl"


    // $ANTLR start "rule__Class__Group_5__3"
    // InternalModelEditorParser.g:1142:1: rule__Class__Group_5__3 : rule__Class__Group_5__3__Impl ;
    public final void rule__Class__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1146:1: ( rule__Class__Group_5__3__Impl )
            // InternalModelEditorParser.g:1147:2: rule__Class__Group_5__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Class__Group_5__3__Impl();

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
    // $ANTLR end "rule__Class__Group_5__3"


    // $ANTLR start "rule__Class__Group_5__3__Impl"
    // InternalModelEditorParser.g:1153:1: rule__Class__Group_5__3__Impl : ( RULE_END ) ;
    public final void rule__Class__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1157:1: ( ( RULE_END ) )
            // InternalModelEditorParser.g:1158:1: ( RULE_END )
            {
            // InternalModelEditorParser.g:1158:1: ( RULE_END )
            // InternalModelEditorParser.g:1159:2: RULE_END
            {
             before(grammarAccess.getClassAccess().getENDTerminalRuleCall_5_3()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getENDTerminalRuleCall_5_3()); 

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
    // $ANTLR end "rule__Class__Group_5__3__Impl"


    // $ANTLR start "rule__Supertypes__Group__0"
    // InternalModelEditorParser.g:1169:1: rule__Supertypes__Group__0 : rule__Supertypes__Group__0__Impl rule__Supertypes__Group__1 ;
    public final void rule__Supertypes__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1173:1: ( rule__Supertypes__Group__0__Impl rule__Supertypes__Group__1 )
            // InternalModelEditorParser.g:1174:2: rule__Supertypes__Group__0__Impl rule__Supertypes__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Supertypes__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Supertypes__Group__1();

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
    // $ANTLR end "rule__Supertypes__Group__0"


    // $ANTLR start "rule__Supertypes__Group__0__Impl"
    // InternalModelEditorParser.g:1181:1: rule__Supertypes__Group__0__Impl : ( ( rule__Supertypes__SuperTypesAssignment_0 ) ) ;
    public final void rule__Supertypes__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1185:1: ( ( ( rule__Supertypes__SuperTypesAssignment_0 ) ) )
            // InternalModelEditorParser.g:1186:1: ( ( rule__Supertypes__SuperTypesAssignment_0 ) )
            {
            // InternalModelEditorParser.g:1186:1: ( ( rule__Supertypes__SuperTypesAssignment_0 ) )
            // InternalModelEditorParser.g:1187:2: ( rule__Supertypes__SuperTypesAssignment_0 )
            {
             before(grammarAccess.getSupertypesAccess().getSuperTypesAssignment_0()); 
            // InternalModelEditorParser.g:1188:2: ( rule__Supertypes__SuperTypesAssignment_0 )
            // InternalModelEditorParser.g:1188:3: rule__Supertypes__SuperTypesAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Supertypes__SuperTypesAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSupertypesAccess().getSuperTypesAssignment_0()); 

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
    // $ANTLR end "rule__Supertypes__Group__0__Impl"


    // $ANTLR start "rule__Supertypes__Group__1"
    // InternalModelEditorParser.g:1196:1: rule__Supertypes__Group__1 : rule__Supertypes__Group__1__Impl ;
    public final void rule__Supertypes__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1200:1: ( rule__Supertypes__Group__1__Impl )
            // InternalModelEditorParser.g:1201:2: rule__Supertypes__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Supertypes__Group__1__Impl();

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
    // $ANTLR end "rule__Supertypes__Group__1"


    // $ANTLR start "rule__Supertypes__Group__1__Impl"
    // InternalModelEditorParser.g:1207:1: rule__Supertypes__Group__1__Impl : ( ( rule__Supertypes__Group_1__0 )* ) ;
    public final void rule__Supertypes__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1211:1: ( ( ( rule__Supertypes__Group_1__0 )* ) )
            // InternalModelEditorParser.g:1212:1: ( ( rule__Supertypes__Group_1__0 )* )
            {
            // InternalModelEditorParser.g:1212:1: ( ( rule__Supertypes__Group_1__0 )* )
            // InternalModelEditorParser.g:1213:2: ( rule__Supertypes__Group_1__0 )*
            {
             before(grammarAccess.getSupertypesAccess().getGroup_1()); 
            // InternalModelEditorParser.g:1214:2: ( rule__Supertypes__Group_1__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==Comma) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalModelEditorParser.g:1214:3: rule__Supertypes__Group_1__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Supertypes__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getSupertypesAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Supertypes__Group__1__Impl"


    // $ANTLR start "rule__Supertypes__Group_1__0"
    // InternalModelEditorParser.g:1223:1: rule__Supertypes__Group_1__0 : rule__Supertypes__Group_1__0__Impl rule__Supertypes__Group_1__1 ;
    public final void rule__Supertypes__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1227:1: ( rule__Supertypes__Group_1__0__Impl rule__Supertypes__Group_1__1 )
            // InternalModelEditorParser.g:1228:2: rule__Supertypes__Group_1__0__Impl rule__Supertypes__Group_1__1
            {
            pushFollow(FOLLOW_6);
            rule__Supertypes__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Supertypes__Group_1__1();

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
    // $ANTLR end "rule__Supertypes__Group_1__0"


    // $ANTLR start "rule__Supertypes__Group_1__0__Impl"
    // InternalModelEditorParser.g:1235:1: rule__Supertypes__Group_1__0__Impl : ( Comma ) ;
    public final void rule__Supertypes__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1239:1: ( ( Comma ) )
            // InternalModelEditorParser.g:1240:1: ( Comma )
            {
            // InternalModelEditorParser.g:1240:1: ( Comma )
            // InternalModelEditorParser.g:1241:2: Comma
            {
             before(grammarAccess.getSupertypesAccess().getCommaKeyword_1_0()); 
            match(input,Comma,FOLLOW_2); 
             after(grammarAccess.getSupertypesAccess().getCommaKeyword_1_0()); 

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
    // $ANTLR end "rule__Supertypes__Group_1__0__Impl"


    // $ANTLR start "rule__Supertypes__Group_1__1"
    // InternalModelEditorParser.g:1250:1: rule__Supertypes__Group_1__1 : rule__Supertypes__Group_1__1__Impl ;
    public final void rule__Supertypes__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1254:1: ( rule__Supertypes__Group_1__1__Impl )
            // InternalModelEditorParser.g:1255:2: rule__Supertypes__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Supertypes__Group_1__1__Impl();

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
    // $ANTLR end "rule__Supertypes__Group_1__1"


    // $ANTLR start "rule__Supertypes__Group_1__1__Impl"
    // InternalModelEditorParser.g:1261:1: rule__Supertypes__Group_1__1__Impl : ( ( rule__Supertypes__SuperTypesAssignment_1_1 ) ) ;
    public final void rule__Supertypes__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1265:1: ( ( ( rule__Supertypes__SuperTypesAssignment_1_1 ) ) )
            // InternalModelEditorParser.g:1266:1: ( ( rule__Supertypes__SuperTypesAssignment_1_1 ) )
            {
            // InternalModelEditorParser.g:1266:1: ( ( rule__Supertypes__SuperTypesAssignment_1_1 ) )
            // InternalModelEditorParser.g:1267:2: ( rule__Supertypes__SuperTypesAssignment_1_1 )
            {
             before(grammarAccess.getSupertypesAccess().getSuperTypesAssignment_1_1()); 
            // InternalModelEditorParser.g:1268:2: ( rule__Supertypes__SuperTypesAssignment_1_1 )
            // InternalModelEditorParser.g:1268:3: rule__Supertypes__SuperTypesAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Supertypes__SuperTypesAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSupertypesAccess().getSuperTypesAssignment_1_1()); 

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
    // $ANTLR end "rule__Supertypes__Group_1__1__Impl"


    // $ANTLR start "rule__Field__Group__0"
    // InternalModelEditorParser.g:1277:1: rule__Field__Group__0 : rule__Field__Group__0__Impl rule__Field__Group__1 ;
    public final void rule__Field__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1281:1: ( rule__Field__Group__0__Impl rule__Field__Group__1 )
            // InternalModelEditorParser.g:1282:2: rule__Field__Group__0__Impl rule__Field__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Field__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Field__Group__1();

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
    // $ANTLR end "rule__Field__Group__0"


    // $ANTLR start "rule__Field__Group__0__Impl"
    // InternalModelEditorParser.g:1289:1: rule__Field__Group__0__Impl : ( ( rule__Field__ModifierAssignment_0 )? ) ;
    public final void rule__Field__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1293:1: ( ( ( rule__Field__ModifierAssignment_0 )? ) )
            // InternalModelEditorParser.g:1294:1: ( ( rule__Field__ModifierAssignment_0 )? )
            {
            // InternalModelEditorParser.g:1294:1: ( ( rule__Field__ModifierAssignment_0 )? )
            // InternalModelEditorParser.g:1295:2: ( rule__Field__ModifierAssignment_0 )?
            {
             before(grammarAccess.getFieldAccess().getModifierAssignment_0()); 
            // InternalModelEditorParser.g:1296:2: ( rule__Field__ModifierAssignment_0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==Protected||LA19_0==Constant||LA19_0==Private||LA19_0==Public) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalModelEditorParser.g:1296:3: rule__Field__ModifierAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Field__ModifierAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFieldAccess().getModifierAssignment_0()); 

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
    // $ANTLR end "rule__Field__Group__0__Impl"


    // $ANTLR start "rule__Field__Group__1"
    // InternalModelEditorParser.g:1304:1: rule__Field__Group__1 : rule__Field__Group__1__Impl rule__Field__Group__2 ;
    public final void rule__Field__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1308:1: ( rule__Field__Group__1__Impl rule__Field__Group__2 )
            // InternalModelEditorParser.g:1309:2: rule__Field__Group__1__Impl rule__Field__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__Field__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Field__Group__2();

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
    // $ANTLR end "rule__Field__Group__1"


    // $ANTLR start "rule__Field__Group__1__Impl"
    // InternalModelEditorParser.g:1316:1: rule__Field__Group__1__Impl : ( ( rule__Field__NameAssignment_1 ) ) ;
    public final void rule__Field__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1320:1: ( ( ( rule__Field__NameAssignment_1 ) ) )
            // InternalModelEditorParser.g:1321:1: ( ( rule__Field__NameAssignment_1 ) )
            {
            // InternalModelEditorParser.g:1321:1: ( ( rule__Field__NameAssignment_1 ) )
            // InternalModelEditorParser.g:1322:2: ( rule__Field__NameAssignment_1 )
            {
             before(grammarAccess.getFieldAccess().getNameAssignment_1()); 
            // InternalModelEditorParser.g:1323:2: ( rule__Field__NameAssignment_1 )
            // InternalModelEditorParser.g:1323:3: rule__Field__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Field__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Field__Group__1__Impl"


    // $ANTLR start "rule__Field__Group__2"
    // InternalModelEditorParser.g:1331:1: rule__Field__Group__2 : rule__Field__Group__2__Impl ;
    public final void rule__Field__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1335:1: ( rule__Field__Group__2__Impl )
            // InternalModelEditorParser.g:1336:2: rule__Field__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Field__Group__2__Impl();

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
    // $ANTLR end "rule__Field__Group__2"


    // $ANTLR start "rule__Field__Group__2__Impl"
    // InternalModelEditorParser.g:1342:1: rule__Field__Group__2__Impl : ( ( rule__Field__Group_2__0 )? ) ;
    public final void rule__Field__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1346:1: ( ( ( rule__Field__Group_2__0 )? ) )
            // InternalModelEditorParser.g:1347:1: ( ( rule__Field__Group_2__0 )? )
            {
            // InternalModelEditorParser.g:1347:1: ( ( rule__Field__Group_2__0 )? )
            // InternalModelEditorParser.g:1348:2: ( rule__Field__Group_2__0 )?
            {
             before(grammarAccess.getFieldAccess().getGroup_2()); 
            // InternalModelEditorParser.g:1349:2: ( rule__Field__Group_2__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==Colon) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalModelEditorParser.g:1349:3: rule__Field__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Field__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFieldAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Field__Group__2__Impl"


    // $ANTLR start "rule__Field__Group_2__0"
    // InternalModelEditorParser.g:1358:1: rule__Field__Group_2__0 : rule__Field__Group_2__0__Impl rule__Field__Group_2__1 ;
    public final void rule__Field__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1362:1: ( rule__Field__Group_2__0__Impl rule__Field__Group_2__1 )
            // InternalModelEditorParser.g:1363:2: rule__Field__Group_2__0__Impl rule__Field__Group_2__1
            {
            pushFollow(FOLLOW_6);
            rule__Field__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Field__Group_2__1();

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
    // $ANTLR end "rule__Field__Group_2__0"


    // $ANTLR start "rule__Field__Group_2__0__Impl"
    // InternalModelEditorParser.g:1370:1: rule__Field__Group_2__0__Impl : ( Colon ) ;
    public final void rule__Field__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1374:1: ( ( Colon ) )
            // InternalModelEditorParser.g:1375:1: ( Colon )
            {
            // InternalModelEditorParser.g:1375:1: ( Colon )
            // InternalModelEditorParser.g:1376:2: Colon
            {
             before(grammarAccess.getFieldAccess().getColonKeyword_2_0()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getFieldAccess().getColonKeyword_2_0()); 

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
    // $ANTLR end "rule__Field__Group_2__0__Impl"


    // $ANTLR start "rule__Field__Group_2__1"
    // InternalModelEditorParser.g:1385:1: rule__Field__Group_2__1 : rule__Field__Group_2__1__Impl ;
    public final void rule__Field__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1389:1: ( rule__Field__Group_2__1__Impl )
            // InternalModelEditorParser.g:1390:2: rule__Field__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Field__Group_2__1__Impl();

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
    // $ANTLR end "rule__Field__Group_2__1"


    // $ANTLR start "rule__Field__Group_2__1__Impl"
    // InternalModelEditorParser.g:1396:1: rule__Field__Group_2__1__Impl : ( ( rule__Field__TypeAssignment_2_1 ) ) ;
    public final void rule__Field__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1400:1: ( ( ( rule__Field__TypeAssignment_2_1 ) ) )
            // InternalModelEditorParser.g:1401:1: ( ( rule__Field__TypeAssignment_2_1 ) )
            {
            // InternalModelEditorParser.g:1401:1: ( ( rule__Field__TypeAssignment_2_1 ) )
            // InternalModelEditorParser.g:1402:2: ( rule__Field__TypeAssignment_2_1 )
            {
             before(grammarAccess.getFieldAccess().getTypeAssignment_2_1()); 
            // InternalModelEditorParser.g:1403:2: ( rule__Field__TypeAssignment_2_1 )
            // InternalModelEditorParser.g:1403:3: rule__Field__TypeAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Field__TypeAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getTypeAssignment_2_1()); 

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
    // $ANTLR end "rule__Field__Group_2__1__Impl"


    // $ANTLR start "rule__Method__Group__0"
    // InternalModelEditorParser.g:1412:1: rule__Method__Group__0 : rule__Method__Group__0__Impl rule__Method__Group__1 ;
    public final void rule__Method__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1416:1: ( rule__Method__Group__0__Impl rule__Method__Group__1 )
            // InternalModelEditorParser.g:1417:2: rule__Method__Group__0__Impl rule__Method__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Method__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group__1();

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
    // $ANTLR end "rule__Method__Group__0"


    // $ANTLR start "rule__Method__Group__0__Impl"
    // InternalModelEditorParser.g:1424:1: rule__Method__Group__0__Impl : ( ( rule__Method__ModifierAssignment_0 )? ) ;
    public final void rule__Method__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1428:1: ( ( ( rule__Method__ModifierAssignment_0 )? ) )
            // InternalModelEditorParser.g:1429:1: ( ( rule__Method__ModifierAssignment_0 )? )
            {
            // InternalModelEditorParser.g:1429:1: ( ( rule__Method__ModifierAssignment_0 )? )
            // InternalModelEditorParser.g:1430:2: ( rule__Method__ModifierAssignment_0 )?
            {
             before(grammarAccess.getMethodAccess().getModifierAssignment_0()); 
            // InternalModelEditorParser.g:1431:2: ( rule__Method__ModifierAssignment_0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==Protected||LA21_0==Constant||LA21_0==Private||LA21_0==Public) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalModelEditorParser.g:1431:3: rule__Method__ModifierAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Method__ModifierAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMethodAccess().getModifierAssignment_0()); 

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
    // $ANTLR end "rule__Method__Group__0__Impl"


    // $ANTLR start "rule__Method__Group__1"
    // InternalModelEditorParser.g:1439:1: rule__Method__Group__1 : rule__Method__Group__1__Impl rule__Method__Group__2 ;
    public final void rule__Method__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1443:1: ( rule__Method__Group__1__Impl rule__Method__Group__2 )
            // InternalModelEditorParser.g:1444:2: rule__Method__Group__1__Impl rule__Method__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__Method__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group__2();

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
    // $ANTLR end "rule__Method__Group__1"


    // $ANTLR start "rule__Method__Group__1__Impl"
    // InternalModelEditorParser.g:1451:1: rule__Method__Group__1__Impl : ( ( rule__Method__NameAssignment_1 ) ) ;
    public final void rule__Method__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1455:1: ( ( ( rule__Method__NameAssignment_1 ) ) )
            // InternalModelEditorParser.g:1456:1: ( ( rule__Method__NameAssignment_1 ) )
            {
            // InternalModelEditorParser.g:1456:1: ( ( rule__Method__NameAssignment_1 ) )
            // InternalModelEditorParser.g:1457:2: ( rule__Method__NameAssignment_1 )
            {
             before(grammarAccess.getMethodAccess().getNameAssignment_1()); 
            // InternalModelEditorParser.g:1458:2: ( rule__Method__NameAssignment_1 )
            // InternalModelEditorParser.g:1458:3: rule__Method__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Method__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMethodAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Method__Group__1__Impl"


    // $ANTLR start "rule__Method__Group__2"
    // InternalModelEditorParser.g:1466:1: rule__Method__Group__2 : rule__Method__Group__2__Impl rule__Method__Group__3 ;
    public final void rule__Method__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1470:1: ( rule__Method__Group__2__Impl rule__Method__Group__3 )
            // InternalModelEditorParser.g:1471:2: rule__Method__Group__2__Impl rule__Method__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__Method__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group__3();

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
    // $ANTLR end "rule__Method__Group__2"


    // $ANTLR start "rule__Method__Group__2__Impl"
    // InternalModelEditorParser.g:1478:1: rule__Method__Group__2__Impl : ( LeftParenthesis ) ;
    public final void rule__Method__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1482:1: ( ( LeftParenthesis ) )
            // InternalModelEditorParser.g:1483:1: ( LeftParenthesis )
            {
            // InternalModelEditorParser.g:1483:1: ( LeftParenthesis )
            // InternalModelEditorParser.g:1484:2: LeftParenthesis
            {
             before(grammarAccess.getMethodAccess().getLeftParenthesisKeyword_2()); 
            match(input,LeftParenthesis,FOLLOW_2); 
             after(grammarAccess.getMethodAccess().getLeftParenthesisKeyword_2()); 

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
    // $ANTLR end "rule__Method__Group__2__Impl"


    // $ANTLR start "rule__Method__Group__3"
    // InternalModelEditorParser.g:1493:1: rule__Method__Group__3 : rule__Method__Group__3__Impl rule__Method__Group__4 ;
    public final void rule__Method__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1497:1: ( rule__Method__Group__3__Impl rule__Method__Group__4 )
            // InternalModelEditorParser.g:1498:2: rule__Method__Group__3__Impl rule__Method__Group__4
            {
            pushFollow(FOLLOW_19);
            rule__Method__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group__4();

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
    // $ANTLR end "rule__Method__Group__3"


    // $ANTLR start "rule__Method__Group__3__Impl"
    // InternalModelEditorParser.g:1505:1: rule__Method__Group__3__Impl : ( ( rule__Method__Group_3__0 )? ) ;
    public final void rule__Method__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1509:1: ( ( ( rule__Method__Group_3__0 )? ) )
            // InternalModelEditorParser.g:1510:1: ( ( rule__Method__Group_3__0 )? )
            {
            // InternalModelEditorParser.g:1510:1: ( ( rule__Method__Group_3__0 )? )
            // InternalModelEditorParser.g:1511:2: ( rule__Method__Group_3__0 )?
            {
             before(grammarAccess.getMethodAccess().getGroup_3()); 
            // InternalModelEditorParser.g:1512:2: ( rule__Method__Group_3__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_ID||LA22_0==RULE_STRING) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalModelEditorParser.g:1512:3: rule__Method__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Method__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMethodAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Method__Group__3__Impl"


    // $ANTLR start "rule__Method__Group__4"
    // InternalModelEditorParser.g:1520:1: rule__Method__Group__4 : rule__Method__Group__4__Impl rule__Method__Group__5 ;
    public final void rule__Method__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1524:1: ( rule__Method__Group__4__Impl rule__Method__Group__5 )
            // InternalModelEditorParser.g:1525:2: rule__Method__Group__4__Impl rule__Method__Group__5
            {
            pushFollow(FOLLOW_20);
            rule__Method__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group__5();

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
    // $ANTLR end "rule__Method__Group__4"


    // $ANTLR start "rule__Method__Group__4__Impl"
    // InternalModelEditorParser.g:1532:1: rule__Method__Group__4__Impl : ( RightParenthesis ) ;
    public final void rule__Method__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1536:1: ( ( RightParenthesis ) )
            // InternalModelEditorParser.g:1537:1: ( RightParenthesis )
            {
            // InternalModelEditorParser.g:1537:1: ( RightParenthesis )
            // InternalModelEditorParser.g:1538:2: RightParenthesis
            {
             before(grammarAccess.getMethodAccess().getRightParenthesisKeyword_4()); 
            match(input,RightParenthesis,FOLLOW_2); 
             after(grammarAccess.getMethodAccess().getRightParenthesisKeyword_4()); 

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
    // $ANTLR end "rule__Method__Group__4__Impl"


    // $ANTLR start "rule__Method__Group__5"
    // InternalModelEditorParser.g:1547:1: rule__Method__Group__5 : rule__Method__Group__5__Impl rule__Method__Group__6 ;
    public final void rule__Method__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1551:1: ( rule__Method__Group__5__Impl rule__Method__Group__6 )
            // InternalModelEditorParser.g:1552:2: rule__Method__Group__5__Impl rule__Method__Group__6
            {
            pushFollow(FOLLOW_20);
            rule__Method__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group__6();

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
    // $ANTLR end "rule__Method__Group__5"


    // $ANTLR start "rule__Method__Group__5__Impl"
    // InternalModelEditorParser.g:1559:1: rule__Method__Group__5__Impl : ( ( rule__Method__Group_5__0 )? ) ;
    public final void rule__Method__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1563:1: ( ( ( rule__Method__Group_5__0 )? ) )
            // InternalModelEditorParser.g:1564:1: ( ( rule__Method__Group_5__0 )? )
            {
            // InternalModelEditorParser.g:1564:1: ( ( rule__Method__Group_5__0 )? )
            // InternalModelEditorParser.g:1565:2: ( rule__Method__Group_5__0 )?
            {
             before(grammarAccess.getMethodAccess().getGroup_5()); 
            // InternalModelEditorParser.g:1566:2: ( rule__Method__Group_5__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==Colon) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalModelEditorParser.g:1566:3: rule__Method__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Method__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMethodAccess().getGroup_5()); 

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
    // $ANTLR end "rule__Method__Group__5__Impl"


    // $ANTLR start "rule__Method__Group__6"
    // InternalModelEditorParser.g:1574:1: rule__Method__Group__6 : rule__Method__Group__6__Impl ;
    public final void rule__Method__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1578:1: ( rule__Method__Group__6__Impl )
            // InternalModelEditorParser.g:1579:2: rule__Method__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Method__Group__6__Impl();

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
    // $ANTLR end "rule__Method__Group__6"


    // $ANTLR start "rule__Method__Group__6__Impl"
    // InternalModelEditorParser.g:1585:1: rule__Method__Group__6__Impl : ( ( rule__Method__Group_6__0 )? ) ;
    public final void rule__Method__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1589:1: ( ( ( rule__Method__Group_6__0 )? ) )
            // InternalModelEditorParser.g:1590:1: ( ( rule__Method__Group_6__0 )? )
            {
            // InternalModelEditorParser.g:1590:1: ( ( rule__Method__Group_6__0 )? )
            // InternalModelEditorParser.g:1591:2: ( rule__Method__Group_6__0 )?
            {
             before(grammarAccess.getMethodAccess().getGroup_6()); 
            // InternalModelEditorParser.g:1592:2: ( rule__Method__Group_6__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_BEGIN) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalModelEditorParser.g:1592:3: rule__Method__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Method__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMethodAccess().getGroup_6()); 

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
    // $ANTLR end "rule__Method__Group__6__Impl"


    // $ANTLR start "rule__Method__Group_3__0"
    // InternalModelEditorParser.g:1601:1: rule__Method__Group_3__0 : rule__Method__Group_3__0__Impl rule__Method__Group_3__1 ;
    public final void rule__Method__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1605:1: ( rule__Method__Group_3__0__Impl rule__Method__Group_3__1 )
            // InternalModelEditorParser.g:1606:2: rule__Method__Group_3__0__Impl rule__Method__Group_3__1
            {
            pushFollow(FOLLOW_14);
            rule__Method__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group_3__1();

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
    // $ANTLR end "rule__Method__Group_3__0"


    // $ANTLR start "rule__Method__Group_3__0__Impl"
    // InternalModelEditorParser.g:1613:1: rule__Method__Group_3__0__Impl : ( ( rule__Method__TypesAssignment_3_0 ) ) ;
    public final void rule__Method__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1617:1: ( ( ( rule__Method__TypesAssignment_3_0 ) ) )
            // InternalModelEditorParser.g:1618:1: ( ( rule__Method__TypesAssignment_3_0 ) )
            {
            // InternalModelEditorParser.g:1618:1: ( ( rule__Method__TypesAssignment_3_0 ) )
            // InternalModelEditorParser.g:1619:2: ( rule__Method__TypesAssignment_3_0 )
            {
             before(grammarAccess.getMethodAccess().getTypesAssignment_3_0()); 
            // InternalModelEditorParser.g:1620:2: ( rule__Method__TypesAssignment_3_0 )
            // InternalModelEditorParser.g:1620:3: rule__Method__TypesAssignment_3_0
            {
            pushFollow(FOLLOW_2);
            rule__Method__TypesAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getMethodAccess().getTypesAssignment_3_0()); 

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
    // $ANTLR end "rule__Method__Group_3__0__Impl"


    // $ANTLR start "rule__Method__Group_3__1"
    // InternalModelEditorParser.g:1628:1: rule__Method__Group_3__1 : rule__Method__Group_3__1__Impl ;
    public final void rule__Method__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1632:1: ( rule__Method__Group_3__1__Impl )
            // InternalModelEditorParser.g:1633:2: rule__Method__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Method__Group_3__1__Impl();

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
    // $ANTLR end "rule__Method__Group_3__1"


    // $ANTLR start "rule__Method__Group_3__1__Impl"
    // InternalModelEditorParser.g:1639:1: rule__Method__Group_3__1__Impl : ( ( rule__Method__Group_3_1__0 )* ) ;
    public final void rule__Method__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1643:1: ( ( ( rule__Method__Group_3_1__0 )* ) )
            // InternalModelEditorParser.g:1644:1: ( ( rule__Method__Group_3_1__0 )* )
            {
            // InternalModelEditorParser.g:1644:1: ( ( rule__Method__Group_3_1__0 )* )
            // InternalModelEditorParser.g:1645:2: ( rule__Method__Group_3_1__0 )*
            {
             before(grammarAccess.getMethodAccess().getGroup_3_1()); 
            // InternalModelEditorParser.g:1646:2: ( rule__Method__Group_3_1__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==Comma) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalModelEditorParser.g:1646:3: rule__Method__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Method__Group_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getMethodAccess().getGroup_3_1()); 

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
    // $ANTLR end "rule__Method__Group_3__1__Impl"


    // $ANTLR start "rule__Method__Group_3_1__0"
    // InternalModelEditorParser.g:1655:1: rule__Method__Group_3_1__0 : rule__Method__Group_3_1__0__Impl rule__Method__Group_3_1__1 ;
    public final void rule__Method__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1659:1: ( rule__Method__Group_3_1__0__Impl rule__Method__Group_3_1__1 )
            // InternalModelEditorParser.g:1660:2: rule__Method__Group_3_1__0__Impl rule__Method__Group_3_1__1
            {
            pushFollow(FOLLOW_6);
            rule__Method__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group_3_1__1();

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
    // $ANTLR end "rule__Method__Group_3_1__0"


    // $ANTLR start "rule__Method__Group_3_1__0__Impl"
    // InternalModelEditorParser.g:1667:1: rule__Method__Group_3_1__0__Impl : ( Comma ) ;
    public final void rule__Method__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1671:1: ( ( Comma ) )
            // InternalModelEditorParser.g:1672:1: ( Comma )
            {
            // InternalModelEditorParser.g:1672:1: ( Comma )
            // InternalModelEditorParser.g:1673:2: Comma
            {
             before(grammarAccess.getMethodAccess().getCommaKeyword_3_1_0()); 
            match(input,Comma,FOLLOW_2); 
             after(grammarAccess.getMethodAccess().getCommaKeyword_3_1_0()); 

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
    // $ANTLR end "rule__Method__Group_3_1__0__Impl"


    // $ANTLR start "rule__Method__Group_3_1__1"
    // InternalModelEditorParser.g:1682:1: rule__Method__Group_3_1__1 : rule__Method__Group_3_1__1__Impl ;
    public final void rule__Method__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1686:1: ( rule__Method__Group_3_1__1__Impl )
            // InternalModelEditorParser.g:1687:2: rule__Method__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Method__Group_3_1__1__Impl();

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
    // $ANTLR end "rule__Method__Group_3_1__1"


    // $ANTLR start "rule__Method__Group_3_1__1__Impl"
    // InternalModelEditorParser.g:1693:1: rule__Method__Group_3_1__1__Impl : ( ( rule__Method__TypesAssignment_3_1_1 ) ) ;
    public final void rule__Method__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1697:1: ( ( ( rule__Method__TypesAssignment_3_1_1 ) ) )
            // InternalModelEditorParser.g:1698:1: ( ( rule__Method__TypesAssignment_3_1_1 ) )
            {
            // InternalModelEditorParser.g:1698:1: ( ( rule__Method__TypesAssignment_3_1_1 ) )
            // InternalModelEditorParser.g:1699:2: ( rule__Method__TypesAssignment_3_1_1 )
            {
             before(grammarAccess.getMethodAccess().getTypesAssignment_3_1_1()); 
            // InternalModelEditorParser.g:1700:2: ( rule__Method__TypesAssignment_3_1_1 )
            // InternalModelEditorParser.g:1700:3: rule__Method__TypesAssignment_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Method__TypesAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMethodAccess().getTypesAssignment_3_1_1()); 

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
    // $ANTLR end "rule__Method__Group_3_1__1__Impl"


    // $ANTLR start "rule__Method__Group_5__0"
    // InternalModelEditorParser.g:1709:1: rule__Method__Group_5__0 : rule__Method__Group_5__0__Impl rule__Method__Group_5__1 ;
    public final void rule__Method__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1713:1: ( rule__Method__Group_5__0__Impl rule__Method__Group_5__1 )
            // InternalModelEditorParser.g:1714:2: rule__Method__Group_5__0__Impl rule__Method__Group_5__1
            {
            pushFollow(FOLLOW_6);
            rule__Method__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group_5__1();

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
    // $ANTLR end "rule__Method__Group_5__0"


    // $ANTLR start "rule__Method__Group_5__0__Impl"
    // InternalModelEditorParser.g:1721:1: rule__Method__Group_5__0__Impl : ( Colon ) ;
    public final void rule__Method__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1725:1: ( ( Colon ) )
            // InternalModelEditorParser.g:1726:1: ( Colon )
            {
            // InternalModelEditorParser.g:1726:1: ( Colon )
            // InternalModelEditorParser.g:1727:2: Colon
            {
             before(grammarAccess.getMethodAccess().getColonKeyword_5_0()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getMethodAccess().getColonKeyword_5_0()); 

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
    // $ANTLR end "rule__Method__Group_5__0__Impl"


    // $ANTLR start "rule__Method__Group_5__1"
    // InternalModelEditorParser.g:1736:1: rule__Method__Group_5__1 : rule__Method__Group_5__1__Impl ;
    public final void rule__Method__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1740:1: ( rule__Method__Group_5__1__Impl )
            // InternalModelEditorParser.g:1741:2: rule__Method__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Method__Group_5__1__Impl();

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
    // $ANTLR end "rule__Method__Group_5__1"


    // $ANTLR start "rule__Method__Group_5__1__Impl"
    // InternalModelEditorParser.g:1747:1: rule__Method__Group_5__1__Impl : ( ( rule__Method__TypeAssignment_5_1 ) ) ;
    public final void rule__Method__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1751:1: ( ( ( rule__Method__TypeAssignment_5_1 ) ) )
            // InternalModelEditorParser.g:1752:1: ( ( rule__Method__TypeAssignment_5_1 ) )
            {
            // InternalModelEditorParser.g:1752:1: ( ( rule__Method__TypeAssignment_5_1 ) )
            // InternalModelEditorParser.g:1753:2: ( rule__Method__TypeAssignment_5_1 )
            {
             before(grammarAccess.getMethodAccess().getTypeAssignment_5_1()); 
            // InternalModelEditorParser.g:1754:2: ( rule__Method__TypeAssignment_5_1 )
            // InternalModelEditorParser.g:1754:3: rule__Method__TypeAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Method__TypeAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getMethodAccess().getTypeAssignment_5_1()); 

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
    // $ANTLR end "rule__Method__Group_5__1__Impl"


    // $ANTLR start "rule__Method__Group_6__0"
    // InternalModelEditorParser.g:1763:1: rule__Method__Group_6__0 : rule__Method__Group_6__0__Impl rule__Method__Group_6__1 ;
    public final void rule__Method__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1767:1: ( rule__Method__Group_6__0__Impl rule__Method__Group_6__1 )
            // InternalModelEditorParser.g:1768:2: rule__Method__Group_6__0__Impl rule__Method__Group_6__1
            {
            pushFollow(FOLLOW_21);
            rule__Method__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group_6__1();

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
    // $ANTLR end "rule__Method__Group_6__0"


    // $ANTLR start "rule__Method__Group_6__0__Impl"
    // InternalModelEditorParser.g:1775:1: rule__Method__Group_6__0__Impl : ( RULE_BEGIN ) ;
    public final void rule__Method__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1779:1: ( ( RULE_BEGIN ) )
            // InternalModelEditorParser.g:1780:1: ( RULE_BEGIN )
            {
            // InternalModelEditorParser.g:1780:1: ( RULE_BEGIN )
            // InternalModelEditorParser.g:1781:2: RULE_BEGIN
            {
             before(grammarAccess.getMethodAccess().getBEGINTerminalRuleCall_6_0()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getMethodAccess().getBEGINTerminalRuleCall_6_0()); 

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
    // $ANTLR end "rule__Method__Group_6__0__Impl"


    // $ANTLR start "rule__Method__Group_6__1"
    // InternalModelEditorParser.g:1790:1: rule__Method__Group_6__1 : rule__Method__Group_6__1__Impl rule__Method__Group_6__2 ;
    public final void rule__Method__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1794:1: ( rule__Method__Group_6__1__Impl rule__Method__Group_6__2 )
            // InternalModelEditorParser.g:1795:2: rule__Method__Group_6__1__Impl rule__Method__Group_6__2
            {
            pushFollow(FOLLOW_21);
            rule__Method__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group_6__2();

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
    // $ANTLR end "rule__Method__Group_6__1"


    // $ANTLR start "rule__Method__Group_6__1__Impl"
    // InternalModelEditorParser.g:1802:1: rule__Method__Group_6__1__Impl : ( ( rule__Method__Group_6_1__0 )? ) ;
    public final void rule__Method__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1806:1: ( ( ( rule__Method__Group_6_1__0 )? ) )
            // InternalModelEditorParser.g:1807:1: ( ( rule__Method__Group_6_1__0 )? )
            {
            // InternalModelEditorParser.g:1807:1: ( ( rule__Method__Group_6_1__0 )? )
            // InternalModelEditorParser.g:1808:2: ( rule__Method__Group_6_1__0 )?
            {
             before(grammarAccess.getMethodAccess().getGroup_6_1()); 
            // InternalModelEditorParser.g:1809:2: ( rule__Method__Group_6_1__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_INT) ) {
                int LA26_1 = input.LA(2);

                if ( (LA26_1==Lines) ) {
                    alt26=1;
                }
            }
            switch (alt26) {
                case 1 :
                    // InternalModelEditorParser.g:1809:3: rule__Method__Group_6_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Method__Group_6_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMethodAccess().getGroup_6_1()); 

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
    // $ANTLR end "rule__Method__Group_6__1__Impl"


    // $ANTLR start "rule__Method__Group_6__2"
    // InternalModelEditorParser.g:1817:1: rule__Method__Group_6__2 : rule__Method__Group_6__2__Impl rule__Method__Group_6__3 ;
    public final void rule__Method__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1821:1: ( rule__Method__Group_6__2__Impl rule__Method__Group_6__3 )
            // InternalModelEditorParser.g:1822:2: rule__Method__Group_6__2__Impl rule__Method__Group_6__3
            {
            pushFollow(FOLLOW_21);
            rule__Method__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group_6__3();

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
    // $ANTLR end "rule__Method__Group_6__2"


    // $ANTLR start "rule__Method__Group_6__2__Impl"
    // InternalModelEditorParser.g:1829:1: rule__Method__Group_6__2__Impl : ( ( rule__Method__Group_6_2__0 )? ) ;
    public final void rule__Method__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1833:1: ( ( ( rule__Method__Group_6_2__0 )? ) )
            // InternalModelEditorParser.g:1834:1: ( ( rule__Method__Group_6_2__0 )? )
            {
            // InternalModelEditorParser.g:1834:1: ( ( rule__Method__Group_6_2__0 )? )
            // InternalModelEditorParser.g:1835:2: ( rule__Method__Group_6_2__0 )?
            {
             before(grammarAccess.getMethodAccess().getGroup_6_2()); 
            // InternalModelEditorParser.g:1836:2: ( rule__Method__Group_6_2__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_INT) ) {
                int LA27_1 = input.LA(2);

                if ( (LA27_1==Cyclo) ) {
                    alt27=1;
                }
            }
            switch (alt27) {
                case 1 :
                    // InternalModelEditorParser.g:1836:3: rule__Method__Group_6_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Method__Group_6_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMethodAccess().getGroup_6_2()); 

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
    // $ANTLR end "rule__Method__Group_6__2__Impl"


    // $ANTLR start "rule__Method__Group_6__3"
    // InternalModelEditorParser.g:1844:1: rule__Method__Group_6__3 : rule__Method__Group_6__3__Impl rule__Method__Group_6__4 ;
    public final void rule__Method__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1848:1: ( rule__Method__Group_6__3__Impl rule__Method__Group_6__4 )
            // InternalModelEditorParser.g:1849:2: rule__Method__Group_6__3__Impl rule__Method__Group_6__4
            {
            pushFollow(FOLLOW_21);
            rule__Method__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group_6__4();

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
    // $ANTLR end "rule__Method__Group_6__3"


    // $ANTLR start "rule__Method__Group_6__3__Impl"
    // InternalModelEditorParser.g:1856:1: rule__Method__Group_6__3__Impl : ( ( rule__Method__AccessesAssignment_6_3 )* ) ;
    public final void rule__Method__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1860:1: ( ( ( rule__Method__AccessesAssignment_6_3 )* ) )
            // InternalModelEditorParser.g:1861:1: ( ( rule__Method__AccessesAssignment_6_3 )* )
            {
            // InternalModelEditorParser.g:1861:1: ( ( rule__Method__AccessesAssignment_6_3 )* )
            // InternalModelEditorParser.g:1862:2: ( rule__Method__AccessesAssignment_6_3 )*
            {
             before(grammarAccess.getMethodAccess().getAccessesAssignment_6_3()); 
            // InternalModelEditorParser.g:1863:2: ( rule__Method__AccessesAssignment_6_3 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==RULE_INT) ) {
                    int LA28_1 = input.LA(2);

                    if ( (LA28_1==Accesses||LA28_1==Access) ) {
                        alt28=1;
                    }


                }


                switch (alt28) {
            	case 1 :
            	    // InternalModelEditorParser.g:1863:3: rule__Method__AccessesAssignment_6_3
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__Method__AccessesAssignment_6_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getMethodAccess().getAccessesAssignment_6_3()); 

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
    // $ANTLR end "rule__Method__Group_6__3__Impl"


    // $ANTLR start "rule__Method__Group_6__4"
    // InternalModelEditorParser.g:1871:1: rule__Method__Group_6__4 : rule__Method__Group_6__4__Impl rule__Method__Group_6__5 ;
    public final void rule__Method__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1875:1: ( rule__Method__Group_6__4__Impl rule__Method__Group_6__5 )
            // InternalModelEditorParser.g:1876:2: rule__Method__Group_6__4__Impl rule__Method__Group_6__5
            {
            pushFollow(FOLLOW_21);
            rule__Method__Group_6__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group_6__5();

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
    // $ANTLR end "rule__Method__Group_6__4"


    // $ANTLR start "rule__Method__Group_6__4__Impl"
    // InternalModelEditorParser.g:1883:1: rule__Method__Group_6__4__Impl : ( ( rule__Method__CallsAssignment_6_4 )* ) ;
    public final void rule__Method__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1887:1: ( ( ( rule__Method__CallsAssignment_6_4 )* ) )
            // InternalModelEditorParser.g:1888:1: ( ( rule__Method__CallsAssignment_6_4 )* )
            {
            // InternalModelEditorParser.g:1888:1: ( ( rule__Method__CallsAssignment_6_4 )* )
            // InternalModelEditorParser.g:1889:2: ( rule__Method__CallsAssignment_6_4 )*
            {
             before(grammarAccess.getMethodAccess().getCallsAssignment_6_4()); 
            // InternalModelEditorParser.g:1890:2: ( rule__Method__CallsAssignment_6_4 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==RULE_INT) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalModelEditorParser.g:1890:3: rule__Method__CallsAssignment_6_4
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__Method__CallsAssignment_6_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getMethodAccess().getCallsAssignment_6_4()); 

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
    // $ANTLR end "rule__Method__Group_6__4__Impl"


    // $ANTLR start "rule__Method__Group_6__5"
    // InternalModelEditorParser.g:1898:1: rule__Method__Group_6__5 : rule__Method__Group_6__5__Impl ;
    public final void rule__Method__Group_6__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1902:1: ( rule__Method__Group_6__5__Impl )
            // InternalModelEditorParser.g:1903:2: rule__Method__Group_6__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Method__Group_6__5__Impl();

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
    // $ANTLR end "rule__Method__Group_6__5"


    // $ANTLR start "rule__Method__Group_6__5__Impl"
    // InternalModelEditorParser.g:1909:1: rule__Method__Group_6__5__Impl : ( RULE_END ) ;
    public final void rule__Method__Group_6__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1913:1: ( ( RULE_END ) )
            // InternalModelEditorParser.g:1914:1: ( RULE_END )
            {
            // InternalModelEditorParser.g:1914:1: ( RULE_END )
            // InternalModelEditorParser.g:1915:2: RULE_END
            {
             before(grammarAccess.getMethodAccess().getENDTerminalRuleCall_6_5()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getMethodAccess().getENDTerminalRuleCall_6_5()); 

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
    // $ANTLR end "rule__Method__Group_6__5__Impl"


    // $ANTLR start "rule__Method__Group_6_1__0"
    // InternalModelEditorParser.g:1925:1: rule__Method__Group_6_1__0 : rule__Method__Group_6_1__0__Impl rule__Method__Group_6_1__1 ;
    public final void rule__Method__Group_6_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1929:1: ( rule__Method__Group_6_1__0__Impl rule__Method__Group_6_1__1 )
            // InternalModelEditorParser.g:1930:2: rule__Method__Group_6_1__0__Impl rule__Method__Group_6_1__1
            {
            pushFollow(FOLLOW_23);
            rule__Method__Group_6_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group_6_1__1();

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
    // $ANTLR end "rule__Method__Group_6_1__0"


    // $ANTLR start "rule__Method__Group_6_1__0__Impl"
    // InternalModelEditorParser.g:1937:1: rule__Method__Group_6_1__0__Impl : ( ( rule__Method__LocAssignment_6_1_0 ) ) ;
    public final void rule__Method__Group_6_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1941:1: ( ( ( rule__Method__LocAssignment_6_1_0 ) ) )
            // InternalModelEditorParser.g:1942:1: ( ( rule__Method__LocAssignment_6_1_0 ) )
            {
            // InternalModelEditorParser.g:1942:1: ( ( rule__Method__LocAssignment_6_1_0 ) )
            // InternalModelEditorParser.g:1943:2: ( rule__Method__LocAssignment_6_1_0 )
            {
             before(grammarAccess.getMethodAccess().getLocAssignment_6_1_0()); 
            // InternalModelEditorParser.g:1944:2: ( rule__Method__LocAssignment_6_1_0 )
            // InternalModelEditorParser.g:1944:3: rule__Method__LocAssignment_6_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Method__LocAssignment_6_1_0();

            state._fsp--;


            }

             after(grammarAccess.getMethodAccess().getLocAssignment_6_1_0()); 

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
    // $ANTLR end "rule__Method__Group_6_1__0__Impl"


    // $ANTLR start "rule__Method__Group_6_1__1"
    // InternalModelEditorParser.g:1952:1: rule__Method__Group_6_1__1 : rule__Method__Group_6_1__1__Impl rule__Method__Group_6_1__2 ;
    public final void rule__Method__Group_6_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1956:1: ( rule__Method__Group_6_1__1__Impl rule__Method__Group_6_1__2 )
            // InternalModelEditorParser.g:1957:2: rule__Method__Group_6_1__1__Impl rule__Method__Group_6_1__2
            {
            pushFollow(FOLLOW_24);
            rule__Method__Group_6_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group_6_1__2();

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
    // $ANTLR end "rule__Method__Group_6_1__1"


    // $ANTLR start "rule__Method__Group_6_1__1__Impl"
    // InternalModelEditorParser.g:1964:1: rule__Method__Group_6_1__1__Impl : ( Lines ) ;
    public final void rule__Method__Group_6_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1968:1: ( ( Lines ) )
            // InternalModelEditorParser.g:1969:1: ( Lines )
            {
            // InternalModelEditorParser.g:1969:1: ( Lines )
            // InternalModelEditorParser.g:1970:2: Lines
            {
             before(grammarAccess.getMethodAccess().getLinesKeyword_6_1_1()); 
            match(input,Lines,FOLLOW_2); 
             after(grammarAccess.getMethodAccess().getLinesKeyword_6_1_1()); 

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
    // $ANTLR end "rule__Method__Group_6_1__1__Impl"


    // $ANTLR start "rule__Method__Group_6_1__2"
    // InternalModelEditorParser.g:1979:1: rule__Method__Group_6_1__2 : rule__Method__Group_6_1__2__Impl rule__Method__Group_6_1__3 ;
    public final void rule__Method__Group_6_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1983:1: ( rule__Method__Group_6_1__2__Impl rule__Method__Group_6_1__3 )
            // InternalModelEditorParser.g:1984:2: rule__Method__Group_6_1__2__Impl rule__Method__Group_6_1__3
            {
            pushFollow(FOLLOW_25);
            rule__Method__Group_6_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group_6_1__3();

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
    // $ANTLR end "rule__Method__Group_6_1__2"


    // $ANTLR start "rule__Method__Group_6_1__2__Impl"
    // InternalModelEditorParser.g:1991:1: rule__Method__Group_6_1__2__Impl : ( Of ) ;
    public final void rule__Method__Group_6_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1995:1: ( ( Of ) )
            // InternalModelEditorParser.g:1996:1: ( Of )
            {
            // InternalModelEditorParser.g:1996:1: ( Of )
            // InternalModelEditorParser.g:1997:2: Of
            {
             before(grammarAccess.getMethodAccess().getOfKeyword_6_1_2()); 
            match(input,Of,FOLLOW_2); 
             after(grammarAccess.getMethodAccess().getOfKeyword_6_1_2()); 

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
    // $ANTLR end "rule__Method__Group_6_1__2__Impl"


    // $ANTLR start "rule__Method__Group_6_1__3"
    // InternalModelEditorParser.g:2006:1: rule__Method__Group_6_1__3 : rule__Method__Group_6_1__3__Impl ;
    public final void rule__Method__Group_6_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:2010:1: ( rule__Method__Group_6_1__3__Impl )
            // InternalModelEditorParser.g:2011:2: rule__Method__Group_6_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Method__Group_6_1__3__Impl();

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
    // $ANTLR end "rule__Method__Group_6_1__3"


    // $ANTLR start "rule__Method__Group_6_1__3__Impl"
    // InternalModelEditorParser.g:2017:1: rule__Method__Group_6_1__3__Impl : ( Code ) ;
    public final void rule__Method__Group_6_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:2021:1: ( ( Code ) )
            // InternalModelEditorParser.g:2022:1: ( Code )
            {
            // InternalModelEditorParser.g:2022:1: ( Code )
            // InternalModelEditorParser.g:2023:2: Code
            {
             before(grammarAccess.getMethodAccess().getCodeKeyword_6_1_3()); 
            match(input,Code,FOLLOW_2); 
             after(grammarAccess.getMethodAccess().getCodeKeyword_6_1_3()); 

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
    // $ANTLR end "rule__Method__Group_6_1__3__Impl"


    // $ANTLR start "rule__Method__Group_6_2__0"
    // InternalModelEditorParser.g:2033:1: rule__Method__Group_6_2__0 : rule__Method__Group_6_2__0__Impl rule__Method__Group_6_2__1 ;
    public final void rule__Method__Group_6_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:2037:1: ( rule__Method__Group_6_2__0__Impl rule__Method__Group_6_2__1 )
            // InternalModelEditorParser.g:2038:2: rule__Method__Group_6_2__0__Impl rule__Method__Group_6_2__1
            {
            pushFollow(FOLLOW_26);
            rule__Method__Group_6_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group_6_2__1();

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
    // $ANTLR end "rule__Method__Group_6_2__0"


    // $ANTLR start "rule__Method__Group_6_2__0__Impl"
    // InternalModelEditorParser.g:2045:1: rule__Method__Group_6_2__0__Impl : ( ( rule__Method__CycloAssignment_6_2_0 ) ) ;
    public final void rule__Method__Group_6_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:2049:1: ( ( ( rule__Method__CycloAssignment_6_2_0 ) ) )
            // InternalModelEditorParser.g:2050:1: ( ( rule__Method__CycloAssignment_6_2_0 ) )
            {
            // InternalModelEditorParser.g:2050:1: ( ( rule__Method__CycloAssignment_6_2_0 ) )
            // InternalModelEditorParser.g:2051:2: ( rule__Method__CycloAssignment_6_2_0 )
            {
             before(grammarAccess.getMethodAccess().getCycloAssignment_6_2_0()); 
            // InternalModelEditorParser.g:2052:2: ( rule__Method__CycloAssignment_6_2_0 )
            // InternalModelEditorParser.g:2052:3: rule__Method__CycloAssignment_6_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Method__CycloAssignment_6_2_0();

            state._fsp--;


            }

             after(grammarAccess.getMethodAccess().getCycloAssignment_6_2_0()); 

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
    // $ANTLR end "rule__Method__Group_6_2__0__Impl"


    // $ANTLR start "rule__Method__Group_6_2__1"
    // InternalModelEditorParser.g:2060:1: rule__Method__Group_6_2__1 : rule__Method__Group_6_2__1__Impl ;
    public final void rule__Method__Group_6_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:2064:1: ( rule__Method__Group_6_2__1__Impl )
            // InternalModelEditorParser.g:2065:2: rule__Method__Group_6_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Method__Group_6_2__1__Impl();

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
    // $ANTLR end "rule__Method__Group_6_2__1"


    // $ANTLR start "rule__Method__Group_6_2__1__Impl"
    // InternalModelEditorParser.g:2071:1: rule__Method__Group_6_2__1__Impl : ( Cyclo ) ;
    public final void rule__Method__Group_6_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:2075:1: ( ( Cyclo ) )
            // InternalModelEditorParser.g:2076:1: ( Cyclo )
            {
            // InternalModelEditorParser.g:2076:1: ( Cyclo )
            // InternalModelEditorParser.g:2077:2: Cyclo
            {
             before(grammarAccess.getMethodAccess().getCycloKeyword_6_2_1()); 
            match(input,Cyclo,FOLLOW_2); 
             after(grammarAccess.getMethodAccess().getCycloKeyword_6_2_1()); 

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
    // $ANTLR end "rule__Method__Group_6_2__1__Impl"


    // $ANTLR start "rule__Access__Group__0"
    // InternalModelEditorParser.g:2087:1: rule__Access__Group__0 : rule__Access__Group__0__Impl rule__Access__Group__1 ;
    public final void rule__Access__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:2091:1: ( rule__Access__Group__0__Impl rule__Access__Group__1 )
            // InternalModelEditorParser.g:2092:2: rule__Access__Group__0__Impl rule__Access__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__Access__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Access__Group__1();

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
    // $ANTLR end "rule__Access__Group__0"


    // $ANTLR start "rule__Access__Group__0__Impl"
    // InternalModelEditorParser.g:2099:1: rule__Access__Group__0__Impl : ( ( rule__Access__AccessesAssignment_0 ) ) ;
    public final void rule__Access__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:2103:1: ( ( ( rule__Access__AccessesAssignment_0 ) ) )
            // InternalModelEditorParser.g:2104:1: ( ( rule__Access__AccessesAssignment_0 ) )
            {
            // InternalModelEditorParser.g:2104:1: ( ( rule__Access__AccessesAssignment_0 ) )
            // InternalModelEditorParser.g:2105:2: ( rule__Access__AccessesAssignment_0 )
            {
             before(grammarAccess.getAccessAccess().getAccessesAssignment_0()); 
            // InternalModelEditorParser.g:2106:2: ( rule__Access__AccessesAssignment_0 )
            // InternalModelEditorParser.g:2106:3: rule__Access__AccessesAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Access__AccessesAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAccessAccess().getAccessesAssignment_0()); 

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
    // $ANTLR end "rule__Access__Group__0__Impl"


    // $ANTLR start "rule__Access__Group__1"
    // InternalModelEditorParser.g:2114:1: rule__Access__Group__1 : rule__Access__Group__1__Impl rule__Access__Group__2 ;
    public final void rule__Access__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:2118:1: ( rule__Access__Group__1__Impl rule__Access__Group__2 )
            // InternalModelEditorParser.g:2119:2: rule__Access__Group__1__Impl rule__Access__Group__2
            {
            pushFollow(FOLLOW_28);
            rule__Access__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Access__Group__2();

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
    // $ANTLR end "rule__Access__Group__1"


    // $ANTLR start "rule__Access__Group__1__Impl"
    // InternalModelEditorParser.g:2126:1: rule__Access__Group__1__Impl : ( ( rule__Access__Alternatives_1 ) ) ;
    public final void rule__Access__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:2130:1: ( ( ( rule__Access__Alternatives_1 ) ) )
            // InternalModelEditorParser.g:2131:1: ( ( rule__Access__Alternatives_1 ) )
            {
            // InternalModelEditorParser.g:2131:1: ( ( rule__Access__Alternatives_1 ) )
            // InternalModelEditorParser.g:2132:2: ( rule__Access__Alternatives_1 )
            {
             before(grammarAccess.getAccessAccess().getAlternatives_1()); 
            // InternalModelEditorParser.g:2133:2: ( rule__Access__Alternatives_1 )
            // InternalModelEditorParser.g:2133:3: rule__Access__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__Access__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getAccessAccess().getAlternatives_1()); 

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
    // $ANTLR end "rule__Access__Group__1__Impl"


    // $ANTLR start "rule__Access__Group__2"
    // InternalModelEditorParser.g:2141:1: rule__Access__Group__2 : rule__Access__Group__2__Impl rule__Access__Group__3 ;
    public final void rule__Access__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:2145:1: ( rule__Access__Group__2__Impl rule__Access__Group__3 )
            // InternalModelEditorParser.g:2146:2: rule__Access__Group__2__Impl rule__Access__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Access__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Access__Group__3();

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
    // $ANTLR end "rule__Access__Group__2"


    // $ANTLR start "rule__Access__Group__2__Impl"
    // InternalModelEditorParser.g:2153:1: rule__Access__Group__2__Impl : ( To ) ;
    public final void rule__Access__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:2157:1: ( ( To ) )
            // InternalModelEditorParser.g:2158:1: ( To )
            {
            // InternalModelEditorParser.g:2158:1: ( To )
            // InternalModelEditorParser.g:2159:2: To
            {
             before(grammarAccess.getAccessAccess().getToKeyword_2()); 
            match(input,To,FOLLOW_2); 
             after(grammarAccess.getAccessAccess().getToKeyword_2()); 

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
    // $ANTLR end "rule__Access__Group__2__Impl"


    // $ANTLR start "rule__Access__Group__3"
    // InternalModelEditorParser.g:2168:1: rule__Access__Group__3 : rule__Access__Group__3__Impl ;
    public final void rule__Access__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:2172:1: ( rule__Access__Group__3__Impl )
            // InternalModelEditorParser.g:2173:2: rule__Access__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Access__Group__3__Impl();

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
    // $ANTLR end "rule__Access__Group__3"


    // $ANTLR start "rule__Access__Group__3__Impl"
    // InternalModelEditorParser.g:2179:1: rule__Access__Group__3__Impl : ( ( rule__Access__FieldAssignment_3 ) ) ;
    public final void rule__Access__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:2183:1: ( ( ( rule__Access__FieldAssignment_3 ) ) )
            // InternalModelEditorParser.g:2184:1: ( ( rule__Access__FieldAssignment_3 ) )
            {
            // InternalModelEditorParser.g:2184:1: ( ( rule__Access__FieldAssignment_3 ) )
            // InternalModelEditorParser.g:2185:2: ( rule__Access__FieldAssignment_3 )
            {
             before(grammarAccess.getAccessAccess().getFieldAssignment_3()); 
            // InternalModelEditorParser.g:2186:2: ( rule__Access__FieldAssignment_3 )
            // InternalModelEditorParser.g:2186:3: rule__Access__FieldAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Access__FieldAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAccessAccess().getFieldAssignment_3()); 

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
    // $ANTLR end "rule__Access__Group__3__Impl"


    // $ANTLR start "rule__Call__Group__0"
    // InternalModelEditorParser.g:2195:1: rule__Call__Group__0 : rule__Call__Group__0__Impl rule__Call__Group__1 ;
    public final void rule__Call__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:2199:1: ( rule__Call__Group__0__Impl rule__Call__Group__1 )
            // InternalModelEditorParser.g:2200:2: rule__Call__Group__0__Impl rule__Call__Group__1
            {
            pushFollow(FOLLOW_29);
            rule__Call__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Call__Group__1();

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
    // $ANTLR end "rule__Call__Group__0"


    // $ANTLR start "rule__Call__Group__0__Impl"
    // InternalModelEditorParser.g:2207:1: rule__Call__Group__0__Impl : ( ( rule__Call__CallsAssignment_0 ) ) ;
    public final void rule__Call__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:2211:1: ( ( ( rule__Call__CallsAssignment_0 ) ) )
            // InternalModelEditorParser.g:2212:1: ( ( rule__Call__CallsAssignment_0 ) )
            {
            // InternalModelEditorParser.g:2212:1: ( ( rule__Call__CallsAssignment_0 ) )
            // InternalModelEditorParser.g:2213:2: ( rule__Call__CallsAssignment_0 )
            {
             before(grammarAccess.getCallAccess().getCallsAssignment_0()); 
            // InternalModelEditorParser.g:2214:2: ( rule__Call__CallsAssignment_0 )
            // InternalModelEditorParser.g:2214:3: rule__Call__CallsAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Call__CallsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCallAccess().getCallsAssignment_0()); 

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
    // $ANTLR end "rule__Call__Group__0__Impl"


    // $ANTLR start "rule__Call__Group__1"
    // InternalModelEditorParser.g:2222:1: rule__Call__Group__1 : rule__Call__Group__1__Impl rule__Call__Group__2 ;
    public final void rule__Call__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:2226:1: ( rule__Call__Group__1__Impl rule__Call__Group__2 )
            // InternalModelEditorParser.g:2227:2: rule__Call__Group__1__Impl rule__Call__Group__2
            {
            pushFollow(FOLLOW_28);
            rule__Call__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Call__Group__2();

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
    // $ANTLR end "rule__Call__Group__1"


    // $ANTLR start "rule__Call__Group__1__Impl"
    // InternalModelEditorParser.g:2234:1: rule__Call__Group__1__Impl : ( ( rule__Call__Alternatives_1 ) ) ;
    public final void rule__Call__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:2238:1: ( ( ( rule__Call__Alternatives_1 ) ) )
            // InternalModelEditorParser.g:2239:1: ( ( rule__Call__Alternatives_1 ) )
            {
            // InternalModelEditorParser.g:2239:1: ( ( rule__Call__Alternatives_1 ) )
            // InternalModelEditorParser.g:2240:2: ( rule__Call__Alternatives_1 )
            {
             before(grammarAccess.getCallAccess().getAlternatives_1()); 
            // InternalModelEditorParser.g:2241:2: ( rule__Call__Alternatives_1 )
            // InternalModelEditorParser.g:2241:3: rule__Call__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__Call__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getCallAccess().getAlternatives_1()); 

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
    // $ANTLR end "rule__Call__Group__1__Impl"


    // $ANTLR start "rule__Call__Group__2"
    // InternalModelEditorParser.g:2249:1: rule__Call__Group__2 : rule__Call__Group__2__Impl rule__Call__Group__3 ;
    public final void rule__Call__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:2253:1: ( rule__Call__Group__2__Impl rule__Call__Group__3 )
            // InternalModelEditorParser.g:2254:2: rule__Call__Group__2__Impl rule__Call__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Call__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Call__Group__3();

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
    // $ANTLR end "rule__Call__Group__2"


    // $ANTLR start "rule__Call__Group__2__Impl"
    // InternalModelEditorParser.g:2261:1: rule__Call__Group__2__Impl : ( To ) ;
    public final void rule__Call__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:2265:1: ( ( To ) )
            // InternalModelEditorParser.g:2266:1: ( To )
            {
            // InternalModelEditorParser.g:2266:1: ( To )
            // InternalModelEditorParser.g:2267:2: To
            {
             before(grammarAccess.getCallAccess().getToKeyword_2()); 
            match(input,To,FOLLOW_2); 
             after(grammarAccess.getCallAccess().getToKeyword_2()); 

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
    // $ANTLR end "rule__Call__Group__2__Impl"


    // $ANTLR start "rule__Call__Group__3"
    // InternalModelEditorParser.g:2276:1: rule__Call__Group__3 : rule__Call__Group__3__Impl rule__Call__Group__4 ;
    public final void rule__Call__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:2280:1: ( rule__Call__Group__3__Impl rule__Call__Group__4 )
            // InternalModelEditorParser.g:2281:2: rule__Call__Group__3__Impl rule__Call__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__Call__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Call__Group__4();

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
    // $ANTLR end "rule__Call__Group__3"


    // $ANTLR start "rule__Call__Group__3__Impl"
    // InternalModelEditorParser.g:2288:1: rule__Call__Group__3__Impl : ( ( rule__Call__MethodAssignment_3 ) ) ;
    public final void rule__Call__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:2292:1: ( ( ( rule__Call__MethodAssignment_3 ) ) )
            // InternalModelEditorParser.g:2293:1: ( ( rule__Call__MethodAssignment_3 ) )
            {
            // InternalModelEditorParser.g:2293:1: ( ( rule__Call__MethodAssignment_3 ) )
            // InternalModelEditorParser.g:2294:2: ( rule__Call__MethodAssignment_3 )
            {
             before(grammarAccess.getCallAccess().getMethodAssignment_3()); 
            // InternalModelEditorParser.g:2295:2: ( rule__Call__MethodAssignment_3 )
            // InternalModelEditorParser.g:2295:3: rule__Call__MethodAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Call__MethodAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCallAccess().getMethodAssignment_3()); 

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
    // $ANTLR end "rule__Call__Group__3__Impl"


    // $ANTLR start "rule__Call__Group__4"
    // InternalModelEditorParser.g:2303:1: rule__Call__Group__4 : rule__Call__Group__4__Impl rule__Call__Group__5 ;
    public final void rule__Call__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:2307:1: ( rule__Call__Group__4__Impl rule__Call__Group__5 )
            // InternalModelEditorParser.g:2308:2: rule__Call__Group__4__Impl rule__Call__Group__5
            {
            pushFollow(FOLLOW_30);
            rule__Call__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Call__Group__5();

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
    // $ANTLR end "rule__Call__Group__4"


    // $ANTLR start "rule__Call__Group__4__Impl"
    // InternalModelEditorParser.g:2315:1: rule__Call__Group__4__Impl : ( LeftParenthesis ) ;
    public final void rule__Call__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:2319:1: ( ( LeftParenthesis ) )
            // InternalModelEditorParser.g:2320:1: ( LeftParenthesis )
            {
            // InternalModelEditorParser.g:2320:1: ( LeftParenthesis )
            // InternalModelEditorParser.g:2321:2: LeftParenthesis
            {
             before(grammarAccess.getCallAccess().getLeftParenthesisKeyword_4()); 
            match(input,LeftParenthesis,FOLLOW_2); 
             after(grammarAccess.getCallAccess().getLeftParenthesisKeyword_4()); 

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
    // $ANTLR end "rule__Call__Group__4__Impl"


    // $ANTLR start "rule__Call__Group__5"
    // InternalModelEditorParser.g:2330:1: rule__Call__Group__5 : rule__Call__Group__5__Impl ;
    public final void rule__Call__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:2334:1: ( rule__Call__Group__5__Impl )
            // InternalModelEditorParser.g:2335:2: rule__Call__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Call__Group__5__Impl();

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
    // $ANTLR end "rule__Call__Group__5"


    // $ANTLR start "rule__Call__Group__5__Impl"
    // InternalModelEditorParser.g:2341:1: rule__Call__Group__5__Impl : ( RightParenthesis ) ;
    public final void rule__Call__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:2345:1: ( ( RightParenthesis ) )
            // InternalModelEditorParser.g:2346:1: ( RightParenthesis )
            {
            // InternalModelEditorParser.g:2346:1: ( RightParenthesis )
            // InternalModelEditorParser.g:2347:2: RightParenthesis
            {
             before(grammarAccess.getCallAccess().getRightParenthesisKeyword_5()); 
            match(input,RightParenthesis,FOLLOW_2); 
             after(grammarAccess.getCallAccess().getRightParenthesisKeyword_5()); 

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
    // $ANTLR end "rule__Call__Group__5__Impl"


    // $ANTLR start "rule__Model__ImportsAssignment_0"
    // InternalModelEditorParser.g:2357:1: rule__Model__ImportsAssignment_0 : ( ruleImport ) ;
    public final void rule__Model__ImportsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:2361:1: ( ( ruleImport ) )
            // InternalModelEditorParser.g:2362:2: ( ruleImport )
            {
            // InternalModelEditorParser.g:2362:2: ( ruleImport )
            // InternalModelEditorParser.g:2363:3: ruleImport
            {
             before(grammarAccess.getModelAccess().getImportsImportParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getModelAccess().getImportsImportParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Model__ImportsAssignment_0"


    // $ANTLR start "rule__Model__ClassesAssignment_1"
    // InternalModelEditorParser.g:2372:1: rule__Model__ClassesAssignment_1 : ( ruleClass ) ;
    public final void rule__Model__ClassesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:2376:1: ( ( ruleClass ) )
            // InternalModelEditorParser.g:2377:2: ( ruleClass )
            {
            // InternalModelEditorParser.g:2377:2: ( ruleClass )
            // InternalModelEditorParser.g:2378:3: ruleClass
            {
             before(grammarAccess.getModelAccess().getClassesClassParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleClass();

            state._fsp--;

             after(grammarAccess.getModelAccess().getClassesClassParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Model__ClassesAssignment_1"


    // $ANTLR start "rule__Import__ImportedNamespaceAssignment_1"
    // InternalModelEditorParser.g:2387:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleQualifiedNameWithWildcard ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:2391:1: ( ( ruleQualifiedNameWithWildcard ) )
            // InternalModelEditorParser.g:2392:2: ( ruleQualifiedNameWithWildcard )
            {
            // InternalModelEditorParser.g:2392:2: ( ruleQualifiedNameWithWildcard )
            // InternalModelEditorParser.g:2393:3: ruleQualifiedNameWithWildcard
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedNameWithWildcard();

            state._fsp--;

             after(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Import__ImportedNamespaceAssignment_1"


    // $ANTLR start "rule__Class__ModifierAssignment_0"
    // InternalModelEditorParser.g:2402:1: rule__Class__ModifierAssignment_0 : ( ruleClassModifier ) ;
    public final void rule__Class__ModifierAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:2406:1: ( ( ruleClassModifier ) )
            // InternalModelEditorParser.g:2407:2: ( ruleClassModifier )
            {
            // InternalModelEditorParser.g:2407:2: ( ruleClassModifier )
            // InternalModelEditorParser.g:2408:3: ruleClassModifier
            {
             before(grammarAccess.getClassAccess().getModifierClassModifierParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleClassModifier();

            state._fsp--;

             after(grammarAccess.getClassAccess().getModifierClassModifierParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Class__ModifierAssignment_0"


    // $ANTLR start "rule__Class__NameAssignment_2"
    // InternalModelEditorParser.g:2417:1: rule__Class__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Class__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:2421:1: ( ( RULE_ID ) )
            // InternalModelEditorParser.g:2422:2: ( RULE_ID )
            {
            // InternalModelEditorParser.g:2422:2: ( RULE_ID )
            // InternalModelEditorParser.g:2423:3: RULE_ID
            {
             before(grammarAccess.getClassAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
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


    // $ANTLR start "rule__Class__ExtendsAssignment_3_1"
    // InternalModelEditorParser.g:2432:1: rule__Class__ExtendsAssignment_3_1 : ( ruleSupertypes ) ;
    public final void rule__Class__ExtendsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:2436:1: ( ( ruleSupertypes ) )
            // InternalModelEditorParser.g:2437:2: ( ruleSupertypes )
            {
            // InternalModelEditorParser.g:2437:2: ( ruleSupertypes )
            // InternalModelEditorParser.g:2438:3: ruleSupertypes
            {
             before(grammarAccess.getClassAccess().getExtendsSupertypesParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSupertypes();

            state._fsp--;

             after(grammarAccess.getClassAccess().getExtendsSupertypesParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Class__ExtendsAssignment_3_1"


    // $ANTLR start "rule__Class__ImplementsAssignment_4_1"
    // InternalModelEditorParser.g:2447:1: rule__Class__ImplementsAssignment_4_1 : ( ruleSupertypes ) ;
    public final void rule__Class__ImplementsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:2451:1: ( ( ruleSupertypes ) )
            // InternalModelEditorParser.g:2452:2: ( ruleSupertypes )
            {
            // InternalModelEditorParser.g:2452:2: ( ruleSupertypes )
            // InternalModelEditorParser.g:2453:3: ruleSupertypes
            {
             before(grammarAccess.getClassAccess().getImplementsSupertypesParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSupertypes();

            state._fsp--;

             after(grammarAccess.getClassAccess().getImplementsSupertypesParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__Class__ImplementsAssignment_4_1"


    // $ANTLR start "rule__Class__FieldsAssignment_5_1"
    // InternalModelEditorParser.g:2462:1: rule__Class__FieldsAssignment_5_1 : ( ruleField ) ;
    public final void rule__Class__FieldsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:2466:1: ( ( ruleField ) )
            // InternalModelEditorParser.g:2467:2: ( ruleField )
            {
            // InternalModelEditorParser.g:2467:2: ( ruleField )
            // InternalModelEditorParser.g:2468:3: ruleField
            {
             before(grammarAccess.getClassAccess().getFieldsFieldParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleField();

            state._fsp--;

             after(grammarAccess.getClassAccess().getFieldsFieldParserRuleCall_5_1_0()); 

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
    // $ANTLR end "rule__Class__FieldsAssignment_5_1"


    // $ANTLR start "rule__Class__MethodsAssignment_5_2"
    // InternalModelEditorParser.g:2477:1: rule__Class__MethodsAssignment_5_2 : ( ruleMethod ) ;
    public final void rule__Class__MethodsAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:2481:1: ( ( ruleMethod ) )
            // InternalModelEditorParser.g:2482:2: ( ruleMethod )
            {
            // InternalModelEditorParser.g:2482:2: ( ruleMethod )
            // InternalModelEditorParser.g:2483:3: ruleMethod
            {
             before(grammarAccess.getClassAccess().getMethodsMethodParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMethod();

            state._fsp--;

             after(grammarAccess.getClassAccess().getMethodsMethodParserRuleCall_5_2_0()); 

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
    // $ANTLR end "rule__Class__MethodsAssignment_5_2"


    // $ANTLR start "rule__Supertypes__SuperTypesAssignment_0"
    // InternalModelEditorParser.g:2492:1: rule__Supertypes__SuperTypesAssignment_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Supertypes__SuperTypesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:2496:1: ( ( ( ruleQualifiedName ) ) )
            // InternalModelEditorParser.g:2497:2: ( ( ruleQualifiedName ) )
            {
            // InternalModelEditorParser.g:2497:2: ( ( ruleQualifiedName ) )
            // InternalModelEditorParser.g:2498:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getSupertypesAccess().getSuperTypesClassCrossReference_0_0()); 
            // InternalModelEditorParser.g:2499:3: ( ruleQualifiedName )
            // InternalModelEditorParser.g:2500:4: ruleQualifiedName
            {
             before(grammarAccess.getSupertypesAccess().getSuperTypesClassQualifiedNameParserRuleCall_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getSupertypesAccess().getSuperTypesClassQualifiedNameParserRuleCall_0_0_1()); 

            }

             after(grammarAccess.getSupertypesAccess().getSuperTypesClassCrossReference_0_0()); 

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
    // $ANTLR end "rule__Supertypes__SuperTypesAssignment_0"


    // $ANTLR start "rule__Supertypes__SuperTypesAssignment_1_1"
    // InternalModelEditorParser.g:2511:1: rule__Supertypes__SuperTypesAssignment_1_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Supertypes__SuperTypesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:2515:1: ( ( ( ruleQualifiedName ) ) )
            // InternalModelEditorParser.g:2516:2: ( ( ruleQualifiedName ) )
            {
            // InternalModelEditorParser.g:2516:2: ( ( ruleQualifiedName ) )
            // InternalModelEditorParser.g:2517:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getSupertypesAccess().getSuperTypesClassCrossReference_1_1_0()); 
            // InternalModelEditorParser.g:2518:3: ( ruleQualifiedName )
            // InternalModelEditorParser.g:2519:4: ruleQualifiedName
            {
             before(grammarAccess.getSupertypesAccess().getSuperTypesClassQualifiedNameParserRuleCall_1_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getSupertypesAccess().getSuperTypesClassQualifiedNameParserRuleCall_1_1_0_1()); 

            }

             after(grammarAccess.getSupertypesAccess().getSuperTypesClassCrossReference_1_1_0()); 

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
    // $ANTLR end "rule__Supertypes__SuperTypesAssignment_1_1"


    // $ANTLR start "rule__Field__ModifierAssignment_0"
    // InternalModelEditorParser.g:2530:1: rule__Field__ModifierAssignment_0 : ( ruleMemberModifier ) ;
    public final void rule__Field__ModifierAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:2534:1: ( ( ruleMemberModifier ) )
            // InternalModelEditorParser.g:2535:2: ( ruleMemberModifier )
            {
            // InternalModelEditorParser.g:2535:2: ( ruleMemberModifier )
            // InternalModelEditorParser.g:2536:3: ruleMemberModifier
            {
             before(grammarAccess.getFieldAccess().getModifierMemberModifierParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleMemberModifier();

            state._fsp--;

             after(grammarAccess.getFieldAccess().getModifierMemberModifierParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Field__ModifierAssignment_0"


    // $ANTLR start "rule__Field__NameAssignment_1"
    // InternalModelEditorParser.g:2545:1: rule__Field__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Field__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:2549:1: ( ( RULE_ID ) )
            // InternalModelEditorParser.g:2550:2: ( RULE_ID )
            {
            // InternalModelEditorParser.g:2550:2: ( RULE_ID )
            // InternalModelEditorParser.g:2551:3: RULE_ID
            {
             before(grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Field__NameAssignment_1"


    // $ANTLR start "rule__Field__TypeAssignment_2_1"
    // InternalModelEditorParser.g:2560:1: rule__Field__TypeAssignment_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Field__TypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:2564:1: ( ( ( ruleQualifiedName ) ) )
            // InternalModelEditorParser.g:2565:2: ( ( ruleQualifiedName ) )
            {
            // InternalModelEditorParser.g:2565:2: ( ( ruleQualifiedName ) )
            // InternalModelEditorParser.g:2566:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getFieldAccess().getTypeClassCrossReference_2_1_0()); 
            // InternalModelEditorParser.g:2567:3: ( ruleQualifiedName )
            // InternalModelEditorParser.g:2568:4: ruleQualifiedName
            {
             before(grammarAccess.getFieldAccess().getTypeClassQualifiedNameParserRuleCall_2_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getFieldAccess().getTypeClassQualifiedNameParserRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getFieldAccess().getTypeClassCrossReference_2_1_0()); 

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
    // $ANTLR end "rule__Field__TypeAssignment_2_1"


    // $ANTLR start "rule__Method__ModifierAssignment_0"
    // InternalModelEditorParser.g:2579:1: rule__Method__ModifierAssignment_0 : ( ruleMemberModifier ) ;
    public final void rule__Method__ModifierAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:2583:1: ( ( ruleMemberModifier ) )
            // InternalModelEditorParser.g:2584:2: ( ruleMemberModifier )
            {
            // InternalModelEditorParser.g:2584:2: ( ruleMemberModifier )
            // InternalModelEditorParser.g:2585:3: ruleMemberModifier
            {
             before(grammarAccess.getMethodAccess().getModifierMemberModifierParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleMemberModifier();

            state._fsp--;

             after(grammarAccess.getMethodAccess().getModifierMemberModifierParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Method__ModifierAssignment_0"


    // $ANTLR start "rule__Method__NameAssignment_1"
    // InternalModelEditorParser.g:2594:1: rule__Method__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Method__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:2598:1: ( ( RULE_ID ) )
            // InternalModelEditorParser.g:2599:2: ( RULE_ID )
            {
            // InternalModelEditorParser.g:2599:2: ( RULE_ID )
            // InternalModelEditorParser.g:2600:3: RULE_ID
            {
             before(grammarAccess.getMethodAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMethodAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Method__NameAssignment_1"


    // $ANTLR start "rule__Method__TypesAssignment_3_0"
    // InternalModelEditorParser.g:2609:1: rule__Method__TypesAssignment_3_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Method__TypesAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:2613:1: ( ( ( ruleQualifiedName ) ) )
            // InternalModelEditorParser.g:2614:2: ( ( ruleQualifiedName ) )
            {
            // InternalModelEditorParser.g:2614:2: ( ( ruleQualifiedName ) )
            // InternalModelEditorParser.g:2615:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getMethodAccess().getTypesClassCrossReference_3_0_0()); 
            // InternalModelEditorParser.g:2616:3: ( ruleQualifiedName )
            // InternalModelEditorParser.g:2617:4: ruleQualifiedName
            {
             before(grammarAccess.getMethodAccess().getTypesClassQualifiedNameParserRuleCall_3_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getMethodAccess().getTypesClassQualifiedNameParserRuleCall_3_0_0_1()); 

            }

             after(grammarAccess.getMethodAccess().getTypesClassCrossReference_3_0_0()); 

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
    // $ANTLR end "rule__Method__TypesAssignment_3_0"


    // $ANTLR start "rule__Method__TypesAssignment_3_1_1"
    // InternalModelEditorParser.g:2628:1: rule__Method__TypesAssignment_3_1_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Method__TypesAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:2632:1: ( ( ( ruleQualifiedName ) ) )
            // InternalModelEditorParser.g:2633:2: ( ( ruleQualifiedName ) )
            {
            // InternalModelEditorParser.g:2633:2: ( ( ruleQualifiedName ) )
            // InternalModelEditorParser.g:2634:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getMethodAccess().getTypesClassCrossReference_3_1_1_0()); 
            // InternalModelEditorParser.g:2635:3: ( ruleQualifiedName )
            // InternalModelEditorParser.g:2636:4: ruleQualifiedName
            {
             before(grammarAccess.getMethodAccess().getTypesClassQualifiedNameParserRuleCall_3_1_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getMethodAccess().getTypesClassQualifiedNameParserRuleCall_3_1_1_0_1()); 

            }

             after(grammarAccess.getMethodAccess().getTypesClassCrossReference_3_1_1_0()); 

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
    // $ANTLR end "rule__Method__TypesAssignment_3_1_1"


    // $ANTLR start "rule__Method__TypeAssignment_5_1"
    // InternalModelEditorParser.g:2647:1: rule__Method__TypeAssignment_5_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Method__TypeAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:2651:1: ( ( ( ruleQualifiedName ) ) )
            // InternalModelEditorParser.g:2652:2: ( ( ruleQualifiedName ) )
            {
            // InternalModelEditorParser.g:2652:2: ( ( ruleQualifiedName ) )
            // InternalModelEditorParser.g:2653:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getMethodAccess().getTypeClassCrossReference_5_1_0()); 
            // InternalModelEditorParser.g:2654:3: ( ruleQualifiedName )
            // InternalModelEditorParser.g:2655:4: ruleQualifiedName
            {
             before(grammarAccess.getMethodAccess().getTypeClassQualifiedNameParserRuleCall_5_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getMethodAccess().getTypeClassQualifiedNameParserRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getMethodAccess().getTypeClassCrossReference_5_1_0()); 

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
    // $ANTLR end "rule__Method__TypeAssignment_5_1"


    // $ANTLR start "rule__Method__LocAssignment_6_1_0"
    // InternalModelEditorParser.g:2666:1: rule__Method__LocAssignment_6_1_0 : ( RULE_INT ) ;
    public final void rule__Method__LocAssignment_6_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:2670:1: ( ( RULE_INT ) )
            // InternalModelEditorParser.g:2671:2: ( RULE_INT )
            {
            // InternalModelEditorParser.g:2671:2: ( RULE_INT )
            // InternalModelEditorParser.g:2672:3: RULE_INT
            {
             before(grammarAccess.getMethodAccess().getLocINTTerminalRuleCall_6_1_0_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getMethodAccess().getLocINTTerminalRuleCall_6_1_0_0()); 

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
    // $ANTLR end "rule__Method__LocAssignment_6_1_0"


    // $ANTLR start "rule__Method__CycloAssignment_6_2_0"
    // InternalModelEditorParser.g:2681:1: rule__Method__CycloAssignment_6_2_0 : ( RULE_INT ) ;
    public final void rule__Method__CycloAssignment_6_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:2685:1: ( ( RULE_INT ) )
            // InternalModelEditorParser.g:2686:2: ( RULE_INT )
            {
            // InternalModelEditorParser.g:2686:2: ( RULE_INT )
            // InternalModelEditorParser.g:2687:3: RULE_INT
            {
             before(grammarAccess.getMethodAccess().getCycloINTTerminalRuleCall_6_2_0_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getMethodAccess().getCycloINTTerminalRuleCall_6_2_0_0()); 

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
    // $ANTLR end "rule__Method__CycloAssignment_6_2_0"


    // $ANTLR start "rule__Method__AccessesAssignment_6_3"
    // InternalModelEditorParser.g:2696:1: rule__Method__AccessesAssignment_6_3 : ( ruleAccess ) ;
    public final void rule__Method__AccessesAssignment_6_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:2700:1: ( ( ruleAccess ) )
            // InternalModelEditorParser.g:2701:2: ( ruleAccess )
            {
            // InternalModelEditorParser.g:2701:2: ( ruleAccess )
            // InternalModelEditorParser.g:2702:3: ruleAccess
            {
             before(grammarAccess.getMethodAccess().getAccessesAccessParserRuleCall_6_3_0()); 
            pushFollow(FOLLOW_2);
            ruleAccess();

            state._fsp--;

             after(grammarAccess.getMethodAccess().getAccessesAccessParserRuleCall_6_3_0()); 

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
    // $ANTLR end "rule__Method__AccessesAssignment_6_3"


    // $ANTLR start "rule__Method__CallsAssignment_6_4"
    // InternalModelEditorParser.g:2711:1: rule__Method__CallsAssignment_6_4 : ( ruleCall ) ;
    public final void rule__Method__CallsAssignment_6_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:2715:1: ( ( ruleCall ) )
            // InternalModelEditorParser.g:2716:2: ( ruleCall )
            {
            // InternalModelEditorParser.g:2716:2: ( ruleCall )
            // InternalModelEditorParser.g:2717:3: ruleCall
            {
             before(grammarAccess.getMethodAccess().getCallsCallParserRuleCall_6_4_0()); 
            pushFollow(FOLLOW_2);
            ruleCall();

            state._fsp--;

             after(grammarAccess.getMethodAccess().getCallsCallParserRuleCall_6_4_0()); 

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
    // $ANTLR end "rule__Method__CallsAssignment_6_4"


    // $ANTLR start "rule__Access__AccessesAssignment_0"
    // InternalModelEditorParser.g:2726:1: rule__Access__AccessesAssignment_0 : ( RULE_INT ) ;
    public final void rule__Access__AccessesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:2730:1: ( ( RULE_INT ) )
            // InternalModelEditorParser.g:2731:2: ( RULE_INT )
            {
            // InternalModelEditorParser.g:2731:2: ( RULE_INT )
            // InternalModelEditorParser.g:2732:3: RULE_INT
            {
             before(grammarAccess.getAccessAccess().getAccessesINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getAccessAccess().getAccessesINTTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Access__AccessesAssignment_0"


    // $ANTLR start "rule__Access__FieldAssignment_3"
    // InternalModelEditorParser.g:2741:1: rule__Access__FieldAssignment_3 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Access__FieldAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:2745:1: ( ( ( ruleQualifiedName ) ) )
            // InternalModelEditorParser.g:2746:2: ( ( ruleQualifiedName ) )
            {
            // InternalModelEditorParser.g:2746:2: ( ( ruleQualifiedName ) )
            // InternalModelEditorParser.g:2747:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getAccessAccess().getFieldFieldCrossReference_3_0()); 
            // InternalModelEditorParser.g:2748:3: ( ruleQualifiedName )
            // InternalModelEditorParser.g:2749:4: ruleQualifiedName
            {
             before(grammarAccess.getAccessAccess().getFieldFieldQualifiedNameParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getAccessAccess().getFieldFieldQualifiedNameParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getAccessAccess().getFieldFieldCrossReference_3_0()); 

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
    // $ANTLR end "rule__Access__FieldAssignment_3"


    // $ANTLR start "rule__Call__CallsAssignment_0"
    // InternalModelEditorParser.g:2760:1: rule__Call__CallsAssignment_0 : ( RULE_INT ) ;
    public final void rule__Call__CallsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:2764:1: ( ( RULE_INT ) )
            // InternalModelEditorParser.g:2765:2: ( RULE_INT )
            {
            // InternalModelEditorParser.g:2765:2: ( RULE_INT )
            // InternalModelEditorParser.g:2766:3: RULE_INT
            {
             before(grammarAccess.getCallAccess().getCallsINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getCallAccess().getCallsINTTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Call__CallsAssignment_0"


    // $ANTLR start "rule__Call__MethodAssignment_3"
    // InternalModelEditorParser.g:2775:1: rule__Call__MethodAssignment_3 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Call__MethodAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:2779:1: ( ( ( ruleQualifiedName ) ) )
            // InternalModelEditorParser.g:2780:2: ( ( ruleQualifiedName ) )
            {
            // InternalModelEditorParser.g:2780:2: ( ( ruleQualifiedName ) )
            // InternalModelEditorParser.g:2781:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getCallAccess().getMethodMethodCrossReference_3_0()); 
            // InternalModelEditorParser.g:2782:3: ( ruleQualifiedName )
            // InternalModelEditorParser.g:2783:4: ruleQualifiedName
            {
             before(grammarAccess.getCallAccess().getMethodMethodQualifiedNameParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getCallAccess().getMethodMethodQualifiedNameParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getCallAccess().getMethodMethodCrossReference_3_0()); 

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
    // $ANTLR end "rule__Call__MethodAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000005280L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000005282L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000A0000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000082000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000082000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000008000110L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000300012A0L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000000200012A2L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000000200012A0L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00000000A0800000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000050000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000440L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000800000L});

}