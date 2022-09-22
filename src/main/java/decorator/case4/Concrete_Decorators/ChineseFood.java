package decorator.case4.Concrete_Decorators;

import decorator.case4.Component_Interface.Food;
import decorator.case4.Decorator.FoodDecorator;

public class ChineseFood extends FoodDecorator {

	public ChineseFood(Food newFood) {
		super(newFood);
	}

	@Override
	public String prepareFood() {
		return super.prepareFood() + " With Fried Rice and Manchurian  ";
	}

	@Override
	public double foodPrice() {
		return super.foodPrice() + 65.0;
	}
}
