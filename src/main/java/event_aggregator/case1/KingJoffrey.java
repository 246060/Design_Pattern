package event_aggregator.case1;

import lombok.extern.slf4j.Slf4j;

/**
 * KingJoffrey observes events from {@link KingsHand}.
 */
@Slf4j
public class KingJoffrey implements EventObserver {

  @Override
  public void onEvent(Event e) {
    log.info("Received event from the King's Hand: {}", e.toString());
  }
}
