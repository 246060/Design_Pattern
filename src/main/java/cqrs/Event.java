package cqrs;

public class Event {
	private String eventType;
	private Entity entity;

	public Event(String eventType, Entity entity) {
		this.eventType = eventType;
		this.entity = entity;
	}

	public String getEventType() {
		return eventType;
	}

	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	public Entity getEntity() {
		return entity;
	}

	public void setEntity(Entity entity) {
		this.entity = entity;
	}

	@Override
	public String toString() {
		return "Event{" +
			"eventType='" + eventType + '\'' +
			", entity=" + entity +
			'}';
	}
}
