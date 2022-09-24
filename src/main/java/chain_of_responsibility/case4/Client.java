package chain_of_responsibility.case4;

import chain_of_responsibility.case4.ConcreteHandler.*;
import chain_of_responsibility.case4.Handler.*;

public class Client {

	// https://www.javacodegeeks.com/2015/09/chain-of-responsibility-design-pattern-2.html

	public static void main(String[] args) {

		File file = null;

		Handler textHandler = new TextFileHandler("Text Handler");
		Handler docHandler = new DocFileHandler("Doc Handler");
		Handler excelHandler = new ExcelFileHandler("Excel Handler");
		Handler audioHandler = new AudioFileHandler("Audio Handler");
		Handler videoHandler = new VideoFileHandler("Video Handler");
		Handler imageHandler = new ImageFileHandler("Image Handler");

		textHandler.next(docHandler);
		docHandler.next(excelHandler);
		excelHandler.next(audioHandler);
		audioHandler.next(videoHandler);
		videoHandler.next(imageHandler);

		file = new File("Abc.mp3", "audio", "C:");
		textHandler.process(file);

		System.out.println("---------------------------------");

		file = new File("Abc.jpg", "video", "C:");
		textHandler.process(file);

		System.out.println("---------------------------------");

		file = new File("Abc.doc", "doc", "C:");
		textHandler.process(file);

		System.out.println("---------------------------------");

		file = new File("Abc.bat", "bat", "C:");
		textHandler.process(file);
	}
}
