package net.delphin.jdelphin.lui;


import java.io.IOException;
import java.util.List;

import net.delphin.jdelphin.derivation.Derivation;
import net.delphin.jdelphin.processors.Processor;


/**
 * LuiProcessor<br>
 * <br>
 * Basic definition of a Linguistic User Interface protocol adhering
 * {@link Processor}
 *
 * @author trimblet
 * @since Feb 20, 2016
 * @version 0.1
 */
public interface LuiProcessor extends Processor {

	static final String PARSE_TEMPLATE = "parse %s\f";
	static final String BROWSE_TEMPLATE = "browse %s %s %s\f";
	static final String UNIFY_TEMPLATE = "unify %s %s\f";


	abstract String makeParse(String string);


	abstract String makeBrowse(String string);


	abstract String makeUnify(String left, String right);


	abstract List<String> doParse(String string) throws IOException, InterruptedException;


	abstract List<String> requestMrs(List<? extends Derivation> derivations);

}
