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


    // $ANTLR start "entryRuleField"
    // InternalModelEditorParser.g:203:1: entryRuleField : ruleField EOF ;
    public final void entryRuleField() throws RecognitionException {
        try {
            // InternalModelEditorParser.g:204:1: ( ruleField EOF )
            // InternalModelEditorParser.g:205:1: ruleField EOF
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
    // InternalModelEditorParser.g:212:1: ruleField : ( ( rule__Field__Group__0 ) ) ;
    public final void ruleField() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:216:2: ( ( ( rule__Field__Group__0 ) ) )
            // InternalModelEditorParser.g:217:2: ( ( rule__Field__Group__0 ) )
            {
            // InternalModelEditorParser.g:217:2: ( ( rule__Field__Group__0 ) )
            // InternalModelEditorParser.g:218:3: ( rule__Field__Group__0 )
            {
             before(grammarAccess.getFieldAccess().getGroup()); 
            // InternalModelEditorParser.g:219:3: ( rule__Field__Group__0 )
            // InternalModelEditorParser.g:219:4: rule__Field__Group__0
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
    // InternalModelEditorParser.g:228:1: entryRuleMethod : ruleMethod EOF ;
    public final void entryRuleMethod() throws RecognitionException {
        try {
            // InternalModelEditorParser.g:229:1: ( ruleMethod EOF )
            // InternalModelEditorParser.g:230:1: ruleMethod EOF
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
    // InternalModelEditorParser.g:237:1: ruleMethod : ( ( rule__Method__Group__0 ) ) ;
    public final void ruleMethod() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:241:2: ( ( ( rule__Method__Group__0 ) ) )
            // InternalModelEditorParser.g:242:2: ( ( rule__Method__Group__0 ) )
            {
            // InternalModelEditorParser.g:242:2: ( ( rule__Method__Group__0 ) )
            // InternalModelEditorParser.g:243:3: ( rule__Method__Group__0 )
            {
             before(grammarAccess.getMethodAccess().getGroup()); 
            // InternalModelEditorParser.g:244:3: ( rule__Method__Group__0 )
            // InternalModelEditorParser.g:244:4: rule__Method__Group__0
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
    // InternalModelEditorParser.g:253:1: entryRuleMemberModifier : ruleMemberModifier EOF ;
    public final void entryRuleMemberModifier() throws RecognitionException {
        try {
            // InternalModelEditorParser.g:254:1: ( ruleMemberModifier EOF )
            // InternalModelEditorParser.g:255:1: ruleMemberModifier EOF
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
    // InternalModelEditorParser.g:262:1: ruleMemberModifier : ( ( rule__MemberModifier__Alternatives ) ) ;
    public final void ruleMemberModifier() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:266:2: ( ( ( rule__MemberModifier__Alternatives ) ) )
            // InternalModelEditorParser.g:267:2: ( ( rule__MemberModifier__Alternatives ) )
            {
            // InternalModelEditorParser.g:267:2: ( ( rule__MemberModifier__Alternatives ) )
            // InternalModelEditorParser.g:268:3: ( rule__MemberModifier__Alternatives )
            {
             before(grammarAccess.getMemberModifierAccess().getAlternatives()); 
            // InternalModelEditorParser.g:269:3: ( rule__MemberModifier__Alternatives )
            // InternalModelEditorParser.g:269:4: rule__MemberModifier__Alternatives
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
    // InternalModelEditorParser.g:278:1: entryRuleClassModifier : ruleClassModifier EOF ;
    public final void entryRuleClassModifier() throws RecognitionException {
        try {
            // InternalModelEditorParser.g:279:1: ( ruleClassModifier EOF )
            // InternalModelEditorParser.g:280:1: ruleClassModifier EOF
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
    // InternalModelEditorParser.g:287:1: ruleClassModifier : ( ( rule__ClassModifier__Alternatives ) ) ;
    public final void ruleClassModifier() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:291:2: ( ( ( rule__ClassModifier__Alternatives ) ) )
            // InternalModelEditorParser.g:292:2: ( ( rule__ClassModifier__Alternatives ) )
            {
            // InternalModelEditorParser.g:292:2: ( ( rule__ClassModifier__Alternatives ) )
            // InternalModelEditorParser.g:293:3: ( rule__ClassModifier__Alternatives )
            {
             before(grammarAccess.getClassModifierAccess().getAlternatives()); 
            // InternalModelEditorParser.g:294:3: ( rule__ClassModifier__Alternatives )
            // InternalModelEditorParser.g:294:4: rule__ClassModifier__Alternatives
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
    // InternalModelEditorParser.g:303:1: entryRuleAccess : ruleAccess EOF ;
    public final void entryRuleAccess() throws RecognitionException {
        try {
            // InternalModelEditorParser.g:304:1: ( ruleAccess EOF )
            // InternalModelEditorParser.g:305:1: ruleAccess EOF
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
    // InternalModelEditorParser.g:312:1: ruleAccess : ( ( rule__Access__Group__0 ) ) ;
    public final void ruleAccess() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:316:2: ( ( ( rule__Access__Group__0 ) ) )
            // InternalModelEditorParser.g:317:2: ( ( rule__Access__Group__0 ) )
            {
            // InternalModelEditorParser.g:317:2: ( ( rule__Access__Group__0 ) )
            // InternalModelEditorParser.g:318:3: ( rule__Access__Group__0 )
            {
             before(grammarAccess.getAccessAccess().getGroup()); 
            // InternalModelEditorParser.g:319:3: ( rule__Access__Group__0 )
            // InternalModelEditorParser.g:319:4: rule__Access__Group__0
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
    // InternalModelEditorParser.g:328:1: entryRuleCall : ruleCall EOF ;
    public final void entryRuleCall() throws RecognitionException {
        try {
            // InternalModelEditorParser.g:329:1: ( ruleCall EOF )
            // InternalModelEditorParser.g:330:1: ruleCall EOF
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
    // InternalModelEditorParser.g:337:1: ruleCall : ( ( rule__Call__Group__0 ) ) ;
    public final void ruleCall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:341:2: ( ( ( rule__Call__Group__0 ) ) )
            // InternalModelEditorParser.g:342:2: ( ( rule__Call__Group__0 ) )
            {
            // InternalModelEditorParser.g:342:2: ( ( rule__Call__Group__0 ) )
            // InternalModelEditorParser.g:343:3: ( rule__Call__Group__0 )
            {
             before(grammarAccess.getCallAccess().getGroup()); 
            // InternalModelEditorParser.g:344:3: ( rule__Call__Group__0 )
            // InternalModelEditorParser.g:344:4: rule__Call__Group__0
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
    // InternalModelEditorParser.g:352:1: rule__QualifiedName__Alternatives_0 : ( ( RULE_ID ) | ( RULE_STRING ) );
    public final void rule__QualifiedName__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:356:1: ( ( RULE_ID ) | ( RULE_STRING ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_STRING) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalModelEditorParser.g:357:2: ( RULE_ID )
                    {
                    // InternalModelEditorParser.g:357:2: ( RULE_ID )
                    // InternalModelEditorParser.g:358:3: RULE_ID
                    {
                     before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalModelEditorParser.g:363:2: ( RULE_STRING )
                    {
                    // InternalModelEditorParser.g:363:2: ( RULE_STRING )
                    // InternalModelEditorParser.g:364:3: RULE_STRING
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
    // InternalModelEditorParser.g:373:1: rule__QualifiedName__Alternatives_1 : ( ( ( rule__QualifiedName__Group_1_0__0 ) ) | ( RULE_STRING ) );
    public final void rule__QualifiedName__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:377:1: ( ( ( rule__QualifiedName__Group_1_0__0 ) ) | ( RULE_STRING ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==FullStop) ) {
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
                    // InternalModelEditorParser.g:378:2: ( ( rule__QualifiedName__Group_1_0__0 ) )
                    {
                    // InternalModelEditorParser.g:378:2: ( ( rule__QualifiedName__Group_1_0__0 ) )
                    // InternalModelEditorParser.g:379:3: ( rule__QualifiedName__Group_1_0__0 )
                    {
                     before(grammarAccess.getQualifiedNameAccess().getGroup_1_0()); 
                    // InternalModelEditorParser.g:380:3: ( rule__QualifiedName__Group_1_0__0 )
                    // InternalModelEditorParser.g:380:4: rule__QualifiedName__Group_1_0__0
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
                    // InternalModelEditorParser.g:384:2: ( RULE_STRING )
                    {
                    // InternalModelEditorParser.g:384:2: ( RULE_STRING )
                    // InternalModelEditorParser.g:385:3: RULE_STRING
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
    // InternalModelEditorParser.g:394:1: rule__MemberModifier__Alternatives : ( ( Public ) | ( Private ) | ( Protected ) | ( Constant ) );
    public final void rule__MemberModifier__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:398:1: ( ( Public ) | ( Private ) | ( Protected ) | ( Constant ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case Public:
                {
                alt3=1;
                }
                break;
            case Private:
                {
                alt3=2;
                }
                break;
            case Protected:
                {
                alt3=3;
                }
                break;
            case Constant:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalModelEditorParser.g:399:2: ( Public )
                    {
                    // InternalModelEditorParser.g:399:2: ( Public )
                    // InternalModelEditorParser.g:400:3: Public
                    {
                     before(grammarAccess.getMemberModifierAccess().getPublicKeyword_0()); 
                    match(input,Public,FOLLOW_2); 
                     after(grammarAccess.getMemberModifierAccess().getPublicKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalModelEditorParser.g:405:2: ( Private )
                    {
                    // InternalModelEditorParser.g:405:2: ( Private )
                    // InternalModelEditorParser.g:406:3: Private
                    {
                     before(grammarAccess.getMemberModifierAccess().getPrivateKeyword_1()); 
                    match(input,Private,FOLLOW_2); 
                     after(grammarAccess.getMemberModifierAccess().getPrivateKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalModelEditorParser.g:411:2: ( Protected )
                    {
                    // InternalModelEditorParser.g:411:2: ( Protected )
                    // InternalModelEditorParser.g:412:3: Protected
                    {
                     before(grammarAccess.getMemberModifierAccess().getProtectedKeyword_2()); 
                    match(input,Protected,FOLLOW_2); 
                     after(grammarAccess.getMemberModifierAccess().getProtectedKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalModelEditorParser.g:417:2: ( Constant )
                    {
                    // InternalModelEditorParser.g:417:2: ( Constant )
                    // InternalModelEditorParser.g:418:3: Constant
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
    // InternalModelEditorParser.g:427:1: rule__ClassModifier__Alternatives : ( ( Public ) | ( Private ) | ( Constant ) );
    public final void rule__ClassModifier__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:431:1: ( ( Public ) | ( Private ) | ( Constant ) )
            int alt4=3;
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
            case Constant:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalModelEditorParser.g:432:2: ( Public )
                    {
                    // InternalModelEditorParser.g:432:2: ( Public )
                    // InternalModelEditorParser.g:433:3: Public
                    {
                     before(grammarAccess.getClassModifierAccess().getPublicKeyword_0()); 
                    match(input,Public,FOLLOW_2); 
                     after(grammarAccess.getClassModifierAccess().getPublicKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalModelEditorParser.g:438:2: ( Private )
                    {
                    // InternalModelEditorParser.g:438:2: ( Private )
                    // InternalModelEditorParser.g:439:3: Private
                    {
                     before(grammarAccess.getClassModifierAccess().getPrivateKeyword_1()); 
                    match(input,Private,FOLLOW_2); 
                     after(grammarAccess.getClassModifierAccess().getPrivateKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalModelEditorParser.g:444:2: ( Constant )
                    {
                    // InternalModelEditorParser.g:444:2: ( Constant )
                    // InternalModelEditorParser.g:445:3: Constant
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
    // InternalModelEditorParser.g:454:1: rule__Access__Alternatives_1 : ( ( Access ) | ( Accesses ) );
    public final void rule__Access__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:458:1: ( ( Access ) | ( Accesses ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==Access) ) {
                alt5=1;
            }
            else if ( (LA5_0==Accesses) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalModelEditorParser.g:459:2: ( Access )
                    {
                    // InternalModelEditorParser.g:459:2: ( Access )
                    // InternalModelEditorParser.g:460:3: Access
                    {
                     before(grammarAccess.getAccessAccess().getAccessKeyword_1_0()); 
                    match(input,Access,FOLLOW_2); 
                     after(grammarAccess.getAccessAccess().getAccessKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalModelEditorParser.g:465:2: ( Accesses )
                    {
                    // InternalModelEditorParser.g:465:2: ( Accesses )
                    // InternalModelEditorParser.g:466:3: Accesses
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
    // InternalModelEditorParser.g:475:1: rule__Call__Alternatives_1 : ( ( Call ) | ( Calls ) );
    public final void rule__Call__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:479:1: ( ( Call ) | ( Calls ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==Call) ) {
                alt6=1;
            }
            else if ( (LA6_0==Calls) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalModelEditorParser.g:480:2: ( Call )
                    {
                    // InternalModelEditorParser.g:480:2: ( Call )
                    // InternalModelEditorParser.g:481:3: Call
                    {
                     before(grammarAccess.getCallAccess().getCallKeyword_1_0()); 
                    match(input,Call,FOLLOW_2); 
                     after(grammarAccess.getCallAccess().getCallKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalModelEditorParser.g:486:2: ( Calls )
                    {
                    // InternalModelEditorParser.g:486:2: ( Calls )
                    // InternalModelEditorParser.g:487:3: Calls
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
    // InternalModelEditorParser.g:496:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:500:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalModelEditorParser.g:501:2: rule__Model__Group__0__Impl rule__Model__Group__1
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
    // InternalModelEditorParser.g:508:1: rule__Model__Group__0__Impl : ( ( rule__Model__ImportsAssignment_0 )* ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:512:1: ( ( ( rule__Model__ImportsAssignment_0 )* ) )
            // InternalModelEditorParser.g:513:1: ( ( rule__Model__ImportsAssignment_0 )* )
            {
            // InternalModelEditorParser.g:513:1: ( ( rule__Model__ImportsAssignment_0 )* )
            // InternalModelEditorParser.g:514:2: ( rule__Model__ImportsAssignment_0 )*
            {
             before(grammarAccess.getModelAccess().getImportsAssignment_0()); 
            // InternalModelEditorParser.g:515:2: ( rule__Model__ImportsAssignment_0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==Import) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalModelEditorParser.g:515:3: rule__Model__ImportsAssignment_0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Model__ImportsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // InternalModelEditorParser.g:523:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:527:1: ( rule__Model__Group__1__Impl )
            // InternalModelEditorParser.g:528:2: rule__Model__Group__1__Impl
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
    // InternalModelEditorParser.g:534:1: rule__Model__Group__1__Impl : ( ( rule__Model__ClassesAssignment_1 )* ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:538:1: ( ( ( rule__Model__ClassesAssignment_1 )* ) )
            // InternalModelEditorParser.g:539:1: ( ( rule__Model__ClassesAssignment_1 )* )
            {
            // InternalModelEditorParser.g:539:1: ( ( rule__Model__ClassesAssignment_1 )* )
            // InternalModelEditorParser.g:540:2: ( rule__Model__ClassesAssignment_1 )*
            {
             before(grammarAccess.getModelAccess().getClassesAssignment_1()); 
            // InternalModelEditorParser.g:541:2: ( rule__Model__ClassesAssignment_1 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==Constant||LA8_0==Private||LA8_0==Public||LA8_0==Class) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalModelEditorParser.g:541:3: rule__Model__ClassesAssignment_1
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Model__ClassesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // InternalModelEditorParser.g:550:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:554:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalModelEditorParser.g:555:2: rule__Import__Group__0__Impl rule__Import__Group__1
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
    // InternalModelEditorParser.g:562:1: rule__Import__Group__0__Impl : ( Import ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:566:1: ( ( Import ) )
            // InternalModelEditorParser.g:567:1: ( Import )
            {
            // InternalModelEditorParser.g:567:1: ( Import )
            // InternalModelEditorParser.g:568:2: Import
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
    // InternalModelEditorParser.g:577:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:581:1: ( rule__Import__Group__1__Impl )
            // InternalModelEditorParser.g:582:2: rule__Import__Group__1__Impl
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
    // InternalModelEditorParser.g:588:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:592:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // InternalModelEditorParser.g:593:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // InternalModelEditorParser.g:593:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // InternalModelEditorParser.g:594:2: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            // InternalModelEditorParser.g:595:2: ( rule__Import__ImportedNamespaceAssignment_1 )
            // InternalModelEditorParser.g:595:3: rule__Import__ImportedNamespaceAssignment_1
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
    // InternalModelEditorParser.g:604:1: rule__QualifiedNameWithWildcard__Group__0 : rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 ;
    public final void rule__QualifiedNameWithWildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:608:1: ( rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 )
            // InternalModelEditorParser.g:609:2: rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1
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
    // InternalModelEditorParser.g:616:1: rule__QualifiedNameWithWildcard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:620:1: ( ( ruleQualifiedName ) )
            // InternalModelEditorParser.g:621:1: ( ruleQualifiedName )
            {
            // InternalModelEditorParser.g:621:1: ( ruleQualifiedName )
            // InternalModelEditorParser.g:622:2: ruleQualifiedName
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
    // InternalModelEditorParser.g:631:1: rule__QualifiedNameWithWildcard__Group__1 : rule__QualifiedNameWithWildcard__Group__1__Impl ;
    public final void rule__QualifiedNameWithWildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:635:1: ( rule__QualifiedNameWithWildcard__Group__1__Impl )
            // InternalModelEditorParser.g:636:2: rule__QualifiedNameWithWildcard__Group__1__Impl
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
    // InternalModelEditorParser.g:642:1: rule__QualifiedNameWithWildcard__Group__1__Impl : ( ( FullStopAsterisk )? ) ;
    public final void rule__QualifiedNameWithWildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:646:1: ( ( ( FullStopAsterisk )? ) )
            // InternalModelEditorParser.g:647:1: ( ( FullStopAsterisk )? )
            {
            // InternalModelEditorParser.g:647:1: ( ( FullStopAsterisk )? )
            // InternalModelEditorParser.g:648:2: ( FullStopAsterisk )?
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
            // InternalModelEditorParser.g:649:2: ( FullStopAsterisk )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==FullStopAsterisk) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalModelEditorParser.g:649:3: FullStopAsterisk
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
    // InternalModelEditorParser.g:658:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:662:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalModelEditorParser.g:663:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
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
    // InternalModelEditorParser.g:670:1: rule__QualifiedName__Group__0__Impl : ( ( rule__QualifiedName__Alternatives_0 ) ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:674:1: ( ( ( rule__QualifiedName__Alternatives_0 ) ) )
            // InternalModelEditorParser.g:675:1: ( ( rule__QualifiedName__Alternatives_0 ) )
            {
            // InternalModelEditorParser.g:675:1: ( ( rule__QualifiedName__Alternatives_0 ) )
            // InternalModelEditorParser.g:676:2: ( rule__QualifiedName__Alternatives_0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getAlternatives_0()); 
            // InternalModelEditorParser.g:677:2: ( rule__QualifiedName__Alternatives_0 )
            // InternalModelEditorParser.g:677:3: rule__QualifiedName__Alternatives_0
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
    // InternalModelEditorParser.g:685:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:689:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalModelEditorParser.g:690:2: rule__QualifiedName__Group__1__Impl
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
    // InternalModelEditorParser.g:696:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Alternatives_1 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:700:1: ( ( ( rule__QualifiedName__Alternatives_1 )* ) )
            // InternalModelEditorParser.g:701:1: ( ( rule__QualifiedName__Alternatives_1 )* )
            {
            // InternalModelEditorParser.g:701:1: ( ( rule__QualifiedName__Alternatives_1 )* )
            // InternalModelEditorParser.g:702:2: ( rule__QualifiedName__Alternatives_1 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getAlternatives_1()); 
            // InternalModelEditorParser.g:703:2: ( rule__QualifiedName__Alternatives_1 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==FullStop||LA10_0==RULE_STRING) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalModelEditorParser.g:703:3: rule__QualifiedName__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__QualifiedName__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // InternalModelEditorParser.g:712:1: rule__QualifiedName__Group_1_0__0 : rule__QualifiedName__Group_1_0__0__Impl rule__QualifiedName__Group_1_0__1 ;
    public final void rule__QualifiedName__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:716:1: ( rule__QualifiedName__Group_1_0__0__Impl rule__QualifiedName__Group_1_0__1 )
            // InternalModelEditorParser.g:717:2: rule__QualifiedName__Group_1_0__0__Impl rule__QualifiedName__Group_1_0__1
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
    // InternalModelEditorParser.g:724:1: rule__QualifiedName__Group_1_0__0__Impl : ( FullStop ) ;
    public final void rule__QualifiedName__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:728:1: ( ( FullStop ) )
            // InternalModelEditorParser.g:729:1: ( FullStop )
            {
            // InternalModelEditorParser.g:729:1: ( FullStop )
            // InternalModelEditorParser.g:730:2: FullStop
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
    // InternalModelEditorParser.g:739:1: rule__QualifiedName__Group_1_0__1 : rule__QualifiedName__Group_1_0__1__Impl ;
    public final void rule__QualifiedName__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:743:1: ( rule__QualifiedName__Group_1_0__1__Impl )
            // InternalModelEditorParser.g:744:2: rule__QualifiedName__Group_1_0__1__Impl
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
    // InternalModelEditorParser.g:750:1: rule__QualifiedName__Group_1_0__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:754:1: ( ( RULE_ID ) )
            // InternalModelEditorParser.g:755:1: ( RULE_ID )
            {
            // InternalModelEditorParser.g:755:1: ( RULE_ID )
            // InternalModelEditorParser.g:756:2: RULE_ID
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
    // InternalModelEditorParser.g:766:1: rule__Class__Group__0 : rule__Class__Group__0__Impl rule__Class__Group__1 ;
    public final void rule__Class__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:770:1: ( rule__Class__Group__0__Impl rule__Class__Group__1 )
            // InternalModelEditorParser.g:771:2: rule__Class__Group__0__Impl rule__Class__Group__1
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
    // InternalModelEditorParser.g:778:1: rule__Class__Group__0__Impl : ( ( rule__Class__ModifierAssignment_0 )? ) ;
    public final void rule__Class__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:782:1: ( ( ( rule__Class__ModifierAssignment_0 )? ) )
            // InternalModelEditorParser.g:783:1: ( ( rule__Class__ModifierAssignment_0 )? )
            {
            // InternalModelEditorParser.g:783:1: ( ( rule__Class__ModifierAssignment_0 )? )
            // InternalModelEditorParser.g:784:2: ( rule__Class__ModifierAssignment_0 )?
            {
             before(grammarAccess.getClassAccess().getModifierAssignment_0()); 
            // InternalModelEditorParser.g:785:2: ( rule__Class__ModifierAssignment_0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==Constant||LA11_0==Private||LA11_0==Public) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalModelEditorParser.g:785:3: rule__Class__ModifierAssignment_0
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
    // InternalModelEditorParser.g:793:1: rule__Class__Group__1 : rule__Class__Group__1__Impl rule__Class__Group__2 ;
    public final void rule__Class__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:797:1: ( rule__Class__Group__1__Impl rule__Class__Group__2 )
            // InternalModelEditorParser.g:798:2: rule__Class__Group__1__Impl rule__Class__Group__2
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
    // InternalModelEditorParser.g:805:1: rule__Class__Group__1__Impl : ( Class ) ;
    public final void rule__Class__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:809:1: ( ( Class ) )
            // InternalModelEditorParser.g:810:1: ( Class )
            {
            // InternalModelEditorParser.g:810:1: ( Class )
            // InternalModelEditorParser.g:811:2: Class
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
    // InternalModelEditorParser.g:820:1: rule__Class__Group__2 : rule__Class__Group__2__Impl rule__Class__Group__3 ;
    public final void rule__Class__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:824:1: ( rule__Class__Group__2__Impl rule__Class__Group__3 )
            // InternalModelEditorParser.g:825:2: rule__Class__Group__2__Impl rule__Class__Group__3
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
    // InternalModelEditorParser.g:832:1: rule__Class__Group__2__Impl : ( ( rule__Class__NameAssignment_2 ) ) ;
    public final void rule__Class__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:836:1: ( ( ( rule__Class__NameAssignment_2 ) ) )
            // InternalModelEditorParser.g:837:1: ( ( rule__Class__NameAssignment_2 ) )
            {
            // InternalModelEditorParser.g:837:1: ( ( rule__Class__NameAssignment_2 ) )
            // InternalModelEditorParser.g:838:2: ( rule__Class__NameAssignment_2 )
            {
             before(grammarAccess.getClassAccess().getNameAssignment_2()); 
            // InternalModelEditorParser.g:839:2: ( rule__Class__NameAssignment_2 )
            // InternalModelEditorParser.g:839:3: rule__Class__NameAssignment_2
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
    // InternalModelEditorParser.g:847:1: rule__Class__Group__3 : rule__Class__Group__3__Impl rule__Class__Group__4 ;
    public final void rule__Class__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:851:1: ( rule__Class__Group__3__Impl rule__Class__Group__4 )
            // InternalModelEditorParser.g:852:2: rule__Class__Group__3__Impl rule__Class__Group__4
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
    // InternalModelEditorParser.g:859:1: rule__Class__Group__3__Impl : ( ( rule__Class__Group_3__0 )? ) ;
    public final void rule__Class__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:863:1: ( ( ( rule__Class__Group_3__0 )? ) )
            // InternalModelEditorParser.g:864:1: ( ( rule__Class__Group_3__0 )? )
            {
            // InternalModelEditorParser.g:864:1: ( ( rule__Class__Group_3__0 )? )
            // InternalModelEditorParser.g:865:2: ( rule__Class__Group_3__0 )?
            {
             before(grammarAccess.getClassAccess().getGroup_3()); 
            // InternalModelEditorParser.g:866:2: ( rule__Class__Group_3__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==Extends) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalModelEditorParser.g:866:3: rule__Class__Group_3__0
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
    // InternalModelEditorParser.g:874:1: rule__Class__Group__4 : rule__Class__Group__4__Impl rule__Class__Group__5 ;
    public final void rule__Class__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:878:1: ( rule__Class__Group__4__Impl rule__Class__Group__5 )
            // InternalModelEditorParser.g:879:2: rule__Class__Group__4__Impl rule__Class__Group__5
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
    // InternalModelEditorParser.g:886:1: rule__Class__Group__4__Impl : ( ( rule__Class__Group_4__0 )? ) ;
    public final void rule__Class__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:890:1: ( ( ( rule__Class__Group_4__0 )? ) )
            // InternalModelEditorParser.g:891:1: ( ( rule__Class__Group_4__0 )? )
            {
            // InternalModelEditorParser.g:891:1: ( ( rule__Class__Group_4__0 )? )
            // InternalModelEditorParser.g:892:2: ( rule__Class__Group_4__0 )?
            {
             before(grammarAccess.getClassAccess().getGroup_4()); 
            // InternalModelEditorParser.g:893:2: ( rule__Class__Group_4__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==Implements) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalModelEditorParser.g:893:3: rule__Class__Group_4__0
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
    // InternalModelEditorParser.g:901:1: rule__Class__Group__5 : rule__Class__Group__5__Impl ;
    public final void rule__Class__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:905:1: ( rule__Class__Group__5__Impl )
            // InternalModelEditorParser.g:906:2: rule__Class__Group__5__Impl
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
    // InternalModelEditorParser.g:912:1: rule__Class__Group__5__Impl : ( ( rule__Class__Group_5__0 )? ) ;
    public final void rule__Class__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:916:1: ( ( ( rule__Class__Group_5__0 )? ) )
            // InternalModelEditorParser.g:917:1: ( ( rule__Class__Group_5__0 )? )
            {
            // InternalModelEditorParser.g:917:1: ( ( rule__Class__Group_5__0 )? )
            // InternalModelEditorParser.g:918:2: ( rule__Class__Group_5__0 )?
            {
             before(grammarAccess.getClassAccess().getGroup_5()); 
            // InternalModelEditorParser.g:919:2: ( rule__Class__Group_5__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_BEGIN) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalModelEditorParser.g:919:3: rule__Class__Group_5__0
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
    // InternalModelEditorParser.g:928:1: rule__Class__Group_3__0 : rule__Class__Group_3__0__Impl rule__Class__Group_3__1 ;
    public final void rule__Class__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:932:1: ( rule__Class__Group_3__0__Impl rule__Class__Group_3__1 )
            // InternalModelEditorParser.g:933:2: rule__Class__Group_3__0__Impl rule__Class__Group_3__1
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
    // InternalModelEditorParser.g:940:1: rule__Class__Group_3__0__Impl : ( Extends ) ;
    public final void rule__Class__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:944:1: ( ( Extends ) )
            // InternalModelEditorParser.g:945:1: ( Extends )
            {
            // InternalModelEditorParser.g:945:1: ( Extends )
            // InternalModelEditorParser.g:946:2: Extends
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
    // InternalModelEditorParser.g:955:1: rule__Class__Group_3__1 : rule__Class__Group_3__1__Impl ;
    public final void rule__Class__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:959:1: ( rule__Class__Group_3__1__Impl )
            // InternalModelEditorParser.g:960:2: rule__Class__Group_3__1__Impl
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
    // InternalModelEditorParser.g:966:1: rule__Class__Group_3__1__Impl : ( ( rule__Class__SuperClassAssignment_3_1 ) ) ;
    public final void rule__Class__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:970:1: ( ( ( rule__Class__SuperClassAssignment_3_1 ) ) )
            // InternalModelEditorParser.g:971:1: ( ( rule__Class__SuperClassAssignment_3_1 ) )
            {
            // InternalModelEditorParser.g:971:1: ( ( rule__Class__SuperClassAssignment_3_1 ) )
            // InternalModelEditorParser.g:972:2: ( rule__Class__SuperClassAssignment_3_1 )
            {
             before(grammarAccess.getClassAccess().getSuperClassAssignment_3_1()); 
            // InternalModelEditorParser.g:973:2: ( rule__Class__SuperClassAssignment_3_1 )
            // InternalModelEditorParser.g:973:3: rule__Class__SuperClassAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Class__SuperClassAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getSuperClassAssignment_3_1()); 

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
    // InternalModelEditorParser.g:982:1: rule__Class__Group_4__0 : rule__Class__Group_4__0__Impl rule__Class__Group_4__1 ;
    public final void rule__Class__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:986:1: ( rule__Class__Group_4__0__Impl rule__Class__Group_4__1 )
            // InternalModelEditorParser.g:987:2: rule__Class__Group_4__0__Impl rule__Class__Group_4__1
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
    // InternalModelEditorParser.g:994:1: rule__Class__Group_4__0__Impl : ( Implements ) ;
    public final void rule__Class__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:998:1: ( ( Implements ) )
            // InternalModelEditorParser.g:999:1: ( Implements )
            {
            // InternalModelEditorParser.g:999:1: ( Implements )
            // InternalModelEditorParser.g:1000:2: Implements
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
    // InternalModelEditorParser.g:1009:1: rule__Class__Group_4__1 : rule__Class__Group_4__1__Impl ;
    public final void rule__Class__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1013:1: ( rule__Class__Group_4__1__Impl )
            // InternalModelEditorParser.g:1014:2: rule__Class__Group_4__1__Impl
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
    // InternalModelEditorParser.g:1020:1: rule__Class__Group_4__1__Impl : ( ( rule__Class__SuperTypesAssignment_4_1 )* ) ;
    public final void rule__Class__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1024:1: ( ( ( rule__Class__SuperTypesAssignment_4_1 )* ) )
            // InternalModelEditorParser.g:1025:1: ( ( rule__Class__SuperTypesAssignment_4_1 )* )
            {
            // InternalModelEditorParser.g:1025:1: ( ( rule__Class__SuperTypesAssignment_4_1 )* )
            // InternalModelEditorParser.g:1026:2: ( rule__Class__SuperTypesAssignment_4_1 )*
            {
             before(grammarAccess.getClassAccess().getSuperTypesAssignment_4_1()); 
            // InternalModelEditorParser.g:1027:2: ( rule__Class__SuperTypesAssignment_4_1 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID||LA15_0==RULE_STRING) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalModelEditorParser.g:1027:3: rule__Class__SuperTypesAssignment_4_1
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Class__SuperTypesAssignment_4_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getClassAccess().getSuperTypesAssignment_4_1()); 

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
    // InternalModelEditorParser.g:1036:1: rule__Class__Group_5__0 : rule__Class__Group_5__0__Impl rule__Class__Group_5__1 ;
    public final void rule__Class__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1040:1: ( rule__Class__Group_5__0__Impl rule__Class__Group_5__1 )
            // InternalModelEditorParser.g:1041:2: rule__Class__Group_5__0__Impl rule__Class__Group_5__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalModelEditorParser.g:1048:1: rule__Class__Group_5__0__Impl : ( RULE_BEGIN ) ;
    public final void rule__Class__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1052:1: ( ( RULE_BEGIN ) )
            // InternalModelEditorParser.g:1053:1: ( RULE_BEGIN )
            {
            // InternalModelEditorParser.g:1053:1: ( RULE_BEGIN )
            // InternalModelEditorParser.g:1054:2: RULE_BEGIN
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
    // InternalModelEditorParser.g:1063:1: rule__Class__Group_5__1 : rule__Class__Group_5__1__Impl rule__Class__Group_5__2 ;
    public final void rule__Class__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1067:1: ( rule__Class__Group_5__1__Impl rule__Class__Group_5__2 )
            // InternalModelEditorParser.g:1068:2: rule__Class__Group_5__1__Impl rule__Class__Group_5__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalModelEditorParser.g:1075:1: rule__Class__Group_5__1__Impl : ( ( rule__Class__FieldsAssignment_5_1 )* ) ;
    public final void rule__Class__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1079:1: ( ( ( rule__Class__FieldsAssignment_5_1 )* ) )
            // InternalModelEditorParser.g:1080:1: ( ( rule__Class__FieldsAssignment_5_1 )* )
            {
            // InternalModelEditorParser.g:1080:1: ( ( rule__Class__FieldsAssignment_5_1 )* )
            // InternalModelEditorParser.g:1081:2: ( rule__Class__FieldsAssignment_5_1 )*
            {
             before(grammarAccess.getClassAccess().getFieldsAssignment_5_1()); 
            // InternalModelEditorParser.g:1082:2: ( rule__Class__FieldsAssignment_5_1 )*
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
            	    // InternalModelEditorParser.g:1082:3: rule__Class__FieldsAssignment_5_1
            	    {
            	    pushFollow(FOLLOW_14);
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
    // InternalModelEditorParser.g:1090:1: rule__Class__Group_5__2 : rule__Class__Group_5__2__Impl rule__Class__Group_5__3 ;
    public final void rule__Class__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1094:1: ( rule__Class__Group_5__2__Impl rule__Class__Group_5__3 )
            // InternalModelEditorParser.g:1095:2: rule__Class__Group_5__2__Impl rule__Class__Group_5__3
            {
            pushFollow(FOLLOW_13);
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
    // InternalModelEditorParser.g:1102:1: rule__Class__Group_5__2__Impl : ( ( rule__Class__MethodsAssignment_5_2 )* ) ;
    public final void rule__Class__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1106:1: ( ( ( rule__Class__MethodsAssignment_5_2 )* ) )
            // InternalModelEditorParser.g:1107:1: ( ( rule__Class__MethodsAssignment_5_2 )* )
            {
            // InternalModelEditorParser.g:1107:1: ( ( rule__Class__MethodsAssignment_5_2 )* )
            // InternalModelEditorParser.g:1108:2: ( rule__Class__MethodsAssignment_5_2 )*
            {
             before(grammarAccess.getClassAccess().getMethodsAssignment_5_2()); 
            // InternalModelEditorParser.g:1109:2: ( rule__Class__MethodsAssignment_5_2 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==Protected||LA17_0==Constant||LA17_0==Private||LA17_0==Public||LA17_0==RULE_ID) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalModelEditorParser.g:1109:3: rule__Class__MethodsAssignment_5_2
            	    {
            	    pushFollow(FOLLOW_14);
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
    // InternalModelEditorParser.g:1117:1: rule__Class__Group_5__3 : rule__Class__Group_5__3__Impl ;
    public final void rule__Class__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1121:1: ( rule__Class__Group_5__3__Impl )
            // InternalModelEditorParser.g:1122:2: rule__Class__Group_5__3__Impl
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
    // InternalModelEditorParser.g:1128:1: rule__Class__Group_5__3__Impl : ( RULE_END ) ;
    public final void rule__Class__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1132:1: ( ( RULE_END ) )
            // InternalModelEditorParser.g:1133:1: ( RULE_END )
            {
            // InternalModelEditorParser.g:1133:1: ( RULE_END )
            // InternalModelEditorParser.g:1134:2: RULE_END
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


    // $ANTLR start "rule__Field__Group__0"
    // InternalModelEditorParser.g:1144:1: rule__Field__Group__0 : rule__Field__Group__0__Impl rule__Field__Group__1 ;
    public final void rule__Field__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1148:1: ( rule__Field__Group__0__Impl rule__Field__Group__1 )
            // InternalModelEditorParser.g:1149:2: rule__Field__Group__0__Impl rule__Field__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalModelEditorParser.g:1156:1: rule__Field__Group__0__Impl : ( ( rule__Field__ModifierAssignment_0 )? ) ;
    public final void rule__Field__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1160:1: ( ( ( rule__Field__ModifierAssignment_0 )? ) )
            // InternalModelEditorParser.g:1161:1: ( ( rule__Field__ModifierAssignment_0 )? )
            {
            // InternalModelEditorParser.g:1161:1: ( ( rule__Field__ModifierAssignment_0 )? )
            // InternalModelEditorParser.g:1162:2: ( rule__Field__ModifierAssignment_0 )?
            {
             before(grammarAccess.getFieldAccess().getModifierAssignment_0()); 
            // InternalModelEditorParser.g:1163:2: ( rule__Field__ModifierAssignment_0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==Protected||LA18_0==Constant||LA18_0==Private||LA18_0==Public) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalModelEditorParser.g:1163:3: rule__Field__ModifierAssignment_0
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
    // InternalModelEditorParser.g:1171:1: rule__Field__Group__1 : rule__Field__Group__1__Impl rule__Field__Group__2 ;
    public final void rule__Field__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1175:1: ( rule__Field__Group__1__Impl rule__Field__Group__2 )
            // InternalModelEditorParser.g:1176:2: rule__Field__Group__1__Impl rule__Field__Group__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalModelEditorParser.g:1183:1: rule__Field__Group__1__Impl : ( ( rule__Field__NameAssignment_1 ) ) ;
    public final void rule__Field__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1187:1: ( ( ( rule__Field__NameAssignment_1 ) ) )
            // InternalModelEditorParser.g:1188:1: ( ( rule__Field__NameAssignment_1 ) )
            {
            // InternalModelEditorParser.g:1188:1: ( ( rule__Field__NameAssignment_1 ) )
            // InternalModelEditorParser.g:1189:2: ( rule__Field__NameAssignment_1 )
            {
             before(grammarAccess.getFieldAccess().getNameAssignment_1()); 
            // InternalModelEditorParser.g:1190:2: ( rule__Field__NameAssignment_1 )
            // InternalModelEditorParser.g:1190:3: rule__Field__NameAssignment_1
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
    // InternalModelEditorParser.g:1198:1: rule__Field__Group__2 : rule__Field__Group__2__Impl ;
    public final void rule__Field__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1202:1: ( rule__Field__Group__2__Impl )
            // InternalModelEditorParser.g:1203:2: rule__Field__Group__2__Impl
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
    // InternalModelEditorParser.g:1209:1: rule__Field__Group__2__Impl : ( ( rule__Field__Group_2__0 )? ) ;
    public final void rule__Field__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1213:1: ( ( ( rule__Field__Group_2__0 )? ) )
            // InternalModelEditorParser.g:1214:1: ( ( rule__Field__Group_2__0 )? )
            {
            // InternalModelEditorParser.g:1214:1: ( ( rule__Field__Group_2__0 )? )
            // InternalModelEditorParser.g:1215:2: ( rule__Field__Group_2__0 )?
            {
             before(grammarAccess.getFieldAccess().getGroup_2()); 
            // InternalModelEditorParser.g:1216:2: ( rule__Field__Group_2__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==Colon) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalModelEditorParser.g:1216:3: rule__Field__Group_2__0
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
    // InternalModelEditorParser.g:1225:1: rule__Field__Group_2__0 : rule__Field__Group_2__0__Impl rule__Field__Group_2__1 ;
    public final void rule__Field__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1229:1: ( rule__Field__Group_2__0__Impl rule__Field__Group_2__1 )
            // InternalModelEditorParser.g:1230:2: rule__Field__Group_2__0__Impl rule__Field__Group_2__1
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
    // InternalModelEditorParser.g:1237:1: rule__Field__Group_2__0__Impl : ( Colon ) ;
    public final void rule__Field__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1241:1: ( ( Colon ) )
            // InternalModelEditorParser.g:1242:1: ( Colon )
            {
            // InternalModelEditorParser.g:1242:1: ( Colon )
            // InternalModelEditorParser.g:1243:2: Colon
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
    // InternalModelEditorParser.g:1252:1: rule__Field__Group_2__1 : rule__Field__Group_2__1__Impl ;
    public final void rule__Field__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1256:1: ( rule__Field__Group_2__1__Impl )
            // InternalModelEditorParser.g:1257:2: rule__Field__Group_2__1__Impl
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
    // InternalModelEditorParser.g:1263:1: rule__Field__Group_2__1__Impl : ( ( rule__Field__TypeAssignment_2_1 ) ) ;
    public final void rule__Field__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1267:1: ( ( ( rule__Field__TypeAssignment_2_1 ) ) )
            // InternalModelEditorParser.g:1268:1: ( ( rule__Field__TypeAssignment_2_1 ) )
            {
            // InternalModelEditorParser.g:1268:1: ( ( rule__Field__TypeAssignment_2_1 ) )
            // InternalModelEditorParser.g:1269:2: ( rule__Field__TypeAssignment_2_1 )
            {
             before(grammarAccess.getFieldAccess().getTypeAssignment_2_1()); 
            // InternalModelEditorParser.g:1270:2: ( rule__Field__TypeAssignment_2_1 )
            // InternalModelEditorParser.g:1270:3: rule__Field__TypeAssignment_2_1
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
    // InternalModelEditorParser.g:1279:1: rule__Method__Group__0 : rule__Method__Group__0__Impl rule__Method__Group__1 ;
    public final void rule__Method__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1283:1: ( rule__Method__Group__0__Impl rule__Method__Group__1 )
            // InternalModelEditorParser.g:1284:2: rule__Method__Group__0__Impl rule__Method__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalModelEditorParser.g:1291:1: rule__Method__Group__0__Impl : ( ( rule__Method__ModifierAssignment_0 )? ) ;
    public final void rule__Method__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1295:1: ( ( ( rule__Method__ModifierAssignment_0 )? ) )
            // InternalModelEditorParser.g:1296:1: ( ( rule__Method__ModifierAssignment_0 )? )
            {
            // InternalModelEditorParser.g:1296:1: ( ( rule__Method__ModifierAssignment_0 )? )
            // InternalModelEditorParser.g:1297:2: ( rule__Method__ModifierAssignment_0 )?
            {
             before(grammarAccess.getMethodAccess().getModifierAssignment_0()); 
            // InternalModelEditorParser.g:1298:2: ( rule__Method__ModifierAssignment_0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==Protected||LA20_0==Constant||LA20_0==Private||LA20_0==Public) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalModelEditorParser.g:1298:3: rule__Method__ModifierAssignment_0
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
    // InternalModelEditorParser.g:1306:1: rule__Method__Group__1 : rule__Method__Group__1__Impl rule__Method__Group__2 ;
    public final void rule__Method__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1310:1: ( rule__Method__Group__1__Impl rule__Method__Group__2 )
            // InternalModelEditorParser.g:1311:2: rule__Method__Group__1__Impl rule__Method__Group__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalModelEditorParser.g:1318:1: rule__Method__Group__1__Impl : ( ( rule__Method__NameAssignment_1 ) ) ;
    public final void rule__Method__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1322:1: ( ( ( rule__Method__NameAssignment_1 ) ) )
            // InternalModelEditorParser.g:1323:1: ( ( rule__Method__NameAssignment_1 ) )
            {
            // InternalModelEditorParser.g:1323:1: ( ( rule__Method__NameAssignment_1 ) )
            // InternalModelEditorParser.g:1324:2: ( rule__Method__NameAssignment_1 )
            {
             before(grammarAccess.getMethodAccess().getNameAssignment_1()); 
            // InternalModelEditorParser.g:1325:2: ( rule__Method__NameAssignment_1 )
            // InternalModelEditorParser.g:1325:3: rule__Method__NameAssignment_1
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
    // InternalModelEditorParser.g:1333:1: rule__Method__Group__2 : rule__Method__Group__2__Impl rule__Method__Group__3 ;
    public final void rule__Method__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1337:1: ( rule__Method__Group__2__Impl rule__Method__Group__3 )
            // InternalModelEditorParser.g:1338:2: rule__Method__Group__2__Impl rule__Method__Group__3
            {
            pushFollow(FOLLOW_18);
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
    // InternalModelEditorParser.g:1345:1: rule__Method__Group__2__Impl : ( LeftParenthesis ) ;
    public final void rule__Method__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1349:1: ( ( LeftParenthesis ) )
            // InternalModelEditorParser.g:1350:1: ( LeftParenthesis )
            {
            // InternalModelEditorParser.g:1350:1: ( LeftParenthesis )
            // InternalModelEditorParser.g:1351:2: LeftParenthesis
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
    // InternalModelEditorParser.g:1360:1: rule__Method__Group__3 : rule__Method__Group__3__Impl rule__Method__Group__4 ;
    public final void rule__Method__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1364:1: ( rule__Method__Group__3__Impl rule__Method__Group__4 )
            // InternalModelEditorParser.g:1365:2: rule__Method__Group__3__Impl rule__Method__Group__4
            {
            pushFollow(FOLLOW_18);
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
    // InternalModelEditorParser.g:1372:1: rule__Method__Group__3__Impl : ( ( rule__Method__Group_3__0 )? ) ;
    public final void rule__Method__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1376:1: ( ( ( rule__Method__Group_3__0 )? ) )
            // InternalModelEditorParser.g:1377:1: ( ( rule__Method__Group_3__0 )? )
            {
            // InternalModelEditorParser.g:1377:1: ( ( rule__Method__Group_3__0 )? )
            // InternalModelEditorParser.g:1378:2: ( rule__Method__Group_3__0 )?
            {
             before(grammarAccess.getMethodAccess().getGroup_3()); 
            // InternalModelEditorParser.g:1379:2: ( rule__Method__Group_3__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ID||LA21_0==RULE_STRING) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalModelEditorParser.g:1379:3: rule__Method__Group_3__0
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
    // InternalModelEditorParser.g:1387:1: rule__Method__Group__4 : rule__Method__Group__4__Impl rule__Method__Group__5 ;
    public final void rule__Method__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1391:1: ( rule__Method__Group__4__Impl rule__Method__Group__5 )
            // InternalModelEditorParser.g:1392:2: rule__Method__Group__4__Impl rule__Method__Group__5
            {
            pushFollow(FOLLOW_19);
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
    // InternalModelEditorParser.g:1399:1: rule__Method__Group__4__Impl : ( RightParenthesis ) ;
    public final void rule__Method__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1403:1: ( ( RightParenthesis ) )
            // InternalModelEditorParser.g:1404:1: ( RightParenthesis )
            {
            // InternalModelEditorParser.g:1404:1: ( RightParenthesis )
            // InternalModelEditorParser.g:1405:2: RightParenthesis
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
    // InternalModelEditorParser.g:1414:1: rule__Method__Group__5 : rule__Method__Group__5__Impl rule__Method__Group__6 ;
    public final void rule__Method__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1418:1: ( rule__Method__Group__5__Impl rule__Method__Group__6 )
            // InternalModelEditorParser.g:1419:2: rule__Method__Group__5__Impl rule__Method__Group__6
            {
            pushFollow(FOLLOW_19);
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
    // InternalModelEditorParser.g:1426:1: rule__Method__Group__5__Impl : ( ( rule__Method__Group_5__0 )? ) ;
    public final void rule__Method__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1430:1: ( ( ( rule__Method__Group_5__0 )? ) )
            // InternalModelEditorParser.g:1431:1: ( ( rule__Method__Group_5__0 )? )
            {
            // InternalModelEditorParser.g:1431:1: ( ( rule__Method__Group_5__0 )? )
            // InternalModelEditorParser.g:1432:2: ( rule__Method__Group_5__0 )?
            {
             before(grammarAccess.getMethodAccess().getGroup_5()); 
            // InternalModelEditorParser.g:1433:2: ( rule__Method__Group_5__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==Colon) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalModelEditorParser.g:1433:3: rule__Method__Group_5__0
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
    // InternalModelEditorParser.g:1441:1: rule__Method__Group__6 : rule__Method__Group__6__Impl ;
    public final void rule__Method__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1445:1: ( rule__Method__Group__6__Impl )
            // InternalModelEditorParser.g:1446:2: rule__Method__Group__6__Impl
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
    // InternalModelEditorParser.g:1452:1: rule__Method__Group__6__Impl : ( ( rule__Method__Group_6__0 )? ) ;
    public final void rule__Method__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1456:1: ( ( ( rule__Method__Group_6__0 )? ) )
            // InternalModelEditorParser.g:1457:1: ( ( rule__Method__Group_6__0 )? )
            {
            // InternalModelEditorParser.g:1457:1: ( ( rule__Method__Group_6__0 )? )
            // InternalModelEditorParser.g:1458:2: ( rule__Method__Group_6__0 )?
            {
             before(grammarAccess.getMethodAccess().getGroup_6()); 
            // InternalModelEditorParser.g:1459:2: ( rule__Method__Group_6__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_BEGIN) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalModelEditorParser.g:1459:3: rule__Method__Group_6__0
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
    // InternalModelEditorParser.g:1468:1: rule__Method__Group_3__0 : rule__Method__Group_3__0__Impl rule__Method__Group_3__1 ;
    public final void rule__Method__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1472:1: ( rule__Method__Group_3__0__Impl rule__Method__Group_3__1 )
            // InternalModelEditorParser.g:1473:2: rule__Method__Group_3__0__Impl rule__Method__Group_3__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalModelEditorParser.g:1480:1: rule__Method__Group_3__0__Impl : ( ( rule__Method__TypesAssignment_3_0 ) ) ;
    public final void rule__Method__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1484:1: ( ( ( rule__Method__TypesAssignment_3_0 ) ) )
            // InternalModelEditorParser.g:1485:1: ( ( rule__Method__TypesAssignment_3_0 ) )
            {
            // InternalModelEditorParser.g:1485:1: ( ( rule__Method__TypesAssignment_3_0 ) )
            // InternalModelEditorParser.g:1486:2: ( rule__Method__TypesAssignment_3_0 )
            {
             before(grammarAccess.getMethodAccess().getTypesAssignment_3_0()); 
            // InternalModelEditorParser.g:1487:2: ( rule__Method__TypesAssignment_3_0 )
            // InternalModelEditorParser.g:1487:3: rule__Method__TypesAssignment_3_0
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
    // InternalModelEditorParser.g:1495:1: rule__Method__Group_3__1 : rule__Method__Group_3__1__Impl ;
    public final void rule__Method__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1499:1: ( rule__Method__Group_3__1__Impl )
            // InternalModelEditorParser.g:1500:2: rule__Method__Group_3__1__Impl
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
    // InternalModelEditorParser.g:1506:1: rule__Method__Group_3__1__Impl : ( ( rule__Method__Group_3_1__0 )* ) ;
    public final void rule__Method__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1510:1: ( ( ( rule__Method__Group_3_1__0 )* ) )
            // InternalModelEditorParser.g:1511:1: ( ( rule__Method__Group_3_1__0 )* )
            {
            // InternalModelEditorParser.g:1511:1: ( ( rule__Method__Group_3_1__0 )* )
            // InternalModelEditorParser.g:1512:2: ( rule__Method__Group_3_1__0 )*
            {
             before(grammarAccess.getMethodAccess().getGroup_3_1()); 
            // InternalModelEditorParser.g:1513:2: ( rule__Method__Group_3_1__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==Comma) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalModelEditorParser.g:1513:3: rule__Method__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__Method__Group_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
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
    // InternalModelEditorParser.g:1522:1: rule__Method__Group_3_1__0 : rule__Method__Group_3_1__0__Impl rule__Method__Group_3_1__1 ;
    public final void rule__Method__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1526:1: ( rule__Method__Group_3_1__0__Impl rule__Method__Group_3_1__1 )
            // InternalModelEditorParser.g:1527:2: rule__Method__Group_3_1__0__Impl rule__Method__Group_3_1__1
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
    // InternalModelEditorParser.g:1534:1: rule__Method__Group_3_1__0__Impl : ( Comma ) ;
    public final void rule__Method__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1538:1: ( ( Comma ) )
            // InternalModelEditorParser.g:1539:1: ( Comma )
            {
            // InternalModelEditorParser.g:1539:1: ( Comma )
            // InternalModelEditorParser.g:1540:2: Comma
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
    // InternalModelEditorParser.g:1549:1: rule__Method__Group_3_1__1 : rule__Method__Group_3_1__1__Impl ;
    public final void rule__Method__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1553:1: ( rule__Method__Group_3_1__1__Impl )
            // InternalModelEditorParser.g:1554:2: rule__Method__Group_3_1__1__Impl
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
    // InternalModelEditorParser.g:1560:1: rule__Method__Group_3_1__1__Impl : ( ( rule__Method__TypesAssignment_3_1_1 ) ) ;
    public final void rule__Method__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1564:1: ( ( ( rule__Method__TypesAssignment_3_1_1 ) ) )
            // InternalModelEditorParser.g:1565:1: ( ( rule__Method__TypesAssignment_3_1_1 ) )
            {
            // InternalModelEditorParser.g:1565:1: ( ( rule__Method__TypesAssignment_3_1_1 ) )
            // InternalModelEditorParser.g:1566:2: ( rule__Method__TypesAssignment_3_1_1 )
            {
             before(grammarAccess.getMethodAccess().getTypesAssignment_3_1_1()); 
            // InternalModelEditorParser.g:1567:2: ( rule__Method__TypesAssignment_3_1_1 )
            // InternalModelEditorParser.g:1567:3: rule__Method__TypesAssignment_3_1_1
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
    // InternalModelEditorParser.g:1576:1: rule__Method__Group_5__0 : rule__Method__Group_5__0__Impl rule__Method__Group_5__1 ;
    public final void rule__Method__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1580:1: ( rule__Method__Group_5__0__Impl rule__Method__Group_5__1 )
            // InternalModelEditorParser.g:1581:2: rule__Method__Group_5__0__Impl rule__Method__Group_5__1
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
    // InternalModelEditorParser.g:1588:1: rule__Method__Group_5__0__Impl : ( Colon ) ;
    public final void rule__Method__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1592:1: ( ( Colon ) )
            // InternalModelEditorParser.g:1593:1: ( Colon )
            {
            // InternalModelEditorParser.g:1593:1: ( Colon )
            // InternalModelEditorParser.g:1594:2: Colon
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
    // InternalModelEditorParser.g:1603:1: rule__Method__Group_5__1 : rule__Method__Group_5__1__Impl ;
    public final void rule__Method__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1607:1: ( rule__Method__Group_5__1__Impl )
            // InternalModelEditorParser.g:1608:2: rule__Method__Group_5__1__Impl
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
    // InternalModelEditorParser.g:1614:1: rule__Method__Group_5__1__Impl : ( ( rule__Method__TypeAssignment_5_1 ) ) ;
    public final void rule__Method__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1618:1: ( ( ( rule__Method__TypeAssignment_5_1 ) ) )
            // InternalModelEditorParser.g:1619:1: ( ( rule__Method__TypeAssignment_5_1 ) )
            {
            // InternalModelEditorParser.g:1619:1: ( ( rule__Method__TypeAssignment_5_1 ) )
            // InternalModelEditorParser.g:1620:2: ( rule__Method__TypeAssignment_5_1 )
            {
             before(grammarAccess.getMethodAccess().getTypeAssignment_5_1()); 
            // InternalModelEditorParser.g:1621:2: ( rule__Method__TypeAssignment_5_1 )
            // InternalModelEditorParser.g:1621:3: rule__Method__TypeAssignment_5_1
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
    // InternalModelEditorParser.g:1630:1: rule__Method__Group_6__0 : rule__Method__Group_6__0__Impl rule__Method__Group_6__1 ;
    public final void rule__Method__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1634:1: ( rule__Method__Group_6__0__Impl rule__Method__Group_6__1 )
            // InternalModelEditorParser.g:1635:2: rule__Method__Group_6__0__Impl rule__Method__Group_6__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalModelEditorParser.g:1642:1: rule__Method__Group_6__0__Impl : ( RULE_BEGIN ) ;
    public final void rule__Method__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1646:1: ( ( RULE_BEGIN ) )
            // InternalModelEditorParser.g:1647:1: ( RULE_BEGIN )
            {
            // InternalModelEditorParser.g:1647:1: ( RULE_BEGIN )
            // InternalModelEditorParser.g:1648:2: RULE_BEGIN
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
    // InternalModelEditorParser.g:1657:1: rule__Method__Group_6__1 : rule__Method__Group_6__1__Impl rule__Method__Group_6__2 ;
    public final void rule__Method__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1661:1: ( rule__Method__Group_6__1__Impl rule__Method__Group_6__2 )
            // InternalModelEditorParser.g:1662:2: rule__Method__Group_6__1__Impl rule__Method__Group_6__2
            {
            pushFollow(FOLLOW_22);
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
    // InternalModelEditorParser.g:1669:1: rule__Method__Group_6__1__Impl : ( ( rule__Method__Group_6_1__0 )? ) ;
    public final void rule__Method__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1673:1: ( ( ( rule__Method__Group_6_1__0 )? ) )
            // InternalModelEditorParser.g:1674:1: ( ( rule__Method__Group_6_1__0 )? )
            {
            // InternalModelEditorParser.g:1674:1: ( ( rule__Method__Group_6_1__0 )? )
            // InternalModelEditorParser.g:1675:2: ( rule__Method__Group_6_1__0 )?
            {
             before(grammarAccess.getMethodAccess().getGroup_6_1()); 
            // InternalModelEditorParser.g:1676:2: ( rule__Method__Group_6_1__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_INT) ) {
                int LA25_1 = input.LA(2);

                if ( (LA25_1==Lines) ) {
                    alt25=1;
                }
            }
            switch (alt25) {
                case 1 :
                    // InternalModelEditorParser.g:1676:3: rule__Method__Group_6_1__0
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
    // InternalModelEditorParser.g:1684:1: rule__Method__Group_6__2 : rule__Method__Group_6__2__Impl rule__Method__Group_6__3 ;
    public final void rule__Method__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1688:1: ( rule__Method__Group_6__2__Impl rule__Method__Group_6__3 )
            // InternalModelEditorParser.g:1689:2: rule__Method__Group_6__2__Impl rule__Method__Group_6__3
            {
            pushFollow(FOLLOW_22);
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
    // InternalModelEditorParser.g:1696:1: rule__Method__Group_6__2__Impl : ( ( rule__Method__Group_6_2__0 )? ) ;
    public final void rule__Method__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1700:1: ( ( ( rule__Method__Group_6_2__0 )? ) )
            // InternalModelEditorParser.g:1701:1: ( ( rule__Method__Group_6_2__0 )? )
            {
            // InternalModelEditorParser.g:1701:1: ( ( rule__Method__Group_6_2__0 )? )
            // InternalModelEditorParser.g:1702:2: ( rule__Method__Group_6_2__0 )?
            {
             before(grammarAccess.getMethodAccess().getGroup_6_2()); 
            // InternalModelEditorParser.g:1703:2: ( rule__Method__Group_6_2__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_INT) ) {
                int LA26_1 = input.LA(2);

                if ( (LA26_1==Cyclo) ) {
                    alt26=1;
                }
            }
            switch (alt26) {
                case 1 :
                    // InternalModelEditorParser.g:1703:3: rule__Method__Group_6_2__0
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
    // InternalModelEditorParser.g:1711:1: rule__Method__Group_6__3 : rule__Method__Group_6__3__Impl rule__Method__Group_6__4 ;
    public final void rule__Method__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1715:1: ( rule__Method__Group_6__3__Impl rule__Method__Group_6__4 )
            // InternalModelEditorParser.g:1716:2: rule__Method__Group_6__3__Impl rule__Method__Group_6__4
            {
            pushFollow(FOLLOW_22);
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
    // InternalModelEditorParser.g:1723:1: rule__Method__Group_6__3__Impl : ( ( rule__Method__AccessesAssignment_6_3 )* ) ;
    public final void rule__Method__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1727:1: ( ( ( rule__Method__AccessesAssignment_6_3 )* ) )
            // InternalModelEditorParser.g:1728:1: ( ( rule__Method__AccessesAssignment_6_3 )* )
            {
            // InternalModelEditorParser.g:1728:1: ( ( rule__Method__AccessesAssignment_6_3 )* )
            // InternalModelEditorParser.g:1729:2: ( rule__Method__AccessesAssignment_6_3 )*
            {
             before(grammarAccess.getMethodAccess().getAccessesAssignment_6_3()); 
            // InternalModelEditorParser.g:1730:2: ( rule__Method__AccessesAssignment_6_3 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==RULE_INT) ) {
                    int LA27_1 = input.LA(2);

                    if ( (LA27_1==Accesses||LA27_1==Access) ) {
                        alt27=1;
                    }


                }


                switch (alt27) {
            	case 1 :
            	    // InternalModelEditorParser.g:1730:3: rule__Method__AccessesAssignment_6_3
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__Method__AccessesAssignment_6_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
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
    // InternalModelEditorParser.g:1738:1: rule__Method__Group_6__4 : rule__Method__Group_6__4__Impl rule__Method__Group_6__5 ;
    public final void rule__Method__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1742:1: ( rule__Method__Group_6__4__Impl rule__Method__Group_6__5 )
            // InternalModelEditorParser.g:1743:2: rule__Method__Group_6__4__Impl rule__Method__Group_6__5
            {
            pushFollow(FOLLOW_22);
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
    // InternalModelEditorParser.g:1750:1: rule__Method__Group_6__4__Impl : ( ( rule__Method__CallsAssignment_6_4 )* ) ;
    public final void rule__Method__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1754:1: ( ( ( rule__Method__CallsAssignment_6_4 )* ) )
            // InternalModelEditorParser.g:1755:1: ( ( rule__Method__CallsAssignment_6_4 )* )
            {
            // InternalModelEditorParser.g:1755:1: ( ( rule__Method__CallsAssignment_6_4 )* )
            // InternalModelEditorParser.g:1756:2: ( rule__Method__CallsAssignment_6_4 )*
            {
             before(grammarAccess.getMethodAccess().getCallsAssignment_6_4()); 
            // InternalModelEditorParser.g:1757:2: ( rule__Method__CallsAssignment_6_4 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==RULE_INT) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalModelEditorParser.g:1757:3: rule__Method__CallsAssignment_6_4
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__Method__CallsAssignment_6_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
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
    // InternalModelEditorParser.g:1765:1: rule__Method__Group_6__5 : rule__Method__Group_6__5__Impl ;
    public final void rule__Method__Group_6__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1769:1: ( rule__Method__Group_6__5__Impl )
            // InternalModelEditorParser.g:1770:2: rule__Method__Group_6__5__Impl
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
    // InternalModelEditorParser.g:1776:1: rule__Method__Group_6__5__Impl : ( RULE_END ) ;
    public final void rule__Method__Group_6__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1780:1: ( ( RULE_END ) )
            // InternalModelEditorParser.g:1781:1: ( RULE_END )
            {
            // InternalModelEditorParser.g:1781:1: ( RULE_END )
            // InternalModelEditorParser.g:1782:2: RULE_END
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
    // InternalModelEditorParser.g:1792:1: rule__Method__Group_6_1__0 : rule__Method__Group_6_1__0__Impl rule__Method__Group_6_1__1 ;
    public final void rule__Method__Group_6_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1796:1: ( rule__Method__Group_6_1__0__Impl rule__Method__Group_6_1__1 )
            // InternalModelEditorParser.g:1797:2: rule__Method__Group_6_1__0__Impl rule__Method__Group_6_1__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalModelEditorParser.g:1804:1: rule__Method__Group_6_1__0__Impl : ( ( rule__Method__LocAssignment_6_1_0 ) ) ;
    public final void rule__Method__Group_6_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1808:1: ( ( ( rule__Method__LocAssignment_6_1_0 ) ) )
            // InternalModelEditorParser.g:1809:1: ( ( rule__Method__LocAssignment_6_1_0 ) )
            {
            // InternalModelEditorParser.g:1809:1: ( ( rule__Method__LocAssignment_6_1_0 ) )
            // InternalModelEditorParser.g:1810:2: ( rule__Method__LocAssignment_6_1_0 )
            {
             before(grammarAccess.getMethodAccess().getLocAssignment_6_1_0()); 
            // InternalModelEditorParser.g:1811:2: ( rule__Method__LocAssignment_6_1_0 )
            // InternalModelEditorParser.g:1811:3: rule__Method__LocAssignment_6_1_0
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
    // InternalModelEditorParser.g:1819:1: rule__Method__Group_6_1__1 : rule__Method__Group_6_1__1__Impl rule__Method__Group_6_1__2 ;
    public final void rule__Method__Group_6_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1823:1: ( rule__Method__Group_6_1__1__Impl rule__Method__Group_6_1__2 )
            // InternalModelEditorParser.g:1824:2: rule__Method__Group_6_1__1__Impl rule__Method__Group_6_1__2
            {
            pushFollow(FOLLOW_25);
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
    // InternalModelEditorParser.g:1831:1: rule__Method__Group_6_1__1__Impl : ( Lines ) ;
    public final void rule__Method__Group_6_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1835:1: ( ( Lines ) )
            // InternalModelEditorParser.g:1836:1: ( Lines )
            {
            // InternalModelEditorParser.g:1836:1: ( Lines )
            // InternalModelEditorParser.g:1837:2: Lines
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
    // InternalModelEditorParser.g:1846:1: rule__Method__Group_6_1__2 : rule__Method__Group_6_1__2__Impl rule__Method__Group_6_1__3 ;
    public final void rule__Method__Group_6_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1850:1: ( rule__Method__Group_6_1__2__Impl rule__Method__Group_6_1__3 )
            // InternalModelEditorParser.g:1851:2: rule__Method__Group_6_1__2__Impl rule__Method__Group_6_1__3
            {
            pushFollow(FOLLOW_26);
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
    // InternalModelEditorParser.g:1858:1: rule__Method__Group_6_1__2__Impl : ( Of ) ;
    public final void rule__Method__Group_6_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1862:1: ( ( Of ) )
            // InternalModelEditorParser.g:1863:1: ( Of )
            {
            // InternalModelEditorParser.g:1863:1: ( Of )
            // InternalModelEditorParser.g:1864:2: Of
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
    // InternalModelEditorParser.g:1873:1: rule__Method__Group_6_1__3 : rule__Method__Group_6_1__3__Impl ;
    public final void rule__Method__Group_6_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1877:1: ( rule__Method__Group_6_1__3__Impl )
            // InternalModelEditorParser.g:1878:2: rule__Method__Group_6_1__3__Impl
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
    // InternalModelEditorParser.g:1884:1: rule__Method__Group_6_1__3__Impl : ( Code ) ;
    public final void rule__Method__Group_6_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1888:1: ( ( Code ) )
            // InternalModelEditorParser.g:1889:1: ( Code )
            {
            // InternalModelEditorParser.g:1889:1: ( Code )
            // InternalModelEditorParser.g:1890:2: Code
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
    // InternalModelEditorParser.g:1900:1: rule__Method__Group_6_2__0 : rule__Method__Group_6_2__0__Impl rule__Method__Group_6_2__1 ;
    public final void rule__Method__Group_6_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1904:1: ( rule__Method__Group_6_2__0__Impl rule__Method__Group_6_2__1 )
            // InternalModelEditorParser.g:1905:2: rule__Method__Group_6_2__0__Impl rule__Method__Group_6_2__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalModelEditorParser.g:1912:1: rule__Method__Group_6_2__0__Impl : ( ( rule__Method__CycloAssignment_6_2_0 ) ) ;
    public final void rule__Method__Group_6_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1916:1: ( ( ( rule__Method__CycloAssignment_6_2_0 ) ) )
            // InternalModelEditorParser.g:1917:1: ( ( rule__Method__CycloAssignment_6_2_0 ) )
            {
            // InternalModelEditorParser.g:1917:1: ( ( rule__Method__CycloAssignment_6_2_0 ) )
            // InternalModelEditorParser.g:1918:2: ( rule__Method__CycloAssignment_6_2_0 )
            {
             before(grammarAccess.getMethodAccess().getCycloAssignment_6_2_0()); 
            // InternalModelEditorParser.g:1919:2: ( rule__Method__CycloAssignment_6_2_0 )
            // InternalModelEditorParser.g:1919:3: rule__Method__CycloAssignment_6_2_0
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
    // InternalModelEditorParser.g:1927:1: rule__Method__Group_6_2__1 : rule__Method__Group_6_2__1__Impl ;
    public final void rule__Method__Group_6_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1931:1: ( rule__Method__Group_6_2__1__Impl )
            // InternalModelEditorParser.g:1932:2: rule__Method__Group_6_2__1__Impl
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
    // InternalModelEditorParser.g:1938:1: rule__Method__Group_6_2__1__Impl : ( Cyclo ) ;
    public final void rule__Method__Group_6_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1942:1: ( ( Cyclo ) )
            // InternalModelEditorParser.g:1943:1: ( Cyclo )
            {
            // InternalModelEditorParser.g:1943:1: ( Cyclo )
            // InternalModelEditorParser.g:1944:2: Cyclo
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
    // InternalModelEditorParser.g:1954:1: rule__Access__Group__0 : rule__Access__Group__0__Impl rule__Access__Group__1 ;
    public final void rule__Access__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1958:1: ( rule__Access__Group__0__Impl rule__Access__Group__1 )
            // InternalModelEditorParser.g:1959:2: rule__Access__Group__0__Impl rule__Access__Group__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalModelEditorParser.g:1966:1: rule__Access__Group__0__Impl : ( ( rule__Access__AccessesAssignment_0 ) ) ;
    public final void rule__Access__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1970:1: ( ( ( rule__Access__AccessesAssignment_0 ) ) )
            // InternalModelEditorParser.g:1971:1: ( ( rule__Access__AccessesAssignment_0 ) )
            {
            // InternalModelEditorParser.g:1971:1: ( ( rule__Access__AccessesAssignment_0 ) )
            // InternalModelEditorParser.g:1972:2: ( rule__Access__AccessesAssignment_0 )
            {
             before(grammarAccess.getAccessAccess().getAccessesAssignment_0()); 
            // InternalModelEditorParser.g:1973:2: ( rule__Access__AccessesAssignment_0 )
            // InternalModelEditorParser.g:1973:3: rule__Access__AccessesAssignment_0
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
    // InternalModelEditorParser.g:1981:1: rule__Access__Group__1 : rule__Access__Group__1__Impl rule__Access__Group__2 ;
    public final void rule__Access__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1985:1: ( rule__Access__Group__1__Impl rule__Access__Group__2 )
            // InternalModelEditorParser.g:1986:2: rule__Access__Group__1__Impl rule__Access__Group__2
            {
            pushFollow(FOLLOW_29);
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
    // InternalModelEditorParser.g:1993:1: rule__Access__Group__1__Impl : ( ( rule__Access__Alternatives_1 ) ) ;
    public final void rule__Access__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1997:1: ( ( ( rule__Access__Alternatives_1 ) ) )
            // InternalModelEditorParser.g:1998:1: ( ( rule__Access__Alternatives_1 ) )
            {
            // InternalModelEditorParser.g:1998:1: ( ( rule__Access__Alternatives_1 ) )
            // InternalModelEditorParser.g:1999:2: ( rule__Access__Alternatives_1 )
            {
             before(grammarAccess.getAccessAccess().getAlternatives_1()); 
            // InternalModelEditorParser.g:2000:2: ( rule__Access__Alternatives_1 )
            // InternalModelEditorParser.g:2000:3: rule__Access__Alternatives_1
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
    // InternalModelEditorParser.g:2008:1: rule__Access__Group__2 : rule__Access__Group__2__Impl rule__Access__Group__3 ;
    public final void rule__Access__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:2012:1: ( rule__Access__Group__2__Impl rule__Access__Group__3 )
            // InternalModelEditorParser.g:2013:2: rule__Access__Group__2__Impl rule__Access__Group__3
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
    // InternalModelEditorParser.g:2020:1: rule__Access__Group__2__Impl : ( To ) ;
    public final void rule__Access__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:2024:1: ( ( To ) )
            // InternalModelEditorParser.g:2025:1: ( To )
            {
            // InternalModelEditorParser.g:2025:1: ( To )
            // InternalModelEditorParser.g:2026:2: To
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
    // InternalModelEditorParser.g:2035:1: rule__Access__Group__3 : rule__Access__Group__3__Impl ;
    public final void rule__Access__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:2039:1: ( rule__Access__Group__3__Impl )
            // InternalModelEditorParser.g:2040:2: rule__Access__Group__3__Impl
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
    // InternalModelEditorParser.g:2046:1: rule__Access__Group__3__Impl : ( ( rule__Access__FieldAssignment_3 ) ) ;
    public final void rule__Access__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:2050:1: ( ( ( rule__Access__FieldAssignment_3 ) ) )
            // InternalModelEditorParser.g:2051:1: ( ( rule__Access__FieldAssignment_3 ) )
            {
            // InternalModelEditorParser.g:2051:1: ( ( rule__Access__FieldAssignment_3 ) )
            // InternalModelEditorParser.g:2052:2: ( rule__Access__FieldAssignment_3 )
            {
             before(grammarAccess.getAccessAccess().getFieldAssignment_3()); 
            // InternalModelEditorParser.g:2053:2: ( rule__Access__FieldAssignment_3 )
            // InternalModelEditorParser.g:2053:3: rule__Access__FieldAssignment_3
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
    // InternalModelEditorParser.g:2062:1: rule__Call__Group__0 : rule__Call__Group__0__Impl rule__Call__Group__1 ;
    public final void rule__Call__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:2066:1: ( rule__Call__Group__0__Impl rule__Call__Group__1 )
            // InternalModelEditorParser.g:2067:2: rule__Call__Group__0__Impl rule__Call__Group__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalModelEditorParser.g:2074:1: rule__Call__Group__0__Impl : ( ( rule__Call__CallsAssignment_0 ) ) ;
    public final void rule__Call__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:2078:1: ( ( ( rule__Call__CallsAssignment_0 ) ) )
            // InternalModelEditorParser.g:2079:1: ( ( rule__Call__CallsAssignment_0 ) )
            {
            // InternalModelEditorParser.g:2079:1: ( ( rule__Call__CallsAssignment_0 ) )
            // InternalModelEditorParser.g:2080:2: ( rule__Call__CallsAssignment_0 )
            {
             before(grammarAccess.getCallAccess().getCallsAssignment_0()); 
            // InternalModelEditorParser.g:2081:2: ( rule__Call__CallsAssignment_0 )
            // InternalModelEditorParser.g:2081:3: rule__Call__CallsAssignment_0
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
    // InternalModelEditorParser.g:2089:1: rule__Call__Group__1 : rule__Call__Group__1__Impl rule__Call__Group__2 ;
    public final void rule__Call__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:2093:1: ( rule__Call__Group__1__Impl rule__Call__Group__2 )
            // InternalModelEditorParser.g:2094:2: rule__Call__Group__1__Impl rule__Call__Group__2
            {
            pushFollow(FOLLOW_29);
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
    // InternalModelEditorParser.g:2101:1: rule__Call__Group__1__Impl : ( ( rule__Call__Alternatives_1 ) ) ;
    public final void rule__Call__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:2105:1: ( ( ( rule__Call__Alternatives_1 ) ) )
            // InternalModelEditorParser.g:2106:1: ( ( rule__Call__Alternatives_1 ) )
            {
            // InternalModelEditorParser.g:2106:1: ( ( rule__Call__Alternatives_1 ) )
            // InternalModelEditorParser.g:2107:2: ( rule__Call__Alternatives_1 )
            {
             before(grammarAccess.getCallAccess().getAlternatives_1()); 
            // InternalModelEditorParser.g:2108:2: ( rule__Call__Alternatives_1 )
            // InternalModelEditorParser.g:2108:3: rule__Call__Alternatives_1
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
    // InternalModelEditorParser.g:2116:1: rule__Call__Group__2 : rule__Call__Group__2__Impl rule__Call__Group__3 ;
    public final void rule__Call__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:2120:1: ( rule__Call__Group__2__Impl rule__Call__Group__3 )
            // InternalModelEditorParser.g:2121:2: rule__Call__Group__2__Impl rule__Call__Group__3
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
    // InternalModelEditorParser.g:2128:1: rule__Call__Group__2__Impl : ( To ) ;
    public final void rule__Call__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:2132:1: ( ( To ) )
            // InternalModelEditorParser.g:2133:1: ( To )
            {
            // InternalModelEditorParser.g:2133:1: ( To )
            // InternalModelEditorParser.g:2134:2: To
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
    // InternalModelEditorParser.g:2143:1: rule__Call__Group__3 : rule__Call__Group__3__Impl rule__Call__Group__4 ;
    public final void rule__Call__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:2147:1: ( rule__Call__Group__3__Impl rule__Call__Group__4 )
            // InternalModelEditorParser.g:2148:2: rule__Call__Group__3__Impl rule__Call__Group__4
            {
            pushFollow(FOLLOW_17);
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
    // InternalModelEditorParser.g:2155:1: rule__Call__Group__3__Impl : ( ( rule__Call__MethodAssignment_3 ) ) ;
    public final void rule__Call__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:2159:1: ( ( ( rule__Call__MethodAssignment_3 ) ) )
            // InternalModelEditorParser.g:2160:1: ( ( rule__Call__MethodAssignment_3 ) )
            {
            // InternalModelEditorParser.g:2160:1: ( ( rule__Call__MethodAssignment_3 ) )
            // InternalModelEditorParser.g:2161:2: ( rule__Call__MethodAssignment_3 )
            {
             before(grammarAccess.getCallAccess().getMethodAssignment_3()); 
            // InternalModelEditorParser.g:2162:2: ( rule__Call__MethodAssignment_3 )
            // InternalModelEditorParser.g:2162:3: rule__Call__MethodAssignment_3
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
    // InternalModelEditorParser.g:2170:1: rule__Call__Group__4 : rule__Call__Group__4__Impl rule__Call__Group__5 ;
    public final void rule__Call__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:2174:1: ( rule__Call__Group__4__Impl rule__Call__Group__5 )
            // InternalModelEditorParser.g:2175:2: rule__Call__Group__4__Impl rule__Call__Group__5
            {
            pushFollow(FOLLOW_31);
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
    // InternalModelEditorParser.g:2182:1: rule__Call__Group__4__Impl : ( LeftParenthesis ) ;
    public final void rule__Call__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:2186:1: ( ( LeftParenthesis ) )
            // InternalModelEditorParser.g:2187:1: ( LeftParenthesis )
            {
            // InternalModelEditorParser.g:2187:1: ( LeftParenthesis )
            // InternalModelEditorParser.g:2188:2: LeftParenthesis
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
    // InternalModelEditorParser.g:2197:1: rule__Call__Group__5 : rule__Call__Group__5__Impl ;
    public final void rule__Call__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:2201:1: ( rule__Call__Group__5__Impl )
            // InternalModelEditorParser.g:2202:2: rule__Call__Group__5__Impl
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
    // InternalModelEditorParser.g:2208:1: rule__Call__Group__5__Impl : ( RightParenthesis ) ;
    public final void rule__Call__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:2212:1: ( ( RightParenthesis ) )
            // InternalModelEditorParser.g:2213:1: ( RightParenthesis )
            {
            // InternalModelEditorParser.g:2213:1: ( RightParenthesis )
            // InternalModelEditorParser.g:2214:2: RightParenthesis
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
    // InternalModelEditorParser.g:2224:1: rule__Model__ImportsAssignment_0 : ( ruleImport ) ;
    public final void rule__Model__ImportsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:2228:1: ( ( ruleImport ) )
            // InternalModelEditorParser.g:2229:2: ( ruleImport )
            {
            // InternalModelEditorParser.g:2229:2: ( ruleImport )
            // InternalModelEditorParser.g:2230:3: ruleImport
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
    // InternalModelEditorParser.g:2239:1: rule__Model__ClassesAssignment_1 : ( ruleClass ) ;
    public final void rule__Model__ClassesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:2243:1: ( ( ruleClass ) )
            // InternalModelEditorParser.g:2244:2: ( ruleClass )
            {
            // InternalModelEditorParser.g:2244:2: ( ruleClass )
            // InternalModelEditorParser.g:2245:3: ruleClass
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
    // InternalModelEditorParser.g:2254:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleQualifiedNameWithWildcard ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:2258:1: ( ( ruleQualifiedNameWithWildcard ) )
            // InternalModelEditorParser.g:2259:2: ( ruleQualifiedNameWithWildcard )
            {
            // InternalModelEditorParser.g:2259:2: ( ruleQualifiedNameWithWildcard )
            // InternalModelEditorParser.g:2260:3: ruleQualifiedNameWithWildcard
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
    // InternalModelEditorParser.g:2269:1: rule__Class__ModifierAssignment_0 : ( ruleClassModifier ) ;
    public final void rule__Class__ModifierAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:2273:1: ( ( ruleClassModifier ) )
            // InternalModelEditorParser.g:2274:2: ( ruleClassModifier )
            {
            // InternalModelEditorParser.g:2274:2: ( ruleClassModifier )
            // InternalModelEditorParser.g:2275:3: ruleClassModifier
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
    // InternalModelEditorParser.g:2284:1: rule__Class__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Class__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:2288:1: ( ( RULE_ID ) )
            // InternalModelEditorParser.g:2289:2: ( RULE_ID )
            {
            // InternalModelEditorParser.g:2289:2: ( RULE_ID )
            // InternalModelEditorParser.g:2290:3: RULE_ID
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


    // $ANTLR start "rule__Class__SuperClassAssignment_3_1"
    // InternalModelEditorParser.g:2299:1: rule__Class__SuperClassAssignment_3_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Class__SuperClassAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:2303:1: ( ( ( ruleQualifiedName ) ) )
            // InternalModelEditorParser.g:2304:2: ( ( ruleQualifiedName ) )
            {
            // InternalModelEditorParser.g:2304:2: ( ( ruleQualifiedName ) )
            // InternalModelEditorParser.g:2305:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getClassAccess().getSuperClassClassCrossReference_3_1_0()); 
            // InternalModelEditorParser.g:2306:3: ( ruleQualifiedName )
            // InternalModelEditorParser.g:2307:4: ruleQualifiedName
            {
             before(grammarAccess.getClassAccess().getSuperClassClassQualifiedNameParserRuleCall_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getClassAccess().getSuperClassClassQualifiedNameParserRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getClassAccess().getSuperClassClassCrossReference_3_1_0()); 

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
    // $ANTLR end "rule__Class__SuperClassAssignment_3_1"


    // $ANTLR start "rule__Class__SuperTypesAssignment_4_1"
    // InternalModelEditorParser.g:2318:1: rule__Class__SuperTypesAssignment_4_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Class__SuperTypesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:2322:1: ( ( ( ruleQualifiedName ) ) )
            // InternalModelEditorParser.g:2323:2: ( ( ruleQualifiedName ) )
            {
            // InternalModelEditorParser.g:2323:2: ( ( ruleQualifiedName ) )
            // InternalModelEditorParser.g:2324:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getClassAccess().getSuperTypesClassCrossReference_4_1_0()); 
            // InternalModelEditorParser.g:2325:3: ( ruleQualifiedName )
            // InternalModelEditorParser.g:2326:4: ruleQualifiedName
            {
             before(grammarAccess.getClassAccess().getSuperTypesClassQualifiedNameParserRuleCall_4_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getClassAccess().getSuperTypesClassQualifiedNameParserRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getClassAccess().getSuperTypesClassCrossReference_4_1_0()); 

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
    // $ANTLR end "rule__Class__SuperTypesAssignment_4_1"


    // $ANTLR start "rule__Class__FieldsAssignment_5_1"
    // InternalModelEditorParser.g:2337:1: rule__Class__FieldsAssignment_5_1 : ( ruleField ) ;
    public final void rule__Class__FieldsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:2341:1: ( ( ruleField ) )
            // InternalModelEditorParser.g:2342:2: ( ruleField )
            {
            // InternalModelEditorParser.g:2342:2: ( ruleField )
            // InternalModelEditorParser.g:2343:3: ruleField
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
    // InternalModelEditorParser.g:2352:1: rule__Class__MethodsAssignment_5_2 : ( ruleMethod ) ;
    public final void rule__Class__MethodsAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:2356:1: ( ( ruleMethod ) )
            // InternalModelEditorParser.g:2357:2: ( ruleMethod )
            {
            // InternalModelEditorParser.g:2357:2: ( ruleMethod )
            // InternalModelEditorParser.g:2358:3: ruleMethod
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


    // $ANTLR start "rule__Field__ModifierAssignment_0"
    // InternalModelEditorParser.g:2367:1: rule__Field__ModifierAssignment_0 : ( ruleMemberModifier ) ;
    public final void rule__Field__ModifierAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:2371:1: ( ( ruleMemberModifier ) )
            // InternalModelEditorParser.g:2372:2: ( ruleMemberModifier )
            {
            // InternalModelEditorParser.g:2372:2: ( ruleMemberModifier )
            // InternalModelEditorParser.g:2373:3: ruleMemberModifier
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
    // InternalModelEditorParser.g:2382:1: rule__Field__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Field__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:2386:1: ( ( RULE_ID ) )
            // InternalModelEditorParser.g:2387:2: ( RULE_ID )
            {
            // InternalModelEditorParser.g:2387:2: ( RULE_ID )
            // InternalModelEditorParser.g:2388:3: RULE_ID
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
    // InternalModelEditorParser.g:2397:1: rule__Field__TypeAssignment_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Field__TypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:2401:1: ( ( ( ruleQualifiedName ) ) )
            // InternalModelEditorParser.g:2402:2: ( ( ruleQualifiedName ) )
            {
            // InternalModelEditorParser.g:2402:2: ( ( ruleQualifiedName ) )
            // InternalModelEditorParser.g:2403:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getFieldAccess().getTypeClassCrossReference_2_1_0()); 
            // InternalModelEditorParser.g:2404:3: ( ruleQualifiedName )
            // InternalModelEditorParser.g:2405:4: ruleQualifiedName
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
    // InternalModelEditorParser.g:2416:1: rule__Method__ModifierAssignment_0 : ( ruleMemberModifier ) ;
    public final void rule__Method__ModifierAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:2420:1: ( ( ruleMemberModifier ) )
            // InternalModelEditorParser.g:2421:2: ( ruleMemberModifier )
            {
            // InternalModelEditorParser.g:2421:2: ( ruleMemberModifier )
            // InternalModelEditorParser.g:2422:3: ruleMemberModifier
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
    // InternalModelEditorParser.g:2431:1: rule__Method__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Method__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:2435:1: ( ( RULE_ID ) )
            // InternalModelEditorParser.g:2436:2: ( RULE_ID )
            {
            // InternalModelEditorParser.g:2436:2: ( RULE_ID )
            // InternalModelEditorParser.g:2437:3: RULE_ID
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
    // InternalModelEditorParser.g:2446:1: rule__Method__TypesAssignment_3_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Method__TypesAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:2450:1: ( ( ( ruleQualifiedName ) ) )
            // InternalModelEditorParser.g:2451:2: ( ( ruleQualifiedName ) )
            {
            // InternalModelEditorParser.g:2451:2: ( ( ruleQualifiedName ) )
            // InternalModelEditorParser.g:2452:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getMethodAccess().getTypesClassCrossReference_3_0_0()); 
            // InternalModelEditorParser.g:2453:3: ( ruleQualifiedName )
            // InternalModelEditorParser.g:2454:4: ruleQualifiedName
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
    // InternalModelEditorParser.g:2465:1: rule__Method__TypesAssignment_3_1_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Method__TypesAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:2469:1: ( ( ( ruleQualifiedName ) ) )
            // InternalModelEditorParser.g:2470:2: ( ( ruleQualifiedName ) )
            {
            // InternalModelEditorParser.g:2470:2: ( ( ruleQualifiedName ) )
            // InternalModelEditorParser.g:2471:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getMethodAccess().getTypesClassCrossReference_3_1_1_0()); 
            // InternalModelEditorParser.g:2472:3: ( ruleQualifiedName )
            // InternalModelEditorParser.g:2473:4: ruleQualifiedName
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
    // InternalModelEditorParser.g:2484:1: rule__Method__TypeAssignment_5_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Method__TypeAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:2488:1: ( ( ( ruleQualifiedName ) ) )
            // InternalModelEditorParser.g:2489:2: ( ( ruleQualifiedName ) )
            {
            // InternalModelEditorParser.g:2489:2: ( ( ruleQualifiedName ) )
            // InternalModelEditorParser.g:2490:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getMethodAccess().getTypeClassCrossReference_5_1_0()); 
            // InternalModelEditorParser.g:2491:3: ( ruleQualifiedName )
            // InternalModelEditorParser.g:2492:4: ruleQualifiedName
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
    // InternalModelEditorParser.g:2503:1: rule__Method__LocAssignment_6_1_0 : ( RULE_INT ) ;
    public final void rule__Method__LocAssignment_6_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:2507:1: ( ( RULE_INT ) )
            // InternalModelEditorParser.g:2508:2: ( RULE_INT )
            {
            // InternalModelEditorParser.g:2508:2: ( RULE_INT )
            // InternalModelEditorParser.g:2509:3: RULE_INT
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
    // InternalModelEditorParser.g:2518:1: rule__Method__CycloAssignment_6_2_0 : ( RULE_INT ) ;
    public final void rule__Method__CycloAssignment_6_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:2522:1: ( ( RULE_INT ) )
            // InternalModelEditorParser.g:2523:2: ( RULE_INT )
            {
            // InternalModelEditorParser.g:2523:2: ( RULE_INT )
            // InternalModelEditorParser.g:2524:3: RULE_INT
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
    // InternalModelEditorParser.g:2533:1: rule__Method__AccessesAssignment_6_3 : ( ruleAccess ) ;
    public final void rule__Method__AccessesAssignment_6_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:2537:1: ( ( ruleAccess ) )
            // InternalModelEditorParser.g:2538:2: ( ruleAccess )
            {
            // InternalModelEditorParser.g:2538:2: ( ruleAccess )
            // InternalModelEditorParser.g:2539:3: ruleAccess
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
    // InternalModelEditorParser.g:2548:1: rule__Method__CallsAssignment_6_4 : ( ruleCall ) ;
    public final void rule__Method__CallsAssignment_6_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:2552:1: ( ( ruleCall ) )
            // InternalModelEditorParser.g:2553:2: ( ruleCall )
            {
            // InternalModelEditorParser.g:2553:2: ( ruleCall )
            // InternalModelEditorParser.g:2554:3: ruleCall
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
    // InternalModelEditorParser.g:2563:1: rule__Access__AccessesAssignment_0 : ( RULE_INT ) ;
    public final void rule__Access__AccessesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:2567:1: ( ( RULE_INT ) )
            // InternalModelEditorParser.g:2568:2: ( RULE_INT )
            {
            // InternalModelEditorParser.g:2568:2: ( RULE_INT )
            // InternalModelEditorParser.g:2569:3: RULE_INT
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
    // InternalModelEditorParser.g:2578:1: rule__Access__FieldAssignment_3 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Access__FieldAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:2582:1: ( ( ( ruleQualifiedName ) ) )
            // InternalModelEditorParser.g:2583:2: ( ( ruleQualifiedName ) )
            {
            // InternalModelEditorParser.g:2583:2: ( ( ruleQualifiedName ) )
            // InternalModelEditorParser.g:2584:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getAccessAccess().getFieldFieldCrossReference_3_0()); 
            // InternalModelEditorParser.g:2585:3: ( ruleQualifiedName )
            // InternalModelEditorParser.g:2586:4: ruleQualifiedName
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
    // InternalModelEditorParser.g:2597:1: rule__Call__CallsAssignment_0 : ( RULE_INT ) ;
    public final void rule__Call__CallsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:2601:1: ( ( RULE_INT ) )
            // InternalModelEditorParser.g:2602:2: ( RULE_INT )
            {
            // InternalModelEditorParser.g:2602:2: ( RULE_INT )
            // InternalModelEditorParser.g:2603:3: RULE_INT
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
    // InternalModelEditorParser.g:2612:1: rule__Call__MethodAssignment_3 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Call__MethodAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:2616:1: ( ( ( ruleQualifiedName ) ) )
            // InternalModelEditorParser.g:2617:2: ( ( ruleQualifiedName ) )
            {
            // InternalModelEditorParser.g:2617:2: ( ( ruleQualifiedName ) )
            // InternalModelEditorParser.g:2618:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getCallAccess().getMethodMethodCrossReference_3_0()); 
            // InternalModelEditorParser.g:2619:3: ( ruleQualifiedName )
            // InternalModelEditorParser.g:2620:4: ruleQualifiedName
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
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000A0000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000000300012A0L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000000200012A2L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000000200012A0L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00000000A0800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000050000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000440L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000800000L});

}