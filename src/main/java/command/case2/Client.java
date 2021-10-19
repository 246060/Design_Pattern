package command.case2;

import java.util.ArrayList;
import java.util.List;

public class Client {

    //https://sourcemaking.com/design_patterns/command/java/1
    // Command in Java: Decoupling producer from consumer

    public static List requests() {
        List<Command> queue = new ArrayList<>();
        queue.add(new DomesticEngineer());
        queue.add(new Politician());
        queue.add(new Programmer());
        return queue;
    }

    public static void workOffRequests(List<Command> queue) {
        for (Command command : queue) {
            command.execute();
        }
    }

    public static void main(String[] args) {
        workOffRequests(requests());
    }
}
