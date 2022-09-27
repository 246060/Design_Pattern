package decorator.case6.Decorator;

import decorator.case6.Component_Interface.Animal;

public abstract class AnimalDecorator implements Animal {

	protected Animal animal;

	public AnimalDecorator(Animal animal) {
		this.animal = animal;
	}
}
