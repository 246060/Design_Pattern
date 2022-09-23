package visitor.case3.visitor;

import visitor.case3.ConcreteElement.JsonElement;
import visitor.case3.ConcreteElement.XmlElement;

public interface Visitor {
	void visit(XmlElement xe);
	void visit(JsonElement js);
}
