package concurrency.lock.case2.objectLevelLock;

import java.util.Date;

public class CodeBlockDemo {

	public void method() {
		synchronized (this) {
			//other thread safe code
			System.out.println(getClass().getSimpleName() + " :: " + new Date());
		}
	}
}
