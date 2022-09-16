package memento.case1;

public class Client {

	// https://sourcemaking.com/design_patterns/memento/java/1
	public static void main(String[] args) {

		Caretaker caretaker = new Caretaker();

		Originator originator = new Originator();

		originator.setState("State1");
		caretaker.addMemento(originator.save());

		originator.setState("State2");
		caretaker.addMemento(originator.save());

		originator.restore(caretaker.getMementos());
		originator.restore(caretaker.getMementos());
	}
}
