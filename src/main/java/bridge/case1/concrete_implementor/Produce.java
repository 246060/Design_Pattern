package bridge.case1.concrete_implementor;

import bridge.case1.implementor.Workshop;

public class Produce implements Workshop {

	@Override
	public void work() {
		System.out.println("Produced");
	}
}
