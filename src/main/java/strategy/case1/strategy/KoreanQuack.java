package strategy.case1.strategy;

public class KoreanQuack implements QuackBehavior {
	@Override
	public void quack() {
		System.out.println("꽥꽥");
	}
}
