package state.case2.Context;

import state.case2.ConcreteState.Off;
import state.case2.AbstractState.State;

public class Chain {

	private State current;

	public Chain() {
		current = new Off();
	}

	public void setState(State state) {
		current = state;
	}

	public void pull() {
		current.pull(this);
	}
}
