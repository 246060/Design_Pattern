package bridge.case4;

abstract public class RemoteControl {

    protected TV tv;

    public RemoteControl(TV tv) {
        this.tv = tv;
    }

    abstract public void on();
    abstract public void off();
    abstract public void channel(String channel);
}
