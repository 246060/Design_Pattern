package filter.case2.Criteria;

import filter.case2.Threat;

import java.util.List;


public interface ThreatAwareSystem {
  String systemId();
  List<? extends Threat> threats();
  Filterer<? extends ThreatAwareSystem, ? extends Threat> filtered();
}
