package visitor.case1.ConcreteVisitor;

import visitor.case1.ConcreteElement.Book;
import visitor.case1.ConcreteElement.Fruit;
import visitor.case1.Visitor.ShoppingCartVisitor;

public class ShoppingCartVisitorImpl implements ShoppingCartVisitor {

	@Override
	public int visit(Book book) {

		int cost = 0;

		if (book.getPrice() > 50) {
			//apply 5$ discount if book price is greater than 50
			cost = book.getPrice() - 5;

		} else {
			cost = book.getPrice();
		}

		System.out.println("Book ISBN::" + book.getIsbnNumber() + " cost =" + cost);
		return cost;
	}

	@Override
	public int visit(Fruit fruit) {
		int cost = fruit.getPricePerKg() * fruit.getWeight();
		System.out.println(fruit.getName() + " cost = " + cost);
		return cost;
	}
}
