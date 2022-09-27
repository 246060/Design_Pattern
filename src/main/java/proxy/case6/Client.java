package proxy.case6;

import proxy.case6.proxy.Proxy;
import proxy.case6.real_subject.FastThing;
import proxy.case6.subject.Thing;

public class Client {

	public static void main(String[] args) {

		Thing proxy = new Proxy();

		FastThing fastThing = new FastThing();
		fastThing.sayHello();

		proxy.sayHello();
	}
}
