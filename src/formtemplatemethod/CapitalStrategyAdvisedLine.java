package formtemplatemethod;

public class CapitalStrategyAdvisedLine extends CapitalStrategy {

	public double capital(Loan loan) {
		return loan.getCommitment() * loan.getUnusedPercentage() * duration(loan) * riskFactorFor(loan);
	}

}
