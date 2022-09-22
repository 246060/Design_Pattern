package observer.case3.concrete_observer;

import observer.case3.observer.AlarmListener;

public class Gates implements AlarmListener {
	@Override
	public void alarm() {
		System.out.println("gates close");
	}
}
