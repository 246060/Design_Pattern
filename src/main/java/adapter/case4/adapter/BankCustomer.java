package adapter.case4.adapter;

import adapter.case4.CreditCard;
import adapter.case4.adaptee.BankDetails;

/**
 * adapter class.
 * class adapter 방식
 */
public class BankCustomer extends BankDetails implements CreditCard {
	@Override
	public void giveBankDetails(String customerName, String bankName, long accNumber) {
		setAccHolderName(customerName);
		setAccNumber(accNumber);
		setBankName(bankName);
	}

	@Override
	public String getCreditCard() {

		long accno = getAccNumber();
		String accholdername = getAccHolderName();
		String bname = getBankName();

		return "The Account number " + accno + " of " + accholdername + " in " + bname + " bank is valid and authenticated for issuing the credit card.";
	}
}
