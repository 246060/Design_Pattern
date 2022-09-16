package decorator.case1;

public class Client {

	// https://www.journaldev.com/1540/decorator-design-pattern-in-java-example
	public static void main(String[] args) {

		Car sportsCar = new SportsCar(new BasicCar());
		sportsCar.assemble();

		Car sportsLuxuryCar = new SportsCar(new LuxuryCar(new BasicCar()));
		sportsLuxuryCar.assemble();
	}
}
