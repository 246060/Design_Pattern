package abstract_factory.case4.factory;

import abstract_factory.case4.bank.Bank;
import abstract_factory.case4.bank.HDFC;
import abstract_factory.case4.bank.ICICI;
import abstract_factory.case4.bank.SBI;
import abstract_factory.case4.loan.Loan;

public class BankFactory extends AbstractFactory {

	@Override
	public Bank getBank(String bank) {
		if (bank == null) {
			return null;
		}

		if (bank.equalsIgnoreCase("HDFC")) {
			return new HDFC();
		} else if (bank.equalsIgnoreCase("ICICI")) {
			return new ICICI();
		} else if (bank.equalsIgnoreCase("SBI")) {
			return new SBI();
		}

		return null;
	}

	// OCP 위배
	@Override
	public Loan getLoan(String loan) {
		return null;
	}


}
