package strategy.case6.ConcreteStrategy;

import strategy.case6.Strategy.Strategy;

public class SkiStrategy implements Strategy {

	@Override
	public boolean checkTemperature(int temperatureInF) {
		if (temperatureInF <= 32) {
			return true;
		} else {
			return false;
		}
	}

}
