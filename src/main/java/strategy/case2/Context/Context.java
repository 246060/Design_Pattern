package strategy.case2.Context;

import strategy.case2.Strategy.Strategy;

public abstract class Context {

	Strategy strategy;

	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}

	public void strategy() {
		strategy.strategyMethod();
	}
}
