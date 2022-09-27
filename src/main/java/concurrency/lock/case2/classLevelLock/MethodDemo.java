package concurrency.lock.case2.classLevelLock;

import java.util.Date;

public class MethodDemo {

	// Method is static
	public synchronized static void method() {
		System.out.println(MethodDemo.class.getSimpleName() + " :: " + new Date());
	}
}
