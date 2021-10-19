package strategy.case2;

public class Client {

    public static void main(String[] args) {

        Context context = new ConcreteContext();

        context.setStrategy(new ConcreteStrategy1());
        context.strategy();

        context.setStrategy(new ConcreteStrategy2());
        context.strategy();
    }
}
