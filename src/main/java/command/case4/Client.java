package command.case4;

import command.case4.ConcreteCommand.AlarmOnCommand;
import command.case4.ConcreteCommand.LampOnCommand;
import command.case4.Invoker.Button;
import command.case4.Receiver.Alarm;
import command.case4.Receiver.Lamp;

public class Client {

	// https://gmlwjd9405.github.io/2018/07/07/command-pattern.html
	public static void main(String[] args) {

		Button button = new Button();

		button.setCommand(new LampOnCommand(new Lamp()));
		button.pressed();

		button.setCommand(new AlarmOnCommand(new Alarm()));
		button.pressed();

	}
}
