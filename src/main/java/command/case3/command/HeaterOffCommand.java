package command.case3.command;


import command.case3.Heater;

// concrete command
public class HeaterOffCommand implements Command {
    private Heater heater;

    public HeaterOffCommand(Heater heater) {
        this.heater = heater;
    }

    @Override
    public void execute() {
        heater.off();
    }
}
