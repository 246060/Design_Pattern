package bridge.case8;

import bridge.case8.refined_abstraction.BigBus;
import bridge.case8.refined_abstraction.SmallCar;
import bridge.case8.abstraction.Vehicle;
import bridge.case8.concrete_implementor.BigEngine;
import bridge.case8.concrete_implementor.SmallEngine;

public class Client {
	public static void main(String[] args) {
		Vehicle vehicle = null;

		vehicle = new BigBus(new SmallEngine());
		vehicle.drive();

		vehicle.setEngine(new BigEngine());
		vehicle.drive();

		System.out.println("-----------------------------------------------------");

		vehicle = new SmallCar(new SmallEngine());
		vehicle.drive();

		vehicle.setEngine(new BigEngine());
		vehicle.drive();
	}
}
