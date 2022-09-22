package observer.case1.concrete_observer;

import observer.case1.EventType;
import observer.case1.observer.EventListener;

import java.io.File;

public class EmailNotificationListener implements EventListener {

    private String email;

    public EmailNotificationListener(String email) {
        this.email = email;
    }

    @Override
    public void update(EventType eventType, File file) {
        System.out.println("Email to " + email + ": Someone has performed " + eventType);
    }
}
