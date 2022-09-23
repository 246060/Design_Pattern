package command.case3.ConcreteCommand;


import command.case3.Command.Command;
import command.case3.ConcreteReceiver.Heater;

public class HeaterOnCommand implements Command {

	private Heater heater;

	public HeaterOnCommand(Heater heater) {
		this.heater = heater;
	}

	@Override
	public void execute() {
		heater.on();
	}
}
