package decorator.case5.Concrete_Decorators;

import decorator.case5.Component_Interface.Food;
import decorator.case5.Decorator.FoodDecorator;

public class NonVegFood extends FoodDecorator {

	public NonVegFood(Food newFood) {
		super(newFood);
	}

	@Override
	public String prepareFood() {
		return super.prepareFood() + " With Roasted Chicken and Chicken Curry  ";
	}

	@Override
	public double foodPrice() {
		return super.foodPrice() + 150.0;
	}
}
