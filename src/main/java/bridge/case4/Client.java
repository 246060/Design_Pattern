package bridge.case4;

public class Client {
    public static void main(String[] args) {

        LGTV LGtv = new LGTV();
        LGRemoteControl LGRemotecontrol = new LGRemoteControl(LGtv);

        //기능 클래스 계층의 최상위 클래스에 구현 클래스 계층의 클래스를 등록함.
        LGRemotecontrol.on();
        LGRemotecontrol.channel("101번");
        LGRemotecontrol.off();

    }
}
