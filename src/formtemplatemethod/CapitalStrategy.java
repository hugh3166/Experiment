package formtemplatemethod;

public abstract class CapitalStrategy {
	
	public abstract double capital(Loan loan);
	
	public double duration(Loan loan) {
		// simplify
		return 0;
	}
	
	protected double riskFactorFor(Loan loan) {
		// simplify
		return 0;
	}
	
}
