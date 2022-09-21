package abstract_factory.case5.factory;

import abstract_factory.case5.shape.Rectangle;
import abstract_factory.case5.shape.Shape;
import abstract_factory.case5.shape.Square;

public class ShapeFactory extends AbstractFactory {
	@Override
	public Shape getShape(String shapeType) {

		if (shapeType.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();

		} else if (shapeType.equalsIgnoreCase("SQUARE")) {
			return new Square();
		}

		return null;
	}
}
