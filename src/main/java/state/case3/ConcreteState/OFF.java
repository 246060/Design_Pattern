package state.case3.ConcreteState;

import state.case3.AbstractState.State;
import state.case3.Context.Button;

public class OFF extends State {

	private static OFF instance = new OFF();

	private OFF() {
	}

	public static State instance() {
		return instance;
	}

	// 6. Override only the necessary methods
	public void push(Button b) {

		// 7. The "wrappee" may callback to the "wrapper"
		b.setCurrent(ON.instance());

		System.out.println("   turning ON");
	}
}
