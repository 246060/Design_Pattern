package event_sourcing.case1.processor;


import event_sourcing.case1.event.DomainEvent;

/**
 * This is the implementation of event processor.
 * All events are processed by this class.
 * This processor uses processorJournal to persist and recover events.
 */
public class DomainEventProcessor {

  private final JsonFileJournal processorJournal = new JsonFileJournal();

  public void process(DomainEvent domainEvent) {
    domainEvent.process();
    processorJournal.write(domainEvent);
  }

  public void reset() {
    processorJournal.reset();
  }

  public void recover() {
    DomainEvent domainEvent;

    while ((domainEvent = processorJournal.readNext()) != null) {
      domainEvent.process();
    }
  }
}
