package observer.case1;

import practice_1.observer.case1.editor.Editor;
import practice_1.observer.case1.listeners.EmailNotificationListener;
import practice_1.observer.case1.listeners.LogOpenListener;

import static practice_1.observer.case1.listeners.EventType.OPEN;
import static practice_1.observer.case1.listeners.EventType.SAVE;


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
