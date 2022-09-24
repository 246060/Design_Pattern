package mediator.case6.Component;

import mediator.case6.Mediador.Mediator;

public class SwedishBuyer extends Buyer {

	public SwedishBuyer(Mediator mediator) {
		super(mediator, "krona");
		this.mediator.registerSwedishBuyer(this);
	}
}
