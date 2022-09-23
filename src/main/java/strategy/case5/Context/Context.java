package strategy.case5.Context;

import strategy.case5.Strategy.Strategy;

public class Context {

	private Strategy strategy;

	public Context(Strategy strategy) {
		this.strategy = strategy;
	}

	public float executeStrategy(float num1, float num2) {
		return strategy.calculation(num1, num2);
	}

}
