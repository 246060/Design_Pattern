package abstract_factory.case2.factory;

import abstract_factory.case2.coffee.Coffee;
import abstract_factory.case2.coffee.Latte;

public class LatteFactory extends CoffeeFactory {

	@Override
	public Coffee create() {
		System.out.println("create Latte");
		return new Latte();
	}
}
