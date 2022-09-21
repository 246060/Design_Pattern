package bridge.case7;

import bridge.case7.abstraction.Circle;
import bridge.case7.abstraction.Shape;
import bridge.case7.implementor.GreenCircle;
import bridge.case7.implementor.RedCircle;

public class Client {

	public static void main(String[] args) {

		Shape redCircle = new Circle(100, 100, 10, new RedCircle());
		redCircle.draw();

		Shape greenCircle = new Circle(100, 100, 10, new GreenCircle());
		greenCircle.draw();
	}
}
