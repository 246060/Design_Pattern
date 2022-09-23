package memento.case2.Caretaker;

import memento.case2.Memento.Memento;
import memento.case2.Originator.NowPlaying;

import java.util.Stack;

public class PlayedHistory {

	Stack<Memento> history = new Stack<>();

	public void save(NowPlaying nowPlaying) {
		history.push(nowPlaying.save());
	}

	public void previous(NowPlaying nowPlaying) {

		if (!history.isEmpty()) {
			nowPlaying.previous(history.pop());

		} else {
			System.out.println("End of played history.");
		}
	}

}
