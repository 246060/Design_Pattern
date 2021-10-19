package observer.case1.listeners;

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
