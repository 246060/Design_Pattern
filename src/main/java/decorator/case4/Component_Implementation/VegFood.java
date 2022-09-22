package decorator.case4.Component_Implementation;

import decorator.case4.Component_Interface.Food;

public class VegFood implements Food {
	@Override
	public String prepareFood() {
		return "Veg Food";
	}

	@Override
	public double foodPrice() {
		return 50.0;
	}
}
