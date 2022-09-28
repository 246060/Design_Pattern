package event_driven_architecture.case1.handler;

import event_driven_architecture.case1.event.UserCreatedEvent;
import event_driven_architecture.case1.framework.Handler;
import lombok.extern.slf4j.Slf4j;


@Slf4j
public class UserCreatedEventHandler implements Handler<UserCreatedEvent> {

	@Override
	public void onEvent(UserCreatedEvent event) {
		log.info("User '{}' has been Created!", event.getUser().getUsername());
	}

}
