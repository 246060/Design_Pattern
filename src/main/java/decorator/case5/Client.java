package decorator.case5;

import decorator.case5.Component_Implementation.VegFood;
import decorator.case5.Component_Interface.Food;
import decorator.case5.Concrete_Decorators.ChineseFood;
import decorator.case5.Concrete_Decorators.NonVegFood;

public class Client {

	private static int choice;

	public static void main(String[] args) {

		VegFood vf = new VegFood();
		System.out.println(vf.prepareFood());
		System.out.println(vf.foodPrice());

		Food f1 = new NonVegFood(new VegFood());
		System.out.println(f1.prepareFood());
		System.out.println(f1.foodPrice());

		Food f2 = new ChineseFood(new VegFood());
		System.out.println(f2.prepareFood());
		System.out.println(f2.foodPrice());

		Food f3 = new NonVegFood(new ChineseFood(new VegFood()));
		System.out.println(f3.prepareFood());
		System.out.println(f3.foodPrice());

	}
}
