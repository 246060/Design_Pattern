package adapter.case4;

import adapter.case4.adapter.BankCustomer;

public class Client {

	public static void main(String[] args) {
		/**
		 * 상속 이용한 class adapter 방식
		 * */
		CreditCard targetInterface = new BankCustomer();

		targetInterface.giveBankDetails("jak", "citi", 1001);
		String creditCard = targetInterface.getCreditCard();

		System.out.print(creditCard);
	}

}
