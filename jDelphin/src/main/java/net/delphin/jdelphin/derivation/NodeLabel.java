package net.delphin.jdelphin.derivation;


/**
 * NodeLabel<br>
 * <br>
 * Information about a particular {@link Derivation} node.
 *
 * @author trimblet
 * @since Feb 20, 2016
 * @version 0.1
 */
public interface NodeLabel {

	/**
	 * @return the {@link String} representation of this {@link NodeLabel}'s
	 *         primary label, e.g. N, NP, VP, S
	 */
	public abstract String getName();

}
