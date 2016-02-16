package net.delphin.jdelphin.mrs.components;


import java.util.Map;

import net.delphin.jdelphin.mrs.XMRS;


/**
 * Variable<br>
 * <br>
 * A {@link Variable} is a representation of a variable in an {@link XMRS}.
 * {@link Variable} objects can refer to entities, constraints, handles, etc.
 *
 * @author trimblet
 * @since Feb 15, 2016
 * @version 0.1
 * @see <a
 *      href="http://moin.delph-in.net/PredicateRfc">http://moin.delph-in.net/PredicateRfc</a>
 */
public interface Variable extends Comparable<Variable> {

	public abstract Type getType();


	public abstract Integer getID();


	public abstract Map<Feature, String> getFeatures();

	public enum Type {

		ENTITY("x"),
		EVENT("e"),
		HANDLE("h"),
		I("i"),
		U("u"),
		P("p");

		private final String abbreviation;


		private Type(String abbreviation) {
			this.abbreviation = abbreviation;
		}


		public final String getAbbreviation() {
			return this.abbreviation;
		}

	}

}
