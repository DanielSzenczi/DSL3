/*
 * generated by Xtext 2.25.0
 */
package dk.sdu.mmmi.mdsd.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
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
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class MathGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class MathExpElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "dk.sdu.mmmi.mdsd.Math.MathExp");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cProgramKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cProgNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cProgNameIDTerminalRuleCall_1_0 = (RuleCall)cProgNameAssignment_1.eContents().get(0);
		private final Assignment cExtAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cExtExtParserRuleCall_2_0 = (RuleCall)cExtAssignment_2.eContents().get(0);
		private final Assignment cVariablesAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cVariablesVarBindingParserRuleCall_3_0 = (RuleCall)cVariablesAssignment_3.eContents().get(0);
		
		//MathExp:
		//    "program" progName=ID
		//    ext += Ext*
		//    variables += VarBinding*
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//"program" progName=ID
		//ext += Ext*
		//variables += VarBinding*
		public Group getGroup() { return cGroup; }
		
		//"program"
		public Keyword getProgramKeyword_0() { return cProgramKeyword_0; }
		
		//progName=ID
		public Assignment getProgNameAssignment_1() { return cProgNameAssignment_1; }
		
		//ID
		public RuleCall getProgNameIDTerminalRuleCall_1_0() { return cProgNameIDTerminalRuleCall_1_0; }
		
		//ext += Ext*
		public Assignment getExtAssignment_2() { return cExtAssignment_2; }
		
		//Ext
		public RuleCall getExtExtParserRuleCall_2_0() { return cExtExtParserRuleCall_2_0; }
		
		//variables += VarBinding*
		public Assignment getVariablesAssignment_3() { return cVariablesAssignment_3; }
		
		//VarBinding
		public RuleCall getVariablesVarBindingParserRuleCall_3_0() { return cVariablesVarBindingParserRuleCall_3_0; }
	}
	public class VarBindingElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "dk.sdu.mmmi.mdsd.Math.VarBinding");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cVarKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cEqualsSignKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cExpressionAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final Alternatives cExpressionAlternatives_3_0 = (Alternatives)cExpressionAssignment_3.eContents().get(0);
		private final RuleCall cExpressionExpParserRuleCall_3_0_0 = (RuleCall)cExpressionAlternatives_3_0.eContents().get(0);
		private final RuleCall cExpressionVarExtParserRuleCall_3_0_1 = (RuleCall)cExpressionAlternatives_3_0.eContents().get(1);
		
		//VarBinding:
		//    'var' name=ID '=' expression=(Exp | VarExt)
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'var' name=ID '=' expression=(Exp | VarExt)
		public Group getGroup() { return cGroup; }
		
		//'var'
		public Keyword getVarKeyword_0() { return cVarKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'='
		public Keyword getEqualsSignKeyword_2() { return cEqualsSignKeyword_2; }
		
		//expression=(Exp | VarExt)
		public Assignment getExpressionAssignment_3() { return cExpressionAssignment_3; }
		
		//(Exp | VarExt)
		public Alternatives getExpressionAlternatives_3_0() { return cExpressionAlternatives_3_0; }
		
		//Exp
		public RuleCall getExpressionExpParserRuleCall_3_0_0() { return cExpressionExpParserRuleCall_3_0_0; }
		
		//VarExt
		public RuleCall getExpressionVarExtParserRuleCall_3_0_1() { return cExpressionVarExtParserRuleCall_3_0_1; }
	}
	public class VarExtElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "dk.sdu.mmmi.mdsd.Math.VarExt");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Assignment cLinkAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cLinkLinkParserRuleCall_1_0 = (RuleCall)cLinkAssignment_1.eContents().get(0);
		
		//VarExt:
		//    name=ID link=Link
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID link=Link
		public Group getGroup() { return cGroup; }
		
		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }
		
		//link=Link
		public Assignment getLinkAssignment_1() { return cLinkAssignment_1; }
		
		//Link
		public RuleCall getLinkLinkParserRuleCall_1_0() { return cLinkLinkParserRuleCall_1_0; }
	}
	public class LinkElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "dk.sdu.mmmi.mdsd.Math.Link");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cMethodRefsParserRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//Link:
		//    '(' MethodRefs ')'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'(' MethodRefs ')'
		public Group getGroup() { return cGroup; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_0() { return cLeftParenthesisKeyword_0; }
		
		//MethodRefs
		public RuleCall getMethodRefsParserRuleCall_1() { return cMethodRefsParserRuleCall_1; }
		
		//')'
		public Keyword getRightParenthesisKeyword_2() { return cRightParenthesisKeyword_2; }
	}
	public class MethodRefsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "dk.sdu.mmmi.mdsd.Math.MethodRefs");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cMethodRefsAction_0 = (Action)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Assignment cRefAssignment_1_0 = (Assignment)cGroup_1.eContents().get(0);
		private final RuleCall cRefRefParserRuleCall_1_0_0 = (RuleCall)cRefAssignment_1_0.eContents().get(0);
		private final Keyword cCommaKeyword_1_1 = (Keyword)cGroup_1.eContents().get(1);
		
		//MethodRefs:
		//    {MethodRefs} (ref+=Ref ','?)*
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//{MethodRefs} (ref+=Ref ','?)*
		public Group getGroup() { return cGroup; }
		
		//{MethodRefs}
		public Action getMethodRefsAction_0() { return cMethodRefsAction_0; }
		
		//(ref+=Ref ','?)*
		public Group getGroup_1() { return cGroup_1; }
		
		//ref+=Ref
		public Assignment getRefAssignment_1_0() { return cRefAssignment_1_0; }
		
		//Ref
		public RuleCall getRefRefParserRuleCall_1_0_0() { return cRefRefParserRuleCall_1_0_0; }
		
		//','?
		public Keyword getCommaKeyword_1_1() { return cCommaKeyword_1_1; }
	}
	public class RefElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "dk.sdu.mmmi.mdsd.Math.Ref");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Assignment cRefAssignment_0 = (Assignment)cAlternatives.eContents().get(0);
		private final CrossReference cRefBindingCrossReference_0_0 = (CrossReference)cRefAssignment_0.eContents().get(0);
		private final RuleCall cRefBindingIDTerminalRuleCall_0_0_1 = (RuleCall)cRefBindingCrossReference_0_0.eContents().get(1);
		private final Assignment cIntAssignment_1 = (Assignment)cAlternatives.eContents().get(1);
		private final RuleCall cIntINTTerminalRuleCall_1_0 = (RuleCall)cIntAssignment_1.eContents().get(0);
		
		//Ref:
		//    ref=[Binding] | int=INT
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//ref=[Binding] | int=INT
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//ref=[Binding]
		public Assignment getRefAssignment_0() { return cRefAssignment_0; }
		
		//[Binding]
		public CrossReference getRefBindingCrossReference_0_0() { return cRefBindingCrossReference_0_0; }
		
		//ID
		public RuleCall getRefBindingIDTerminalRuleCall_0_0_1() { return cRefBindingIDTerminalRuleCall_0_0_1; }
		
		//int=INT
		public Assignment getIntAssignment_1() { return cIntAssignment_1; }
		
		//INT
		public RuleCall getIntINTTerminalRuleCall_1_0() { return cIntINTTerminalRuleCall_1_0; }
	}
	public class ExtElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "dk.sdu.mmmi.mdsd.Math.Ext");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cExternalKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameMethodNameParserRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//Ext:
		//    "external" name=MethodName?
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//"external" name=MethodName?
		public Group getGroup() { return cGroup; }
		
		//"external"
		public Keyword getExternalKeyword_0() { return cExternalKeyword_0; }
		
		//name=MethodName?
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//MethodName
		public RuleCall getNameMethodNameParserRuleCall_1_0() { return cNameMethodNameParserRuleCall_1_0; }
	}
	public class MethodNameElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "dk.sdu.mmmi.mdsd.Math.MethodName");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Assignment cSigAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cSigMethodSignatureParserRuleCall_1_0 = (RuleCall)cSigAssignment_1.eContents().get(0);
		
		//MethodName:
		//    name=ID sig=MethodSignature
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID sig=MethodSignature
		public Group getGroup() { return cGroup; }
		
		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }
		
		//sig=MethodSignature
		public Assignment getSigAssignment_1() { return cSigAssignment_1; }
		
		//MethodSignature
		public RuleCall getSigMethodSignatureParserRuleCall_1_0() { return cSigMethodSignatureParserRuleCall_1_0; }
	}
	public class MethodSignatureElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "dk.sdu.mmmi.mdsd.Math.MethodSignature");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cArgsParserRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//MethodSignature:
		//    '(' Args ')'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'(' Args ')'
		public Group getGroup() { return cGroup; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_0() { return cLeftParenthesisKeyword_0; }
		
		//Args
		public RuleCall getArgsParserRuleCall_1() { return cArgsParserRuleCall_1; }
		
		//')'
		public Keyword getRightParenthesisKeyword_2() { return cRightParenthesisKeyword_2; }
	}
	public class ArgsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "dk.sdu.mmmi.mdsd.Math.Args");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cArgsAction_0 = (Action)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_1_0 = (Assignment)cGroup_1.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_1_0_0 = (RuleCall)cNameAssignment_1_0.eContents().get(0);
		private final Keyword cCommaKeyword_1_1 = (Keyword)cGroup_1.eContents().get(1);
		
		//Args:
		//    {Args} (name+=ID ','?)*
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//{Args} (name+=ID ','?)*
		public Group getGroup() { return cGroup; }
		
		//{Args}
		public Action getArgsAction_0() { return cArgsAction_0; }
		
		//(name+=ID ','?)*
		public Group getGroup_1() { return cGroup_1; }
		
		//name+=ID
		public Assignment getNameAssignment_1_0() { return cNameAssignment_1_0; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0_0() { return cNameIDTerminalRuleCall_1_0_0; }
		
		//','?
		public Keyword getCommaKeyword_1_1() { return cCommaKeyword_1_1; }
	}
	public class ExpElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "dk.sdu.mmmi.mdsd.Math.Exp");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cFactorParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Alternatives cAlternatives_1_0 = (Alternatives)cGroup_1.eContents().get(0);
		private final Group cGroup_1_0_0 = (Group)cAlternatives_1_0.eContents().get(0);
		private final Action cPlusLeftAction_1_0_0_0 = (Action)cGroup_1_0_0.eContents().get(0);
		private final Keyword cPlusSignKeyword_1_0_0_1 = (Keyword)cGroup_1_0_0.eContents().get(1);
		private final Group cGroup_1_0_1 = (Group)cAlternatives_1_0.eContents().get(1);
		private final Action cMinusLeftAction_1_0_1_0 = (Action)cGroup_1_0_1.eContents().get(0);
		private final Keyword cHyphenMinusKeyword_1_0_1_1 = (Keyword)cGroup_1_0_1.eContents().get(1);
		private final Assignment cRightAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cRightFactorParserRuleCall_1_1_0 = (RuleCall)cRightAssignment_1_1.eContents().get(0);
		
		//Exp returns Expression:
		//    Factor (( {Plus.left=current} '+' | {Minus.left=current}  '-' ) right=Factor)*
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//Factor (( {Plus.left=current} '+' | {Minus.left=current}  '-' ) right=Factor)*
		public Group getGroup() { return cGroup; }
		
		//Factor
		public RuleCall getFactorParserRuleCall_0() { return cFactorParserRuleCall_0; }
		
		//(( {Plus.left=current} '+' | {Minus.left=current}  '-' ) right=Factor)*
		public Group getGroup_1() { return cGroup_1; }
		
		//( {Plus.left=current} '+' | {Minus.left=current}  '-' )
		public Alternatives getAlternatives_1_0() { return cAlternatives_1_0; }
		
		//{Plus.left=current} '+'
		public Group getGroup_1_0_0() { return cGroup_1_0_0; }
		
		//{Plus.left=current}
		public Action getPlusLeftAction_1_0_0_0() { return cPlusLeftAction_1_0_0_0; }
		
		//'+'
		public Keyword getPlusSignKeyword_1_0_0_1() { return cPlusSignKeyword_1_0_0_1; }
		
		//{Minus.left=current}  '-'
		public Group getGroup_1_0_1() { return cGroup_1_0_1; }
		
		//{Minus.left=current}
		public Action getMinusLeftAction_1_0_1_0() { return cMinusLeftAction_1_0_1_0; }
		
		//'-'
		public Keyword getHyphenMinusKeyword_1_0_1_1() { return cHyphenMinusKeyword_1_0_1_1; }
		
		//right=Factor
		public Assignment getRightAssignment_1_1() { return cRightAssignment_1_1; }
		
		//Factor
		public RuleCall getRightFactorParserRuleCall_1_1_0() { return cRightFactorParserRuleCall_1_1_0; }
	}
	public class FactorElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "dk.sdu.mmmi.mdsd.Math.Factor");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cPrimaryParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Alternatives cAlternatives_1_0 = (Alternatives)cGroup_1.eContents().get(0);
		private final Group cGroup_1_0_0 = (Group)cAlternatives_1_0.eContents().get(0);
		private final Action cMultLeftAction_1_0_0_0 = (Action)cGroup_1_0_0.eContents().get(0);
		private final Keyword cAsteriskKeyword_1_0_0_1 = (Keyword)cGroup_1_0_0.eContents().get(1);
		private final Group cGroup_1_0_1 = (Group)cAlternatives_1_0.eContents().get(1);
		private final Action cDivLeftAction_1_0_1_0 = (Action)cGroup_1_0_1.eContents().get(0);
		private final Keyword cSolidusKeyword_1_0_1_1 = (Keyword)cGroup_1_0_1.eContents().get(1);
		private final Assignment cRightAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cRightPrimaryParserRuleCall_1_1_0 = (RuleCall)cRightAssignment_1_1.eContents().get(0);
		
		//Factor returns Expression:
		//    Primary (({Mult.left=current} '*' | {Div.left=current}  '/'  ) right=Primary)*
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//Primary (({Mult.left=current} '*' | {Div.left=current}  '/'  ) right=Primary)*
		public Group getGroup() { return cGroup; }
		
		//Primary
		public RuleCall getPrimaryParserRuleCall_0() { return cPrimaryParserRuleCall_0; }
		
		//(({Mult.left=current} '*' | {Div.left=current}  '/'  ) right=Primary)*
		public Group getGroup_1() { return cGroup_1; }
		
		//({Mult.left=current} '*' | {Div.left=current}  '/'  )
		public Alternatives getAlternatives_1_0() { return cAlternatives_1_0; }
		
		//{Mult.left=current} '*'
		public Group getGroup_1_0_0() { return cGroup_1_0_0; }
		
		//{Mult.left=current}
		public Action getMultLeftAction_1_0_0_0() { return cMultLeftAction_1_0_0_0; }
		
		//'*'
		public Keyword getAsteriskKeyword_1_0_0_1() { return cAsteriskKeyword_1_0_0_1; }
		
		//{Div.left=current}  '/'
		public Group getGroup_1_0_1() { return cGroup_1_0_1; }
		
		//{Div.left=current}
		public Action getDivLeftAction_1_0_1_0() { return cDivLeftAction_1_0_1_0; }
		
		//'/'
		public Keyword getSolidusKeyword_1_0_1_1() { return cSolidusKeyword_1_0_1_1; }
		
		//right=Primary
		public Assignment getRightAssignment_1_1() { return cRightAssignment_1_1; }
		
		//Primary
		public RuleCall getRightPrimaryParserRuleCall_1_1_0() { return cRightPrimaryParserRuleCall_1_1_0; }
	}
	public class PrimaryElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "dk.sdu.mmmi.mdsd.Math.Primary");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Action cMathNumberAction_0_0 = (Action)cGroup_0.eContents().get(0);
		private final Assignment cValueAssignment_0_1 = (Assignment)cGroup_0.eContents().get(1);
		private final RuleCall cValueINTTerminalRuleCall_0_1_0 = (RuleCall)cValueAssignment_0_1.eContents().get(0);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Action cParanthesesAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Assignment cPAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cPParanthesesParserRuleCall_1_1_0 = (RuleCall)cPAssignment_1_1.eContents().get(0);
		private final RuleCall cVariableUseParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cLetBindingParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		
		//Primary returns Expression:
		//    {MathNumber} value=INT  |  {Parantheses} p=Parantheses |  VariableUse | LetBinding
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//{MathNumber} value=INT  |  {Parantheses} p=Parantheses |  VariableUse | LetBinding
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//{MathNumber} value=INT
		public Group getGroup_0() { return cGroup_0; }
		
		//{MathNumber}
		public Action getMathNumberAction_0_0() { return cMathNumberAction_0_0; }
		
		//value=INT
		public Assignment getValueAssignment_0_1() { return cValueAssignment_0_1; }
		
		//INT
		public RuleCall getValueINTTerminalRuleCall_0_1_0() { return cValueINTTerminalRuleCall_0_1_0; }
		
		//{Parantheses} p=Parantheses
		public Group getGroup_1() { return cGroup_1; }
		
		//{Parantheses}
		public Action getParanthesesAction_1_0() { return cParanthesesAction_1_0; }
		
		//p=Parantheses
		public Assignment getPAssignment_1_1() { return cPAssignment_1_1; }
		
		//Parantheses
		public RuleCall getPParanthesesParserRuleCall_1_1_0() { return cPParanthesesParserRuleCall_1_1_0; }
		
		//VariableUse
		public RuleCall getVariableUseParserRuleCall_2() { return cVariableUseParserRuleCall_2; }
		
		//LetBinding
		public RuleCall getLetBindingParserRuleCall_3() { return cLetBindingParserRuleCall_3; }
	}
	public class ParanthesesElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "dk.sdu.mmmi.mdsd.Math.Parantheses");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cExpParserRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//Parantheses returns Expression:
		//     '(' Exp ')'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'(' Exp ')'
		public Group getGroup() { return cGroup; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_0() { return cLeftParenthesisKeyword_0; }
		
		//Exp
		public RuleCall getExpParserRuleCall_1() { return cExpParserRuleCall_1; }
		
		//')'
		public Keyword getRightParenthesisKeyword_2() { return cRightParenthesisKeyword_2; }
	}
	public class LetBindingElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "dk.sdu.mmmi.mdsd.Math.LetBinding");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLetKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cEqualsSignKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cBindingAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cBindingExpParserRuleCall_3_0 = (RuleCall)cBindingAssignment_3.eContents().get(0);
		private final Keyword cInKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cBodyAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cBodyExpParserRuleCall_5_0 = (RuleCall)cBodyAssignment_5.eContents().get(0);
		private final Keyword cEndKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//LetBinding:
		//    'let' name=ID '=' binding=Exp 'in' body=Exp 'end'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'let' name=ID '=' binding=Exp 'in' body=Exp 'end'
		public Group getGroup() { return cGroup; }
		
		//'let'
		public Keyword getLetKeyword_0() { return cLetKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'='
		public Keyword getEqualsSignKeyword_2() { return cEqualsSignKeyword_2; }
		
		//binding=Exp
		public Assignment getBindingAssignment_3() { return cBindingAssignment_3; }
		
		//Exp
		public RuleCall getBindingExpParserRuleCall_3_0() { return cBindingExpParserRuleCall_3_0; }
		
		//'in'
		public Keyword getInKeyword_4() { return cInKeyword_4; }
		
		//body=Exp
		public Assignment getBodyAssignment_5() { return cBodyAssignment_5; }
		
		//Exp
		public RuleCall getBodyExpParserRuleCall_5_0() { return cBodyExpParserRuleCall_5_0; }
		
		//'end'
		public Keyword getEndKeyword_6() { return cEndKeyword_6; }
	}
	public class BindingElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "dk.sdu.mmmi.mdsd.Math.Binding");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cVarBindingParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cLetBindingParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//Binding:
		//    VarBinding | LetBinding
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//VarBinding | LetBinding
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//VarBinding
		public RuleCall getVarBindingParserRuleCall_0() { return cVarBindingParserRuleCall_0; }
		
		//LetBinding
		public RuleCall getLetBindingParserRuleCall_1() { return cLetBindingParserRuleCall_1; }
	}
	public class VariableUseElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "dk.sdu.mmmi.mdsd.Math.VariableUse");
		private final Assignment cRefAssignment = (Assignment)rule.eContents().get(1);
		private final CrossReference cRefBindingCrossReference_0 = (CrossReference)cRefAssignment.eContents().get(0);
		private final RuleCall cRefBindingIDTerminalRuleCall_0_1 = (RuleCall)cRefBindingCrossReference_0.eContents().get(1);
		
		//VariableUse:
		//    ref = [Binding]
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//ref = [Binding]
		public Assignment getRefAssignment() { return cRefAssignment; }
		
		//[Binding]
		public CrossReference getRefBindingCrossReference_0() { return cRefBindingCrossReference_0; }
		
		//ID
		public RuleCall getRefBindingIDTerminalRuleCall_0_1() { return cRefBindingIDTerminalRuleCall_0_1; }
	}
	
	
	private final MathExpElements pMathExp;
	private final VarBindingElements pVarBinding;
	private final VarExtElements pVarExt;
	private final LinkElements pLink;
	private final MethodRefsElements pMethodRefs;
	private final RefElements pRef;
	private final ExtElements pExt;
	private final MethodNameElements pMethodName;
	private final MethodSignatureElements pMethodSignature;
	private final ArgsElements pArgs;
	private final ExpElements pExp;
	private final FactorElements pFactor;
	private final PrimaryElements pPrimary;
	private final ParanthesesElements pParantheses;
	private final LetBindingElements pLetBinding;
	private final BindingElements pBinding;
	private final VariableUseElements pVariableUse;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public MathGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pMathExp = new MathExpElements();
		this.pVarBinding = new VarBindingElements();
		this.pVarExt = new VarExtElements();
		this.pLink = new LinkElements();
		this.pMethodRefs = new MethodRefsElements();
		this.pRef = new RefElements();
		this.pExt = new ExtElements();
		this.pMethodName = new MethodNameElements();
		this.pMethodSignature = new MethodSignatureElements();
		this.pArgs = new ArgsElements();
		this.pExp = new ExpElements();
		this.pFactor = new FactorElements();
		this.pPrimary = new PrimaryElements();
		this.pParantheses = new ParanthesesElements();
		this.pLetBinding = new LetBindingElements();
		this.pBinding = new BindingElements();
		this.pVariableUse = new VariableUseElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("dk.sdu.mmmi.mdsd.Math".equals(grammar.getName())) {
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

	
	//MathExp:
	//    "program" progName=ID
	//    ext += Ext*
	//    variables += VarBinding*
	//;
	public MathExpElements getMathExpAccess() {
		return pMathExp;
	}
	
	public ParserRule getMathExpRule() {
		return getMathExpAccess().getRule();
	}
	
	//VarBinding:
	//    'var' name=ID '=' expression=(Exp | VarExt)
	//;
	public VarBindingElements getVarBindingAccess() {
		return pVarBinding;
	}
	
	public ParserRule getVarBindingRule() {
		return getVarBindingAccess().getRule();
	}
	
	//VarExt:
	//    name=ID link=Link
	//;
	public VarExtElements getVarExtAccess() {
		return pVarExt;
	}
	
	public ParserRule getVarExtRule() {
		return getVarExtAccess().getRule();
	}
	
	//Link:
	//    '(' MethodRefs ')'
	//;
	public LinkElements getLinkAccess() {
		return pLink;
	}
	
	public ParserRule getLinkRule() {
		return getLinkAccess().getRule();
	}
	
	//MethodRefs:
	//    {MethodRefs} (ref+=Ref ','?)*
	//;
	public MethodRefsElements getMethodRefsAccess() {
		return pMethodRefs;
	}
	
	public ParserRule getMethodRefsRule() {
		return getMethodRefsAccess().getRule();
	}
	
	//Ref:
	//    ref=[Binding] | int=INT
	//;
	public RefElements getRefAccess() {
		return pRef;
	}
	
	public ParserRule getRefRule() {
		return getRefAccess().getRule();
	}
	
	//Ext:
	//    "external" name=MethodName?
	//;
	public ExtElements getExtAccess() {
		return pExt;
	}
	
	public ParserRule getExtRule() {
		return getExtAccess().getRule();
	}
	
	//MethodName:
	//    name=ID sig=MethodSignature
	//;
	public MethodNameElements getMethodNameAccess() {
		return pMethodName;
	}
	
	public ParserRule getMethodNameRule() {
		return getMethodNameAccess().getRule();
	}
	
	//MethodSignature:
	//    '(' Args ')'
	//;
	public MethodSignatureElements getMethodSignatureAccess() {
		return pMethodSignature;
	}
	
	public ParserRule getMethodSignatureRule() {
		return getMethodSignatureAccess().getRule();
	}
	
	//Args:
	//    {Args} (name+=ID ','?)*
	//;
	public ArgsElements getArgsAccess() {
		return pArgs;
	}
	
	public ParserRule getArgsRule() {
		return getArgsAccess().getRule();
	}
	
	//Exp returns Expression:
	//    Factor (( {Plus.left=current} '+' | {Minus.left=current}  '-' ) right=Factor)*
	//;
	public ExpElements getExpAccess() {
		return pExp;
	}
	
	public ParserRule getExpRule() {
		return getExpAccess().getRule();
	}
	
	//Factor returns Expression:
	//    Primary (({Mult.left=current} '*' | {Div.left=current}  '/'  ) right=Primary)*
	//;
	public FactorElements getFactorAccess() {
		return pFactor;
	}
	
	public ParserRule getFactorRule() {
		return getFactorAccess().getRule();
	}
	
	//Primary returns Expression:
	//    {MathNumber} value=INT  |  {Parantheses} p=Parantheses |  VariableUse | LetBinding
	//;
	public PrimaryElements getPrimaryAccess() {
		return pPrimary;
	}
	
	public ParserRule getPrimaryRule() {
		return getPrimaryAccess().getRule();
	}
	
	//Parantheses returns Expression:
	//     '(' Exp ')'
	//;
	public ParanthesesElements getParanthesesAccess() {
		return pParantheses;
	}
	
	public ParserRule getParanthesesRule() {
		return getParanthesesAccess().getRule();
	}
	
	//LetBinding:
	//    'let' name=ID '=' binding=Exp 'in' body=Exp 'end'
	//;
	public LetBindingElements getLetBindingAccess() {
		return pLetBinding;
	}
	
	public ParserRule getLetBindingRule() {
		return getLetBindingAccess().getRule();
	}
	
	//Binding:
	//    VarBinding | LetBinding
	//;
	public BindingElements getBindingAccess() {
		return pBinding;
	}
	
	public ParserRule getBindingRule() {
		return getBindingAccess().getRule();
	}
	
	//VariableUse:
	//    ref = [Binding]
	//;
	public VariableUseElements getVariableUseAccess() {
		return pVariableUse;
	}
	
	public ParserRule getVariableUseRule() {
		return getVariableUseAccess().getRule();
	}
	
	//terminal ID: '^'?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt: ('0'..'9')+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//            '"' ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|'"') )* '"' |
	//            "'" ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|"'") )* "'"
	//        ;
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT : '/*' -> '*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT : '//' !('\n'|'\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS         : (' '|'\t'|'\r'|'\n')+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER: .;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
