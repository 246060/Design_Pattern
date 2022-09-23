package state.case6.ConcreteState;

import state.case6.Context.Context;
import state.case6.AbstractState.State;

public class StartState implements State {

	public void doAction(Context context) {
		System.out.println("Player is in start state");
		context.setState(this);
	}

	public String toString(){
		return "Start State";
	}
}
