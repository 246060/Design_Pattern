package strategy.case1;

public class MachineDuck extends Duck {

    public MachineDuck() {
        super.flyBehavior = new FlywithWings();
        super.quackBehavior = new KoreanQuack();
    }
}
