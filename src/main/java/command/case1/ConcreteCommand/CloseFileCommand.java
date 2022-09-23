package command.case1.ConcreteCommand;

import command.case1.Command.Command;
import command.case1.Receiver.FileSystemReceiver;

public class CloseFileCommand implements Command {

	private FileSystemReceiver fileSystem;

	public CloseFileCommand(FileSystemReceiver fileSystem) {
		this.fileSystem = fileSystem;
	}

	@Override
	public void execute() {
		this.fileSystem.closeFile();
	}
}
