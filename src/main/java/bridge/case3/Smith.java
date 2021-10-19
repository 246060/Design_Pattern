package bridge.case3;

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
