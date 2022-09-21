package composite.case6;

import composite.case6.component.Employee;
import composite.case6.composite.BankManager;
import composite.case6.leaf.Accountant;
import composite.case6.leaf.Cashier;

public class Client {

	public static void main(String[] args) {

		Employee emp1 = new Cashier(101, "Sohan Kumar", 20000.0);
		Employee emp2 = new Cashier(102, "Mohan Kumar", 25000.0);
		Employee emp3 = new Accountant(103, "Seema Mahiwal", 30000.0);
		Employee manager1 = new BankManager(100, "Ashwani Rajput", 100000.0);

		manager1.add(emp1);
		manager1.add(emp2);
		manager1.add(emp3);

		manager1.print();
	}
}
