package visitor.case4.visitor;

import visitor.case4.ConcreteElement.Computer;
import visitor.case4.ConcreteElement.Keyboard;
import visitor.case4.ConcreteElement.Monitor;
import visitor.case4.ConcreteElement.Mouse;

public interface ComputerPartVisitor {
	void visit(Computer computer);
	void visit(Mouse mouse);
	void visit(Keyboard keyboard);
	void visit(Monitor moniter);
}
