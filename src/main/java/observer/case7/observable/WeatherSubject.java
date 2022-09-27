package observer.case7.observable;

import observer.case7.observer.WeatherObserver;

public interface WeatherSubject {
	void addObserver(WeatherObserver weatherObserver);
	void removeObserver(WeatherObserver weatherObserver);
	void doNotify();
}
