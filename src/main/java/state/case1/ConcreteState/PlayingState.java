package state.case1.ConcreteState;

import state.case1.AbstractState.State;
import state.case1.Context.Player;

public class PlayingState extends State {

	public PlayingState(Player player) {
		super(player);
	}

	@Override
	public String onLock() {
		player.changeState(new LockedState(player));
		player.setCurrentTrackAfterStop();
		return "Stop playing";
	}

	@Override
	public String onPlay() {
		player.changeState(new ReadyState(player));
		return "Paused...";
	}

	@Override
	public String onNext() {
		return player.nextTrack();
	}

	@Override
	public String onPrevious() {
		return player.previousTrack();
	}
}
