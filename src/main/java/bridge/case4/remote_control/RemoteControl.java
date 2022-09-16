package bridge.case4.remote_control;

import bridge.case4.tv.Tv;

abstract public class RemoteControl {

	protected Tv tv;

	public RemoteControl(Tv tv) {
		this.tv = tv;
	}

	abstract public void on();

	abstract public void off();

	abstract public void channel(String channel);
}
