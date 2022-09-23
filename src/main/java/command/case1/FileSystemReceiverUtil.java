package command.case1;

import command.case1.ConcreteReceiver.UnixFileSystemReceiver;
import command.case1.ConcreteReceiver.WindowsFileSystemReceiver;
import command.case1.Receiver.FileSystemReceiver;

public class FileSystemReceiverUtil {

	public static FileSystemReceiver getUnderlyingFileSystem() {

		String osName = System.getProperty("os.name");
		System.out.println("Underlying OS is : " + osName);

		if (osName.contains("Windows")) {
			return new WindowsFileSystemReceiver();

		} else {
			return new UnixFileSystemReceiver();
		}
	}
}
