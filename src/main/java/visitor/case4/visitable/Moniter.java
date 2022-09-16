package visitor.case4.visitable;

import visitor.case4.visitor.ComputerPartVisitor;

public class Moniter implements ComputerPart {

	@Override
	public void accept(ComputerPartVisitor computerPartVisitor) {
		computerPartVisitor.visit(this);
	}
}
