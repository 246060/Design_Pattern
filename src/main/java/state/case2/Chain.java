package state.case2;

import state.case2.state.Off;
import state.case2.state.State;

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
