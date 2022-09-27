package command.case7.ConcreteCommand;

import command.case7.Command.Command;
import command.case7.Receiver.Dinner;

public class DinnerCommand implements Command {

	Dinner dinner;

	public DinnerCommand(Dinner dinner) {
		this.dinner = dinner;
	}

	@Override
	public void execute() {
		dinner.makeDinner();
	}

}
