package command.case2.ConcreteCommand;

import command.case2.Command.Command;

public class Politician implements Command {

	@Override
	public void execute() {
		System.out.println("take money from the rich, take votes from the poor");
	}
}
