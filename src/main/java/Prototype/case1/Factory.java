package Prototype.case1;

import Prototype.case1.person.Dick;
import Prototype.case1.person.Harry;
import Prototype.case1.person.Person;
import Prototype.case1.person.Tom;

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
