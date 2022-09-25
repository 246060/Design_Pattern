package null_object.case1;

import null_object.case1.AbstractClass.AbstractCustomer;
import null_object.case1.NullClass.NullCustomer;
import null_object.case1.RealClass.RealCustomer;

public class CustomerFactory {

	public static final String[] names = {"Rob", "Joe", "Julie"};

	public static AbstractCustomer getCustomer(String name){

		for (int i = 0; i < names.length; i++) {
			if (names[i].equalsIgnoreCase(name)){
				return new RealCustomer(name);
			}
		}
		return new NullCustomer();
	}
}
