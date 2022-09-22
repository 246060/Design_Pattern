package bridge.case4.refined_abstraction;

import bridge.case4.abstraction.RemoteControl;
import bridge.case4.implementor.Tv;

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
