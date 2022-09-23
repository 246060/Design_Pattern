package state.case1.AbstractState;


import state.case1.Context.Player;

/**
 * Common interface for all states.
 */
abstract public class State {

	protected Player player;

	/**
	 * Context passes itself through the state constructor.
	 * This may help a state to fetch some useful context data if needed.
	 */

	protected State(Player player) {
		this.player = player;
	}

	abstract public String onLock();
	abstract public String onPlay();
	abstract public String onNext();
	abstract public String onPrevious();
}
