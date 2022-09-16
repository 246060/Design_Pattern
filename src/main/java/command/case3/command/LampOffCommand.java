package command.case3.command;

import command.case3.Lamp;

public class LampOffCommand implements Command {
    private Lamp lamp;

    public LampOffCommand(Lamp lamp) {
        this.lamp = lamp;
    }

    @Override
    public void execute() {
        lamp.off();
    }
}
