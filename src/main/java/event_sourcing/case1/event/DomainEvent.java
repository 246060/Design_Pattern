package event_sourcing.case1.event;

import java.io.Serializable;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

/**
 * This is the base class for domain events.
 * All events must extend this class.
 */
@Setter
@Getter
@RequiredArgsConstructor
public abstract class DomainEvent implements Serializable {

  private final long sequenceId;
  private final long createdTime;
  private final String eventClassName;
  private boolean realTime = true;

  public abstract void process();
}
