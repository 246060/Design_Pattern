package observer.case1;


import static observer.case1.EventType.*;

import java.io.File;

import observer.case1.concrete_observable.EventManager;

public class Editor {
    // Concrete publisher, tracked by other objects

    public EventManager events;
    private File file;

    public Editor() {
        this.events = new EventManager(OPEN, SAVE);
    }

    public void openFile(String filePath) {
        this.file = new File(filePath);
        events.notify(OPEN, file);
    }

    public void saveFile() throws Exception {
        if (this.file != null) {
            events.notify(SAVE, file);
        } else {
            throw new Exception("Please open a file first.");
        }
    }

}
