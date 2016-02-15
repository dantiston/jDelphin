package net.delphin.jdelphin.mrs.components.link;


/**
 * SpanLink<br>
 * <br>
 * {@link Link} object representing a span of the original text
 *
 * @author trimblet
 * @since Feb 14, 2016
 * @version 0.1
 */
public interface SpanLink extends Link {

	/**
	 * @return the inclusive starting position of the span
	 */
	public abstract int getFrom();


	/**
	 * @return the exclusive ending position of the span
	 */
	public abstract int getTo();

}
