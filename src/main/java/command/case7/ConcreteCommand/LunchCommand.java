package command.case7.ConcreteCommand;

import command.case7.Command.Command;
import command.case7.Receiver.Lunch;

public class LunchCommand implements Command {

	Lunch lunch;

	public LunchCommand(Lunch lunch) {
		this.lunch = lunch;
	}

	@Override
	public void execute() {
		lunch.makeLunch();
	}

}
