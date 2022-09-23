package visitor.case1.Visitor;

import visitor.case1.ConcreteElement.Book;
import visitor.case1.ConcreteElement.Fruit;

public interface ShoppingCartVisitor {
	int visit(Book book);
	int visit(Fruit fruit);
}
