package net.delphin.jdelphin.serialization;


/**
 * HtmlSerializable<br>
 * <br>
 * Serialization marker for serializing classes into HTML serializations
 *
 * @author trimblet
 * @since Feb 16, 2016
 * @version 0.1
 */
public interface HtmlSerializable {

	/**
	 * @return a {@link String} representation of this object in the HTML
	 *         representation
	 */
	public abstract String toHtml();

}
