package mediator.case5;

import mediator.case5.ConcreteComponent.Button;
import mediator.case5.ConcreteComponent.Heater;
import mediator.case5.ConcreteComponent.Machine;
import mediator.case5.ConcreteComponent.Valve;
import mediator.case5.ConcreteMediator.CottonMediator;
import mediator.case5.ConcreteMediator.DenimMediator;
import mediator.case5.Mediador.MachineMediator;

public class Client {

	public static void main(String[] args) {

		Sensor sensor = new Sensor();
		SoilRemoval soilRemoval = new SoilRemoval();
		Motor motor = new Motor();

		Button button = new Button();
		Machine machine = new Machine();
		Heater heater = new Heater();
		Valve valve = new Valve();

		MachineMediator mediator = null;

		mediator = new CottonMediator(machine, heater, motor, sensor, soilRemoval, valve);

		button.setMediator(mediator);
		machine.setMediator(mediator);
		heater.setMediator(mediator);
		valve.setMediator(mediator);

		button.press();

		System.out.println("******************************************************************************");

		mediator = new DenimMediator(machine, heater, motor, sensor, soilRemoval, valve);

		button.setMediator(mediator);
		machine.setMediator(mediator);
		heater.setMediator(mediator);
		valve.setMediator(mediator);

		button.press();

	}
}
