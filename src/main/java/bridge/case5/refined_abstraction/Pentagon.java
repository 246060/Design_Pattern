package bridge.case5.refined_abstraction;

import bridge.case5.abstraction.Shape;
import bridge.case5.implementor.Color;

public class Pentagon extends Shape {

	public Pentagon(Color c) {
		super(c);
	}

	@Override
	public void applyColor() {
		System.out.print("Pentagon filled with color ");
		color.applyColor();
	}
}
