package filter.case2.ConcreteCriteria;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import filter.case2.Criteria.Filterer;
import filter.case2.Criteria.ProbabilisticThreatAwareSystem;
import filter.case2.ProbableThreat;

public class SimpleProbabilisticThreatAwareSystem implements ProbabilisticThreatAwareSystem {

	private final String systemId;
	private final List<ProbableThreat> threats;

	public SimpleProbabilisticThreatAwareSystem(String systemId, List<ProbableThreat> threats) {
		this.systemId = systemId;
		this.threats = threats;
	}

	@Override
	public String systemId() {
		return systemId;
	}

	@Override
	public List<? extends ProbableThreat> threats() {
		return threats;
	}

	@Override
	public Filterer<? extends ProbabilisticThreatAwareSystem, ? extends ProbableThreat> filtered() {
		return this::filteredGroup;
	}

	private ProbabilisticThreatAwareSystem filteredGroup(final Predicate<? super ProbableThreat> predicate) {
		return new SimpleProbabilisticThreatAwareSystem(this.systemId, filteredItems(predicate));
	}

	private List<ProbableThreat> filteredItems(final Predicate<? super ProbableThreat> predicate) {
		return this.threats.stream()
						.filter(predicate)
						.collect(Collectors.toUnmodifiableList());
	}

	@Override
	public String toString() {
		return "SimpleProbabilisticThreatAwareSystem{" + "systemId='" + systemId + '\'' + ", threats=" + threats + '}';
	}
}
