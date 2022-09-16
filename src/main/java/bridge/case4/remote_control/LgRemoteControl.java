package bridge.case4.remote_control;

import bridge.case4.tv.Tv;

public class LgRemoteControl extends RemoteControl {

	public LgRemoteControl(Tv tv) {
		super(tv);
	}

	@Override
	public void on() {
		tv.TvOn();
	}

	@Override
	public void off() {
		tv.TvOff();
	}

	@Override
	public void channel(String channel) {
		tv.changeChannel(channel);
	}
}
