package abstract_factory.case3.factory;

import abstract_factory.case3.Computer;

public class ComputerFactory {

	public static Computer getComputer(ComputerAbstractFactory factory) {
		return factory.createComputer();
	}
}
