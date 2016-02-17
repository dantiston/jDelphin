package net.delphin.jdelphin.utilities;


import java.util.Collections;
import java.util.Optional;
import java.util.Set;

import net.delphin.jdelphin.mrs.XMRS;
import net.delphin.jdelphin.mrs.components.ElementaryPredication;
import net.delphin.jdelphin.mrs.components.Handle;
import net.delphin.jdelphin.mrs.components.HandleConstraint;
import net.delphin.jdelphin.mrs.components.IndividualConstraint;
import net.delphin.jdelphin.mrs.components.Variable;
import net.delphin.jdelphin.mrs.components.Variable.Type;
import net.delphin.jdelphin.mrs.components.impl.BasicHandle;
import net.delphin.jdelphin.mrs.components.impl.BasicVariable;


public final class Linguistics {

	private Linguistics() {} // No instantiation


	public static final XMRS emptyXMRS() {
		return EMPTY_XMRS;
	}

	private static final XMRS EMPTY_XMRS = new EmptyXmrs();

	private static final class EmptyXmrs implements XMRS {

		private final Handle top;
		private final Variable index;
		private final Variable xarg;


		public EmptyXmrs() {
			this.top = new BasicHandle(0, Collections.emptyMap());
			Variable var = new BasicVariable(Type.ENTITY, 0, Collections.emptyMap());
			this.index = var;
			this.xarg = var;
		}


		@Override
		public Handle getTop() {
			return this.top;
		}


		@Override
		public Handle getLTop() {
			return this.getTop();
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
			return Collections.emptySet();
		}


		@Override
		public Set<HandleConstraint> getHCONS() {
			return Collections.emptySet();
		}


		@Override
		public Set<IndividualConstraint> getICONS() {
			return Collections.emptySet();
		}


		@Override
		public Optional<String> getSurfaceRepresentation() {
			return Optional.empty();
		}


		@Override
		public boolean isConnected() {
			return true;
		}

	}

}
