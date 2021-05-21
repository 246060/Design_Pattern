package factory_method.case2;

// creator
public class WindowDialog extends Dialog {

    @Override
    protected Button createButton() {
        return new WindowsButton();
    }
}
