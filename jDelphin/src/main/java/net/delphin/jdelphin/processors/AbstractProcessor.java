package net.delphin.jdelphin.processors;


import java.util.ArrayList;
import java.util.List;

import net.delphin.jdelphin.mrs.MinimalRecursionSemantics;


/**
 * AbstractProcessor<br>
 * <br>
 * Basic implementation of the {@link Processor} interface
 *
 * @author trimblet
 * @since Feb 20, 2016
 * @version 0.1
 */
public abstract class AbstractProcessor implements Processor {

	@Override
	public final List<String> translate(MinimalRecursionSemantics mrs, Processor otherGrammar) {
		if (mrs == null || otherGrammar == null) {
			throw new NullPointerException("Processor#translate() passed null parameter");
		}
		List<MinimalRecursionSemantics> translations = this.transfer(mrs, otherGrammar);
		List<String> result = new ArrayList<String>(translations.size() * 3);
		for (MinimalRecursionSemantics translation : translations) {
			result.addAll(this.generate(translation));
		}
		return result;
	}

}
