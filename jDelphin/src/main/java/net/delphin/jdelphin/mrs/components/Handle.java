package net.delphin.jdelphin.mrs.components;


/**
 * Handle<br>
 * <br>
 * {@link Variable} object representing a quantifier handle
 *
 * @author trimblet
 * @since Feb 15, 2016
 * @version 0.1
 */
public interface Handle extends Variable {

	@Override
	public default Type getType() {
		return Type.HANDLE;
	}

}
