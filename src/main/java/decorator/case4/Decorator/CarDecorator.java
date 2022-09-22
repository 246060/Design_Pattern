package decorator.case4.Decorator;

import decorator.case4.Component_Interface.Car;

public class CarDecorator implements Car {

	protected Car car;

	public CarDecorator(Car c) {
		this.car = c;
	}

	@Override
	public void assemble() {
		this.car.assemble();
	}
}
