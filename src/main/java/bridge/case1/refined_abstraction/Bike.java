package bridge.case1.refined_abstraction;

import bridge.case1.abstraction.Vehicle;
import bridge.case1.implementor.Workshop;

public class Bike extends Vehicle {

	public Bike(Workshop workshop1, Workshop workshop2) {
		super(workshop1, workshop2);
	}

	@Override
	public void manufacture() {
		System.out.println("Bike manufacture");
		workshop1.work();
		workshop2.work();
	}
}
