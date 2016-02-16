package net.delphin.jdelphin.mrs.components.abstractions;


import net.delphin.jdelphin.mrs.components.IndividualConstraint;


/**
 * AbstractInformationConstraint<br>
 * <br>
 * Provides a default implementation of the {@link Comparable} definition of the
 * {@link IndividualConstraint} interface, as well as {@link Object#equals()}
 * and {@link Object#hashCode}.
 *
 * @author trimblet
 * @since Feb 15, 2016
 * @version 0.1
 */
public abstract class AbstractIndividualConstraint implements IndividualConstraint {

	@Override
	public int compareTo(IndividualConstraint other) {
		if (other == null) {
			throw new NullPointerException("");
		}
		int result = this.getArg1().compareTo(other.getArg1());
		if (result == 0) {
			result = this.getArg2().compareTo(other.getArg2());
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
		if (!(obj instanceof IndividualConstraint)) {
			return false;
		}
		IndividualConstraint other = (IndividualConstraint) obj;
		if (this.getArg1() == null) {
			if (other.getArg1() != null) {
				return false;
			}
		}
		if (!this.getArg1().equals(other.getArg1())) {
			return false;
		}
		if (this.getArg2() == null) {
			if (other.getArg2() != null) {
				return false;
			}
		}
		if (!this.getArg2().equals(other.getArg2())) {
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
		result = prime * result + ((this.getArg1() == null) ? 0 : this.getArg1().hashCode());
		result = prime * result + ((this.getArg2() == null) ? 0 : this.getArg2().hashCode());
		result = prime * result + ((this.getRelation() == null) ? 0 : this.getRelation().hashCode());
		return result;
	}

}
