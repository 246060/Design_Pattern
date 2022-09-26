package filter.case2.Criteria;


import filter.case2.ProbableThreat;

import java.util.List;

/**
 * Represents system that is aware of it's threats with given probability of their occurrence.
 * 주어진 발생 확률로 위협을 인식하는 시스템을 나타냅니다.
 */
public interface ProbabilisticThreatAwareSystem extends ThreatAwareSystem {

  @Override
  List<? extends ProbableThreat> threats();

  @Override
  Filterer<? extends ProbabilisticThreatAwareSystem, ? extends ProbableThreat> filtered();
}

