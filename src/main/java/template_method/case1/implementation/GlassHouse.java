package template_method.case1.implementation;

import template_method.case1.template.HouseTemplate;

public class GlassHouse extends HouseTemplate {

    @Override
    protected void buildWalls() {
        System.out.println("Building Glass Walls");
    }

    @Override
    protected void buildPillars() {
        System.out.println("Building Pillars with glass coating");
    }
}
