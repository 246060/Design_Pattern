package command.case1;

import command.case1.ConcreteCommand.CloseFileCommand;
import command.case1.ConcreteCommand.OpenFileCommand;
import command.case1.ConcreteCommand.WriteFileCommand;
import command.case1.Invoker.FileInvoker;
import command.case1.Receiver.FileSystemReceiver;

public class Client {

	public static void main(String[] args) {

		FileSystemReceiver receiver = FileSystemReceiverUtil.getUnderlyingFileSystem();

		new FileInvoker(new OpenFileCommand(receiver)).execute();
		new FileInvoker(new WriteFileCommand(receiver)).execute();
		new FileInvoker(new CloseFileCommand(receiver)).execute();
	}
}
