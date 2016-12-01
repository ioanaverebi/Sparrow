/*
 * generated by Xtext 2.10.0
 */
package org.refactor.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class ModelEditorGrammarAccess extends AbstractGrammarElementFinder {
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.refactor.ModelEditor.Model");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cImportsAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cImportsImportParserRuleCall_0_0 = (RuleCall)cImportsAssignment_0.eContents().get(0);
		private final Assignment cClassesAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cClassesClassParserRuleCall_1_0 = (RuleCall)cClassesAssignment_1.eContents().get(0);
		
		//Model:
		//	imports+=Import*
		//	classes+=Class*;
		@Override public ParserRule getRule() { return rule; }
		
		//imports+=Import* classes+=Class*
		public Group getGroup() { return cGroup; }
		
		//imports+=Import*
		public Assignment getImportsAssignment_0() { return cImportsAssignment_0; }
		
		//Import
		public RuleCall getImportsImportParserRuleCall_0_0() { return cImportsImportParserRuleCall_0_0; }
		
		//classes+=Class*
		public Assignment getClassesAssignment_1() { return cClassesAssignment_1; }
		
		//Class
		public RuleCall getClassesClassParserRuleCall_1_0() { return cClassesClassParserRuleCall_1_0; }
	}
	public class ImportElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.refactor.ModelEditor.Import");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cImportKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cImportedNamespaceAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0 = (RuleCall)cImportedNamespaceAssignment_1.eContents().get(0);
		
		//Import:
		//	'import' importedNamespace=QualifiedNameWithWildcard;
		@Override public ParserRule getRule() { return rule; }
		
		//'import' importedNamespace=QualifiedNameWithWildcard
		public Group getGroup() { return cGroup; }
		
		//'import'
		public Keyword getImportKeyword_0() { return cImportKeyword_0; }
		
		//importedNamespace=QualifiedNameWithWildcard
		public Assignment getImportedNamespaceAssignment_1() { return cImportedNamespaceAssignment_1; }
		
		//QualifiedNameWithWildcard
		public RuleCall getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0() { return cImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0; }
	}
	public class QualifiedNameWithWildcardElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.refactor.ModelEditor.QualifiedNameWithWildcard");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cQualifiedNameParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Keyword cFullStopAsteriskKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		//QualifiedNameWithWildcard:
		//	QualifiedName '.*'?;
		@Override public ParserRule getRule() { return rule; }
		
		//QualifiedName '.*'?
		public Group getGroup() { return cGroup; }
		
		//QualifiedName
		public RuleCall getQualifiedNameParserRuleCall_0() { return cQualifiedNameParserRuleCall_0; }
		
		//'.*'?
		public Keyword getFullStopAsteriskKeyword_1() { return cFullStopAsteriskKeyword_1; }
	}
	public class QualifiedNameElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.refactor.ModelEditor.QualifiedName");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cFullStopKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		
		//QualifiedName:
		//	ID ('.' ID)*;
		@Override public ParserRule getRule() { return rule; }
		
		//ID ('.' ID)*
		public Group getGroup() { return cGroup; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_0() { return cIDTerminalRuleCall_0; }
		
		//('.' ID)*
		public Group getGroup_1() { return cGroup_1; }
		
		//'.'
		public Keyword getFullStopKeyword_1_0() { return cFullStopKeyword_1_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_1_1() { return cIDTerminalRuleCall_1_1; }
	}
	public class ClassElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.refactor.ModelEditor.Class");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cModifierAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cModifierClassModifierParserRuleCall_0_0 = (RuleCall)cModifierAssignment_0.eContents().get(0);
		private final Keyword cClassKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cExtendsKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cSuperTypeAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final CrossReference cSuperTypeClassCrossReference_3_1_0 = (CrossReference)cSuperTypeAssignment_3_1.eContents().get(0);
		private final RuleCall cSuperTypeClassQualifiedNameParserRuleCall_3_1_0_1 = (RuleCall)cSuperTypeClassCrossReference_3_1_0.eContents().get(1);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final RuleCall cBEGINTerminalRuleCall_4_0 = (RuleCall)cGroup_4.eContents().get(0);
		private final Assignment cFieldsAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cFieldsFieldParserRuleCall_4_1_0 = (RuleCall)cFieldsAssignment_4_1.eContents().get(0);
		private final Assignment cMethodsAssignment_4_2 = (Assignment)cGroup_4.eContents().get(2);
		private final RuleCall cMethodsMethodParserRuleCall_4_2_0 = (RuleCall)cMethodsAssignment_4_2.eContents().get(0);
		private final RuleCall cENDTerminalRuleCall_4_3 = (RuleCall)cGroup_4.eContents().get(3);
		
		//Class:
		//	modifier=ClassModifier? 'class' name=ID ('extends' superType=[Class|QualifiedName])? (BEGIN
		//	fields+=Field*
		//	methods+=Method*
		//	END)?;
		@Override public ParserRule getRule() { return rule; }
		
		//modifier=ClassModifier? 'class' name=ID ('extends' superType=[Class|QualifiedName])? (BEGIN fields+=Field*
		//methods+=Method* END)?
		public Group getGroup() { return cGroup; }
		
		//modifier=ClassModifier?
		public Assignment getModifierAssignment_0() { return cModifierAssignment_0; }
		
		//ClassModifier
		public RuleCall getModifierClassModifierParserRuleCall_0_0() { return cModifierClassModifierParserRuleCall_0_0; }
		
		//'class'
		public Keyword getClassKeyword_1() { return cClassKeyword_1; }
		
		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }
		
		//('extends' superType=[Class|QualifiedName])?
		public Group getGroup_3() { return cGroup_3; }
		
		//'extends'
		public Keyword getExtendsKeyword_3_0() { return cExtendsKeyword_3_0; }
		
		//superType=[Class|QualifiedName]
		public Assignment getSuperTypeAssignment_3_1() { return cSuperTypeAssignment_3_1; }
		
		//[Class|QualifiedName]
		public CrossReference getSuperTypeClassCrossReference_3_1_0() { return cSuperTypeClassCrossReference_3_1_0; }
		
		//QualifiedName
		public RuleCall getSuperTypeClassQualifiedNameParserRuleCall_3_1_0_1() { return cSuperTypeClassQualifiedNameParserRuleCall_3_1_0_1; }
		
		//(BEGIN fields+=Field* methods+=Method* END)?
		public Group getGroup_4() { return cGroup_4; }
		
		//BEGIN
		public RuleCall getBEGINTerminalRuleCall_4_0() { return cBEGINTerminalRuleCall_4_0; }
		
		//fields+=Field*
		public Assignment getFieldsAssignment_4_1() { return cFieldsAssignment_4_1; }
		
		//Field
		public RuleCall getFieldsFieldParserRuleCall_4_1_0() { return cFieldsFieldParserRuleCall_4_1_0; }
		
		//methods+=Method*
		public Assignment getMethodsAssignment_4_2() { return cMethodsAssignment_4_2; }
		
		//Method
		public RuleCall getMethodsMethodParserRuleCall_4_2_0() { return cMethodsMethodParserRuleCall_4_2_0; }
		
		//END
		public RuleCall getENDTerminalRuleCall_4_3() { return cENDTerminalRuleCall_4_3; }
	}
	public class FieldElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.refactor.ModelEditor.Field");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cModifierAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cModifierMemberModifierParserRuleCall_0_0 = (RuleCall)cModifierAssignment_0.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cColonKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cTypeAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final CrossReference cTypeClassCrossReference_2_1_0 = (CrossReference)cTypeAssignment_2_1.eContents().get(0);
		private final RuleCall cTypeClassQualifiedNameParserRuleCall_2_1_0_1 = (RuleCall)cTypeClassCrossReference_2_1_0.eContents().get(1);
		
		//Field:
		//	modifier=MemberModifier? name=ID (':' type=[Class|QualifiedName])?;
		@Override public ParserRule getRule() { return rule; }
		
		//modifier=MemberModifier? name=ID (':' type=[Class|QualifiedName])?
		public Group getGroup() { return cGroup; }
		
		//modifier=MemberModifier?
		public Assignment getModifierAssignment_0() { return cModifierAssignment_0; }
		
		//MemberModifier
		public RuleCall getModifierMemberModifierParserRuleCall_0_0() { return cModifierMemberModifierParserRuleCall_0_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//(':' type=[Class|QualifiedName])?
		public Group getGroup_2() { return cGroup_2; }
		
		//':'
		public Keyword getColonKeyword_2_0() { return cColonKeyword_2_0; }
		
		//type=[Class|QualifiedName]
		public Assignment getTypeAssignment_2_1() { return cTypeAssignment_2_1; }
		
		//[Class|QualifiedName]
		public CrossReference getTypeClassCrossReference_2_1_0() { return cTypeClassCrossReference_2_1_0; }
		
		//QualifiedName
		public RuleCall getTypeClassQualifiedNameParserRuleCall_2_1_0_1() { return cTypeClassQualifiedNameParserRuleCall_2_1_0_1; }
	}
	public class MethodElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.refactor.ModelEditor.Method");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cModifierAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cModifierMemberModifierParserRuleCall_0_0 = (RuleCall)cModifierAssignment_0.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Assignment cTypesAssignment_3_0 = (Assignment)cGroup_3.eContents().get(0);
		private final CrossReference cTypesClassCrossReference_3_0_0 = (CrossReference)cTypesAssignment_3_0.eContents().get(0);
		private final RuleCall cTypesClassQualifiedNameParserRuleCall_3_0_0_1 = (RuleCall)cTypesClassCrossReference_3_0_0.eContents().get(1);
		private final Group cGroup_3_1 = (Group)cGroup_3.eContents().get(1);
		private final Keyword cCommaKeyword_3_1_0 = (Keyword)cGroup_3_1.eContents().get(0);
		private final Assignment cTypesAssignment_3_1_1 = (Assignment)cGroup_3_1.eContents().get(1);
		private final CrossReference cTypesClassCrossReference_3_1_1_0 = (CrossReference)cTypesAssignment_3_1_1.eContents().get(0);
		private final RuleCall cTypesClassQualifiedNameParserRuleCall_3_1_1_0_1 = (RuleCall)cTypesClassCrossReference_3_1_1_0.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cColonKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cTypeAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final CrossReference cTypeClassCrossReference_5_1_0 = (CrossReference)cTypeAssignment_5_1.eContents().get(0);
		private final RuleCall cTypeClassQualifiedNameParserRuleCall_5_1_0_1 = (RuleCall)cTypeClassCrossReference_5_1_0.eContents().get(1);
		private final Group cGroup_6 = (Group)cGroup.eContents().get(6);
		private final RuleCall cBEGINTerminalRuleCall_6_0 = (RuleCall)cGroup_6.eContents().get(0);
		private final Group cGroup_6_1 = (Group)cGroup_6.eContents().get(1);
		private final Assignment cLocAssignment_6_1_0 = (Assignment)cGroup_6_1.eContents().get(0);
		private final RuleCall cLocINTTerminalRuleCall_6_1_0_0 = (RuleCall)cLocAssignment_6_1_0.eContents().get(0);
		private final Keyword cLinesKeyword_6_1_1 = (Keyword)cGroup_6_1.eContents().get(1);
		private final Keyword cOfKeyword_6_1_2 = (Keyword)cGroup_6_1.eContents().get(2);
		private final Keyword cCodeKeyword_6_1_3 = (Keyword)cGroup_6_1.eContents().get(3);
		private final Group cGroup_6_2 = (Group)cGroup_6.eContents().get(2);
		private final Assignment cCycloAssignment_6_2_0 = (Assignment)cGroup_6_2.eContents().get(0);
		private final RuleCall cCycloINTTerminalRuleCall_6_2_0_0 = (RuleCall)cCycloAssignment_6_2_0.eContents().get(0);
		private final Keyword cCycloKeyword_6_2_1 = (Keyword)cGroup_6_2.eContents().get(1);
		private final Assignment cAccessesAssignment_6_3 = (Assignment)cGroup_6.eContents().get(3);
		private final RuleCall cAccessesAccessParserRuleCall_6_3_0 = (RuleCall)cAccessesAssignment_6_3.eContents().get(0);
		private final Assignment cCallsAssignment_6_4 = (Assignment)cGroup_6.eContents().get(4);
		private final RuleCall cCallsCallParserRuleCall_6_4_0 = (RuleCall)cCallsAssignment_6_4.eContents().get(0);
		private final RuleCall cENDTerminalRuleCall_6_5 = (RuleCall)cGroup_6.eContents().get(5);
		
		//Method:
		//	modifier=MemberModifier? name=ID '(' (types+=[Class|QualifiedName] (',' types+=[Class|QualifiedName])*)? ')' (':'
		//	type=[Class|QualifiedName])? (BEGIN (loc=INT 'lines' 'of' 'code')? (cyclo=INT 'cyclo')?
		//	accesses+=Access*
		//	calls+=Call*
		//	END)?;
		@Override public ParserRule getRule() { return rule; }
		
		//modifier=MemberModifier? name=ID '(' (types+=[Class|QualifiedName] (',' types+=[Class|QualifiedName])*)? ')' (':'
		//type=[Class|QualifiedName])? (BEGIN (loc=INT 'lines' 'of' 'code')? (cyclo=INT 'cyclo')? accesses+=Access* calls+=Call*
		//END)?
		public Group getGroup() { return cGroup; }
		
		//modifier=MemberModifier?
		public Assignment getModifierAssignment_0() { return cModifierAssignment_0; }
		
		//MemberModifier
		public RuleCall getModifierMemberModifierParserRuleCall_0_0() { return cModifierMemberModifierParserRuleCall_0_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_2() { return cLeftParenthesisKeyword_2; }
		
		//(types+=[Class|QualifiedName] (',' types+=[Class|QualifiedName])*)?
		public Group getGroup_3() { return cGroup_3; }
		
		//types+=[Class|QualifiedName]
		public Assignment getTypesAssignment_3_0() { return cTypesAssignment_3_0; }
		
		//[Class|QualifiedName]
		public CrossReference getTypesClassCrossReference_3_0_0() { return cTypesClassCrossReference_3_0_0; }
		
		//QualifiedName
		public RuleCall getTypesClassQualifiedNameParserRuleCall_3_0_0_1() { return cTypesClassQualifiedNameParserRuleCall_3_0_0_1; }
		
		//(',' types+=[Class|QualifiedName])*
		public Group getGroup_3_1() { return cGroup_3_1; }
		
		//','
		public Keyword getCommaKeyword_3_1_0() { return cCommaKeyword_3_1_0; }
		
		//types+=[Class|QualifiedName]
		public Assignment getTypesAssignment_3_1_1() { return cTypesAssignment_3_1_1; }
		
		//[Class|QualifiedName]
		public CrossReference getTypesClassCrossReference_3_1_1_0() { return cTypesClassCrossReference_3_1_1_0; }
		
		//QualifiedName
		public RuleCall getTypesClassQualifiedNameParserRuleCall_3_1_1_0_1() { return cTypesClassQualifiedNameParserRuleCall_3_1_1_0_1; }
		
		//')'
		public Keyword getRightParenthesisKeyword_4() { return cRightParenthesisKeyword_4; }
		
		//(':' type=[Class|QualifiedName])?
		public Group getGroup_5() { return cGroup_5; }
		
		//':'
		public Keyword getColonKeyword_5_0() { return cColonKeyword_5_0; }
		
		//type=[Class|QualifiedName]
		public Assignment getTypeAssignment_5_1() { return cTypeAssignment_5_1; }
		
		//[Class|QualifiedName]
		public CrossReference getTypeClassCrossReference_5_1_0() { return cTypeClassCrossReference_5_1_0; }
		
		//QualifiedName
		public RuleCall getTypeClassQualifiedNameParserRuleCall_5_1_0_1() { return cTypeClassQualifiedNameParserRuleCall_5_1_0_1; }
		
		//(BEGIN (loc=INT 'lines' 'of' 'code')? (cyclo=INT 'cyclo')? accesses+=Access* calls+=Call* END)?
		public Group getGroup_6() { return cGroup_6; }
		
		//BEGIN
		public RuleCall getBEGINTerminalRuleCall_6_0() { return cBEGINTerminalRuleCall_6_0; }
		
		//(loc=INT 'lines' 'of' 'code')?
		public Group getGroup_6_1() { return cGroup_6_1; }
		
		//loc=INT
		public Assignment getLocAssignment_6_1_0() { return cLocAssignment_6_1_0; }
		
		//INT
		public RuleCall getLocINTTerminalRuleCall_6_1_0_0() { return cLocINTTerminalRuleCall_6_1_0_0; }
		
		//'lines'
		public Keyword getLinesKeyword_6_1_1() { return cLinesKeyword_6_1_1; }
		
		//'of'
		public Keyword getOfKeyword_6_1_2() { return cOfKeyword_6_1_2; }
		
		//'code'
		public Keyword getCodeKeyword_6_1_3() { return cCodeKeyword_6_1_3; }
		
		//(cyclo=INT 'cyclo')?
		public Group getGroup_6_2() { return cGroup_6_2; }
		
		//cyclo=INT
		public Assignment getCycloAssignment_6_2_0() { return cCycloAssignment_6_2_0; }
		
		//INT
		public RuleCall getCycloINTTerminalRuleCall_6_2_0_0() { return cCycloINTTerminalRuleCall_6_2_0_0; }
		
		//'cyclo'
		public Keyword getCycloKeyword_6_2_1() { return cCycloKeyword_6_2_1; }
		
		//accesses+=Access*
		public Assignment getAccessesAssignment_6_3() { return cAccessesAssignment_6_3; }
		
		//Access
		public RuleCall getAccessesAccessParserRuleCall_6_3_0() { return cAccessesAccessParserRuleCall_6_3_0; }
		
		//calls+=Call*
		public Assignment getCallsAssignment_6_4() { return cCallsAssignment_6_4; }
		
		//Call
		public RuleCall getCallsCallParserRuleCall_6_4_0() { return cCallsCallParserRuleCall_6_4_0; }
		
		//END
		public RuleCall getENDTerminalRuleCall_6_5() { return cENDTerminalRuleCall_6_5; }
	}
	public class MemberModifierElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.refactor.ModelEditor.MemberModifier");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Keyword cPublicKeyword_0 = (Keyword)cAlternatives.eContents().get(0);
		private final Keyword cPrivateKeyword_1 = (Keyword)cAlternatives.eContents().get(1);
		private final Keyword cProtectedKeyword_2 = (Keyword)cAlternatives.eContents().get(2);
		private final Keyword cConstantKeyword_3 = (Keyword)cAlternatives.eContents().get(3);
		
		//MemberModifier:
		//	'public' | 'private' | 'protected' | 'constant';
		@Override public ParserRule getRule() { return rule; }
		
		//'public' | 'private' | 'protected' | 'constant'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//'public'
		public Keyword getPublicKeyword_0() { return cPublicKeyword_0; }
		
		//'private'
		public Keyword getPrivateKeyword_1() { return cPrivateKeyword_1; }
		
		//'protected'
		public Keyword getProtectedKeyword_2() { return cProtectedKeyword_2; }
		
		//'constant'
		public Keyword getConstantKeyword_3() { return cConstantKeyword_3; }
	}
	public class ClassModifierElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.refactor.ModelEditor.ClassModifier");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Keyword cPublicKeyword_0 = (Keyword)cAlternatives.eContents().get(0);
		private final Keyword cPrivateKeyword_1 = (Keyword)cAlternatives.eContents().get(1);
		private final Keyword cConstantKeyword_2 = (Keyword)cAlternatives.eContents().get(2);
		
		//ClassModifier:
		//	'public' | 'private' | 'constant';
		@Override public ParserRule getRule() { return rule; }
		
		//'public' | 'private' | 'constant'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//'public'
		public Keyword getPublicKeyword_0() { return cPublicKeyword_0; }
		
		//'private'
		public Keyword getPrivateKeyword_1() { return cPrivateKeyword_1; }
		
		//'constant'
		public Keyword getConstantKeyword_2() { return cConstantKeyword_2; }
	}
	public class AccessElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.refactor.ModelEditor.Access");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cAccessesAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cAccessesINTTerminalRuleCall_0_0 = (RuleCall)cAccessesAssignment_0.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final Keyword cAccessKeyword_1_0 = (Keyword)cAlternatives_1.eContents().get(0);
		private final Keyword cAccessesKeyword_1_1 = (Keyword)cAlternatives_1.eContents().get(1);
		private final Keyword cToKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cFieldAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cFieldFieldCrossReference_3_0 = (CrossReference)cFieldAssignment_3.eContents().get(0);
		private final RuleCall cFieldFieldQualifiedNameParserRuleCall_3_0_1 = (RuleCall)cFieldFieldCrossReference_3_0.eContents().get(1);
		
		//Access:
		//	accesses=INT ('access' | 'accesses') 'to' field=[Field|QualifiedName];
		@Override public ParserRule getRule() { return rule; }
		
		//accesses=INT ('access' | 'accesses') 'to' field=[Field|QualifiedName]
		public Group getGroup() { return cGroup; }
		
		//accesses=INT
		public Assignment getAccessesAssignment_0() { return cAccessesAssignment_0; }
		
		//INT
		public RuleCall getAccessesINTTerminalRuleCall_0_0() { return cAccessesINTTerminalRuleCall_0_0; }
		
		//('access' | 'accesses')
		public Alternatives getAlternatives_1() { return cAlternatives_1; }
		
		//'access'
		public Keyword getAccessKeyword_1_0() { return cAccessKeyword_1_0; }
		
		//'accesses'
		public Keyword getAccessesKeyword_1_1() { return cAccessesKeyword_1_1; }
		
		//'to'
		public Keyword getToKeyword_2() { return cToKeyword_2; }
		
		//field=[Field|QualifiedName]
		public Assignment getFieldAssignment_3() { return cFieldAssignment_3; }
		
		//[Field|QualifiedName]
		public CrossReference getFieldFieldCrossReference_3_0() { return cFieldFieldCrossReference_3_0; }
		
		//QualifiedName
		public RuleCall getFieldFieldQualifiedNameParserRuleCall_3_0_1() { return cFieldFieldQualifiedNameParserRuleCall_3_0_1; }
	}
	public class CallElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.refactor.ModelEditor.Call");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cCallsAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cCallsINTTerminalRuleCall_0_0 = (RuleCall)cCallsAssignment_0.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final Keyword cCallKeyword_1_0 = (Keyword)cAlternatives_1.eContents().get(0);
		private final Keyword cCallsKeyword_1_1 = (Keyword)cAlternatives_1.eContents().get(1);
		private final Keyword cToKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cMethodAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cMethodMethodCrossReference_3_0 = (CrossReference)cMethodAssignment_3.eContents().get(0);
		private final RuleCall cMethodMethodQualifiedNameParserRuleCall_3_0_1 = (RuleCall)cMethodMethodCrossReference_3_0.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Keyword cRightParenthesisKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//Call:
		//	calls=INT ('call' | 'calls') 'to' method=[Method|QualifiedName] '(' ')';
		@Override public ParserRule getRule() { return rule; }
		
		//calls=INT ('call' | 'calls') 'to' method=[Method|QualifiedName] '(' ')'
		public Group getGroup() { return cGroup; }
		
		//calls=INT
		public Assignment getCallsAssignment_0() { return cCallsAssignment_0; }
		
		//INT
		public RuleCall getCallsINTTerminalRuleCall_0_0() { return cCallsINTTerminalRuleCall_0_0; }
		
		//('call' | 'calls')
		public Alternatives getAlternatives_1() { return cAlternatives_1; }
		
		//'call'
		public Keyword getCallKeyword_1_0() { return cCallKeyword_1_0; }
		
		//'calls'
		public Keyword getCallsKeyword_1_1() { return cCallsKeyword_1_1; }
		
		//'to'
		public Keyword getToKeyword_2() { return cToKeyword_2; }
		
		//method=[Method|QualifiedName]
		public Assignment getMethodAssignment_3() { return cMethodAssignment_3; }
		
		//[Method|QualifiedName]
		public CrossReference getMethodMethodCrossReference_3_0() { return cMethodMethodCrossReference_3_0; }
		
		//QualifiedName
		public RuleCall getMethodMethodQualifiedNameParserRuleCall_3_0_1() { return cMethodMethodQualifiedNameParserRuleCall_3_0_1; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_4() { return cLeftParenthesisKeyword_4; }
		
		//')'
		public Keyword getRightParenthesisKeyword_5() { return cRightParenthesisKeyword_5; }
	}
	
	
	private final ModelElements pModel;
	private final ImportElements pImport;
	private final QualifiedNameWithWildcardElements pQualifiedNameWithWildcard;
	private final QualifiedNameElements pQualifiedName;
	private final ClassElements pClass;
	private final FieldElements pField;
	private final MethodElements pMethod;
	private final MemberModifierElements pMemberModifier;
	private final ClassModifierElements pClassModifier;
	private final AccessElements pAccess;
	private final CallElements pCall;
	private final TerminalRule tBEGIN;
	private final TerminalRule tEND;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public ModelEditorGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pModel = new ModelElements();
		this.pImport = new ImportElements();
		this.pQualifiedNameWithWildcard = new QualifiedNameWithWildcardElements();
		this.pQualifiedName = new QualifiedNameElements();
		this.pClass = new ClassElements();
		this.pField = new FieldElements();
		this.pMethod = new MethodElements();
		this.pMemberModifier = new MemberModifierElements();
		this.pClassModifier = new ClassModifierElements();
		this.pAccess = new AccessElements();
		this.pCall = new CallElements();
		this.tBEGIN = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.refactor.ModelEditor.BEGIN");
		this.tEND = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.refactor.ModelEditor.END");
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.refactor.ModelEditor".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Model:
	//	imports+=Import*
	//	classes+=Class*;
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}
	
	//Import:
	//	'import' importedNamespace=QualifiedNameWithWildcard;
	public ImportElements getImportAccess() {
		return pImport;
	}
	
	public ParserRule getImportRule() {
		return getImportAccess().getRule();
	}
	
	//QualifiedNameWithWildcard:
	//	QualifiedName '.*'?;
	public QualifiedNameWithWildcardElements getQualifiedNameWithWildcardAccess() {
		return pQualifiedNameWithWildcard;
	}
	
	public ParserRule getQualifiedNameWithWildcardRule() {
		return getQualifiedNameWithWildcardAccess().getRule();
	}
	
	//QualifiedName:
	//	ID ('.' ID)*;
	public QualifiedNameElements getQualifiedNameAccess() {
		return pQualifiedName;
	}
	
	public ParserRule getQualifiedNameRule() {
		return getQualifiedNameAccess().getRule();
	}
	
	//Class:
	//	modifier=ClassModifier? 'class' name=ID ('extends' superType=[Class|QualifiedName])? (BEGIN
	//	fields+=Field*
	//	methods+=Method*
	//	END)?;
	public ClassElements getClassAccess() {
		return pClass;
	}
	
	public ParserRule getClassRule() {
		return getClassAccess().getRule();
	}
	
	//Field:
	//	modifier=MemberModifier? name=ID (':' type=[Class|QualifiedName])?;
	public FieldElements getFieldAccess() {
		return pField;
	}
	
	public ParserRule getFieldRule() {
		return getFieldAccess().getRule();
	}
	
	//Method:
	//	modifier=MemberModifier? name=ID '(' (types+=[Class|QualifiedName] (',' types+=[Class|QualifiedName])*)? ')' (':'
	//	type=[Class|QualifiedName])? (BEGIN (loc=INT 'lines' 'of' 'code')? (cyclo=INT 'cyclo')?
	//	accesses+=Access*
	//	calls+=Call*
	//	END)?;
	public MethodElements getMethodAccess() {
		return pMethod;
	}
	
	public ParserRule getMethodRule() {
		return getMethodAccess().getRule();
	}
	
	//MemberModifier:
	//	'public' | 'private' | 'protected' | 'constant';
	public MemberModifierElements getMemberModifierAccess() {
		return pMemberModifier;
	}
	
	public ParserRule getMemberModifierRule() {
		return getMemberModifierAccess().getRule();
	}
	
	//ClassModifier:
	//	'public' | 'private' | 'constant';
	public ClassModifierElements getClassModifierAccess() {
		return pClassModifier;
	}
	
	public ParserRule getClassModifierRule() {
		return getClassModifierAccess().getRule();
	}
	
	//Access:
	//	accesses=INT ('access' | 'accesses') 'to' field=[Field|QualifiedName];
	public AccessElements getAccessAccess() {
		return pAccess;
	}
	
	public ParserRule getAccessRule() {
		return getAccessAccess().getRule();
	}
	
	//Call:
	//	calls=INT ('call' | 'calls') 'to' method=[Method|QualifiedName] '(' ')';
	public CallElements getCallAccess() {
		return pCall;
	}
	
	public ParserRule getCallRule() {
		return getCallAccess().getRule();
	}
	
	//terminal BEGIN:
	//	'synthetic:BEGIN';
	public TerminalRule getBEGINRule() {
		return tBEGIN;
	}
	
	//terminal END:
	//	'synthetic:END';
	public TerminalRule getENDRule() {
		return tEND;
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' |
	//	"'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/ *'->'* /';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
