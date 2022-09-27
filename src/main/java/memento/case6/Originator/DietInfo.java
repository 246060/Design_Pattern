package memento.case6.Originator;

import memento.case6.Memento.Memento;

// originator - object whose state we want to save
public class DietInfo {

	String personName;
	int dayNumber;
	int weight;

	public DietInfo(String personName, int dayNumber, int weight) {
		this.personName = personName;
		this.dayNumber = dayNumber;
		this.weight = weight;
	}

	public String toString() {
		return "Name: " + personName + ", day number: " + dayNumber + ", weight: " + weight;
	}

	public void setDayNumberAndWeight(int dayNumber, int weight) {
		this.dayNumber = dayNumber;
		this.weight = weight;
	}

	public Memento save() {
		return new Memento(personName, dayNumber, weight);
	}

	public void restore(Object objMemento) {
		Memento memento = (Memento) objMemento;
		personName = memento.getMementoPersonName();
		dayNumber = memento.getMementoDayNumber();
		weight = memento.getMementoWeight();
	}
}
