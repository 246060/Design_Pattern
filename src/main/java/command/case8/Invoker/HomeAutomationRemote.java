package command.case8.Invoker;

import command.case8.Command.ICommand;

public class HomeAutomationRemote {

	//Command Holder
	ICommand command;

	//Set the command in runtime to trigger.
	public void setCommand(ICommand command) {
		this.command = command;
	}

	//Will call the command interface method so that particular command can be invoked.
	public void buttonPressed() {
		command.execute();
	}
}
