package net.delphin.jdelphin.mrs.components;


/**
 * IndividualConstraint<br>
 * <br>
 * Definition of an individual constraint for information structure and
 * reference constraints.<br>
 * <br>
 * See the Grammar Matrix, 11-26-2014 for note on changing CLAUSE/TARGET to
 * IARG1/IARG2
 *
 * @author trimblet
 * @since Feb 14, 2016
 * @version 0.1
 * @see <a
 *      href="https://digital.lib.washington.edu/researchworks/bitstream/handle/1773/25372/Song_washington_0250E_12731.pdf">https://digital.lib.washington.edu/researchworks/bitstream/handle/1773/25372/Song_washington_0250E_12731.pdf</a>
 */
public interface IndividualConstraint extends Comparable<IndividualConstraint> {

	public abstract Variable getArg1();


	public abstract Variable getArg2();


	public abstract IndividualRelation getRelation();

	/**
	 * IndividualRelation<br>
	 * <br>
	 * Know individual relations, from the Grammar Matrix
	 *
	 * @author trimblet
	 * @since Feb 15, 2016
	 * @version 0.1
	 */
	public static enum IndividualRelation {
		NON_TOPIC,
		NON_FOCUS,
		CONTRAST_OR_FOCUS,
		CONTRAST_OR_TOPIC,
		FOCUS_OR_TOPIC,
		FOCUS,
		CONTRAST,
		TOPIC,
		BACKGROUND,
		SEMANTIC_FOCUS,
		CONTRAST_FOCUS,
		CONTRAST_TOPIC,
		ABOUTNESS_TOPIC;

		@Override
		public String toString() {
			return this.name().toLowerCase();
		}
	}

}
