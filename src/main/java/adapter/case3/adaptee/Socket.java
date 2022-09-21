package adapter.case3.adaptee;

import adapter.case3.Volt;

public class Socket {

	public Volt getVolt() {
		return new Volt(120);
	}
}
