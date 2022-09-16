package strategy.case1.strategy;

public class FlyWithWings implements FlyBehavior {
	@Override
	public void fly() {
		System.out.println("날개로 날아간다!");
	}
}
