package flyweight.case5.flyweight_factory;

import flyweight.case5.concrete_flyweight.FlyweightAdder;
import flyweight.case5.concrete_flyweight.FlyweightMultiplier;
import flyweight.case5.flyweight.Flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {

	private static FlyweightFactory flyweightFactory;

	private Map<String, Flyweight> flyweightPool;

	private FlyweightFactory() {
		flyweightPool = new HashMap<>();
	}

	public static FlyweightFactory getInstance() {
		if (flyweightFactory == null) {
			synchronized (FlyweightFactory.class) {
				if (flyweightFactory == null) {
					flyweightFactory = new FlyweightFactory();
				}
			}
		}
		return flyweightFactory;
	}

	public Flyweight getFlyweight(String key) {

		if (flyweightPool.containsKey(key)) {
			return flyweightPool.get(key);

		} else {
			Flyweight flyweight;

			if ("add".equals(key)) {
				flyweight = new FlyweightAdder();
			} else {
				flyweight = new FlyweightMultiplier();
			}

			flyweightPool.put(key, flyweight);
			return flyweight;
		}
	}
}
