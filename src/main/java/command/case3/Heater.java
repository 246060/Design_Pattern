package command.case3;


// receiver
public class Heater implements Device {

    @Override
    public void on() {
        System.out.println("heater on.");
    }

    @Override
    public void off() {
        System.out.println("heater off.");
    }
}
