package mediator.case2.Component;

import mediator.case2.Mediador.Mediator;

public class Fan {

	private Mediator mediator;
	private boolean isOn = false;

	public void setMediator(Mediator mediator) {
		this.mediator = mediator;
	}

	public boolean isOn() {
		return isOn;
	}

	public void turnOn() {
		this.mediator.start();
		this.isOn = true;
	}

	public void turnOff() {
		this.mediator.stop();
		this.isOn = false;
	}
}
