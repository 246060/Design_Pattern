package mediator.case4;

import mediator.case4.Component.User;

public class Client {

	public static void main(String[] args) {
		User robert = new User("Robert");
		User john = new User("John");

		robert.sendMessage("Hi! John!");
		john.sendMessage("Hello! Robert!");
	}
}
