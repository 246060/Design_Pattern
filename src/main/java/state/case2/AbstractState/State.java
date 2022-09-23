package state.case2.AbstractState;

import state.case2.Context.Chain;
import state.case2.ConcreteState.Off;

public class State {

	public void pull(Chain wrapper) {
		wrapper.setState(new Off());
		System.out.println("   turning off");
	}
}
