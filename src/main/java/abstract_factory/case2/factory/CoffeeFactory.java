package abstract_factory.case2.factory;

import abstract_factory.case2.coffee.Coffee;

public abstract class CoffeeFactory {

	public static Coffee offer(CoffeeFactory coffeeFactory) {
		return coffeeFactory.create();
	}

	protected abstract Coffee create();
}
