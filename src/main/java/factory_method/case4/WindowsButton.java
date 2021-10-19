package factory_method.case4;

public class WindowsButton implements Button {

    @Override
    public void render() {
        System.out.println("Windows Button Render Call");
    }

    @Override
    public void onClick() {
        System.out.println("Windows Button Render Click!");
    }
}
