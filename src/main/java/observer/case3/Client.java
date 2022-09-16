package observer.case3;

import observer.case3.observer.Gates;
import observer.case3.observer.Lighting;
import observer.case3.observer.Surveillance;

public class Client {

	// https://sourcemaking.com/design_patterns/observer/java/2
	public static void main(String[] args) {

		SensorSystem sensorSystem = new SensorSystem();

		sensorSystem.register(new Gates());
		sensorSystem.register(new Lighting());
		sensorSystem.register(new Surveillance());

		sensorSystem.soundTheAlarm();
	}
}
