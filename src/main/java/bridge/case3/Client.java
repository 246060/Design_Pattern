package bridge.case3;

import bridge.case3.weapon.Bow;
import bridge.case3.weapon.Sword;
import bridge.case3.weapon_handler.Smith;
import bridge.case3.weapon_handler.Warrior;
import bridge.case3.weapon_handler.WeaponHandler;

public class Client {

	public static void main(String[] args) {

		WeaponHandler warrior = new Warrior(new Sword());
		warrior.handle();

		WeaponHandler smith = new Smith(new Bow());
		smith.handle();
	}
}
