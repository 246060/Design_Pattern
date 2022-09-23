package command.case4.Invoker;

import command.case4.Command.Command;

public class Button {

	private Command command;

	public void setCommand(Command command) {
		this.command = command;
	}

	public void pressed() {
		command.execute();
	}
}
