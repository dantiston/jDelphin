package net.delphin.jdelphin.mrs.components;




/**
 * Link<br>
 * <br>
 * A simple mapping from a surface form to an {@link ElementaryPredication}
 *
 * @author trimblet
 * @since Feb 14, 2016
 * @version 0.1
 */
public interface Link extends Comparable<Link> {

	/**
	 * @return the {@link String} representation of this {@link Link}
	 */
	public abstract String getRepresentation();

}
