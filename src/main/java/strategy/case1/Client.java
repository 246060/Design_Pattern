package strategy.case1;

import strategy.case1.context.Duck;
import strategy.case1.context.MachineDuck;
import strategy.case1.context.MallardDuck;
import strategy.case1.strategy.EnglishQuack;
import strategy.case1.strategy.FlyRocketPowered;
import strategy.case1.strategy.FlyWithWings;
import strategy.case1.strategy.KoreanQuack;

public class Client {

	public static void main(String[] args) {

		Duck duck1 = new MachineDuck();

		duck1.setFlyBehavior(new FlyRocketPowered());
		duck1.setQuackBehavior(new KoreanQuack());

		duck1.performFly();
		duck1.performQuack();


		Duck duck2 = new MallardDuck();

		duck2.setFlyBehavior(new FlyWithWings());
		duck2.setQuackBehavior(new EnglishQuack());

		duck2.performFly();
		duck2.performQuack();
	}
}
