package net.delphin.jdelphin.mrs.components.link;

import net.delphin.jdelphin.mrs.components.Link;


/**
 * EdgeLink<br>
 * <br>
 * {@link Link} object representing an edge, e.g. <@1>
 *
 * @author trimblet
 * @since Feb 14, 2016
 * @version 0.1
 */
public final class EdgeLink implements Link {

	private final static String TEMPLATE = "<@%s>";

	private final Integer edge;


	public EdgeLink(Integer edge) {
		if (edge == null) {
			throw new NullPointerException();
		}
		this.edge = edge;
	}


	/**
	 * @return the edge ID of this {@link Link}
	 */
	public final Integer getEdge() {
		return this.edge;
	}


	@Override
	public String getRepresentation() {
		return String.format(TEMPLATE, this.getEdge());
	}


	@Override
	public String toString() {
		return this.getRepresentation();
	}


	@Override
	public int compareTo(Link other) {
		if (other == null) {
			throw new NullPointerException("EdgeLink#compareTo() passed null parameter");
		}
		int result;
		if (!(other instanceof EdgeLink)) {
			result = -1;
		} else {
			EdgeLink otherSpanLink = (EdgeLink) other;
			result = this.getEdge().compareTo(otherSpanLink.getEdge());
		}
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof EdgeLink)) {
			return false;
		}
		EdgeLink other = (EdgeLink) obj;
		if (this.getEdge() == null) {
			if (other.getEdge() != null) {
				return false;
			}
		} else if (!this.getEdge().equals(other.getEdge())) {
			return false;
		}
		return true;
	}


	@Override
	public int hashCode() {
		final int prime = 37;
		int result = 1;
		result = prime * result + ((this.getEdge() == null) ? 0 : this.getEdge().hashCode());
		return result;
	}

}
