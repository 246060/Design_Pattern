package command.case3;

import command.case3.command.HeaterOnCommand;
import command.case3.command.LampOffCommand;
import command.case3.command.LampOnCommand;

public class Client {

	// https://victorydntmd.tistory.com/295
	public static void main(String[] args) {

		// invoker
		OkGoogle okGoogle = new OkGoogle();

		// receiver
		Lamp lamp = new Lamp();

		// command
		okGoogle.setCommand(new LampOnCommand(lamp));
		okGoogle.talk();

		okGoogle.setCommand(new LampOffCommand(lamp));
		okGoogle.talk();


		Heater heater = new Heater(); // receiver
		okGoogle.setCommand(new HeaterOnCommand(heater));
		okGoogle.talk();

		okGoogle.setCommand(new HeaterOnCommand(heater));
		okGoogle.talk();

	}
}
