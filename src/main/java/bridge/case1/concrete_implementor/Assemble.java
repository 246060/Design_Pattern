package bridge.case1.concrete_implementor;

import bridge.case1.implementor.Workshop;

public class Assemble implements Workshop {

	@Override
	public void work() {
		System.out.println("Assembled.");
	}
}
