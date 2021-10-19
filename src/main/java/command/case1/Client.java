package command.case1;

public class Client {

    // https://www.journaldev.com/1624/command-design-pattern
    public static void main(String[] args) {

        FileSystemReceiver receiver = FileSystemReceiverUtil.getUnderlyingFileSystem();

        new FileInvoker(new OpenFileCommand(receiver)).execute();
        new FileInvoker(new WriteFileCommand(receiver)).execute();
        new FileInvoker(new CloseFileCommand(receiver)).execute();
    }
}
