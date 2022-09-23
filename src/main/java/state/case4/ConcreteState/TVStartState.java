package state.case4.ConcreteState;

import state.case4.AbstractState.State;

public class TVStartState implements State {

	@Override
	public void doAction() {
		System.out.println("TV is turned ON");
	}

}