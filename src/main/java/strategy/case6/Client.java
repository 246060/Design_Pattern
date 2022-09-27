package strategy.case6;

import strategy.case6.ConcreteStrategy.HikeStrategy;
import strategy.case6.ConcreteStrategy.SkiStrategy;
import strategy.case6.Context.Context;

public class Client {

	public static void main(String[] args) {

		int temperatureInF = 60;
		Context context;

		context = new Context(temperatureInF, new SkiStrategy());
		System.out.println("Is the temperature (" + context.getTemperatureInF() + "F) good for skiing? " + context.getResult());

		context.setStrategy(new HikeStrategy());
		System.out.println("Is the temperature (" + context.getTemperatureInF() + "F) good for hiking? " + context.getResult());
	}
}
