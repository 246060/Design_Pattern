package front_controller_pattern.case2;

import front_controller_pattern.case2.FrontController.FrontController;

public class Main {

	public static void main(String[] args) {

		var controller = new FrontController();

		controller.handleRequest("Archer");
		controller.handleRequest("Catapult");
		controller.handleRequest("foobar");
	}
}
