package net.delphin.jdelphin.serialization;


/**
 * AceSerializable<br>
 * <br>
 * Serialization marker for serializing classes into ACE serializations
 *
 * @author trimblet
 * @since Feb 16, 2016
 * @version 0.1
 */
public interface AceSerializable {

	/**
	 * @return a {@link String} representation of this object in the ACE
	 *         representation
	 */
	public abstract String toAce();

}
