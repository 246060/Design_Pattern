package event_aggregator.case1;

/**
 * KingsHand observes events from multiple sources and delivers them to listeners.
 */
public class KingsHand extends EventEmitter implements EventObserver {

  public KingsHand() {
  }

  public KingsHand(EventObserver obs, Event e) {
    super(obs, e);
  }

  @Override
  public void onEvent(Event e) {
    notifyObservers(e);
  }

  @Override
  public void timePasses(Weekday day) {
  }
}
