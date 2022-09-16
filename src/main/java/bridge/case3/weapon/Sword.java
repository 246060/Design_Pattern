package bridge.case3.weapon;

public class Sword implements Weapon{

    @Override
    public void attack() {
        System.out.println("Sword attack");
    }

    @Override
    public void repair() {
        System.out.println("Sword repair");
    }
}
