package state.case5.ConcreteState;

import state.case5.AbstractState.PackageState;
import state.case5.Context.DeliveryContext;

public class Shipped implements PackageState {

	//Singleton
	private static Shipped instance = new Shipped();

	private Shipped() {
	}

	public static Shipped instance() {
		return instance;
	}

	//Business logic and state transition
	@Override
	public void updateState(DeliveryContext ctx) {
		System.out.println("Package is shipped !!");
		ctx.setCurrentState(InTransition.instance());
	}
}
