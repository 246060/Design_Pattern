package factory_method.case2.factory;

import factory_method.case2.button.Button;
import factory_method.case2.button.WindowsButton;

// creator
public class WindowDialog extends Dialog {

	@Override
	protected Button createButton() {
		return new WindowsButton();
	}
}
