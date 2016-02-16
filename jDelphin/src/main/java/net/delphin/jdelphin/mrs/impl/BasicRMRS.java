package net.delphin.jdelphin.mrs.impl;


import java.util.Optional;
import java.util.Set;

import net.delphin.jdelphin.mrs.RMRS;
import net.delphin.jdelphin.mrs.components.ElementaryPredication;
import net.delphin.jdelphin.mrs.components.Handle;
import net.delphin.jdelphin.mrs.components.HandleConstraint;
import net.delphin.jdelphin.mrs.components.IndividualConstraint;
import net.delphin.jdelphin.mrs.components.Variable;


/**
 * BasicRMRS<br>
 * <br>
 *
 *
 * @author trimblet
 * @since Feb 15, 2016
 * @version 0.1
 */
public class BasicRMRS extends BasicXMRS implements RMRS {

	public BasicRMRS(Handle top, Variable index, Variable xarg, Set<ElementaryPredication> relations, Set<HandleConstraint> handleConstraints, Set<IndividualConstraint> individualConstraints) {
		super(top, index, xarg, relations, handleConstraints, individualConstraints);

	}


	public BasicRMRS(Handle top, Variable index, Variable xarg, Set<ElementaryPredication> relations, Set<HandleConstraint> handleConstraints, Set<IndividualConstraint> individualConstraints,
			Optional<String> surfaceString) {
		super(top, index, xarg, relations, handleConstraints, individualConstraints, surfaceString);

	}

}
