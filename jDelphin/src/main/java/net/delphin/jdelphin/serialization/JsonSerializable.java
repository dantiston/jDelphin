package net.delphin.jdelphin.serialization;


/**
 * JsonSerializable<br>
 * <br>
 * Serialization marker for serializing classes into JSON
 *
 * @author trimblet
 * @since Feb 16, 2016
 * @version 0.1
 */
public interface JsonSerializable {

	/**
	 * @return a {@link String} representation of this object in JSON
	 */
	public abstract String toJson();
}
