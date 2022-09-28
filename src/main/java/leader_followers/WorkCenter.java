package leader_followers;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * A WorkCenter contains a leader and a list of idle workers.
 * The leader is responsible for receiving work when it arrives.
 * This class also provides a mechanism to promote a new leader.
 * A worker once he completes his task will add himself back to the center.
 */
public class WorkCenter {

  private Worker leader;
  private final List<Worker> workers = new CopyOnWriteArrayList<>();

  /**
   * Create workers and set leader.
   */
  public void createWorkers(int numberOfWorkers, TaskSet taskSet, TaskHandler taskHandler) {

    for (var id = 1; id <= numberOfWorkers; id++) {
      var worker = new Worker(id, this, taskSet, taskHandler);
      workers.add(worker);
    }

    promoteLeader();
  }

  public void addWorker(Worker worker) {
    workers.add(worker);
  }

  public void removeWorker(Worker worker) {
    workers.remove(worker);
  }

  public Worker getLeader() {
    return leader;
  }

  /**
   * Promote a leader.
   */
  public void promoteLeader() {
    Worker leader = null;

    if (workers.size() > 0) {
      leader = workers.get(0);
    }

    this.leader = leader;
  }

  public List<Worker> getWorkers() {
    return workers;
  }
}
