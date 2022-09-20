package factory_method.case5;

public class Client {

	public static void main(String[] args) {

		Shape shape1 = new ShapeFactory().getShape("CIRCLE");
		Shape shape2 = new ShapeFactory().getShape("RECTANGLE");
		Shape shape3 = new ShapeFactory().getShape("SQUARE");

		shape1.draw();
		shape2.draw();
		shape3.draw();
	}
}
