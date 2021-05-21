package factory_method.case2;

public class Client {

    // https://refactoring.guru/design-patterns/factory-method
    public static void main(String[] args) {

        Dialog dialog = new WindowDialog();
        dialog.render();

        dialog = new WebDialog();
        dialog.render();
    }
}
