package abstract_factory.case5;

public class Client {

    public static void main(String[] args) {

        Coffee mocha = CoffeeFactory.offer(new MochaFactory());
        Coffee latte = CoffeeFactory.offer(new LatteFactory());
        Coffee cappucino = CoffeeFactory.offer(new CappuccinoFactory());

    }
}
