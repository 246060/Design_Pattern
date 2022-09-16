package memento.case2;

import java.util.ArrayList;
import java.util.List;

public class Client {

	public static void main(String[] args) {

		List<Memento> savedTimes = new ArrayList<>();
		Life life = new Life();

		life.setTime("1000 B.C.");
		savedTimes.add(life.save());

		life.setTime("2000 A.D.");
		savedTimes.add(life.save());

		life.restore(savedTimes.get(0));
		life.restore(savedTimes.get(0));
	}
}
