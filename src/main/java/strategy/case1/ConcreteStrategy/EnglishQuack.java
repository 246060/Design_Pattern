package strategy.case1.ConcreteStrategy;

import strategy.case1.Strategy.QuackBehavior;

public class EnglishQuack implements QuackBehavior {
	@Override
	public void quack() {
		System.out.println("Quack Quack");
	}
}
