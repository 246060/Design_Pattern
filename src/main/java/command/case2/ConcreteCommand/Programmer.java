package command.case2.ConcreteCommand;

import command.case2.Command.Command;

public class Programmer implements Command {

	@Override
	public void execute() {
		System.out.println("sell the bugs, charge extra for the fixes");
	}
}
