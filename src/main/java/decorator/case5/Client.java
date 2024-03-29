package decorator.case5;

import decorator.case5.Component_Implementation.Circle;
import decorator.case5.Component_Implementation.Rectangle;
import decorator.case5.Component_Interface.Shape;
import decorator.case5.Concrete_Decorators.RedShapeDecorator;

public class Client {

	public static void main(String[] args) {

		System.out.println("Circle with normal border");
		Shape circle = new Circle();
		circle.draw();

		System.out.println("\nCircle of red border");
		Shape redCircle = new RedShapeDecorator(new Circle());
		redCircle.draw();

		System.out.println("\nRectangle of red border");
		Shape redRectangle = new RedShapeDecorator(new Rectangle());
		redRectangle.draw();

	}
}
