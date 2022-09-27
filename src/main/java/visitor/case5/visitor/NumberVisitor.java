package visitor.case5.visitor;

import visitor.case5.Element.NumberElement;
import visitor.case5.ConcreteElement.ThreeElement;
import visitor.case5.ConcreteElement.TwoElement;

import java.util.List;

public interface NumberVisitor {
	void visit(TwoElement twoElement);
	void visit(ThreeElement threeElement);
	void visit(List<NumberElement> elementList);
}
