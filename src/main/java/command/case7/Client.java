package command.case7;

import command.case7.Command.Command;
import command.case7.ConcreteCommand.DinnerCommand;
import command.case7.ConcreteCommand.LunchCommand;
import command.case7.Invoker.MealInvoker;
import command.case7.Receiver.Dinner;
import command.case7.Receiver.Lunch;

public class Client {

	public static void main(String[] args) {

		Lunch lunch = new Lunch(); // receiver
		Command lunchCommand = new LunchCommand(lunch); // concrete command

		Dinner dinner = new Dinner(); // receiver
		Command dinnerCommand = new DinnerCommand(dinner); // concrete command

		MealInvoker mealInvoker = new MealInvoker(lunchCommand); // invoker
		mealInvoker.invoke();

		mealInvoker.setCommand(dinnerCommand);
		mealInvoker.invoke();
	}
}
