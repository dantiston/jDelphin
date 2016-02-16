package net.delphin.jdelphin.mrs.components.link;

import net.delphin.jdelphin.mrs.components.Link;


/**
 * ChartSpanLink<br>
 * <br>
 * {@link Link} object representing chart vertices, e.g. <0:5>
 *
 * @author trimblet
 * @since Feb 14, 2016
 * @version 0.1
 */
public final class ChartSpanLink extends SpanLink {

	private static final Character DELIMITER = '#';

	private final Integer from;
	private final Integer to;


	/**
	 * Construct a {@link ChartSpanLink} object from the given parameters, with
	 * the precondition from >= 0 AND to > from
	 *
	 * @param from
	 * @param to
	 */
	public ChartSpanLink(Integer from, Integer to) {
		if (from == null || to == null) {
			throw new NullPointerException("ChartSpanLink#() passed null parameter");
		}
		if (from < 0 || to <= from) {
			throw new IllegalArgumentException(String.format("ChartSpanLink#() passed illegal arguments: {\"from\":\"%s\", \"to\":\"%s\"}", from, to));
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
