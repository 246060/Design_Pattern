package strategy.case1;

import strategy.case1.Context.Duck;
import strategy.case1.Context.MachineDuck;
import strategy.case1.Context.MallardDuck;
import strategy.case1.ConcreteStrategy.EnglishQuack;
import strategy.case1.ConcreteStrategy.FlyRocketPowered;
import strategy.case1.ConcreteStrategy.FlyWithWings;
import strategy.case1.ConcreteStrategy.KoreanQuack;

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
