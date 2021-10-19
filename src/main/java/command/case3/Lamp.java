package command.case3;

public class Lamp implements Device {

    @Override
    public void on() {
        System.out.println("Lamp ON");
    }

    @Override
    public void off() {
        System.out.println("Lamp OFF");
    }
}
