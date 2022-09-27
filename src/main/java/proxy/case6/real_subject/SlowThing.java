package proxy.case6.real_subject;

import proxy.case6.subject.Thing;

public class SlowThing extends Thing {

	public SlowThing() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
