package visitor.case4.visitable;

import visitor.case4.visitor.ComputerPartVisitor;

public class Computer implements ComputerPart {

	private ComputerPart[] parts;

	public Computer() {
		parts = new ComputerPart[]{new Mouse(), new Keyboard(), new Moniter()};
	}

	@Override
	public void accept(ComputerPartVisitor computerPartVisitor) {
		for (ComputerPart part : parts) {
			part.accept(computerPartVisitor);
		}

		computerPartVisitor.visit(this);
	}
}
