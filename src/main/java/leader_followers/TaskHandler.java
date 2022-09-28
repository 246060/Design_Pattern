package leader_followers;

import lombok.extern.slf4j.Slf4j;

/**
 * The TaskHandler is used by the Worker to process the newly arrived task.
 */
@Slf4j
public class TaskHandler {

  /**
   * This interface handles one task at a time.
   */
  public void handleTask(Task task) throws InterruptedException {
    var time = task.getTime();
    Thread.sleep(time);
    log.info("It takes " + time + " milliseconds to finish the task");

    task.setFinished();
  }
}
