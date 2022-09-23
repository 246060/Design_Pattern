package memento.case2;

import memento.case2.Caretaker.PlayedHistory;
import memento.case2.Originator.NowPlaying;

public class Client {

	public static void main(String[] args) {

		PlayedHistory history = new PlayedHistory();
		NowPlaying nowPlaying = new NowPlaying();

		System.out.println("------------------------ Music playing ------------------------");

		nowPlaying.play("Sweet Child o' Mine");
		history.save(nowPlaying);
		System.out.println(nowPlaying);

		nowPlaying.play("Back In Black");
		history.save(nowPlaying);
		System.out.println(nowPlaying);

		nowPlaying.play("Disenchanted");
		history.save(nowPlaying);
		System.out.println(nowPlaying);

		nowPlaying.play("Say Amen");
		history.save(nowPlaying);
		System.out.println(nowPlaying);

		nowPlaying.play("House of Wolves");
		history.save(nowPlaying);
		System.out.println(nowPlaying);

		System.out.println("---------------- Going back to previous songs ----------------");

		history.previous(nowPlaying);
		System.out.println(nowPlaying);

		history.previous(nowPlaying);
		System.out.println(nowPlaying);

		history.previous(nowPlaying);
		System.out.println(nowPlaying);

		history.previous(nowPlaying);
		System.out.println(nowPlaying);

		history.previous(nowPlaying);
		System.out.println(nowPlaying);

		// 현재 곡에서 더이상 변화 없음
		history.previous(nowPlaying);
		System.out.println(nowPlaying);
		
	}
}
