package bridge.case5.refined_abstraction;

import bridge.case5.abstraction.Shape;
import bridge.case5.implementor.Color;

public class Triangle extends Shape {

	public Triangle(Color c) {
		super(c);
	}

	@Override
	public void applyColor() {
		System.out.print("Triangle filled with color ");
		color.applyColor();
	}

}
