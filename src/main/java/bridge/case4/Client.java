package bridge.case4;

import bridge.case4.refined_abstraction.LgRemoteControl;
import bridge.case4.concrete_implementor.LgTv;

public class Client {

	/**
	 * bridge pattern : 추상화(기능)를 구현에서 분리하여 두 가지가 독립적으로 변할 수 있도록 하는 것
	 */
	public static void main(String[] args) {

		/**
		 * LgRemoteControl: 기능
		 * LgTv: 구현
		 * */
		LgRemoteControl lgRemoteControl = new LgRemoteControl(new LgTv());
		lgRemoteControl.on();
		lgRemoteControl.channel("101번");
		lgRemoteControl.off();
	}
}
