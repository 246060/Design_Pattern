package chain_of_responsibility.case5;

import chain_of_responsibility.case5.ConcreteHandler.ConsoleBasedLogger;
import chain_of_responsibility.case5.ConcreteHandler.DebugBasedLogger;
import chain_of_responsibility.case5.ConcreteHandler.ErrorBasedLogger;
import chain_of_responsibility.case5.Handler.Logger;

public class Client {

	private static Logger doChaining() {
		Logger consoleLogger = new ConsoleBasedLogger(Logger.OUTPUTINFO);

		Logger errorLogger = new ErrorBasedLogger(Logger.ERRORINFO);
		consoleLogger.setNextLevelLogger(errorLogger);

		Logger debugLogger = new DebugBasedLogger(Logger.DEBUGINFO);
		errorLogger.setNextLevelLogger(debugLogger);

		return consoleLogger;
	}

	public static void main(String[] args) {

		Logger chainLogger = doChaining();

		chainLogger.logMessage(Logger.OUTPUTINFO, "Enter the sequence of values ");
		chainLogger.logMessage(Logger.ERRORINFO, "An error is occured now");
		chainLogger.logMessage(Logger.DEBUGINFO, "This was the error now debugging is compeled");
	}

}
