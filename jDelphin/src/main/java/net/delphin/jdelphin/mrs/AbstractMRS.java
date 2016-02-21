package net.delphin.jdelphin.mrs;


import java.util.Optional;
import java.util.Set;

import net.delphin.jdelphin.mrs.components.ElementaryPredication;
import net.delphin.jdelphin.mrs.components.Handle;
import net.delphin.jdelphin.mrs.components.HandleConstraint;
import net.delphin.jdelphin.mrs.components.IndividualConstraint;
import net.delphin.jdelphin.mrs.components.Variable;


/**
 * AbstractMRS<br>
 * <br>
 * Basic implementation of {@link MinimalRecursionSemantics} object
 *
 * @author trimblet
 * @since Feb 20, 2016
 * @version 0.1
 */
public abstract class AbstractMRS implements MinimalRecursionSemantics {

	private final Handle top;
	private final Variable index;
	private final Variable xarg;
	private final Set<ElementaryPredication> relations;
	private final Set<HandleConstraint> hcons;
	private final Set<IndividualConstraint> icons;
	private final Optional<String> surface;


	public AbstractMRS(Handle top, Variable index, Variable xarg, Set<ElementaryPredication> relations, Set<HandleConstraint> hcons, Set<IndividualConstraint> icons) {
		this(top, index, xarg, relations, hcons, icons, Optional.empty());
	}


	public AbstractMRS(Handle top, Variable index, Variable xarg, Set<ElementaryPredication> relations, Set<HandleConstraint> hcons, Set<IndividualConstraint> icons, String surface) {
		this(top, index, xarg, relations, hcons, icons, Optional.of(surface));
	}


	public AbstractMRS(Handle top, Variable index, Variable xarg, Set<ElementaryPredication> relations, Set<HandleConstraint> hcons, Set<IndividualConstraint> icons, Optional<String> surface) {
		if (top == null || index == null || xarg == null || relations == null || hcons == null || icons == null || surface == null) {
			throw new NullPointerException("AbstractMRS#() passed null parameter");
		}
		this.top = top;
		this.index = index;
		this.xarg = xarg;
		this.relations = relations;
		this.hcons = hcons;
		this.icons = icons;
		this.surface = surface;
	}


	@Override
	public Handle getTop() {
		return this.top;
	}


	@Override
	public Variable getIndex() {
		return this.index;
	}


	@Override
	public Variable getXARG() {
		return this.xarg;
	}


	@Override
	public Set<ElementaryPredication> getRelations() {
		return this.relations;
	}


	@Override
	public Set<HandleConstraint> getHCONS() {
		return this.hcons;
	}


	@Override
	public Set<IndividualConstraint> getICONS() {
		return this.icons;
	}


	@Override
	public Optional<String> getSurfaceRepresentation() {
		return this.surface;
	}


	@Override
	public final Handle getLTop() {
		return this.getTop();
	}


	@Override
	public boolean isConnected() {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((this.hcons == null) ? 0 : this.hcons.hashCode());
		result = prime * result + ((this.icons == null) ? 0 : this.icons.hashCode());
		result = prime * result + ((this.index == null) ? 0 : this.index.hashCode());
		result = prime * result + ((this.relations == null) ? 0 : this.relations.hashCode());
		result = prime * result + ((this.surface == null) ? 0 : this.surface.hashCode());
		result = prime * result + ((this.top == null) ? 0 : this.top.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (this.getClass() != obj.getClass()) {
			return false;
		}
		AbstractMRS other = (AbstractMRS) obj;
		if (this.hcons == null) {
			if (other.hcons != null) {
				return false;
			}
		} else if (!this.hcons.equals(other.hcons)) {
			return false;
		}
		if (this.icons == null) {
			if (other.icons != null) {
				return false;
			}
		} else if (!this.icons.equals(other.icons)) {
			return false;
		}
		if (this.index == null) {
			if (other.index != null) {
				return false;
			}
		} else if (!this.index.equals(other.index)) {
			return false;
		}
		if (this.relations == null) {
			if (other.relations != null) {
				return false;
			}
		} else if (!this.relations.equals(other.relations)) {
			return false;
		}
		if (this.surface == null) {
			if (other.surface != null) {
				return false;
			}
		} else if (!this.surface.equals(other.surface)) {
			return false;
		}
		if (this.top == null) {
			if (other.top != null) {
				return false;
			}
		} else if (!this.top.equals(other.top)) {
			return false;
		}
		return true;
	}

}
