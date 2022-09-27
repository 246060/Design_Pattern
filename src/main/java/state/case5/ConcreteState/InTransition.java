package state.case5.ConcreteState;

import state.case5.AbstractState.PackageState;
import state.case5.Context.DeliveryContext;

public class InTransition implements PackageState {

	//Singleton
	private static InTransition instance = new InTransition();

	private InTransition() {
	}

	public static InTransition instance() {
		return instance;
	}

	//Business logic and state transition
	@Override
	public void updateState(DeliveryContext ctx) {
		System.out.println("Package is in transition !!");
		ctx.setCurrentState(OutForDelivery.instance());
	}
}