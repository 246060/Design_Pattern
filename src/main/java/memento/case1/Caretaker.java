package memento.case1;

import java.util.Stack;

public class Caretaker {

    private final Stack<Memento> mementos = new Stack<>();

    public void addMemento(Memento m) {
        mementos.push(m);
    }

    public Memento getMementos() {
        return mementos.pop();
    }
}
