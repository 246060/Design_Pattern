package memento.case6.Memento;

// memento - object that stores the saved state of the originator
public class Memento {

	String mementoPersonName;
	int mementoDayNumber;
	int mementoWeight;

	public Memento(String personName, int dayNumber, int weight) {
		mementoPersonName = personName;
		mementoDayNumber = dayNumber;
		mementoWeight = weight;
	}

	public String getMementoPersonName() {
		return mementoPersonName;
	}

	public int getMementoDayNumber() {
		return mementoDayNumber;
	}

	public int getMementoWeight() {
		return mementoWeight;
	}
}
