package net.delphin.jdelphin.mrs.components.link;


import java.util.List;

import net.delphin.jdelphin.mrs.components.Link;


/**
 * TokenLink<br>
 * <br>
 * {@link Link} object representing token positions, e.g. <0 1 2>
 *
 * @author trimblet
 * @since Feb 14, 2016
 * @version 0.1
 */
public class TokenLink implements Link {

	private static final String TEMPLATE = "<%s>";

	private final List<Integer> tokenIds;


	public TokenLink(List<Integer> tokenIds) {
		if (tokenIds == null) {
			throw new NullPointerException("TokenLink#() passed null parameter");
		}
		if (tokenIds.isEmpty()) {
			throw new IllegalArgumentException("TokenLink#() passed illegally empty parameter");
		}
		this.tokenIds = tokenIds;
	}


	/**
	 * @return the token IDs of the span
	 */
	public List<Integer> getTokenIds() {
		return this.tokenIds;
	}


	@Override
	public String getRepresentation() {
		return String.format(TEMPLATE, String.join(" ", this.tokenIds.toArray(new String[this.tokenIds.size()])));
	}


	@Override
	public int compareTo(Link other) {
		if (other == null) {
			throw new NullPointerException("TokenLink#compareTo() passed null parameter");
		}
		int result = 0;
		if (!(other instanceof TokenLink)) {
			result = 1;
		} else {
			TokenLink otherTokenLink = (TokenLink) other;
			int i = 0;
			while (result == 0 && i < this.tokenIds.size() && i < otherTokenLink.tokenIds.size()) {
				result = otherTokenLink.getTokenIds().get(i);
				i++;
			}
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
		if (!(obj instanceof TokenLink)) {
			return false;
		}
		TokenLink other = (TokenLink) obj;
		if (this.getTokenIds() == null) {
			if (other.getTokenIds() != null) {
				return false;
			}
		} else if (!this.getTokenIds().equals(other.getTokenIds())) {
			return false;
		}
		return true;
	}


	@Override
	public int hashCode() {
		final int prime = 37;
		int result = 1;
		result = prime * result + ((this.getTokenIds() == null) ? 0 : this.getTokenIds().hashCode());
		return result;
	}


	@Override
	public String toString() {
		return this.getRepresentation();
	}

}
