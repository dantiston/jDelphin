package net.delphin.jdelphin.mrs.components.link;

import net.delphin.jdelphin.mrs.components.Link;


/**
 * CharSpanLink<br>
 * <br>
 * {@link Link} object representing character positions from the surface
 * {@link String}, e.g. <0:5>
 *
 * @author trimblet
 * @since Feb 14, 2016
 * @version 0.1
 */
public final class CharSpanLink extends SpanLink {

	private static final Character DELIMITER = ':';

	private final Integer from;
	private final Integer to;


	/**
	 * Construct a {@link CharSpanLink} object from the given parameters, with
	 * the precondition from >= 0 AND to > from
	 *
	 * @param from
	 * @param to
	 */
	public CharSpanLink(Integer from, Integer to) {
		if (from == null || to == null) {
			throw new NullPointerException("ChartSpanLink#() passed null parameter");
		}
		if (from < 0 || to <= from) {
			throw new IllegalArgumentException(String.format("CharSpanLink#() passed illegal arguments: {\"from\":\"%s\", \"to\":\"%s\"}", from, to));
		}
		this.from = from;
		this.to = to;
	}


	@Override
	public Integer getFrom() {
		return this.from;
	}


	@Override
	public Integer getTo() {
		return this.to;
	}


	@Override
	Character getDelimiter() {
		return DELIMITER;
	}

}
