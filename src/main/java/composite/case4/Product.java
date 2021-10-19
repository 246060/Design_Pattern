package composite.case4;

public class Product extends Entity {
    private int value;

    public Product(int value) {
        this.value = value;
    }

    @Override
    public void traverse(int[] levels) {
        if (printthisLevel(levels)) {
            System.out.println(indent.toString() + value);
        }
    }
}
