package abstract_factory.case5.factory;

import abstract_factory.case5.shape.RoundedRectangle;
import abstract_factory.case5.shape.RoundedSquare;
import abstract_factory.case5.shape.Shape;

public class RoundedShapeFactory extends AbstractFactory {
	@Override
	public Shape getShape(String shapeType) {

		if (shapeType.equalsIgnoreCase("RECTANGLE")) {
			return new RoundedRectangle();

		} else if (shapeType.equalsIgnoreCase("SQUARE")) {
			return new RoundedSquare();
		}

		return null;
	}
}
