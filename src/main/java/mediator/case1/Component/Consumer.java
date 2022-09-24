package mediator.case1.Component;

import mediator.case1.Mediador.Mediator;

public class Consumer implements Runnable {

	private int id;
	private static int num = 1;

	private Mediator mediator;

	public Consumer(Mediator mediator) {
		this.mediator = mediator;
		this.id = num++;
	}

	@Override
	public void run() {
		while (true) {
			System.out.println("c" + id + "-" + mediator.retrieveMessage());
		}
	}
}
