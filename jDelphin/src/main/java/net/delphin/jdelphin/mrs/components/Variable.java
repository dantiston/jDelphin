package net.delphin.jdelphin.mrs.components;


import net.delphin.jdelphin.mrs.XMRS;


/**
 * Argument<br>
 * <br>
 * An {@link Variable} is a representation of a variable in an {@link XMRS}.
 * {@link Variable} objects can refer to entities, constraints, labels, or
 * constants.
 *
 * @author trimblet
 * @since Feb 15, 2016
 * @version 0.1
 * @see <a
 *      href="http://moin.delph-in.net/PredicateRfc">http://moin.delph-in.net/PredicateRfc</a>
 */
public interface Variable {

	public enum Type {

		ENTITY("x"),
		EVENT("e"),
		HANDLE("h"),
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
