package command.case5.ConcreteCommand;

import command.case5.Command.ActionListenerCommand;
import command.case5.Receiver.Document;

public class ActionSave implements ActionListenerCommand {

	private Document doc;

	public ActionSave(Document doc) {
		this.doc = doc;
	}

	@Override
	public void execute() {
		doc.save();
	}
}