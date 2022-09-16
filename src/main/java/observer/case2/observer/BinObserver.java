package observer.case2.observer;

import observer.case2.Subject;

public class BinObserver extends Observer {
    @Override
    public void update(Subject subject) {
        System.out.print(" " + Integer.toBinaryString(subject.getState()));
    }
}
