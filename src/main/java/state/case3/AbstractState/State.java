package state.case3.AbstractState;

import state.case3.Context.Button;
import state.case3.ConcreteState.OFF;

// 4. The "wrappee" hierarchy
public class State {

	// 5. Default behavior can go in the base class
	public void push(Button b) {
		b.setCurrent(OFF.instance());
		System.out.println("   turning OFF");
	}
}
