package net.delphin.jdelphin.mrs.components.abstractions;


import net.delphin.jdelphin.mrs.components.IndividualConstraint;
import net.delphin.jdelphin.mrs.components.Variable;


/**
 * AbstractVariable<br>
 * <br>
 * Provides a default implementation of the {@link Comparable} definition of the
 * {@link IndividualConstraint} interface, as well as {@link Object#equals()}
 * and {@link Object#hashCode}.
 *
 * @author trimblet
 * @since Feb 15, 2016
 * @version 0.1
 */
public abstract class AbstractVariable implements Variable {

	@Override
	public int compareTo(Variable other) {
		if (other == null) {
			throw new NullPointerException("AbstractVariable#compareTo() passed null parameter");
		}
		// Sort on type
		int result = this.getType().compareTo(other.getType());
		// Then sort on id
		if (result == 0) {
			result = this.getID().compareTo(other.getID());
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
		if (!(obj instanceof Variable)) {
			return false;
		}
		Variable other = (Variable) obj;
		if (this.getID() == null) {
			if (other.getID() != null) {
				return false;
			}
		}
		// Technically, id should be unique, but check them all for debugging,
		// etc.
		if (!this.getID().equals(other.getID())) {
			return false;
		}
		if (this.getType() == null) {
			if (other.getType() != null) {
				return false;
			}
		}
		if (!this.getType().equals(other.getType())) {
			return false;
		}
		if (this.getFeatures() == null) {
			if (other.getFeatures() != null) {
				return false;
			}
		}
		if (!this.getFeatures().equals(other.getFeatures())) {
			return false;
		}
		return true;
	}


	@Override
	public int hashCode() {
		final int prime = 37;
		int result = 1;
		result = prime * result + ((this.getType() == null) ? 0 : this.getType().hashCode());
		result = prime * result + ((this.getID() == null) ? 0 : this.getID().hashCode());
		result = prime * result + ((this.getFeatures() == null) ? 0 : this.getFeatures().hashCode());
		return result;
	}

}
