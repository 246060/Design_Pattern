package visitor.case3.Element;

import visitor.case3.visitor.Visitor;

abstract public class Element {

	public String uuid;

	public Element(String uuid) {
		this.uuid = uuid;
	}

	abstract public void accept(Visitor v);

}
