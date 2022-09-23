package strategy.case2.ConcreteStrategy;

import strategy.case2.Strategy.Strategy;

public class ConcreteStrategy1 implements Strategy {

	@Override
	public void strategyMethod() {
		System.out.println("ConcreteStrategy 1 method call!");
	}
}
