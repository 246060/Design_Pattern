package state.case6.ConcreteState;

import state.case6.Context.Context;
import state.case6.AbstractState.State;

public class StopState implements State {

	public void doAction(Context context) {
		System.out.println("Player is in stop state");
		context.setState(this);
	}

	public String toString() {
		return "Stop State";
	}
}
