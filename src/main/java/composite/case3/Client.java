package composite.case3;

import composite.case3.composite.Directory;
import composite.case3.leaf.File;

public class Client {

	public static StringBuilder compositeBuilder = new StringBuilder();

	// https://sourcemaking.com/design_patterns/composite/java/1
	public static void main(String[] args) {

		Directory music = new Directory("MUSIC");
		Directory scorpions = new Directory("SCORPIONS");
		Directory dio = new Directory("DIO");

		File track1 = new File("Don't wary, be happy.mp3");
		File track2 = new File("track2.m3u");
		File track3 = new File("Wind of change.mp3");
		File track4 = new File("Big city night.mp3");
		File track5 = new File("Rainbow in the dark.mp3");

		music.add(track1);
		music.add(track2);
		music.add(scorpions);

		scorpions.add(track3);
		scorpions.add(track4);
		scorpions.add(dio);
		dio.add(track5);

		music.ls();
	}
}
