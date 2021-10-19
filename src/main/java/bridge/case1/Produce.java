package bridge.case1;

public class Produce implements Workshop {
    @Override
    public void work() {
        System.out.println("Produced");
    }
}
