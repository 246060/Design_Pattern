package bridge.case3.weapon_handler;

import bridge.case3.weapon.Weapon;

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
