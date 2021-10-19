package bridge.case3;

public class Warrior implements WeaponHandler {

    private Weapon weapon;

    public Warrior(Weapon weapon) {
        this.weapon = weapon;
    }

    @Override
    public void handle() {
        weapon.attack();
    }

}
