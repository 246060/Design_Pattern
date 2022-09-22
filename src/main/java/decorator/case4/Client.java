package decorator.case4;

import decorator.case4.Component_Implementation.BasicCar;
import decorator.case4.Component_Interface.Car;
import decorator.case4.Concrete_Decorators.LuxuryCar;
import decorator.case4.Concrete_Decorators.SportsCar;

public class Client {

	public static void main(String[] args) {

		Car sportsCar = new SportsCar(new BasicCar());
		sportsCar.assemble();

		System.out.println("\n*****");

		Car sportsLuxuryCar = new SportsCar(new LuxuryCar(new BasicCar()));
		sportsLuxuryCar.assemble();
	}

}
