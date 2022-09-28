package event_driven_architecture.case1.event;


import event_driven_architecture.case1.framework.Event;


public abstract class AbstractEvent implements Event {

	@Override
	public Class<? extends Event> getType() {
		return getClass();
	}
}