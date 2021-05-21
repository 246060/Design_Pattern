package template_method.case1;

public class Client {
    // https://www.journaldev.com/1763/template-method-design-pattern-in-java

    public static void main(String[] args) {

        HouseTemplate houseType = null;

        houseType = new WoodenHouse();
        houseType.buildHouse(); //using template method

        System.out.println("\n************\n");

        houseType = new GlassHouse();
        houseType.buildHouse(); //using template method
    }
}
