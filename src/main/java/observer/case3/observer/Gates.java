package observer.case3.observer;

public class Gates implements AlarmListener {
	@Override
	public void alarm() {
		System.out.println("gates close");
	}
}
