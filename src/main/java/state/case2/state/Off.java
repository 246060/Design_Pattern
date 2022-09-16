package state.case2.state;

import state.case2.Chain;

public class Off extends State {

	public void pull(Chain wrapper) {
		wrapper.setState(new Low());
		System.out.println("   low speed");
	}
}
