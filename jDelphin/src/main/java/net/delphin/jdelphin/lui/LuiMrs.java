package net.delphin.jdelphin.lui;


import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import net.delphin.jdelphin.mrs.AbstractMRS;
import net.delphin.jdelphin.mrs.MinimalRecursionSemantics;
import net.delphin.jdelphin.mrs.components.ElementaryPredication;
import net.delphin.jdelphin.mrs.components.Handle;
import net.delphin.jdelphin.mrs.components.HandleConstraint;
import net.delphin.jdelphin.mrs.components.IndividualConstraint;
import net.delphin.jdelphin.mrs.components.Variable;


/**
 * LuiMrs<br>
 * <br>
 * {@link MinimalRecursionSemantics} implemention for a {@link LuiProcessor}
 *
 * @author trimblet
 * @since Feb 20, 2016
 * @version 0.1
 */
public class LuiMrs extends AbstractMRS {

	public LuiMrs(Handle top, Variable index, Set<ElementaryPredication> relations, Set<HandleConstraint> hcons, Set<IndividualConstraint> icons, String surface) {
		super(top, index, relations, hcons, icons, surface);
	}


	public static final List<LuiMrs> fromStrings(List<String> strings) {
		if (strings == null) {
			throw new NullPointerException("LuiMrs#fromStrings() passed null parameter");
		}
		List<LuiMrs> result = Collections.emptyList();
		if (!strings.isEmpty()) {
			for (String string : strings) {
				if (string == null) {
					throw new NullPointerException("LuiMrs#fromStrings() passed parameter with a null element");
				}
				if (!string.isEmpty()) {
					result.add(fromString(string));
				}
			}
		}
		return result;
	}


	/**
	 * From a LUI string, generate a {@link LuiMrs} object.<br>
	 * <br>
	 * Expected format:
	 *
	 * <pre>
	 * &quot;avm &lt;avm_ID&gt; &lt;MRS&gt; \&quot;Simple MRS\&quot;&quot;
	 * </pre>
	 *
	 * @param string
	 * @return
	 */
	public static final LuiMrs fromString(String string) {
		if (string == null) {
			throw new NullPointerException("LuiMrs#fromString() passed null parameter");
		}
		if (string.isEmpty()) {
			throw new IllegalArgumentException("LuiMrs#fromString() passed illegally empty parameter");
		}
		System.out.println("LuiMrs#fromString() received: " + string);
		return null; // TODO: THIS
	}


	@Override
	public Handle getTop() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Variable getIndex() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Variable getXARG() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Set<ElementaryPredication> getRelations() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Set<HandleConstraint> getHCONS() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Set<IndividualConstraint> getICONS() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Optional<String> getSurfaceRepresentation() {
		// TODO Auto-generated method stub
		return null;
	}

}
