package observer.case2.observer;

import observer.case2.concrete_observable.Subject;

abstract public class Observer {
    public abstract void update(Subject subject);
}
