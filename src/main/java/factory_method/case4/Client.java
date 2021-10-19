package factory_method.case4;

public class Client {

    // https://refactoring.guru/design-patterns/factory-method
    public static void main(String[] args) {

        Dialog dialog = new WindowDialog();
        dialog.render();

        dialog = new WebDialog();
        dialog.render();
    }
}
