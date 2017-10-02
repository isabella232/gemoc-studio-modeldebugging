/*
 * generated by Xtext 2.10.0
 */
package org.eclipse.gemoc.ide.contentassist.antlr;

import com.google.inject.Inject;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.antlr.runtime.RecognitionException;
import org.eclipse.gemoc.ide.contentassist.antlr.internal.InternalDslParser;
import org.eclipse.gemoc.services.DslGrammarAccess;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

public class DslParser extends AbstractContentAssistParser {

	@Inject
	private DslGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalDslParser createParser() {
		InternalDslParser result = new InternalDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getDslAccess().getNameAlternatives_1_0(), "rule__Dsl__NameAlternatives_1_0");
					put(grammarAccess.getValueAccess().getAlternatives(), "rule__Value__Alternatives");
					put(grammarAccess.getDslAccess().getGroup(), "rule__Dsl__Group__0");
					put(grammarAccess.getSimpleValueAccess().getGroup(), "rule__SimpleValue__Group__0");
					put(grammarAccess.getSimpleValueAccess().getGroup_3(), "rule__SimpleValue__Group_3__0");
					put(grammarAccess.getCompositeValueAccess().getGroup(), "rule__CompositeValue__Group__0");
					put(grammarAccess.getDisplayNameAccess().getGroup(), "rule__DisplayName__Group__0");
					put(grammarAccess.getMetaprogAccess().getGroup(), "rule__Metaprog__Group__0");
					put(grammarAccess.getAbstractSyntaxAccess().getGroup(), "rule__AbstractSyntax__Group__0");
					put(grammarAccess.getSemanticAccess().getGroup(), "rule__Semantic__Group__0");
					put(grammarAccess.getDslAccess().getNameAssignment_1(), "rule__Dsl__NameAssignment_1");
					put(grammarAccess.getDslAccess().getDisplayNameAssignment_3(), "rule__Dsl__DisplayNameAssignment_3");
					put(grammarAccess.getDslAccess().getMetaprogAssignment_4(), "rule__Dsl__MetaprogAssignment_4");
					put(grammarAccess.getDslAccess().getAbstractSyntaxAssignment_5(), "rule__Dsl__AbstractSyntaxAssignment_5");
					put(grammarAccess.getDslAccess().getSemanticAssignment_6(), "rule__Dsl__SemanticAssignment_6");
					put(grammarAccess.getDslAccess().getValuesAssignment_7(), "rule__Dsl__ValuesAssignment_7");
					put(grammarAccess.getSimpleValueAccess().getNameAssignment_0(), "rule__SimpleValue__NameAssignment_0");
					put(grammarAccess.getSimpleValueAccess().getValuesAssignment_2(), "rule__SimpleValue__ValuesAssignment_2");
					put(grammarAccess.getSimpleValueAccess().getValuesAssignment_3_1(), "rule__SimpleValue__ValuesAssignment_3_1");
					put(grammarAccess.getCompositeValueAccess().getNameAssignment_0(), "rule__CompositeValue__NameAssignment_0");
					put(grammarAccess.getCompositeValueAccess().getValuesAssignment_2(), "rule__CompositeValue__ValuesAssignment_2");
					put(grammarAccess.getDisplayNameAccess().getValueAssignment_3(), "rule__DisplayName__ValueAssignment_3");
					put(grammarAccess.getMetaprogAccess().getValueAssignment_3(), "rule__Metaprog__ValueAssignment_3");
					put(grammarAccess.getAbstractSyntaxAccess().getValuesAssignment_3(), "rule__AbstractSyntax__ValuesAssignment_3");
					put(grammarAccess.getSemanticAccess().getValuesAssignment_3(), "rule__Semantic__ValuesAssignment_3");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalDslParser typedParser = (InternalDslParser) parser;
			typedParser.entryRuleDsl();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public DslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(DslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
