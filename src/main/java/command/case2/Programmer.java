package command.case2;

public class Programmer implements Command {

	@Override
	public void execute() {
		System.out.println("sell the bugs, charge extra for the fixes");
	}
}
