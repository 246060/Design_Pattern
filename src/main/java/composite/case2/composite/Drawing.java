package composite.case2.composite;

import composite.case2.component.Shape;

import java.util.ArrayList;
import java.util.List;

public class Drawing implements Shape {

	private List<Shape> shapes = new ArrayList<>();

	public void add(Shape shape) {
		shapes.add(shape);
	}

	public void remove(Shape shape) {
		shapes.remove(shape);
	}

	public void clear() {
		System.out.println("Clearing all the shapes from drawing");
		shapes.clear();
	}

	@Override
	public void draw(String fillColor) {
		for (Shape shape : shapes) {
			shape.draw(fillColor);
		}
	}
}
