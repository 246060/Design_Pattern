package abstract_factory.case2.factory;

import abstract_factory.case2.coffee.Cappuccino;
import abstract_factory.case2.coffee.Coffee;

public class CappuccinoFactory extends CoffeeFactory {

	@Override
	public Coffee create() {
		System.out.println("create Cappuccino");
		return new Cappuccino();
	}
}
