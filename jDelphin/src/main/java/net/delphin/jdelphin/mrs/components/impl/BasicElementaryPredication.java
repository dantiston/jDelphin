package net.delphin.jdelphin.mrs.components.impl;


import java.util.Map;
import java.util.Optional;

import net.delphin.jdelphin.mrs.components.Argument;
import net.delphin.jdelphin.mrs.components.Argument.Position;
import net.delphin.jdelphin.mrs.components.ElementaryPredication;
import net.delphin.jdelphin.mrs.components.Handle;
import net.delphin.jdelphin.mrs.components.Link;
import net.delphin.jdelphin.mrs.components.abstractions.AbstractElementaryPredication;
import net.delphin.jdelphin.mrs.components.predicate.Predicate;


/**
 * BasicElementaryPredication<br>
 * <br>
 * Basic implementation of {@link ElementaryPredication} interface
 *
 * @author trimblet
 * @since Feb 15, 2016
 * @version 0.1
 */
public class BasicElementaryPredication extends AbstractElementaryPredication {

	private final Predicate predicate;
	private final Handle label;
	private final Link link;
	private final Map<Position, Argument> arguments;
	private final Optional<Integer> nodeId;


	public BasicElementaryPredication(Predicate predicate, Handle label, Link link, Map<Position, Argument> arguments) {
		this(predicate, label, link, arguments, Optional.empty());
	}


	public BasicElementaryPredication(Predicate predicate, Handle label, Link link, Map<Position, Argument> arguments, Optional<Integer> nodeId) {
		if (predicate == null || label == null || link == null || arguments == null || nodeId == null) {
			throw new NullPointerException("BasicElementaryPredication#() passed null parameter");
		}
		if (this.arguments.isEmpty()) {
			throw new IllegalArgumentException(
					"BasicElementaryPredication#() passed illegally empty arguments Map parameter." +
					"An ElementaryPredication must contain at least one argument, usually an ARG0 or CARG.");
		}
		this.predicate = predicate;
		this.label = label;
		this.link = link;
		this.arguments = arguments;
		this.nodeId = nodeId;
	}


	@Override
	public Predicate getPredicate() {
		return this.predicate;
	}


	@Override
	public Handle getLabel() {
		return this.label;
	}


	@Override
	public Link getLink() {
		return this.link;
	}


	@Override
	public Map<Position, Argument> getArgumentMap() {
		return this.arguments;
	}


	@Override
	public Optional<Integer> getNodeID() {
		return this.nodeId;
	}

}
