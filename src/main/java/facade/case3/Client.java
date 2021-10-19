package facade.case3;

public class Client {

    // https://www.tutorialspoint.com/design_pattern/facade_pattern.htm
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
