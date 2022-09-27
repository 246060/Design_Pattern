package command.case8.ConcreteCommand;

import command.case8.Command.ICommand;
import command.case8.Receiver.Light;

public class TurnOffLightCommand implements ICommand {

	Light light;

	public TurnOffLightCommand(Light light) {
		super();
		this.light = light;
	}

	public void execute() {
		System.out.println("Turning off light.");
		light.turnOff();
	}
}