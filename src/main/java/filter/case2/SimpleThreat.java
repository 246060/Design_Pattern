package filter.case2;


import java.util.Objects;

public class SimpleThreat implements Threat {

	private final ThreatType threatType;
	private final int id;
	private final String name;

	public SimpleThreat(ThreatType threatType, int id, String name) {
		this.threatType = threatType;
		this.id = id;
		this.name = name;
	}

	@Override
	public String name() {
		return name;
	}

	@Override
	public int id() {
		return id;
	}

	@Override
	public ThreatType type() {
		return threatType;
	}

	@Override
	public String toString() {
		return "SimpleThreat{" + "threatType=" + threatType + ", id=" + id + ", name='" + name + '\'' + '}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		SimpleThreat that = (SimpleThreat) o;
		return id == that.id
						&& threatType == that.threatType
						&& Objects.equals(name, that.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(threatType, id, name);
	}
}
