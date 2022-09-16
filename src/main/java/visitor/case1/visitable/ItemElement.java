package visitor.case1.visitable;

import visitor.case1.visitor.ShoppingCartVisitor;

public interface ItemElement {
	int accept(ShoppingCartVisitor visitor);
}
