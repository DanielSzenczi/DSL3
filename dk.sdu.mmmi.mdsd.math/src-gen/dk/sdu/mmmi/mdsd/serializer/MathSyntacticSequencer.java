/*
 * generated by Xtext 2.25.0
 */
package dk.sdu.mmmi.mdsd.serializer;

import com.google.inject.Inject;
import dk.sdu.mmmi.mdsd.services.MathGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class MathSyntacticSequencer extends AbstractSyntacticSequencer {

	protected MathGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Args_CommaKeyword_1_1_q;
	protected AbstractElementAlias match_MethodRefs_CommaKeyword_1_1_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (MathGrammarAccess) access;
		match_Args_CommaKeyword_1_1_q = new TokenAlias(false, true, grammarAccess.getArgsAccess().getCommaKeyword_1_1());
		match_MethodRefs_CommaKeyword_1_1_q = new TokenAlias(false, true, grammarAccess.getMethodRefsAccess().getCommaKeyword_1_1());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_Args_CommaKeyword_1_1_q.equals(syntax))
				emit_Args_CommaKeyword_1_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_MethodRefs_CommaKeyword_1_1_q.equals(syntax))
				emit_MethodRefs_CommaKeyword_1_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     name+=ID (ambiguity) ')' (rule end)
	 *     name+=ID (ambiguity) (rule end)
	 *     name+=ID (ambiguity) name+=ID
	 */
	protected void emit_Args_CommaKeyword_1_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     ref+=Ref (ambiguity) ')' (rule end)
	 *     ref+=Ref (ambiguity) (rule end)
	 *     ref+=Ref (ambiguity) ref+=Ref
	 */
	protected void emit_MethodRefs_CommaKeyword_1_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
