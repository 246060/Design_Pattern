package command.case5.Invoker;

import command.case5.Command.ActionListenerCommand;

public class MenuOptions {

	private ActionListenerCommand openCommand;
	private ActionListenerCommand saveCommand;

	public MenuOptions(ActionListenerCommand open, ActionListenerCommand save) {
		this.openCommand = open;
		this.saveCommand = save;
	}

	public void clickOpen() {
		openCommand.execute();
	}

	public void clickSave() {
		saveCommand.execute();
	}

}
