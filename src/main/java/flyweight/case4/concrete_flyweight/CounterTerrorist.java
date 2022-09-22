package flyweight.case4.concrete_flyweight;

import flyweight.case4.flyweight.Player;

public class CounterTerrorist implements Player {

	private final String TASK;
	private String weapon;

	public CounterTerrorist() {
		TASK = "DIFFUSE BOMB";
	}

	public void assignWeapon(String weapon) {
		this.weapon = weapon;
	}

	public void mission() {
		System.out.println("Counter Terrorist with weapon " + weapon + "|" + " Task is " + TASK);
	}
}
