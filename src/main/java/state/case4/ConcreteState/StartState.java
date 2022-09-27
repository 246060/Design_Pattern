package state.case4.ConcreteState;

import state.case4.Context.Context;
import state.case4.AbstractState.State;

public class StartState implements State {

	public void doAction(Context context) {
		System.out.println("Player is in start state");
		context.setState(this);
	}

	public String toString(){
		return "Start State";
	}
}
