package visitor.case3.ConcreteVisitor;

import visitor.case3.ConcreteElement.JsonElement;
import visitor.case3.ConcreteElement.XmlElement;
import visitor.case3.visitor.Visitor;

public class ElementVisitor implements Visitor {

	@Override
	public void visit(XmlElement xe) {
		System.out.println("processing xml element with uuid: " + xe.uuid);
	}

	@Override
	public void visit(JsonElement js) {
		System.out.println("processing json element with uuid: " + js.uuid);
	}
}
