package net.delphin.jdelphin.serialization;


/**
 * XMLSerializable<br>
 * <br>
 * Serialization marker for serializing classes into XML
 *
 * @author trimblet
 * @since Feb 16, 2016
 * @version 0.1
 */
public interface XMLSerializable {

	/**
	 * @return a {@link String} representation of this object in XML
	 */
	public abstract String toXML();

}
