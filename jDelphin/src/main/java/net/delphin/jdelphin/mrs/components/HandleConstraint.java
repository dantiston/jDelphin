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
public interface HandleConstraint {

	public static enum Relation {
		QEQ,
		LHEQ,
		OUTSCOPES;

		@Override
		public String toString() {
			return this.name().toLowerCase();
		}
	}


	public abstract Argument getHi();


	public abstract Argument getLo();


	public abstract Relation getRelation();

}
