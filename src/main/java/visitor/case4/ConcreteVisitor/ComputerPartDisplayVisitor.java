package visitor.case4.ConcreteVisitor;

import visitor.case4.ConcreteElement.Computer;
import visitor.case4.ConcreteElement.Keyboard;
import visitor.case4.ConcreteElement.Monitor;
import visitor.case4.ConcreteElement.Mouse;
import visitor.case4.visitor.ComputerPartVisitor;

public class ComputerPartDisplayVisitor implements ComputerPartVisitor {

	@Override
	public void visit(Computer computer) {
		System.out.println("Displaying Computer.");
	}

	@Override
	public void visit(Mouse mouse) {
		System.out.println("Displaying Mouse.");
	}

	@Override
	public void visit(Keyboard keyboard) {
		System.out.println("Displaying Keyboard.");
	}

	@Override
	public void visit(Monitor moniter) {
		System.out.println("Displaying Monitor.");
	}
}
