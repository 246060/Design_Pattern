package strategy.case5.ConcreteStrategy;

import strategy.case5.Strategy.Strategy;

public class Multiplication  implements Strategy {

	@Override
	public float calculation(float a, float b){
		return a*b;
	}
}
