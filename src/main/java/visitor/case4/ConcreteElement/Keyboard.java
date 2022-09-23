package visitor.case4.ConcreteElement;

import visitor.case4.Element.ComputerPart;
import visitor.case4.visitor.ComputerPartVisitor;

public class Keyboard implements ComputerPart {

	@Override
	public void accept(ComputerPartVisitor computerPartVisitor) {
		computerPartVisitor.visit(this);
	}
}
