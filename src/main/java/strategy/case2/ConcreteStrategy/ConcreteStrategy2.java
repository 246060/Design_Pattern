package strategy.case2.ConcreteStrategy;

import strategy.case2.Strategy.Strategy;

public class ConcreteStrategy2 implements Strategy {

	@Override
	public void strategyMethod() {
		System.out.println("ConcreteStrategy 2 method call!");
	}
}
