package observer.case2.concrete_observer;

import observer.case2.concrete_observable.Subject;
import observer.case2.observer.Observer;

public class HexObserver extends Observer {
    @Override
    public void update(Subject subject) {
        System.out.print(" " + Integer.toHexString(subject.getState()));
    }
}
