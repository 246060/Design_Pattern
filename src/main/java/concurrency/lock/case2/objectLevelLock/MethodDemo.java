package concurrency.lock.case2.objectLevelLock;

import java.util.Date;

public class MethodDemo {

	public synchronized void method() {
		System.out.println(getClass().getSimpleName() + " :: " + new Date());
	}
}
