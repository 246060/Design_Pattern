package observer.case2;

public class OctObserver extends Observer {
    @Override
    public void update(Subject subject) {
        System.out.print(" " + Integer.toOctalString(subject.getState()));
    }
}
