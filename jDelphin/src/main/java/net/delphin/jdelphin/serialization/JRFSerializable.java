package net.delphin.jdelphin.serialization;


/**
 * DelphinSerializable<br>
 * <br>
 * Serialization marker for serializing classes into the DELPH-IN Joint
 * Reference Formalism.
 *
 * @author trimblet
 * @since Feb 16, 2016
 * @version 0.1
 * @see <a
 *      href="http://moin.delph-in.net/ItsdbDerivations">http://moin.delph-in.net/ItsdbDerivations</a>
 * @see <a
 *      href="http://moin.delph-in.net/MrsRfc">http://moin.delph-in.net/MrsRfc</a>
 */
public interface JRFSerializable {

	/**
	 * @return a {@link String} representation of this object in the DELPH-IN
	 *         Joint Reference Formalism.
	 */
	public abstract String toJRF();

}
