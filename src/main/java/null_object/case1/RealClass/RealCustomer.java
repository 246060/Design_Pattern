package null_object.case1.RealClass;

import null_object.case1.AbstractClass.AbstractCustomer;

public class RealCustomer extends AbstractCustomer {

	public RealCustomer(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public boolean isNil() {
		return false;
	}
}
