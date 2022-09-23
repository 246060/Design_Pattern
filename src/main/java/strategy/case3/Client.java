package strategy.case3;

import strategy.case3.ConcreteStrategy.Bar;
import strategy.case3.ConcreteStrategy.Foo;
import strategy.case3.Strategy.Strategy;

public class Client {

	public static void main(String[] args) {

		Strategy[] strategies = {new Bar(), new Foo()};

		for (Strategy strategy : strategies) {
			strategy.solve();
		}
	}
}
