package leader_followers;

import lombok.EqualsAndHashCode;
import lombok.extern.slf4j.Slf4j;

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Slf4j
public class Worker implements Runnable {

	@EqualsAndHashCode.Include
	private final long id;
	private final WorkCenter workCenter;
	private final TaskSet taskSet;
	private final TaskHandler taskHandler;

	/**
	 * Constructor to create a worker which will take work from the work center.
	 */
	public Worker(long id, WorkCenter workCenter, TaskSet taskSet, TaskHandler taskHandler) {
		super();
		this.id = id;
		this.workCenter = workCenter;
		this.taskSet = taskSet;
		this.taskHandler = taskHandler;
	}

	/**
	 * The leader thread listens for task.
	 * When task arrives, it promotes one of the followers to be the new leader.
	 * Then it handles the task and add himself back to work center.
	 */
	@Override
	public void run() {

		while (!Thread.interrupted()) {

			try {
				if (workCenter.getLeader() != null && !workCenter.getLeader().equals(this)) {

					synchronized (workCenter) {
						if (workCenter.getLeader() != null && !workCenter.getLeader().equals(this)) {
							workCenter.wait();
							continue;
						}
					}

				}

				final Task task = taskSet.getTask();

				synchronized (workCenter) {
					workCenter.removeWorker(this);
					workCenter.promoteLeader();
					workCenter.notifyAll();
				}

				taskHandler.handleTask(task);
				log.info("The Worker with the ID " + id + " completed the task");

				workCenter.addWorker(this);

			} catch (InterruptedException e) {
				log.warn("Worker interrupted");
				Thread.currentThread().interrupt();
				return;
			}
		}
	}

}
