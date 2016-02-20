package net.delphin.jdelphin.lui;


import java.util.List;

import net.delphin.jdelphin.derivation.Derivation;
import net.delphin.jdelphin.eds.ElementaryDependencyStructure;
import net.delphin.jdelphin.eds.ElementaryDependencyTriple;
import net.delphin.jdelphin.mrs.MinimalRecursionSemantics;
import net.delphin.jdelphin.obj.AbstractParse;
import net.delphin.jdelphin.obj.Parse;


/**
 * LuiParse<br>
 * <br>
 * {@link Parse} implementation for {@link LuiProcessor} objects
 *
 * @author trimblet
 * @since Feb 20, 2016
 * @version 0.1
 */
public class LuiParse extends AbstractParse {

	public LuiParse(Derivation derivation, MinimalRecursionSemantics mrs) {
		super(derivation, mrs);
	}


	@Override
	public ElementaryDependencyStructure getEds() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<ElementaryDependencyTriple> getElementaryDependencyTriples() {
		// TODO Auto-generated method stub
		return null;
	}

}
