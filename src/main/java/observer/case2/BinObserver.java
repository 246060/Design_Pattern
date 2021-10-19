package observer.case2;

public class BinObserver extends Observer {
    @Override
    public void update(Subject subject) {
        System.out.print(" " + Integer.toBinaryString(subject.getState()));
    }
}
