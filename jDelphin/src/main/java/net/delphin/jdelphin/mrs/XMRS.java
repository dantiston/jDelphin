package net.delphin.jdelphin.mrs;


import java.util.Optional;
import java.util.Set;

import net.delphin.jdelphin.mrs.components.ElementaryPredication;
import net.delphin.jdelphin.mrs.components.Handle;
import net.delphin.jdelphin.mrs.components.HandleConstraint;
import net.delphin.jdelphin.mrs.components.IndividualConstraint;
import net.delphin.jdelphin.mrs.components.Variable;


/**
 * XMRS<br>
 * <br>
 * Bare bones definition of a basic semantic graph, MRS, for supporting basic
 * {@link MinimalRecursionSemantics}, {@link DMRS}, and {@link RMRS}
 *
 * @author trimblet
 * @since Feb 14, 2016
 * @version 0.1
 * @see <a
 *      href="http://moin.delph-in.net/MrsRfc">http://moin.delph-in.net/MrsRfc</a>
 */
public interface XMRS {

	public abstract Handle getTop();


	public abstract Handle getLTop();


	public abstract Variable getIndex();


	public abstract Variable getXARG();


	public abstract Set<ElementaryPredication> getRelations();


	public abstract Set<HandleConstraint> getHCONS();


	public abstract Set<IndividualConstraint> getICONS();


	public abstract Optional<String> getSurfaceRepresentation();


	public abstract boolean isConnected();

}
