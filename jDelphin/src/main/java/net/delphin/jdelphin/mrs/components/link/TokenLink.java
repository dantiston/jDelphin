package net.delphin.jdelphin.mrs.components.link;


import java.util.List;


/**
 * TokenLink<br>
 * <br>
 * {@link Link} object representing token positions, e.g. <0 1 2>
 *
 * @author trimblet
 * @since Feb 14, 2016
 * @version 0.1
 */
public interface TokenLink extends Link {

	/**
	 * @return the token IDs of the span
	 */
	public abstract List<Integer> getTokenIds();

}
