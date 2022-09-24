package mediator.case1.Component;

import mediator.case1.Mediador.Mediator;

public class Producer implements Runnable {

	private int id;
	private static int num = 1;

	private Mediator mediator;

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
