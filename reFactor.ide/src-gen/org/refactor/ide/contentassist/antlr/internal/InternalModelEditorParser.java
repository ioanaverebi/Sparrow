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
	public static final String[] tokenNames = new String[] { "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Protected",
			"Accesses", "Constant", "Extends", "Private", "Access", "Import", "Public", "Calls", "Class", "Cyclo",
			"Lines", "Call", "Code", "FullStopAsterisk", "Of", "To", "LeftParenthesis", "RightParenthesis", "Comma",
			"FullStop", "Colon", "RULE_BEGIN", "RULE_END", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT",
			"RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER" };
	public static final int RULE_END = 27;
	public static final int Import = 10;
	public static final int RULE_BEGIN = 26;
	public static final int Constant = 6;
	public static final int Access = 9;
	public static final int RULE_STRING = 30;
	public static final int RULE_SL_COMMENT = 32;
	public static final int Comma = 23;
	public static final int LeftParenthesis = 21;
	public static final int Accesses = 5;
	public static final int Private = 8;
	public static final int To = 20;
	public static final int Colon = 25;
	public static final int Extends = 7;
	public static final int EOF = -1;
	public static final int Call = 16;
	public static final int FullStop = 24;
	public static final int Protected = 4;
	public static final int RULE_ID = 28;
	public static final int RULE_WS = 33;
	public static final int Calls = 12;
	public static final int RightParenthesis = 22;
	public static final int Public = 11;
	public static final int RULE_ANY_OTHER = 34;
	public static final int Code = 17;
	public static final int RULE_INT = 29;
	public static final int FullStopAsterisk = 18;
	public static final int Of = 19;
	public static final int Cyclo = 14;
	public static final int RULE_ML_COMMENT = 31;
	public static final int Class = 13;
	public static final int Lines = 15;

	// delegates
	// delegators

	public InternalModelEditorParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}

	public InternalModelEditorParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);

	}

	public String[] getTokenNames() {
		return InternalModelEditorParser.tokenNames;
	}

	public String getGrammarFileName() {
		return "InternalModelEditorParser.g";
	}

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
				match(input, EOF, FOLLOW_2);

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return;
	}
	// $ANTLR end "entryRuleModel"

	// $ANTLR start "ruleModel"
	// InternalModelEditorParser.g:86:1: ruleModel : ( ( rule__Model__Group__0 )
	// ) ;
	public final void ruleModel() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:90:2: ( ( ( rule__Model__Group__0 ) )
			// )
			// InternalModelEditorParser.g:91:2: ( ( rule__Model__Group__0 ) )
			{
				// InternalModelEditorParser.g:91:2: ( ( rule__Model__Group__0 )
				// )
				// InternalModelEditorParser.g:92:3: ( rule__Model__Group__0 )
				{
					before(grammarAccess.getModelAccess().getGroup());
					// InternalModelEditorParser.g:93:3: ( rule__Model__Group__0
					// )
					// InternalModelEditorParser.g:93:4: rule__Model__Group__0
					{
						pushFollow(FOLLOW_2);
						rule__Model__Group__0();

						state._fsp--;

					}

					after(grammarAccess.getModelAccess().getGroup());

				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
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
				match(input, EOF, FOLLOW_2);

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return;
	}
	// $ANTLR end "entryRuleImport"

	// $ANTLR start "ruleImport"
	// InternalModelEditorParser.g:111:1: ruleImport : ( (
	// rule__Import__Group__0 ) ) ;
	public final void ruleImport() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:115:2: ( ( ( rule__Import__Group__0 )
			// ) )
			// InternalModelEditorParser.g:116:2: ( ( rule__Import__Group__0 ) )
			{
				// InternalModelEditorParser.g:116:2: ( ( rule__Import__Group__0
				// ) )
				// InternalModelEditorParser.g:117:3: ( rule__Import__Group__0 )
				{
					before(grammarAccess.getImportAccess().getGroup());
					// InternalModelEditorParser.g:118:3: (
					// rule__Import__Group__0 )
					// InternalModelEditorParser.g:118:4: rule__Import__Group__0
					{
						pushFollow(FOLLOW_2);
						rule__Import__Group__0();

						state._fsp--;

					}

					after(grammarAccess.getImportAccess().getGroup());

				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "ruleImport"

	// $ANTLR start "entryRuleQualifiedNameWithWildcard"
	// InternalModelEditorParser.g:127:1: entryRuleQualifiedNameWithWildcard :
	// ruleQualifiedNameWithWildcard EOF ;
	public final void entryRuleQualifiedNameWithWildcard() throws RecognitionException {
		try {
			// InternalModelEditorParser.g:128:1: (
			// ruleQualifiedNameWithWildcard EOF )
			// InternalModelEditorParser.g:129:1: ruleQualifiedNameWithWildcard
			// EOF
			{
				before(grammarAccess.getQualifiedNameWithWildcardRule());
				pushFollow(FOLLOW_1);
				ruleQualifiedNameWithWildcard();

				state._fsp--;

				after(grammarAccess.getQualifiedNameWithWildcardRule());
				match(input, EOF, FOLLOW_2);

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return;
	}
	// $ANTLR end "entryRuleQualifiedNameWithWildcard"

	// $ANTLR start "ruleQualifiedNameWithWildcard"
	// InternalModelEditorParser.g:136:1: ruleQualifiedNameWithWildcard : ( (
	// rule__QualifiedNameWithWildcard__Group__0 ) ) ;
	public final void ruleQualifiedNameWithWildcard() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:140:2: ( ( (
			// rule__QualifiedNameWithWildcard__Group__0 ) ) )
			// InternalModelEditorParser.g:141:2: ( (
			// rule__QualifiedNameWithWildcard__Group__0 ) )
			{
				// InternalModelEditorParser.g:141:2: ( (
				// rule__QualifiedNameWithWildcard__Group__0 ) )
				// InternalModelEditorParser.g:142:3: (
				// rule__QualifiedNameWithWildcard__Group__0 )
				{
					before(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup());
					// InternalModelEditorParser.g:143:3: (
					// rule__QualifiedNameWithWildcard__Group__0 )
					// InternalModelEditorParser.g:143:4:
					// rule__QualifiedNameWithWildcard__Group__0
					{
						pushFollow(FOLLOW_2);
						rule__QualifiedNameWithWildcard__Group__0();

						state._fsp--;

					}

					after(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup());

				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "ruleQualifiedNameWithWildcard"

	// $ANTLR start "entryRuleQualifiedName"
	// InternalModelEditorParser.g:152:1: entryRuleQualifiedName :
	// ruleQualifiedName EOF ;
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
				match(input, EOF, FOLLOW_2);

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return;
	}
	// $ANTLR end "entryRuleQualifiedName"

	// $ANTLR start "ruleQualifiedName"
	// InternalModelEditorParser.g:161:1: ruleQualifiedName : ( (
	// rule__QualifiedName__Group__0 ) ) ;
	public final void ruleQualifiedName() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:165:2: ( ( (
			// rule__QualifiedName__Group__0 ) ) )
			// InternalModelEditorParser.g:166:2: ( (
			// rule__QualifiedName__Group__0 ) )
			{
				// InternalModelEditorParser.g:166:2: ( (
				// rule__QualifiedName__Group__0 ) )
				// InternalModelEditorParser.g:167:3: (
				// rule__QualifiedName__Group__0 )
				{
					before(grammarAccess.getQualifiedNameAccess().getGroup());
					// InternalModelEditorParser.g:168:3: (
					// rule__QualifiedName__Group__0 )
					// InternalModelEditorParser.g:168:4:
					// rule__QualifiedName__Group__0
					{
						pushFollow(FOLLOW_2);
						rule__QualifiedName__Group__0();

						state._fsp--;

					}

					after(grammarAccess.getQualifiedNameAccess().getGroup());

				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
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
				match(input, EOF, FOLLOW_2);

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return;
	}
	// $ANTLR end "entryRuleClass"

	// $ANTLR start "ruleClass"
	// InternalModelEditorParser.g:186:1: ruleClass : ( ( rule__Class__Group__0
	// ) ) ;
	public final void ruleClass() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:190:2: ( ( ( rule__Class__Group__0 )
			// ) )
			// InternalModelEditorParser.g:191:2: ( ( rule__Class__Group__0 ) )
			{
				// InternalModelEditorParser.g:191:2: ( ( rule__Class__Group__0
				// ) )
				// InternalModelEditorParser.g:192:3: ( rule__Class__Group__0 )
				{
					before(grammarAccess.getClassAccess().getGroup());
					// InternalModelEditorParser.g:193:3: (
					// rule__Class__Group__0 )
					// InternalModelEditorParser.g:193:4: rule__Class__Group__0
					{
						pushFollow(FOLLOW_2);
						rule__Class__Group__0();

						state._fsp--;

					}

					after(grammarAccess.getClassAccess().getGroup());

				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
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
				match(input, EOF, FOLLOW_2);

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return;
	}
	// $ANTLR end "entryRuleField"

	// $ANTLR start "ruleField"
	// InternalModelEditorParser.g:211:1: ruleField : ( ( rule__Field__Group__0
	// ) ) ;
	public final void ruleField() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:215:2: ( ( ( rule__Field__Group__0 )
			// ) )
			// InternalModelEditorParser.g:216:2: ( ( rule__Field__Group__0 ) )
			{
				// InternalModelEditorParser.g:216:2: ( ( rule__Field__Group__0
				// ) )
				// InternalModelEditorParser.g:217:3: ( rule__Field__Group__0 )
				{
					before(grammarAccess.getFieldAccess().getGroup());
					// InternalModelEditorParser.g:218:3: (
					// rule__Field__Group__0 )
					// InternalModelEditorParser.g:218:4: rule__Field__Group__0
					{
						pushFollow(FOLLOW_2);
						rule__Field__Group__0();

						state._fsp--;

					}

					after(grammarAccess.getFieldAccess().getGroup());

				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
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
				match(input, EOF, FOLLOW_2);

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return;
	}
	// $ANTLR end "entryRuleMethod"

	// $ANTLR start "ruleMethod"
	// InternalModelEditorParser.g:236:1: ruleMethod : ( (
	// rule__Method__Group__0 ) ) ;
	public final void ruleMethod() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:240:2: ( ( ( rule__Method__Group__0 )
			// ) )
			// InternalModelEditorParser.g:241:2: ( ( rule__Method__Group__0 ) )
			{
				// InternalModelEditorParser.g:241:2: ( ( rule__Method__Group__0
				// ) )
				// InternalModelEditorParser.g:242:3: ( rule__Method__Group__0 )
				{
					before(grammarAccess.getMethodAccess().getGroup());
					// InternalModelEditorParser.g:243:3: (
					// rule__Method__Group__0 )
					// InternalModelEditorParser.g:243:4: rule__Method__Group__0
					{
						pushFollow(FOLLOW_2);
						rule__Method__Group__0();

						state._fsp--;

					}

					after(grammarAccess.getMethodAccess().getGroup());

				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "ruleMethod"

	// $ANTLR start "entryRuleMemberModifier"
	// InternalModelEditorParser.g:252:1: entryRuleMemberModifier :
	// ruleMemberModifier EOF ;
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
				match(input, EOF, FOLLOW_2);

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return;
	}
	// $ANTLR end "entryRuleMemberModifier"

	// $ANTLR start "ruleMemberModifier"
	// InternalModelEditorParser.g:261:1: ruleMemberModifier : ( (
	// rule__MemberModifier__Alternatives ) ) ;
	public final void ruleMemberModifier() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:265:2: ( ( (
			// rule__MemberModifier__Alternatives ) ) )
			// InternalModelEditorParser.g:266:2: ( (
			// rule__MemberModifier__Alternatives ) )
			{
				// InternalModelEditorParser.g:266:2: ( (
				// rule__MemberModifier__Alternatives ) )
				// InternalModelEditorParser.g:267:3: (
				// rule__MemberModifier__Alternatives )
				{
					before(grammarAccess.getMemberModifierAccess().getAlternatives());
					// InternalModelEditorParser.g:268:3: (
					// rule__MemberModifier__Alternatives )
					// InternalModelEditorParser.g:268:4:
					// rule__MemberModifier__Alternatives
					{
						pushFollow(FOLLOW_2);
						rule__MemberModifier__Alternatives();

						state._fsp--;

					}

					after(grammarAccess.getMemberModifierAccess().getAlternatives());

				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "ruleMemberModifier"

	// $ANTLR start "entryRuleClassModifier"
	// InternalModelEditorParser.g:277:1: entryRuleClassModifier :
	// ruleClassModifier EOF ;
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
				match(input, EOF, FOLLOW_2);

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return;
	}
	// $ANTLR end "entryRuleClassModifier"

	// $ANTLR start "ruleClassModifier"
	// InternalModelEditorParser.g:286:1: ruleClassModifier : ( (
	// rule__ClassModifier__Alternatives ) ) ;
	public final void ruleClassModifier() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:290:2: ( ( (
			// rule__ClassModifier__Alternatives ) ) )
			// InternalModelEditorParser.g:291:2: ( (
			// rule__ClassModifier__Alternatives ) )
			{
				// InternalModelEditorParser.g:291:2: ( (
				// rule__ClassModifier__Alternatives ) )
				// InternalModelEditorParser.g:292:3: (
				// rule__ClassModifier__Alternatives )
				{
					before(grammarAccess.getClassModifierAccess().getAlternatives());
					// InternalModelEditorParser.g:293:3: (
					// rule__ClassModifier__Alternatives )
					// InternalModelEditorParser.g:293:4:
					// rule__ClassModifier__Alternatives
					{
						pushFollow(FOLLOW_2);
						rule__ClassModifier__Alternatives();

						state._fsp--;

					}

					after(grammarAccess.getClassModifierAccess().getAlternatives());

				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
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
				match(input, EOF, FOLLOW_2);

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return;
	}
	// $ANTLR end "entryRuleAccess"

	// $ANTLR start "ruleAccess"
	// InternalModelEditorParser.g:311:1: ruleAccess : ( (
	// rule__Access__Group__0 ) ) ;
	public final void ruleAccess() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:315:2: ( ( ( rule__Access__Group__0 )
			// ) )
			// InternalModelEditorParser.g:316:2: ( ( rule__Access__Group__0 ) )
			{
				// InternalModelEditorParser.g:316:2: ( ( rule__Access__Group__0
				// ) )
				// InternalModelEditorParser.g:317:3: ( rule__Access__Group__0 )
				{
					before(grammarAccess.getAccessAccess().getGroup());
					// InternalModelEditorParser.g:318:3: (
					// rule__Access__Group__0 )
					// InternalModelEditorParser.g:318:4: rule__Access__Group__0
					{
						pushFollow(FOLLOW_2);
						rule__Access__Group__0();

						state._fsp--;

					}

					after(grammarAccess.getAccessAccess().getGroup());

				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
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
				match(input, EOF, FOLLOW_2);

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {
		}
		return;
	}
	// $ANTLR end "entryRuleCall"

	// $ANTLR start "ruleCall"
	// InternalModelEditorParser.g:336:1: ruleCall : ( ( rule__Call__Group__0 )
	// ) ;
	public final void ruleCall() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:340:2: ( ( ( rule__Call__Group__0 ) )
			// )
			// InternalModelEditorParser.g:341:2: ( ( rule__Call__Group__0 ) )
			{
				// InternalModelEditorParser.g:341:2: ( ( rule__Call__Group__0 )
				// )
				// InternalModelEditorParser.g:342:3: ( rule__Call__Group__0 )
				{
					before(grammarAccess.getCallAccess().getGroup());
					// InternalModelEditorParser.g:343:3: ( rule__Call__Group__0
					// )
					// InternalModelEditorParser.g:343:4: rule__Call__Group__0
					{
						pushFollow(FOLLOW_2);
						rule__Call__Group__0();

						state._fsp--;

					}

					after(grammarAccess.getCallAccess().getGroup());

				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "ruleCall"

	// $ANTLR start "rule__QualifiedName__Alternatives_0"
	// InternalModelEditorParser.g:351:1: rule__QualifiedName__Alternatives_0 :
	// ( ( RULE_ID ) | ( RULE_STRING ) );
	public final void rule__QualifiedName__Alternatives_0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:355:1: ( ( RULE_ID ) | ( RULE_STRING
			// ) )
			int alt1 = 2;
			int LA1_0 = input.LA(1);

			if ((LA1_0 == RULE_ID)) {
				alt1 = 1;
			} else if ((LA1_0 == RULE_STRING)) {
				alt1 = 2;
			} else {
				NoViableAltException nvae = new NoViableAltException("", 1, 0, input);

				throw nvae;
			}
			switch (alt1) {
			case 1:
			// InternalModelEditorParser.g:356:2: ( RULE_ID )
			{
				// InternalModelEditorParser.g:356:2: ( RULE_ID )
				// InternalModelEditorParser.g:357:3: RULE_ID
				{
					before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0_0());
					match(input, RULE_ID, FOLLOW_2);
					after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0_0());

				}

			}
				break;
			case 2:
			// InternalModelEditorParser.g:362:2: ( RULE_STRING )
			{
				// InternalModelEditorParser.g:362:2: ( RULE_STRING )
				// InternalModelEditorParser.g:363:3: RULE_STRING
				{
					before(grammarAccess.getQualifiedNameAccess().getSTRINGTerminalRuleCall_0_1());
					match(input, RULE_STRING, FOLLOW_2);
					after(grammarAccess.getQualifiedNameAccess().getSTRINGTerminalRuleCall_0_1());

				}

			}
				break;

			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__QualifiedName__Alternatives_0"

	// $ANTLR start "rule__QualifiedName__Alternatives_1"
	// InternalModelEditorParser.g:372:1: rule__QualifiedName__Alternatives_1 :
	// ( ( ( rule__QualifiedName__Group_1_0__0 ) ) | ( RULE_STRING ) );
	public final void rule__QualifiedName__Alternatives_1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:376:1: ( ( (
			// rule__QualifiedName__Group_1_0__0 ) ) | ( RULE_STRING ) )
			int alt2 = 2;
			int LA2_0 = input.LA(1);

			if ((LA2_0 == FullStop)) {
				alt2 = 1;
			} else if ((LA2_0 == RULE_STRING)) {
				alt2 = 2;
			} else {
				NoViableAltException nvae = new NoViableAltException("", 2, 0, input);

				throw nvae;
			}
			switch (alt2) {
			case 1:
			// InternalModelEditorParser.g:377:2: ( (
			// rule__QualifiedName__Group_1_0__0 ) )
			{
				// InternalModelEditorParser.g:377:2: ( (
				// rule__QualifiedName__Group_1_0__0 ) )
				// InternalModelEditorParser.g:378:3: (
				// rule__QualifiedName__Group_1_0__0 )
				{
					before(grammarAccess.getQualifiedNameAccess().getGroup_1_0());
					// InternalModelEditorParser.g:379:3: (
					// rule__QualifiedName__Group_1_0__0 )
					// InternalModelEditorParser.g:379:4:
					// rule__QualifiedName__Group_1_0__0
					{
						pushFollow(FOLLOW_2);
						rule__QualifiedName__Group_1_0__0();

						state._fsp--;

					}

					after(grammarAccess.getQualifiedNameAccess().getGroup_1_0());

				}

			}
				break;
			case 2:
			// InternalModelEditorParser.g:383:2: ( RULE_STRING )
			{
				// InternalModelEditorParser.g:383:2: ( RULE_STRING )
				// InternalModelEditorParser.g:384:3: RULE_STRING
				{
					before(grammarAccess.getQualifiedNameAccess().getSTRINGTerminalRuleCall_1_1());
					match(input, RULE_STRING, FOLLOW_2);
					after(grammarAccess.getQualifiedNameAccess().getSTRINGTerminalRuleCall_1_1());

				}

			}
				break;

			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__QualifiedName__Alternatives_1"

	// $ANTLR start "rule__MemberModifier__Alternatives"
	// InternalModelEditorParser.g:393:1: rule__MemberModifier__Alternatives : (
	// ( Public ) | ( Private ) | ( Protected ) | ( Constant ) );
	public final void rule__MemberModifier__Alternatives() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:397:1: ( ( Public ) | ( Private ) | (
			// Protected ) | ( Constant ) )
			int alt3 = 4;
			switch (input.LA(1)) {
			case Public: {
				alt3 = 1;
			}
				break;
			case Private: {
				alt3 = 2;
			}
				break;
			case Protected: {
				alt3 = 3;
			}
				break;
			case Constant: {
				alt3 = 4;
			}
				break;
			default:
				NoViableAltException nvae = new NoViableAltException("", 3, 0, input);

				throw nvae;
			}

			switch (alt3) {
			case 1:
			// InternalModelEditorParser.g:398:2: ( Public )
			{
				// InternalModelEditorParser.g:398:2: ( Public )
				// InternalModelEditorParser.g:399:3: Public
				{
					before(grammarAccess.getMemberModifierAccess().getPublicKeyword_0());
					match(input, Public, FOLLOW_2);
					after(grammarAccess.getMemberModifierAccess().getPublicKeyword_0());

				}

			}
				break;
			case 2:
			// InternalModelEditorParser.g:404:2: ( Private )
			{
				// InternalModelEditorParser.g:404:2: ( Private )
				// InternalModelEditorParser.g:405:3: Private
				{
					before(grammarAccess.getMemberModifierAccess().getPrivateKeyword_1());
					match(input, Private, FOLLOW_2);
					after(grammarAccess.getMemberModifierAccess().getPrivateKeyword_1());

				}

			}
				break;
			case 3:
			// InternalModelEditorParser.g:410:2: ( Protected )
			{
				// InternalModelEditorParser.g:410:2: ( Protected )
				// InternalModelEditorParser.g:411:3: Protected
				{
					before(grammarAccess.getMemberModifierAccess().getProtectedKeyword_2());
					match(input, Protected, FOLLOW_2);
					after(grammarAccess.getMemberModifierAccess().getProtectedKeyword_2());

				}

			}
				break;
			case 4:
			// InternalModelEditorParser.g:416:2: ( Constant )
			{
				// InternalModelEditorParser.g:416:2: ( Constant )
				// InternalModelEditorParser.g:417:3: Constant
				{
					before(grammarAccess.getMemberModifierAccess().getConstantKeyword_3());
					match(input, Constant, FOLLOW_2);
					after(grammarAccess.getMemberModifierAccess().getConstantKeyword_3());

				}

			}
				break;

			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__MemberModifier__Alternatives"

	// $ANTLR start "rule__ClassModifier__Alternatives"
	// InternalModelEditorParser.g:426:1: rule__ClassModifier__Alternatives : (
	// ( Public ) | ( Private ) | ( Constant ) );
	public final void rule__ClassModifier__Alternatives() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:430:1: ( ( Public ) | ( Private ) | (
			// Constant ) )
			int alt4 = 3;
			switch (input.LA(1)) {
			case Public: {
				alt4 = 1;
			}
				break;
			case Private: {
				alt4 = 2;
			}
				break;
			case Constant: {
				alt4 = 3;
			}
				break;
			default:
				NoViableAltException nvae = new NoViableAltException("", 4, 0, input);

				throw nvae;
			}

			switch (alt4) {
			case 1:
			// InternalModelEditorParser.g:431:2: ( Public )
			{
				// InternalModelEditorParser.g:431:2: ( Public )
				// InternalModelEditorParser.g:432:3: Public
				{
					before(grammarAccess.getClassModifierAccess().getPublicKeyword_0());
					match(input, Public, FOLLOW_2);
					after(grammarAccess.getClassModifierAccess().getPublicKeyword_0());

				}

			}
				break;
			case 2:
			// InternalModelEditorParser.g:437:2: ( Private )
			{
				// InternalModelEditorParser.g:437:2: ( Private )
				// InternalModelEditorParser.g:438:3: Private
				{
					before(grammarAccess.getClassModifierAccess().getPrivateKeyword_1());
					match(input, Private, FOLLOW_2);
					after(grammarAccess.getClassModifierAccess().getPrivateKeyword_1());

				}

			}
				break;
			case 3:
			// InternalModelEditorParser.g:443:2: ( Constant )
			{
				// InternalModelEditorParser.g:443:2: ( Constant )
				// InternalModelEditorParser.g:444:3: Constant
				{
					before(grammarAccess.getClassModifierAccess().getConstantKeyword_2());
					match(input, Constant, FOLLOW_2);
					after(grammarAccess.getClassModifierAccess().getConstantKeyword_2());

				}

			}
				break;

			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__ClassModifier__Alternatives"

	// $ANTLR start "rule__Access__Alternatives_1"
	// InternalModelEditorParser.g:453:1: rule__Access__Alternatives_1 : ( (
	// Access ) | ( Accesses ) );
	public final void rule__Access__Alternatives_1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:457:1: ( ( Access ) | ( Accesses ) )
			int alt5 = 2;
			int LA5_0 = input.LA(1);

			if ((LA5_0 == Access)) {
				alt5 = 1;
			} else if ((LA5_0 == Accesses)) {
				alt5 = 2;
			} else {
				NoViableAltException nvae = new NoViableAltException("", 5, 0, input);

				throw nvae;
			}
			switch (alt5) {
			case 1:
			// InternalModelEditorParser.g:458:2: ( Access )
			{
				// InternalModelEditorParser.g:458:2: ( Access )
				// InternalModelEditorParser.g:459:3: Access
				{
					before(grammarAccess.getAccessAccess().getAccessKeyword_1_0());
					match(input, Access, FOLLOW_2);
					after(grammarAccess.getAccessAccess().getAccessKeyword_1_0());

				}

			}
				break;
			case 2:
			// InternalModelEditorParser.g:464:2: ( Accesses )
			{
				// InternalModelEditorParser.g:464:2: ( Accesses )
				// InternalModelEditorParser.g:465:3: Accesses
				{
					before(grammarAccess.getAccessAccess().getAccessesKeyword_1_1());
					match(input, Accesses, FOLLOW_2);
					after(grammarAccess.getAccessAccess().getAccessesKeyword_1_1());

				}

			}
				break;

			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Access__Alternatives_1"

	// $ANTLR start "rule__Call__Alternatives_1"
	// InternalModelEditorParser.g:474:1: rule__Call__Alternatives_1 : ( ( Call
	// ) | ( Calls ) );
	public final void rule__Call__Alternatives_1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:478:1: ( ( Call ) | ( Calls ) )
			int alt6 = 2;
			int LA6_0 = input.LA(1);

			if ((LA6_0 == Call)) {
				alt6 = 1;
			} else if ((LA6_0 == Calls)) {
				alt6 = 2;
			} else {
				NoViableAltException nvae = new NoViableAltException("", 6, 0, input);

				throw nvae;
			}
			switch (alt6) {
			case 1:
			// InternalModelEditorParser.g:479:2: ( Call )
			{
				// InternalModelEditorParser.g:479:2: ( Call )
				// InternalModelEditorParser.g:480:3: Call
				{
					before(grammarAccess.getCallAccess().getCallKeyword_1_0());
					match(input, Call, FOLLOW_2);
					after(grammarAccess.getCallAccess().getCallKeyword_1_0());

				}

			}
				break;
			case 2:
			// InternalModelEditorParser.g:485:2: ( Calls )
			{
				// InternalModelEditorParser.g:485:2: ( Calls )
				// InternalModelEditorParser.g:486:3: Calls
				{
					before(grammarAccess.getCallAccess().getCallsKeyword_1_1());
					match(input, Calls, FOLLOW_2);
					after(grammarAccess.getCallAccess().getCallsKeyword_1_1());

				}

			}
				break;

			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Call__Alternatives_1"

	// $ANTLR start "rule__Model__Group__0"
	// InternalModelEditorParser.g:495:1: rule__Model__Group__0 :
	// rule__Model__Group__0__Impl rule__Model__Group__1 ;
	public final void rule__Model__Group__0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:499:1: ( rule__Model__Group__0__Impl
			// rule__Model__Group__1 )
			// InternalModelEditorParser.g:500:2: rule__Model__Group__0__Impl
			// rule__Model__Group__1
			{
				pushFollow(FOLLOW_3);
				rule__Model__Group__0__Impl();

				state._fsp--;

				pushFollow(FOLLOW_2);
				rule__Model__Group__1();

				state._fsp--;

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Model__Group__0"

	// $ANTLR start "rule__Model__Group__0__Impl"
	// InternalModelEditorParser.g:507:1: rule__Model__Group__0__Impl : ( (
	// rule__Model__ImportsAssignment_0 )* ) ;
	public final void rule__Model__Group__0__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:511:1: ( ( (
			// rule__Model__ImportsAssignment_0 )* ) )
			// InternalModelEditorParser.g:512:1: ( (
			// rule__Model__ImportsAssignment_0 )* )
			{
				// InternalModelEditorParser.g:512:1: ( (
				// rule__Model__ImportsAssignment_0 )* )
				// InternalModelEditorParser.g:513:2: (
				// rule__Model__ImportsAssignment_0 )*
				{
					before(grammarAccess.getModelAccess().getImportsAssignment_0());
					// InternalModelEditorParser.g:514:2: (
					// rule__Model__ImportsAssignment_0 )*
					loop7: do {
						int alt7 = 2;
						int LA7_0 = input.LA(1);

						if ((LA7_0 == Import)) {
							alt7 = 1;
						}

						switch (alt7) {
						case 1:
						// InternalModelEditorParser.g:514:3:
						// rule__Model__ImportsAssignment_0
						{
							pushFollow(FOLLOW_4);
							rule__Model__ImportsAssignment_0();

							state._fsp--;

						}
							break;

						default:
							break loop7;
						}
					} while (true);

					after(grammarAccess.getModelAccess().getImportsAssignment_0());

				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Model__Group__0__Impl"

	// $ANTLR start "rule__Model__Group__1"
	// InternalModelEditorParser.g:522:1: rule__Model__Group__1 :
	// rule__Model__Group__1__Impl ;
	public final void rule__Model__Group__1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:526:1: ( rule__Model__Group__1__Impl
			// )
			// InternalModelEditorParser.g:527:2: rule__Model__Group__1__Impl
			{
				pushFollow(FOLLOW_2);
				rule__Model__Group__1__Impl();

				state._fsp--;

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Model__Group__1"

	// $ANTLR start "rule__Model__Group__1__Impl"
	// InternalModelEditorParser.g:533:1: rule__Model__Group__1__Impl : ( (
	// rule__Model__ClassesAssignment_1 )* ) ;
	public final void rule__Model__Group__1__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:537:1: ( ( (
			// rule__Model__ClassesAssignment_1 )* ) )
			// InternalModelEditorParser.g:538:1: ( (
			// rule__Model__ClassesAssignment_1 )* )
			{
				// InternalModelEditorParser.g:538:1: ( (
				// rule__Model__ClassesAssignment_1 )* )
				// InternalModelEditorParser.g:539:2: (
				// rule__Model__ClassesAssignment_1 )*
				{
					before(grammarAccess.getModelAccess().getClassesAssignment_1());
					// InternalModelEditorParser.g:540:2: (
					// rule__Model__ClassesAssignment_1 )*
					loop8: do {
						int alt8 = 2;
						int LA8_0 = input.LA(1);

						if ((LA8_0 == Constant || LA8_0 == Private || LA8_0 == Public || LA8_0 == Class)) {
							alt8 = 1;
						}

						switch (alt8) {
						case 1:
						// InternalModelEditorParser.g:540:3:
						// rule__Model__ClassesAssignment_1
						{
							pushFollow(FOLLOW_5);
							rule__Model__ClassesAssignment_1();

							state._fsp--;

						}
							break;

						default:
							break loop8;
						}
					} while (true);

					after(grammarAccess.getModelAccess().getClassesAssignment_1());

				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Model__Group__1__Impl"

	// $ANTLR start "rule__Import__Group__0"
	// InternalModelEditorParser.g:549:1: rule__Import__Group__0 :
	// rule__Import__Group__0__Impl rule__Import__Group__1 ;
	public final void rule__Import__Group__0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:553:1: ( rule__Import__Group__0__Impl
			// rule__Import__Group__1 )
			// InternalModelEditorParser.g:554:2: rule__Import__Group__0__Impl
			// rule__Import__Group__1
			{
				pushFollow(FOLLOW_6);
				rule__Import__Group__0__Impl();

				state._fsp--;

				pushFollow(FOLLOW_2);
				rule__Import__Group__1();

				state._fsp--;

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Import__Group__0"

	// $ANTLR start "rule__Import__Group__0__Impl"
	// InternalModelEditorParser.g:561:1: rule__Import__Group__0__Impl : (
	// Import ) ;
	public final void rule__Import__Group__0__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:565:1: ( ( Import ) )
			// InternalModelEditorParser.g:566:1: ( Import )
			{
				// InternalModelEditorParser.g:566:1: ( Import )
				// InternalModelEditorParser.g:567:2: Import
				{
					before(grammarAccess.getImportAccess().getImportKeyword_0());
					match(input, Import, FOLLOW_2);
					after(grammarAccess.getImportAccess().getImportKeyword_0());

				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Import__Group__0__Impl"

	// $ANTLR start "rule__Import__Group__1"
	// InternalModelEditorParser.g:576:1: rule__Import__Group__1 :
	// rule__Import__Group__1__Impl ;
	public final void rule__Import__Group__1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:580:1: ( rule__Import__Group__1__Impl
			// )
			// InternalModelEditorParser.g:581:2: rule__Import__Group__1__Impl
			{
				pushFollow(FOLLOW_2);
				rule__Import__Group__1__Impl();

				state._fsp--;

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Import__Group__1"

	// $ANTLR start "rule__Import__Group__1__Impl"
	// InternalModelEditorParser.g:587:1: rule__Import__Group__1__Impl : ( (
	// rule__Import__ImportedNamespaceAssignment_1 ) ) ;
	public final void rule__Import__Group__1__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:591:1: ( ( (
			// rule__Import__ImportedNamespaceAssignment_1 ) ) )
			// InternalModelEditorParser.g:592:1: ( (
			// rule__Import__ImportedNamespaceAssignment_1 ) )
			{
				// InternalModelEditorParser.g:592:1: ( (
				// rule__Import__ImportedNamespaceAssignment_1 ) )
				// InternalModelEditorParser.g:593:2: (
				// rule__Import__ImportedNamespaceAssignment_1 )
				{
					before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1());
					// InternalModelEditorParser.g:594:2: (
					// rule__Import__ImportedNamespaceAssignment_1 )
					// InternalModelEditorParser.g:594:3:
					// rule__Import__ImportedNamespaceAssignment_1
					{
						pushFollow(FOLLOW_2);
						rule__Import__ImportedNamespaceAssignment_1();

						state._fsp--;

					}

					after(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1());

				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Import__Group__1__Impl"

	// $ANTLR start "rule__QualifiedNameWithWildcard__Group__0"
	// InternalModelEditorParser.g:603:1:
	// rule__QualifiedNameWithWildcard__Group__0 :
	// rule__QualifiedNameWithWildcard__Group__0__Impl
	// rule__QualifiedNameWithWildcard__Group__1 ;
	public final void rule__QualifiedNameWithWildcard__Group__0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:607:1: (
			// rule__QualifiedNameWithWildcard__Group__0__Impl
			// rule__QualifiedNameWithWildcard__Group__1 )
			// InternalModelEditorParser.g:608:2:
			// rule__QualifiedNameWithWildcard__Group__0__Impl
			// rule__QualifiedNameWithWildcard__Group__1
			{
				pushFollow(FOLLOW_7);
				rule__QualifiedNameWithWildcard__Group__0__Impl();

				state._fsp--;

				pushFollow(FOLLOW_2);
				rule__QualifiedNameWithWildcard__Group__1();

				state._fsp--;

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__QualifiedNameWithWildcard__Group__0"

	// $ANTLR start "rule__QualifiedNameWithWildcard__Group__0__Impl"
	// InternalModelEditorParser.g:615:1:
	// rule__QualifiedNameWithWildcard__Group__0__Impl : ( ruleQualifiedName ) ;
	public final void rule__QualifiedNameWithWildcard__Group__0__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:619:1: ( ( ruleQualifiedName ) )
			// InternalModelEditorParser.g:620:1: ( ruleQualifiedName )
			{
				// InternalModelEditorParser.g:620:1: ( ruleQualifiedName )
				// InternalModelEditorParser.g:621:2: ruleQualifiedName
				{
					before(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0());
					pushFollow(FOLLOW_2);
					ruleQualifiedName();

					state._fsp--;

					after(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0());

				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__QualifiedNameWithWildcard__Group__0__Impl"

	// $ANTLR start "rule__QualifiedNameWithWildcard__Group__1"
	// InternalModelEditorParser.g:630:1:
	// rule__QualifiedNameWithWildcard__Group__1 :
	// rule__QualifiedNameWithWildcard__Group__1__Impl ;
	public final void rule__QualifiedNameWithWildcard__Group__1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:634:1: (
			// rule__QualifiedNameWithWildcard__Group__1__Impl )
			// InternalModelEditorParser.g:635:2:
			// rule__QualifiedNameWithWildcard__Group__1__Impl
			{
				pushFollow(FOLLOW_2);
				rule__QualifiedNameWithWildcard__Group__1__Impl();

				state._fsp--;

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__QualifiedNameWithWildcard__Group__1"

	// $ANTLR start "rule__QualifiedNameWithWildcard__Group__1__Impl"
	// InternalModelEditorParser.g:641:1:
	// rule__QualifiedNameWithWildcard__Group__1__Impl : ( ( FullStopAsterisk )?
	// ) ;
	public final void rule__QualifiedNameWithWildcard__Group__1__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:645:1: ( ( ( FullStopAsterisk )? ) )
			// InternalModelEditorParser.g:646:1: ( ( FullStopAsterisk )? )
			{
				// InternalModelEditorParser.g:646:1: ( ( FullStopAsterisk )? )
				// InternalModelEditorParser.g:647:2: ( FullStopAsterisk )?
				{
					before(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1());
					// InternalModelEditorParser.g:648:2: ( FullStopAsterisk )?
					int alt9 = 2;
					int LA9_0 = input.LA(1);

					if ((LA9_0 == FullStopAsterisk)) {
						alt9 = 1;
					}
					switch (alt9) {
					case 1:
					// InternalModelEditorParser.g:648:3: FullStopAsterisk
					{
						match(input, FullStopAsterisk, FOLLOW_2);

					}
						break;

					}

					after(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1());

				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__QualifiedNameWithWildcard__Group__1__Impl"

	// $ANTLR start "rule__QualifiedName__Group__0"
	// InternalModelEditorParser.g:657:1: rule__QualifiedName__Group__0 :
	// rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
	public final void rule__QualifiedName__Group__0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:661:1: (
			// rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
			// )
			// InternalModelEditorParser.g:662:2:
			// rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
			{
				pushFollow(FOLLOW_8);
				rule__QualifiedName__Group__0__Impl();

				state._fsp--;

				pushFollow(FOLLOW_2);
				rule__QualifiedName__Group__1();

				state._fsp--;

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__QualifiedName__Group__0"

	// $ANTLR start "rule__QualifiedName__Group__0__Impl"
	// InternalModelEditorParser.g:669:1: rule__QualifiedName__Group__0__Impl :
	// ( ( rule__QualifiedName__Alternatives_0 ) ) ;
	public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:673:1: ( ( (
			// rule__QualifiedName__Alternatives_0 ) ) )
			// InternalModelEditorParser.g:674:1: ( (
			// rule__QualifiedName__Alternatives_0 ) )
			{
				// InternalModelEditorParser.g:674:1: ( (
				// rule__QualifiedName__Alternatives_0 ) )
				// InternalModelEditorParser.g:675:2: (
				// rule__QualifiedName__Alternatives_0 )
				{
					before(grammarAccess.getQualifiedNameAccess().getAlternatives_0());
					// InternalModelEditorParser.g:676:2: (
					// rule__QualifiedName__Alternatives_0 )
					// InternalModelEditorParser.g:676:3:
					// rule__QualifiedName__Alternatives_0
					{
						pushFollow(FOLLOW_2);
						rule__QualifiedName__Alternatives_0();

						state._fsp--;

					}

					after(grammarAccess.getQualifiedNameAccess().getAlternatives_0());

				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__QualifiedName__Group__0__Impl"

	// $ANTLR start "rule__QualifiedName__Group__1"
	// InternalModelEditorParser.g:684:1: rule__QualifiedName__Group__1 :
	// rule__QualifiedName__Group__1__Impl ;
	public final void rule__QualifiedName__Group__1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:688:1: (
			// rule__QualifiedName__Group__1__Impl )
			// InternalModelEditorParser.g:689:2:
			// rule__QualifiedName__Group__1__Impl
			{
				pushFollow(FOLLOW_2);
				rule__QualifiedName__Group__1__Impl();

				state._fsp--;

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__QualifiedName__Group__1"

	// $ANTLR start "rule__QualifiedName__Group__1__Impl"
	// InternalModelEditorParser.g:695:1: rule__QualifiedName__Group__1__Impl :
	// ( ( rule__QualifiedName__Alternatives_1 )* ) ;
	public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:699:1: ( ( (
			// rule__QualifiedName__Alternatives_1 )* ) )
			// InternalModelEditorParser.g:700:1: ( (
			// rule__QualifiedName__Alternatives_1 )* )
			{
				// InternalModelEditorParser.g:700:1: ( (
				// rule__QualifiedName__Alternatives_1 )* )
				// InternalModelEditorParser.g:701:2: (
				// rule__QualifiedName__Alternatives_1 )*
				{
					before(grammarAccess.getQualifiedNameAccess().getAlternatives_1());
					// InternalModelEditorParser.g:702:2: (
					// rule__QualifiedName__Alternatives_1 )*
					loop10: do {
						int alt10 = 2;
						int LA10_0 = input.LA(1);

						if ((LA10_0 == FullStop || LA10_0 == RULE_STRING)) {
							alt10 = 1;
						}

						switch (alt10) {
						case 1:
						// InternalModelEditorParser.g:702:3:
						// rule__QualifiedName__Alternatives_1
						{
							pushFollow(FOLLOW_9);
							rule__QualifiedName__Alternatives_1();

							state._fsp--;

						}
							break;

						default:
							break loop10;
						}
					} while (true);

					after(grammarAccess.getQualifiedNameAccess().getAlternatives_1());

				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__QualifiedName__Group__1__Impl"

	// $ANTLR start "rule__QualifiedName__Group_1_0__0"
	// InternalModelEditorParser.g:711:1: rule__QualifiedName__Group_1_0__0 :
	// rule__QualifiedName__Group_1_0__0__Impl rule__QualifiedName__Group_1_0__1
	// ;
	public final void rule__QualifiedName__Group_1_0__0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:715:1: (
			// rule__QualifiedName__Group_1_0__0__Impl
			// rule__QualifiedName__Group_1_0__1 )
			// InternalModelEditorParser.g:716:2:
			// rule__QualifiedName__Group_1_0__0__Impl
			// rule__QualifiedName__Group_1_0__1
			{
				pushFollow(FOLLOW_10);
				rule__QualifiedName__Group_1_0__0__Impl();

				state._fsp--;

				pushFollow(FOLLOW_2);
				rule__QualifiedName__Group_1_0__1();

				state._fsp--;

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__QualifiedName__Group_1_0__0"

	// $ANTLR start "rule__QualifiedName__Group_1_0__0__Impl"
	// InternalModelEditorParser.g:723:1:
	// rule__QualifiedName__Group_1_0__0__Impl : ( FullStop ) ;
	public final void rule__QualifiedName__Group_1_0__0__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:727:1: ( ( FullStop ) )
			// InternalModelEditorParser.g:728:1: ( FullStop )
			{
				// InternalModelEditorParser.g:728:1: ( FullStop )
				// InternalModelEditorParser.g:729:2: FullStop
				{
					before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0_0());
					match(input, FullStop, FOLLOW_2);
					after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0_0());

				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__QualifiedName__Group_1_0__0__Impl"

	// $ANTLR start "rule__QualifiedName__Group_1_0__1"
	// InternalModelEditorParser.g:738:1: rule__QualifiedName__Group_1_0__1 :
	// rule__QualifiedName__Group_1_0__1__Impl ;
	public final void rule__QualifiedName__Group_1_0__1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:742:1: (
			// rule__QualifiedName__Group_1_0__1__Impl )
			// InternalModelEditorParser.g:743:2:
			// rule__QualifiedName__Group_1_0__1__Impl
			{
				pushFollow(FOLLOW_2);
				rule__QualifiedName__Group_1_0__1__Impl();

				state._fsp--;

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__QualifiedName__Group_1_0__1"

	// $ANTLR start "rule__QualifiedName__Group_1_0__1__Impl"
	// InternalModelEditorParser.g:749:1:
	// rule__QualifiedName__Group_1_0__1__Impl : ( RULE_ID ) ;
	public final void rule__QualifiedName__Group_1_0__1__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:753:1: ( ( RULE_ID ) )
			// InternalModelEditorParser.g:754:1: ( RULE_ID )
			{
				// InternalModelEditorParser.g:754:1: ( RULE_ID )
				// InternalModelEditorParser.g:755:2: RULE_ID
				{
					before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_0_1());
					match(input, RULE_ID, FOLLOW_2);
					after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_0_1());

				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__QualifiedName__Group_1_0__1__Impl"

	// $ANTLR start "rule__Class__Group__0"
	// InternalModelEditorParser.g:765:1: rule__Class__Group__0 :
	// rule__Class__Group__0__Impl rule__Class__Group__1 ;
	public final void rule__Class__Group__0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:769:1: ( rule__Class__Group__0__Impl
			// rule__Class__Group__1 )
			// InternalModelEditorParser.g:770:2: rule__Class__Group__0__Impl
			// rule__Class__Group__1
			{
				pushFollow(FOLLOW_3);
				rule__Class__Group__0__Impl();

				state._fsp--;

				pushFollow(FOLLOW_2);
				rule__Class__Group__1();

				state._fsp--;

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Class__Group__0"

	// $ANTLR start "rule__Class__Group__0__Impl"
	// InternalModelEditorParser.g:777:1: rule__Class__Group__0__Impl : ( (
	// rule__Class__ModifierAssignment_0 )? ) ;
	public final void rule__Class__Group__0__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:781:1: ( ( (
			// rule__Class__ModifierAssignment_0 )? ) )
			// InternalModelEditorParser.g:782:1: ( (
			// rule__Class__ModifierAssignment_0 )? )
			{
				// InternalModelEditorParser.g:782:1: ( (
				// rule__Class__ModifierAssignment_0 )? )
				// InternalModelEditorParser.g:783:2: (
				// rule__Class__ModifierAssignment_0 )?
				{
					before(grammarAccess.getClassAccess().getModifierAssignment_0());
					// InternalModelEditorParser.g:784:2: (
					// rule__Class__ModifierAssignment_0 )?
					int alt11 = 2;
					int LA11_0 = input.LA(1);

					if ((LA11_0 == Constant || LA11_0 == Private || LA11_0 == Public)) {
						alt11 = 1;
					}
					switch (alt11) {
					case 1:
					// InternalModelEditorParser.g:784:3:
					// rule__Class__ModifierAssignment_0
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

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Class__Group__0__Impl"

	// $ANTLR start "rule__Class__Group__1"
	// InternalModelEditorParser.g:792:1: rule__Class__Group__1 :
	// rule__Class__Group__1__Impl rule__Class__Group__2 ;
	public final void rule__Class__Group__1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:796:1: ( rule__Class__Group__1__Impl
			// rule__Class__Group__2 )
			// InternalModelEditorParser.g:797:2: rule__Class__Group__1__Impl
			// rule__Class__Group__2
			{
				pushFollow(FOLLOW_10);
				rule__Class__Group__1__Impl();

				state._fsp--;

				pushFollow(FOLLOW_2);
				rule__Class__Group__2();

				state._fsp--;

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Class__Group__1"

	// $ANTLR start "rule__Class__Group__1__Impl"
	// InternalModelEditorParser.g:804:1: rule__Class__Group__1__Impl : ( Class
	// ) ;
	public final void rule__Class__Group__1__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:808:1: ( ( Class ) )
			// InternalModelEditorParser.g:809:1: ( Class )
			{
				// InternalModelEditorParser.g:809:1: ( Class )
				// InternalModelEditorParser.g:810:2: Class
				{
					before(grammarAccess.getClassAccess().getClassKeyword_1());
					match(input, Class, FOLLOW_2);
					after(grammarAccess.getClassAccess().getClassKeyword_1());

				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Class__Group__1__Impl"

	// $ANTLR start "rule__Class__Group__2"
	// InternalModelEditorParser.g:819:1: rule__Class__Group__2 :
	// rule__Class__Group__2__Impl rule__Class__Group__3 ;
	public final void rule__Class__Group__2() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:823:1: ( rule__Class__Group__2__Impl
			// rule__Class__Group__3 )
			// InternalModelEditorParser.g:824:2: rule__Class__Group__2__Impl
			// rule__Class__Group__3
			{
				pushFollow(FOLLOW_11);
				rule__Class__Group__2__Impl();

				state._fsp--;

				pushFollow(FOLLOW_2);
				rule__Class__Group__3();

				state._fsp--;

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Class__Group__2"

	// $ANTLR start "rule__Class__Group__2__Impl"
	// InternalModelEditorParser.g:831:1: rule__Class__Group__2__Impl : ( (
	// rule__Class__NameAssignment_2 ) ) ;
	public final void rule__Class__Group__2__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:835:1: ( ( (
			// rule__Class__NameAssignment_2 ) ) )
			// InternalModelEditorParser.g:836:1: ( (
			// rule__Class__NameAssignment_2 ) )
			{
				// InternalModelEditorParser.g:836:1: ( (
				// rule__Class__NameAssignment_2 ) )
				// InternalModelEditorParser.g:837:2: (
				// rule__Class__NameAssignment_2 )
				{
					before(grammarAccess.getClassAccess().getNameAssignment_2());
					// InternalModelEditorParser.g:838:2: (
					// rule__Class__NameAssignment_2 )
					// InternalModelEditorParser.g:838:3:
					// rule__Class__NameAssignment_2
					{
						pushFollow(FOLLOW_2);
						rule__Class__NameAssignment_2();

						state._fsp--;

					}

					after(grammarAccess.getClassAccess().getNameAssignment_2());

				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Class__Group__2__Impl"

	// $ANTLR start "rule__Class__Group__3"
	// InternalModelEditorParser.g:846:1: rule__Class__Group__3 :
	// rule__Class__Group__3__Impl rule__Class__Group__4 ;
	public final void rule__Class__Group__3() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:850:1: ( rule__Class__Group__3__Impl
			// rule__Class__Group__4 )
			// InternalModelEditorParser.g:851:2: rule__Class__Group__3__Impl
			// rule__Class__Group__4
			{
				pushFollow(FOLLOW_11);
				rule__Class__Group__3__Impl();

				state._fsp--;

				pushFollow(FOLLOW_2);
				rule__Class__Group__4();

				state._fsp--;

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Class__Group__3"

	// $ANTLR start "rule__Class__Group__3__Impl"
	// InternalModelEditorParser.g:858:1: rule__Class__Group__3__Impl : ( (
	// rule__Class__Group_3__0 )? ) ;
	public final void rule__Class__Group__3__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:862:1: ( ( ( rule__Class__Group_3__0
			// )? ) )
			// InternalModelEditorParser.g:863:1: ( ( rule__Class__Group_3__0 )?
			// )
			{
				// InternalModelEditorParser.g:863:1: ( (
				// rule__Class__Group_3__0 )? )
				// InternalModelEditorParser.g:864:2: ( rule__Class__Group_3__0
				// )?
				{
					before(grammarAccess.getClassAccess().getGroup_3());
					// InternalModelEditorParser.g:865:2: (
					// rule__Class__Group_3__0 )?
					int alt12 = 2;
					int LA12_0 = input.LA(1);

					if ((LA12_0 == Extends)) {
						alt12 = 1;
					}
					switch (alt12) {
					case 1:
					// InternalModelEditorParser.g:865:3:
					// rule__Class__Group_3__0
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

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Class__Group__3__Impl"

	// $ANTLR start "rule__Class__Group__4"
	// InternalModelEditorParser.g:873:1: rule__Class__Group__4 :
	// rule__Class__Group__4__Impl ;
	public final void rule__Class__Group__4() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:877:1: ( rule__Class__Group__4__Impl
			// )
			// InternalModelEditorParser.g:878:2: rule__Class__Group__4__Impl
			{
				pushFollow(FOLLOW_2);
				rule__Class__Group__4__Impl();

				state._fsp--;

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Class__Group__4"

	// $ANTLR start "rule__Class__Group__4__Impl"
	// InternalModelEditorParser.g:884:1: rule__Class__Group__4__Impl : ( (
	// rule__Class__Group_4__0 )? ) ;
	public final void rule__Class__Group__4__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:888:1: ( ( ( rule__Class__Group_4__0
			// )? ) )
			// InternalModelEditorParser.g:889:1: ( ( rule__Class__Group_4__0 )?
			// )
			{
				// InternalModelEditorParser.g:889:1: ( (
				// rule__Class__Group_4__0 )? )
				// InternalModelEditorParser.g:890:2: ( rule__Class__Group_4__0
				// )?
				{
					before(grammarAccess.getClassAccess().getGroup_4());
					// InternalModelEditorParser.g:891:2: (
					// rule__Class__Group_4__0 )?
					int alt13 = 2;
					int LA13_0 = input.LA(1);

					if ((LA13_0 == RULE_BEGIN)) {
						alt13 = 1;
					}
					switch (alt13) {
					case 1:
					// InternalModelEditorParser.g:891:3:
					// rule__Class__Group_4__0
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

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Class__Group__4__Impl"

	// $ANTLR start "rule__Class__Group_3__0"
	// InternalModelEditorParser.g:900:1: rule__Class__Group_3__0 :
	// rule__Class__Group_3__0__Impl rule__Class__Group_3__1 ;
	public final void rule__Class__Group_3__0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:904:1: (
			// rule__Class__Group_3__0__Impl rule__Class__Group_3__1 )
			// InternalModelEditorParser.g:905:2: rule__Class__Group_3__0__Impl
			// rule__Class__Group_3__1
			{
				pushFollow(FOLLOW_6);
				rule__Class__Group_3__0__Impl();

				state._fsp--;

				pushFollow(FOLLOW_2);
				rule__Class__Group_3__1();

				state._fsp--;

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Class__Group_3__0"

	// $ANTLR start "rule__Class__Group_3__0__Impl"
	// InternalModelEditorParser.g:912:1: rule__Class__Group_3__0__Impl : (
	// Extends ) ;
	public final void rule__Class__Group_3__0__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:916:1: ( ( Extends ) )
			// InternalModelEditorParser.g:917:1: ( Extends )
			{
				// InternalModelEditorParser.g:917:1: ( Extends )
				// InternalModelEditorParser.g:918:2: Extends
				{
					before(grammarAccess.getClassAccess().getExtendsKeyword_3_0());
					match(input, Extends, FOLLOW_2);
					after(grammarAccess.getClassAccess().getExtendsKeyword_3_0());

				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Class__Group_3__0__Impl"

	// $ANTLR start "rule__Class__Group_3__1"
	// InternalModelEditorParser.g:927:1: rule__Class__Group_3__1 :
	// rule__Class__Group_3__1__Impl ;
	public final void rule__Class__Group_3__1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:931:1: (
			// rule__Class__Group_3__1__Impl )
			// InternalModelEditorParser.g:932:2: rule__Class__Group_3__1__Impl
			{
				pushFollow(FOLLOW_2);
				rule__Class__Group_3__1__Impl();

				state._fsp--;

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Class__Group_3__1"

	// $ANTLR start "rule__Class__Group_3__1__Impl"
	// InternalModelEditorParser.g:938:1: rule__Class__Group_3__1__Impl : ( (
	// rule__Class__SuperTypeAssignment_3_1 ) ) ;
	public final void rule__Class__Group_3__1__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:942:1: ( ( (
			// rule__Class__SuperTypeAssignment_3_1 ) ) )
			// InternalModelEditorParser.g:943:1: ( (
			// rule__Class__SuperTypeAssignment_3_1 ) )
			{
				// InternalModelEditorParser.g:943:1: ( (
				// rule__Class__SuperTypeAssignment_3_1 ) )
				// InternalModelEditorParser.g:944:2: (
				// rule__Class__SuperTypeAssignment_3_1 )
				{
					before(grammarAccess.getClassAccess().getSuperTypeAssignment_3_1());
					// InternalModelEditorParser.g:945:2: (
					// rule__Class__SuperTypeAssignment_3_1 )
					// InternalModelEditorParser.g:945:3:
					// rule__Class__SuperTypeAssignment_3_1
					{
						pushFollow(FOLLOW_2);
						rule__Class__SuperTypeAssignment_3_1();

						state._fsp--;

					}

					after(grammarAccess.getClassAccess().getSuperTypeAssignment_3_1());

				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Class__Group_3__1__Impl"

	// $ANTLR start "rule__Class__Group_4__0"
	// InternalModelEditorParser.g:954:1: rule__Class__Group_4__0 :
	// rule__Class__Group_4__0__Impl rule__Class__Group_4__1 ;
	public final void rule__Class__Group_4__0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:958:1: (
			// rule__Class__Group_4__0__Impl rule__Class__Group_4__1 )
			// InternalModelEditorParser.g:959:2: rule__Class__Group_4__0__Impl
			// rule__Class__Group_4__1
			{
				pushFollow(FOLLOW_12);
				rule__Class__Group_4__0__Impl();

				state._fsp--;

				pushFollow(FOLLOW_2);
				rule__Class__Group_4__1();

				state._fsp--;

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Class__Group_4__0"

	// $ANTLR start "rule__Class__Group_4__0__Impl"
	// InternalModelEditorParser.g:966:1: rule__Class__Group_4__0__Impl : (
	// RULE_BEGIN ) ;
	public final void rule__Class__Group_4__0__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:970:1: ( ( RULE_BEGIN ) )
			// InternalModelEditorParser.g:971:1: ( RULE_BEGIN )
			{
				// InternalModelEditorParser.g:971:1: ( RULE_BEGIN )
				// InternalModelEditorParser.g:972:2: RULE_BEGIN
				{
					before(grammarAccess.getClassAccess().getBEGINTerminalRuleCall_4_0());
					match(input, RULE_BEGIN, FOLLOW_2);
					after(grammarAccess.getClassAccess().getBEGINTerminalRuleCall_4_0());

				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Class__Group_4__0__Impl"

	// $ANTLR start "rule__Class__Group_4__1"
	// InternalModelEditorParser.g:981:1: rule__Class__Group_4__1 :
	// rule__Class__Group_4__1__Impl rule__Class__Group_4__2 ;
	public final void rule__Class__Group_4__1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:985:1: (
			// rule__Class__Group_4__1__Impl rule__Class__Group_4__2 )
			// InternalModelEditorParser.g:986:2: rule__Class__Group_4__1__Impl
			// rule__Class__Group_4__2
			{
				pushFollow(FOLLOW_12);
				rule__Class__Group_4__1__Impl();

				state._fsp--;

				pushFollow(FOLLOW_2);
				rule__Class__Group_4__2();

				state._fsp--;

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Class__Group_4__1"

	// $ANTLR start "rule__Class__Group_4__1__Impl"
	// InternalModelEditorParser.g:993:1: rule__Class__Group_4__1__Impl : ( (
	// rule__Class__FieldsAssignment_4_1 )* ) ;
	public final void rule__Class__Group_4__1__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:997:1: ( ( (
			// rule__Class__FieldsAssignment_4_1 )* ) )
			// InternalModelEditorParser.g:998:1: ( (
			// rule__Class__FieldsAssignment_4_1 )* )
			{
				// InternalModelEditorParser.g:998:1: ( (
				// rule__Class__FieldsAssignment_4_1 )* )
				// InternalModelEditorParser.g:999:2: (
				// rule__Class__FieldsAssignment_4_1 )*
				{
					before(grammarAccess.getClassAccess().getFieldsAssignment_4_1());
					// InternalModelEditorParser.g:1000:2: (
					// rule__Class__FieldsAssignment_4_1 )*
					loop14: do {
						int alt14 = 2;
						switch (input.LA(1)) {
						case Public: {
							int LA14_1 = input.LA(2);

							if ((LA14_1 == RULE_ID)) {
								int LA14_5 = input.LA(3);

								if ((LA14_5 == Protected || LA14_5 == Constant || LA14_5 == Private || LA14_5 == Public
										|| LA14_5 == Colon || (LA14_5 >= RULE_END && LA14_5 <= RULE_ID))) {
									alt14 = 1;
								}

							}

						}
							break;
						case Private: {
							int LA14_2 = input.LA(2);

							if ((LA14_2 == RULE_ID)) {
								int LA14_5 = input.LA(3);

								if ((LA14_5 == Protected || LA14_5 == Constant || LA14_5 == Private || LA14_5 == Public
										|| LA14_5 == Colon || (LA14_5 >= RULE_END && LA14_5 <= RULE_ID))) {
									alt14 = 1;
								}

							}

						}
							break;
						case Protected: {
							int LA14_3 = input.LA(2);

							if ((LA14_3 == RULE_ID)) {
								int LA14_5 = input.LA(3);

								if ((LA14_5 == Protected || LA14_5 == Constant || LA14_5 == Private || LA14_5 == Public
										|| LA14_5 == Colon || (LA14_5 >= RULE_END && LA14_5 <= RULE_ID))) {
									alt14 = 1;
								}

							}

						}
							break;
						case Constant: {
							int LA14_4 = input.LA(2);

							if ((LA14_4 == RULE_ID)) {
								int LA14_5 = input.LA(3);

								if ((LA14_5 == Protected || LA14_5 == Constant || LA14_5 == Private || LA14_5 == Public
										|| LA14_5 == Colon || (LA14_5 >= RULE_END && LA14_5 <= RULE_ID))) {
									alt14 = 1;
								}

							}

						}
							break;
						case RULE_ID: {
							int LA14_5 = input.LA(2);

							if ((LA14_5 == Protected || LA14_5 == Constant || LA14_5 == Private || LA14_5 == Public
									|| LA14_5 == Colon || (LA14_5 >= RULE_END && LA14_5 <= RULE_ID))) {
								alt14 = 1;
							}

						}
							break;

						}

						switch (alt14) {
						case 1:
						// InternalModelEditorParser.g:1000:3:
						// rule__Class__FieldsAssignment_4_1
						{
							pushFollow(FOLLOW_13);
							rule__Class__FieldsAssignment_4_1();

							state._fsp--;

						}
							break;

						default:
							break loop14;
						}
					} while (true);

					after(grammarAccess.getClassAccess().getFieldsAssignment_4_1());

				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Class__Group_4__1__Impl"

	// $ANTLR start "rule__Class__Group_4__2"
	// InternalModelEditorParser.g:1008:1: rule__Class__Group_4__2 :
	// rule__Class__Group_4__2__Impl rule__Class__Group_4__3 ;
	public final void rule__Class__Group_4__2() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:1012:1: (
			// rule__Class__Group_4__2__Impl rule__Class__Group_4__3 )
			// InternalModelEditorParser.g:1013:2: rule__Class__Group_4__2__Impl
			// rule__Class__Group_4__3
			{
				pushFollow(FOLLOW_12);
				rule__Class__Group_4__2__Impl();

				state._fsp--;

				pushFollow(FOLLOW_2);
				rule__Class__Group_4__3();

				state._fsp--;

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Class__Group_4__2"

	// $ANTLR start "rule__Class__Group_4__2__Impl"
	// InternalModelEditorParser.g:1020:1: rule__Class__Group_4__2__Impl : ( (
	// rule__Class__MethodsAssignment_4_2 )* ) ;
	public final void rule__Class__Group_4__2__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:1024:1: ( ( (
			// rule__Class__MethodsAssignment_4_2 )* ) )
			// InternalModelEditorParser.g:1025:1: ( (
			// rule__Class__MethodsAssignment_4_2 )* )
			{
				// InternalModelEditorParser.g:1025:1: ( (
				// rule__Class__MethodsAssignment_4_2 )* )
				// InternalModelEditorParser.g:1026:2: (
				// rule__Class__MethodsAssignment_4_2 )*
				{
					before(grammarAccess.getClassAccess().getMethodsAssignment_4_2());
					// InternalModelEditorParser.g:1027:2: (
					// rule__Class__MethodsAssignment_4_2 )*
					loop15: do {
						int alt15 = 2;
						int LA15_0 = input.LA(1);

						if ((LA15_0 == Protected || LA15_0 == Constant || LA15_0 == Private || LA15_0 == Public
								|| LA15_0 == RULE_ID)) {
							alt15 = 1;
						}

						switch (alt15) {
						case 1:
						// InternalModelEditorParser.g:1027:3:
						// rule__Class__MethodsAssignment_4_2
						{
							pushFollow(FOLLOW_13);
							rule__Class__MethodsAssignment_4_2();

							state._fsp--;

						}
							break;

						default:
							break loop15;
						}
					} while (true);

					after(grammarAccess.getClassAccess().getMethodsAssignment_4_2());

				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Class__Group_4__2__Impl"

	// $ANTLR start "rule__Class__Group_4__3"
	// InternalModelEditorParser.g:1035:1: rule__Class__Group_4__3 :
	// rule__Class__Group_4__3__Impl ;
	public final void rule__Class__Group_4__3() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:1039:1: (
			// rule__Class__Group_4__3__Impl )
			// InternalModelEditorParser.g:1040:2: rule__Class__Group_4__3__Impl
			{
				pushFollow(FOLLOW_2);
				rule__Class__Group_4__3__Impl();

				state._fsp--;

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Class__Group_4__3"

	// $ANTLR start "rule__Class__Group_4__3__Impl"
	// InternalModelEditorParser.g:1046:1: rule__Class__Group_4__3__Impl : (
	// RULE_END ) ;
	public final void rule__Class__Group_4__3__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:1050:1: ( ( RULE_END ) )
			// InternalModelEditorParser.g:1051:1: ( RULE_END )
			{
				// InternalModelEditorParser.g:1051:1: ( RULE_END )
				// InternalModelEditorParser.g:1052:2: RULE_END
				{
					before(grammarAccess.getClassAccess().getENDTerminalRuleCall_4_3());
					match(input, RULE_END, FOLLOW_2);
					after(grammarAccess.getClassAccess().getENDTerminalRuleCall_4_3());

				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Class__Group_4__3__Impl"

	// $ANTLR start "rule__Field__Group__0"
	// InternalModelEditorParser.g:1062:1: rule__Field__Group__0 :
	// rule__Field__Group__0__Impl rule__Field__Group__1 ;
	public final void rule__Field__Group__0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:1066:1: ( rule__Field__Group__0__Impl
			// rule__Field__Group__1 )
			// InternalModelEditorParser.g:1067:2: rule__Field__Group__0__Impl
			// rule__Field__Group__1
			{
				pushFollow(FOLLOW_14);
				rule__Field__Group__0__Impl();

				state._fsp--;

				pushFollow(FOLLOW_2);
				rule__Field__Group__1();

				state._fsp--;

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Field__Group__0"

	// $ANTLR start "rule__Field__Group__0__Impl"
	// InternalModelEditorParser.g:1074:1: rule__Field__Group__0__Impl : ( (
	// rule__Field__ModifierAssignment_0 )? ) ;
	public final void rule__Field__Group__0__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:1078:1: ( ( (
			// rule__Field__ModifierAssignment_0 )? ) )
			// InternalModelEditorParser.g:1079:1: ( (
			// rule__Field__ModifierAssignment_0 )? )
			{
				// InternalModelEditorParser.g:1079:1: ( (
				// rule__Field__ModifierAssignment_0 )? )
				// InternalModelEditorParser.g:1080:2: (
				// rule__Field__ModifierAssignment_0 )?
				{
					before(grammarAccess.getFieldAccess().getModifierAssignment_0());
					// InternalModelEditorParser.g:1081:2: (
					// rule__Field__ModifierAssignment_0 )?
					int alt16 = 2;
					int LA16_0 = input.LA(1);

					if ((LA16_0 == Protected || LA16_0 == Constant || LA16_0 == Private || LA16_0 == Public)) {
						alt16 = 1;
					}
					switch (alt16) {
					case 1:
					// InternalModelEditorParser.g:1081:3:
					// rule__Field__ModifierAssignment_0
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

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Field__Group__0__Impl"

	// $ANTLR start "rule__Field__Group__1"
	// InternalModelEditorParser.g:1089:1: rule__Field__Group__1 :
	// rule__Field__Group__1__Impl rule__Field__Group__2 ;
	public final void rule__Field__Group__1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:1093:1: ( rule__Field__Group__1__Impl
			// rule__Field__Group__2 )
			// InternalModelEditorParser.g:1094:2: rule__Field__Group__1__Impl
			// rule__Field__Group__2
			{
				pushFollow(FOLLOW_15);
				rule__Field__Group__1__Impl();

				state._fsp--;

				pushFollow(FOLLOW_2);
				rule__Field__Group__2();

				state._fsp--;

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Field__Group__1"

	// $ANTLR start "rule__Field__Group__1__Impl"
	// InternalModelEditorParser.g:1101:1: rule__Field__Group__1__Impl : ( (
	// rule__Field__NameAssignment_1 ) ) ;
	public final void rule__Field__Group__1__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:1105:1: ( ( (
			// rule__Field__NameAssignment_1 ) ) )
			// InternalModelEditorParser.g:1106:1: ( (
			// rule__Field__NameAssignment_1 ) )
			{
				// InternalModelEditorParser.g:1106:1: ( (
				// rule__Field__NameAssignment_1 ) )
				// InternalModelEditorParser.g:1107:2: (
				// rule__Field__NameAssignment_1 )
				{
					before(grammarAccess.getFieldAccess().getNameAssignment_1());
					// InternalModelEditorParser.g:1108:2: (
					// rule__Field__NameAssignment_1 )
					// InternalModelEditorParser.g:1108:3:
					// rule__Field__NameAssignment_1
					{
						pushFollow(FOLLOW_2);
						rule__Field__NameAssignment_1();

						state._fsp--;

					}

					after(grammarAccess.getFieldAccess().getNameAssignment_1());

				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Field__Group__1__Impl"

	// $ANTLR start "rule__Field__Group__2"
	// InternalModelEditorParser.g:1116:1: rule__Field__Group__2 :
	// rule__Field__Group__2__Impl ;
	public final void rule__Field__Group__2() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:1120:1: ( rule__Field__Group__2__Impl
			// )
			// InternalModelEditorParser.g:1121:2: rule__Field__Group__2__Impl
			{
				pushFollow(FOLLOW_2);
				rule__Field__Group__2__Impl();

				state._fsp--;

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Field__Group__2"

	// $ANTLR start "rule__Field__Group__2__Impl"
	// InternalModelEditorParser.g:1127:1: rule__Field__Group__2__Impl : ( (
	// rule__Field__Group_2__0 )? ) ;
	public final void rule__Field__Group__2__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:1131:1: ( ( ( rule__Field__Group_2__0
			// )? ) )
			// InternalModelEditorParser.g:1132:1: ( ( rule__Field__Group_2__0
			// )? )
			{
				// InternalModelEditorParser.g:1132:1: ( (
				// rule__Field__Group_2__0 )? )
				// InternalModelEditorParser.g:1133:2: ( rule__Field__Group_2__0
				// )?
				{
					before(grammarAccess.getFieldAccess().getGroup_2());
					// InternalModelEditorParser.g:1134:2: (
					// rule__Field__Group_2__0 )?
					int alt17 = 2;
					int LA17_0 = input.LA(1);

					if ((LA17_0 == Colon)) {
						alt17 = 1;
					}
					switch (alt17) {
					case 1:
					// InternalModelEditorParser.g:1134:3:
					// rule__Field__Group_2__0
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

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Field__Group__2__Impl"

	// $ANTLR start "rule__Field__Group_2__0"
	// InternalModelEditorParser.g:1143:1: rule__Field__Group_2__0 :
	// rule__Field__Group_2__0__Impl rule__Field__Group_2__1 ;
	public final void rule__Field__Group_2__0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:1147:1: (
			// rule__Field__Group_2__0__Impl rule__Field__Group_2__1 )
			// InternalModelEditorParser.g:1148:2: rule__Field__Group_2__0__Impl
			// rule__Field__Group_2__1
			{
				pushFollow(FOLLOW_6);
				rule__Field__Group_2__0__Impl();

				state._fsp--;

				pushFollow(FOLLOW_2);
				rule__Field__Group_2__1();

				state._fsp--;

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Field__Group_2__0"

	// $ANTLR start "rule__Field__Group_2__0__Impl"
	// InternalModelEditorParser.g:1155:1: rule__Field__Group_2__0__Impl : (
	// Colon ) ;
	public final void rule__Field__Group_2__0__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:1159:1: ( ( Colon ) )
			// InternalModelEditorParser.g:1160:1: ( Colon )
			{
				// InternalModelEditorParser.g:1160:1: ( Colon )
				// InternalModelEditorParser.g:1161:2: Colon
				{
					before(grammarAccess.getFieldAccess().getColonKeyword_2_0());
					match(input, Colon, FOLLOW_2);
					after(grammarAccess.getFieldAccess().getColonKeyword_2_0());

				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Field__Group_2__0__Impl"

	// $ANTLR start "rule__Field__Group_2__1"
	// InternalModelEditorParser.g:1170:1: rule__Field__Group_2__1 :
	// rule__Field__Group_2__1__Impl ;
	public final void rule__Field__Group_2__1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:1174:1: (
			// rule__Field__Group_2__1__Impl )
			// InternalModelEditorParser.g:1175:2: rule__Field__Group_2__1__Impl
			{
				pushFollow(FOLLOW_2);
				rule__Field__Group_2__1__Impl();

				state._fsp--;

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Field__Group_2__1"

	// $ANTLR start "rule__Field__Group_2__1__Impl"
	// InternalModelEditorParser.g:1181:1: rule__Field__Group_2__1__Impl : ( (
	// rule__Field__TypeAssignment_2_1 ) ) ;
	public final void rule__Field__Group_2__1__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:1185:1: ( ( (
			// rule__Field__TypeAssignment_2_1 ) ) )
			// InternalModelEditorParser.g:1186:1: ( (
			// rule__Field__TypeAssignment_2_1 ) )
			{
				// InternalModelEditorParser.g:1186:1: ( (
				// rule__Field__TypeAssignment_2_1 ) )
				// InternalModelEditorParser.g:1187:2: (
				// rule__Field__TypeAssignment_2_1 )
				{
					before(grammarAccess.getFieldAccess().getTypeAssignment_2_1());
					// InternalModelEditorParser.g:1188:2: (
					// rule__Field__TypeAssignment_2_1 )
					// InternalModelEditorParser.g:1188:3:
					// rule__Field__TypeAssignment_2_1
					{
						pushFollow(FOLLOW_2);
						rule__Field__TypeAssignment_2_1();

						state._fsp--;

					}

					after(grammarAccess.getFieldAccess().getTypeAssignment_2_1());

				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Field__Group_2__1__Impl"

	// $ANTLR start "rule__Method__Group__0"
	// InternalModelEditorParser.g:1197:1: rule__Method__Group__0 :
	// rule__Method__Group__0__Impl rule__Method__Group__1 ;
	public final void rule__Method__Group__0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:1201:1: (
			// rule__Method__Group__0__Impl rule__Method__Group__1 )
			// InternalModelEditorParser.g:1202:2: rule__Method__Group__0__Impl
			// rule__Method__Group__1
			{
				pushFollow(FOLLOW_14);
				rule__Method__Group__0__Impl();

				state._fsp--;

				pushFollow(FOLLOW_2);
				rule__Method__Group__1();

				state._fsp--;

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Method__Group__0"

	// $ANTLR start "rule__Method__Group__0__Impl"
	// InternalModelEditorParser.g:1209:1: rule__Method__Group__0__Impl : ( (
	// rule__Method__ModifierAssignment_0 )? ) ;
	public final void rule__Method__Group__0__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:1213:1: ( ( (
			// rule__Method__ModifierAssignment_0 )? ) )
			// InternalModelEditorParser.g:1214:1: ( (
			// rule__Method__ModifierAssignment_0 )? )
			{
				// InternalModelEditorParser.g:1214:1: ( (
				// rule__Method__ModifierAssignment_0 )? )
				// InternalModelEditorParser.g:1215:2: (
				// rule__Method__ModifierAssignment_0 )?
				{
					before(grammarAccess.getMethodAccess().getModifierAssignment_0());
					// InternalModelEditorParser.g:1216:2: (
					// rule__Method__ModifierAssignment_0 )?
					int alt18 = 2;
					int LA18_0 = input.LA(1);

					if ((LA18_0 == Protected || LA18_0 == Constant || LA18_0 == Private || LA18_0 == Public)) {
						alt18 = 1;
					}
					switch (alt18) {
					case 1:
					// InternalModelEditorParser.g:1216:3:
					// rule__Method__ModifierAssignment_0
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

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Method__Group__0__Impl"

	// $ANTLR start "rule__Method__Group__1"
	// InternalModelEditorParser.g:1224:1: rule__Method__Group__1 :
	// rule__Method__Group__1__Impl rule__Method__Group__2 ;
	public final void rule__Method__Group__1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:1228:1: (
			// rule__Method__Group__1__Impl rule__Method__Group__2 )
			// InternalModelEditorParser.g:1229:2: rule__Method__Group__1__Impl
			// rule__Method__Group__2
			{
				pushFollow(FOLLOW_16);
				rule__Method__Group__1__Impl();

				state._fsp--;

				pushFollow(FOLLOW_2);
				rule__Method__Group__2();

				state._fsp--;

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Method__Group__1"

	// $ANTLR start "rule__Method__Group__1__Impl"
	// InternalModelEditorParser.g:1236:1: rule__Method__Group__1__Impl : ( (
	// rule__Method__NameAssignment_1 ) ) ;
	public final void rule__Method__Group__1__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:1240:1: ( ( (
			// rule__Method__NameAssignment_1 ) ) )
			// InternalModelEditorParser.g:1241:1: ( (
			// rule__Method__NameAssignment_1 ) )
			{
				// InternalModelEditorParser.g:1241:1: ( (
				// rule__Method__NameAssignment_1 ) )
				// InternalModelEditorParser.g:1242:2: (
				// rule__Method__NameAssignment_1 )
				{
					before(grammarAccess.getMethodAccess().getNameAssignment_1());
					// InternalModelEditorParser.g:1243:2: (
					// rule__Method__NameAssignment_1 )
					// InternalModelEditorParser.g:1243:3:
					// rule__Method__NameAssignment_1
					{
						pushFollow(FOLLOW_2);
						rule__Method__NameAssignment_1();

						state._fsp--;

					}

					after(grammarAccess.getMethodAccess().getNameAssignment_1());

				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Method__Group__1__Impl"

	// $ANTLR start "rule__Method__Group__2"
	// InternalModelEditorParser.g:1251:1: rule__Method__Group__2 :
	// rule__Method__Group__2__Impl rule__Method__Group__3 ;
	public final void rule__Method__Group__2() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:1255:1: (
			// rule__Method__Group__2__Impl rule__Method__Group__3 )
			// InternalModelEditorParser.g:1256:2: rule__Method__Group__2__Impl
			// rule__Method__Group__3
			{
				pushFollow(FOLLOW_17);
				rule__Method__Group__2__Impl();

				state._fsp--;

				pushFollow(FOLLOW_2);
				rule__Method__Group__3();

				state._fsp--;

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Method__Group__2"

	// $ANTLR start "rule__Method__Group__2__Impl"
	// InternalModelEditorParser.g:1263:1: rule__Method__Group__2__Impl : (
	// LeftParenthesis ) ;
	public final void rule__Method__Group__2__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:1267:1: ( ( LeftParenthesis ) )
			// InternalModelEditorParser.g:1268:1: ( LeftParenthesis )
			{
				// InternalModelEditorParser.g:1268:1: ( LeftParenthesis )
				// InternalModelEditorParser.g:1269:2: LeftParenthesis
				{
					before(grammarAccess.getMethodAccess().getLeftParenthesisKeyword_2());
					match(input, LeftParenthesis, FOLLOW_2);
					after(grammarAccess.getMethodAccess().getLeftParenthesisKeyword_2());

				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Method__Group__2__Impl"

	// $ANTLR start "rule__Method__Group__3"
	// InternalModelEditorParser.g:1278:1: rule__Method__Group__3 :
	// rule__Method__Group__3__Impl rule__Method__Group__4 ;
	public final void rule__Method__Group__3() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:1282:1: (
			// rule__Method__Group__3__Impl rule__Method__Group__4 )
			// InternalModelEditorParser.g:1283:2: rule__Method__Group__3__Impl
			// rule__Method__Group__4
			{
				pushFollow(FOLLOW_17);
				rule__Method__Group__3__Impl();

				state._fsp--;

				pushFollow(FOLLOW_2);
				rule__Method__Group__4();

				state._fsp--;

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Method__Group__3"

	// $ANTLR start "rule__Method__Group__3__Impl"
	// InternalModelEditorParser.g:1290:1: rule__Method__Group__3__Impl : ( (
	// rule__Method__Group_3__0 )? ) ;
	public final void rule__Method__Group__3__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:1294:1: ( ( (
			// rule__Method__Group_3__0 )? ) )
			// InternalModelEditorParser.g:1295:1: ( ( rule__Method__Group_3__0
			// )? )
			{
				// InternalModelEditorParser.g:1295:1: ( (
				// rule__Method__Group_3__0 )? )
				// InternalModelEditorParser.g:1296:2: (
				// rule__Method__Group_3__0 )?
				{
					before(grammarAccess.getMethodAccess().getGroup_3());
					// InternalModelEditorParser.g:1297:2: (
					// rule__Method__Group_3__0 )?
					int alt19 = 2;
					int LA19_0 = input.LA(1);

					if ((LA19_0 == RULE_ID || LA19_0 == RULE_STRING)) {
						alt19 = 1;
					}
					switch (alt19) {
					case 1:
					// InternalModelEditorParser.g:1297:3:
					// rule__Method__Group_3__0
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

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Method__Group__3__Impl"

	// $ANTLR start "rule__Method__Group__4"
	// InternalModelEditorParser.g:1305:1: rule__Method__Group__4 :
	// rule__Method__Group__4__Impl rule__Method__Group__5 ;
	public final void rule__Method__Group__4() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:1309:1: (
			// rule__Method__Group__4__Impl rule__Method__Group__5 )
			// InternalModelEditorParser.g:1310:2: rule__Method__Group__4__Impl
			// rule__Method__Group__5
			{
				pushFollow(FOLLOW_18);
				rule__Method__Group__4__Impl();

				state._fsp--;

				pushFollow(FOLLOW_2);
				rule__Method__Group__5();

				state._fsp--;

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Method__Group__4"

	// $ANTLR start "rule__Method__Group__4__Impl"
	// InternalModelEditorParser.g:1317:1: rule__Method__Group__4__Impl : (
	// RightParenthesis ) ;
	public final void rule__Method__Group__4__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:1321:1: ( ( RightParenthesis ) )
			// InternalModelEditorParser.g:1322:1: ( RightParenthesis )
			{
				// InternalModelEditorParser.g:1322:1: ( RightParenthesis )
				// InternalModelEditorParser.g:1323:2: RightParenthesis
				{
					before(grammarAccess.getMethodAccess().getRightParenthesisKeyword_4());
					match(input, RightParenthesis, FOLLOW_2);
					after(grammarAccess.getMethodAccess().getRightParenthesisKeyword_4());

				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Method__Group__4__Impl"

	// $ANTLR start "rule__Method__Group__5"
	// InternalModelEditorParser.g:1332:1: rule__Method__Group__5 :
	// rule__Method__Group__5__Impl rule__Method__Group__6 ;
	public final void rule__Method__Group__5() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:1336:1: (
			// rule__Method__Group__5__Impl rule__Method__Group__6 )
			// InternalModelEditorParser.g:1337:2: rule__Method__Group__5__Impl
			// rule__Method__Group__6
			{
				pushFollow(FOLLOW_18);
				rule__Method__Group__5__Impl();

				state._fsp--;

				pushFollow(FOLLOW_2);
				rule__Method__Group__6();

				state._fsp--;

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Method__Group__5"

	// $ANTLR start "rule__Method__Group__5__Impl"
	// InternalModelEditorParser.g:1344:1: rule__Method__Group__5__Impl : ( (
	// rule__Method__Group_5__0 )? ) ;
	public final void rule__Method__Group__5__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:1348:1: ( ( (
			// rule__Method__Group_5__0 )? ) )
			// InternalModelEditorParser.g:1349:1: ( ( rule__Method__Group_5__0
			// )? )
			{
				// InternalModelEditorParser.g:1349:1: ( (
				// rule__Method__Group_5__0 )? )
				// InternalModelEditorParser.g:1350:2: (
				// rule__Method__Group_5__0 )?
				{
					before(grammarAccess.getMethodAccess().getGroup_5());
					// InternalModelEditorParser.g:1351:2: (
					// rule__Method__Group_5__0 )?
					int alt20 = 2;
					int LA20_0 = input.LA(1);

					if ((LA20_0 == Colon)) {
						alt20 = 1;
					}
					switch (alt20) {
					case 1:
					// InternalModelEditorParser.g:1351:3:
					// rule__Method__Group_5__0
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

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Method__Group__5__Impl"

	// $ANTLR start "rule__Method__Group__6"
	// InternalModelEditorParser.g:1359:1: rule__Method__Group__6 :
	// rule__Method__Group__6__Impl ;
	public final void rule__Method__Group__6() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:1363:1: (
			// rule__Method__Group__6__Impl )
			// InternalModelEditorParser.g:1364:2: rule__Method__Group__6__Impl
			{
				pushFollow(FOLLOW_2);
				rule__Method__Group__6__Impl();

				state._fsp--;

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Method__Group__6"

	// $ANTLR start "rule__Method__Group__6__Impl"
	// InternalModelEditorParser.g:1370:1: rule__Method__Group__6__Impl : ( (
	// rule__Method__Group_6__0 )? ) ;
	public final void rule__Method__Group__6__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:1374:1: ( ( (
			// rule__Method__Group_6__0 )? ) )
			// InternalModelEditorParser.g:1375:1: ( ( rule__Method__Group_6__0
			// )? )
			{
				// InternalModelEditorParser.g:1375:1: ( (
				// rule__Method__Group_6__0 )? )
				// InternalModelEditorParser.g:1376:2: (
				// rule__Method__Group_6__0 )?
				{
					before(grammarAccess.getMethodAccess().getGroup_6());
					// InternalModelEditorParser.g:1377:2: (
					// rule__Method__Group_6__0 )?
					int alt21 = 2;
					int LA21_0 = input.LA(1);

					if ((LA21_0 == RULE_BEGIN)) {
						alt21 = 1;
					}
					switch (alt21) {
					case 1:
					// InternalModelEditorParser.g:1377:3:
					// rule__Method__Group_6__0
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

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Method__Group__6__Impl"

	// $ANTLR start "rule__Method__Group_3__0"
	// InternalModelEditorParser.g:1386:1: rule__Method__Group_3__0 :
	// rule__Method__Group_3__0__Impl rule__Method__Group_3__1 ;
	public final void rule__Method__Group_3__0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:1390:1: (
			// rule__Method__Group_3__0__Impl rule__Method__Group_3__1 )
			// InternalModelEditorParser.g:1391:2:
			// rule__Method__Group_3__0__Impl rule__Method__Group_3__1
			{
				pushFollow(FOLLOW_19);
				rule__Method__Group_3__0__Impl();

				state._fsp--;

				pushFollow(FOLLOW_2);
				rule__Method__Group_3__1();

				state._fsp--;

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Method__Group_3__0"

	// $ANTLR start "rule__Method__Group_3__0__Impl"
	// InternalModelEditorParser.g:1398:1: rule__Method__Group_3__0__Impl : ( (
	// rule__Method__TypesAssignment_3_0 ) ) ;
	public final void rule__Method__Group_3__0__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:1402:1: ( ( (
			// rule__Method__TypesAssignment_3_0 ) ) )
			// InternalModelEditorParser.g:1403:1: ( (
			// rule__Method__TypesAssignment_3_0 ) )
			{
				// InternalModelEditorParser.g:1403:1: ( (
				// rule__Method__TypesAssignment_3_0 ) )
				// InternalModelEditorParser.g:1404:2: (
				// rule__Method__TypesAssignment_3_0 )
				{
					before(grammarAccess.getMethodAccess().getTypesAssignment_3_0());
					// InternalModelEditorParser.g:1405:2: (
					// rule__Method__TypesAssignment_3_0 )
					// InternalModelEditorParser.g:1405:3:
					// rule__Method__TypesAssignment_3_0
					{
						pushFollow(FOLLOW_2);
						rule__Method__TypesAssignment_3_0();

						state._fsp--;

					}

					after(grammarAccess.getMethodAccess().getTypesAssignment_3_0());

				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Method__Group_3__0__Impl"

	// $ANTLR start "rule__Method__Group_3__1"
	// InternalModelEditorParser.g:1413:1: rule__Method__Group_3__1 :
	// rule__Method__Group_3__1__Impl ;
	public final void rule__Method__Group_3__1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:1417:1: (
			// rule__Method__Group_3__1__Impl )
			// InternalModelEditorParser.g:1418:2:
			// rule__Method__Group_3__1__Impl
			{
				pushFollow(FOLLOW_2);
				rule__Method__Group_3__1__Impl();

				state._fsp--;

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Method__Group_3__1"

	// $ANTLR start "rule__Method__Group_3__1__Impl"
	// InternalModelEditorParser.g:1424:1: rule__Method__Group_3__1__Impl : ( (
	// rule__Method__Group_3_1__0 )* ) ;
	public final void rule__Method__Group_3__1__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:1428:1: ( ( (
			// rule__Method__Group_3_1__0 )* ) )
			// InternalModelEditorParser.g:1429:1: ( (
			// rule__Method__Group_3_1__0 )* )
			{
				// InternalModelEditorParser.g:1429:1: ( (
				// rule__Method__Group_3_1__0 )* )
				// InternalModelEditorParser.g:1430:2: (
				// rule__Method__Group_3_1__0 )*
				{
					before(grammarAccess.getMethodAccess().getGroup_3_1());
					// InternalModelEditorParser.g:1431:2: (
					// rule__Method__Group_3_1__0 )*
					loop22: do {
						int alt22 = 2;
						int LA22_0 = input.LA(1);

						if ((LA22_0 == Comma)) {
							alt22 = 1;
						}

						switch (alt22) {
						case 1:
						// InternalModelEditorParser.g:1431:3:
						// rule__Method__Group_3_1__0
						{
							pushFollow(FOLLOW_20);
							rule__Method__Group_3_1__0();

							state._fsp--;

						}
							break;

						default:
							break loop22;
						}
					} while (true);

					after(grammarAccess.getMethodAccess().getGroup_3_1());

				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Method__Group_3__1__Impl"

	// $ANTLR start "rule__Method__Group_3_1__0"
	// InternalModelEditorParser.g:1440:1: rule__Method__Group_3_1__0 :
	// rule__Method__Group_3_1__0__Impl rule__Method__Group_3_1__1 ;
	public final void rule__Method__Group_3_1__0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:1444:1: (
			// rule__Method__Group_3_1__0__Impl rule__Method__Group_3_1__1 )
			// InternalModelEditorParser.g:1445:2:
			// rule__Method__Group_3_1__0__Impl rule__Method__Group_3_1__1
			{
				pushFollow(FOLLOW_6);
				rule__Method__Group_3_1__0__Impl();

				state._fsp--;

				pushFollow(FOLLOW_2);
				rule__Method__Group_3_1__1();

				state._fsp--;

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Method__Group_3_1__0"

	// $ANTLR start "rule__Method__Group_3_1__0__Impl"
	// InternalModelEditorParser.g:1452:1: rule__Method__Group_3_1__0__Impl : (
	// Comma ) ;
	public final void rule__Method__Group_3_1__0__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:1456:1: ( ( Comma ) )
			// InternalModelEditorParser.g:1457:1: ( Comma )
			{
				// InternalModelEditorParser.g:1457:1: ( Comma )
				// InternalModelEditorParser.g:1458:2: Comma
				{
					before(grammarAccess.getMethodAccess().getCommaKeyword_3_1_0());
					match(input, Comma, FOLLOW_2);
					after(grammarAccess.getMethodAccess().getCommaKeyword_3_1_0());

				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Method__Group_3_1__0__Impl"

	// $ANTLR start "rule__Method__Group_3_1__1"
	// InternalModelEditorParser.g:1467:1: rule__Method__Group_3_1__1 :
	// rule__Method__Group_3_1__1__Impl ;
	public final void rule__Method__Group_3_1__1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:1471:1: (
			// rule__Method__Group_3_1__1__Impl )
			// InternalModelEditorParser.g:1472:2:
			// rule__Method__Group_3_1__1__Impl
			{
				pushFollow(FOLLOW_2);
				rule__Method__Group_3_1__1__Impl();

				state._fsp--;

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Method__Group_3_1__1"

	// $ANTLR start "rule__Method__Group_3_1__1__Impl"
	// InternalModelEditorParser.g:1478:1: rule__Method__Group_3_1__1__Impl : (
	// ( rule__Method__TypesAssignment_3_1_1 ) ) ;
	public final void rule__Method__Group_3_1__1__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:1482:1: ( ( (
			// rule__Method__TypesAssignment_3_1_1 ) ) )
			// InternalModelEditorParser.g:1483:1: ( (
			// rule__Method__TypesAssignment_3_1_1 ) )
			{
				// InternalModelEditorParser.g:1483:1: ( (
				// rule__Method__TypesAssignment_3_1_1 ) )
				// InternalModelEditorParser.g:1484:2: (
				// rule__Method__TypesAssignment_3_1_1 )
				{
					before(grammarAccess.getMethodAccess().getTypesAssignment_3_1_1());
					// InternalModelEditorParser.g:1485:2: (
					// rule__Method__TypesAssignment_3_1_1 )
					// InternalModelEditorParser.g:1485:3:
					// rule__Method__TypesAssignment_3_1_1
					{
						pushFollow(FOLLOW_2);
						rule__Method__TypesAssignment_3_1_1();

						state._fsp--;

					}

					after(grammarAccess.getMethodAccess().getTypesAssignment_3_1_1());

				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Method__Group_3_1__1__Impl"

	// $ANTLR start "rule__Method__Group_5__0"
	// InternalModelEditorParser.g:1494:1: rule__Method__Group_5__0 :
	// rule__Method__Group_5__0__Impl rule__Method__Group_5__1 ;
	public final void rule__Method__Group_5__0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:1498:1: (
			// rule__Method__Group_5__0__Impl rule__Method__Group_5__1 )
			// InternalModelEditorParser.g:1499:2:
			// rule__Method__Group_5__0__Impl rule__Method__Group_5__1
			{
				pushFollow(FOLLOW_6);
				rule__Method__Group_5__0__Impl();

				state._fsp--;

				pushFollow(FOLLOW_2);
				rule__Method__Group_5__1();

				state._fsp--;

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Method__Group_5__0"

	// $ANTLR start "rule__Method__Group_5__0__Impl"
	// InternalModelEditorParser.g:1506:1: rule__Method__Group_5__0__Impl : (
	// Colon ) ;
	public final void rule__Method__Group_5__0__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:1510:1: ( ( Colon ) )
			// InternalModelEditorParser.g:1511:1: ( Colon )
			{
				// InternalModelEditorParser.g:1511:1: ( Colon )
				// InternalModelEditorParser.g:1512:2: Colon
				{
					before(grammarAccess.getMethodAccess().getColonKeyword_5_0());
					match(input, Colon, FOLLOW_2);
					after(grammarAccess.getMethodAccess().getColonKeyword_5_0());

				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Method__Group_5__0__Impl"

	// $ANTLR start "rule__Method__Group_5__1"
	// InternalModelEditorParser.g:1521:1: rule__Method__Group_5__1 :
	// rule__Method__Group_5__1__Impl ;
	public final void rule__Method__Group_5__1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:1525:1: (
			// rule__Method__Group_5__1__Impl )
			// InternalModelEditorParser.g:1526:2:
			// rule__Method__Group_5__1__Impl
			{
				pushFollow(FOLLOW_2);
				rule__Method__Group_5__1__Impl();

				state._fsp--;

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Method__Group_5__1"

	// $ANTLR start "rule__Method__Group_5__1__Impl"
	// InternalModelEditorParser.g:1532:1: rule__Method__Group_5__1__Impl : ( (
	// rule__Method__TypeAssignment_5_1 ) ) ;
	public final void rule__Method__Group_5__1__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:1536:1: ( ( (
			// rule__Method__TypeAssignment_5_1 ) ) )
			// InternalModelEditorParser.g:1537:1: ( (
			// rule__Method__TypeAssignment_5_1 ) )
			{
				// InternalModelEditorParser.g:1537:1: ( (
				// rule__Method__TypeAssignment_5_1 ) )
				// InternalModelEditorParser.g:1538:2: (
				// rule__Method__TypeAssignment_5_1 )
				{
					before(grammarAccess.getMethodAccess().getTypeAssignment_5_1());
					// InternalModelEditorParser.g:1539:2: (
					// rule__Method__TypeAssignment_5_1 )
					// InternalModelEditorParser.g:1539:3:
					// rule__Method__TypeAssignment_5_1
					{
						pushFollow(FOLLOW_2);
						rule__Method__TypeAssignment_5_1();

						state._fsp--;

					}

					after(grammarAccess.getMethodAccess().getTypeAssignment_5_1());

				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Method__Group_5__1__Impl"

	// $ANTLR start "rule__Method__Group_6__0"
	// InternalModelEditorParser.g:1548:1: rule__Method__Group_6__0 :
	// rule__Method__Group_6__0__Impl rule__Method__Group_6__1 ;
	public final void rule__Method__Group_6__0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:1552:1: (
			// rule__Method__Group_6__0__Impl rule__Method__Group_6__1 )
			// InternalModelEditorParser.g:1553:2:
			// rule__Method__Group_6__0__Impl rule__Method__Group_6__1
			{
				pushFollow(FOLLOW_21);
				rule__Method__Group_6__0__Impl();

				state._fsp--;

				pushFollow(FOLLOW_2);
				rule__Method__Group_6__1();

				state._fsp--;

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Method__Group_6__0"

	// $ANTLR start "rule__Method__Group_6__0__Impl"
	// InternalModelEditorParser.g:1560:1: rule__Method__Group_6__0__Impl : (
	// RULE_BEGIN ) ;
	public final void rule__Method__Group_6__0__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:1564:1: ( ( RULE_BEGIN ) )
			// InternalModelEditorParser.g:1565:1: ( RULE_BEGIN )
			{
				// InternalModelEditorParser.g:1565:1: ( RULE_BEGIN )
				// InternalModelEditorParser.g:1566:2: RULE_BEGIN
				{
					before(grammarAccess.getMethodAccess().getBEGINTerminalRuleCall_6_0());
					match(input, RULE_BEGIN, FOLLOW_2);
					after(grammarAccess.getMethodAccess().getBEGINTerminalRuleCall_6_0());

				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Method__Group_6__0__Impl"

	// $ANTLR start "rule__Method__Group_6__1"
	// InternalModelEditorParser.g:1575:1: rule__Method__Group_6__1 :
	// rule__Method__Group_6__1__Impl rule__Method__Group_6__2 ;
	public final void rule__Method__Group_6__1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:1579:1: (
			// rule__Method__Group_6__1__Impl rule__Method__Group_6__2 )
			// InternalModelEditorParser.g:1580:2:
			// rule__Method__Group_6__1__Impl rule__Method__Group_6__2
			{
				pushFollow(FOLLOW_21);
				rule__Method__Group_6__1__Impl();

				state._fsp--;

				pushFollow(FOLLOW_2);
				rule__Method__Group_6__2();

				state._fsp--;

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Method__Group_6__1"

	// $ANTLR start "rule__Method__Group_6__1__Impl"
	// InternalModelEditorParser.g:1587:1: rule__Method__Group_6__1__Impl : ( (
	// rule__Method__Group_6_1__0 )? ) ;
	public final void rule__Method__Group_6__1__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:1591:1: ( ( (
			// rule__Method__Group_6_1__0 )? ) )
			// InternalModelEditorParser.g:1592:1: ( (
			// rule__Method__Group_6_1__0 )? )
			{
				// InternalModelEditorParser.g:1592:1: ( (
				// rule__Method__Group_6_1__0 )? )
				// InternalModelEditorParser.g:1593:2: (
				// rule__Method__Group_6_1__0 )?
				{
					before(grammarAccess.getMethodAccess().getGroup_6_1());
					// InternalModelEditorParser.g:1594:2: (
					// rule__Method__Group_6_1__0 )?
					int alt23 = 2;
					int LA23_0 = input.LA(1);

					if ((LA23_0 == RULE_INT)) {
						int LA23_1 = input.LA(2);

						if ((LA23_1 == Lines)) {
							alt23 = 1;
						}
					}
					switch (alt23) {
					case 1:
					// InternalModelEditorParser.g:1594:3:
					// rule__Method__Group_6_1__0
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

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Method__Group_6__1__Impl"

	// $ANTLR start "rule__Method__Group_6__2"
	// InternalModelEditorParser.g:1602:1: rule__Method__Group_6__2 :
	// rule__Method__Group_6__2__Impl rule__Method__Group_6__3 ;
	public final void rule__Method__Group_6__2() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:1606:1: (
			// rule__Method__Group_6__2__Impl rule__Method__Group_6__3 )
			// InternalModelEditorParser.g:1607:2:
			// rule__Method__Group_6__2__Impl rule__Method__Group_6__3
			{
				pushFollow(FOLLOW_21);
				rule__Method__Group_6__2__Impl();

				state._fsp--;

				pushFollow(FOLLOW_2);
				rule__Method__Group_6__3();

				state._fsp--;

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Method__Group_6__2"

	// $ANTLR start "rule__Method__Group_6__2__Impl"
	// InternalModelEditorParser.g:1614:1: rule__Method__Group_6__2__Impl : ( (
	// rule__Method__Group_6_2__0 )? ) ;
	public final void rule__Method__Group_6__2__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:1618:1: ( ( (
			// rule__Method__Group_6_2__0 )? ) )
			// InternalModelEditorParser.g:1619:1: ( (
			// rule__Method__Group_6_2__0 )? )
			{
				// InternalModelEditorParser.g:1619:1: ( (
				// rule__Method__Group_6_2__0 )? )
				// InternalModelEditorParser.g:1620:2: (
				// rule__Method__Group_6_2__0 )?
				{
					before(grammarAccess.getMethodAccess().getGroup_6_2());
					// InternalModelEditorParser.g:1621:2: (
					// rule__Method__Group_6_2__0 )?
					int alt24 = 2;
					int LA24_0 = input.LA(1);

					if ((LA24_0 == RULE_INT)) {
						int LA24_1 = input.LA(2);

						if ((LA24_1 == Cyclo)) {
							alt24 = 1;
						}
					}
					switch (alt24) {
					case 1:
					// InternalModelEditorParser.g:1621:3:
					// rule__Method__Group_6_2__0
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

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Method__Group_6__2__Impl"

	// $ANTLR start "rule__Method__Group_6__3"
	// InternalModelEditorParser.g:1629:1: rule__Method__Group_6__3 :
	// rule__Method__Group_6__3__Impl rule__Method__Group_6__4 ;
	public final void rule__Method__Group_6__3() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:1633:1: (
			// rule__Method__Group_6__3__Impl rule__Method__Group_6__4 )
			// InternalModelEditorParser.g:1634:2:
			// rule__Method__Group_6__3__Impl rule__Method__Group_6__4
			{
				pushFollow(FOLLOW_21);
				rule__Method__Group_6__3__Impl();

				state._fsp--;

				pushFollow(FOLLOW_2);
				rule__Method__Group_6__4();

				state._fsp--;

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Method__Group_6__3"

	// $ANTLR start "rule__Method__Group_6__3__Impl"
	// InternalModelEditorParser.g:1641:1: rule__Method__Group_6__3__Impl : ( (
	// rule__Method__AccessesAssignment_6_3 )* ) ;
	public final void rule__Method__Group_6__3__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:1645:1: ( ( (
			// rule__Method__AccessesAssignment_6_3 )* ) )
			// InternalModelEditorParser.g:1646:1: ( (
			// rule__Method__AccessesAssignment_6_3 )* )
			{
				// InternalModelEditorParser.g:1646:1: ( (
				// rule__Method__AccessesAssignment_6_3 )* )
				// InternalModelEditorParser.g:1647:2: (
				// rule__Method__AccessesAssignment_6_3 )*
				{
					before(grammarAccess.getMethodAccess().getAccessesAssignment_6_3());
					// InternalModelEditorParser.g:1648:2: (
					// rule__Method__AccessesAssignment_6_3 )*
					loop25: do {
						int alt25 = 2;
						int LA25_0 = input.LA(1);

						if ((LA25_0 == RULE_INT)) {
							int LA25_1 = input.LA(2);

							if ((LA25_1 == Accesses || LA25_1 == Access)) {
								alt25 = 1;
							}

						}

						switch (alt25) {
						case 1:
						// InternalModelEditorParser.g:1648:3:
						// rule__Method__AccessesAssignment_6_3
						{
							pushFollow(FOLLOW_22);
							rule__Method__AccessesAssignment_6_3();

							state._fsp--;

						}
							break;

						default:
							break loop25;
						}
					} while (true);

					after(grammarAccess.getMethodAccess().getAccessesAssignment_6_3());

				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Method__Group_6__3__Impl"

	// $ANTLR start "rule__Method__Group_6__4"
	// InternalModelEditorParser.g:1656:1: rule__Method__Group_6__4 :
	// rule__Method__Group_6__4__Impl rule__Method__Group_6__5 ;
	public final void rule__Method__Group_6__4() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:1660:1: (
			// rule__Method__Group_6__4__Impl rule__Method__Group_6__5 )
			// InternalModelEditorParser.g:1661:2:
			// rule__Method__Group_6__4__Impl rule__Method__Group_6__5
			{
				pushFollow(FOLLOW_21);
				rule__Method__Group_6__4__Impl();

				state._fsp--;

				pushFollow(FOLLOW_2);
				rule__Method__Group_6__5();

				state._fsp--;

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Method__Group_6__4"

	// $ANTLR start "rule__Method__Group_6__4__Impl"
	// InternalModelEditorParser.g:1668:1: rule__Method__Group_6__4__Impl : ( (
	// rule__Method__CallsAssignment_6_4 )* ) ;
	public final void rule__Method__Group_6__4__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:1672:1: ( ( (
			// rule__Method__CallsAssignment_6_4 )* ) )
			// InternalModelEditorParser.g:1673:1: ( (
			// rule__Method__CallsAssignment_6_4 )* )
			{
				// InternalModelEditorParser.g:1673:1: ( (
				// rule__Method__CallsAssignment_6_4 )* )
				// InternalModelEditorParser.g:1674:2: (
				// rule__Method__CallsAssignment_6_4 )*
				{
					before(grammarAccess.getMethodAccess().getCallsAssignment_6_4());
					// InternalModelEditorParser.g:1675:2: (
					// rule__Method__CallsAssignment_6_4 )*
					loop26: do {
						int alt26 = 2;
						int LA26_0 = input.LA(1);

						if ((LA26_0 == RULE_INT)) {
							alt26 = 1;
						}

						switch (alt26) {
						case 1:
						// InternalModelEditorParser.g:1675:3:
						// rule__Method__CallsAssignment_6_4
						{
							pushFollow(FOLLOW_22);
							rule__Method__CallsAssignment_6_4();

							state._fsp--;

						}
							break;

						default:
							break loop26;
						}
					} while (true);

					after(grammarAccess.getMethodAccess().getCallsAssignment_6_4());

				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Method__Group_6__4__Impl"

	// $ANTLR start "rule__Method__Group_6__5"
	// InternalModelEditorParser.g:1683:1: rule__Method__Group_6__5 :
	// rule__Method__Group_6__5__Impl ;
	public final void rule__Method__Group_6__5() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:1687:1: (
			// rule__Method__Group_6__5__Impl )
			// InternalModelEditorParser.g:1688:2:
			// rule__Method__Group_6__5__Impl
			{
				pushFollow(FOLLOW_2);
				rule__Method__Group_6__5__Impl();

				state._fsp--;

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Method__Group_6__5"

	// $ANTLR start "rule__Method__Group_6__5__Impl"
	// InternalModelEditorParser.g:1694:1: rule__Method__Group_6__5__Impl : (
	// RULE_END ) ;
	public final void rule__Method__Group_6__5__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:1698:1: ( ( RULE_END ) )
			// InternalModelEditorParser.g:1699:1: ( RULE_END )
			{
				// InternalModelEditorParser.g:1699:1: ( RULE_END )
				// InternalModelEditorParser.g:1700:2: RULE_END
				{
					before(grammarAccess.getMethodAccess().getENDTerminalRuleCall_6_5());
					match(input, RULE_END, FOLLOW_2);
					after(grammarAccess.getMethodAccess().getENDTerminalRuleCall_6_5());

				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Method__Group_6__5__Impl"

	// $ANTLR start "rule__Method__Group_6_1__0"
	// InternalModelEditorParser.g:1710:1: rule__Method__Group_6_1__0 :
	// rule__Method__Group_6_1__0__Impl rule__Method__Group_6_1__1 ;
	public final void rule__Method__Group_6_1__0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:1714:1: (
			// rule__Method__Group_6_1__0__Impl rule__Method__Group_6_1__1 )
			// InternalModelEditorParser.g:1715:2:
			// rule__Method__Group_6_1__0__Impl rule__Method__Group_6_1__1
			{
				pushFollow(FOLLOW_23);
				rule__Method__Group_6_1__0__Impl();

				state._fsp--;

				pushFollow(FOLLOW_2);
				rule__Method__Group_6_1__1();

				state._fsp--;

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Method__Group_6_1__0"

	// $ANTLR start "rule__Method__Group_6_1__0__Impl"
	// InternalModelEditorParser.g:1722:1: rule__Method__Group_6_1__0__Impl : (
	// ( rule__Method__LocAssignment_6_1_0 ) ) ;
	public final void rule__Method__Group_6_1__0__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:1726:1: ( ( (
			// rule__Method__LocAssignment_6_1_0 ) ) )
			// InternalModelEditorParser.g:1727:1: ( (
			// rule__Method__LocAssignment_6_1_0 ) )
			{
				// InternalModelEditorParser.g:1727:1: ( (
				// rule__Method__LocAssignment_6_1_0 ) )
				// InternalModelEditorParser.g:1728:2: (
				// rule__Method__LocAssignment_6_1_0 )
				{
					before(grammarAccess.getMethodAccess().getLocAssignment_6_1_0());
					// InternalModelEditorParser.g:1729:2: (
					// rule__Method__LocAssignment_6_1_0 )
					// InternalModelEditorParser.g:1729:3:
					// rule__Method__LocAssignment_6_1_0
					{
						pushFollow(FOLLOW_2);
						rule__Method__LocAssignment_6_1_0();

						state._fsp--;

					}

					after(grammarAccess.getMethodAccess().getLocAssignment_6_1_0());

				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Method__Group_6_1__0__Impl"

	// $ANTLR start "rule__Method__Group_6_1__1"
	// InternalModelEditorParser.g:1737:1: rule__Method__Group_6_1__1 :
	// rule__Method__Group_6_1__1__Impl rule__Method__Group_6_1__2 ;
	public final void rule__Method__Group_6_1__1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:1741:1: (
			// rule__Method__Group_6_1__1__Impl rule__Method__Group_6_1__2 )
			// InternalModelEditorParser.g:1742:2:
			// rule__Method__Group_6_1__1__Impl rule__Method__Group_6_1__2
			{
				pushFollow(FOLLOW_24);
				rule__Method__Group_6_1__1__Impl();

				state._fsp--;

				pushFollow(FOLLOW_2);
				rule__Method__Group_6_1__2();

				state._fsp--;

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Method__Group_6_1__1"

	// $ANTLR start "rule__Method__Group_6_1__1__Impl"
	// InternalModelEditorParser.g:1749:1: rule__Method__Group_6_1__1__Impl : (
	// Lines ) ;
	public final void rule__Method__Group_6_1__1__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:1753:1: ( ( Lines ) )
			// InternalModelEditorParser.g:1754:1: ( Lines )
			{
				// InternalModelEditorParser.g:1754:1: ( Lines )
				// InternalModelEditorParser.g:1755:2: Lines
				{
					before(grammarAccess.getMethodAccess().getLinesKeyword_6_1_1());
					match(input, Lines, FOLLOW_2);
					after(grammarAccess.getMethodAccess().getLinesKeyword_6_1_1());

				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Method__Group_6_1__1__Impl"

	// $ANTLR start "rule__Method__Group_6_1__2"
	// InternalModelEditorParser.g:1764:1: rule__Method__Group_6_1__2 :
	// rule__Method__Group_6_1__2__Impl rule__Method__Group_6_1__3 ;
	public final void rule__Method__Group_6_1__2() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:1768:1: (
			// rule__Method__Group_6_1__2__Impl rule__Method__Group_6_1__3 )
			// InternalModelEditorParser.g:1769:2:
			// rule__Method__Group_6_1__2__Impl rule__Method__Group_6_1__3
			{
				pushFollow(FOLLOW_25);
				rule__Method__Group_6_1__2__Impl();

				state._fsp--;

				pushFollow(FOLLOW_2);
				rule__Method__Group_6_1__3();

				state._fsp--;

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Method__Group_6_1__2"

	// $ANTLR start "rule__Method__Group_6_1__2__Impl"
	// InternalModelEditorParser.g:1776:1: rule__Method__Group_6_1__2__Impl : (
	// Of ) ;
	public final void rule__Method__Group_6_1__2__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:1780:1: ( ( Of ) )
			// InternalModelEditorParser.g:1781:1: ( Of )
			{
				// InternalModelEditorParser.g:1781:1: ( Of )
				// InternalModelEditorParser.g:1782:2: Of
				{
					before(grammarAccess.getMethodAccess().getOfKeyword_6_1_2());
					match(input, Of, FOLLOW_2);
					after(grammarAccess.getMethodAccess().getOfKeyword_6_1_2());

				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Method__Group_6_1__2__Impl"

	// $ANTLR start "rule__Method__Group_6_1__3"
	// InternalModelEditorParser.g:1791:1: rule__Method__Group_6_1__3 :
	// rule__Method__Group_6_1__3__Impl ;
	public final void rule__Method__Group_6_1__3() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:1795:1: (
			// rule__Method__Group_6_1__3__Impl )
			// InternalModelEditorParser.g:1796:2:
			// rule__Method__Group_6_1__3__Impl
			{
				pushFollow(FOLLOW_2);
				rule__Method__Group_6_1__3__Impl();

				state._fsp--;

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Method__Group_6_1__3"

	// $ANTLR start "rule__Method__Group_6_1__3__Impl"
	// InternalModelEditorParser.g:1802:1: rule__Method__Group_6_1__3__Impl : (
	// Code ) ;
	public final void rule__Method__Group_6_1__3__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:1806:1: ( ( Code ) )
			// InternalModelEditorParser.g:1807:1: ( Code )
			{
				// InternalModelEditorParser.g:1807:1: ( Code )
				// InternalModelEditorParser.g:1808:2: Code
				{
					before(grammarAccess.getMethodAccess().getCodeKeyword_6_1_3());
					match(input, Code, FOLLOW_2);
					after(grammarAccess.getMethodAccess().getCodeKeyword_6_1_3());

				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Method__Group_6_1__3__Impl"

	// $ANTLR start "rule__Method__Group_6_2__0"
	// InternalModelEditorParser.g:1818:1: rule__Method__Group_6_2__0 :
	// rule__Method__Group_6_2__0__Impl rule__Method__Group_6_2__1 ;
	public final void rule__Method__Group_6_2__0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:1822:1: (
			// rule__Method__Group_6_2__0__Impl rule__Method__Group_6_2__1 )
			// InternalModelEditorParser.g:1823:2:
			// rule__Method__Group_6_2__0__Impl rule__Method__Group_6_2__1
			{
				pushFollow(FOLLOW_26);
				rule__Method__Group_6_2__0__Impl();

				state._fsp--;

				pushFollow(FOLLOW_2);
				rule__Method__Group_6_2__1();

				state._fsp--;

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Method__Group_6_2__0"

	// $ANTLR start "rule__Method__Group_6_2__0__Impl"
	// InternalModelEditorParser.g:1830:1: rule__Method__Group_6_2__0__Impl : (
	// ( rule__Method__CycloAssignment_6_2_0 ) ) ;
	public final void rule__Method__Group_6_2__0__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:1834:1: ( ( (
			// rule__Method__CycloAssignment_6_2_0 ) ) )
			// InternalModelEditorParser.g:1835:1: ( (
			// rule__Method__CycloAssignment_6_2_0 ) )
			{
				// InternalModelEditorParser.g:1835:1: ( (
				// rule__Method__CycloAssignment_6_2_0 ) )
				// InternalModelEditorParser.g:1836:2: (
				// rule__Method__CycloAssignment_6_2_0 )
				{
					before(grammarAccess.getMethodAccess().getCycloAssignment_6_2_0());
					// InternalModelEditorParser.g:1837:2: (
					// rule__Method__CycloAssignment_6_2_0 )
					// InternalModelEditorParser.g:1837:3:
					// rule__Method__CycloAssignment_6_2_0
					{
						pushFollow(FOLLOW_2);
						rule__Method__CycloAssignment_6_2_0();

						state._fsp--;

					}

					after(grammarAccess.getMethodAccess().getCycloAssignment_6_2_0());

				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Method__Group_6_2__0__Impl"

	// $ANTLR start "rule__Method__Group_6_2__1"
	// InternalModelEditorParser.g:1845:1: rule__Method__Group_6_2__1 :
	// rule__Method__Group_6_2__1__Impl ;
	public final void rule__Method__Group_6_2__1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:1849:1: (
			// rule__Method__Group_6_2__1__Impl )
			// InternalModelEditorParser.g:1850:2:
			// rule__Method__Group_6_2__1__Impl
			{
				pushFollow(FOLLOW_2);
				rule__Method__Group_6_2__1__Impl();

				state._fsp--;

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Method__Group_6_2__1"

	// $ANTLR start "rule__Method__Group_6_2__1__Impl"
	// InternalModelEditorParser.g:1856:1: rule__Method__Group_6_2__1__Impl : (
	// Cyclo ) ;
	public final void rule__Method__Group_6_2__1__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:1860:1: ( ( Cyclo ) )
			// InternalModelEditorParser.g:1861:1: ( Cyclo )
			{
				// InternalModelEditorParser.g:1861:1: ( Cyclo )
				// InternalModelEditorParser.g:1862:2: Cyclo
				{
					before(grammarAccess.getMethodAccess().getCycloKeyword_6_2_1());
					match(input, Cyclo, FOLLOW_2);
					after(grammarAccess.getMethodAccess().getCycloKeyword_6_2_1());

				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Method__Group_6_2__1__Impl"

	// $ANTLR start "rule__Access__Group__0"
	// InternalModelEditorParser.g:1872:1: rule__Access__Group__0 :
	// rule__Access__Group__0__Impl rule__Access__Group__1 ;
	public final void rule__Access__Group__0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:1876:1: (
			// rule__Access__Group__0__Impl rule__Access__Group__1 )
			// InternalModelEditorParser.g:1877:2: rule__Access__Group__0__Impl
			// rule__Access__Group__1
			{
				pushFollow(FOLLOW_27);
				rule__Access__Group__0__Impl();

				state._fsp--;

				pushFollow(FOLLOW_2);
				rule__Access__Group__1();

				state._fsp--;

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Access__Group__0"

	// $ANTLR start "rule__Access__Group__0__Impl"
	// InternalModelEditorParser.g:1884:1: rule__Access__Group__0__Impl : ( (
	// rule__Access__AccessesAssignment_0 ) ) ;
	public final void rule__Access__Group__0__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:1888:1: ( ( (
			// rule__Access__AccessesAssignment_0 ) ) )
			// InternalModelEditorParser.g:1889:1: ( (
			// rule__Access__AccessesAssignment_0 ) )
			{
				// InternalModelEditorParser.g:1889:1: ( (
				// rule__Access__AccessesAssignment_0 ) )
				// InternalModelEditorParser.g:1890:2: (
				// rule__Access__AccessesAssignment_0 )
				{
					before(grammarAccess.getAccessAccess().getAccessesAssignment_0());
					// InternalModelEditorParser.g:1891:2: (
					// rule__Access__AccessesAssignment_0 )
					// InternalModelEditorParser.g:1891:3:
					// rule__Access__AccessesAssignment_0
					{
						pushFollow(FOLLOW_2);
						rule__Access__AccessesAssignment_0();

						state._fsp--;

					}

					after(grammarAccess.getAccessAccess().getAccessesAssignment_0());

				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Access__Group__0__Impl"

	// $ANTLR start "rule__Access__Group__1"
	// InternalModelEditorParser.g:1899:1: rule__Access__Group__1 :
	// rule__Access__Group__1__Impl rule__Access__Group__2 ;
	public final void rule__Access__Group__1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:1903:1: (
			// rule__Access__Group__1__Impl rule__Access__Group__2 )
			// InternalModelEditorParser.g:1904:2: rule__Access__Group__1__Impl
			// rule__Access__Group__2
			{
				pushFollow(FOLLOW_28);
				rule__Access__Group__1__Impl();

				state._fsp--;

				pushFollow(FOLLOW_2);
				rule__Access__Group__2();

				state._fsp--;

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Access__Group__1"

	// $ANTLR start "rule__Access__Group__1__Impl"
	// InternalModelEditorParser.g:1911:1: rule__Access__Group__1__Impl : ( (
	// rule__Access__Alternatives_1 ) ) ;
	public final void rule__Access__Group__1__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:1915:1: ( ( (
			// rule__Access__Alternatives_1 ) ) )
			// InternalModelEditorParser.g:1916:1: ( (
			// rule__Access__Alternatives_1 ) )
			{
				// InternalModelEditorParser.g:1916:1: ( (
				// rule__Access__Alternatives_1 ) )
				// InternalModelEditorParser.g:1917:2: (
				// rule__Access__Alternatives_1 )
				{
					before(grammarAccess.getAccessAccess().getAlternatives_1());
					// InternalModelEditorParser.g:1918:2: (
					// rule__Access__Alternatives_1 )
					// InternalModelEditorParser.g:1918:3:
					// rule__Access__Alternatives_1
					{
						pushFollow(FOLLOW_2);
						rule__Access__Alternatives_1();

						state._fsp--;

					}

					after(grammarAccess.getAccessAccess().getAlternatives_1());

				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Access__Group__1__Impl"

	// $ANTLR start "rule__Access__Group__2"
	// InternalModelEditorParser.g:1926:1: rule__Access__Group__2 :
	// rule__Access__Group__2__Impl rule__Access__Group__3 ;
	public final void rule__Access__Group__2() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:1930:1: (
			// rule__Access__Group__2__Impl rule__Access__Group__3 )
			// InternalModelEditorParser.g:1931:2: rule__Access__Group__2__Impl
			// rule__Access__Group__3
			{
				pushFollow(FOLLOW_6);
				rule__Access__Group__2__Impl();

				state._fsp--;

				pushFollow(FOLLOW_2);
				rule__Access__Group__3();

				state._fsp--;

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Access__Group__2"

	// $ANTLR start "rule__Access__Group__2__Impl"
	// InternalModelEditorParser.g:1938:1: rule__Access__Group__2__Impl : ( To )
	// ;
	public final void rule__Access__Group__2__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:1942:1: ( ( To ) )
			// InternalModelEditorParser.g:1943:1: ( To )
			{
				// InternalModelEditorParser.g:1943:1: ( To )
				// InternalModelEditorParser.g:1944:2: To
				{
					before(grammarAccess.getAccessAccess().getToKeyword_2());
					match(input, To, FOLLOW_2);
					after(grammarAccess.getAccessAccess().getToKeyword_2());

				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Access__Group__2__Impl"

	// $ANTLR start "rule__Access__Group__3"
	// InternalModelEditorParser.g:1953:1: rule__Access__Group__3 :
	// rule__Access__Group__3__Impl ;
	public final void rule__Access__Group__3() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:1957:1: (
			// rule__Access__Group__3__Impl )
			// InternalModelEditorParser.g:1958:2: rule__Access__Group__3__Impl
			{
				pushFollow(FOLLOW_2);
				rule__Access__Group__3__Impl();

				state._fsp--;

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Access__Group__3"

	// $ANTLR start "rule__Access__Group__3__Impl"
	// InternalModelEditorParser.g:1964:1: rule__Access__Group__3__Impl : ( (
	// rule__Access__FieldAssignment_3 ) ) ;
	public final void rule__Access__Group__3__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:1968:1: ( ( (
			// rule__Access__FieldAssignment_3 ) ) )
			// InternalModelEditorParser.g:1969:1: ( (
			// rule__Access__FieldAssignment_3 ) )
			{
				// InternalModelEditorParser.g:1969:1: ( (
				// rule__Access__FieldAssignment_3 ) )
				// InternalModelEditorParser.g:1970:2: (
				// rule__Access__FieldAssignment_3 )
				{
					before(grammarAccess.getAccessAccess().getFieldAssignment_3());
					// InternalModelEditorParser.g:1971:2: (
					// rule__Access__FieldAssignment_3 )
					// InternalModelEditorParser.g:1971:3:
					// rule__Access__FieldAssignment_3
					{
						pushFollow(FOLLOW_2);
						rule__Access__FieldAssignment_3();

						state._fsp--;

					}

					after(grammarAccess.getAccessAccess().getFieldAssignment_3());

				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Access__Group__3__Impl"

	// $ANTLR start "rule__Call__Group__0"
	// InternalModelEditorParser.g:1980:1: rule__Call__Group__0 :
	// rule__Call__Group__0__Impl rule__Call__Group__1 ;
	public final void rule__Call__Group__0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:1984:1: ( rule__Call__Group__0__Impl
			// rule__Call__Group__1 )
			// InternalModelEditorParser.g:1985:2: rule__Call__Group__0__Impl
			// rule__Call__Group__1
			{
				pushFollow(FOLLOW_29);
				rule__Call__Group__0__Impl();

				state._fsp--;

				pushFollow(FOLLOW_2);
				rule__Call__Group__1();

				state._fsp--;

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Call__Group__0"

	// $ANTLR start "rule__Call__Group__0__Impl"
	// InternalModelEditorParser.g:1992:1: rule__Call__Group__0__Impl : ( (
	// rule__Call__CallsAssignment_0 ) ) ;
	public final void rule__Call__Group__0__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:1996:1: ( ( (
			// rule__Call__CallsAssignment_0 ) ) )
			// InternalModelEditorParser.g:1997:1: ( (
			// rule__Call__CallsAssignment_0 ) )
			{
				// InternalModelEditorParser.g:1997:1: ( (
				// rule__Call__CallsAssignment_0 ) )
				// InternalModelEditorParser.g:1998:2: (
				// rule__Call__CallsAssignment_0 )
				{
					before(grammarAccess.getCallAccess().getCallsAssignment_0());
					// InternalModelEditorParser.g:1999:2: (
					// rule__Call__CallsAssignment_0 )
					// InternalModelEditorParser.g:1999:3:
					// rule__Call__CallsAssignment_0
					{
						pushFollow(FOLLOW_2);
						rule__Call__CallsAssignment_0();

						state._fsp--;

					}

					after(grammarAccess.getCallAccess().getCallsAssignment_0());

				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Call__Group__0__Impl"

	// $ANTLR start "rule__Call__Group__1"
	// InternalModelEditorParser.g:2007:1: rule__Call__Group__1 :
	// rule__Call__Group__1__Impl rule__Call__Group__2 ;
	public final void rule__Call__Group__1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:2011:1: ( rule__Call__Group__1__Impl
			// rule__Call__Group__2 )
			// InternalModelEditorParser.g:2012:2: rule__Call__Group__1__Impl
			// rule__Call__Group__2
			{
				pushFollow(FOLLOW_28);
				rule__Call__Group__1__Impl();

				state._fsp--;

				pushFollow(FOLLOW_2);
				rule__Call__Group__2();

				state._fsp--;

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Call__Group__1"

	// $ANTLR start "rule__Call__Group__1__Impl"
	// InternalModelEditorParser.g:2019:1: rule__Call__Group__1__Impl : ( (
	// rule__Call__Alternatives_1 ) ) ;
	public final void rule__Call__Group__1__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:2023:1: ( ( (
			// rule__Call__Alternatives_1 ) ) )
			// InternalModelEditorParser.g:2024:1: ( (
			// rule__Call__Alternatives_1 ) )
			{
				// InternalModelEditorParser.g:2024:1: ( (
				// rule__Call__Alternatives_1 ) )
				// InternalModelEditorParser.g:2025:2: (
				// rule__Call__Alternatives_1 )
				{
					before(grammarAccess.getCallAccess().getAlternatives_1());
					// InternalModelEditorParser.g:2026:2: (
					// rule__Call__Alternatives_1 )
					// InternalModelEditorParser.g:2026:3:
					// rule__Call__Alternatives_1
					{
						pushFollow(FOLLOW_2);
						rule__Call__Alternatives_1();

						state._fsp--;

					}

					after(grammarAccess.getCallAccess().getAlternatives_1());

				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Call__Group__1__Impl"

	// $ANTLR start "rule__Call__Group__2"
	// InternalModelEditorParser.g:2034:1: rule__Call__Group__2 :
	// rule__Call__Group__2__Impl rule__Call__Group__3 ;
	public final void rule__Call__Group__2() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:2038:1: ( rule__Call__Group__2__Impl
			// rule__Call__Group__3 )
			// InternalModelEditorParser.g:2039:2: rule__Call__Group__2__Impl
			// rule__Call__Group__3
			{
				pushFollow(FOLLOW_6);
				rule__Call__Group__2__Impl();

				state._fsp--;

				pushFollow(FOLLOW_2);
				rule__Call__Group__3();

				state._fsp--;

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Call__Group__2"

	// $ANTLR start "rule__Call__Group__2__Impl"
	// InternalModelEditorParser.g:2046:1: rule__Call__Group__2__Impl : ( To ) ;
	public final void rule__Call__Group__2__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:2050:1: ( ( To ) )
			// InternalModelEditorParser.g:2051:1: ( To )
			{
				// InternalModelEditorParser.g:2051:1: ( To )
				// InternalModelEditorParser.g:2052:2: To
				{
					before(grammarAccess.getCallAccess().getToKeyword_2());
					match(input, To, FOLLOW_2);
					after(grammarAccess.getCallAccess().getToKeyword_2());

				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Call__Group__2__Impl"

	// $ANTLR start "rule__Call__Group__3"
	// InternalModelEditorParser.g:2061:1: rule__Call__Group__3 :
	// rule__Call__Group__3__Impl rule__Call__Group__4 ;
	public final void rule__Call__Group__3() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:2065:1: ( rule__Call__Group__3__Impl
			// rule__Call__Group__4 )
			// InternalModelEditorParser.g:2066:2: rule__Call__Group__3__Impl
			// rule__Call__Group__4
			{
				pushFollow(FOLLOW_16);
				rule__Call__Group__3__Impl();

				state._fsp--;

				pushFollow(FOLLOW_2);
				rule__Call__Group__4();

				state._fsp--;

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Call__Group__3"

	// $ANTLR start "rule__Call__Group__3__Impl"
	// InternalModelEditorParser.g:2073:1: rule__Call__Group__3__Impl : ( (
	// rule__Call__MethodAssignment_3 ) ) ;
	public final void rule__Call__Group__3__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:2077:1: ( ( (
			// rule__Call__MethodAssignment_3 ) ) )
			// InternalModelEditorParser.g:2078:1: ( (
			// rule__Call__MethodAssignment_3 ) )
			{
				// InternalModelEditorParser.g:2078:1: ( (
				// rule__Call__MethodAssignment_3 ) )
				// InternalModelEditorParser.g:2079:2: (
				// rule__Call__MethodAssignment_3 )
				{
					before(grammarAccess.getCallAccess().getMethodAssignment_3());
					// InternalModelEditorParser.g:2080:2: (
					// rule__Call__MethodAssignment_3 )
					// InternalModelEditorParser.g:2080:3:
					// rule__Call__MethodAssignment_3
					{
						pushFollow(FOLLOW_2);
						rule__Call__MethodAssignment_3();

						state._fsp--;

					}

					after(grammarAccess.getCallAccess().getMethodAssignment_3());

				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Call__Group__3__Impl"

	// $ANTLR start "rule__Call__Group__4"
	// InternalModelEditorParser.g:2088:1: rule__Call__Group__4 :
	// rule__Call__Group__4__Impl rule__Call__Group__5 ;
	public final void rule__Call__Group__4() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:2092:1: ( rule__Call__Group__4__Impl
			// rule__Call__Group__5 )
			// InternalModelEditorParser.g:2093:2: rule__Call__Group__4__Impl
			// rule__Call__Group__5
			{
				pushFollow(FOLLOW_30);
				rule__Call__Group__4__Impl();

				state._fsp--;

				pushFollow(FOLLOW_2);
				rule__Call__Group__5();

				state._fsp--;

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Call__Group__4"

	// $ANTLR start "rule__Call__Group__4__Impl"
	// InternalModelEditorParser.g:2100:1: rule__Call__Group__4__Impl : (
	// LeftParenthesis ) ;
	public final void rule__Call__Group__4__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:2104:1: ( ( LeftParenthesis ) )
			// InternalModelEditorParser.g:2105:1: ( LeftParenthesis )
			{
				// InternalModelEditorParser.g:2105:1: ( LeftParenthesis )
				// InternalModelEditorParser.g:2106:2: LeftParenthesis
				{
					before(grammarAccess.getCallAccess().getLeftParenthesisKeyword_4());
					match(input, LeftParenthesis, FOLLOW_2);
					after(grammarAccess.getCallAccess().getLeftParenthesisKeyword_4());

				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Call__Group__4__Impl"

	// $ANTLR start "rule__Call__Group__5"
	// InternalModelEditorParser.g:2115:1: rule__Call__Group__5 :
	// rule__Call__Group__5__Impl ;
	public final void rule__Call__Group__5() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:2119:1: ( rule__Call__Group__5__Impl
			// )
			// InternalModelEditorParser.g:2120:2: rule__Call__Group__5__Impl
			{
				pushFollow(FOLLOW_2);
				rule__Call__Group__5__Impl();

				state._fsp--;

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Call__Group__5"

	// $ANTLR start "rule__Call__Group__5__Impl"
	// InternalModelEditorParser.g:2126:1: rule__Call__Group__5__Impl : (
	// RightParenthesis ) ;
	public final void rule__Call__Group__5__Impl() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:2130:1: ( ( RightParenthesis ) )
			// InternalModelEditorParser.g:2131:1: ( RightParenthesis )
			{
				// InternalModelEditorParser.g:2131:1: ( RightParenthesis )
				// InternalModelEditorParser.g:2132:2: RightParenthesis
				{
					before(grammarAccess.getCallAccess().getRightParenthesisKeyword_5());
					match(input, RightParenthesis, FOLLOW_2);
					after(grammarAccess.getCallAccess().getRightParenthesisKeyword_5());

				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Call__Group__5__Impl"

	// $ANTLR start "rule__Model__ImportsAssignment_0"
	// InternalModelEditorParser.g:2142:1: rule__Model__ImportsAssignment_0 : (
	// ruleImport ) ;
	public final void rule__Model__ImportsAssignment_0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:2146:1: ( ( ruleImport ) )
			// InternalModelEditorParser.g:2147:2: ( ruleImport )
			{
				// InternalModelEditorParser.g:2147:2: ( ruleImport )
				// InternalModelEditorParser.g:2148:3: ruleImport
				{
					before(grammarAccess.getModelAccess().getImportsImportParserRuleCall_0_0());
					pushFollow(FOLLOW_2);
					ruleImport();

					state._fsp--;

					after(grammarAccess.getModelAccess().getImportsImportParserRuleCall_0_0());

				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Model__ImportsAssignment_0"

	// $ANTLR start "rule__Model__ClassesAssignment_1"
	// InternalModelEditorParser.g:2157:1: rule__Model__ClassesAssignment_1 : (
	// ruleClass ) ;
	public final void rule__Model__ClassesAssignment_1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:2161:1: ( ( ruleClass ) )
			// InternalModelEditorParser.g:2162:2: ( ruleClass )
			{
				// InternalModelEditorParser.g:2162:2: ( ruleClass )
				// InternalModelEditorParser.g:2163:3: ruleClass
				{
					before(grammarAccess.getModelAccess().getClassesClassParserRuleCall_1_0());
					pushFollow(FOLLOW_2);
					ruleClass();

					state._fsp--;

					after(grammarAccess.getModelAccess().getClassesClassParserRuleCall_1_0());

				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Model__ClassesAssignment_1"

	// $ANTLR start "rule__Import__ImportedNamespaceAssignment_1"
	// InternalModelEditorParser.g:2172:1:
	// rule__Import__ImportedNamespaceAssignment_1 : (
	// ruleQualifiedNameWithWildcard ) ;
	public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:2176:1: ( (
			// ruleQualifiedNameWithWildcard ) )
			// InternalModelEditorParser.g:2177:2: (
			// ruleQualifiedNameWithWildcard )
			{
				// InternalModelEditorParser.g:2177:2: (
				// ruleQualifiedNameWithWildcard )
				// InternalModelEditorParser.g:2178:3:
				// ruleQualifiedNameWithWildcard
				{
					before(grammarAccess.getImportAccess()
							.getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0());
					pushFollow(FOLLOW_2);
					ruleQualifiedNameWithWildcard();

					state._fsp--;

					after(grammarAccess.getImportAccess()
							.getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0());

				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Import__ImportedNamespaceAssignment_1"

	// $ANTLR start "rule__Class__ModifierAssignment_0"
	// InternalModelEditorParser.g:2187:1: rule__Class__ModifierAssignment_0 : (
	// ruleClassModifier ) ;
	public final void rule__Class__ModifierAssignment_0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:2191:1: ( ( ruleClassModifier ) )
			// InternalModelEditorParser.g:2192:2: ( ruleClassModifier )
			{
				// InternalModelEditorParser.g:2192:2: ( ruleClassModifier )
				// InternalModelEditorParser.g:2193:3: ruleClassModifier
				{
					before(grammarAccess.getClassAccess().getModifierClassModifierParserRuleCall_0_0());
					pushFollow(FOLLOW_2);
					ruleClassModifier();

					state._fsp--;

					after(grammarAccess.getClassAccess().getModifierClassModifierParserRuleCall_0_0());

				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Class__ModifierAssignment_0"

	// $ANTLR start "rule__Class__NameAssignment_2"
	// InternalModelEditorParser.g:2202:1: rule__Class__NameAssignment_2 : (
	// RULE_ID ) ;
	public final void rule__Class__NameAssignment_2() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:2206:1: ( ( RULE_ID ) )
			// InternalModelEditorParser.g:2207:2: ( RULE_ID )
			{
				// InternalModelEditorParser.g:2207:2: ( RULE_ID )
				// InternalModelEditorParser.g:2208:3: RULE_ID
				{
					before(grammarAccess.getClassAccess().getNameIDTerminalRuleCall_2_0());
					match(input, RULE_ID, FOLLOW_2);
					after(grammarAccess.getClassAccess().getNameIDTerminalRuleCall_2_0());

				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Class__NameAssignment_2"

	// $ANTLR start "rule__Class__SuperTypeAssignment_3_1"
	// InternalModelEditorParser.g:2217:1: rule__Class__SuperTypeAssignment_3_1
	// : ( ( ruleQualifiedName ) ) ;
	public final void rule__Class__SuperTypeAssignment_3_1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:2221:1: ( ( ( ruleQualifiedName ) ) )
			// InternalModelEditorParser.g:2222:2: ( ( ruleQualifiedName ) )
			{
				// InternalModelEditorParser.g:2222:2: ( ( ruleQualifiedName ) )
				// InternalModelEditorParser.g:2223:3: ( ruleQualifiedName )
				{
					before(grammarAccess.getClassAccess().getSuperTypeClassCrossReference_3_1_0());
					// InternalModelEditorParser.g:2224:3: ( ruleQualifiedName )
					// InternalModelEditorParser.g:2225:4: ruleQualifiedName
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

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Class__SuperTypeAssignment_3_1"

	// $ANTLR start "rule__Class__FieldsAssignment_4_1"
	// InternalModelEditorParser.g:2236:1: rule__Class__FieldsAssignment_4_1 : (
	// ruleField ) ;
	public final void rule__Class__FieldsAssignment_4_1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:2240:1: ( ( ruleField ) )
			// InternalModelEditorParser.g:2241:2: ( ruleField )
			{
				// InternalModelEditorParser.g:2241:2: ( ruleField )
				// InternalModelEditorParser.g:2242:3: ruleField
				{
					before(grammarAccess.getClassAccess().getFieldsFieldParserRuleCall_4_1_0());
					pushFollow(FOLLOW_2);
					ruleField();

					state._fsp--;

					after(grammarAccess.getClassAccess().getFieldsFieldParserRuleCall_4_1_0());

				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Class__FieldsAssignment_4_1"

	// $ANTLR start "rule__Class__MethodsAssignment_4_2"
	// InternalModelEditorParser.g:2251:1: rule__Class__MethodsAssignment_4_2 :
	// ( ruleMethod ) ;
	public final void rule__Class__MethodsAssignment_4_2() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:2255:1: ( ( ruleMethod ) )
			// InternalModelEditorParser.g:2256:2: ( ruleMethod )
			{
				// InternalModelEditorParser.g:2256:2: ( ruleMethod )
				// InternalModelEditorParser.g:2257:3: ruleMethod
				{
					before(grammarAccess.getClassAccess().getMethodsMethodParserRuleCall_4_2_0());
					pushFollow(FOLLOW_2);
					ruleMethod();

					state._fsp--;

					after(grammarAccess.getClassAccess().getMethodsMethodParserRuleCall_4_2_0());

				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Class__MethodsAssignment_4_2"

	// $ANTLR start "rule__Field__ModifierAssignment_0"
	// InternalModelEditorParser.g:2266:1: rule__Field__ModifierAssignment_0 : (
	// ruleMemberModifier ) ;
	public final void rule__Field__ModifierAssignment_0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:2270:1: ( ( ruleMemberModifier ) )
			// InternalModelEditorParser.g:2271:2: ( ruleMemberModifier )
			{
				// InternalModelEditorParser.g:2271:2: ( ruleMemberModifier )
				// InternalModelEditorParser.g:2272:3: ruleMemberModifier
				{
					before(grammarAccess.getFieldAccess().getModifierMemberModifierParserRuleCall_0_0());
					pushFollow(FOLLOW_2);
					ruleMemberModifier();

					state._fsp--;

					after(grammarAccess.getFieldAccess().getModifierMemberModifierParserRuleCall_0_0());

				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Field__ModifierAssignment_0"

	// $ANTLR start "rule__Field__NameAssignment_1"
	// InternalModelEditorParser.g:2281:1: rule__Field__NameAssignment_1 : (
	// RULE_ID ) ;
	public final void rule__Field__NameAssignment_1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:2285:1: ( ( RULE_ID ) )
			// InternalModelEditorParser.g:2286:2: ( RULE_ID )
			{
				// InternalModelEditorParser.g:2286:2: ( RULE_ID )
				// InternalModelEditorParser.g:2287:3: RULE_ID
				{
					before(grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_1_0());
					match(input, RULE_ID, FOLLOW_2);
					after(grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_1_0());

				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Field__NameAssignment_1"

	// $ANTLR start "rule__Field__TypeAssignment_2_1"
	// InternalModelEditorParser.g:2296:1: rule__Field__TypeAssignment_2_1 : ( (
	// ruleQualifiedName ) ) ;
	public final void rule__Field__TypeAssignment_2_1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:2300:1: ( ( ( ruleQualifiedName ) ) )
			// InternalModelEditorParser.g:2301:2: ( ( ruleQualifiedName ) )
			{
				// InternalModelEditorParser.g:2301:2: ( ( ruleQualifiedName ) )
				// InternalModelEditorParser.g:2302:3: ( ruleQualifiedName )
				{
					before(grammarAccess.getFieldAccess().getTypeClassCrossReference_2_1_0());
					// InternalModelEditorParser.g:2303:3: ( ruleQualifiedName )
					// InternalModelEditorParser.g:2304:4: ruleQualifiedName
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

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Field__TypeAssignment_2_1"

	// $ANTLR start "rule__Method__ModifierAssignment_0"
	// InternalModelEditorParser.g:2315:1: rule__Method__ModifierAssignment_0 :
	// ( ruleMemberModifier ) ;
	public final void rule__Method__ModifierAssignment_0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:2319:1: ( ( ruleMemberModifier ) )
			// InternalModelEditorParser.g:2320:2: ( ruleMemberModifier )
			{
				// InternalModelEditorParser.g:2320:2: ( ruleMemberModifier )
				// InternalModelEditorParser.g:2321:3: ruleMemberModifier
				{
					before(grammarAccess.getMethodAccess().getModifierMemberModifierParserRuleCall_0_0());
					pushFollow(FOLLOW_2);
					ruleMemberModifier();

					state._fsp--;

					after(grammarAccess.getMethodAccess().getModifierMemberModifierParserRuleCall_0_0());

				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Method__ModifierAssignment_0"

	// $ANTLR start "rule__Method__NameAssignment_1"
	// InternalModelEditorParser.g:2330:1: rule__Method__NameAssignment_1 : (
	// RULE_ID ) ;
	public final void rule__Method__NameAssignment_1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:2334:1: ( ( RULE_ID ) )
			// InternalModelEditorParser.g:2335:2: ( RULE_ID )
			{
				// InternalModelEditorParser.g:2335:2: ( RULE_ID )
				// InternalModelEditorParser.g:2336:3: RULE_ID
				{
					before(grammarAccess.getMethodAccess().getNameIDTerminalRuleCall_1_0());
					match(input, RULE_ID, FOLLOW_2);
					after(grammarAccess.getMethodAccess().getNameIDTerminalRuleCall_1_0());

				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Method__NameAssignment_1"

	// $ANTLR start "rule__Method__TypesAssignment_3_0"
	// InternalModelEditorParser.g:2345:1: rule__Method__TypesAssignment_3_0 : (
	// ( ruleQualifiedName ) ) ;
	public final void rule__Method__TypesAssignment_3_0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:2349:1: ( ( ( ruleQualifiedName ) ) )
			// InternalModelEditorParser.g:2350:2: ( ( ruleQualifiedName ) )
			{
				// InternalModelEditorParser.g:2350:2: ( ( ruleQualifiedName ) )
				// InternalModelEditorParser.g:2351:3: ( ruleQualifiedName )
				{
					before(grammarAccess.getMethodAccess().getTypesClassCrossReference_3_0_0());
					// InternalModelEditorParser.g:2352:3: ( ruleQualifiedName )
					// InternalModelEditorParser.g:2353:4: ruleQualifiedName
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

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Method__TypesAssignment_3_0"

	// $ANTLR start "rule__Method__TypesAssignment_3_1_1"
	// InternalModelEditorParser.g:2364:1: rule__Method__TypesAssignment_3_1_1 :
	// ( ( ruleQualifiedName ) ) ;
	public final void rule__Method__TypesAssignment_3_1_1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:2368:1: ( ( ( ruleQualifiedName ) ) )
			// InternalModelEditorParser.g:2369:2: ( ( ruleQualifiedName ) )
			{
				// InternalModelEditorParser.g:2369:2: ( ( ruleQualifiedName ) )
				// InternalModelEditorParser.g:2370:3: ( ruleQualifiedName )
				{
					before(grammarAccess.getMethodAccess().getTypesClassCrossReference_3_1_1_0());
					// InternalModelEditorParser.g:2371:3: ( ruleQualifiedName )
					// InternalModelEditorParser.g:2372:4: ruleQualifiedName
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

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Method__TypesAssignment_3_1_1"

	// $ANTLR start "rule__Method__TypeAssignment_5_1"
	// InternalModelEditorParser.g:2383:1: rule__Method__TypeAssignment_5_1 : (
	// ( ruleQualifiedName ) ) ;
	public final void rule__Method__TypeAssignment_5_1() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:2387:1: ( ( ( ruleQualifiedName ) ) )
			// InternalModelEditorParser.g:2388:2: ( ( ruleQualifiedName ) )
			{
				// InternalModelEditorParser.g:2388:2: ( ( ruleQualifiedName ) )
				// InternalModelEditorParser.g:2389:3: ( ruleQualifiedName )
				{
					before(grammarAccess.getMethodAccess().getTypeClassCrossReference_5_1_0());
					// InternalModelEditorParser.g:2390:3: ( ruleQualifiedName )
					// InternalModelEditorParser.g:2391:4: ruleQualifiedName
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

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Method__TypeAssignment_5_1"

	// $ANTLR start "rule__Method__LocAssignment_6_1_0"
	// InternalModelEditorParser.g:2402:1: rule__Method__LocAssignment_6_1_0 : (
	// RULE_INT ) ;
	public final void rule__Method__LocAssignment_6_1_0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:2406:1: ( ( RULE_INT ) )
			// InternalModelEditorParser.g:2407:2: ( RULE_INT )
			{
				// InternalModelEditorParser.g:2407:2: ( RULE_INT )
				// InternalModelEditorParser.g:2408:3: RULE_INT
				{
					before(grammarAccess.getMethodAccess().getLocINTTerminalRuleCall_6_1_0_0());
					match(input, RULE_INT, FOLLOW_2);
					after(grammarAccess.getMethodAccess().getLocINTTerminalRuleCall_6_1_0_0());

				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Method__LocAssignment_6_1_0"

	// $ANTLR start "rule__Method__CycloAssignment_6_2_0"
	// InternalModelEditorParser.g:2417:1: rule__Method__CycloAssignment_6_2_0 :
	// ( RULE_INT ) ;
	public final void rule__Method__CycloAssignment_6_2_0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:2421:1: ( ( RULE_INT ) )
			// InternalModelEditorParser.g:2422:2: ( RULE_INT )
			{
				// InternalModelEditorParser.g:2422:2: ( RULE_INT )
				// InternalModelEditorParser.g:2423:3: RULE_INT
				{
					before(grammarAccess.getMethodAccess().getCycloINTTerminalRuleCall_6_2_0_0());
					match(input, RULE_INT, FOLLOW_2);
					after(grammarAccess.getMethodAccess().getCycloINTTerminalRuleCall_6_2_0_0());

				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Method__CycloAssignment_6_2_0"

	// $ANTLR start "rule__Method__AccessesAssignment_6_3"
	// InternalModelEditorParser.g:2432:1: rule__Method__AccessesAssignment_6_3
	// : ( ruleAccess ) ;
	public final void rule__Method__AccessesAssignment_6_3() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:2436:1: ( ( ruleAccess ) )
			// InternalModelEditorParser.g:2437:2: ( ruleAccess )
			{
				// InternalModelEditorParser.g:2437:2: ( ruleAccess )
				// InternalModelEditorParser.g:2438:3: ruleAccess
				{
					before(grammarAccess.getMethodAccess().getAccessesAccessParserRuleCall_6_3_0());
					pushFollow(FOLLOW_2);
					ruleAccess();

					state._fsp--;

					after(grammarAccess.getMethodAccess().getAccessesAccessParserRuleCall_6_3_0());

				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Method__AccessesAssignment_6_3"

	// $ANTLR start "rule__Method__CallsAssignment_6_4"
	// InternalModelEditorParser.g:2447:1: rule__Method__CallsAssignment_6_4 : (
	// ruleCall ) ;
	public final void rule__Method__CallsAssignment_6_4() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:2451:1: ( ( ruleCall ) )
			// InternalModelEditorParser.g:2452:2: ( ruleCall )
			{
				// InternalModelEditorParser.g:2452:2: ( ruleCall )
				// InternalModelEditorParser.g:2453:3: ruleCall
				{
					before(grammarAccess.getMethodAccess().getCallsCallParserRuleCall_6_4_0());
					pushFollow(FOLLOW_2);
					ruleCall();

					state._fsp--;

					after(grammarAccess.getMethodAccess().getCallsCallParserRuleCall_6_4_0());

				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Method__CallsAssignment_6_4"

	// $ANTLR start "rule__Access__AccessesAssignment_0"
	// InternalModelEditorParser.g:2462:1: rule__Access__AccessesAssignment_0 :
	// ( RULE_INT ) ;
	public final void rule__Access__AccessesAssignment_0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:2466:1: ( ( RULE_INT ) )
			// InternalModelEditorParser.g:2467:2: ( RULE_INT )
			{
				// InternalModelEditorParser.g:2467:2: ( RULE_INT )
				// InternalModelEditorParser.g:2468:3: RULE_INT
				{
					before(grammarAccess.getAccessAccess().getAccessesINTTerminalRuleCall_0_0());
					match(input, RULE_INT, FOLLOW_2);
					after(grammarAccess.getAccessAccess().getAccessesINTTerminalRuleCall_0_0());

				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Access__AccessesAssignment_0"

	// $ANTLR start "rule__Access__FieldAssignment_3"
	// InternalModelEditorParser.g:2477:1: rule__Access__FieldAssignment_3 : ( (
	// ruleQualifiedName ) ) ;
	public final void rule__Access__FieldAssignment_3() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:2481:1: ( ( ( ruleQualifiedName ) ) )
			// InternalModelEditorParser.g:2482:2: ( ( ruleQualifiedName ) )
			{
				// InternalModelEditorParser.g:2482:2: ( ( ruleQualifiedName ) )
				// InternalModelEditorParser.g:2483:3: ( ruleQualifiedName )
				{
					before(grammarAccess.getAccessAccess().getFieldFieldCrossReference_3_0());
					// InternalModelEditorParser.g:2484:3: ( ruleQualifiedName )
					// InternalModelEditorParser.g:2485:4: ruleQualifiedName
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

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Access__FieldAssignment_3"

	// $ANTLR start "rule__Call__CallsAssignment_0"
	// InternalModelEditorParser.g:2496:1: rule__Call__CallsAssignment_0 : (
	// RULE_INT ) ;
	public final void rule__Call__CallsAssignment_0() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:2500:1: ( ( RULE_INT ) )
			// InternalModelEditorParser.g:2501:2: ( RULE_INT )
			{
				// InternalModelEditorParser.g:2501:2: ( RULE_INT )
				// InternalModelEditorParser.g:2502:3: RULE_INT
				{
					before(grammarAccess.getCallAccess().getCallsINTTerminalRuleCall_0_0());
					match(input, RULE_INT, FOLLOW_2);
					after(grammarAccess.getCallAccess().getCallsINTTerminalRuleCall_0_0());

				}

			}

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Call__CallsAssignment_0"

	// $ANTLR start "rule__Call__MethodAssignment_3"
	// InternalModelEditorParser.g:2511:1: rule__Call__MethodAssignment_3 : ( (
	// ruleQualifiedName ) ) ;
	public final void rule__Call__MethodAssignment_3() throws RecognitionException {

		int stackSize = keepStackSize();

		try {
			// InternalModelEditorParser.g:2515:1: ( ( ( ruleQualifiedName ) ) )
			// InternalModelEditorParser.g:2516:2: ( ( ruleQualifiedName ) )
			{
				// InternalModelEditorParser.g:2516:2: ( ( ruleQualifiedName ) )
				// InternalModelEditorParser.g:2517:3: ( ruleQualifiedName )
				{
					before(grammarAccess.getCallAccess().getMethodMethodCrossReference_3_0());
					// InternalModelEditorParser.g:2518:3: ( ruleQualifiedName )
					// InternalModelEditorParser.g:2519:4: ruleQualifiedName
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

		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
		} finally {

			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Call__MethodAssignment_3"

	// Delegated rules

	public static final BitSet FOLLOW_1 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_2 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_3 = new BitSet(new long[] { 0x0000000000002940L });
	public static final BitSet FOLLOW_4 = new BitSet(new long[] { 0x0000000000000402L });
	public static final BitSet FOLLOW_5 = new BitSet(new long[] { 0x0000000000002942L });
	public static final BitSet FOLLOW_6 = new BitSet(new long[] { 0x0000000050000000L });
	public static final BitSet FOLLOW_7 = new BitSet(new long[] { 0x0000000000040000L });
	public static final BitSet FOLLOW_8 = new BitSet(new long[] { 0x0000000041000000L });
	public static final BitSet FOLLOW_9 = new BitSet(new long[] { 0x0000000041000002L });
	public static final BitSet FOLLOW_10 = new BitSet(new long[] { 0x0000000010000000L });
	public static final BitSet FOLLOW_11 = new BitSet(new long[] { 0x0000000004000080L });
	public static final BitSet FOLLOW_12 = new BitSet(new long[] { 0x0000000018000950L });
	public static final BitSet FOLLOW_13 = new BitSet(new long[] { 0x0000000010000952L });
	public static final BitSet FOLLOW_14 = new BitSet(new long[] { 0x0000000010000950L });
	public static final BitSet FOLLOW_15 = new BitSet(new long[] { 0x0000000002000000L });
	public static final BitSet FOLLOW_16 = new BitSet(new long[] { 0x0000000000200000L });
	public static final BitSet FOLLOW_17 = new BitSet(new long[] { 0x0000000050400000L });
	public static final BitSet FOLLOW_18 = new BitSet(new long[] { 0x0000000006000000L });
	public static final BitSet FOLLOW_19 = new BitSet(new long[] { 0x0000000000800000L });
	public static final BitSet FOLLOW_20 = new BitSet(new long[] { 0x0000000000800002L });
	public static final BitSet FOLLOW_21 = new BitSet(new long[] { 0x0000000028000000L });
	public static final BitSet FOLLOW_22 = new BitSet(new long[] { 0x0000000020000002L });
	public static final BitSet FOLLOW_23 = new BitSet(new long[] { 0x0000000000008000L });
	public static final BitSet FOLLOW_24 = new BitSet(new long[] { 0x0000000000080000L });
	public static final BitSet FOLLOW_25 = new BitSet(new long[] { 0x0000000000020000L });
	public static final BitSet FOLLOW_26 = new BitSet(new long[] { 0x0000000000004000L });
	public static final BitSet FOLLOW_27 = new BitSet(new long[] { 0x0000000000000220L });
	public static final BitSet FOLLOW_28 = new BitSet(new long[] { 0x0000000000100000L });
	public static final BitSet FOLLOW_29 = new BitSet(new long[] { 0x0000000000011000L });
	public static final BitSet FOLLOW_30 = new BitSet(new long[] { 0x0000000000400000L });

}