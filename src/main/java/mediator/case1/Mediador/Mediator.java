package mediator.case1.Mediador;

public class Mediator {

	private boolean slotFull = false;
	private int number;

	public synchronized void storeMessage(int num) {

		// no room for another message
		while (slotFull == true) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		slotFull = true;
		number = num;
		notifyAll();
	}

	public synchronized int retrieveMessage() {

		// no message to retrieve
		while (slotFull == false) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		slotFull = false;
		notifyAll();
		return number;
	}
}
