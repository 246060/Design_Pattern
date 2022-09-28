package event_aggregator.case1;

/**
 * LordBaelish produces events.
 */
public class LordBaelish extends EventEmitter {

  public LordBaelish() {
  }

  public LordBaelish(EventObserver obs, Event e) {
    super(obs, e);
  }

  @Override
  public void timePasses(Weekday day) {
    if (day == Weekday.FRIDAY) {
      notifyObservers(Event.STARK_SIGHTED);
    }
  }
}
