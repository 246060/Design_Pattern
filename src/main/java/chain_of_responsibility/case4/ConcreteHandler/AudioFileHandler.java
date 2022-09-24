package chain_of_responsibility.case4.ConcreteHandler;

import chain_of_responsibility.case4.File;
import chain_of_responsibility.case4.Handler.Handler;

public class AudioFileHandler implements Handler<File> {

	private Handler next;
	private String name;

	public AudioFileHandler(String name) {
		this.name = name;
	}

	@Override
	public void next(Handler handler) {
		this.next = handler;
	}

	@Override
	public void process(File file) {
		if ("audio".equals(file.getType())) {
			System.out.println("Process and saving text file... by " + name);
		} else if (next != null) {
			System.out.println(name + " forwards request to " + next.getHandlerName());
		} else {
			System.out.println("file not supported.");
		}
	}

	@Override
	public String getHandlerName() {
		return this.name;
	}
}
