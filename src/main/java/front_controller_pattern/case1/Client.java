package front_controller_pattern.case1;

import front_controller_pattern.case1.FrontController.FrontController;

public class Client {

	public static void main(String[] args) {

		FrontController frontController = new FrontController();
		frontController.dispatchRequest("HOME");
		frontController.dispatchRequest("STUDENT");
	}
}
