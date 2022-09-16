package state.case3.state;

public class ON extends State {

	private static ON instance = new ON();

	private ON() {
	}

	public static State instance() {
		return instance;
	}
}
