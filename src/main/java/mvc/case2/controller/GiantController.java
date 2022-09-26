package mvc.case2.controller;

import mvc.case2.Fatigue;
import mvc.case2.Health;
import mvc.case2.Nourishment;
import mvc.case2.model.GiantModel;
import mvc.case2.view.GiantView;

public class GiantController {

	private final GiantModel giant;
	private final GiantView view;

	public GiantController(GiantModel giant, GiantView view) {
		this.giant = giant;
		this.view = view;
	}

	public Health getHealth() {
		return giant.getHealth();
	}

	public void setHealth(Health health) {
		this.giant.setHealth(health);
	}

	public Fatigue getFatigue() {
		return giant.getFatigue();
	}

	public void setFatigue(Fatigue fatigue) {
		this.giant.setFatigue(fatigue);
	}

	public Nourishment getNourishment() {
		return giant.getNourishment();
	}

	public void setNourishment(Nourishment nourishment) {
		this.giant.setNourishment(nourishment);
	}

	public void updateView() {
		this.view.displayGiant(giant);
	}
}
