package factory_method.case4;


// creator
public class WebDialog extends Dialog {

    @Override
    protected Button createButton() {
        return new HTMLButton();
    }
}
