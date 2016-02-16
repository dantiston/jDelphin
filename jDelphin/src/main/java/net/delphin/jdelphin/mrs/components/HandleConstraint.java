package net.delphin.jdelphin.mrs.components;


import net.delphin.jdelphin.mrs.XMRS;


/**
 * HandleConstraint<br>
 * <br>
 * Definition of a handle constraint in an {@link XMRS}
 *
 * @author trimblet
 * @since Feb 14, 2016
 * @version 0.1
 */
public interface HandleConstraint extends Comparable<HandleConstraint> {

	public static enum HandleRelation {
		QEQ,
		LHEQ,
		OUTSCOPES;

		@Override
		public String toString() {
			return this.name().toLowerCase();
		}
	}


	public abstract Variable getLo();


	public abstract Handle getHi();


	public abstract HandleRelation getRelation();

}
