package state.case1.state;


import state.case1.Player;

/**
 * Common interface for all states.
 */
abstract public class State {

	Player player;

	/**
	 * Context passes itself through the state constructor.
	 * This may help a state to fetch some useful context data if needed.
	 */

	State(Player player) {
		this.player = player;
	}

	abstract public String onLock();
	abstract public String onPlay();
	abstract public String onNext();
	abstract public String onPrevious();
}
