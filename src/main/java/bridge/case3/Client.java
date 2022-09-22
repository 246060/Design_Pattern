package bridge.case3;

import bridge.case3.concrete_implementor.Bow;
import bridge.case3.concrete_implementor.Sword;
import bridge.case3.refined_abstraction.Smith;
import bridge.case3.refined_abstraction.Warrior;
import bridge.case3.abstraction.WeaponHandler;

public class Client {

	public static void main(String[] args) {

		WeaponHandler warrior = new Warrior(new Sword());
		warrior.handle();

		WeaponHandler smith = new Smith(new Bow());
		smith.handle();
	}
}
