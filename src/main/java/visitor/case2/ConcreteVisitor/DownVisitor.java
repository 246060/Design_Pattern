package visitor.case2.ConcreteVisitor;

import visitor.case2.ConcreteElement.BAR;
import visitor.case2.ConcreteElement.BAZ;
import visitor.case2.ConcreteElement.FOO;
import visitor.case2.visitor.Visitor;

public class DownVisitor implements Visitor {

	@Override
	public void visit(FOO foo) {
		System.out.println("do Down on " + foo.getFOO());
	}

	@Override
	public void visit(BAR bar) {
		System.out.println("do Down on " + bar.getBAR());
	}

	@Override
	public void visit(BAZ baz) {
		System.out.println("do Down on " + baz.getBAZ());
	}
}
