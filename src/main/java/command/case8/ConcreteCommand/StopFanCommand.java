package command.case8.ConcreteCommand;

import command.case8.Command.ICommand;
import command.case8.Receiver.Fan;

public class StopFanCommand implements ICommand {

	Fan fan;

	public StopFanCommand(Fan fan) {
		super();
		this.fan = fan;
	}

	public void execute() {
		System.out.println("stopping Fan.");
		fan.stop();
	}
}
