package formtemplatemethod;

public class CapitalStrategyTermLoan extends CapitalStrategy {

	public double capital(Loan loan) {
		return loan.getCommitment() * duration(loan) * riskFactorFor(loan);
	}
	
	public double duration(Loan loan) {
		return weightedAverageDuration(loan);
	}

	private double weightedAverageDuration(Loan loan) {
		// simplify
		return 0;
	}

}
