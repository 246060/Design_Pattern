package concurrency.lock.case2.classLevelLock;

import java.util.Date;

public class CodeBlockDemo {

	public void method() {
		//Acquire lock on .class reference
		synchronized (MethodDemo.class) {
			//other thread safe code
			System.out.println(MethodDemo.class.getSimpleName() + " :: " + new Date());
		}
	}
}
