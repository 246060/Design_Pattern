package decorator.case1.decorator;

import decorator.case1.Car;

public class SportsCar extends CarDecorator {

	public SportsCar(Car c) {
		super(c);
	}

	@Override
	public void assemble() {
		super.assemble();
		System.out.print(" + Adding features of Sports Car.");
	}
}
