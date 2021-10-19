package strategy.case1;

public class KoreanQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("꽥꽥");
    }
}
