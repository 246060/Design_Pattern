package flyweight.case3;

import flyweight.case3.flyweight.Vehicle;
import flyweight.case3.flyweight_factory.VehicleFactory;

import java.awt.*;

public class Client {

	public static void main(String[] args) {

		Vehicle vehicle1 = VehicleFactory.createVehicle(Color.BLACK);

		vehicle1.start();
		vehicle1.stop();
		Color color = vehicle1.getColor();
		System.out.println("color = " + color);


		System.out.println("-------------------------------");

		Vehicle vehicle2 = VehicleFactory.createVehicle(Color.BLACK);

		vehicle2.start();
		vehicle2.stop();
		color = vehicle2.getColor();
		System.out.println("color = " + color);


		System.out.println("\nvehicle1 == vehicle2 ? " + (vehicle1 == vehicle2));
	}
}
