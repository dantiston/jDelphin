package net.delphin.jdelphin.lui;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import net.delphin.jdelphin.derivation.Derivation;
import net.delphin.jdelphin.mrs.MinimalRecursionSemantics;
import net.delphin.jdelphin.obj.Parse;
import net.delphin.jdelphin.processors.AbstractProcessor;


/**
 * AbstractLuiProcessor<br>
 * <br>
 * Wraps the {@link AbstractProcessor} methods in the proper Linguistic User
 * Interface protocol commands
 *
 * @author trimblet
 * @since Feb 20, 2016
 * @version 0.1
 */
public abstract class AbstractLuiProcessor extends AbstractProcessor implements LuiProcessor {

	@Override
	public final List<Parse> parse(String string) {
		if (string == null) {
			throw new NullPointerException("AbstractLuiProcessor#parse() passed null parameter");
		}
		List<Parse> result = Collections.emptyList();
		if (!string.isEmpty()) {
			List<? extends Derivation> derivations = LuiDerivation.fromStrings(this.doParse(this.makeParse(string)));
			List<? extends MinimalRecursionSemantics> mrs = LuiMrs.fromStrings(this.requestMrs(derivations));
			assert derivations.size() == mrs.size();
			result = new ArrayList<Parse>(derivations.size());
			for (int i = 0; i < derivations.size(); i++) {
				result.add(new LuiParse(derivations.get(i), mrs.get(i)));
			}
		}
		return result;
	}


	@Override
	public final String makeParse(String string) {
		if (string == null) {
			throw new NullPointerException("AbstractLuiProcessor#makeParse() passed null parameter");
		}
		return String.format(PARSE_TEMPLATE, string);
	}


	@Override
	public final String makeBrowse(String string) {
		if (string == null) {
			throw new NullPointerException("AbstractLuiProcessor#makeRequest() passed null parameter");
		}
		return String.format(BROWSE_TEMPLATE, string);
	}


	@Override
	public String makeUnify(String left, String right) {
		if (left == null || right == null) {
			throw new NullPointerException("AbstractLuiProcessor#makeUnify() passed null parameter");
		}
		return String.format(UNIFY_TEMPLATE, left, right);
	}
}
