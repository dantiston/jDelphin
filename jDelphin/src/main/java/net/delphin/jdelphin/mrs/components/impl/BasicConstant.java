package net.delphin.jdelphin.mrs.components.impl;


import net.delphin.jdelphin.mrs.components.Constant;


/**
 * BasicConstant<br>
 * <br>
 * Basic implementation of the {@link Constant} interface
 *
 * @author trimblet
 * @since Feb 15, 2016
 * @version 0.1
 */
public final class BasicConstant implements Constant {

	private final String constant;


	public BasicConstant(String constant) {
		if (constant == null) {
			throw new NullPointerException("BasicConstant#() passed null parameter");
		}
		this.constant = constant;
	}


	@Override
	public String get() {
		return this.constant;
	}

}
