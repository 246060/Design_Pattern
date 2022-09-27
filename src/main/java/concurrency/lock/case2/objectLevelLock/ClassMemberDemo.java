package concurrency.lock.case2.objectLevelLock;

import java.util.Date;

public class ClassMemberDemo {

	private final Object lock = new Object();

	public void demoMethod() {
		synchronized (lock) {
			//other thread safe code
			System.out.println(getClass().getSimpleName() + " :: " + new Date());
		}
	}
}
