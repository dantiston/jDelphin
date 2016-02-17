package net.delphin.jdelphin.obj;


import java.util.List;

import net.delphin.jdelphin.derivation.Derivation;
import net.delphin.jdelphin.eds.ElementaryDependencyStructure;
import net.delphin.jdelphin.eds.ElementaryDependencyTriple;
import net.delphin.jdelphin.mrs.MinimalRecursionSemantics;


/**
 * Parse<br>
 * <br>
 * Basic definition for a DELPH-IN {@link Processor} parse result
 *
 * @author trimblet
 * @since Feb 16, 2016
 * @version 0.1
 */
public interface Parse {

	/**
	 * @return the {@link MinimalRecursionSemantics} object associated with this
	 *         {@link Parse}
	 */
	public MinimalRecursionSemantics getMrs();


	/**
	 * @return the {@link Derivation} object associated with this {@link Parse}
	 */
	public Derivation getDerivation();


	/**
	 * @return the {@link ElementaryDependencyStructure} object associated with
	 *         this {@link Parse}
	 */
	public ElementaryDependencyStructure getEds();


	/**
	 * @return the {@link ElementaryDependencyTriple} objects associated with
	 *         this {@link Parse}
	 */
	public List<ElementaryDependencyTriple> getElementaryDependencyTriples();

}
