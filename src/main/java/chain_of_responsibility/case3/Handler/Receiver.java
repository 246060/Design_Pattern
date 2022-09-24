package chain_of_responsibility.case3.Handler;

abstract public class Receiver {

	protected String name;
	private Receiver next;

	public Receiver(String name) {
		this.name = name;
	}

	public void setNext(Receiver next) {
		this.next = next;
	}

	public final void support(int number) {
		if (resolve(number)) {
			done(number);
		} else if (next != null) {
			next.support(number);
		} else {
			System.out.println("처리할 핸들러가 없음.");
		}
	}

	abstract public boolean resolve(int number);
	abstract public void done(int number);

}
