package net.delphin.jdelphin.mrs.components;


import net.delphin.jdelphin.mrs.XMRS;


/**
 * Argument<br>
 * <br>
 * A matching between a {@link Position} and a {@link Variable} in an
 * {@link XMRS}
 *
 * @author trimblet
 * @since Feb 15, 2016
 * @version 0.1
 */
public interface Argument extends Comparable<Argument> {

	public abstract Variable getVariable();


	public abstract Position getPosition();

	public enum Position {

		ARG0,
		ARG1,
		ARG2,
		ARG3,
		ARG4,
		ARG5,
		ARG6,
		RSTR,
		BODY,
		CARG;

	}

}
