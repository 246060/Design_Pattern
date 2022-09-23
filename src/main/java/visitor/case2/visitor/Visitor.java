package visitor.case2.visitor;

import visitor.case2.ConcreteElement.BAR;
import visitor.case2.ConcreteElement.BAZ;
import visitor.case2.ConcreteElement.FOO;

public interface Visitor {
	void visit(FOO foo);
	void visit(BAR bar);
	void visit(BAZ baz);
}
