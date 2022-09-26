package filter.case2.ConcreteCriteria;

import filter.case2.Criteria.Filterer;
import filter.case2.Criteria.ThreatAwareSystem;
import filter.case2.Threat;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class SimpleThreatAwareSystem implements ThreatAwareSystem {

	private final String systemId;
	private final List<Threat> issues;

	public SimpleThreatAwareSystem(String systemId, List<Threat> issues) {
		this.systemId = systemId;
		this.issues = issues;
	}

	@Override
	public String systemId() {
		return systemId;
	}

	@Override
	public List<? extends Threat> threats() {
		return new ArrayList<>(issues);
	}

	@Override
	public Filterer<? extends ThreatAwareSystem, ? extends Threat> filtered() {
		return this::filteredGroup;
	}

	private ThreatAwareSystem filteredGroup(Predicate<? super Threat> predicate) {
		return new SimpleThreatAwareSystem(this.systemId, filteredItems(predicate));
	}

	private List<Threat> filteredItems(Predicate<? super Threat> predicate) {
		return this.issues.stream()
						.filter(predicate)
						.collect(Collectors.toUnmodifiableList());
	}

	@Override
	public String toString() {
		return "SimpleThreatAwareSystem{" + "systemId='" + systemId + '\'' + ", issues=" + issues + '}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		SimpleThreatAwareSystem that = (SimpleThreatAwareSystem) o;
		return Objects.equals(systemId, that.systemId);
	}

	@Override
	public int hashCode() {
		return Objects.hash(systemId);
	}
}
