package command.case4.ConcreteCommand;

import command.case4.Receiver.Alarm;
import command.case4.Command.Command;

public class AlarmOnCommand implements Command {

	private Alarm alarm;

	public AlarmOnCommand(Alarm alarm) {
		this.alarm = alarm;
	}

	@Override
	public void execute() {
		alarm.on();
	}
}
