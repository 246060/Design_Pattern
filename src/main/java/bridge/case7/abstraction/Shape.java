package bridge.case7.abstraction;

import bridge.case7.implementor.DrawAPI;

public abstract class Shape {

	protected DrawAPI drawAPI;

	protected Shape(DrawAPI drawAPI){
		this.drawAPI = drawAPI;
	}

	public abstract void draw();
}
