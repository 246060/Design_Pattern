package facade.case3.facade;

import facade.case3.subsystem.Circle;
import facade.case3.subsystem.Rectangle;
import facade.case3.subsystem.Shape;
import facade.case3.subsystem.Square;

public class ShapeMaker {

    private Shape circle;
    private Shape rectangle;
    private Shape square;

    public ShapeMaker() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    public void drawCircle() {
        circle.draw();
    }

    public void drawRectangle() {
        rectangle.draw();
    }

    public void drawSquare() {
        square.draw();
    }
}
