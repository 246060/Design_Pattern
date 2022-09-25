package null_object.case1.NullClass;

import null_object.case1.AbstractClass.AbstractCustomer;

public class NullCustomer extends AbstractCustomer {

	@Override
	public String getName() {
		return "Not Available in Customer Database";
	}

	@Override
	public boolean isNil() {
		return true;
	}
}