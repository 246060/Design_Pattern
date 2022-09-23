package visitor.case4;

import visitor.case4.ConcreteElement.Computer;
import visitor.case4.ConcreteElement.Keyboard;
import visitor.case4.ConcreteElement.Monitor;
import visitor.case4.ConcreteElement.Mouse;
import visitor.case4.Element.ComputerPart;
import visitor.case4.ConcreteVisitor.ComputerPartDisplayVisitor;

public class Client {

	public static void main(String[] args) {

		ComputerPart computer = new Computer();
		computer.accept(new ComputerPartDisplayVisitor());
	}
}
