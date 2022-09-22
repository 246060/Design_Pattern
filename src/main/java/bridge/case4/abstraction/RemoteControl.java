package bridge.case4.abstraction;

import bridge.case4.implementor.Tv;

abstract public class RemoteControl {

	protected Tv tv;

	public RemoteControl(Tv tv) {
		this.tv = tv;
	}

	abstract public void on();

	abstract public void off();

	abstract public void channel(String channel);
}
