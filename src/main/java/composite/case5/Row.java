package composite.case5;

public class Row extends Composite{
    public Row(int value) {
        super(value);
    }

    @Override
    public void traverse() {
        System.out.print("Row");
        super.traverse();
    }
}
