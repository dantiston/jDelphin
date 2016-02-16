package net.delphin.jdelphin.mrs.components.abstractions;


import net.delphin.jdelphin.mrs.components.Argument;
import net.delphin.jdelphin.mrs.components.impl.BasicArgument;


/**
 * AbstractArgument<br>
 * <br>
 * Provides a default implementation of the {@link Comparable} definition of the
 * {@link Argument} interface, as well as {@link Object#equals()} and
 * {@link Object#hashCode}. {@link AbstractArgument} sorts based on the
 * {@link Argument.Position}.
 *
 * @author trimblet
 * @since Feb 15, 2016
 * @version 0.1
 */
public abstract class AbstractArgument implements Argument {

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((this.getPosition() == null) ? 0 : this.getPosition().hashCode());
		result = prime * result + ((this.getVariable() == null) ? 0 : this.getVariable().hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!super.equals(obj)) {
			return false;
		}
		if (this.getClass() != obj.getClass()) {
			return false;
		}
		BasicArgument other = (BasicArgument) obj;
		if (this.getPosition() == null) {
			if (other.getPosition() != null) {
				return false;
			}
		} else if (!this.getPosition().equals(other.getPosition())) {
			return false;
		}
		if (this.getVariable() == null) {
			if (other.getVariable() != null) {
				return false;
			}
		} else if (!this.getVariable().equals(other.getVariable())) {
			return false;
		}
		return true;
	}


	@Override
	public final int compareTo(Argument argument) {
		if (argument == null) {
			throw new NullPointerException("AbstractArgument#compareTo() passed null parameter");
		}
		return this.getPosition().compareTo(argument.getPosition());
	}

}
