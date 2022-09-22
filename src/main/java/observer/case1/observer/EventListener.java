package observer.case1.observer;

import observer.case1.EventType;

import java.io.File;

// Common observer interface
public interface EventListener {

    void update(EventType eventType, File file);
}

