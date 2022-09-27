package decorator.case6.Concrete_Decorators;

import decorator.case6.Component_Interface.Animal;
import decorator.case6.Decorator.AnimalDecorator;

public class GrowlDecorator extends AnimalDecorator {

	public GrowlDecorator(Animal animal) {
		super(animal);
	}

	@Override
	public void describe() {
		animal.describe();
		growl();
	}

	public void growl() {
		System.out.println("Grrrrr.");
	}

}