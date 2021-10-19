package composite.case5;

public class Composite implements Component {

    private Component[] children = new Component[9];
    private int total = 0;
    private int value;

    public Composite(int value) {
        this.value = value;
    }

    public void add(Component c) {
        children[total++] = c;
    }

    @Override
    public void traverse() {
        System.out.print(value + "  ");

        for (int i = 0; i < total; i++) {
            // 4. Delegation and polymorphism
            children[i].traverse();
        }
    }
}
