package observer.case6.observer;

import observer.case6.concrete_observable.Subject;

public abstract class Observer {

	protected Subject subject;

	public abstract void update();
}
