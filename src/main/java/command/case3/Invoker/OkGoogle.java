package command.case3.Invoker;

import command.case3.Command.Command;

// invoker
public class OkGoogle {

	private Command command;

	public void setCommand(Command command) {
		this.command = command;
	}

	public OkGoogle() {

	}

	public OkGoogle(Command command) {
		this.command = command;
	}

	public void talk() {
		if (command != null) {
			command.execute();
		}
	}
}
