package state.case5.ConcreteState;

import state.case5.AbstractState.PackageState;
import state.case5.Context.DeliveryContext;

public class Delivered implements PackageState {

	//Singleton
	private static Delivered instance = new Delivered();

	private Delivered() {
	}

	public static Delivered instance() {
		return instance;
	}

	//Business logic
	@Override
	public void updateState(DeliveryContext ctx) {
		System.out.println("Package is delivered!!");
	}
}
