package factory_method.case2.factory;

import factory_method.case2.button.Button;

abstract public class Dialog {

	// 팩토리 메소드
	abstract protected Button createButton();

	// 탬플릿 메소드
	public final void render() {
		Button button = createButton();
		button.onClick();
		button.render();
	}
}
