package visitor.case2.ConcreteElement;

import visitor.case2.Element.Element;
import visitor.case2.visitor.Visitor;

public class FOO implements Element {

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

	public String getFOO() {
		return "FOO";
	}
}
