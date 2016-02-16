package net.delphin.jdelphin.mrs.components.impl;


import net.delphin.jdelphin.mrs.components.Handle;
import net.delphin.jdelphin.mrs.components.HandleConstraint;
import net.delphin.jdelphin.mrs.components.Variable;
import net.delphin.jdelphin.mrs.components.abstractions.AbstractHandleConstraint;


/**
 * BasicHandleConstraint<br>
 * <br>
 * Basic implementation of the {@link HandleConstraint} interface
 *
 * @author trimblet
 * @since Feb 15, 2016
 * @version 0.1
 */
public class BasicHandleConstraint extends AbstractHandleConstraint {

	private final Variable lo;
	private final Handle hi;
	private final HandleRelation relation;


	public BasicHandleConstraint(Variable lo, Handle hi, HandleRelation relation) {
		if (lo == null || hi == null || relation == null) {
			throw new NullPointerException("BasicHandleConstraint#() passed parameter");
		}
		this.lo = lo;
		this.hi = hi;
		this.relation = relation;
	}


	@Override
	public Variable getLo() {
		return this.lo;
	}


	@Override
	public Handle getHi() {
		return this.hi;
	}


	@Override
	public HandleRelation getRelation() {
		return this.relation;
	}

}
