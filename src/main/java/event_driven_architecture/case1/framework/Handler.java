package event_driven_architecture.case1.framework;

public interface Handler<E extends Event> {

  void onEvent(E event);
}
