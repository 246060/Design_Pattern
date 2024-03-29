package strategy.case6.Context;

import strategy.case6.Strategy.Strategy;

public class Context {

	int temperatureInF;
	Strategy strategy;

	public Context(int temperatureInF, Strategy strategy) {
		this.temperatureInF = temperatureInF;
		this.strategy = strategy;
	}

	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}

	public int getTemperatureInF() {
		return temperatureInF;
	}

	public boolean getResult() {
		return strategy.checkTemperature(temperatureInF);
	}
}
