package net.delphin.jdelphin.mrs.components.predicate;


import java.util.HashMap;
import java.util.Map;
import java.util.Optional;


/**
 * PartOfSpeech<br>
 * <br>
 * A Delph-IN Part of Speech for {@link Predicate} objects.
 *
 * @author trimblet
 * @since Feb 13, 2016
 * @version 0.1
 * @see <a href
 *      http://moin.delph-in.net/RmrsPos>http://moin.delph-in.net/RmrsPos</a>
 */
public abstract class PartOfSpeech {

	private static final Map<String, PartOfSpeech> MAPPINGS = makeMappings();


	private static final Map<String, PartOfSpeech> makeMappings() {
		Map<String, PartOfSpeech> result = new HashMap<String, PartOfSpeech>(16);
		result.put(Noun.get().getName(), Noun.get());
		result.put(Noun.get().getAbbreviation().toString(), Noun.get());
		result.put(Verb.get().getName(), Verb.get());
		result.put(Verb.get().getAbbreviation().toString(), Verb.get());
		result.put(SemanticModifier.get().getName(), SemanticModifier.get());
		result.put(SemanticModifier.get().getAbbreviation().toString(), SemanticModifier.get());
		result.put(Adjective.get().getName(), Adjective.get());
		result.put(Adjective.get().getAbbreviation().toString(), Adjective.get());
		result.put(Adverb.get().getName(), Adverb.get());
		result.put(Adverb.get().getAbbreviation().toString(), Adverb.get());
		result.put(VerbalNoun.get().getName(), VerbalNoun.get());
		result.put(VerbalNoun.get().getAbbreviation().toString(), VerbalNoun.get());
		result.put(Adposition.get().getName(), Adposition.get());
		result.put(Adposition.get().getAbbreviation().toString(), Adposition.get());
		result.put(Quantifier.get().getName(), Quantifier.get());
		result.put(Quantifier.get().getAbbreviation().toString(), Quantifier.get());
		result.put(Conjunction.get().getName(), Conjunction.get());
		result.put(Conjunction.get().getAbbreviation().toString(), Conjunction.get());
		result.put(DiscourseParticle.get().getName(), DiscourseParticle.get());
		result.put(DiscourseParticle.get().getAbbreviation().toString(), DiscourseParticle.get());
		result.put(DiscourseItem.get().getName(), DiscourseItem.get());
		result.put(DiscourseItem.get().getAbbreviation().toString(), DiscourseItem.get());
		return result;
	}


	/**
	 * Get a {@link PartOfSpeech} object from an abbreviation or a name.
	 *
	 * @param key
	 * @return
	 */
	public static final Optional<PartOfSpeech> get(String key) {
		if (key == null) {
			throw new NullPointerException();
		}
		if (key.isEmpty()) {
			throw new IllegalArgumentException();
		}
		Optional<PartOfSpeech> result = Optional.ofNullable(MAPPINGS.get(key));
		if (!result.isPresent()) {
			result = Optional.of(Unknown.with(key));
		}
		return result;
	}


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
	private static final class Noun extends PartOfSpeech {

		private static final Noun INSTANCE = new Noun();


		private Noun() {} // No instantiation


		@Override
		public final String getName() {
			return "Noun";
		}


		@Override
		public final Character getAbbreviation() {
			return 'n';
		}


		public static final PartOfSpeech get() {
			return INSTANCE;
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
	private static final class Verb extends PartOfSpeech {

		private static final Verb INSTANCE = new Verb();


		private Verb() {} // No instantiation


		@Override
		public final String getName() {
			return "Verb";
		}


		@Override
		public final Character getAbbreviation() {
			return 'v';
		}


		public static final PartOfSpeech get() {
			return INSTANCE;
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
	private static final class Adposition extends PartOfSpeech {

		private static final Adposition INSTANCE = new Adposition();


		private Adposition() {} // No instantiation


		@Override
		public final String getName() {
			return "Adposition";
		}


		@Override
		public final Character getAbbreviation() {
			return 'p';
		}


		public static final Adposition get() {
			return INSTANCE;
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
	private static class SemanticModifier extends PartOfSpeech {

		private static final SemanticModifier INSTANCE = new SemanticModifier();


		private SemanticModifier() {} // No instantiation


		@Override
		public String getName() {
			return "Adjective or Adverb";
		}


		@Override
		public Character getAbbreviation() {
			return 'a';
		}


		public static SemanticModifier get() {
			return INSTANCE;
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
	private static final class Adjective extends SemanticModifier {

		private static final Adjective INSTANCE = new Adjective();


		private Adjective() {} // No instantiation


		@Override
		public final String getName() {
			return "Adjective";
		}


		@Override
		public final Character getAbbreviation() {
			return 'j';
		}


		public static final Adjective get() {
			return INSTANCE;
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
	private static final class Adverb extends SemanticModifier {

		private static final Adverb INSTANCE = new Adverb();


		private Adverb() {} // No instantiation


		@Override
		public final String getName() {
			return "Adverb";
		}


		@Override
		public final Character getAbbreviation() {
			return 'r';
		}


		public static final Adverb get() {
			return INSTANCE;
		}
	}

	/**
	 * VerbalNoun<br>
	 * <br>
	 * {@link PartOfSpeech} for adverbs, such as those in Japanese and Korean
	 *
	 * @author trimblet
	 * @since Feb 13, 2016
	 * @version 0.1
	 */
	private static final class VerbalNoun extends PartOfSpeech {

		private static final VerbalNoun INSTANCE = new VerbalNoun();


		private VerbalNoun() {} // No instantiation


		@Override
		public final String getName() {
			return "VerbalNoun";
		}


		@Override
		public final Character getAbbreviation() {
			return 's';
		}


		public static final VerbalNoun get() {
			return INSTANCE;
		}
	}

	/**
	 * Conjunction<br>
	 * <br>
	 * {@link PartOfSpeech} for conjunctions, e.g. "and"
	 *
	 * @author trimblet
	 * @since Feb 13, 2016
	 * @version 0.1
	 */
	private static final class Conjunction extends PartOfSpeech {

		private static final Conjunction INSTANCE = new Conjunction();


		private Conjunction() {} // No instantiation


		@Override
		public final String getName() {
			return "Conjunction";
		}


		@Override
		public final Character getAbbreviation() {
			return 'c';
		}


		public static final Conjunction get() {
			return INSTANCE;
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
	private static final class Quantifier extends PartOfSpeech {

		private static final Quantifier INSTANCE = new Quantifier();


		private Quantifier() {} // No instantiation


		@Override
		public final String getName() {
			return "Quantifier";
		}


		@Override
		public final Character getAbbreviation() {
			return 'q';
		}


		public static final Quantifier get() {
			return INSTANCE;
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
	private static final class DiscourseParticle extends PartOfSpeech {

		private static final DiscourseParticle INSTANCE = new DiscourseParticle();


		private DiscourseParticle() {} // No instantiation


		@Override
		public final String getName() {
			return "Discourse Particle";
		}


		@Override
		public final Character getAbbreviation() {
			return 'x';
		}


		public static final DiscourseParticle get() {
			return INSTANCE;
		}
	}

	/**
	 * DiscourseItem<br>
	 * <br>
	 * {@link PartOfSpeech} for certain discourse relations, e.g. the passive
	 * argument, "parg_d_rel"
	 *
	 * @author trimblet
	 * @since Feb 15, 2016
	 * @version 0.1
	 */
	private static final class DiscourseItem extends PartOfSpeech {

		private static final DiscourseItem INSTANCE = new DiscourseItem();


		private DiscourseItem() {} // No instantiation


		@Override
		public final String getName() {
			return "Discourse Item";
		}


		@Override
		public final Character getAbbreviation() {
			return 'd';
		}


		public static final DiscourseItem get() {
			return INSTANCE;
		}
	}

	/**
	 * Unknown<br>
	 * <br>
	 * {@link PartOfSpeech} for unknown predicates
	 *
	 * @author trimblet
	 * @since Feb 15, 2016
	 * @version 0.1
	 */
	private static final class Unknown extends PartOfSpeech {

		private static final Unknown INSTANCE = new Unknown();
		private static final String DEFAULT_NAME = "Unknown";
		private static final Character DEFAULT_ABBREVIATION = 'u';

		private final Character abbreviation;
		private final String name;


		private Unknown() {
			this.abbreviation = DEFAULT_ABBREVIATION;
			this.name = DEFAULT_NAME;
		}


		private Unknown(String string) {
			if (string == null) {
				throw new NullPointerException("Unknown#() passed null parameter");
			}
			string = string.trim();
			if (string.isEmpty()) {
				throw new IllegalArgumentException();
			}
			if (string.length() == 1 && Character.isAlphabetic(string.codePointAt(0))) {
				this.abbreviation = string.charAt(0);
				this.name = DEFAULT_NAME;
			} else {
				this.abbreviation = DEFAULT_ABBREVIATION;
				this.name = string;
			}
		}


		private Unknown(String name, Character abbreviation) {
			if (name == null || abbreviation == null) {
				throw new NullPointerException();
			}
			if (name.isEmpty()) {
				throw new IllegalArgumentException();
			}
			this.name = name;
			this.abbreviation = abbreviation;
		}


		private static final Unknown with(String string) {
			if (string == null) {
				throw new NullPointerException("Unknown#with() passed null parameter");
			}
			return new Unknown(string);
		}


		private static final Unknown with(String name, Character abbreviation) {
			if (name == null || abbreviation == null) {
				throw new NullPointerException("Unknown#with() passed null parameter");
			}
			return new Unknown(name, abbreviation);
		}


		@Override
		public final String getName() {
			return this.name;
		}


		@Override
		public final Character getAbbreviation() {
			return this.abbreviation;
		}


		public static final Unknown get() {
			return INSTANCE;
		}
	}

}
