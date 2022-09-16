package command.case4.command;

import command.case4.Alarm;

public class AlarmOnCommand implements Command{
    private Alarm alarm;

    public AlarmOnCommand(Alarm alarm) {
        this.alarm = alarm;
    }

    @Override
    public void execute() {
        alarm.on();
    }
}
