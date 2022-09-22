package observer.case3.concrete_observable;

import observer.case3.observer.AlarmListener;

import java.util.ArrayList;
import java.util.List;


// subject
public class SensorSystem {

	// The subject is only coupled to the "abstraction" of AlarmListener.
	private List<AlarmListener> listeners = new ArrayList<>();

	public void register(AlarmListener alarmListener) {
		listeners.add(alarmListener);
	}

	public void soundTheAlarm() {
		for (AlarmListener listener : listeners) {
			listener.alarm();
		}
	}
}
