package decorator.case6.Component_Implementation;

import decorator.case6.Component_Interface.Shape;

public class Rectangle implements Shape {

	@Override
	public void draw() {
		System.out.println("Shape: Rectangle");
	}
}
