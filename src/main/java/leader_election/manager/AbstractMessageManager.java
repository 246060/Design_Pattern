package leader_election.manager;

import leader_election.instance.Instance;

import java.util.Map;
import java.util.stream.Collectors;

/**
 * Abstract class of all the message manager classes.
 */
public abstract class AbstractMessageManager implements MessageManager {

  /**
   * Contain all the instances in the system. Key is its ID, and value is the instance itself.
   */
  protected Map<Integer, Instance> instanceMap;


  public AbstractMessageManager(Map<Integer, Instance> instanceMap) {
    this.instanceMap = instanceMap;
  }

  /**
   * Find the next instance with smallest ID.
   *
   * @return The next instance.
   */
  protected Instance findNextInstance(int currentId) {
    Instance result = null;

    var candidateList = instanceMap.keySet()
        .stream()
        .filter((i) -> i > currentId && instanceMap.get(i).isAlive())
        .sorted()
        .collect(Collectors.toList());

    if (candidateList.isEmpty()) {

      var index = instanceMap.keySet()
          .stream()
          .filter((i) -> instanceMap.get(i).isAlive())
          .sorted()
          .collect(Collectors.toList())
          .get(0);

      result = instanceMap.get(index);

    } else {
      var index = candidateList.get(0);
      result = instanceMap.get(index);
    }

    return result;
  }

}
