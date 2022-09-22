package flyweight.case1.concrete_flyweight;

import flyweight.case1.CoffeeOrderContext;
import flyweight.case1.flyweight.CoffeeOrder;

public class CoffeeFlavor implements CoffeeOrder {

	private final String flavor;

	public CoffeeFlavor(String flavor) {
		this.flavor = flavor;
	}

	public String getFlavor() {
		return flavor;
	}

	@Override
	public void serveCoffee(CoffeeOrderContext coffeeOrderContext) {
		System.out.println("Serving  Coffee flavor " + flavor + " to table number " + coffeeOrderContext.getTableNumber());
	}
}
