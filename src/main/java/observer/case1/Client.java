package observer.case1;

import static observer.case1.EventType.*;

import observer.case1.concrete_observer.EmailNotificationListener;
import observer.case1.concrete_observer.LogOpenListener;

public class Client {

    // https://refactoring.guru/design-patterns/observer/java/example
    public static void main(String[] args) {

        Editor editor = new Editor();

        editor.events.subscribe(OPEN, new LogOpenListener("/path/to/log/file.txt"));
        editor.events.subscribe(SAVE, new EmailNotificationListener("admin@example.com"));

        try {
            editor.openFile("test.txt");
            editor.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
