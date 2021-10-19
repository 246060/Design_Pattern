package observer.case3;

public class Gates implements AlarmListener {
    @Override
    public void alarm() {
        System.out.println("gates close");
    }
}
