package strategy.case2.context;

import strategy.case2.strategy.Strategy;

public abstract class Context {

	Strategy strategy;

	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}

	public void strategy() {
		strategy.strategyMethod();
	}
}
