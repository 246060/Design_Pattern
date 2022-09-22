package flyweight.case3.flyweight_factory;

import flyweight.case3.concrete_flyweight.Car;
import flyweight.case3.Engine;
import flyweight.case3.flyweight.Vehicle;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class VehicleFactory {

	private static Map<Color, Vehicle> vehiclesCache = new HashMap<Color, Vehicle>();

	private VehicleFactory() {
	}

	public static Vehicle createVehicle(Color color) {

		// Looks for the requested vehicle into the cache.
		// If the vehicle doesn't exist, a new one is created.
		Vehicle newVehicle = vehiclesCache.computeIfAbsent(color, newColor -> {
			// Creates the new car.
			Engine newEngine = new Engine();
			return new Car(newEngine, newColor);
		});
		return newVehicle;
	}
}
