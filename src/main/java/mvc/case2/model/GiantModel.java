package mvc.case2.model;

import mvc.case2.Fatigue;
import mvc.case2.Health;
import mvc.case2.Nourishment;

public class GiantModel {

	private Health health;
	private Fatigue fatigue;
	private Nourishment nourishment;

	public GiantModel(Health health, Fatigue fatigue, Nourishment nourishment) {
		this.health = health;
		this.fatigue = fatigue;
		this.nourishment = nourishment;
	}

	public Health getHealth() {
		return health;
	}

	public void setHealth(Health health) {
		this.health = health;
	}

	public Fatigue getFatigue() {
		return fatigue;
	}

	public void setFatigue(Fatigue fatigue) {
		this.fatigue = fatigue;
	}

	public Nourishment getNourishment() {
		return nourishment;
	}

	public void setNourishment(Nourishment nourishment) {
		this.nourishment = nourishment;
	}

	@Override
	public String toString() {
		return String.format("The giant looks %s, %s and %s.", health, fatigue, nourishment);
	}
}