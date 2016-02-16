package net.delphin.jdelphin.mrs.impl;


import java.util.Optional;
import java.util.Set;

import net.delphin.jdelphin.mrs.XMRS;
import net.delphin.jdelphin.mrs.components.ElementaryPredication;
import net.delphin.jdelphin.mrs.components.Handle;
import net.delphin.jdelphin.mrs.components.HandleConstraint;
import net.delphin.jdelphin.mrs.components.IndividualConstraint;
import net.delphin.jdelphin.mrs.components.Variable;


/**
 * BasicXMRS<br>
 * <br>
 * Basic implementation of {@link XMRS} interface
 *
 * @author trimblet
 * @since Feb 15, 2016
 * @version 0.1
 */
public abstract class BasicXMRS implements XMRS {

	private final Handle top;
	private final Variable index;
	private final Variable xarg;
	private final Set<ElementaryPredication> relations;
	private final Set<HandleConstraint> handleConstraints;
	private final Set<IndividualConstraint> individualConstrants;
	private final Optional<String> surfaceString;


	public BasicXMRS(Handle top, Variable index, Variable xarg,
			Set<ElementaryPredication> relations, Set<HandleConstraint> handleConstraints,
			Set<IndividualConstraint> individualConstraints) {
		this(top, index, xarg, relations, handleConstraints, individualConstraints, Optional.empty());
	}


	public BasicXMRS(Handle top, Variable index, Variable xarg,
			Set<ElementaryPredication> relations, Set<HandleConstraint> handleConstraints,
			Set<IndividualConstraint> individualConstraints, Optional<String> surfaceString) {
		if (top == null || index == null || xarg == null || relations == null || handleConstraints == null || individualConstraints == null || surfaceString == null) {
			throw new NullPointerException("BasicXMRS#() passed null parameter");
		}
		this.top = top;
		this.index = index;
		this.xarg = xarg;
		this.relations = relations;
		this.handleConstraints = handleConstraints;
		this.individualConstrants = individualConstraints;
		this.surfaceString = surfaceString;
	}


	@Override
	public Handle getTop() {
		return this.top;
	}


	@Override
	public final Handle getLTop() {
		return this.getTop();
	}


	@Override
	public Variable getIndex() {
		return this.index;
	}


	@Override
	public Variable getXARG() {
		return this.xarg;
	}


	@Override
	public Set<ElementaryPredication> getRelations() {
		return this.relations;
	}


	@Override
	public Set<HandleConstraint> getHCONS() {
		return this.handleConstraints;
	}


	@Override
	public Set<IndividualConstraint> getICONS() {
		return this.individualConstrants;
	}


	@Override
	public Optional<String> getSurfaceRepresentation() {
		return this.surfaceString;
	}

}
