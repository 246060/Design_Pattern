package command.case8.ConcreteCommand;

import command.case8.Command.ICommand;
import command.case8.Receiver.Light;

public class TurnOnLightCommand implements ICommand {

	Light light;

	public TurnOnLightCommand(Light light) {
		super();
		this.light = light;
	}

	public void execute() {
		System.out.println("Turning on light.");
		light.turnOn();
	}
}