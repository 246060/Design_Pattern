package flyweight.case2;

import java.util.HashMap;
import java.util.Map;

public class Flyweight {

    private final Map<String, Subject> map = new HashMap<>();

    public Subject getSubject(String name) {
        Subject subject = map.get(name);
        if (subject == null) {
            subject = new Subject(name);
            map.put(name, subject);
        }
        return subject;
    }
}
