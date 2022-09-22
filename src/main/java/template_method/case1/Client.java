package template_method.case1;

import template_method.case1.implementation.GlassHouse;
import template_method.case1.implementation.WoodenHouse;
import template_method.case1.template.HouseTemplate;

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
