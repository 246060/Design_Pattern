package cqrs;

import java.util.ArrayList;
import java.util.List;

public class Broker {

	private List<Subscriber> subscribers = new ArrayList<>();

	public void register(Subscriber subscriber) {
		subscribers.add(subscriber);
	}

	public void publish(Event event) {
		for (Subscriber subscriber : subscribers) {
			subscriber.listen(event);
		}
	}

}
