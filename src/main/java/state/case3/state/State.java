package state.case3.state;

import state.case3.Button;

// 4. The "wrappee" hierarchy
public class State {

	// 5. Default behavior can go in the base class
	public void push(Button b) {
		b.setCurrent(OFF.instance());
		System.out.println("   turning OFF");
	}
}
