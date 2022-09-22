package bridge.case7.refined_abstraction;

import bridge.case7.abstraction.Shape;
import bridge.case7.implementor.DrawAPI;

public class Circle extends Shape {

	private int x, y, radius;

	public Circle(int x, int y, int radius, DrawAPI drawAPI) {
		super(drawAPI);
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	@Override
	public void draw() {
		drawAPI.drawCircle(radius, x, y);
	}
}
