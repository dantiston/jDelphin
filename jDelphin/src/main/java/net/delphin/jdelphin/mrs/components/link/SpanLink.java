package net.delphin.jdelphin.mrs.components.link;


import net.delphin.jdelphin.mrs.components.Link;


/**
 * SpanLink<br>
 * <br>
 * {@link Link} object representing a span of the original text
 *
 * @author trimblet
 * @since Feb 14, 2016
 * @version 0.1
 */
public abstract class SpanLink implements Link {

	private static final String TEMPLATE = "<%s%s%s>";


	public static final String getSubstringFrom(SpanLink link, String string) {
		if (link == null || string == null) {
			throw new NullPointerException("AbstractSpanLink#getSubstringFrom() passed null parameter");
		}
		if (link.getFrom() < 0 || link.getFrom() > string.length() || link.getTo() <= link.getFrom() || link.getTo() > string.length()) {
			throw new IllegalArgumentException();
		}
		return string.substring(link.getFrom(), link.getTo());
	}


	/**
	 * @return the inclusive starting position of the span
	 */
	public abstract Integer getFrom();


	/**
	 * @return the exclusive ending position of the span
	 */
	public abstract Integer getTo();


	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof SpanLink)) {
			return false;
		}
		SpanLink other = (SpanLink) obj;
		if (this.getFrom() == null) {
			if (other.getFrom() != null) {
				return false;
			}
		} else if (!this.getFrom().equals(other.getFrom())) {
			return false;
		}
		if (this.getTo() == null) {
			if (other.getTo() != null) {
				return false;
			}
		} else if (!this.getTo().equals(other.getTo())) {
			return false;
		}
		return true;
	}


	@Override
	public int hashCode() {
		final int prime = 37;
		int result = 1;
		result = prime * result + ((this.getFrom() == null) ? 0 : this.getFrom().hashCode());
		result = prime * result + ((this.getTo() == null) ? 0 : this.getTo().hashCode());
		return result;
	}


	@Override
	public int compareTo(Link other) {
		if (other == null) {
			throw new NullPointerException("SpanLink#compareTo() passed null parameter");
		}
		int result;
		if (!(other instanceof SpanLink)) {
			result = -1;
		} else {
			SpanLink otherSpanLink = (SpanLink) other;
			result = this.getFrom().compareTo(otherSpanLink.getFrom());
			if (result == 0) {
				result = this.getTo().compareTo(otherSpanLink.getTo());
			}
		}
		return result;
	}


	/**
	 * @return the template delimiter for the implementing method
	 */
	abstract Character getDelimiter();


	@Override
	public final String getRepresentation() {
		return String.format(TEMPLATE, this.getFrom(), this.getDelimiter(), this.getTo());
	}


	@Override
	public String toString() {
		return this.getRepresentation();
	}
}
