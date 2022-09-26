package front_controller_pattern.case2.FrontController;

import front_controller_pattern.case2.ApplicationException;
import front_controller_pattern.case2.Command.Command;
import front_controller_pattern.case2.Command.UnknownCommand;

public class FrontController {

	public void handleRequest(String request) {
		var command = getCommand(request);
		command.process();
	}

	private Command getCommand(String request) {
		var commandClass = getCommandClass(request);
		try {
			return (Command) commandClass.newInstance();
		} catch (Exception e) {
			throw new ApplicationException(e);
		}
	}

	private static Class<?> getCommandClass(String request) {
		try {
			return Class.forName("front_controller_pattern.case2.Command." + request + "Command");
		} catch (ClassNotFoundException e) {
			return UnknownCommand.class;
		}
	}
}
