package observer.case1.concrete_observable;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import observer.case1.observer.EventListener;
import observer.case1.EventType;

public class EventManager {
	//  Basic publisher

	Map<EventType, List<EventListener>> listeners = new HashMap<>();

	public EventManager(EventType... eventTypes) {
		for (EventType eventType : eventTypes) {
			this.listeners.put(eventType, new ArrayList<>());
		}
	}

	public void subscribe(EventType eventType, EventListener listener) {
		List<EventListener> users = listeners.get(eventType);
		users.add(listener);
	}

	public void unsubscribe(EventType eventType, EventListener listener) {
		List<EventListener> users = listeners.get(eventType);
		users.remove(listener);
	}

	public void notify(EventType eventType, File file) {
		List<EventListener> users = listeners.get(eventType);
		for (EventListener listener : users) {
			listener.update(eventType, file);
		}
	}
}
