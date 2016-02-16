package net.delphin.jdelphin.utilities;


import net.delphin.jdelphin.mrs.components.Feature;


/**
 * Features<br>
 * <br>
 * Known features implementing the {@link Feature} interface, using the
 * Extensible Enumeration pattern.
 *
 * @author trimblet
 * @since Feb 15, 2016
 * @version 0.1
 * @see <a
 *      href="https://blogs.oracle.com/darcy/entry/enums_and_mixins">https://blogs.oracle.com/darcy/entry/enums_and_mixins</a>
 */
public enum Features implements Feature {

	PERSON("PERS"), NUMBER("NUM"), PERNUM("PERNUM"), GENDER("GEND"),
	SENTENTIAL_FORCE("SF"), TENSE("TENSE"), MOOD("MOOD"), PROGRESSIVE("PROG"), PERFECT("PERF");

	private final String abbreviation;


	Features(String abbreviation) {
		if (abbreviation == null) {
			throw new NullPointerException("Features#() passed null parameter");
		}
		this.abbreviation = abbreviation;
	}


	@Override
	public String getName() {
		return this.abbreviation.toUpperCase();
	}
}
