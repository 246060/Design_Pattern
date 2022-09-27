package flyweight.case5;

import flyweight.case5.flyweight.Flyweight;
import flyweight.case5.flyweight_factory.FlyweightFactory;

public class Client {

	public static void main(String[] args) {

		FlyweightFactory flyweightFactory = FlyweightFactory.getInstance();

		for (int i = 0; i < 5; i++) {
			Flyweight flyweightAdder = flyweightFactory.getFlyweight("add");
			flyweightAdder.doMath(i, i);

			Flyweight flyweightMultiplier = flyweightFactory.getFlyweight("multiply");
			flyweightMultiplier.doMath(i, i);
		}

	}
}
