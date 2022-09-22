package decorator.case1;

import decorator.case1.Component_Implementation.BasicCar;
import decorator.case1.Component_Interface.Car;
import decorator.case1.Concrete_Decorators.LuxuryCar;
import decorator.case1.Concrete_Decorators.SportsCar;

public class Client {

	// https://www.journaldev.com/1540/decorator-design-pattern-in-java-example
	public static void main(String[] args) {

		Car sportsCar = new SportsCar(new BasicCar());
		sportsCar.assemble();

		Car sportsLuxuryCar = new SportsCar(new LuxuryCar(new BasicCar()));
		sportsLuxuryCar.assemble();
	}
}
