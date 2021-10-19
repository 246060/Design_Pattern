package strategy.case1;

public class FlywithWings implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("날개로 날아간다!");
    }
}
