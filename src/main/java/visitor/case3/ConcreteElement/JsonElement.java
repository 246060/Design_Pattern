package visitor.case3.ConcreteElement;

import visitor.case3.Element.Element;
import visitor.case3.visitor.Visitor;

public class JsonElement extends Element {

	public JsonElement(String uuid) {
		super(uuid);
	}

	@Override
	public void accept(Visitor v) {
		v.visit(this);
	}
}
