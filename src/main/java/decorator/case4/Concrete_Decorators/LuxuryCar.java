package decorator.case4.Concrete_Decorators;

import decorator.case4.Component_Interface.Car;
import decorator.case4.Decorator.CarDecorator;

public class LuxuryCar extends CarDecorator {

	public LuxuryCar(Car c) {
		super(c);
	}

	@Override
	public void assemble() {
		super.assemble();
		System.out.print(" Adding features of Luxury Car.");
	}
}
