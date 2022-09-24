package mediator.case2.Component;

import mediator.case2.Mediador.Mediator;

public class Button {

	private Mediator mediator;

	public void setMediator(Mediator mediator) {
		this.mediator = mediator;
	}

	public void press() {
		this.mediator.press();
	}
}
