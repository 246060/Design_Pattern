package memento.case2.Originator;


import memento.case2.Memento.Memento;

public class NowPlaying {

	private String currentSong;

	public void play(String song) {
		this.currentSong = song;
	}

	private String getCurrentSong() {
		return currentSong;
	}

	public Memento save() {
		return new Memento(getCurrentSong());
	}

	public void previous(Memento memento) {
		this.currentSong = memento.getSong();
	}

	@Override
	public String toString() {
		return "Now playing: " + currentSong;
	}
}
