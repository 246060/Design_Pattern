package abstract_factory.case4.factory;

import abstract_factory.case4.bank.Bank;
import abstract_factory.case4.loan.Loan;

public abstract class AbstractFactory {
	public abstract Bank getBank(String bank);
	public abstract Loan getLoan(String loan);
}
