package command.case1;

import command.case1.command.Command;

public class FileInvoker {
    public Command command;

    public FileInvoker(Command command) {
        this.command = command;
    }

    public void execute() {
        this.command.execute();
    }
}
