package bridge.case4.concrete_implementor;

import bridge.case4.implementor.Tv;

public class SamsungTv implements Tv {

	@Override
	public void TvOn() {
		System.out.println("Samsung TV On");
	}

	@Override
	public void TvOff() {
		System.out.println("Samsung TV Off");
	}

	@Override
	public void changeChannel(String channel) {
		System.out.println("Samsung TV channel change to " + channel);
	}
}
