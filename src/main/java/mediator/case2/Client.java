package mediator.case2;

import mediator.case2.Component.Button;
import mediator.case2.Component.Fan;
import mediator.case2.Mediador.Mediator;

public class Client {

	public static void main(String[] args) {
		System.out.println();

		Button button = new Button();
		Fan fan = new Fan();
		PowerSupplier powerSupplier = new PowerSupplier();

		Mediator mediator = new Mediator();

		mediator.setButton(button);
		mediator.setFan(fan);
		mediator.setPowerSupplier(powerSupplier);

		System.out.println("fan is '" + fan.isOn() + "'\n");

		button.press();
		System.out.println("fan is '" + fan.isOn() + "'\n");

		button.press();
		System.out.println("fan is '" + fan.isOn() + "'");
	}
}
