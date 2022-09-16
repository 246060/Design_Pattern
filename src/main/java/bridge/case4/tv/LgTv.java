package bridge.case4.tv;

public class LgTv implements Tv {

	@Override
	public void TvOn() {
		System.out.println("LG TV On");
	}

	@Override
	public void TvOff() {
		System.out.println("LG TV Off");
	}

	@Override
	public void changeChannel(String channel) {
		System.out.println("LG TV channel change to " + channel);
	}
}
