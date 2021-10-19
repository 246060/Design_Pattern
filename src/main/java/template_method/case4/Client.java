package template_method.case4;

public class Client {

    // https://www.journaldev.com/1763/template-method-design-pattern-in-java
    public static void main(String[] args) {

        HouseTemplate houseType = new WoodenHouse();

        //using template method
        houseType.buildHouse();
        System.out.println("************");

        houseType = new GlassHouse();
        houseType.buildHouse();
    }
}
