package producer_consumer.case1;


public class Consumer {

	private final ItemQueue queue;

	private final String name;

	public Consumer(String name, ItemQueue queue) {
		this.name = name;
		this.queue = queue;
	}

	public void consume() throws InterruptedException {
		var item = queue.take();

		System.out.println("Consumer [" + name + "] " +
						"consume item [" + item.getId() + "] " +
						"produced by [{" + item.getProducer() + "}]");
	}
}
