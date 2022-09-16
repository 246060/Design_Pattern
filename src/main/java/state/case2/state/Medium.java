package state.case2.state;

import state.case2.Chain;

public class Medium extends State {

	public void pull(Chain wrapper) {
		wrapper.setState(new High());
		System.out.println("   high speed");
	}
}
