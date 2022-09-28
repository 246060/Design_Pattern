package event_driven_architecture.case1;


import event_driven_architecture.case1.event.UserCreatedEvent;
import event_driven_architecture.case1.event.UserUpdatedEvent;
import event_driven_architecture.case1.framework.EventDispatcher;
import event_driven_architecture.case1.handler.UserCreatedEventHandler;
import event_driven_architecture.case1.handler.UserUpdatedEventHandler;
import event_driven_architecture.case1.model.User;


public class App {

	public static void main(String[] args) {

		var dispatcher = new EventDispatcher();
		dispatcher.registerHandler(UserCreatedEvent.class, new UserCreatedEventHandler());
		dispatcher.registerHandler(UserUpdatedEvent.class, new UserUpdatedEventHandler());

		var user = new User("iluwatar");
		dispatcher.dispatch(new UserCreatedEvent(user));
		dispatcher.dispatch(new UserUpdatedEvent(user));
	}

}
