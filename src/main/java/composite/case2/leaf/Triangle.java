package composite.case2.leaf;

import composite.case2.component.Shape;

public class Triangle implements Shape {

	@Override
	public void draw(String fillColor) {
		System.out.println("Drawing Triangle with color " + fillColor);
	}
}
