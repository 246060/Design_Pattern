package event_driven_architecture.case1.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * This {@link User} class is a basic pojo used to demonstrate user data sent along with the {@link
 * UserCreatedEvent} and {@link UserUpdatedEvent} events.
 */
@RequiredArgsConstructor
@Getter
public class User {

  private final String username;
}
