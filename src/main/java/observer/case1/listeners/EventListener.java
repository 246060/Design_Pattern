package observer.case1.listeners;

import java.io.File;

// Common observer interface
public interface EventListener {

    void update(EventType eventType, File file);
}

