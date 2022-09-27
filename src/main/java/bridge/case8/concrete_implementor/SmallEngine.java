package bridge.case8.concrete_implementor;

import bridge.case8.implementor.Engine;

public class SmallEngine implements Engine {

	int horsepower;

	public SmallEngine() {
		horsepower = 100;
	}

	@Override
	public int go() {
		System.out.println("The small engine is running");
		return horsepower;
	}

}