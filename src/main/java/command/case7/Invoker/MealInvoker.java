package command.case7.Invoker;

import command.case7.Command.Command;

public class MealInvoker {
	Command command;

	public MealInvoker(Command command) {
		this.command = command;
	}

	public void setCommand(Command command) {
		this.command = command;
	}

	public void invoke() {
		command.execute();
	}
}
