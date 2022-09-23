package command.case3.ConcreteReceiver;

import command.case3.Receiver.Device;

public class Lamp implements Device {

	@Override
	public void on() {
		System.out.println("Lamp ON");
	}

	@Override
	public void off() {
		System.out.println("Lamp OFF");
	}
}
