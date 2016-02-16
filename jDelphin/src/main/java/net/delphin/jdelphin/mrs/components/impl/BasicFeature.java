package net.delphin.jdelphin.mrs.components.impl;


import net.delphin.jdelphin.mrs.components.Feature;


/**
 * BasicFeature<br>
 * <br>
 * Implementation of {@link Feature} interface
 *
 * @author trimblet
 * @since Feb 15, 2016
 * @version 0.1
 */
public final class BasicFeature implements Feature {

	private final String name;


	public BasicFeature(String name) {
		if (name == null) {
			throw new NullPointerException("Feature#() passed null parameter");
		}
		if (name.isEmpty()) {
			throw new IllegalArgumentException("Feature#() passed illegally empty parameter");
		}
		this.name = name.toUpperCase();
	}


	public String getName() {
		return this.name;
	}

}
