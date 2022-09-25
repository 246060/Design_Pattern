package null_object.case1;

import null_object.case1.AbstractClass.AbstractCustomer;

public class Client {

	public static void main(String[] args) {
		System.out.println();

		AbstractCustomer customer1 = CustomerFactory.getCustomer("Rob");
		AbstractCustomer customer2 = CustomerFactory.getCustomer("Bob");
		AbstractCustomer customer3 = CustomerFactory.getCustomer("Julie");
		AbstractCustomer customer4 = CustomerFactory.getCustomer("Laura");

		System.out.println(customer1.getName());
		System.out.println(customer2.getName());
		System.out.println(customer3.getName());
		System.out.println(customer4.getName());
	}

}
