package bridge.case3.concrete_implementor;

import bridge.case3.implementor.Weapon;

public class Sword implements Weapon {

	@Override
	public void attack() {
		System.out.println("Sword attack");
	}

	@Override
	public void repair() {
		System.out.println("Sword repair");
	}
}
