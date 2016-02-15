package net.delphin.jdelphin.mrs.components.link;


/**
 * EdgeLink<br>
 * <br>
 * {@link Link} object representing an edge, e.g. <@1>
 *
 * @author trimblet
 * @since Feb 14, 2016
 * @version 0.1
 */
public interface EdgeLink extends Link {

	/**
	 * @return the edge ID of this {@link Link}
	 */
	public abstract int getEdge();

}
