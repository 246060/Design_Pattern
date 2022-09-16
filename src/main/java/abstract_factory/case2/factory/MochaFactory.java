package abstract_factory.case2.factory;

import abstract_factory.case2.coffee.Coffee;
import abstract_factory.case2.coffee.Mocha;

public class MochaFactory extends CoffeeFactory {

	@Override
	public Coffee create() {
		System.out.println("create Mocha");
		return new Mocha();
	}
}
