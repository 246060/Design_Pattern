package factory_method.case2;

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
