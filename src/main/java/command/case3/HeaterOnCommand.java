package command.case3;


// concrete command
public class HeaterOnCommand implements Command {
    private Heater heater;

    public HeaterOnCommand(Heater heater) {
        this.heater = heater;
    }

    @Override
    public void execute() {
        heater.on();
    }
}
