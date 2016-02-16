package net.delphin.jdelphin.mrs.components.abstractions;


import net.delphin.jdelphin.mrs.components.HandleConstraint;


/**
 * AbstractHandleConstraint<br>
 * <br>
 * Provides a default implementation of the {@link Comparable} definition of the
 * {@link HandleConstraint} interface, as well as {@link Object#equals()} and
 * {@link Object#hashCode}.
 *
 * @author trimblet
 * @since Feb 15, 2016
 * @version 0.1
 */
public abstract class AbstractHandleConstraint implements HandleConstraint {

	@Override
	public int compareTo(HandleConstraint other) {
		if (other == null) {
			throw new NullPointerException("AbstractHandleConstraint#compareTo() passed null parameter");
		}
		int result = this.getLo().compareTo(other.getLo());
		if (result == 0) {
			result = this.getHi().compareTo(other.getHi());
			if (result == 0) {
				result = this.getRelation().compareTo(other.getRelation());
			}
		}
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (obj == this) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof HandleConstraint)) {
			return false;
		}
		HandleConstraint other = (HandleConstraint) obj;
		if (this.getLo() == null) {
			if (other.getLo() != null) {
				return false;
			}
		}
		if (!this.getLo().equals(other.getLo())) {
			return false;
		}
		if (this.getHi() == null) {
			if (other.getHi() != null) {
				return false;
			}
		}
		if (!this.getHi().equals(other.getHi())) {
			return false;
		}
		if (this.getRelation() == null) {
			if (other.getRelation() != null) {
				return false;
			}
		}
		if (!this.getRelation().equals(other.getRelation())) {
			return false;
		}
		return true;
	}


	@Override
	public int hashCode() {
		final int prime = 37;
		int result = 1;
		result = prime * result + ((this.getLo() == null) ? 0 : this.getLo().hashCode());
		result = prime * result + ((this.getHi() == null) ? 0 : this.getHi().hashCode());
		result = prime * result + ((this.getRelation() == null) ? 0 : this.getRelation().hashCode());
		return result;
	}

}
