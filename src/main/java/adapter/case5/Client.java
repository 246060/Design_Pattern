package adapter.case5;

public class Client {

	public static void main(String[] args) {

		/**
		 * 구성을 이용한 Object Adapter 방식
		 * */

		AudioPlayer audioPlayer = new AudioPlayer();

		audioPlayer.play("mp3", "beyond the horizon.mp3");
		audioPlayer.play("mp4", "alone.mp4");
		audioPlayer.play("vlc", "far far away.vlc");
		audioPlayer.play("avi", "mind me.avi");

	}

}
