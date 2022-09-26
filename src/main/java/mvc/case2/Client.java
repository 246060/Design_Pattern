package mvc.case2;

import mvc.case2.controller.GiantController;
import mvc.case2.model.GiantModel;
import mvc.case2.view.GiantView;

public class Client {

	public static void main(String[] args) {

		var giant = new GiantModel(Health.HEALTHY, Fatigue.ALERT, Nourishment.SATURATED);
		var view = new GiantView();
		var controller = new GiantController(giant, view);

		controller.updateView();

		// controller receives some interactions that affect the giant
		controller.setHealth(Health.WOUNDED);
		controller.setNourishment(Nourishment.HUNGRY);
		controller.setFatigue(Fatigue.TIRED);

		controller.updateView();
	}
}
