package abstract_factory.case5;

public class MochaFactory extends CoffeeFactory {

    @Override
    public Coffee create() {
        return new Mocha();
    }
}
