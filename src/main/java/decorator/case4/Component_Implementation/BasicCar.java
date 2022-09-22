package decorator.case4.Component_Implementation;

import decorator.case4.Component_Interface.Car;

public class BasicCar implements Car {

	@Override
	public void assemble() {
		System.out.print("Basic Car.");
	}
}
