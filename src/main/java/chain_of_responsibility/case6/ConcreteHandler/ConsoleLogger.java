package chain_of_responsibility.case6.ConcreteHandler;

import chain_of_responsibility.case6.Handler.AbstractLogger;

public class ConsoleLogger extends AbstractLogger {

	public ConsoleLogger(int level){
		this.level = level;
	}

	@Override
	protected void write(String message) {
		System.out.println("Standard Console::Logger: " + message);
	}
}
