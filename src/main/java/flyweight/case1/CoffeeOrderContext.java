package flyweight.case1;

public class CoffeeOrderContext {

    private final int tableNumber;

    public CoffeeOrderContext(int tableNumber) {
        this.tableNumber = tableNumber;
    }

    public int getTableNumber() {
        return tableNumber;
    }
}
