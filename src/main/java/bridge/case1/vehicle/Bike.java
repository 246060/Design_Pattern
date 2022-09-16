package bridge.case1.vehicle;

import bridge.case1.workshop.Workshop;

public class Bike extends Vehicle {

    public Bike(Workshop workshop1, Workshop workshop2) {
        super(workshop1, workshop2);
    }

    @Override
    public void manufacture() {
        System.out.println("Bike manufacture");
        workshop1.work();
        workshop2.work();
    }
}
