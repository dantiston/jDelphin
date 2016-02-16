package net.delphin.jdelphin.mrs.components;


import java.util.List;
import java.util.Map;
import java.util.Optional;

import net.delphin.jdelphin.mrs.XMRS;
import net.delphin.jdelphin.mrs.components.predicate.Predicate;


/**
 * ElementaryPredication<br>
 * <br>
 * {@link ElementaryPredication} objects are a basic unit of semantic knowledge
 * in an {@link XMRS}.
 *
 * @author trimblet
 * @since Feb 14, 2016
 * @version 0.1
 * @see <a
 *      href="http://moin.delph-in.net/MrsRfc">http://moin.delph-in.net/MrsRfc</a>
 */
public interface ElementaryPredication extends Comparable<ElementaryPredication> {

	public abstract Predicate getPredicate();


	public abstract Handle getLabel();


	public abstract List<Argument> getArguments();


	public abstract Link getLink();


	public abstract Map<Argument.Position, Argument> getArgumentMap();


	public abstract Optional<Integer> getNodeID();

}
