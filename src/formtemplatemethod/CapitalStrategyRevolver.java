package formtemplatemethod;

public class CapitalStrategyRevolver extends CapitalStrategy {

	public double capital(Loan loan) {
		return loan.outstandingRiskAmount() * duration(loan) * riskFactorFor(loan)
				+ loan.unusedRiskAmout() * duration(loan) * unusedRiskFactor(loan);
	}

	private double unusedRiskFactor(Loan loan) {
		// simplify
		return 0;
	}

}
