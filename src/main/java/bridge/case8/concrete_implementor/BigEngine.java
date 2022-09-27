package bridge.case8.concrete_implementor;

import bridge.case8.implementor.Engine;

public class BigEngine implements Engine {

	int horsepower;

	public BigEngine() {
		horsepower = 350;
	}

	@Override
	public int go() {
		System.out.println("The big engine is running");
		return horsepower;
	}

}
