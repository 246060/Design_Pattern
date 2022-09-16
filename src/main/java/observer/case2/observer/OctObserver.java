package observer.case2.observer;

import observer.case2.Subject;

public class OctObserver extends Observer {
    @Override
    public void update(Subject subject) {
        System.out.print(" " + Integer.toOctalString(subject.getState()));
    }
}
