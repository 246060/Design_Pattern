package strategy.case4;

import strategy.case4.ConcreteStrategy.CreditCardStrategy;
import strategy.case4.ConcreteStrategy.PaypalStrategy;
import strategy.case4.Context.ShoppingCart;

public class Client {

	public static void main(String[] args) {

		ShoppingCart cart = new ShoppingCart();

		cart.addItem(new Item("1234", 10));
		cart.addItem(new Item("5678", 40));

		cart.pay(new PaypalStrategy("myemail@example.com", "mypwd"));
		cart.pay(new CreditCardStrategy("Pankaj Kumar", "1234567890123456", "786", "12/15"));
	}
}
