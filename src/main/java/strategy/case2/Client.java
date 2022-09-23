package strategy.case2;

import strategy.case2.Context.ConcreteContext;
import strategy.case2.Context.Context;
import strategy.case2.ConcreteStrategy.ConcreteStrategy1;
import strategy.case2.ConcreteStrategy.ConcreteStrategy2;

public class Client {

	public static void main(String[] args) {

		Context context = new ConcreteContext();

		context.setStrategy(new ConcreteStrategy1());
		context.strategy();

		context.setStrategy(new ConcreteStrategy2());
		context.strategy();
	}
}
