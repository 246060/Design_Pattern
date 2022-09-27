package proxy.case6.proxy;

import proxy.case6.subject.Thing;
import proxy.case6.real_subject.SlowThing;

import java.util.Date;

public class Proxy extends Thing {

	SlowThing slowThing;

	public Proxy() {
		System.out.println("Creating proxy at " + new Date());
	}

	@Override
	public void sayHello() {
		if (slowThing == null) {
			slowThing = new SlowThing();
		}
		slowThing.sayHello();
	}
}
