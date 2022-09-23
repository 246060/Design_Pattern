package state.case3.ConcreteState;

import state.case3.AbstractState.State;

public class ON extends State {

	private static ON instance = new ON();

	private ON() {
	}

	public static State instance() {
		return instance;
	}
}
