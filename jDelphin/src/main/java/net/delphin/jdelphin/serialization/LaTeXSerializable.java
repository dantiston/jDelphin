package net.delphin.jdelphin.serialization;


/**
 * LaTeXSerializable<br>
 * <br>
 * Serialization marker for serializing classes into LaTeX serializations
 *
 * @author trimblet
 * @since Feb 16, 2016
 * @version 0.1
 */
public interface LaTeXSerializable {

	/**
	 * @return a {@link String} representation of this object in the LaTeX
	 *         representation
	 */
	public abstract String toLaTeX();

}
