package net.delphin.jdelphin.mrs.components.predicate;


/**
 * PartOfSpeech<br>
 * <br>
 * A DELPH-IN Part of Speech for {@link Predicate} objects.
 *
 * @author trimblet
 * @since Feb 13, 2016
 * @version 0.1
 * @see <a href
 *      http://moin.delph-in.net/RmrsPos>http://moin.delph-in.net/RmrsPos</a>
 */
public abstract class PartOfSpeech {

	@Override
	public final String toString() {
		return this.getName();
	}


	/**
	 * @return the name of this {@link PartOfSpeech}
	 */
	public abstract String getName();


	/**
	 * @return the DELPH-IN abbreviation of this {@link PartOfSpeech}
	 */
	public abstract Character getAbbreviation();

	/**
	 * Noun<br>
	 * <br>
	 * {@link PartOfSpeech} for nouns, e.g. "dog"
	 *
	 * @author trimblet
	 * @since Feb 13, 2016
	 * @version 0.1
	 */
	public static class Noun extends PartOfSpeech {

		@Override
		public final String getName() {
			return "Noun";
		}


		@Override
		public final Character getAbbreviation() {
			return 'n';
		}
	}

	/**
	 * Verb<br>
	 * <br>
	 * {@link PartOfSpeech} for verbs, e.g. "run"
	 *
	 * @author trimblet
	 * @since Feb 13, 2016
	 * @version 0.1
	 */
	public static class Verb extends PartOfSpeech {

		@Override
		public final String getName() {
			return "Verb";
		}


		@Override
		public final Character getAbbreviation() {
			return 'v';
		}
	}

	/**
	 * Preposition<br>
	 * <br>
	 * {@link PartOfSpeech} for prepositions, e.g. "on"
	 *
	 * @author trimblet
	 * @since Feb 13, 2016
	 * @version 0.1
	 */
	public static final class Adposition extends PartOfSpeech {

		@Override
		public final String getName() {
			return "Adposition";
		}


		@Override
		public final Character getAbbreviation() {
			return 'p';
		}
	}

	/**
	 * SemanticModifier<br>
	 * <br>
	 * Supertype for {@link Adjective} and {@link Adverb}, e.g. "fast"
	 *
	 * @author trimblet
	 * @since Feb 15, 2016
	 * @version 0.1
	 */
	public static class SemanticModifier extends PartOfSpeech {

		@Override
		public String getName() {
			return "Adjective or Adverb";
		}


		@Override
		public Character getAbbreviation() {
			return 'a';
		}

	}

	/**
	 * Adjective<br>
	 * <br>
	 * {@link PartOfSpeech} for adjectives, e.g. "big"
	 *
	 * @author trimblet
	 * @since Feb 13, 2016
	 * @version 0.1
	 */
	public static final class Adjective extends SemanticModifier {

		@Override
		public final String getName() {
			return "Adjective";
		}


		@Override
		public final Character getAbbreviation() {
			return 'j';
		}
	}

	/**
	 * Adverb<br>
	 * <br>
	 * {@link PartOfSpeech} for adverbs, e.g. "quickly"
	 *
	 * @author trimblet
	 * @since Feb 13, 2016
	 * @version 0.1
	 */
	public static final class Adverb extends SemanticModifier {

		@Override
		public final String getName() {
			return "Adverb";
		}


		@Override
		public final Character getAbbreviation() {
			return 'r';
		}
	}

	/**
	 * Quantifier<br>
	 * <br>
	 * {@link PartOfSpeech} for quantifiers and determiners, e.g. "the"
	 *
	 * @author trimblet
	 * @since Feb 13, 2016
	 * @version 0.1
	 */
	public static final class Quantifier extends PartOfSpeech {

		@Override
		public final String getName() {
			return "Quantifier";
		}


		@Override
		public final Character getAbbreviation() {
			return 'q';
		}
	}

	/**
	 * DiscourseParticle<br>
	 * <br>
	 * {@link PartOfSpeech} for discourse particles, e.g. "ahem"
	 *
	 * @author trimblet
	 * @since Feb 15, 2016
	 * @version 0.1
	 */
	public static final class DiscourseParticle extends PartOfSpeech {

		@Override
		public final String getName() {
			return "Discourse Particle";
		}


		@Override
		public final Character getAbbreviation() {
			return 'x';
		}
	}

}
