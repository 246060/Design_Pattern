package abstract_factory.case4.bank;

public class HDFC implements Bank {

	private final String BNAME;

	public HDFC() {
		BNAME = "HDFC BANK";
	}

	@Override
	public String getBankName() {
		return BNAME;
	}
}
