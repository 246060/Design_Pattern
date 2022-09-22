package bridge.case3.refined_abstraction;

import bridge.case3.implementor.Weapon;
import bridge.case3.abstraction.WeaponHandler;

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
