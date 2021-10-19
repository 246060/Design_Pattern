package observer.case1.listeners;

import java.io.File;

public class LogOpenListener implements EventListener {

    private File log;

    public LogOpenListener(String fileName) {
        this.log = new File(fileName);
    }

    @Override
    public void update(EventType eventType, File file) {
        System.out.println("Save to log " + log + ": Someone has performed " + eventType);
    }
}
