package visitor.case4.visitable;

import visitor.case4.visitor.ComputerPartVisitor;

public interface ComputerPart {
	void accept(ComputerPartVisitor computerPartVisitor);
}
