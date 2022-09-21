package abstract_factory.case5;

import abstract_factory.case5.factory.AbstractFactory;
import abstract_factory.case5.factory.RoundedShapeFactory;
import abstract_factory.case5.factory.ShapeFactory;

public class FactoryProducer {

	public static AbstractFactory getFactory(boolean rounded) {
		if (rounded) {
			return new RoundedShapeFactory();
		} else {
			return new ShapeFactory();
		}
	}
}
