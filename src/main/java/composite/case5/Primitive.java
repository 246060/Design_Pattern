package composite.case5;

public class Primitive implements Component{

    private int value;

    public Primitive(int value) {
        this.value = value;
    }

    @Override
    public void traverse() {
        System.out.print( value + "  " );
    }
}
