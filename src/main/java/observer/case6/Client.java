package observer.case6;

import observer.case6.concrete_observable.Subject;
import observer.case6.concrete_observer.BinaryObserver;
import observer.case6.concrete_observer.HexaObserver;
import observer.case6.concrete_observer.OctalObserver;

public class Client {

	public static void main(String[] args) {

		Subject subject = new Subject();

		new HexaObserver(subject);
		new OctalObserver(subject);
		new BinaryObserver(subject);

		System.out.println("\n\nFirst state change: 15");
		subject.setState(15);

		System.out.println("\n\nSecond state change: 10");
		subject.setState(10);
	}
}
