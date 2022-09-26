package filter.case2;


import java.util.Objects;

public class SimpleProbableThreat extends SimpleThreat implements ProbableThreat {

	private final double probability;

	public SimpleProbableThreat(final String name, final int id, final ThreatType threatType, final double probability) {
		super(threatType, id, name);
		this.probability = probability;
	}

	@Override
	public double probability() {
		return probability;
	}

	@Override
	public String toString() {
		return "SimpleProbableThreat{" + "probability=" + probability + "} " + super.toString();
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		SimpleProbableThreat that = (SimpleProbableThreat) o;
		return Double.compare(that.probability, probability) == 0;
	}

	@Override
	public int hashCode() {
		return Objects.hash(probability);
	}
}
