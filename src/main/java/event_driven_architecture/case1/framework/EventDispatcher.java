package event_driven_architecture.case1.framework;

import java.util.HashMap;
import java.util.Map;


public class EventDispatcher {

	private final Map<Class<? extends Event>, Handler<? extends Event>> handlers;

	public EventDispatcher() {
		handlers = new HashMap<>();
	}

	public <E extends Event> void registerHandler(Class<E> eventType, Handler<E> handler) {
		handlers.put(eventType, handler);
	}

	public <E extends Event> void dispatch(E event) {
		var handler = (Handler<E>) handlers.get(event.getClass());

		if (handler != null) {
			handler.onEvent(event);
		}
	}

}