package factory_method.case4;

public class HTMLButton implements Button {

    @Override
    public void render() {
        System.out.println("HTML Button render.");
    }

    @Override
    public void onClick() {
        System.out.println("HTML Button Click!");
    }
}
