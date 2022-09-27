package visitor.case5.Element;

import visitor.case5.visitor.NumberVisitor;

public interface NumberElement {
	void accept(NumberVisitor visitor);
}
