package chain_of_responsibility.case3;

public class EvenReceiver extends Receiver {
    public EvenReceiver(String name) {
        super(name);
    }

    @Override
    public boolean resolve(int number) {
        if (number % 2 == 0) return true;
        else return false;
    }

    @Override
    public void done(int number) {
        System.out.println(number + " : " + this.name + "가 해결");
    }
}
