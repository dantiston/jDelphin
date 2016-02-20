package net.delphin.jdelphin.obj;


import net.delphin.jdelphin.derivation.Derivation;
import net.delphin.jdelphin.mrs.MinimalRecursionSemantics;


/**
 * AbstractParse<br>
 * <br>
 * Basic implementation of {@link Parse} interface
 *
 * @author trimblet
 * @since Feb 20, 2016
 * @version 0.1
 */
public abstract class AbstractParse implements Parse {

	private final Derivation derivation;
	private final MinimalRecursionSemantics mrs;


	public AbstractParse(Derivation derivation, MinimalRecursionSemantics mrs) {
		if (derivation == null || mrs == null) {
			throw new NullPointerException("AbstractParse#() passed null parameter");
		}
		this.derivation = derivation;
		this.mrs = mrs;
	}


	@Override
	public MinimalRecursionSemantics getMrs() {
		return this.mrs;
	}


	@Override
	public Derivation getDerivation() {
		return this.getDerivation();
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((this.derivation == null) ? 0 : this.derivation.hashCode());
		result = prime * result + ((this.mrs == null) ? 0 : this.mrs.hashCode());
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
		AbstractParse other = (AbstractParse) obj;
		if (this.derivation == null) {
			if (other.derivation != null) {
				return false;
			}
		} else if (!this.derivation.equals(other.derivation)) {
			return false;
		}
		if (this.mrs == null) {
			if (other.mrs != null) {
				return false;
			}
		} else if (!this.mrs.equals(other.mrs)) {
			return false;
		}
		return true;
	}

}
