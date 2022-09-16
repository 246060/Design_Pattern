package command.case4;

import command.case4.command.Command;

// invoker
public class Button {
	private Command command;

	public void setCommand(Command command) {
		this.command = command;
	}

	public void pressed() {
		command.execute();
	}
}
