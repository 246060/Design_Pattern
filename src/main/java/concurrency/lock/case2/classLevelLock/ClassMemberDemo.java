package concurrency.lock.case2.classLevelLock;

import java.util.Date;

public class ClassMemberDemo {

	private final static Object lock = new Object();

	public void demoMethod() {
		// Lock object is static
		synchronized (lock) {
			// other thread safe code
			System.out.println(MethodDemo.class.getSimpleName() + " :: " + new Date());
		}
	}
}
