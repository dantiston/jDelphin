package net.delphin.jdelphin.mrs.components;


import java.util.List;
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
 */
public interface ElementaryPredication {

	public abstract Predicate getPredicate();


	public abstract Handle getLabel();


	public abstract List<Variable> getArguments();


	public abstract Optional<List<Variable>> getVariableArguments();


	public abstract List<Variable> getScopalArguments();


	public abstract Optional<Integer> getNodeID();

}
