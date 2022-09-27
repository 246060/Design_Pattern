package observer.case7.concrete_observer;

import observer.case7.observer.WeatherObserver;

public class WeatherCustomer1 implements WeatherObserver {

	@Override
	public void doUpdate(int temperature) {
		System.out.println("Weather customer 1 just found out the temperature is:" + temperature);
	}

}