package net.delphin.jdelphin.mrs.components.abstractions;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import net.delphin.jdelphin.mrs.components.Argument;
import net.delphin.jdelphin.mrs.components.ElementaryPredication;
import net.delphin.jdelphin.mrs.components.Link;


/**
 * AbstractElementaryPredication<br>
 * <br>
 * Provides a default implementation of the {@link Comparable} definition of the
 * {@link ElementaryPredication} interface, as well as {@link Object#equals()}
 * and {@link Object#hashCode}. {@link AbstractElementaryPredication} sorts
 * based on the {@link Link}.
 *
 * @author trimblet
 * @since Feb 15, 2016
 * @version 0.1
 */
public abstract class AbstractElementaryPredication implements ElementaryPredication {

	private List<Argument> orderedArguments;


	@Override
	public List<Argument> getArguments() {
		if (this.orderedArguments == null) {
			List<Argument> orderedArguments = new ArrayList<Argument>(this.getArgumentMap().values());
			Collections.sort(orderedArguments);
		}
		return this.orderedArguments;
	}


	@Override
	public int compareTo(ElementaryPredication other) {
		if (other == null) {
			throw new NullPointerException("ElementaryPredication#compareTo() passed null parameter");
		}
		return this.getLink().compareTo(other.getLink());
	}


	@Override
	public int hashCode() {
		final int prime = 37;
		int result = 1;
		result = prime * result + ((this.getArguments() == null) ? 0 : this.getArguments().hashCode());
		result = prime * result + ((this.getLabel() == null) ? 0 : this.getLabel().hashCode());
		result = prime * result + ((this.getLink() == null) ? 0 : this.getLink().hashCode());
		result = prime * result + ((this.getNodeID() == null) ? 0 : this.getNodeID().hashCode());
		result = prime * result + ((this.getPredicate() == null) ? 0 : this.getPredicate().hashCode());
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
		if (!(obj instanceof AbstractElementaryPredication)) {
			return false;
		}
		AbstractElementaryPredication other = (AbstractElementaryPredication) obj;
		if (this.getArguments() == null) {
			if (other.getArguments() != null) {
				return false;
			}
		} else if (!this.getArguments().equals(other.getArguments())) {
			return false;
		}
		if (this.getLabel() == null) {
			if (other.getLabel() != null) {
				return false;
			}
		} else if (!this.getLabel().equals(other.getLabel())) {
			return false;
		}
		if (this.getLink() == null) {
			if (other.getLink() != null) {
				return false;
			}
		} else if (!this.getLink().equals(other.getLink())) {
			return false;
		}
		if (this.getNodeID() == null) {
			if (other.getNodeID() != null) {
				return false;
			}
		} else if (!this.getNodeID().equals(other.getNodeID())) {
			return false;
		}
		if (this.getPredicate() == null) {
			if (other.getPredicate() != null) {
				return false;
			}
		} else if (!this.getPredicate().equals(other.getPredicate())) {
			return false;
		}
		return true;
	}

}
