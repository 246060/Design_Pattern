package strategy.case2;

import strategy.case2.context.ConcreteContext;
import strategy.case2.context.Context;
import strategy.case2.strategy.ConcreteStrategy1;
import strategy.case2.strategy.ConcreteStrategy2;

public class Client {

	public static void main(String[] args) {

		Context context = new ConcreteContext();

		context.setStrategy(new ConcreteStrategy1());
		context.strategy();

		context.setStrategy(new ConcreteStrategy2());
		context.strategy();
	}
}
