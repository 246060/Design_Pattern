package visitor.case3.visitor;

import visitor.case3.visitable.JsonElement;
import visitor.case3.visitable.XmlElement;

public interface Visitor {
	void visit(XmlElement xe);
	void visit(JsonElement js);
}
