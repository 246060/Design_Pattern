package mvc.case2;

public enum Health {

	HEALTHY("healthy"),
	WOUNDED("wounded"),
	DEAD("dead");

	private final String title;

	Health(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return title;
	}
}
