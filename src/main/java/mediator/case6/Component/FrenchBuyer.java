package mediator.case6.Component;

import mediator.case6.Mediador.Mediator;

public class FrenchBuyer extends Buyer {

	public FrenchBuyer(Mediator mediator) {
		super(mediator, "euro");
		this.mediator.registerFrenchBuyer(this);
	}
}