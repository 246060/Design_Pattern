package visitor.case1.Element;

import visitor.case1.Visitor.ShoppingCartVisitor;

public interface ItemElement {
	int accept(ShoppingCartVisitor visitor);
}
