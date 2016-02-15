package net.delphin.jdelphin.mrs.components.predicate;


/**
 * SenseIndicator<br>
 * <br>
 * {@link Integer} representing a {@link Sense}
 *
 * @author trimblet
 * @since Feb 15, 2016
 * @version 0.1
 * @see <a
 *      href="http://moin.delph-in.net/RmrsPos">http://moin.delph-in.net/RmrsPos</a>
 */
public final class SenseIndicator implements Sense {

	private final Integer value;


	public SenseIndicator(Integer value) {
		if (value == null) {
			throw new NullPointerException("SenseIndicator#() passed null parameter");
		}
		this.value = value;
	}


	@Override
	public String get() {
		return String.valueOf(this.value);
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
		SenseIndicator other = (SenseIndicator) obj;
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
