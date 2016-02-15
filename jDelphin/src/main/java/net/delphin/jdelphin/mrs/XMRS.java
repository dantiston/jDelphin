package net.delphin.jdelphin.mrs;


import java.util.Set;

import net.delphin.jdelphin.mrs.components.Variable;
import net.delphin.jdelphin.mrs.components.ElementaryPredication;
import net.delphin.jdelphin.mrs.components.HandleConstraint;
import net.delphin.jdelphin.mrs.components.IndividualConstraint;


/**
 * XMRS<br>
 * <br>
 * Bare bones definition of a basic semantic graph, MRS, for supporting basic
 * {@link MinimalRecursionSemantics}, {@link DMRS}, and {@link RMRS}
 *
 * @author trimblet
 * @since Feb 14, 2016
 * @version 0.1
 */
public interface XMRS {

	/*
	 * top: the TOP (or maybe LTOP) variable
	 * 
	 * index: the INDEX variable
	 * 
	 * xarg: the XARG variable
	 * 
	 * eps: an iterable of EPs (see above)
	 * 
	 * hcons: an iterable of HCONS (see above)
	 * 
	 * icons: an iterable of ICONS (see above)
	 * 
	 * vars: a mapping of variable to a list of property-value pairs
	 * 
	 * lnk: the Lnk object associating the Xmrs to the surface form
	 * 
	 * surface: the surface string
	 */

	public abstract Variable getTop();


	public abstract Variable getLTop();


	public abstract Variable getIndex();


	public abstract Variable getXARG();


	public abstract Set<ElementaryPredication> getEPs();


	public abstract Set<HandleConstraint> getHCONS();


	public abstract Set<IndividualConstraint> getICONS();

}
