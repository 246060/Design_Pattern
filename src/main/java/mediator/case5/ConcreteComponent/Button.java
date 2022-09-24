package mediator.case5.ConcreteComponent;

import mediator.case5.Component.Colleague;
import mediator.case5.Mediador.MachineMediator;

public class Button implements Colleague {

	private MachineMediator mediator;

	@Override
	public void setMediator(MachineMediator mediator) {
		this.mediator = mediator;
	}

	public void press() {
		System.out.println("Button pressed.");
		mediator.start();
	}

}