package visitor.case4.Element;

import visitor.case4.visitor.ComputerPartVisitor;

public interface ComputerPart {
	void accept(ComputerPartVisitor computerPartVisitor);
}
