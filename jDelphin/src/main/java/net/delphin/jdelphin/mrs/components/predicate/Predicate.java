package net.delphin.jdelphin.mrs.components.predicate;


import java.util.Optional;


/**
 * Predicate<br>
 * <br>
 * Basic definition of a predicate, containing a lemma, part of speech, and
 * sense indicator
 *
 * @author trimblet
 * @since Feb 15, 2016
 * @version 0.1
 */
public interface Predicate {

	public abstract String getLemma();


	public abstract Optional<PartOfSpeech> getPartOfSpeech();


	public abstract Optional<Sense> getSense();

}
