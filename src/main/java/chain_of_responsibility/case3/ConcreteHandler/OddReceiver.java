package chain_of_responsibility.case3.ConcreteHandler;

import chain_of_responsibility.case3.Handler.Receiver;

public class OddReceiver extends Receiver {

	public OddReceiver(String name) {
		super(name);
	}

	@Override
	public boolean resolve(int number) {
		if (number % 2 != 0) return true;
		else return false;
	}

	@Override
	public void done(int number) {
		System.out.println(number + " : " + this.name + "가 해결");
	}
}
