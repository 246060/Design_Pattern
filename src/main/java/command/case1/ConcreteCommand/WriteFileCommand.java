package command.case1.ConcreteCommand;

import command.case1.Command.Command;
import command.case1.Receiver.FileSystemReceiver;

public class WriteFileCommand implements Command {

	private FileSystemReceiver fileSystem;

	public WriteFileCommand(FileSystemReceiver fileSystem) {
		this.fileSystem = fileSystem;
	}

	@Override
	public void execute() {
		this.fileSystem.writeFile();
	}
}
