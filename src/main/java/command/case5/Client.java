package command.case5;

import command.case5.ConcreteCommand.ActionOpen;
import command.case5.ConcreteCommand.ActionSave;
import command.case5.Invoker.MenuOptions;
import command.case5.Receiver.Document;

public class Client {

	public static void main(String[] args) {

		Document doc = new Document();

		MenuOptions menu = new MenuOptions(new ActionOpen(doc), new ActionSave(doc));

		menu.clickOpen();
		menu.clickSave();
	}
}
