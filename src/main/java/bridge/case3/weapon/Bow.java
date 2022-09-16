package bridge.case3.weapon;

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
