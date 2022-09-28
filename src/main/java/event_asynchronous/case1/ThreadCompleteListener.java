package event_asynchronous.case1;

/**
 * Interface with listener behaviour related to Thread Completion.
 */
public interface ThreadCompleteListener {
  void completedEventHandler(final int eventId);
}
