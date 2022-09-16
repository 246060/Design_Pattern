package mediator.case1;

public class Producer implements Runnable {
	// 2. Producers are coupled only to the Mediator

	private Mediator mediator;
	private int id;
	private static int num = 1;

	public Producer(Mediator mediator) {
		this.mediator = mediator;
		this.id = num++;
	}

	@Override
	public void run() {
		int num;

		while (true) {
			mediator.storeMessage(num = (int) (Math.random() * 100));
			System.out.println("p" + id + "-" + num);
		}
	}
}
