package abstract_factory.case5.factory;

import abstract_factory.case5.shape.Shape;

public abstract class AbstractFactory {
	public abstract Shape getShape(String shapeType) ;
}
