package event_driven_architecture.case1.framework;

public interface Event {
  Class<? extends Event> getType();
}
