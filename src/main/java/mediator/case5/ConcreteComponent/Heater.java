package mediator.case5.ConcreteComponent;

import mediator.case5.Component.Colleague;
import mediator.case5.Mediador.MachineMediator;

public class Heater implements Colleague {

	private MachineMediator mediator;

	@Override
	public void setMediator(MachineMediator mediator) {
		this.mediator = mediator;
	}

	public void on(int temp) {
		System.out.println("Heater is on...");

		if (mediator.checkTemperature(temp)) {
			System.out.println("Temperature is set to " + temp);
			mediator.off();
		}
	}

	public void off() {
		System.out.println("Heater is off...");
		mediator.wash();
	}
}