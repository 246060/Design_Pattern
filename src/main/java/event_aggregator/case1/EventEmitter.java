package event_aggregator.case1;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * EventEmitter is the base class for event producers that can be observed.
 */
public abstract class EventEmitter {

	private final Map<Event, List<EventObserver>> observerLists;

	public EventEmitter() {
		observerLists = new HashMap<>();
	}

	public EventEmitter(EventObserver obs, Event e) {
		this();
		registerObserver(obs, e);
	}

	/**
	 * Registers observer for specific event in the related list.
	 *
	 * @param obs the observer that observers this emitter
	 * @param e   the specific event for that observation occurs
	 */
	public final void registerObserver(EventObserver obs, Event e) {

		if (!observerLists.containsKey(e)) {
			observerLists.put(e, new LinkedList<>());
		}

		if (!observerLists.get(e).contains(obs)) {
			observerLists.get(e).add(obs);
		}
	}

	protected void notifyObservers(Event e) {
		if (observerLists.containsKey(e)) {
			observerLists.get(e).forEach(observer -> observer.onEvent(e));
		}
	}

	public abstract void timePasses(Weekday day);
}
