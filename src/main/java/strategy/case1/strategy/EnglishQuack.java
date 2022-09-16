package strategy.case1.strategy;

public class EnglishQuack implements QuackBehavior {
	@Override
	public void quack() {
		System.out.println("Quack Quack");
	}
}
