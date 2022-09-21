package adapter.case3.adapter;

import adapter.case3.Volt;

public interface SocketAdapter {
	Volt get120Volt();
	Volt get12Volt();
	Volt get3Volt();
}
