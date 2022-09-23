package command.case1.Invoker;

import command.case1.Command.Command;

public class FileInvoker {

	public Command command;

	public FileInvoker(Command command) {
		this.command = command;
	}

	public void execute() {
		this.command.execute();
	}
}
