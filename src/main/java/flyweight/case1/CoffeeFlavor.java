package flyweight.case1;

// ConcreteFlyweight
public class CoffeeFlavor implements CoffeeOrder {

    private final String flavor;

    public CoffeeFlavor(String flavor) {
        this.flavor = flavor;
    }

    public String getFlavor() {
        return flavor;
    }

    @Override
    public void serveCoffee(CoffeeOrderContext coffeeOrderContext) {
        System.out.println("Serving  Coffee flavor " + flavor + " to table number " + coffeeOrderContext.getTableNumber());
    }
}
