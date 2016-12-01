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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Protected", "Accesses", "Constant", "Extends", "Private", "Access", "Import", "Public", "Calls", "Class", "Cyclo", "Lines", "Call", "Code", "FullStopAsterisk", "Of", "To", "LeftParenthesis", "RightParenthesis", "Comma", "FullStop", "Colon", "RULE_BEGIN", "RULE_END", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int RULE_END=27;
    public static final int Import=10;
    public static final int RULE_BEGIN=26;
    public static final int Constant=6;
    public static final int Access=9;
    public static final int RULE_STRING=30;
    public static final int RULE_SL_COMMENT=32;
    public static final int Comma=23;
    public static final int LeftParenthesis=21;
    public static final int Accesses=5;
    public static final int Private=8;
    public static final int To=20;
    public static final int Colon=25;
    public static final int Extends=7;
    public static final int EOF=-1;
    public static final int Call=16;
    public static final int FullStop=24;
    public static final int Protected=4;
    public static final int RULE_ID=28;
    public static final int RULE_WS=33;
    public static final int Calls=12;
    public static final int RightParenthesis=22;
    public static final int Public=11;
    public static final int RULE_ANY_OTHER=34;
    public static final int Code=17;
    public static final int RULE_INT=29;
    public static final int FullStopAsterisk=18;
    public static final int Of=19;
    public static final int Cyclo=14;
    public static final int RULE_ML_COMMENT=31;
    public static final int Class=13;
    public static final int Lines=15;

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
    // InternalModelEditorParser.g:77:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalModelEditorParser.g:78:1: ( ruleModel EOF )
            // InternalModelEditorParser.g:79:1: ruleModel EOF
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
    // InternalModelEditorParser.g:86:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:90:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalModelEditorParser.g:91:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalModelEditorParser.g:91:2: ( ( rule__Model__Group__0 ) )
            // InternalModelEditorParser.g:92:3: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalModelEditorParser.g:93:3: ( rule__Model__Group__0 )
            // InternalModelEditorParser.g:93:4: rule__Model__Group__0
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
    // InternalModelEditorParser.g:102:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // InternalModelEditorParser.g:103:1: ( ruleImport EOF )
            // InternalModelEditorParser.g:104:1: ruleImport EOF
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
    // InternalModelEditorParser.g:111:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:115:2: ( ( ( rule__Import__Group__0 ) ) )
            // InternalModelEditorParser.g:116:2: ( ( rule__Import__Group__0 ) )
            {
            // InternalModelEditorParser.g:116:2: ( ( rule__Import__Group__0 ) )
            // InternalModelEditorParser.g:117:3: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // InternalModelEditorParser.g:118:3: ( rule__Import__Group__0 )
            // InternalModelEditorParser.g:118:4: rule__Import__Group__0
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
    // InternalModelEditorParser.g:127:1: entryRuleQualifiedNameWithWildcard : ruleQualifiedNameWithWildcard EOF ;
    public final void entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        try {
            // InternalModelEditorParser.g:128:1: ( ruleQualifiedNameWithWildcard EOF )
            // InternalModelEditorParser.g:129:1: ruleQualifiedNameWithWildcard EOF
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
    // InternalModelEditorParser.g:136:1: ruleQualifiedNameWithWildcard : ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) ;
    public final void ruleQualifiedNameWithWildcard() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:140:2: ( ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) )
            // InternalModelEditorParser.g:141:2: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            {
            // InternalModelEditorParser.g:141:2: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            // InternalModelEditorParser.g:142:3: ( rule__QualifiedNameWithWildcard__Group__0 )
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); 
            // InternalModelEditorParser.g:143:3: ( rule__QualifiedNameWithWildcard__Group__0 )
            // InternalModelEditorParser.g:143:4: rule__QualifiedNameWithWildcard__Group__0
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
    // InternalModelEditorParser.g:152:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalModelEditorParser.g:153:1: ( ruleQualifiedName EOF )
            // InternalModelEditorParser.g:154:1: ruleQualifiedName EOF
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
    // InternalModelEditorParser.g:161:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:165:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalModelEditorParser.g:166:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalModelEditorParser.g:166:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalModelEditorParser.g:167:3: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // InternalModelEditorParser.g:168:3: ( rule__QualifiedName__Group__0 )
            // InternalModelEditorParser.g:168:4: rule__QualifiedName__Group__0
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
    // InternalModelEditorParser.g:177:1: entryRuleClass : ruleClass EOF ;
    public final void entryRuleClass() throws RecognitionException {
        try {
            // InternalModelEditorParser.g:178:1: ( ruleClass EOF )
            // InternalModelEditorParser.g:179:1: ruleClass EOF
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
    // InternalModelEditorParser.g:186:1: ruleClass : ( ( rule__Class__Group__0 ) ) ;
    public final void ruleClass() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:190:2: ( ( ( rule__Class__Group__0 ) ) )
            // InternalModelEditorParser.g:191:2: ( ( rule__Class__Group__0 ) )
            {
            // InternalModelEditorParser.g:191:2: ( ( rule__Class__Group__0 ) )
            // InternalModelEditorParser.g:192:3: ( rule__Class__Group__0 )
            {
             before(grammarAccess.getClassAccess().getGroup()); 
            // InternalModelEditorParser.g:193:3: ( rule__Class__Group__0 )
            // InternalModelEditorParser.g:193:4: rule__Class__Group__0
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
    // InternalModelEditorParser.g:202:1: entryRuleField : ruleField EOF ;
    public final void entryRuleField() throws RecognitionException {
        try {
            // InternalModelEditorParser.g:203:1: ( ruleField EOF )
            // InternalModelEditorParser.g:204:1: ruleField EOF
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
    // InternalModelEditorParser.g:211:1: ruleField : ( ( rule__Field__Group__0 ) ) ;
    public final void ruleField() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:215:2: ( ( ( rule__Field__Group__0 ) ) )
            // InternalModelEditorParser.g:216:2: ( ( rule__Field__Group__0 ) )
            {
            // InternalModelEditorParser.g:216:2: ( ( rule__Field__Group__0 ) )
            // InternalModelEditorParser.g:217:3: ( rule__Field__Group__0 )
            {
             before(grammarAccess.getFieldAccess().getGroup()); 
            // InternalModelEditorParser.g:218:3: ( rule__Field__Group__0 )
            // InternalModelEditorParser.g:218:4: rule__Field__Group__0
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
    // InternalModelEditorParser.g:227:1: entryRuleMethod : ruleMethod EOF ;
    public final void entryRuleMethod() throws RecognitionException {
        try {
            // InternalModelEditorParser.g:228:1: ( ruleMethod EOF )
            // InternalModelEditorParser.g:229:1: ruleMethod EOF
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
    // InternalModelEditorParser.g:236:1: ruleMethod : ( ( rule__Method__Group__0 ) ) ;
    public final void ruleMethod() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:240:2: ( ( ( rule__Method__Group__0 ) ) )
            // InternalModelEditorParser.g:241:2: ( ( rule__Method__Group__0 ) )
            {
            // InternalModelEditorParser.g:241:2: ( ( rule__Method__Group__0 ) )
            // InternalModelEditorParser.g:242:3: ( rule__Method__Group__0 )
            {
             before(grammarAccess.getMethodAccess().getGroup()); 
            // InternalModelEditorParser.g:243:3: ( rule__Method__Group__0 )
            // InternalModelEditorParser.g:243:4: rule__Method__Group__0
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
    // InternalModelEditorParser.g:252:1: entryRuleMemberModifier : ruleMemberModifier EOF ;
    public final void entryRuleMemberModifier() throws RecognitionException {
        try {
            // InternalModelEditorParser.g:253:1: ( ruleMemberModifier EOF )
            // InternalModelEditorParser.g:254:1: ruleMemberModifier EOF
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
    // InternalModelEditorParser.g:261:1: ruleMemberModifier : ( ( rule__MemberModifier__Alternatives ) ) ;
    public final void ruleMemberModifier() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:265:2: ( ( ( rule__MemberModifier__Alternatives ) ) )
            // InternalModelEditorParser.g:266:2: ( ( rule__MemberModifier__Alternatives ) )
            {
            // InternalModelEditorParser.g:266:2: ( ( rule__MemberModifier__Alternatives ) )
            // InternalModelEditorParser.g:267:3: ( rule__MemberModifier__Alternatives )
            {
             before(grammarAccess.getMemberModifierAccess().getAlternatives()); 
            // InternalModelEditorParser.g:268:3: ( rule__MemberModifier__Alternatives )
            // InternalModelEditorParser.g:268:4: rule__MemberModifier__Alternatives
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
    // InternalModelEditorParser.g:277:1: entryRuleClassModifier : ruleClassModifier EOF ;
    public final void entryRuleClassModifier() throws RecognitionException {
        try {
            // InternalModelEditorParser.g:278:1: ( ruleClassModifier EOF )
            // InternalModelEditorParser.g:279:1: ruleClassModifier EOF
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
    // InternalModelEditorParser.g:286:1: ruleClassModifier : ( ( rule__ClassModifier__Alternatives ) ) ;
    public final void ruleClassModifier() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:290:2: ( ( ( rule__ClassModifier__Alternatives ) ) )
            // InternalModelEditorParser.g:291:2: ( ( rule__ClassModifier__Alternatives ) )
            {
            // InternalModelEditorParser.g:291:2: ( ( rule__ClassModifier__Alternatives ) )
            // InternalModelEditorParser.g:292:3: ( rule__ClassModifier__Alternatives )
            {
             before(grammarAccess.getClassModifierAccess().getAlternatives()); 
            // InternalModelEditorParser.g:293:3: ( rule__ClassModifier__Alternatives )
            // InternalModelEditorParser.g:293:4: rule__ClassModifier__Alternatives
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
    // InternalModelEditorParser.g:302:1: entryRuleAccess : ruleAccess EOF ;
    public final void entryRuleAccess() throws RecognitionException {
        try {
            // InternalModelEditorParser.g:303:1: ( ruleAccess EOF )
            // InternalModelEditorParser.g:304:1: ruleAccess EOF
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
    // InternalModelEditorParser.g:311:1: ruleAccess : ( ( rule__Access__Group__0 ) ) ;
    public final void ruleAccess() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:315:2: ( ( ( rule__Access__Group__0 ) ) )
            // InternalModelEditorParser.g:316:2: ( ( rule__Access__Group__0 ) )
            {
            // InternalModelEditorParser.g:316:2: ( ( rule__Access__Group__0 ) )
            // InternalModelEditorParser.g:317:3: ( rule__Access__Group__0 )
            {
             before(grammarAccess.getAccessAccess().getGroup()); 
            // InternalModelEditorParser.g:318:3: ( rule__Access__Group__0 )
            // InternalModelEditorParser.g:318:4: rule__Access__Group__0
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
    // InternalModelEditorParser.g:327:1: entryRuleCall : ruleCall EOF ;
    public final void entryRuleCall() throws RecognitionException {
        try {
            // InternalModelEditorParser.g:328:1: ( ruleCall EOF )
            // InternalModelEditorParser.g:329:1: ruleCall EOF
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
    // InternalModelEditorParser.g:336:1: ruleCall : ( ( rule__Call__Group__0 ) ) ;
    public final void ruleCall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:340:2: ( ( ( rule__Call__Group__0 ) ) )
            // InternalModelEditorParser.g:341:2: ( ( rule__Call__Group__0 ) )
            {
            // InternalModelEditorParser.g:341:2: ( ( rule__Call__Group__0 ) )
            // InternalModelEditorParser.g:342:3: ( rule__Call__Group__0 )
            {
             before(grammarAccess.getCallAccess().getGroup()); 
            // InternalModelEditorParser.g:343:3: ( rule__Call__Group__0 )
            // InternalModelEditorParser.g:343:4: rule__Call__Group__0
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


    // $ANTLR start "rule__MemberModifier__Alternatives"
    // InternalModelEditorParser.g:351:1: rule__MemberModifier__Alternatives : ( ( Public ) | ( Private ) | ( Protected ) | ( Constant ) );
    public final void rule__MemberModifier__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:355:1: ( ( Public ) | ( Private ) | ( Protected ) | ( Constant ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case Public:
                {
                alt1=1;
                }
                break;
            case Private:
                {
                alt1=2;
                }
                break;
            case Protected:
                {
                alt1=3;
                }
                break;
            case Constant:
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalModelEditorParser.g:356:2: ( Public )
                    {
                    // InternalModelEditorParser.g:356:2: ( Public )
                    // InternalModelEditorParser.g:357:3: Public
                    {
                     before(grammarAccess.getMemberModifierAccess().getPublicKeyword_0()); 
                    match(input,Public,FOLLOW_2); 
                     after(grammarAccess.getMemberModifierAccess().getPublicKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalModelEditorParser.g:362:2: ( Private )
                    {
                    // InternalModelEditorParser.g:362:2: ( Private )
                    // InternalModelEditorParser.g:363:3: Private
                    {
                     before(grammarAccess.getMemberModifierAccess().getPrivateKeyword_1()); 
                    match(input,Private,FOLLOW_2); 
                     after(grammarAccess.getMemberModifierAccess().getPrivateKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalModelEditorParser.g:368:2: ( Protected )
                    {
                    // InternalModelEditorParser.g:368:2: ( Protected )
                    // InternalModelEditorParser.g:369:3: Protected
                    {
                     before(grammarAccess.getMemberModifierAccess().getProtectedKeyword_2()); 
                    match(input,Protected,FOLLOW_2); 
                     after(grammarAccess.getMemberModifierAccess().getProtectedKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalModelEditorParser.g:374:2: ( Constant )
                    {
                    // InternalModelEditorParser.g:374:2: ( Constant )
                    // InternalModelEditorParser.g:375:3: Constant
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
    // InternalModelEditorParser.g:384:1: rule__ClassModifier__Alternatives : ( ( Public ) | ( Private ) | ( Constant ) );
    public final void rule__ClassModifier__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:388:1: ( ( Public ) | ( Private ) | ( Constant ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case Public:
                {
                alt2=1;
                }
                break;
            case Private:
                {
                alt2=2;
                }
                break;
            case Constant:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalModelEditorParser.g:389:2: ( Public )
                    {
                    // InternalModelEditorParser.g:389:2: ( Public )
                    // InternalModelEditorParser.g:390:3: Public
                    {
                     before(grammarAccess.getClassModifierAccess().getPublicKeyword_0()); 
                    match(input,Public,FOLLOW_2); 
                     after(grammarAccess.getClassModifierAccess().getPublicKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalModelEditorParser.g:395:2: ( Private )
                    {
                    // InternalModelEditorParser.g:395:2: ( Private )
                    // InternalModelEditorParser.g:396:3: Private
                    {
                     before(grammarAccess.getClassModifierAccess().getPrivateKeyword_1()); 
                    match(input,Private,FOLLOW_2); 
                     after(grammarAccess.getClassModifierAccess().getPrivateKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalModelEditorParser.g:401:2: ( Constant )
                    {
                    // InternalModelEditorParser.g:401:2: ( Constant )
                    // InternalModelEditorParser.g:402:3: Constant
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
    // InternalModelEditorParser.g:411:1: rule__Access__Alternatives_1 : ( ( Access ) | ( Accesses ) );
    public final void rule__Access__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:415:1: ( ( Access ) | ( Accesses ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==Access) ) {
                alt3=1;
            }
            else if ( (LA3_0==Accesses) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalModelEditorParser.g:416:2: ( Access )
                    {
                    // InternalModelEditorParser.g:416:2: ( Access )
                    // InternalModelEditorParser.g:417:3: Access
                    {
                     before(grammarAccess.getAccessAccess().getAccessKeyword_1_0()); 
                    match(input,Access,FOLLOW_2); 
                     after(grammarAccess.getAccessAccess().getAccessKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalModelEditorParser.g:422:2: ( Accesses )
                    {
                    // InternalModelEditorParser.g:422:2: ( Accesses )
                    // InternalModelEditorParser.g:423:3: Accesses
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
    // InternalModelEditorParser.g:432:1: rule__Call__Alternatives_1 : ( ( Call ) | ( Calls ) );
    public final void rule__Call__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:436:1: ( ( Call ) | ( Calls ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==Call) ) {
                alt4=1;
            }
            else if ( (LA4_0==Calls) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalModelEditorParser.g:437:2: ( Call )
                    {
                    // InternalModelEditorParser.g:437:2: ( Call )
                    // InternalModelEditorParser.g:438:3: Call
                    {
                     before(grammarAccess.getCallAccess().getCallKeyword_1_0()); 
                    match(input,Call,FOLLOW_2); 
                     after(grammarAccess.getCallAccess().getCallKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalModelEditorParser.g:443:2: ( Calls )
                    {
                    // InternalModelEditorParser.g:443:2: ( Calls )
                    // InternalModelEditorParser.g:444:3: Calls
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
    // InternalModelEditorParser.g:453:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:457:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalModelEditorParser.g:458:2: rule__Model__Group__0__Impl rule__Model__Group__1
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
    // InternalModelEditorParser.g:465:1: rule__Model__Group__0__Impl : ( ( rule__Model__ImportsAssignment_0 )* ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:469:1: ( ( ( rule__Model__ImportsAssignment_0 )* ) )
            // InternalModelEditorParser.g:470:1: ( ( rule__Model__ImportsAssignment_0 )* )
            {
            // InternalModelEditorParser.g:470:1: ( ( rule__Model__ImportsAssignment_0 )* )
            // InternalModelEditorParser.g:471:2: ( rule__Model__ImportsAssignment_0 )*
            {
             before(grammarAccess.getModelAccess().getImportsAssignment_0()); 
            // InternalModelEditorParser.g:472:2: ( rule__Model__ImportsAssignment_0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==Import) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalModelEditorParser.g:472:3: rule__Model__ImportsAssignment_0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Model__ImportsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
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
    // InternalModelEditorParser.g:480:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:484:1: ( rule__Model__Group__1__Impl )
            // InternalModelEditorParser.g:485:2: rule__Model__Group__1__Impl
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
    // InternalModelEditorParser.g:491:1: rule__Model__Group__1__Impl : ( ( rule__Model__ClassesAssignment_1 )* ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:495:1: ( ( ( rule__Model__ClassesAssignment_1 )* ) )
            // InternalModelEditorParser.g:496:1: ( ( rule__Model__ClassesAssignment_1 )* )
            {
            // InternalModelEditorParser.g:496:1: ( ( rule__Model__ClassesAssignment_1 )* )
            // InternalModelEditorParser.g:497:2: ( rule__Model__ClassesAssignment_1 )*
            {
             before(grammarAccess.getModelAccess().getClassesAssignment_1()); 
            // InternalModelEditorParser.g:498:2: ( rule__Model__ClassesAssignment_1 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==Constant||LA6_0==Private||LA6_0==Public||LA6_0==Class) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalModelEditorParser.g:498:3: rule__Model__ClassesAssignment_1
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Model__ClassesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // InternalModelEditorParser.g:507:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:511:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalModelEditorParser.g:512:2: rule__Import__Group__0__Impl rule__Import__Group__1
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
    // InternalModelEditorParser.g:519:1: rule__Import__Group__0__Impl : ( Import ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:523:1: ( ( Import ) )
            // InternalModelEditorParser.g:524:1: ( Import )
            {
            // InternalModelEditorParser.g:524:1: ( Import )
            // InternalModelEditorParser.g:525:2: Import
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
    // InternalModelEditorParser.g:534:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:538:1: ( rule__Import__Group__1__Impl )
            // InternalModelEditorParser.g:539:2: rule__Import__Group__1__Impl
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
    // InternalModelEditorParser.g:545:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:549:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // InternalModelEditorParser.g:550:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // InternalModelEditorParser.g:550:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // InternalModelEditorParser.g:551:2: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            // InternalModelEditorParser.g:552:2: ( rule__Import__ImportedNamespaceAssignment_1 )
            // InternalModelEditorParser.g:552:3: rule__Import__ImportedNamespaceAssignment_1
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
    // InternalModelEditorParser.g:561:1: rule__QualifiedNameWithWildcard__Group__0 : rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 ;
    public final void rule__QualifiedNameWithWildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:565:1: ( rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 )
            // InternalModelEditorParser.g:566:2: rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1
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
    // InternalModelEditorParser.g:573:1: rule__QualifiedNameWithWildcard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:577:1: ( ( ruleQualifiedName ) )
            // InternalModelEditorParser.g:578:1: ( ruleQualifiedName )
            {
            // InternalModelEditorParser.g:578:1: ( ruleQualifiedName )
            // InternalModelEditorParser.g:579:2: ruleQualifiedName
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
    // InternalModelEditorParser.g:588:1: rule__QualifiedNameWithWildcard__Group__1 : rule__QualifiedNameWithWildcard__Group__1__Impl ;
    public final void rule__QualifiedNameWithWildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:592:1: ( rule__QualifiedNameWithWildcard__Group__1__Impl )
            // InternalModelEditorParser.g:593:2: rule__QualifiedNameWithWildcard__Group__1__Impl
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
    // InternalModelEditorParser.g:599:1: rule__QualifiedNameWithWildcard__Group__1__Impl : ( ( FullStopAsterisk )? ) ;
    public final void rule__QualifiedNameWithWildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:603:1: ( ( ( FullStopAsterisk )? ) )
            // InternalModelEditorParser.g:604:1: ( ( FullStopAsterisk )? )
            {
            // InternalModelEditorParser.g:604:1: ( ( FullStopAsterisk )? )
            // InternalModelEditorParser.g:605:2: ( FullStopAsterisk )?
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
            // InternalModelEditorParser.g:606:2: ( FullStopAsterisk )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==FullStopAsterisk) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalModelEditorParser.g:606:3: FullStopAsterisk
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
    // InternalModelEditorParser.g:615:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:619:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalModelEditorParser.g:620:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
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
    // InternalModelEditorParser.g:627:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:631:1: ( ( RULE_ID ) )
            // InternalModelEditorParser.g:632:1: ( RULE_ID )
            {
            // InternalModelEditorParser.g:632:1: ( RULE_ID )
            // InternalModelEditorParser.g:633:2: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
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
    // InternalModelEditorParser.g:642:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:646:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalModelEditorParser.g:647:2: rule__QualifiedName__Group__1__Impl
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
    // InternalModelEditorParser.g:653:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:657:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalModelEditorParser.g:658:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalModelEditorParser.g:658:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalModelEditorParser.g:659:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalModelEditorParser.g:660:2: ( rule__QualifiedName__Group_1__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==FullStop) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalModelEditorParser.g:660:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // InternalModelEditorParser.g:669:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:673:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalModelEditorParser.g:674:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_6);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1();

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
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // InternalModelEditorParser.g:681:1: rule__QualifiedName__Group_1__0__Impl : ( FullStop ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:685:1: ( ( FullStop ) )
            // InternalModelEditorParser.g:686:1: ( FullStop )
            {
            // InternalModelEditorParser.g:686:1: ( FullStop )
            // InternalModelEditorParser.g:687:2: FullStop
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,FullStop,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // InternalModelEditorParser.g:696:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:700:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalModelEditorParser.g:701:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1__Impl();

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
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // InternalModelEditorParser.g:707:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:711:1: ( ( RULE_ID ) )
            // InternalModelEditorParser.g:712:1: ( RULE_ID )
            {
            // InternalModelEditorParser.g:712:1: ( RULE_ID )
            // InternalModelEditorParser.g:713:2: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__Class__Group__0"
    // InternalModelEditorParser.g:723:1: rule__Class__Group__0 : rule__Class__Group__0__Impl rule__Class__Group__1 ;
    public final void rule__Class__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:727:1: ( rule__Class__Group__0__Impl rule__Class__Group__1 )
            // InternalModelEditorParser.g:728:2: rule__Class__Group__0__Impl rule__Class__Group__1
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
    // InternalModelEditorParser.g:735:1: rule__Class__Group__0__Impl : ( ( rule__Class__ModifierAssignment_0 )? ) ;
    public final void rule__Class__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:739:1: ( ( ( rule__Class__ModifierAssignment_0 )? ) )
            // InternalModelEditorParser.g:740:1: ( ( rule__Class__ModifierAssignment_0 )? )
            {
            // InternalModelEditorParser.g:740:1: ( ( rule__Class__ModifierAssignment_0 )? )
            // InternalModelEditorParser.g:741:2: ( rule__Class__ModifierAssignment_0 )?
            {
             before(grammarAccess.getClassAccess().getModifierAssignment_0()); 
            // InternalModelEditorParser.g:742:2: ( rule__Class__ModifierAssignment_0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==Constant||LA9_0==Private||LA9_0==Public) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalModelEditorParser.g:742:3: rule__Class__ModifierAssignment_0
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
    // InternalModelEditorParser.g:750:1: rule__Class__Group__1 : rule__Class__Group__1__Impl rule__Class__Group__2 ;
    public final void rule__Class__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:754:1: ( rule__Class__Group__1__Impl rule__Class__Group__2 )
            // InternalModelEditorParser.g:755:2: rule__Class__Group__1__Impl rule__Class__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalModelEditorParser.g:762:1: rule__Class__Group__1__Impl : ( Class ) ;
    public final void rule__Class__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:766:1: ( ( Class ) )
            // InternalModelEditorParser.g:767:1: ( Class )
            {
            // InternalModelEditorParser.g:767:1: ( Class )
            // InternalModelEditorParser.g:768:2: Class
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
    // InternalModelEditorParser.g:777:1: rule__Class__Group__2 : rule__Class__Group__2__Impl rule__Class__Group__3 ;
    public final void rule__Class__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:781:1: ( rule__Class__Group__2__Impl rule__Class__Group__3 )
            // InternalModelEditorParser.g:782:2: rule__Class__Group__2__Impl rule__Class__Group__3
            {
            pushFollow(FOLLOW_10);
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
    // InternalModelEditorParser.g:789:1: rule__Class__Group__2__Impl : ( ( rule__Class__NameAssignment_2 ) ) ;
    public final void rule__Class__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:793:1: ( ( ( rule__Class__NameAssignment_2 ) ) )
            // InternalModelEditorParser.g:794:1: ( ( rule__Class__NameAssignment_2 ) )
            {
            // InternalModelEditorParser.g:794:1: ( ( rule__Class__NameAssignment_2 ) )
            // InternalModelEditorParser.g:795:2: ( rule__Class__NameAssignment_2 )
            {
             before(grammarAccess.getClassAccess().getNameAssignment_2()); 
            // InternalModelEditorParser.g:796:2: ( rule__Class__NameAssignment_2 )
            // InternalModelEditorParser.g:796:3: rule__Class__NameAssignment_2
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
    // InternalModelEditorParser.g:804:1: rule__Class__Group__3 : rule__Class__Group__3__Impl rule__Class__Group__4 ;
    public final void rule__Class__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:808:1: ( rule__Class__Group__3__Impl rule__Class__Group__4 )
            // InternalModelEditorParser.g:809:2: rule__Class__Group__3__Impl rule__Class__Group__4
            {
            pushFollow(FOLLOW_10);
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
    // InternalModelEditorParser.g:816:1: rule__Class__Group__3__Impl : ( ( rule__Class__Group_3__0 )? ) ;
    public final void rule__Class__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:820:1: ( ( ( rule__Class__Group_3__0 )? ) )
            // InternalModelEditorParser.g:821:1: ( ( rule__Class__Group_3__0 )? )
            {
            // InternalModelEditorParser.g:821:1: ( ( rule__Class__Group_3__0 )? )
            // InternalModelEditorParser.g:822:2: ( rule__Class__Group_3__0 )?
            {
             before(grammarAccess.getClassAccess().getGroup_3()); 
            // InternalModelEditorParser.g:823:2: ( rule__Class__Group_3__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==Extends) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalModelEditorParser.g:823:3: rule__Class__Group_3__0
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
    // InternalModelEditorParser.g:831:1: rule__Class__Group__4 : rule__Class__Group__4__Impl ;
    public final void rule__Class__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:835:1: ( rule__Class__Group__4__Impl )
            // InternalModelEditorParser.g:836:2: rule__Class__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Class__Group__4__Impl();

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
    // InternalModelEditorParser.g:842:1: rule__Class__Group__4__Impl : ( ( rule__Class__Group_4__0 )? ) ;
    public final void rule__Class__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:846:1: ( ( ( rule__Class__Group_4__0 )? ) )
            // InternalModelEditorParser.g:847:1: ( ( rule__Class__Group_4__0 )? )
            {
            // InternalModelEditorParser.g:847:1: ( ( rule__Class__Group_4__0 )? )
            // InternalModelEditorParser.g:848:2: ( rule__Class__Group_4__0 )?
            {
             before(grammarAccess.getClassAccess().getGroup_4()); 
            // InternalModelEditorParser.g:849:2: ( rule__Class__Group_4__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_BEGIN) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalModelEditorParser.g:849:3: rule__Class__Group_4__0
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


    // $ANTLR start "rule__Class__Group_3__0"
    // InternalModelEditorParser.g:858:1: rule__Class__Group_3__0 : rule__Class__Group_3__0__Impl rule__Class__Group_3__1 ;
    public final void rule__Class__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:862:1: ( rule__Class__Group_3__0__Impl rule__Class__Group_3__1 )
            // InternalModelEditorParser.g:863:2: rule__Class__Group_3__0__Impl rule__Class__Group_3__1
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
    // InternalModelEditorParser.g:870:1: rule__Class__Group_3__0__Impl : ( Extends ) ;
    public final void rule__Class__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:874:1: ( ( Extends ) )
            // InternalModelEditorParser.g:875:1: ( Extends )
            {
            // InternalModelEditorParser.g:875:1: ( Extends )
            // InternalModelEditorParser.g:876:2: Extends
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
    // InternalModelEditorParser.g:885:1: rule__Class__Group_3__1 : rule__Class__Group_3__1__Impl ;
    public final void rule__Class__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:889:1: ( rule__Class__Group_3__1__Impl )
            // InternalModelEditorParser.g:890:2: rule__Class__Group_3__1__Impl
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
    // InternalModelEditorParser.g:896:1: rule__Class__Group_3__1__Impl : ( ( rule__Class__SuperTypeAssignment_3_1 ) ) ;
    public final void rule__Class__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:900:1: ( ( ( rule__Class__SuperTypeAssignment_3_1 ) ) )
            // InternalModelEditorParser.g:901:1: ( ( rule__Class__SuperTypeAssignment_3_1 ) )
            {
            // InternalModelEditorParser.g:901:1: ( ( rule__Class__SuperTypeAssignment_3_1 ) )
            // InternalModelEditorParser.g:902:2: ( rule__Class__SuperTypeAssignment_3_1 )
            {
             before(grammarAccess.getClassAccess().getSuperTypeAssignment_3_1()); 
            // InternalModelEditorParser.g:903:2: ( rule__Class__SuperTypeAssignment_3_1 )
            // InternalModelEditorParser.g:903:3: rule__Class__SuperTypeAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Class__SuperTypeAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getSuperTypeAssignment_3_1()); 

            }


            }

        }
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
    // InternalModelEditorParser.g:912:1: rule__Class__Group_4__0 : rule__Class__Group_4__0__Impl rule__Class__Group_4__1 ;
    public final void rule__Class__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:916:1: ( rule__Class__Group_4__0__Impl rule__Class__Group_4__1 )
            // InternalModelEditorParser.g:917:2: rule__Class__Group_4__0__Impl rule__Class__Group_4__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalModelEditorParser.g:924:1: rule__Class__Group_4__0__Impl : ( RULE_BEGIN ) ;
    public final void rule__Class__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:928:1: ( ( RULE_BEGIN ) )
            // InternalModelEditorParser.g:929:1: ( RULE_BEGIN )
            {
            // InternalModelEditorParser.g:929:1: ( RULE_BEGIN )
            // InternalModelEditorParser.g:930:2: RULE_BEGIN
            {
             before(grammarAccess.getClassAccess().getBEGINTerminalRuleCall_4_0()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getBEGINTerminalRuleCall_4_0()); 

            }


            }

        }
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
    // InternalModelEditorParser.g:939:1: rule__Class__Group_4__1 : rule__Class__Group_4__1__Impl rule__Class__Group_4__2 ;
    public final void rule__Class__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:943:1: ( rule__Class__Group_4__1__Impl rule__Class__Group_4__2 )
            // InternalModelEditorParser.g:944:2: rule__Class__Group_4__1__Impl rule__Class__Group_4__2
            {
            pushFollow(FOLLOW_11);
            rule__Class__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group_4__2();

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
    // InternalModelEditorParser.g:951:1: rule__Class__Group_4__1__Impl : ( ( rule__Class__FieldsAssignment_4_1 )* ) ;
    public final void rule__Class__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:955:1: ( ( ( rule__Class__FieldsAssignment_4_1 )* ) )
            // InternalModelEditorParser.g:956:1: ( ( rule__Class__FieldsAssignment_4_1 )* )
            {
            // InternalModelEditorParser.g:956:1: ( ( rule__Class__FieldsAssignment_4_1 )* )
            // InternalModelEditorParser.g:957:2: ( rule__Class__FieldsAssignment_4_1 )*
            {
             before(grammarAccess.getClassAccess().getFieldsAssignment_4_1()); 
            // InternalModelEditorParser.g:958:2: ( rule__Class__FieldsAssignment_4_1 )*
            loop12:
            do {
                int alt12=2;
                switch ( input.LA(1) ) {
                case Public:
                    {
                    int LA12_1 = input.LA(2);

                    if ( (LA12_1==RULE_ID) ) {
                        int LA12_5 = input.LA(3);

                        if ( (LA12_5==Protected||LA12_5==Constant||LA12_5==Private||LA12_5==Public||LA12_5==Colon||(LA12_5>=RULE_END && LA12_5<=RULE_ID)) ) {
                            alt12=1;
                        }


                    }


                    }
                    break;
                case Private:
                    {
                    int LA12_2 = input.LA(2);

                    if ( (LA12_2==RULE_ID) ) {
                        int LA12_5 = input.LA(3);

                        if ( (LA12_5==Protected||LA12_5==Constant||LA12_5==Private||LA12_5==Public||LA12_5==Colon||(LA12_5>=RULE_END && LA12_5<=RULE_ID)) ) {
                            alt12=1;
                        }


                    }


                    }
                    break;
                case Protected:
                    {
                    int LA12_3 = input.LA(2);

                    if ( (LA12_3==RULE_ID) ) {
                        int LA12_5 = input.LA(3);

                        if ( (LA12_5==Protected||LA12_5==Constant||LA12_5==Private||LA12_5==Public||LA12_5==Colon||(LA12_5>=RULE_END && LA12_5<=RULE_ID)) ) {
                            alt12=1;
                        }


                    }


                    }
                    break;
                case Constant:
                    {
                    int LA12_4 = input.LA(2);

                    if ( (LA12_4==RULE_ID) ) {
                        int LA12_5 = input.LA(3);

                        if ( (LA12_5==Protected||LA12_5==Constant||LA12_5==Private||LA12_5==Public||LA12_5==Colon||(LA12_5>=RULE_END && LA12_5<=RULE_ID)) ) {
                            alt12=1;
                        }


                    }


                    }
                    break;
                case RULE_ID:
                    {
                    int LA12_5 = input.LA(2);

                    if ( (LA12_5==Protected||LA12_5==Constant||LA12_5==Private||LA12_5==Public||LA12_5==Colon||(LA12_5>=RULE_END && LA12_5<=RULE_ID)) ) {
                        alt12=1;
                    }


                    }
                    break;

                }

                switch (alt12) {
            	case 1 :
            	    // InternalModelEditorParser.g:958:3: rule__Class__FieldsAssignment_4_1
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Class__FieldsAssignment_4_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getClassAccess().getFieldsAssignment_4_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Class__Group_4__2"
    // InternalModelEditorParser.g:966:1: rule__Class__Group_4__2 : rule__Class__Group_4__2__Impl rule__Class__Group_4__3 ;
    public final void rule__Class__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:970:1: ( rule__Class__Group_4__2__Impl rule__Class__Group_4__3 )
            // InternalModelEditorParser.g:971:2: rule__Class__Group_4__2__Impl rule__Class__Group_4__3
            {
            pushFollow(FOLLOW_11);
            rule__Class__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group_4__3();

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
    // $ANTLR end "rule__Class__Group_4__2"


    // $ANTLR start "rule__Class__Group_4__2__Impl"
    // InternalModelEditorParser.g:978:1: rule__Class__Group_4__2__Impl : ( ( rule__Class__MethodsAssignment_4_2 )* ) ;
    public final void rule__Class__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:982:1: ( ( ( rule__Class__MethodsAssignment_4_2 )* ) )
            // InternalModelEditorParser.g:983:1: ( ( rule__Class__MethodsAssignment_4_2 )* )
            {
            // InternalModelEditorParser.g:983:1: ( ( rule__Class__MethodsAssignment_4_2 )* )
            // InternalModelEditorParser.g:984:2: ( rule__Class__MethodsAssignment_4_2 )*
            {
             before(grammarAccess.getClassAccess().getMethodsAssignment_4_2()); 
            // InternalModelEditorParser.g:985:2: ( rule__Class__MethodsAssignment_4_2 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==Protected||LA13_0==Constant||LA13_0==Private||LA13_0==Public||LA13_0==RULE_ID) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalModelEditorParser.g:985:3: rule__Class__MethodsAssignment_4_2
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Class__MethodsAssignment_4_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getClassAccess().getMethodsAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_4__2__Impl"


    // $ANTLR start "rule__Class__Group_4__3"
    // InternalModelEditorParser.g:993:1: rule__Class__Group_4__3 : rule__Class__Group_4__3__Impl ;
    public final void rule__Class__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:997:1: ( rule__Class__Group_4__3__Impl )
            // InternalModelEditorParser.g:998:2: rule__Class__Group_4__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Class__Group_4__3__Impl();

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
    // $ANTLR end "rule__Class__Group_4__3"


    // $ANTLR start "rule__Class__Group_4__3__Impl"
    // InternalModelEditorParser.g:1004:1: rule__Class__Group_4__3__Impl : ( RULE_END ) ;
    public final void rule__Class__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1008:1: ( ( RULE_END ) )
            // InternalModelEditorParser.g:1009:1: ( RULE_END )
            {
            // InternalModelEditorParser.g:1009:1: ( RULE_END )
            // InternalModelEditorParser.g:1010:2: RULE_END
            {
             before(grammarAccess.getClassAccess().getENDTerminalRuleCall_4_3()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getENDTerminalRuleCall_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_4__3__Impl"


    // $ANTLR start "rule__Field__Group__0"
    // InternalModelEditorParser.g:1020:1: rule__Field__Group__0 : rule__Field__Group__0__Impl rule__Field__Group__1 ;
    public final void rule__Field__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1024:1: ( rule__Field__Group__0__Impl rule__Field__Group__1 )
            // InternalModelEditorParser.g:1025:2: rule__Field__Group__0__Impl rule__Field__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalModelEditorParser.g:1032:1: rule__Field__Group__0__Impl : ( ( rule__Field__ModifierAssignment_0 )? ) ;
    public final void rule__Field__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1036:1: ( ( ( rule__Field__ModifierAssignment_0 )? ) )
            // InternalModelEditorParser.g:1037:1: ( ( rule__Field__ModifierAssignment_0 )? )
            {
            // InternalModelEditorParser.g:1037:1: ( ( rule__Field__ModifierAssignment_0 )? )
            // InternalModelEditorParser.g:1038:2: ( rule__Field__ModifierAssignment_0 )?
            {
             before(grammarAccess.getFieldAccess().getModifierAssignment_0()); 
            // InternalModelEditorParser.g:1039:2: ( rule__Field__ModifierAssignment_0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==Protected||LA14_0==Constant||LA14_0==Private||LA14_0==Public) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalModelEditorParser.g:1039:3: rule__Field__ModifierAssignment_0
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
    // InternalModelEditorParser.g:1047:1: rule__Field__Group__1 : rule__Field__Group__1__Impl rule__Field__Group__2 ;
    public final void rule__Field__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1051:1: ( rule__Field__Group__1__Impl rule__Field__Group__2 )
            // InternalModelEditorParser.g:1052:2: rule__Field__Group__1__Impl rule__Field__Group__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalModelEditorParser.g:1059:1: rule__Field__Group__1__Impl : ( ( rule__Field__NameAssignment_1 ) ) ;
    public final void rule__Field__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1063:1: ( ( ( rule__Field__NameAssignment_1 ) ) )
            // InternalModelEditorParser.g:1064:1: ( ( rule__Field__NameAssignment_1 ) )
            {
            // InternalModelEditorParser.g:1064:1: ( ( rule__Field__NameAssignment_1 ) )
            // InternalModelEditorParser.g:1065:2: ( rule__Field__NameAssignment_1 )
            {
             before(grammarAccess.getFieldAccess().getNameAssignment_1()); 
            // InternalModelEditorParser.g:1066:2: ( rule__Field__NameAssignment_1 )
            // InternalModelEditorParser.g:1066:3: rule__Field__NameAssignment_1
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
    // InternalModelEditorParser.g:1074:1: rule__Field__Group__2 : rule__Field__Group__2__Impl ;
    public final void rule__Field__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1078:1: ( rule__Field__Group__2__Impl )
            // InternalModelEditorParser.g:1079:2: rule__Field__Group__2__Impl
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
    // InternalModelEditorParser.g:1085:1: rule__Field__Group__2__Impl : ( ( rule__Field__Group_2__0 )? ) ;
    public final void rule__Field__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1089:1: ( ( ( rule__Field__Group_2__0 )? ) )
            // InternalModelEditorParser.g:1090:1: ( ( rule__Field__Group_2__0 )? )
            {
            // InternalModelEditorParser.g:1090:1: ( ( rule__Field__Group_2__0 )? )
            // InternalModelEditorParser.g:1091:2: ( rule__Field__Group_2__0 )?
            {
             before(grammarAccess.getFieldAccess().getGroup_2()); 
            // InternalModelEditorParser.g:1092:2: ( rule__Field__Group_2__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==Colon) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalModelEditorParser.g:1092:3: rule__Field__Group_2__0
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
    // InternalModelEditorParser.g:1101:1: rule__Field__Group_2__0 : rule__Field__Group_2__0__Impl rule__Field__Group_2__1 ;
    public final void rule__Field__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1105:1: ( rule__Field__Group_2__0__Impl rule__Field__Group_2__1 )
            // InternalModelEditorParser.g:1106:2: rule__Field__Group_2__0__Impl rule__Field__Group_2__1
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
    // InternalModelEditorParser.g:1113:1: rule__Field__Group_2__0__Impl : ( Colon ) ;
    public final void rule__Field__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1117:1: ( ( Colon ) )
            // InternalModelEditorParser.g:1118:1: ( Colon )
            {
            // InternalModelEditorParser.g:1118:1: ( Colon )
            // InternalModelEditorParser.g:1119:2: Colon
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
    // InternalModelEditorParser.g:1128:1: rule__Field__Group_2__1 : rule__Field__Group_2__1__Impl ;
    public final void rule__Field__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1132:1: ( rule__Field__Group_2__1__Impl )
            // InternalModelEditorParser.g:1133:2: rule__Field__Group_2__1__Impl
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
    // InternalModelEditorParser.g:1139:1: rule__Field__Group_2__1__Impl : ( ( rule__Field__TypeAssignment_2_1 ) ) ;
    public final void rule__Field__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1143:1: ( ( ( rule__Field__TypeAssignment_2_1 ) ) )
            // InternalModelEditorParser.g:1144:1: ( ( rule__Field__TypeAssignment_2_1 ) )
            {
            // InternalModelEditorParser.g:1144:1: ( ( rule__Field__TypeAssignment_2_1 ) )
            // InternalModelEditorParser.g:1145:2: ( rule__Field__TypeAssignment_2_1 )
            {
             before(grammarAccess.getFieldAccess().getTypeAssignment_2_1()); 
            // InternalModelEditorParser.g:1146:2: ( rule__Field__TypeAssignment_2_1 )
            // InternalModelEditorParser.g:1146:3: rule__Field__TypeAssignment_2_1
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
    // InternalModelEditorParser.g:1155:1: rule__Method__Group__0 : rule__Method__Group__0__Impl rule__Method__Group__1 ;
    public final void rule__Method__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1159:1: ( rule__Method__Group__0__Impl rule__Method__Group__1 )
            // InternalModelEditorParser.g:1160:2: rule__Method__Group__0__Impl rule__Method__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalModelEditorParser.g:1167:1: rule__Method__Group__0__Impl : ( ( rule__Method__ModifierAssignment_0 )? ) ;
    public final void rule__Method__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1171:1: ( ( ( rule__Method__ModifierAssignment_0 )? ) )
            // InternalModelEditorParser.g:1172:1: ( ( rule__Method__ModifierAssignment_0 )? )
            {
            // InternalModelEditorParser.g:1172:1: ( ( rule__Method__ModifierAssignment_0 )? )
            // InternalModelEditorParser.g:1173:2: ( rule__Method__ModifierAssignment_0 )?
            {
             before(grammarAccess.getMethodAccess().getModifierAssignment_0()); 
            // InternalModelEditorParser.g:1174:2: ( rule__Method__ModifierAssignment_0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==Protected||LA16_0==Constant||LA16_0==Private||LA16_0==Public) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalModelEditorParser.g:1174:3: rule__Method__ModifierAssignment_0
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
    // InternalModelEditorParser.g:1182:1: rule__Method__Group__1 : rule__Method__Group__1__Impl rule__Method__Group__2 ;
    public final void rule__Method__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1186:1: ( rule__Method__Group__1__Impl rule__Method__Group__2 )
            // InternalModelEditorParser.g:1187:2: rule__Method__Group__1__Impl rule__Method__Group__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalModelEditorParser.g:1194:1: rule__Method__Group__1__Impl : ( ( rule__Method__NameAssignment_1 ) ) ;
    public final void rule__Method__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1198:1: ( ( ( rule__Method__NameAssignment_1 ) ) )
            // InternalModelEditorParser.g:1199:1: ( ( rule__Method__NameAssignment_1 ) )
            {
            // InternalModelEditorParser.g:1199:1: ( ( rule__Method__NameAssignment_1 ) )
            // InternalModelEditorParser.g:1200:2: ( rule__Method__NameAssignment_1 )
            {
             before(grammarAccess.getMethodAccess().getNameAssignment_1()); 
            // InternalModelEditorParser.g:1201:2: ( rule__Method__NameAssignment_1 )
            // InternalModelEditorParser.g:1201:3: rule__Method__NameAssignment_1
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
    // InternalModelEditorParser.g:1209:1: rule__Method__Group__2 : rule__Method__Group__2__Impl rule__Method__Group__3 ;
    public final void rule__Method__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1213:1: ( rule__Method__Group__2__Impl rule__Method__Group__3 )
            // InternalModelEditorParser.g:1214:2: rule__Method__Group__2__Impl rule__Method__Group__3
            {
            pushFollow(FOLLOW_16);
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
    // InternalModelEditorParser.g:1221:1: rule__Method__Group__2__Impl : ( LeftParenthesis ) ;
    public final void rule__Method__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1225:1: ( ( LeftParenthesis ) )
            // InternalModelEditorParser.g:1226:1: ( LeftParenthesis )
            {
            // InternalModelEditorParser.g:1226:1: ( LeftParenthesis )
            // InternalModelEditorParser.g:1227:2: LeftParenthesis
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
    // InternalModelEditorParser.g:1236:1: rule__Method__Group__3 : rule__Method__Group__3__Impl rule__Method__Group__4 ;
    public final void rule__Method__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1240:1: ( rule__Method__Group__3__Impl rule__Method__Group__4 )
            // InternalModelEditorParser.g:1241:2: rule__Method__Group__3__Impl rule__Method__Group__4
            {
            pushFollow(FOLLOW_16);
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
    // InternalModelEditorParser.g:1248:1: rule__Method__Group__3__Impl : ( ( rule__Method__Group_3__0 )? ) ;
    public final void rule__Method__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1252:1: ( ( ( rule__Method__Group_3__0 )? ) )
            // InternalModelEditorParser.g:1253:1: ( ( rule__Method__Group_3__0 )? )
            {
            // InternalModelEditorParser.g:1253:1: ( ( rule__Method__Group_3__0 )? )
            // InternalModelEditorParser.g:1254:2: ( rule__Method__Group_3__0 )?
            {
             before(grammarAccess.getMethodAccess().getGroup_3()); 
            // InternalModelEditorParser.g:1255:2: ( rule__Method__Group_3__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ID) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalModelEditorParser.g:1255:3: rule__Method__Group_3__0
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
    // InternalModelEditorParser.g:1263:1: rule__Method__Group__4 : rule__Method__Group__4__Impl rule__Method__Group__5 ;
    public final void rule__Method__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1267:1: ( rule__Method__Group__4__Impl rule__Method__Group__5 )
            // InternalModelEditorParser.g:1268:2: rule__Method__Group__4__Impl rule__Method__Group__5
            {
            pushFollow(FOLLOW_17);
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
    // InternalModelEditorParser.g:1275:1: rule__Method__Group__4__Impl : ( RightParenthesis ) ;
    public final void rule__Method__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1279:1: ( ( RightParenthesis ) )
            // InternalModelEditorParser.g:1280:1: ( RightParenthesis )
            {
            // InternalModelEditorParser.g:1280:1: ( RightParenthesis )
            // InternalModelEditorParser.g:1281:2: RightParenthesis
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
    // InternalModelEditorParser.g:1290:1: rule__Method__Group__5 : rule__Method__Group__5__Impl rule__Method__Group__6 ;
    public final void rule__Method__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1294:1: ( rule__Method__Group__5__Impl rule__Method__Group__6 )
            // InternalModelEditorParser.g:1295:2: rule__Method__Group__5__Impl rule__Method__Group__6
            {
            pushFollow(FOLLOW_17);
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
    // InternalModelEditorParser.g:1302:1: rule__Method__Group__5__Impl : ( ( rule__Method__Group_5__0 )? ) ;
    public final void rule__Method__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1306:1: ( ( ( rule__Method__Group_5__0 )? ) )
            // InternalModelEditorParser.g:1307:1: ( ( rule__Method__Group_5__0 )? )
            {
            // InternalModelEditorParser.g:1307:1: ( ( rule__Method__Group_5__0 )? )
            // InternalModelEditorParser.g:1308:2: ( rule__Method__Group_5__0 )?
            {
             before(grammarAccess.getMethodAccess().getGroup_5()); 
            // InternalModelEditorParser.g:1309:2: ( rule__Method__Group_5__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==Colon) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalModelEditorParser.g:1309:3: rule__Method__Group_5__0
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
    // InternalModelEditorParser.g:1317:1: rule__Method__Group__6 : rule__Method__Group__6__Impl ;
    public final void rule__Method__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1321:1: ( rule__Method__Group__6__Impl )
            // InternalModelEditorParser.g:1322:2: rule__Method__Group__6__Impl
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
    // InternalModelEditorParser.g:1328:1: rule__Method__Group__6__Impl : ( ( rule__Method__Group_6__0 )? ) ;
    public final void rule__Method__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1332:1: ( ( ( rule__Method__Group_6__0 )? ) )
            // InternalModelEditorParser.g:1333:1: ( ( rule__Method__Group_6__0 )? )
            {
            // InternalModelEditorParser.g:1333:1: ( ( rule__Method__Group_6__0 )? )
            // InternalModelEditorParser.g:1334:2: ( rule__Method__Group_6__0 )?
            {
             before(grammarAccess.getMethodAccess().getGroup_6()); 
            // InternalModelEditorParser.g:1335:2: ( rule__Method__Group_6__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_BEGIN) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalModelEditorParser.g:1335:3: rule__Method__Group_6__0
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
    // InternalModelEditorParser.g:1344:1: rule__Method__Group_3__0 : rule__Method__Group_3__0__Impl rule__Method__Group_3__1 ;
    public final void rule__Method__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1348:1: ( rule__Method__Group_3__0__Impl rule__Method__Group_3__1 )
            // InternalModelEditorParser.g:1349:2: rule__Method__Group_3__0__Impl rule__Method__Group_3__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalModelEditorParser.g:1356:1: rule__Method__Group_3__0__Impl : ( ( rule__Method__TypesAssignment_3_0 ) ) ;
    public final void rule__Method__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1360:1: ( ( ( rule__Method__TypesAssignment_3_0 ) ) )
            // InternalModelEditorParser.g:1361:1: ( ( rule__Method__TypesAssignment_3_0 ) )
            {
            // InternalModelEditorParser.g:1361:1: ( ( rule__Method__TypesAssignment_3_0 ) )
            // InternalModelEditorParser.g:1362:2: ( rule__Method__TypesAssignment_3_0 )
            {
             before(grammarAccess.getMethodAccess().getTypesAssignment_3_0()); 
            // InternalModelEditorParser.g:1363:2: ( rule__Method__TypesAssignment_3_0 )
            // InternalModelEditorParser.g:1363:3: rule__Method__TypesAssignment_3_0
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
    // InternalModelEditorParser.g:1371:1: rule__Method__Group_3__1 : rule__Method__Group_3__1__Impl ;
    public final void rule__Method__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1375:1: ( rule__Method__Group_3__1__Impl )
            // InternalModelEditorParser.g:1376:2: rule__Method__Group_3__1__Impl
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
    // InternalModelEditorParser.g:1382:1: rule__Method__Group_3__1__Impl : ( ( rule__Method__Group_3_1__0 )* ) ;
    public final void rule__Method__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1386:1: ( ( ( rule__Method__Group_3_1__0 )* ) )
            // InternalModelEditorParser.g:1387:1: ( ( rule__Method__Group_3_1__0 )* )
            {
            // InternalModelEditorParser.g:1387:1: ( ( rule__Method__Group_3_1__0 )* )
            // InternalModelEditorParser.g:1388:2: ( rule__Method__Group_3_1__0 )*
            {
             before(grammarAccess.getMethodAccess().getGroup_3_1()); 
            // InternalModelEditorParser.g:1389:2: ( rule__Method__Group_3_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==Comma) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalModelEditorParser.g:1389:3: rule__Method__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__Method__Group_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // InternalModelEditorParser.g:1398:1: rule__Method__Group_3_1__0 : rule__Method__Group_3_1__0__Impl rule__Method__Group_3_1__1 ;
    public final void rule__Method__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1402:1: ( rule__Method__Group_3_1__0__Impl rule__Method__Group_3_1__1 )
            // InternalModelEditorParser.g:1403:2: rule__Method__Group_3_1__0__Impl rule__Method__Group_3_1__1
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
    // InternalModelEditorParser.g:1410:1: rule__Method__Group_3_1__0__Impl : ( Comma ) ;
    public final void rule__Method__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1414:1: ( ( Comma ) )
            // InternalModelEditorParser.g:1415:1: ( Comma )
            {
            // InternalModelEditorParser.g:1415:1: ( Comma )
            // InternalModelEditorParser.g:1416:2: Comma
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
    // InternalModelEditorParser.g:1425:1: rule__Method__Group_3_1__1 : rule__Method__Group_3_1__1__Impl ;
    public final void rule__Method__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1429:1: ( rule__Method__Group_3_1__1__Impl )
            // InternalModelEditorParser.g:1430:2: rule__Method__Group_3_1__1__Impl
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
    // InternalModelEditorParser.g:1436:1: rule__Method__Group_3_1__1__Impl : ( ( rule__Method__TypesAssignment_3_1_1 ) ) ;
    public final void rule__Method__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1440:1: ( ( ( rule__Method__TypesAssignment_3_1_1 ) ) )
            // InternalModelEditorParser.g:1441:1: ( ( rule__Method__TypesAssignment_3_1_1 ) )
            {
            // InternalModelEditorParser.g:1441:1: ( ( rule__Method__TypesAssignment_3_1_1 ) )
            // InternalModelEditorParser.g:1442:2: ( rule__Method__TypesAssignment_3_1_1 )
            {
             before(grammarAccess.getMethodAccess().getTypesAssignment_3_1_1()); 
            // InternalModelEditorParser.g:1443:2: ( rule__Method__TypesAssignment_3_1_1 )
            // InternalModelEditorParser.g:1443:3: rule__Method__TypesAssignment_3_1_1
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
    // InternalModelEditorParser.g:1452:1: rule__Method__Group_5__0 : rule__Method__Group_5__0__Impl rule__Method__Group_5__1 ;
    public final void rule__Method__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1456:1: ( rule__Method__Group_5__0__Impl rule__Method__Group_5__1 )
            // InternalModelEditorParser.g:1457:2: rule__Method__Group_5__0__Impl rule__Method__Group_5__1
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
    // InternalModelEditorParser.g:1464:1: rule__Method__Group_5__0__Impl : ( Colon ) ;
    public final void rule__Method__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1468:1: ( ( Colon ) )
            // InternalModelEditorParser.g:1469:1: ( Colon )
            {
            // InternalModelEditorParser.g:1469:1: ( Colon )
            // InternalModelEditorParser.g:1470:2: Colon
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
    // InternalModelEditorParser.g:1479:1: rule__Method__Group_5__1 : rule__Method__Group_5__1__Impl ;
    public final void rule__Method__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1483:1: ( rule__Method__Group_5__1__Impl )
            // InternalModelEditorParser.g:1484:2: rule__Method__Group_5__1__Impl
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
    // InternalModelEditorParser.g:1490:1: rule__Method__Group_5__1__Impl : ( ( rule__Method__TypeAssignment_5_1 ) ) ;
    public final void rule__Method__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1494:1: ( ( ( rule__Method__TypeAssignment_5_1 ) ) )
            // InternalModelEditorParser.g:1495:1: ( ( rule__Method__TypeAssignment_5_1 ) )
            {
            // InternalModelEditorParser.g:1495:1: ( ( rule__Method__TypeAssignment_5_1 ) )
            // InternalModelEditorParser.g:1496:2: ( rule__Method__TypeAssignment_5_1 )
            {
             before(grammarAccess.getMethodAccess().getTypeAssignment_5_1()); 
            // InternalModelEditorParser.g:1497:2: ( rule__Method__TypeAssignment_5_1 )
            // InternalModelEditorParser.g:1497:3: rule__Method__TypeAssignment_5_1
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
    // InternalModelEditorParser.g:1506:1: rule__Method__Group_6__0 : rule__Method__Group_6__0__Impl rule__Method__Group_6__1 ;
    public final void rule__Method__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1510:1: ( rule__Method__Group_6__0__Impl rule__Method__Group_6__1 )
            // InternalModelEditorParser.g:1511:2: rule__Method__Group_6__0__Impl rule__Method__Group_6__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalModelEditorParser.g:1518:1: rule__Method__Group_6__0__Impl : ( RULE_BEGIN ) ;
    public final void rule__Method__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1522:1: ( ( RULE_BEGIN ) )
            // InternalModelEditorParser.g:1523:1: ( RULE_BEGIN )
            {
            // InternalModelEditorParser.g:1523:1: ( RULE_BEGIN )
            // InternalModelEditorParser.g:1524:2: RULE_BEGIN
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
    // InternalModelEditorParser.g:1533:1: rule__Method__Group_6__1 : rule__Method__Group_6__1__Impl rule__Method__Group_6__2 ;
    public final void rule__Method__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1537:1: ( rule__Method__Group_6__1__Impl rule__Method__Group_6__2 )
            // InternalModelEditorParser.g:1538:2: rule__Method__Group_6__1__Impl rule__Method__Group_6__2
            {
            pushFollow(FOLLOW_20);
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
    // InternalModelEditorParser.g:1545:1: rule__Method__Group_6__1__Impl : ( ( rule__Method__Group_6_1__0 )? ) ;
    public final void rule__Method__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1549:1: ( ( ( rule__Method__Group_6_1__0 )? ) )
            // InternalModelEditorParser.g:1550:1: ( ( rule__Method__Group_6_1__0 )? )
            {
            // InternalModelEditorParser.g:1550:1: ( ( rule__Method__Group_6_1__0 )? )
            // InternalModelEditorParser.g:1551:2: ( rule__Method__Group_6_1__0 )?
            {
             before(grammarAccess.getMethodAccess().getGroup_6_1()); 
            // InternalModelEditorParser.g:1552:2: ( rule__Method__Group_6_1__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_INT) ) {
                int LA21_1 = input.LA(2);

                if ( (LA21_1==Lines) ) {
                    alt21=1;
                }
            }
            switch (alt21) {
                case 1 :
                    // InternalModelEditorParser.g:1552:3: rule__Method__Group_6_1__0
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
    // InternalModelEditorParser.g:1560:1: rule__Method__Group_6__2 : rule__Method__Group_6__2__Impl rule__Method__Group_6__3 ;
    public final void rule__Method__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1564:1: ( rule__Method__Group_6__2__Impl rule__Method__Group_6__3 )
            // InternalModelEditorParser.g:1565:2: rule__Method__Group_6__2__Impl rule__Method__Group_6__3
            {
            pushFollow(FOLLOW_20);
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
    // InternalModelEditorParser.g:1572:1: rule__Method__Group_6__2__Impl : ( ( rule__Method__Group_6_2__0 )? ) ;
    public final void rule__Method__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1576:1: ( ( ( rule__Method__Group_6_2__0 )? ) )
            // InternalModelEditorParser.g:1577:1: ( ( rule__Method__Group_6_2__0 )? )
            {
            // InternalModelEditorParser.g:1577:1: ( ( rule__Method__Group_6_2__0 )? )
            // InternalModelEditorParser.g:1578:2: ( rule__Method__Group_6_2__0 )?
            {
             before(grammarAccess.getMethodAccess().getGroup_6_2()); 
            // InternalModelEditorParser.g:1579:2: ( rule__Method__Group_6_2__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_INT) ) {
                int LA22_1 = input.LA(2);

                if ( (LA22_1==Cyclo) ) {
                    alt22=1;
                }
            }
            switch (alt22) {
                case 1 :
                    // InternalModelEditorParser.g:1579:3: rule__Method__Group_6_2__0
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
    // InternalModelEditorParser.g:1587:1: rule__Method__Group_6__3 : rule__Method__Group_6__3__Impl rule__Method__Group_6__4 ;
    public final void rule__Method__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1591:1: ( rule__Method__Group_6__3__Impl rule__Method__Group_6__4 )
            // InternalModelEditorParser.g:1592:2: rule__Method__Group_6__3__Impl rule__Method__Group_6__4
            {
            pushFollow(FOLLOW_20);
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
    // InternalModelEditorParser.g:1599:1: rule__Method__Group_6__3__Impl : ( ( rule__Method__AccessesAssignment_6_3 )* ) ;
    public final void rule__Method__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1603:1: ( ( ( rule__Method__AccessesAssignment_6_3 )* ) )
            // InternalModelEditorParser.g:1604:1: ( ( rule__Method__AccessesAssignment_6_3 )* )
            {
            // InternalModelEditorParser.g:1604:1: ( ( rule__Method__AccessesAssignment_6_3 )* )
            // InternalModelEditorParser.g:1605:2: ( rule__Method__AccessesAssignment_6_3 )*
            {
             before(grammarAccess.getMethodAccess().getAccessesAssignment_6_3()); 
            // InternalModelEditorParser.g:1606:2: ( rule__Method__AccessesAssignment_6_3 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_INT) ) {
                    int LA23_1 = input.LA(2);

                    if ( (LA23_1==Accesses||LA23_1==Access) ) {
                        alt23=1;
                    }


                }


                switch (alt23) {
            	case 1 :
            	    // InternalModelEditorParser.g:1606:3: rule__Method__AccessesAssignment_6_3
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__Method__AccessesAssignment_6_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
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
    // InternalModelEditorParser.g:1614:1: rule__Method__Group_6__4 : rule__Method__Group_6__4__Impl rule__Method__Group_6__5 ;
    public final void rule__Method__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1618:1: ( rule__Method__Group_6__4__Impl rule__Method__Group_6__5 )
            // InternalModelEditorParser.g:1619:2: rule__Method__Group_6__4__Impl rule__Method__Group_6__5
            {
            pushFollow(FOLLOW_20);
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
    // InternalModelEditorParser.g:1626:1: rule__Method__Group_6__4__Impl : ( ( rule__Method__CallsAssignment_6_4 )* ) ;
    public final void rule__Method__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1630:1: ( ( ( rule__Method__CallsAssignment_6_4 )* ) )
            // InternalModelEditorParser.g:1631:1: ( ( rule__Method__CallsAssignment_6_4 )* )
            {
            // InternalModelEditorParser.g:1631:1: ( ( rule__Method__CallsAssignment_6_4 )* )
            // InternalModelEditorParser.g:1632:2: ( rule__Method__CallsAssignment_6_4 )*
            {
             before(grammarAccess.getMethodAccess().getCallsAssignment_6_4()); 
            // InternalModelEditorParser.g:1633:2: ( rule__Method__CallsAssignment_6_4 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_INT) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalModelEditorParser.g:1633:3: rule__Method__CallsAssignment_6_4
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__Method__CallsAssignment_6_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
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
    // InternalModelEditorParser.g:1641:1: rule__Method__Group_6__5 : rule__Method__Group_6__5__Impl ;
    public final void rule__Method__Group_6__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1645:1: ( rule__Method__Group_6__5__Impl )
            // InternalModelEditorParser.g:1646:2: rule__Method__Group_6__5__Impl
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
    // InternalModelEditorParser.g:1652:1: rule__Method__Group_6__5__Impl : ( RULE_END ) ;
    public final void rule__Method__Group_6__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1656:1: ( ( RULE_END ) )
            // InternalModelEditorParser.g:1657:1: ( RULE_END )
            {
            // InternalModelEditorParser.g:1657:1: ( RULE_END )
            // InternalModelEditorParser.g:1658:2: RULE_END
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
    // InternalModelEditorParser.g:1668:1: rule__Method__Group_6_1__0 : rule__Method__Group_6_1__0__Impl rule__Method__Group_6_1__1 ;
    public final void rule__Method__Group_6_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1672:1: ( rule__Method__Group_6_1__0__Impl rule__Method__Group_6_1__1 )
            // InternalModelEditorParser.g:1673:2: rule__Method__Group_6_1__0__Impl rule__Method__Group_6_1__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalModelEditorParser.g:1680:1: rule__Method__Group_6_1__0__Impl : ( ( rule__Method__LocAssignment_6_1_0 ) ) ;
    public final void rule__Method__Group_6_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1684:1: ( ( ( rule__Method__LocAssignment_6_1_0 ) ) )
            // InternalModelEditorParser.g:1685:1: ( ( rule__Method__LocAssignment_6_1_0 ) )
            {
            // InternalModelEditorParser.g:1685:1: ( ( rule__Method__LocAssignment_6_1_0 ) )
            // InternalModelEditorParser.g:1686:2: ( rule__Method__LocAssignment_6_1_0 )
            {
             before(grammarAccess.getMethodAccess().getLocAssignment_6_1_0()); 
            // InternalModelEditorParser.g:1687:2: ( rule__Method__LocAssignment_6_1_0 )
            // InternalModelEditorParser.g:1687:3: rule__Method__LocAssignment_6_1_0
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
    // InternalModelEditorParser.g:1695:1: rule__Method__Group_6_1__1 : rule__Method__Group_6_1__1__Impl rule__Method__Group_6_1__2 ;
    public final void rule__Method__Group_6_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1699:1: ( rule__Method__Group_6_1__1__Impl rule__Method__Group_6_1__2 )
            // InternalModelEditorParser.g:1700:2: rule__Method__Group_6_1__1__Impl rule__Method__Group_6_1__2
            {
            pushFollow(FOLLOW_23);
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
    // InternalModelEditorParser.g:1707:1: rule__Method__Group_6_1__1__Impl : ( Lines ) ;
    public final void rule__Method__Group_6_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1711:1: ( ( Lines ) )
            // InternalModelEditorParser.g:1712:1: ( Lines )
            {
            // InternalModelEditorParser.g:1712:1: ( Lines )
            // InternalModelEditorParser.g:1713:2: Lines
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
    // InternalModelEditorParser.g:1722:1: rule__Method__Group_6_1__2 : rule__Method__Group_6_1__2__Impl rule__Method__Group_6_1__3 ;
    public final void rule__Method__Group_6_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1726:1: ( rule__Method__Group_6_1__2__Impl rule__Method__Group_6_1__3 )
            // InternalModelEditorParser.g:1727:2: rule__Method__Group_6_1__2__Impl rule__Method__Group_6_1__3
            {
            pushFollow(FOLLOW_24);
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
    // InternalModelEditorParser.g:1734:1: rule__Method__Group_6_1__2__Impl : ( Of ) ;
    public final void rule__Method__Group_6_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1738:1: ( ( Of ) )
            // InternalModelEditorParser.g:1739:1: ( Of )
            {
            // InternalModelEditorParser.g:1739:1: ( Of )
            // InternalModelEditorParser.g:1740:2: Of
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
    // InternalModelEditorParser.g:1749:1: rule__Method__Group_6_1__3 : rule__Method__Group_6_1__3__Impl ;
    public final void rule__Method__Group_6_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1753:1: ( rule__Method__Group_6_1__3__Impl )
            // InternalModelEditorParser.g:1754:2: rule__Method__Group_6_1__3__Impl
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
    // InternalModelEditorParser.g:1760:1: rule__Method__Group_6_1__3__Impl : ( Code ) ;
    public final void rule__Method__Group_6_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1764:1: ( ( Code ) )
            // InternalModelEditorParser.g:1765:1: ( Code )
            {
            // InternalModelEditorParser.g:1765:1: ( Code )
            // InternalModelEditorParser.g:1766:2: Code
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
    // InternalModelEditorParser.g:1776:1: rule__Method__Group_6_2__0 : rule__Method__Group_6_2__0__Impl rule__Method__Group_6_2__1 ;
    public final void rule__Method__Group_6_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1780:1: ( rule__Method__Group_6_2__0__Impl rule__Method__Group_6_2__1 )
            // InternalModelEditorParser.g:1781:2: rule__Method__Group_6_2__0__Impl rule__Method__Group_6_2__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalModelEditorParser.g:1788:1: rule__Method__Group_6_2__0__Impl : ( ( rule__Method__CycloAssignment_6_2_0 ) ) ;
    public final void rule__Method__Group_6_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1792:1: ( ( ( rule__Method__CycloAssignment_6_2_0 ) ) )
            // InternalModelEditorParser.g:1793:1: ( ( rule__Method__CycloAssignment_6_2_0 ) )
            {
            // InternalModelEditorParser.g:1793:1: ( ( rule__Method__CycloAssignment_6_2_0 ) )
            // InternalModelEditorParser.g:1794:2: ( rule__Method__CycloAssignment_6_2_0 )
            {
             before(grammarAccess.getMethodAccess().getCycloAssignment_6_2_0()); 
            // InternalModelEditorParser.g:1795:2: ( rule__Method__CycloAssignment_6_2_0 )
            // InternalModelEditorParser.g:1795:3: rule__Method__CycloAssignment_6_2_0
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
    // InternalModelEditorParser.g:1803:1: rule__Method__Group_6_2__1 : rule__Method__Group_6_2__1__Impl ;
    public final void rule__Method__Group_6_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1807:1: ( rule__Method__Group_6_2__1__Impl )
            // InternalModelEditorParser.g:1808:2: rule__Method__Group_6_2__1__Impl
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
    // InternalModelEditorParser.g:1814:1: rule__Method__Group_6_2__1__Impl : ( Cyclo ) ;
    public final void rule__Method__Group_6_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1818:1: ( ( Cyclo ) )
            // InternalModelEditorParser.g:1819:1: ( Cyclo )
            {
            // InternalModelEditorParser.g:1819:1: ( Cyclo )
            // InternalModelEditorParser.g:1820:2: Cyclo
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
    // InternalModelEditorParser.g:1830:1: rule__Access__Group__0 : rule__Access__Group__0__Impl rule__Access__Group__1 ;
    public final void rule__Access__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1834:1: ( rule__Access__Group__0__Impl rule__Access__Group__1 )
            // InternalModelEditorParser.g:1835:2: rule__Access__Group__0__Impl rule__Access__Group__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalModelEditorParser.g:1842:1: rule__Access__Group__0__Impl : ( ( rule__Access__AccessesAssignment_0 ) ) ;
    public final void rule__Access__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1846:1: ( ( ( rule__Access__AccessesAssignment_0 ) ) )
            // InternalModelEditorParser.g:1847:1: ( ( rule__Access__AccessesAssignment_0 ) )
            {
            // InternalModelEditorParser.g:1847:1: ( ( rule__Access__AccessesAssignment_0 ) )
            // InternalModelEditorParser.g:1848:2: ( rule__Access__AccessesAssignment_0 )
            {
             before(grammarAccess.getAccessAccess().getAccessesAssignment_0()); 
            // InternalModelEditorParser.g:1849:2: ( rule__Access__AccessesAssignment_0 )
            // InternalModelEditorParser.g:1849:3: rule__Access__AccessesAssignment_0
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
    // InternalModelEditorParser.g:1857:1: rule__Access__Group__1 : rule__Access__Group__1__Impl rule__Access__Group__2 ;
    public final void rule__Access__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1861:1: ( rule__Access__Group__1__Impl rule__Access__Group__2 )
            // InternalModelEditorParser.g:1862:2: rule__Access__Group__1__Impl rule__Access__Group__2
            {
            pushFollow(FOLLOW_27);
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
    // InternalModelEditorParser.g:1869:1: rule__Access__Group__1__Impl : ( ( rule__Access__Alternatives_1 ) ) ;
    public final void rule__Access__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1873:1: ( ( ( rule__Access__Alternatives_1 ) ) )
            // InternalModelEditorParser.g:1874:1: ( ( rule__Access__Alternatives_1 ) )
            {
            // InternalModelEditorParser.g:1874:1: ( ( rule__Access__Alternatives_1 ) )
            // InternalModelEditorParser.g:1875:2: ( rule__Access__Alternatives_1 )
            {
             before(grammarAccess.getAccessAccess().getAlternatives_1()); 
            // InternalModelEditorParser.g:1876:2: ( rule__Access__Alternatives_1 )
            // InternalModelEditorParser.g:1876:3: rule__Access__Alternatives_1
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
    // InternalModelEditorParser.g:1884:1: rule__Access__Group__2 : rule__Access__Group__2__Impl rule__Access__Group__3 ;
    public final void rule__Access__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1888:1: ( rule__Access__Group__2__Impl rule__Access__Group__3 )
            // InternalModelEditorParser.g:1889:2: rule__Access__Group__2__Impl rule__Access__Group__3
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
    // InternalModelEditorParser.g:1896:1: rule__Access__Group__2__Impl : ( To ) ;
    public final void rule__Access__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1900:1: ( ( To ) )
            // InternalModelEditorParser.g:1901:1: ( To )
            {
            // InternalModelEditorParser.g:1901:1: ( To )
            // InternalModelEditorParser.g:1902:2: To
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
    // InternalModelEditorParser.g:1911:1: rule__Access__Group__3 : rule__Access__Group__3__Impl ;
    public final void rule__Access__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1915:1: ( rule__Access__Group__3__Impl )
            // InternalModelEditorParser.g:1916:2: rule__Access__Group__3__Impl
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
    // InternalModelEditorParser.g:1922:1: rule__Access__Group__3__Impl : ( ( rule__Access__FieldAssignment_3 ) ) ;
    public final void rule__Access__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1926:1: ( ( ( rule__Access__FieldAssignment_3 ) ) )
            // InternalModelEditorParser.g:1927:1: ( ( rule__Access__FieldAssignment_3 ) )
            {
            // InternalModelEditorParser.g:1927:1: ( ( rule__Access__FieldAssignment_3 ) )
            // InternalModelEditorParser.g:1928:2: ( rule__Access__FieldAssignment_3 )
            {
             before(grammarAccess.getAccessAccess().getFieldAssignment_3()); 
            // InternalModelEditorParser.g:1929:2: ( rule__Access__FieldAssignment_3 )
            // InternalModelEditorParser.g:1929:3: rule__Access__FieldAssignment_3
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
    // InternalModelEditorParser.g:1938:1: rule__Call__Group__0 : rule__Call__Group__0__Impl rule__Call__Group__1 ;
    public final void rule__Call__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1942:1: ( rule__Call__Group__0__Impl rule__Call__Group__1 )
            // InternalModelEditorParser.g:1943:2: rule__Call__Group__0__Impl rule__Call__Group__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalModelEditorParser.g:1950:1: rule__Call__Group__0__Impl : ( ( rule__Call__CallsAssignment_0 ) ) ;
    public final void rule__Call__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1954:1: ( ( ( rule__Call__CallsAssignment_0 ) ) )
            // InternalModelEditorParser.g:1955:1: ( ( rule__Call__CallsAssignment_0 ) )
            {
            // InternalModelEditorParser.g:1955:1: ( ( rule__Call__CallsAssignment_0 ) )
            // InternalModelEditorParser.g:1956:2: ( rule__Call__CallsAssignment_0 )
            {
             before(grammarAccess.getCallAccess().getCallsAssignment_0()); 
            // InternalModelEditorParser.g:1957:2: ( rule__Call__CallsAssignment_0 )
            // InternalModelEditorParser.g:1957:3: rule__Call__CallsAssignment_0
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
    // InternalModelEditorParser.g:1965:1: rule__Call__Group__1 : rule__Call__Group__1__Impl rule__Call__Group__2 ;
    public final void rule__Call__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1969:1: ( rule__Call__Group__1__Impl rule__Call__Group__2 )
            // InternalModelEditorParser.g:1970:2: rule__Call__Group__1__Impl rule__Call__Group__2
            {
            pushFollow(FOLLOW_27);
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
    // InternalModelEditorParser.g:1977:1: rule__Call__Group__1__Impl : ( ( rule__Call__Alternatives_1 ) ) ;
    public final void rule__Call__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1981:1: ( ( ( rule__Call__Alternatives_1 ) ) )
            // InternalModelEditorParser.g:1982:1: ( ( rule__Call__Alternatives_1 ) )
            {
            // InternalModelEditorParser.g:1982:1: ( ( rule__Call__Alternatives_1 ) )
            // InternalModelEditorParser.g:1983:2: ( rule__Call__Alternatives_1 )
            {
             before(grammarAccess.getCallAccess().getAlternatives_1()); 
            // InternalModelEditorParser.g:1984:2: ( rule__Call__Alternatives_1 )
            // InternalModelEditorParser.g:1984:3: rule__Call__Alternatives_1
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
    // InternalModelEditorParser.g:1992:1: rule__Call__Group__2 : rule__Call__Group__2__Impl rule__Call__Group__3 ;
    public final void rule__Call__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:1996:1: ( rule__Call__Group__2__Impl rule__Call__Group__3 )
            // InternalModelEditorParser.g:1997:2: rule__Call__Group__2__Impl rule__Call__Group__3
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
    // InternalModelEditorParser.g:2004:1: rule__Call__Group__2__Impl : ( To ) ;
    public final void rule__Call__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:2008:1: ( ( To ) )
            // InternalModelEditorParser.g:2009:1: ( To )
            {
            // InternalModelEditorParser.g:2009:1: ( To )
            // InternalModelEditorParser.g:2010:2: To
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
    // InternalModelEditorParser.g:2019:1: rule__Call__Group__3 : rule__Call__Group__3__Impl rule__Call__Group__4 ;
    public final void rule__Call__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:2023:1: ( rule__Call__Group__3__Impl rule__Call__Group__4 )
            // InternalModelEditorParser.g:2024:2: rule__Call__Group__3__Impl rule__Call__Group__4
            {
            pushFollow(FOLLOW_15);
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
    // InternalModelEditorParser.g:2031:1: rule__Call__Group__3__Impl : ( ( rule__Call__MethodAssignment_3 ) ) ;
    public final void rule__Call__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:2035:1: ( ( ( rule__Call__MethodAssignment_3 ) ) )
            // InternalModelEditorParser.g:2036:1: ( ( rule__Call__MethodAssignment_3 ) )
            {
            // InternalModelEditorParser.g:2036:1: ( ( rule__Call__MethodAssignment_3 ) )
            // InternalModelEditorParser.g:2037:2: ( rule__Call__MethodAssignment_3 )
            {
             before(grammarAccess.getCallAccess().getMethodAssignment_3()); 
            // InternalModelEditorParser.g:2038:2: ( rule__Call__MethodAssignment_3 )
            // InternalModelEditorParser.g:2038:3: rule__Call__MethodAssignment_3
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
    // InternalModelEditorParser.g:2046:1: rule__Call__Group__4 : rule__Call__Group__4__Impl rule__Call__Group__5 ;
    public final void rule__Call__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:2050:1: ( rule__Call__Group__4__Impl rule__Call__Group__5 )
            // InternalModelEditorParser.g:2051:2: rule__Call__Group__4__Impl rule__Call__Group__5
            {
            pushFollow(FOLLOW_29);
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
    // InternalModelEditorParser.g:2058:1: rule__Call__Group__4__Impl : ( LeftParenthesis ) ;
    public final void rule__Call__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:2062:1: ( ( LeftParenthesis ) )
            // InternalModelEditorParser.g:2063:1: ( LeftParenthesis )
            {
            // InternalModelEditorParser.g:2063:1: ( LeftParenthesis )
            // InternalModelEditorParser.g:2064:2: LeftParenthesis
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
    // InternalModelEditorParser.g:2073:1: rule__Call__Group__5 : rule__Call__Group__5__Impl ;
    public final void rule__Call__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:2077:1: ( rule__Call__Group__5__Impl )
            // InternalModelEditorParser.g:2078:2: rule__Call__Group__5__Impl
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
    // InternalModelEditorParser.g:2084:1: rule__Call__Group__5__Impl : ( RightParenthesis ) ;
    public final void rule__Call__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:2088:1: ( ( RightParenthesis ) )
            // InternalModelEditorParser.g:2089:1: ( RightParenthesis )
            {
            // InternalModelEditorParser.g:2089:1: ( RightParenthesis )
            // InternalModelEditorParser.g:2090:2: RightParenthesis
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
    // InternalModelEditorParser.g:2100:1: rule__Model__ImportsAssignment_0 : ( ruleImport ) ;
    public final void rule__Model__ImportsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:2104:1: ( ( ruleImport ) )
            // InternalModelEditorParser.g:2105:2: ( ruleImport )
            {
            // InternalModelEditorParser.g:2105:2: ( ruleImport )
            // InternalModelEditorParser.g:2106:3: ruleImport
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
    // InternalModelEditorParser.g:2115:1: rule__Model__ClassesAssignment_1 : ( ruleClass ) ;
    public final void rule__Model__ClassesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:2119:1: ( ( ruleClass ) )
            // InternalModelEditorParser.g:2120:2: ( ruleClass )
            {
            // InternalModelEditorParser.g:2120:2: ( ruleClass )
            // InternalModelEditorParser.g:2121:3: ruleClass
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
    // InternalModelEditorParser.g:2130:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleQualifiedNameWithWildcard ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:2134:1: ( ( ruleQualifiedNameWithWildcard ) )
            // InternalModelEditorParser.g:2135:2: ( ruleQualifiedNameWithWildcard )
            {
            // InternalModelEditorParser.g:2135:2: ( ruleQualifiedNameWithWildcard )
            // InternalModelEditorParser.g:2136:3: ruleQualifiedNameWithWildcard
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
    // InternalModelEditorParser.g:2145:1: rule__Class__ModifierAssignment_0 : ( ruleClassModifier ) ;
    public final void rule__Class__ModifierAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:2149:1: ( ( ruleClassModifier ) )
            // InternalModelEditorParser.g:2150:2: ( ruleClassModifier )
            {
            // InternalModelEditorParser.g:2150:2: ( ruleClassModifier )
            // InternalModelEditorParser.g:2151:3: ruleClassModifier
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
    // InternalModelEditorParser.g:2160:1: rule__Class__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Class__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:2164:1: ( ( RULE_ID ) )
            // InternalModelEditorParser.g:2165:2: ( RULE_ID )
            {
            // InternalModelEditorParser.g:2165:2: ( RULE_ID )
            // InternalModelEditorParser.g:2166:3: RULE_ID
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


    // $ANTLR start "rule__Class__SuperTypeAssignment_3_1"
    // InternalModelEditorParser.g:2175:1: rule__Class__SuperTypeAssignment_3_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Class__SuperTypeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:2179:1: ( ( ( ruleQualifiedName ) ) )
            // InternalModelEditorParser.g:2180:2: ( ( ruleQualifiedName ) )
            {
            // InternalModelEditorParser.g:2180:2: ( ( ruleQualifiedName ) )
            // InternalModelEditorParser.g:2181:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getClassAccess().getSuperTypeClassCrossReference_3_1_0()); 
            // InternalModelEditorParser.g:2182:3: ( ruleQualifiedName )
            // InternalModelEditorParser.g:2183:4: ruleQualifiedName
            {
             before(grammarAccess.getClassAccess().getSuperTypeClassQualifiedNameParserRuleCall_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getClassAccess().getSuperTypeClassQualifiedNameParserRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getClassAccess().getSuperTypeClassCrossReference_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__SuperTypeAssignment_3_1"


    // $ANTLR start "rule__Class__FieldsAssignment_4_1"
    // InternalModelEditorParser.g:2194:1: rule__Class__FieldsAssignment_4_1 : ( ruleField ) ;
    public final void rule__Class__FieldsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:2198:1: ( ( ruleField ) )
            // InternalModelEditorParser.g:2199:2: ( ruleField )
            {
            // InternalModelEditorParser.g:2199:2: ( ruleField )
            // InternalModelEditorParser.g:2200:3: ruleField
            {
             before(grammarAccess.getClassAccess().getFieldsFieldParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleField();

            state._fsp--;

             after(grammarAccess.getClassAccess().getFieldsFieldParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__FieldsAssignment_4_1"


    // $ANTLR start "rule__Class__MethodsAssignment_4_2"
    // InternalModelEditorParser.g:2209:1: rule__Class__MethodsAssignment_4_2 : ( ruleMethod ) ;
    public final void rule__Class__MethodsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:2213:1: ( ( ruleMethod ) )
            // InternalModelEditorParser.g:2214:2: ( ruleMethod )
            {
            // InternalModelEditorParser.g:2214:2: ( ruleMethod )
            // InternalModelEditorParser.g:2215:3: ruleMethod
            {
             before(grammarAccess.getClassAccess().getMethodsMethodParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMethod();

            state._fsp--;

             after(grammarAccess.getClassAccess().getMethodsMethodParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__MethodsAssignment_4_2"


    // $ANTLR start "rule__Field__ModifierAssignment_0"
    // InternalModelEditorParser.g:2224:1: rule__Field__ModifierAssignment_0 : ( ruleMemberModifier ) ;
    public final void rule__Field__ModifierAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:2228:1: ( ( ruleMemberModifier ) )
            // InternalModelEditorParser.g:2229:2: ( ruleMemberModifier )
            {
            // InternalModelEditorParser.g:2229:2: ( ruleMemberModifier )
            // InternalModelEditorParser.g:2230:3: ruleMemberModifier
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
    // InternalModelEditorParser.g:2239:1: rule__Field__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Field__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:2243:1: ( ( RULE_ID ) )
            // InternalModelEditorParser.g:2244:2: ( RULE_ID )
            {
            // InternalModelEditorParser.g:2244:2: ( RULE_ID )
            // InternalModelEditorParser.g:2245:3: RULE_ID
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
    // InternalModelEditorParser.g:2254:1: rule__Field__TypeAssignment_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Field__TypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:2258:1: ( ( ( ruleQualifiedName ) ) )
            // InternalModelEditorParser.g:2259:2: ( ( ruleQualifiedName ) )
            {
            // InternalModelEditorParser.g:2259:2: ( ( ruleQualifiedName ) )
            // InternalModelEditorParser.g:2260:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getFieldAccess().getTypeClassCrossReference_2_1_0()); 
            // InternalModelEditorParser.g:2261:3: ( ruleQualifiedName )
            // InternalModelEditorParser.g:2262:4: ruleQualifiedName
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
    // InternalModelEditorParser.g:2273:1: rule__Method__ModifierAssignment_0 : ( ruleMemberModifier ) ;
    public final void rule__Method__ModifierAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:2277:1: ( ( ruleMemberModifier ) )
            // InternalModelEditorParser.g:2278:2: ( ruleMemberModifier )
            {
            // InternalModelEditorParser.g:2278:2: ( ruleMemberModifier )
            // InternalModelEditorParser.g:2279:3: ruleMemberModifier
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
    // InternalModelEditorParser.g:2288:1: rule__Method__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Method__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:2292:1: ( ( RULE_ID ) )
            // InternalModelEditorParser.g:2293:2: ( RULE_ID )
            {
            // InternalModelEditorParser.g:2293:2: ( RULE_ID )
            // InternalModelEditorParser.g:2294:3: RULE_ID
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
    // InternalModelEditorParser.g:2303:1: rule__Method__TypesAssignment_3_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Method__TypesAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:2307:1: ( ( ( ruleQualifiedName ) ) )
            // InternalModelEditorParser.g:2308:2: ( ( ruleQualifiedName ) )
            {
            // InternalModelEditorParser.g:2308:2: ( ( ruleQualifiedName ) )
            // InternalModelEditorParser.g:2309:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getMethodAccess().getTypesClassCrossReference_3_0_0()); 
            // InternalModelEditorParser.g:2310:3: ( ruleQualifiedName )
            // InternalModelEditorParser.g:2311:4: ruleQualifiedName
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
    // InternalModelEditorParser.g:2322:1: rule__Method__TypesAssignment_3_1_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Method__TypesAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:2326:1: ( ( ( ruleQualifiedName ) ) )
            // InternalModelEditorParser.g:2327:2: ( ( ruleQualifiedName ) )
            {
            // InternalModelEditorParser.g:2327:2: ( ( ruleQualifiedName ) )
            // InternalModelEditorParser.g:2328:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getMethodAccess().getTypesClassCrossReference_3_1_1_0()); 
            // InternalModelEditorParser.g:2329:3: ( ruleQualifiedName )
            // InternalModelEditorParser.g:2330:4: ruleQualifiedName
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
    // InternalModelEditorParser.g:2341:1: rule__Method__TypeAssignment_5_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Method__TypeAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:2345:1: ( ( ( ruleQualifiedName ) ) )
            // InternalModelEditorParser.g:2346:2: ( ( ruleQualifiedName ) )
            {
            // InternalModelEditorParser.g:2346:2: ( ( ruleQualifiedName ) )
            // InternalModelEditorParser.g:2347:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getMethodAccess().getTypeClassCrossReference_5_1_0()); 
            // InternalModelEditorParser.g:2348:3: ( ruleQualifiedName )
            // InternalModelEditorParser.g:2349:4: ruleQualifiedName
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
    // InternalModelEditorParser.g:2360:1: rule__Method__LocAssignment_6_1_0 : ( RULE_INT ) ;
    public final void rule__Method__LocAssignment_6_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:2364:1: ( ( RULE_INT ) )
            // InternalModelEditorParser.g:2365:2: ( RULE_INT )
            {
            // InternalModelEditorParser.g:2365:2: ( RULE_INT )
            // InternalModelEditorParser.g:2366:3: RULE_INT
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
    // InternalModelEditorParser.g:2375:1: rule__Method__CycloAssignment_6_2_0 : ( RULE_INT ) ;
    public final void rule__Method__CycloAssignment_6_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:2379:1: ( ( RULE_INT ) )
            // InternalModelEditorParser.g:2380:2: ( RULE_INT )
            {
            // InternalModelEditorParser.g:2380:2: ( RULE_INT )
            // InternalModelEditorParser.g:2381:3: RULE_INT
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
    // InternalModelEditorParser.g:2390:1: rule__Method__AccessesAssignment_6_3 : ( ruleAccess ) ;
    public final void rule__Method__AccessesAssignment_6_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:2394:1: ( ( ruleAccess ) )
            // InternalModelEditorParser.g:2395:2: ( ruleAccess )
            {
            // InternalModelEditorParser.g:2395:2: ( ruleAccess )
            // InternalModelEditorParser.g:2396:3: ruleAccess
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
    // InternalModelEditorParser.g:2405:1: rule__Method__CallsAssignment_6_4 : ( ruleCall ) ;
    public final void rule__Method__CallsAssignment_6_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:2409:1: ( ( ruleCall ) )
            // InternalModelEditorParser.g:2410:2: ( ruleCall )
            {
            // InternalModelEditorParser.g:2410:2: ( ruleCall )
            // InternalModelEditorParser.g:2411:3: ruleCall
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
    // InternalModelEditorParser.g:2420:1: rule__Access__AccessesAssignment_0 : ( RULE_INT ) ;
    public final void rule__Access__AccessesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:2424:1: ( ( RULE_INT ) )
            // InternalModelEditorParser.g:2425:2: ( RULE_INT )
            {
            // InternalModelEditorParser.g:2425:2: ( RULE_INT )
            // InternalModelEditorParser.g:2426:3: RULE_INT
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
    // InternalModelEditorParser.g:2435:1: rule__Access__FieldAssignment_3 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Access__FieldAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:2439:1: ( ( ( ruleQualifiedName ) ) )
            // InternalModelEditorParser.g:2440:2: ( ( ruleQualifiedName ) )
            {
            // InternalModelEditorParser.g:2440:2: ( ( ruleQualifiedName ) )
            // InternalModelEditorParser.g:2441:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getAccessAccess().getFieldFieldCrossReference_3_0()); 
            // InternalModelEditorParser.g:2442:3: ( ruleQualifiedName )
            // InternalModelEditorParser.g:2443:4: ruleQualifiedName
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
    // InternalModelEditorParser.g:2454:1: rule__Call__CallsAssignment_0 : ( RULE_INT ) ;
    public final void rule__Call__CallsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:2458:1: ( ( RULE_INT ) )
            // InternalModelEditorParser.g:2459:2: ( RULE_INT )
            {
            // InternalModelEditorParser.g:2459:2: ( RULE_INT )
            // InternalModelEditorParser.g:2460:3: RULE_INT
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
    // InternalModelEditorParser.g:2469:1: rule__Call__MethodAssignment_3 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Call__MethodAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelEditorParser.g:2473:1: ( ( ( ruleQualifiedName ) ) )
            // InternalModelEditorParser.g:2474:2: ( ( ruleQualifiedName ) )
            {
            // InternalModelEditorParser.g:2474:2: ( ( ruleQualifiedName ) )
            // InternalModelEditorParser.g:2475:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getCallAccess().getMethodMethodCrossReference_3_0()); 
            // InternalModelEditorParser.g:2476:3: ( ruleQualifiedName )
            // InternalModelEditorParser.g:2477:4: ruleQualifiedName
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002940L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002942L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000004000080L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000018000950L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000010000952L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000010000950L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000010400000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000028000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000220L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000011000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000400000L});

}