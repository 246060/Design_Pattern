package lockable_object.case1.domain;

public class Human extends Creature {

	public Human(String name) {
		super(name);

		setType(CreatureType.HUMAN);
		setDamage(CreatureStats.HUMAN_DAMAGE.getValue());
		setHealth(CreatureStats.HUMAN_HEALTH.getValue());
	}
}
