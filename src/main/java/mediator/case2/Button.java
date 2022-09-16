package mediator.case2;

public class Button {

	private Mediator mediator;

	public Button(Mediator mediator) {
		this.mediator = mediator;
	}

	public void setMediator(Mediator mediator) {
		this.mediator = mediator;
	}

	public void press() {
		this.mediator.press();
	}
}
