package net.delphin.jdelphin.mrs.components.predicate;


/**
 * SenseType<br>
 * <br>
 * {@link String} representation of {@link Sense}
 *
 * @author trimblet
 * @since Feb 15, 2016
 * @version 0.1
 * @see <a
 *      href="http://moin.delph-in.net/RmrsPos">http://moin.delph-in.net/RmrsPos</a>
 */
public class SenseType implements Sense {

	private final String value;


	public SenseType(String value) {
		if (value == null) {
			throw new NullPointerException("SenseType#() passed null parameter");
		}
		if (value.length() <= 1) {
			throw new IllegalArgumentException("SenseType#() passed illegal parameter: value must be 2 or more characters");
		}
		this.value = value;
	}


	@Override
	public String get() {
		return this.value;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((this.value == null) ? 0 : this.value.hashCode());
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
		if (this.getClass() != obj.getClass()) {
			return false;
		}
		SenseType other = (SenseType) obj;
		if (this.value == null) {
			if (other.value != null) {
				return false;
			}
		} else if (!this.value.equals(other.value)) {
			return false;
		}
		return true;
	}

}
