package state.case2.ConcreteState;

import state.case2.AbstractState.State;
import state.case2.Context.Chain;

public class Off extends State {

	public void pull(Chain wrapper) {
		wrapper.setState(new Low());
		System.out.println("   low speed");
	}
}
