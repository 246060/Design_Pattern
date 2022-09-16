package abstract_factory.case2;

import abstract_factory.case2.coffee.Coffee;
import abstract_factory.case2.factory.CappuccinoFactory;
import abstract_factory.case2.factory.CoffeeFactory;
import abstract_factory.case2.factory.LatteFactory;
import abstract_factory.case2.factory.MochaFactory;

public class Client {

	public static void main(String[] args) {

		Coffee mocha = CoffeeFactory.offer(new MochaFactory());
		Coffee latte = CoffeeFactory.offer(new LatteFactory());
		Coffee cappucino = CoffeeFactory.offer(new CappuccinoFactory());
	}
}
