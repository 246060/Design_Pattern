package bridge.case4;

public class LGRemoteControl extends RemoteControl {


    public LGRemoteControl(TV tv) {
        super(tv);
    }

    @Override
    public void on() {
        tv.TVon();
    }

    @Override
    public void off() {
        tv.TVoff();
    }

    @Override
    public void channel(String channel) {
        tv.changeChannel(channel);
    }
}
