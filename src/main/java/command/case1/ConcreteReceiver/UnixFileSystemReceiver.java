package command.case1.ConcreteReceiver;

import command.case1.Receiver.FileSystemReceiver;

public class UnixFileSystemReceiver implements FileSystemReceiver {

	@Override
	public void openFile() {
		System.out.println("Opening File in Unix OS");
	}

	@Override
	public void writeFile() {
		System.out.println("writing File in Unix OS");
	}

	@Override
	public void closeFile() {
		System.out.println("Closing File in Unix OS");

	}
}
