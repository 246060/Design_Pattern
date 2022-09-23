package strategy.case5;

import strategy.case5.ConcreteStrategy.Addition;
import strategy.case5.ConcreteStrategy.Multiplication;
import strategy.case5.ConcreteStrategy.Subtraction;
import strategy.case5.Context.Context;

public class Client {

	public static void main(String[] args) {

		float value1 = 5.2f;
		float value2 = 2.5f;

		Context context = new Context(new Addition());
		System.out.println("Addition = " + context.executeStrategy(value1, value2));

		context = new Context(new Subtraction());
		System.out.println("Subtraction = " + context.executeStrategy(value1, value2));

		context = new Context(new Multiplication());
		System.out.println("Multiplication = " + context.executeStrategy(value1, value2));

	}
}
