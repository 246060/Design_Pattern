package composite.case5;

import composite.case5.component.Shape;
import composite.case5.composite.Drawing;
import composite.case5.leaf.Circle;
import composite.case5.leaf.Triangle;

public class Client {

	public static void main(String[] args) {

		Shape tri = new Triangle();
		Shape tri1 = new Triangle();
		Shape cir = new Circle();

		Drawing drawing = new Drawing();
		drawing.add(tri1);
		drawing.add(tri1);
		drawing.add(cir);

		drawing.draw("Red");

		drawing.clear();

		drawing.add(tri);
		drawing.add(cir);
		drawing.draw("Green");

	}
}
