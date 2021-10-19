package abstract_factory.case5;

public class LatteFactory extends CoffeeFactory {

    @Override
    public Coffee create() {
        return new Latte();
    }
}
