package bridge.case3.refined_abstraction;

import bridge.case3.implementor.Weapon;
import bridge.case3.abstraction.WeaponHandler;

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
