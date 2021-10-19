package abstract_factory.case5;

public class CappuccinoFactory extends CoffeeFactory {

    @Override
    public Coffee create() {
        return new Cappuccino();
    }
}
