package factory_method.case4;

// creator
public class WindowDialog extends Dialog {

    @Override
    protected Button createButton() {
        return new WindowsButton();
    }
}
