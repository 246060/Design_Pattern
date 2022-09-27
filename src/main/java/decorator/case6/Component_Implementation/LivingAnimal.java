package decorator.case6.Component_Implementation;

import decorator.case6.Component_Interface.Animal;

public class LivingAnimal implements Animal {

	@Override
	public void describe() {
		System.out.println("\nI am an animal.");
	}

}
