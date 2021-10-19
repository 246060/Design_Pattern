package observer.case3;

public class Lighting implements AlarmListener{
    @Override
    public void alarm() {
        System.out.println("lights up");
    }
}
