package chain_of_responsibility.case5.ConcreteHandler;

import chain_of_responsibility.case5.Handler.Logger;

public class DebugBasedLogger extends Logger {

	public DebugBasedLogger(int levels) {
		this.levels = levels;
	}

	@Override
	protected void displayLogInfo(String msg) {
		System.out.println("DEBUG LOGGER INFO: " + msg);
	}
}