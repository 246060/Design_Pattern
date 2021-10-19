package memento.case2;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {

        List<Life.Memento> savedTimes = new ArrayList<Life.Memento>();
        Life life = new Life();

        //time travel and record the eras
        life.setTime("1000 B.C.");
        savedTimes.add(life.save());

        life.setTime("1000 A.D.");
        savedTimes.add(life.save());

        life.setTime("2000 A.D.");

        savedTimes.add(life.save());
        life.setTime("4000 A.D.");

        life.restore(savedTimes.get(0));
    }
}
