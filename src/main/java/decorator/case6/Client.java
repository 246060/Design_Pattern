package decorator.case6;

import decorator.case6.Component_Implementation.LivingAnimal;
import decorator.case6.Component_Interface.Animal;
import decorator.case6.Concrete_Decorators.GrowlDecorator;
import decorator.case6.Concrete_Decorators.LegDecorator;
import decorator.case6.Concrete_Decorators.WingDecorator;

public class Client {

	public static void main(String[] args) {

		Animal animal = new LivingAnimal();
		animal.describe();

		animal = new LegDecorator(animal);
		animal.describe();

		animal = new WingDecorator(animal);
		animal.describe();

		animal = new GrowlDecorator(animal);
		animal = new GrowlDecorator(animal);
		animal.describe();
	}
}
