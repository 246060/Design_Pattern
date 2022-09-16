package visitor.case3.visitable;

import visitor.case3.visitor.Visitor;

public class XmlElement extends Element {

	public XmlElement(String uuid) {
		super(uuid);
	}

	@Override
	public void accept(Visitor v) {
		v.visit(this);
	}
}
