package observer.case2.observer;

import observer.case2.Subject;

public class HexObserver extends Observer {
    @Override
    public void update(Subject subject) {
        System.out.print(" " + Integer.toHexString(subject.getState()));
    }
}
