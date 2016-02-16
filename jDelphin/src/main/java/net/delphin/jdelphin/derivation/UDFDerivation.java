package net.delphin.jdelphin.derivation;




/**
 * UDFDerivation<br>
 * <br>
 * {@link Derivation} object in the Unified Derivation Format
 *
 * @author trimblet
 * @since Feb 14, 2016
 * @version 0.1
 * @see <a
 *      href="http://moin.delph-in.net/ItsdbDerivations">http://moin.delph-in.net/ItsdbDerivations</a>
 */
public interface UDFDerivation {

	public abstract Integer getID();


	public abstract Double getScore();


	public abstract Integer getStart();


	public abstract Integer getEnd();

}
