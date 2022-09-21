package abstract_factory.case4.loan;

public class BussinessLoan extends Loan {

	@Override
	public void getInterestRate(double rate) {
		super.rate = rate;
	}

}
