package factory_method.case2.factory;


import factory_method.case2.button.Button;
import factory_method.case2.button.HTMLButton;

// creator
public class WebDialog extends Dialog {

	@Override
	protected Button createButton() {
		return new HTMLButton();
	}
}
