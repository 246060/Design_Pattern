package state.case2.ConcreteState;

import state.case2.AbstractState.State;
import state.case2.Context.Chain;

public class Medium extends State {

	public void pull(Chain wrapper) {
		wrapper.setState(new High());
		System.out.println("   high speed");
	}
}
