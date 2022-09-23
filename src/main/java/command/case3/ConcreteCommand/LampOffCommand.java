package command.case3.ConcreteCommand;

import command.case3.Command.Command;
import command.case3.ConcreteReceiver.Lamp;

public class LampOffCommand implements Command {

	private Lamp lamp;

	public LampOffCommand(Lamp lamp) {
		this.lamp = lamp;
	}

	@Override
	public void execute() {
		lamp.off();
	}
}
