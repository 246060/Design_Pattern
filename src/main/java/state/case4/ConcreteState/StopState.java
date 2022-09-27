package state.case4.ConcreteState;

import state.case4.Context.Context;
import state.case4.AbstractState.State;

public class StopState implements State {

	public void doAction(Context context) {
		System.out.println("Player is in stop state");
		context.setState(this);
	}

	public String toString() {
		return "Stop State";
	}
}
