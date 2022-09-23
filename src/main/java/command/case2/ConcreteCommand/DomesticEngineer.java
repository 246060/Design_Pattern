package command.case2.ConcreteCommand;

import command.case2.Command.Command;

public class DomesticEngineer implements Command {

	@Override
	public void execute() {
		System.out.println("take out the trash");
	}
}
