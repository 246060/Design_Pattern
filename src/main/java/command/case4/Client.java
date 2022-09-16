package command.case4;

import command.case4.command.AlarmOnCommand;
import command.case4.command.LampOnCommand;

public class Client {

	// https://gmlwjd9405.github.io/2018/07/07/command-pattern.html
	public static void main(String[] args) {

		Button button = new Button();

		Lamp lamp = new Lamp();
		button.setCommand(new LampOnCommand(lamp));
		button.pressed();

		Alarm alarm = new Alarm();
		button.setCommand(new AlarmOnCommand(alarm));
		button.pressed();

	}
}
