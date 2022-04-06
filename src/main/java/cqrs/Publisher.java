package cqrs;

public class Publisher {

	private Broker broker;

	public Publisher(Broker broker) {
		this.broker = broker;
	}

	public void publish(Event event) {
		broker.publish(event);
	}
}
