package net.delphin.jdelphin.mrs.components.impl;


import net.delphin.jdelphin.mrs.components.IndividualConstraint;
import net.delphin.jdelphin.mrs.components.Variable;
import net.delphin.jdelphin.mrs.components.abstractions.AbstractIndividualConstraint;


/**
 * BasicIndividualConstraint<br>
 * <br>
 * Basic implementation of the {@link IndividualConstraint} interface
 *
 * @author trimblet
 * @since Feb 15, 2016
 * @version 0.1
 */
public class BasicIndividualConstraint extends AbstractIndividualConstraint {

	private final Variable arg1;
	private final Variable arg2;
	private final IndividualRelation relation;


	public BasicIndividualConstraint(Variable arg1, Variable arg2, IndividualRelation relation) {
		if (arg1 == null || arg2 == null || relation == null) {
			throw new NullPointerException("BasicIndividualConstraint#() passed null parameter");
		}
		this.arg1 = arg1;
		this.arg2 = arg2;
		this.relation = relation;
	}


	@Override
	public Variable getArg1() {
		return this.arg1;
	}


	@Override
	public Variable getArg2() {
		return this.arg2;
	}


	@Override
	public IndividualRelation getRelation() {
		return this.relation;
	}
}
