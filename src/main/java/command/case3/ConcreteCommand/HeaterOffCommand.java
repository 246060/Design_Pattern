package command.case3.ConcreteCommand;


import command.case3.Command.Command;
import command.case3.ConcreteReceiver.Heater;

public class HeaterOffCommand implements Command {

	private Heater heater;

	public HeaterOffCommand(Heater heater) {
		this.heater = heater;
	}

	@Override
	public void execute() {
		heater.off();
	}
}
