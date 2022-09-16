package bridge.case3.weapon_handler;

import bridge.case3.weapon.Weapon;

public class Smith implements WeaponHandler {
    Weapon weapon;

    public Smith(Weapon weapon) {
        this.weapon = weapon;
    }

    @Override
    public void handle() {
        weapon.repair();
    }
}
