package command.case8.ConcreteCommand;

import command.case8.Command.ICommand;
import command.case8.Receiver.Fan;

public class StartFanCommand implements ICommand {

	Fan fan;

	public StartFanCommand(Fan fan) {
		super();
		this.fan = fan;
	}

	public void execute() {
		System.out.println("starting Fan.");
		fan.start();
	}
}
