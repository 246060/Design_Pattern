package bridge.case5.abstraction;

import bridge.case5.implementor.Color;

public abstract class Shape {

	protected Color color;

	public Shape(Color c) {
		this.color = c;
	}

	abstract public void applyColor();
}
