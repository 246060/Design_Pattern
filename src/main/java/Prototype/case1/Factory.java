package Prototype.case1;

import java.util.HashMap;
import java.util.Map;

public class Factory {
    private static final Map<String, Person> prototypes = new HashMap<>();

    static {
        prototypes.put("tom", new Tom());
        prototypes.put("dick", new Dick());
        prototypes.put("harry", new Harry());
    }

    public static Person getPrototype(String type) {
        return prototypes.get(type).clone();
    }
}
