package abstract_factory.case4.factory;

import abstract_factory.case4.bank.Bank;
import abstract_factory.case4.loan.BussinessLoan;
import abstract_factory.case4.loan.EducationLoan;
import abstract_factory.case4.loan.HomeLoan;
import abstract_factory.case4.loan.Loan;

public class LoanFactory extends AbstractFactory {

	@Override
	public Loan getLoan(String loan) {
		if (loan == null) {
			return null;
		}

		if (loan.equalsIgnoreCase("Home")) {
			return new HomeLoan();
		} else if (loan.equalsIgnoreCase("Business")) {
			return new BussinessLoan();
		} else if (loan.equalsIgnoreCase("Education")) {
			return new EducationLoan();
		}

		return null;
	}

	// OCP 위배
	@Override
	public Bank getBank(String bank) {
		return null;
	}


}
