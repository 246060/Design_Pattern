package visitor.case3.visitor;

import visitor.case3.visitable.JsonElement;
import visitor.case3.visitable.XmlElement;

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
