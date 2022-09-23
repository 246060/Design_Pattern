package memento.case4;

import memento.case4.Caretaker.EmployeeCaretaker;
import memento.case4.Originator.Employee;

public class Client {

	public static void main(String[] args) {

		EmployeeCaretaker caretaker = new EmployeeCaretaker();

		System.out.println("------------------------------------------------------------------");

		System.out.println("\ncreating employee objects with intial values\n");

		Employee racheal = new Employee(100).setName("Racheal").setDesignation("Lead").setSalary(100000).setDepartment("R&D").setProject("Transportation Management");
		Employee micheal = new Employee(101).setName("Micheal").setDesignation("Developer").setSalary(75000).setDepartment("Engineering").setProject("IoT");
		System.out.println(racheal);
		System.out.println(micheal);
		System.out.println();

		caretaker.addMemento(racheal.getEmpId(), "Saved at intitial stage", racheal.createMemento());
		caretaker.addMemento(micheal.getEmpId(), "Saved at intitial stage", micheal.createMemento());

		System.out.println("------------------------------------------------------------------");

		System.out.println("\nracheal got promotion");
		racheal.setDesignation("Manager").setSalary(120000);

		System.out.println("micheal assigned to another project.\n");
		micheal.setProject("Android App");

		System.out.println(racheal);
		System.out.println(micheal);
		System.out.println();

		caretaker.addMemento(racheal.getEmpId(), "Saved at promotion", racheal.createMemento());
		caretaker.addMemento(micheal.getEmpId(), "Saved at android project", micheal.createMemento());

		System.out.println("------------------------------------------------------------------");

		System.out.println("\nracheal got increment");
		racheal.setSalary(140000);

		System.out.println("micheal got promotion\n");
		micheal.setDesignation("Lead Developer").setSalary(90000);

		System.out.println(racheal);
		System.out.println(micheal);
		System.out.println();

		caretaker.addMemento(racheal.getEmpId(), "Saved at increment", racheal.createMemento());
		caretaker.addMemento(micheal.getEmpId(), "Saved at promotion", micheal.createMemento());

		System.out.println("------------------------------------------------------------------");

		System.out.println("\nLet's print the stored memento objects we have");
		caretaker.printStoredMementoObjects();

		System.out.println("\nnow for some reason, we like to revert racheal to initial stage.");
		System.out.println("and micheal to android project.\n");

		racheal.restore(caretaker.getMemento(racheal.getEmpId(), "Saved at intitial stage"));
		micheal.restore(caretaker.getMemento(micheal.getEmpId(), "Saved at android project"));
		System.out.println();

		System.out.println(racheal);
		System.out.println(micheal);
	}
}
