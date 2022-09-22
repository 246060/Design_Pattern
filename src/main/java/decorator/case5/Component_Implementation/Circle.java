package decorator.case5.Component_Implementation;

import decorator.case5.Component_Interface.Shape;

public class Circle implements Shape {

	@Override
	public void draw() {
		System.out.println("Shape: Circle");
	}
}
