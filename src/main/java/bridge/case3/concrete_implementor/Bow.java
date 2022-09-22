package bridge.case3.concrete_implementor;

import bridge.case3.implementor.Weapon;

public class Bow implements Weapon {

	@Override
	public void attack() {
		System.out.println("Bow attack");
	}

	@Override
	public void repair() {
		System.out.println("Bow repair");
	}
}
