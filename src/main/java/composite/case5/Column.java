package composite.case5;

public class Column extends Composite {
    public Column(int value) {
        super(value);
    }

    @Override
    public void traverse() {
        System.out.print("Col");
        super.traverse();
    }
}
