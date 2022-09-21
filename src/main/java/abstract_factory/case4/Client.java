package abstract_factory.case4;

import abstract_factory.case4.bank.Bank;
import abstract_factory.case4.factory.AbstractFactory;
import abstract_factory.case4.factory.FactoryCreator;
import abstract_factory.case4.loan.Loan;

public class Client {

	public static void main(String[] args) {

		AbstractFactory bankFactory = FactoryCreator.getFactory("Bank");
		Bank b = bankFactory.getBank("HDFC");
		System.out.println("bank name = " + b.getBankName());

		double rate = 12.95;
		double loanAmount = 500000;
		int years = 10;

		System.out.println("you are taking the loan from " + b.getBankName());

		AbstractFactory loanFactory = FactoryCreator.getFactory("Loan");
		Loan l = loanFactory.getLoan("Business");
		l.getInterestRate(rate);
		l.calculateLoanPayment(loanAmount, years);

	}
}
