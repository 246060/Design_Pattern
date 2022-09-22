package proxy.case3.real_subject;

import proxy.case3.subject.CommandExecutor;

public class CommandExecutorImpl implements CommandExecutor {

	@Override
	public void runCommand(String cmd) throws Exception {
		// some heavy implementation
		Runtime.getRuntime().exec(cmd);
		System.out.println("'" + cmd + "' command executed.");
	}
}