package net.delphin.jdelphin.processors;


import java.util.List;

import net.delphin.jdelphin.mrs.MinimalRecursionSemantics;
import net.delphin.jdelphin.obj.Parse;


/**
 * Processor<br>
 * <br>
 * Definition of a DELPH-IN Processor
 *
 * @author trimblet
 * @since Feb 16, 2016
 * @version 0.1
 */
public interface Processor {

	public abstract List<Parse> parse(String string);


	public abstract List<String> generate(MinimalRecursionSemantics mrs);


	public abstract List<MinimalRecursionSemantics> transfer(MinimalRecursionSemantics mrs, Processor otherGrammar);


	public abstract List<String> translate(MinimalRecursionSemantics mrs, Processor otherGrammar);
}
