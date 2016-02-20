package net.delphin.jdelphin.derivation;


import java.util.List;


/**
 * Derivation<br>
 * <br>
 * Definition of a basic syntactic derivation in the DELPH-IN formalism.
 *
 * @author trimblet
 * @since Feb 14, 2016
 * @version 0.1
 */
public interface Derivation {

	public abstract Derivation getParent();


	public abstract List<? extends Derivation> getChildren();


	public abstract NodeLabel getLabel();

}
