package strategy.case1.ConcreteStrategy;

import strategy.case1.Strategy.FlyBehavior;

public class FlyRocketPowered implements FlyBehavior {
	@Override
	public void fly() {
		System.out.println("로켓 추진으로 날아간다!");
	}
}
