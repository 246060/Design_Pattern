package proxy.case3.proxy;

import proxy.case3.real_subject.CommandExecutorImpl;
import proxy.case3.subject.CommandExecutor;

public class CommandExecutorProxy implements CommandExecutor {

	private boolean isAdmin;
	private CommandExecutor executor;

	public CommandExecutorProxy(String user, String pwd) {

		if ("Pankaj".equals(user) && "J@urnalD$v".equals(pwd)) {
			isAdmin = true;
		}

		executor = new CommandExecutorImpl();
	}

	@Override
	public void runCommand(String cmd) throws Exception {

		if (isAdmin) {
			executor.runCommand(cmd);

		} else {

			if (cmd.trim().startsWith("rm")) {
				throw new Exception("rm command is not allowed for non-admin users.");

			} else {
				executor.runCommand(cmd);
			}
		}
	}
}
