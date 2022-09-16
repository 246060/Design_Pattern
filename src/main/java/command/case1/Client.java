package command.case1;

import command.case1.command.CloseFileCommand;
import command.case1.command.OpenFileCommand;
import command.case1.command.WriteFileCommand;

public class Client {

    // https://www.journaldev.com/1624/command-design-pattern
    public static void main(String[] args) {

        FileSystemReceiver receiver = FileSystemReceiverUtil.getUnderlyingFileSystem();

        new FileInvoker(new OpenFileCommand(receiver)).execute();
        new FileInvoker(new WriteFileCommand(receiver)).execute();
        new FileInvoker(new CloseFileCommand(receiver)).execute();
    }
}
