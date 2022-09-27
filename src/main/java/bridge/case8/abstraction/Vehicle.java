package bridge.case8.abstraction;


import bridge.case8.implementor.Engine;

public abstract class Vehicle {

	protected Engine engine;
	protected int weightInKilos;

	public abstract void drive();

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public void reportOnSpeed(int horsepower) {

		int ratio = weightInKilos / horsepower;

		if (ratio < 3) {
			System.out.println("The vehicle is going at a fast speed.");

		} else if ((ratio >= 3) && (ratio < 8)) {
			System.out.println("The vehicle is going an average speed.");

		} else {
			System.out.println("The vehicle is going at a slow speed.");
		}
	}
}

