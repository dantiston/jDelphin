package net.delphin.jdelphin.mrs.components.impl;


import net.delphin.jdelphin.mrs.components.Argument;
import net.delphin.jdelphin.mrs.components.Variable;
import net.delphin.jdelphin.mrs.components.abstractions.AbstractArgument;


/**
 * BasicArgument<br>
 * <br>
 * Basic implementation of {@link Argument} interface
 *
 * @author trimblet
 * @since Feb 15, 2016
 * @version 0.1
 */
public class BasicArgument extends AbstractArgument {

	private final Position position;
	private final Variable variable;


	public BasicArgument(Position position, Variable variable) {
		if (position == null || variable == null) {
			throw new NullPointerException("BasicArgument#() passed null parameter");
		}
		this.position = position;
		this.variable = variable;
	}


	@Override
	public Variable getVariable() {
		return this.variable;
	}


	@Override
	public Position getPosition() {
		return this.position;
	}

}
