package strategy.case3;

import strategy.case3.strategy.Bar;
import strategy.case3.strategy.Foo;
import strategy.case3.strategy.Strategy;

public class Client {

	public static void main(String[] args) {

		Strategy[] strategies = {new Bar(), new Foo()};

		for (Strategy strategy : strategies) {
			strategy.solve();
		}
	}
}
