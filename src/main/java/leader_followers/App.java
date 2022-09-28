package leader_followers;

import java.security.SecureRandom;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Leader/Followers pattern is a concurrency pattern. This pattern behaves like a taxi stand where
 * one of the threads acts as leader thread which listens for event from event sources,
 * de-multiplexes, dispatches and handles the event. It promotes the follower to be the new leader.
 * When processing completes the thread joins the followers queue, if there are no followers then it
 * becomes the leader and cycle repeats again.
 *
 * <p>In this example, one of the workers becomes Leader and listens on the {@link TaskSet} for
 * work. {@link TaskSet} basically acts as the source of input events for the {@link Worker}, who
 * are spawned and controlled by the {@link WorkCenter} . When {@link Task} arrives then the leader
 * takes the work and calls the {@link TaskHandler}. It also calls the {@link WorkCenter} to
 * promotes one of the followers to be the new leader, who can then process the next work and so
 * on.
 *
 * <p>The pros for this pattern are:
 * It enhances CPU cache affinity and eliminates unbound allocation and data buffer sharing between
 * threads by reading the request into buffer space allocated on the stack of the leader or by using
 * the Thread-Specific Storage pattern [22] to allocate memory. It minimizes locking overhead by not
 * exchanging data between threads, thereby reducing thread synchronization. In bound handle/thread
 * associations, the leader thread dispatches the event based on the I/O handle. It can minimize
 * priority inversion because no extra queuing is introduced in the server. It does not require a
 * context switch to handle each event, reducing the event dispatching latency. Note that promoting
 * a follower thread to fulfill the leader role requires a context switch. Programming simplicity:
 * The Leader/Followers pattern simplifies the programming of concurrency models where multiple
 * threads can receive requests, process responses, and de-multiplex connections using a shared
 * handle set.
 */
public class App {


  public static void main(String[] args) throws InterruptedException {
    var taskSet = new TaskSet();
    var taskHandler = new TaskHandler();
    var workCenter = new WorkCenter();

    workCenter.createWorkers(4, taskSet, taskHandler);

    execute(workCenter, taskSet);
  }

  /**
   * Start the work, dispatch tasks and stop the thread pool at last.
   */
  private static void execute(WorkCenter workCenter, TaskSet taskSet) throws InterruptedException {
    var workers = workCenter.getWorkers();
    var exec = Executors.newFixedThreadPool(workers.size());

    workers.forEach(exec::submit);
    Thread.sleep(1000);

    addTasks(taskSet);

    exec.awaitTermination(2, TimeUnit.SECONDS);
    exec.shutdownNow();
  }

  private static void addTasks(TaskSet taskSet) throws InterruptedException {
    var rand = new SecureRandom();

    for (var i = 0; i < 5; i++) {
      var time = Math.abs(rand.nextInt(1000));
      taskSet.addTask(new Task(time));
    }
  }
}
