package command.case4.ConcreteCommand;

import command.case4.Command.Command;
import command.case4.Receiver.Lamp;

public class LampOnCommand implements Command {

	private Lamp lamp;

	public LampOnCommand(Lamp lamp) {
		this.lamp = lamp;
	}

	@Override
	public void execute() {
		lamp.on();
	}
}
