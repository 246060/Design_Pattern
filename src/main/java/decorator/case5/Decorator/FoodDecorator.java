package decorator.case5.Decorator;

import decorator.case5.Component_Interface.Food;

public class FoodDecorator implements Food {

	private Food newFood;

	public FoodDecorator(Food newFood) {
		this.newFood = newFood;
	}

	@Override
	public String prepareFood() {
		return newFood.prepareFood();
	}

	@Override
	public double foodPrice() {
		return newFood.foodPrice();
	}
}
