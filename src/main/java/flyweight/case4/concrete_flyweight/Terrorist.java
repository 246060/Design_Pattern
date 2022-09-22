package flyweight.case4.concrete_flyweight;

import flyweight.case4.flyweight.Player;

public class Terrorist implements Player {

	private final String TASK;
	private String weapon;

	public Terrorist() {
		TASK = "PLANT A BOMB";
	}

	public void assignWeapon(String weapon) {
		this.weapon = weapon;
	}

	public void mission() {
		System.out.println("Terrorist with weapon " + weapon + "|" + " Task is " + TASK);
	}
}
