package bridge.case5;

import bridge.case5.abstraction.Pentagon;
import bridge.case5.abstraction.Shape;
import bridge.case5.abstraction.Triangle;
import bridge.case5.implementor.GreenColor;
import bridge.case5.implementor.RedColor;

public class Client {

	public static void main(String[] args) {

		Shape tri = new Triangle(new RedColor());
		tri.applyColor();

		Shape pent = new Pentagon(new GreenColor());
		pent.applyColor();
	}
}
