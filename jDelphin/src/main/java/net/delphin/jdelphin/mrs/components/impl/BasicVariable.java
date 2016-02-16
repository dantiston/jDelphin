package net.delphin.jdelphin.mrs.components.impl;


import java.util.Collections;
import java.util.Map;

import net.delphin.jdelphin.mrs.components.Feature;
import net.delphin.jdelphin.mrs.components.Variable;
import net.delphin.jdelphin.mrs.components.abstractions.AbstractVariable;


/**
 * BasicVariable<br>
 * <br>
 * Basic implementation of the {@link Variable} interface
 *
 * @author trimblet
 * @since Feb 15, 2016
 * @version 0.1
 */
public class BasicVariable extends AbstractVariable {

	private final Type type;
	private final Integer id;
	private final Map<Feature, String> features;


	public BasicVariable(Type type, Integer id) {
		this(type, id, Collections.emptyMap());
	}


	public BasicVariable(Type type, Integer id, Map<Feature, String> features) {
		if (type == null || id == null) {
			throw new NullPointerException();
		}
		this.type = type;
		this.id = id;
		this.features = features;
	}


	@Override
	public Type getType() {
		return this.type;
	}


	@Override
	public Integer getID() {
		return this.id;
	}


	@Override
	public Map<Feature, String> getFeatures() {
		return this.features;
	}

}
