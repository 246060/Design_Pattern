package strategy.case1;

public class Client {

    public static void main(String[] args) {

        Duck duck1 = new MachineDuck();
        Duck duck2 = new MallardDuck();

        FlyBehavior flyBehavior1 = new FlyRocketPowered();
        FlyBehavior flyBehavior2 = new FlywithWings();

        QuackBehavior quackBehavior1 = new KoreanQuack();

        duck1.setFlyBehavior(flyBehavior1);
        duck2.setFlyBehavior(flyBehavior2);

        duck1.setQuackBehavior(quackBehavior1);

        duck1.performFly();
        duck1.performQuack();

        duck2.performFly();
    }
}
