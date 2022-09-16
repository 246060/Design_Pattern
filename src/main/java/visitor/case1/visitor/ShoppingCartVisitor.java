package visitor.case1.visitor;

import visitor.case1.visitable.Book;
import visitor.case1.visitable.Fruit;

public interface ShoppingCartVisitor {
	int visit(Book book);
	int visit(Fruit fruit);
}
