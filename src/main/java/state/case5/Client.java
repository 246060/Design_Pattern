package state.case5;

import state.case5.Context.Controller;

public class Client {

	public static void main(String[] args) {

		Controller controller = new Controller();

		System.out.println();
		controller.setManagementConnection();

		controller.open();
		controller.log();
		controller.close();
		controller.update();


		System.out.println();
		controller.setSalesConnection();

		controller.open();
		controller.log();
		controller.close();
		controller.update();


		System.out.println();
		controller.setAccountingConnection();

		controller.open();
		controller.log();
		controller.close();
		controller.update();

	}

}
