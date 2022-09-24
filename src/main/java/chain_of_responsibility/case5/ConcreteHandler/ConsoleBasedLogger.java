package chain_of_responsibility.case5.ConcreteHandler;

import chain_of_responsibility.case5.Handler.Logger;

public class ConsoleBasedLogger extends Logger {

	public ConsoleBasedLogger(int levels) {
		this.levels = levels;
	}

	@Override
	protected void displayLogInfo(String msg) {
		System.out.println("CONSOLE LOGGER INFO: " + msg);
	}
}