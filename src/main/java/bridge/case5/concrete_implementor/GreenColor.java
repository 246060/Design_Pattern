package bridge.case5.concrete_implementor;

import bridge.case5.implementor.Color;

public class GreenColor implements Color {

	@Override
	public void applyColor() {
		System.out.println("green.");
	}
}
