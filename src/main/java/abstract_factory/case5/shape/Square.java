package abstract_factory.case5.shape;


public class Square implements Shape {

	@Override
	public void draw() {
		System.out.println("Inside Square::draw() method.");
	}
}
