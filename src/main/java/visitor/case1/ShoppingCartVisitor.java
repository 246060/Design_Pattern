package visitor.case1;

public interface ShoppingCartVisitor {
    int visit(Book book);
    int visit(Fruit fruit);
}
