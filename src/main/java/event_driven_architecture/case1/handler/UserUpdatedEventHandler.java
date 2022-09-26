package event_driven_architecture.case1.handler;

import event_driven_architecture.case1.event.UserUpdatedEvent;
import event_driven_architecture.case1.framework.Handler;
import lombok.extern.slf4j.Slf4j;

/**
 * Handles the {@link UserUpdatedEvent} message.
 */
@Slf4j
public class UserUpdatedEventHandler implements Handler<UserUpdatedEvent> {

  @Override
  public void onEvent(UserUpdatedEvent event) {
    log.info("User '{}' has been Updated!", event.getUser().getUsername());
  }
}
