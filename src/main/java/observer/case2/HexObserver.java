package observer.case2;

public class HexObserver extends Observer {
    @Override
    public void update(Subject subject) {
        System.out.print(" " + Integer.toHexString(subject.getState()));
    }
}
