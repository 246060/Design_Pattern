package factory_method.case2;

import factory_method.case2.factory.Dialog;
import factory_method.case2.factory.WebDialog;
import factory_method.case2.factory.WindowDialog;

public class Client {

	// https://refactoring.guru/design-patterns/factory-method
	public static void main(String[] args) {

		Dialog dialog = new WindowDialog();
		dialog.render();

		dialog = new WebDialog();
		dialog.render();
	}
}
