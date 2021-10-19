package strategy.case3;

public class Foo extends StrategySolution {
    private int state = 1;


    @Override
    protected void start() {
        System.out.println("Start  ");
    }

    @Override
    protected void stop() {
        System.out.println("Stop");
    }

    @Override
    protected boolean nextTry() {
        System.out.println("NextTry-" + state++ + "  ");
        return true;
    }

    @Override
    protected boolean isSolution() {
        System.out.println("IsSolution-" + (state == 3) + "  ");
        return (state == 3);
    }

}
