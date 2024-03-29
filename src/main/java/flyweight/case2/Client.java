package flyweight.case2;

import flyweight.case2.concrete_flyweight.Circle;
import flyweight.case2.flyweight_factory.ShapeFactory;

public class Client {

	private static final String colors[] = {"Red", "Green", "Blue", "White", "Black"};

	private static String getRandomColor() {
		return colors[(int) (Math.random() * colors.length)];
	}

	private static int getRandomX() {
		return (int) (Math.random() * 100);
	}

	private static int getRandomY() {
		return (int) (Math.random() * 100);
	}

	// https://www.tutorialspoint.com/design_pattern/flyweight_pattern.htm
	public static void main(String[] args) {

		for (int i = 0; i < 20; ++i) {
			Circle circle = (Circle) ShapeFactory.getCircle(getRandomColor());

			circle.setX(getRandomX());
			circle.setY(getRandomY());
			circle.setRadius(100);

			circle.draw();
		}
	}


}
