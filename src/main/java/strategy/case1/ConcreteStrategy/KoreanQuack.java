package strategy.case1.ConcreteStrategy;

import strategy.case1.Strategy.QuackBehavior;

public class KoreanQuack implements QuackBehavior {
	@Override
	public void quack() {
		System.out.println("꽥꽥");
	}
}
