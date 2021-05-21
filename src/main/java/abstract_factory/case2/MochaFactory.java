package abstract_factory.case2;

public class MochaFactory extends CoffeeFactory {

    @Override
    public Coffee create() {
        return new Mocha();
    }
}
