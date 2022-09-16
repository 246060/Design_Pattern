package state.case2.state;

import state.case2.Chain;

public class State {

	public void pull(Chain wrapper) {
		wrapper.setState(new Off());
		System.out.println("   turning off");
	}
}
