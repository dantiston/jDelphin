package net.delphin.jdelphin.lui;


import java.util.Collections;
import java.util.List;

import net.delphin.jdelphin.derivation.Derivation;
import net.delphin.jdelphin.derivation.NodeLabel;


/**
 * LuiDerivation<br>
 * <br>
 * {@link Derivation} implemention for a {@link LuiProcessor}
 *
 * @author trimblet
 * @since Feb 14, 2016
 * @version 0.1
 * @see
 */
public final class LuiDerivation implements Derivation {

	private LuiDerivation() {

	}


	public static final List<LuiDerivation> fromStrings(List<String> strings) {
		if (strings == null) {
			throw new NullPointerException("LuiDerivation#fromStrings() passed null parameter");
		}
		List<LuiDerivation> result = Collections.emptyList();
		if (!strings.isEmpty()) {
			for (String string : strings) {
				if (string == null) {
					throw new NullPointerException("LuiDerivation#fromStrings() passed parameter with a null element");
				}
				if (!string.isEmpty()) {
					System.out.println("Tree: " + string);
					result.add(fromString(string));
				}
			}
		}
		return result;
	}


	/**
	 * From a LUI string, generate a {@link LuiDerivation} object.<br>
	 * <br>
	 * Expected format:
	 *
	 * <pre>
	 * tree &lt;tree_ID&gt; #T[&lt;edge_ID&gt; "&lt;label&gt;" "&lt;token&gt;" &lt;chart_ID&gt; &lt;rule_name&gt; (#T[.*])?] "<text>"
	 * </pre>
	 *
	 * @param string
	 * @return
	 */
	public static final LuiDerivation fromString(String string) {
		if (string == null) {
			throw new NullPointerException("LuiDerivation#fromString() passed null parameter");
		}
		if (string.isEmpty()) {
			throw new IllegalArgumentException("LuiDerivation#fromString() passed illegally empty parameter");
		}
		System.out.println("LuiDerivation#fromString() received: " + string);
		return null; // TODO: THIS
	}


	@Override
	public final List<? extends LuiDerivation> getChildren() {
		return Collections.emptyList(); // TODO: THIS
	}


	@Override
	public Derivation getParent() {
		return null; // TODO: THIS
	}


	@Override
	public NodeLabel getLabel() {
		return null; // TODO: THIS
	}

}
