package decorator.case1.Concrete_Decorators;

import decorator.case1.Component_Interface.Car;
import decorator.case1.Decorator.CarDecorator;

public class LuxuryCar extends CarDecorator {

	public LuxuryCar(Car c) {
		super(c);
	}

	@Override
	public void assemble() {
		super.assemble();
		System.out.print(" + Adding features of Luxury Car.");
	}
}
