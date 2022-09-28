package event_driven_architecture.case1.event;

import event_driven_architecture.case1.model.User;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class UserUpdatedEvent extends AbstractEvent {

  private final User user;
}
