package bridge.case1;

import bridge.case1.vehicle.Bike;
import bridge.case1.vehicle.Car;
import bridge.case1.vehicle.Vehicle;
import bridge.case1.workshop.Assemble;
import bridge.case1.workshop.Produce;

public class Client {
	/**
	 * bridge pattern : 추상화(기능)를 구현에서 분리하여 두 가지가 독립적으로 변할 수 있도록 하는 것
	 */
	public static void main(String[] args) {
		/**
		 * Vehicle: 기능
		 * Produce, Assemble: 구현
		 * */
		Vehicle vehicle1 = new Car(new Produce(), new Assemble());
		vehicle1.manufacture();

		Vehicle vehicle2 = new Bike(new Produce(), new Assemble());
		vehicle2.manufacture();
	}
}
